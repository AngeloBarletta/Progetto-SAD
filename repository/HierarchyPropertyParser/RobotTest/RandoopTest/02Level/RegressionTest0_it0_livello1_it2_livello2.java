
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test001"); }


    // The following exception was thrown during execution in test generation
    try {
    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test002"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    java.lang.String str5 = hierarchyPropertyParser0.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test003"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    boolean b6 = hierarchyPropertyParser0.isHierachic("hi!");
    int i7 = hierarchyPropertyParser0.depth();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser0.goToChild((int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test004"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser0.add(".");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test005"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    boolean b6 = hierarchyPropertyParser0.isHierachic("hi!");
    java.lang.String str7 = hierarchyPropertyParser0.getSeperator();
    hierarchyPropertyParser0.goToRoot();
    // The following exception was thrown during execution in test generation
    try {
    boolean b10 = hierarchyPropertyParser0.contains(".");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "."+ "'", str7.equals("."));

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test006"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    int i3 = hierarchyPropertyParser0.getLevel();
    hierarchyPropertyParser0.goToRoot();
    boolean b5 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String str6 = hierarchyPropertyParser0.getValue();
    // The following exception was thrown during execution in test generation
    try {
    boolean b8 = hierarchyPropertyParser0.contains(".");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test007"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    hierarchyPropertyParser0.build("", "");
    int i6 = hierarchyPropertyParser0.getLevel();
    java.lang.String str7 = hierarchyPropertyParser0.context();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser0.goToChild((int)(short)0);
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
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test008"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    int i3 = hierarchyPropertyParser0.getLevel();
    hierarchyPropertyParser0.goToRoot();
    boolean b5 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String str6 = hierarchyPropertyParser0.getValue();
    boolean b8 = hierarchyPropertyParser0.goDown("null(0)[null]\n");
    boolean b9 = hierarchyPropertyParser0.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test009"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    boolean b6 = hierarchyPropertyParser0.isHierachic("hi!");
    java.lang.String str7 = hierarchyPropertyParser0.getSeperator();
    hierarchyPropertyParser0.goToRoot();
    int i9 = hierarchyPropertyParser0.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "."+ "'", str7.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test010"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    boolean b6 = hierarchyPropertyParser0.isHierachic("hi!");
    int i7 = hierarchyPropertyParser0.depth();
    java.lang.String str8 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test011"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    boolean b6 = hierarchyPropertyParser0.isHierachic("hi!");
    int i7 = hierarchyPropertyParser0.depth();
    int i8 = hierarchyPropertyParser0.depth();
    java.util.Vector vector9 = null;
    int i11 = hierarchyPropertyParser0.search(vector9, "");
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser0.build("hi!", ".");
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test012"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    hierarchyPropertyParser0.build("", "");
    int i6 = hierarchyPropertyParser0.getLevel();
    boolean b8 = hierarchyPropertyParser0.goDown("hi!");
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser0.build(".", "hi!");
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
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test013"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser0.goToChild(0);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test014"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    hierarchyPropertyParser0.build("", "");
    int i6 = hierarchyPropertyParser0.numChildren();
    java.util.Vector vector7 = null;
    int i9 = hierarchyPropertyParser0.search(vector7, "hi!");
    hierarchyPropertyParser0.goToParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test015"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    java.lang.String str5 = hierarchyPropertyParser0.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null(0)[null]\n"+ "'", str5.equals("null(0)[null]\n"));

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test016"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.goToRoot();
    boolean b2 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String[] str_array3 = hierarchyPropertyParser0.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test017"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    hierarchyPropertyParser0.build("", "");
    int i6 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.build("", "hi!");
    java.lang.String str10 = hierarchyPropertyParser0.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test018"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    hierarchyPropertyParser0.build("", "");
    hierarchyPropertyParser0.build("hi!", "hi!");
    int i9 = hierarchyPropertyParser0.getLevel();
    hierarchyPropertyParser0.build("", "");
    java.lang.String str13 = hierarchyPropertyParser0.getValue();
    boolean b15 = hierarchyPropertyParser0.isHierachic(".");
    // The following exception was thrown during execution in test generation
    try {
    boolean b17 = hierarchyPropertyParser0.contains("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test019"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.fullValue();
    hierarchyPropertyParser0.setSeperator(".");
    java.lang.String[] str_array7 = hierarchyPropertyParser0.tokenize("");
    hierarchyPropertyParser0.setSeperator("");
    // The following exception was thrown during execution in test generation
    try {
    boolean b11 = hierarchyPropertyParser0.goDown("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test020"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    java.lang.String str3 = hierarchyPropertyParser2.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test021"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    hierarchyPropertyParser0.build("", "");
    hierarchyPropertyParser0.build("hi!", "hi!");
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser0.goToChild((int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test022"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    boolean b6 = hierarchyPropertyParser0.isHierachic("hi!");
    java.lang.String str7 = hierarchyPropertyParser0.getSeperator();
    hierarchyPropertyParser0.build("null(0)[null]\n", "null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "."+ "'", str7.equals("."));

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test023"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    boolean b4 = hierarchyPropertyParser0.goToChild("");
    hierarchyPropertyParser0.build("", "");
    java.lang.String str8 = hierarchyPropertyParser0.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test024"); }


    // The following exception was thrown during execution in test generation
    try {
    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "null(0)[null]\n");
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test025"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    java.lang.String str3 = hierarchyPropertyParser2.showTree();
    java.lang.String str4 = hierarchyPropertyParser2.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null(0)[null]\n"+ "'", str3.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test026"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    boolean b6 = hierarchyPropertyParser0.isHierachic("hi!");
    int i7 = hierarchyPropertyParser0.depth();
    java.lang.String str8 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.setSeperator("");
    hierarchyPropertyParser0.build("", "");
    java.lang.String str14 = hierarchyPropertyParser0.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test027"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    int i3 = hierarchyPropertyParser0.getLevel();
    java.lang.String[] str_array5 = hierarchyPropertyParser0.tokenize("");
    boolean b6 = hierarchyPropertyParser0.isLeafReached();
    hierarchyPropertyParser0.goToParent();
    java.lang.String str8 = hierarchyPropertyParser0.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test028"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.fullValue();
    hierarchyPropertyParser0.setSeperator(".");
    java.lang.String[] str_array7 = hierarchyPropertyParser0.tokenize("");
    java.lang.String str8 = hierarchyPropertyParser0.fullValue();
    int i9 = hierarchyPropertyParser0.getLevel();
    java.util.Vector vector10 = null;
    int i12 = hierarchyPropertyParser0.search(vector10, "null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test029"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    boolean b5 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String str6 = hierarchyPropertyParser0.fullValue();
    java.lang.String str7 = hierarchyPropertyParser0.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "."+ "'", str7.equals("."));

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test030"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    boolean b6 = hierarchyPropertyParser0.isHierachic("hi!");
    int i7 = hierarchyPropertyParser0.depth();
    int i8 = hierarchyPropertyParser0.depth();
    hierarchyPropertyParser0.goToRoot();
    hierarchyPropertyParser0.add("null(0)[null]\n");
    boolean b13 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str14 = hierarchyPropertyParser0.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "null(0)[null]\n(0)[null]\n"+ "'", str14.equals("null(0)[null]\n(0)[null]\n"));

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test031"); }


    // The following exception was thrown during execution in test generation
    try {
    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser(".", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test032"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    java.lang.String str3 = hierarchyPropertyParser2.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test033"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    boolean b6 = hierarchyPropertyParser0.isHierachic("hi!");
    java.lang.String str7 = hierarchyPropertyParser0.getSeperator();
    java.lang.String str8 = hierarchyPropertyParser0.showTree();
    boolean b10 = hierarchyPropertyParser0.goToChild("hi!");
    boolean b12 = hierarchyPropertyParser0.goToChild("null(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "."+ "'", str7.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null(0)[null]\n"+ "'", str8.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test034"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    hierarchyPropertyParser0.build("", "");
    int i6 = hierarchyPropertyParser0.getLevel();
    java.lang.String str7 = hierarchyPropertyParser0.context();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser0.goToChild(1);
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
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test035"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    boolean b4 = hierarchyPropertyParser0.goToChild("");
    hierarchyPropertyParser0.build("", "");
    boolean b9 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str10 = hierarchyPropertyParser0.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test036"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    hierarchyPropertyParser0.build("", "");
    int i6 = hierarchyPropertyParser0.getLevel();
    boolean b8 = hierarchyPropertyParser0.goDown("hi!");
    hierarchyPropertyParser0.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test037"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.fullValue();
    hierarchyPropertyParser0.setSeperator(".");
    java.lang.String[] str_array7 = hierarchyPropertyParser0.tokenize("");
    hierarchyPropertyParser0.setSeperator("");
    java.lang.String str10 = hierarchyPropertyParser0.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test038"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    int i3 = hierarchyPropertyParser0.getLevel();
    java.lang.String str4 = hierarchyPropertyParser0.context();
    boolean b6 = hierarchyPropertyParser0.goToChild("null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test039"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    int i3 = hierarchyPropertyParser0.getLevel();
    hierarchyPropertyParser0.goToRoot();
    boolean b5 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String str6 = hierarchyPropertyParser0.getValue();
    java.lang.String str7 = hierarchyPropertyParser0.getSeperator();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser0.goToChild((int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "."+ "'", str7.equals("."));

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test040"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    int i3 = hierarchyPropertyParser0.getLevel();
    java.lang.String[] str_array5 = hierarchyPropertyParser0.tokenize("");
    boolean b6 = hierarchyPropertyParser0.isLeafReached();
    hierarchyPropertyParser0.goToParent();
    boolean b9 = hierarchyPropertyParser0.goToChild("null(0)[null]\n(0)[null]\n");
    hierarchyPropertyParser0.add("null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test041"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    int i3 = hierarchyPropertyParser0.getLevel();
    java.lang.String[] str_array5 = hierarchyPropertyParser0.tokenize("");
    boolean b7 = hierarchyPropertyParser0.goDown("null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test042"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    java.lang.String[] str_array4 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test043"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    boolean b4 = hierarchyPropertyParser0.goToChild("");
    hierarchyPropertyParser0.build("", "");
    boolean b9 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str10 = hierarchyPropertyParser0.getSeperator();
    java.lang.String str11 = hierarchyPropertyParser0.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "."+ "'", str10.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!(0)[null]\n"+ "'", str11.equals("hi!(0)[null]\n"));

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test044"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser0.getSeperator();
    java.lang.String str5 = hierarchyPropertyParser0.fullValue();
    int i6 = hierarchyPropertyParser0.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "."+ "'", str4.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test045"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.fullValue();
    hierarchyPropertyParser0.setSeperator(".");
    java.lang.String str6 = hierarchyPropertyParser0.fullValue();
    hierarchyPropertyParser0.goToRoot();
    java.lang.String[] str_array8 = hierarchyPropertyParser0.childrenValues();
    java.lang.String[] str_array9 = hierarchyPropertyParser0.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array9);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test046"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    boolean b4 = hierarchyPropertyParser0.goToChild("");
    hierarchyPropertyParser0.build("", "");
    boolean b9 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str10 = hierarchyPropertyParser0.getSeperator();
    int i11 = hierarchyPropertyParser0.numChildren();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser0.add("");
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
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "."+ "'", str10.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test047"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    hierarchyPropertyParser0.setSeperator("null(0)[null]\n");
    boolean b6 = hierarchyPropertyParser0.goTo("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test048"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    hierarchyPropertyParser0.build("", "");
    hierarchyPropertyParser0.build("hi!", "hi!");
    int i9 = hierarchyPropertyParser0.getLevel();
    int i10 = hierarchyPropertyParser0.depth();
    int i11 = hierarchyPropertyParser0.depth();
    // The following exception was thrown during execution in test generation
    try {
    boolean b13 = hierarchyPropertyParser0.contains(".");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test049"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    boolean b6 = hierarchyPropertyParser0.isHierachic("hi!");
    int i7 = hierarchyPropertyParser0.depth();
    boolean b9 = hierarchyPropertyParser0.goDown("");
    java.util.Vector vector10 = null;
    int i12 = hierarchyPropertyParser0.search(vector10, "null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test050"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    boolean b4 = hierarchyPropertyParser0.goToChild("");
    hierarchyPropertyParser0.build("", "");
    boolean b9 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str10 = hierarchyPropertyParser0.getSeperator();
    int i11 = hierarchyPropertyParser0.numChildren();
    boolean b13 = hierarchyPropertyParser0.goToChild("null(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "."+ "'", str10.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test051"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.fullValue();
    hierarchyPropertyParser0.setSeperator(".");
    java.lang.String[] str_array7 = hierarchyPropertyParser0.tokenize("");
    int i8 = hierarchyPropertyParser0.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test052"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.fullValue();
    hierarchyPropertyParser0.setSeperator(".");
    java.lang.String str6 = hierarchyPropertyParser0.fullValue();
    hierarchyPropertyParser0.goToRoot();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser0.goToChild((int)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test053"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    hierarchyPropertyParser0.setSeperator("null(0)[null]\n");
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser0.goToChild((int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test054"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    boolean b6 = hierarchyPropertyParser0.isHierachic("hi!");
    int i7 = hierarchyPropertyParser0.depth();
    int i8 = hierarchyPropertyParser0.depth();
    hierarchyPropertyParser0.goToRoot();
    hierarchyPropertyParser0.add("null(0)[null]\n");
    boolean b13 = hierarchyPropertyParser0.goDown("hi!");
    hierarchyPropertyParser0.goToRoot();
    boolean b16 = hierarchyPropertyParser0.goTo("");
    java.util.Vector vector17 = null;
    int i19 = hierarchyPropertyParser0.search(vector17, "");
    java.lang.String str20 = hierarchyPropertyParser0.parentValue();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser0.build("hi!", "null(0)[null]\n");
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test055"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    hierarchyPropertyParser0.build("", "");
    hierarchyPropertyParser0.build("hi!", "hi!");
    int i9 = hierarchyPropertyParser0.getLevel();
    hierarchyPropertyParser0.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test056"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    boolean b6 = hierarchyPropertyParser0.isHierachic("hi!");
    int i7 = hierarchyPropertyParser0.depth();
    int i8 = hierarchyPropertyParser0.depth();
    hierarchyPropertyParser0.goToRoot();
    hierarchyPropertyParser0.goToParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test057"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.fullValue();
    hierarchyPropertyParser0.setSeperator(".");
    java.lang.String str6 = hierarchyPropertyParser0.fullValue();
    hierarchyPropertyParser0.goToRoot();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser0.add(".");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test058"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.fullValue();
    boolean b5 = hierarchyPropertyParser0.goDown("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test059"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.fullValue();
    java.lang.String[] str_array5 = hierarchyPropertyParser0.tokenize("");
    java.lang.String str6 = hierarchyPropertyParser0.parentValue();
    boolean b8 = hierarchyPropertyParser0.goTo("hi!");
    boolean b10 = hierarchyPropertyParser0.goTo("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test060"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.goToParent();
    java.lang.String[] str_array3 = hierarchyPropertyParser0.tokenize("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test061"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    boolean b6 = hierarchyPropertyParser0.isHierachic("hi!");
    java.lang.String str7 = hierarchyPropertyParser0.getSeperator();
    java.lang.String str8 = hierarchyPropertyParser0.showTree();
    java.lang.String str9 = hierarchyPropertyParser0.getValue();
    boolean b11 = hierarchyPropertyParser0.goToChild(".");
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser0.goToChild((int)(short)1);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "."+ "'", str7.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null(0)[null]\n"+ "'", str8.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test062"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.fullValue();
    hierarchyPropertyParser0.setSeperator(".");
    boolean b7 = hierarchyPropertyParser0.isHierachic("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test063"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    hierarchyPropertyParser0.build("", "");
    int i6 = hierarchyPropertyParser0.getLevel();
    boolean b8 = hierarchyPropertyParser0.goDown("hi!");
    int i9 = hierarchyPropertyParser0.depth();
    int i10 = hierarchyPropertyParser0.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test064"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    hierarchyPropertyParser0.build("", "");
    hierarchyPropertyParser0.build("hi!", "hi!");
    int i9 = hierarchyPropertyParser0.getLevel();
    int i10 = hierarchyPropertyParser0.depth();
    int i11 = hierarchyPropertyParser0.depth();
    java.lang.String[] str_array13 = hierarchyPropertyParser0.tokenize("");
    boolean b15 = hierarchyPropertyParser0.isHierachic("null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test065"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    hierarchyPropertyParser0.build("", "");
    int i6 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.build("", "hi!");
    java.lang.String str10 = hierarchyPropertyParser0.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test066"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    boolean b4 = hierarchyPropertyParser0.goToChild("");
    hierarchyPropertyParser0.build("", "");
    boolean b8 = hierarchyPropertyParser0.isRootReached();
    boolean b10 = hierarchyPropertyParser0.goToChild("");
    int i11 = hierarchyPropertyParser0.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test067"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    boolean b5 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String[] str_array7 = hierarchyPropertyParser0.tokenize(".");
    int i8 = hierarchyPropertyParser0.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test068"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    boolean b5 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String[] str_array7 = hierarchyPropertyParser0.tokenize(".");
    java.lang.String str8 = hierarchyPropertyParser0.fullValue();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser0.add(".");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test069"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    java.lang.String str3 = hierarchyPropertyParser2.getValue();
    int i4 = hierarchyPropertyParser2.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test070"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    boolean b6 = hierarchyPropertyParser0.isHierachic("hi!");
    java.lang.String str7 = hierarchyPropertyParser0.getSeperator();
    java.lang.String str8 = hierarchyPropertyParser0.showTree();
    java.lang.String str9 = hierarchyPropertyParser0.parentValue();
    java.lang.String str10 = hierarchyPropertyParser0.showTree();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser0.goToChild((int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "."+ "'", str7.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null(0)[null]\n"+ "'", str8.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test071"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    hierarchyPropertyParser0.build("", "");
    hierarchyPropertyParser0.build("hi!", "hi!");
    int i9 = hierarchyPropertyParser0.getLevel();
    int i10 = hierarchyPropertyParser0.depth();
    int i11 = hierarchyPropertyParser0.depth();
    java.lang.String[] str_array13 = hierarchyPropertyParser0.tokenize("");
    boolean b14 = hierarchyPropertyParser0.isLeafReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test072"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.fullValue();
    hierarchyPropertyParser0.setSeperator(".");
    java.lang.String str6 = hierarchyPropertyParser0.fullValue();
    hierarchyPropertyParser0.goToRoot();
    boolean b8 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String str9 = hierarchyPropertyParser0.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test073"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    java.lang.String str3 = hierarchyPropertyParser2.showTree();
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
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null(0)[null]\n"+ "'", str3.equals("null(0)[null]\n"));

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test074"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n(0)[null]\n", "null(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test075"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    java.lang.String str3 = hierarchyPropertyParser2.getValue();
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n");
    java.util.Vector vector6 = null;
    int i8 = hierarchyPropertyParser2.search(vector6, "null(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test076"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.fullValue();
    hierarchyPropertyParser0.setSeperator(".");
    java.lang.String str6 = hierarchyPropertyParser0.fullValue();
    hierarchyPropertyParser0.goToRoot();
    boolean b8 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String str9 = hierarchyPropertyParser0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test077"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    hierarchyPropertyParser0.setSeperator("null(0)[null]\n");
    boolean b6 = hierarchyPropertyParser0.isHierachic("null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test078"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    boolean b4 = hierarchyPropertyParser0.goToChild(".");
    java.lang.String str5 = hierarchyPropertyParser0.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!(0)[null]\n"+ "'", str5.equals("hi!(0)[null]\n"));

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test079"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    int i3 = hierarchyPropertyParser0.getLevel();
    java.lang.String[] str_array5 = hierarchyPropertyParser0.tokenize("");
    boolean b6 = hierarchyPropertyParser0.isLeafReached();
    java.util.Vector vector7 = null;
    int i9 = hierarchyPropertyParser0.search(vector7, "hi!");
    java.lang.String str10 = hierarchyPropertyParser0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test080"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    hierarchyPropertyParser0.build("", "");
    hierarchyPropertyParser0.build("hi!", "hi!");
    int i9 = hierarchyPropertyParser0.getLevel();
    hierarchyPropertyParser0.build("", "");
    java.lang.String str13 = hierarchyPropertyParser0.getValue();
    boolean b15 = hierarchyPropertyParser0.isHierachic(".");
    java.lang.String str16 = hierarchyPropertyParser0.fullValue();
    int i17 = hierarchyPropertyParser0.depth();
    hierarchyPropertyParser0.goToParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test081"); }


    // The following exception was thrown during execution in test generation
    try {
    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!(0)[null]\n", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test082"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    hierarchyPropertyParser0.build("", "");
    int i6 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToRoot();
    boolean b9 = hierarchyPropertyParser0.goToChild(".");
    java.lang.String str10 = hierarchyPropertyParser0.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "."+ "'", str10.equals("."));

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test083"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    hierarchyPropertyParser0.setSeperator("null(0)[null]\n");
    // The following exception was thrown during execution in test generation
    try {
    boolean b6 = hierarchyPropertyParser0.contains("null(0)[null]\n");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test084"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    boolean b4 = hierarchyPropertyParser0.goToChild("");
    hierarchyPropertyParser0.build("", "");
    boolean b9 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str10 = hierarchyPropertyParser0.getSeperator();
    hierarchyPropertyParser0.setSeperator("hi!");
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser0.build("hi!(0)[null]\n", "null(0)[null]\n");
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
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "."+ "'", str10.equals("."));

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test085"); }


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
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test086"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser0.build("hi!(0)[null]\n", "");
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test087"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    boolean b4 = hierarchyPropertyParser0.contains("hi!");
    hierarchyPropertyParser0.setSeperator(".");
    boolean b7 = hierarchyPropertyParser0.isRootReached();
    hierarchyPropertyParser0.add("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test088"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    java.lang.String str3 = hierarchyPropertyParser2.showTree();
    java.lang.String str4 = hierarchyPropertyParser2.parentValue();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null(0)[null]\n"+ "'", str3.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test089"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    hierarchyPropertyParser0.build("", "");
    int i6 = hierarchyPropertyParser0.getLevel();
    java.lang.String str7 = hierarchyPropertyParser0.context();
    boolean b9 = hierarchyPropertyParser0.isHierachic("hi!");
    java.lang.String str10 = hierarchyPropertyParser0.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test090"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!(0)[null]\n");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test091"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    boolean b4 = hierarchyPropertyParser0.goToChild(".");
    java.lang.String str5 = hierarchyPropertyParser0.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test092"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    boolean b4 = hierarchyPropertyParser0.goToChild("");
    hierarchyPropertyParser0.build("", "");
    boolean b9 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str10 = hierarchyPropertyParser0.getSeperator();
    java.lang.String str11 = hierarchyPropertyParser0.getValue();
    java.lang.String[] str_array13 = hierarchyPropertyParser0.tokenize("null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "."+ "'", str10.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test093"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    int i3 = hierarchyPropertyParser0.getLevel();
    hierarchyPropertyParser0.goToRoot();
    boolean b5 = hierarchyPropertyParser0.isLeafReached();
    boolean b6 = hierarchyPropertyParser0.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test094"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    boolean b4 = hierarchyPropertyParser0.goToChild("");
    hierarchyPropertyParser0.build("", "");
    boolean b8 = hierarchyPropertyParser0.isRootReached();
    boolean b10 = hierarchyPropertyParser0.goToChild("");
    java.lang.String str11 = hierarchyPropertyParser0.parentValue();
    boolean b13 = hierarchyPropertyParser0.goDown("null(0)[null]\n");
    java.util.Vector vector14 = null;
    int i16 = hierarchyPropertyParser0.search(vector14, "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test095"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "null(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test096"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    hierarchyPropertyParser0.build("", "");
    hierarchyPropertyParser0.build("hi!", "hi!");
    int i9 = hierarchyPropertyParser0.getLevel();
    hierarchyPropertyParser0.build("", "");
    java.lang.String str13 = hierarchyPropertyParser0.getValue();
    boolean b15 = hierarchyPropertyParser0.isHierachic(".");
    java.lang.String str16 = hierarchyPropertyParser0.fullValue();
    int i17 = hierarchyPropertyParser0.depth();
    java.lang.String str18 = hierarchyPropertyParser0.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test097"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    boolean b4 = hierarchyPropertyParser0.contains("hi!");
    boolean b6 = hierarchyPropertyParser0.isHierachic("hi!");
    java.lang.String str7 = hierarchyPropertyParser0.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test098"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    boolean b6 = hierarchyPropertyParser0.isHierachic("hi!");
    int i7 = hierarchyPropertyParser0.depth();
    java.lang.String str8 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.setSeperator("");
    hierarchyPropertyParser0.build("", "");
    // The following exception was thrown during execution in test generation
    try {
    boolean b15 = hierarchyPropertyParser0.goDown("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test099"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    boolean b4 = hierarchyPropertyParser0.contains("hi!");
    hierarchyPropertyParser0.setSeperator(".");
    boolean b7 = hierarchyPropertyParser0.isRootReached();
    boolean b8 = hierarchyPropertyParser0.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test100"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    java.lang.String[] str_array3 = hierarchyPropertyParser0.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array3);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test101"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    int i3 = hierarchyPropertyParser0.getLevel();
    int i4 = hierarchyPropertyParser0.depth();
    // The following exception was thrown during execution in test generation
    try {
    boolean b6 = hierarchyPropertyParser0.contains("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test102"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    boolean b5 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String str6 = hierarchyPropertyParser0.fullValue();
    boolean b8 = hierarchyPropertyParser0.contains("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test103"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.fullValue();
    hierarchyPropertyParser0.setSeperator(".");
    java.lang.String str6 = hierarchyPropertyParser0.fullValue();
    hierarchyPropertyParser0.goToRoot();
    boolean b9 = hierarchyPropertyParser0.isHierachic("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test104"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.goToParent();
    java.lang.String[] str_array3 = hierarchyPropertyParser0.tokenize("null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test105"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    boolean b4 = hierarchyPropertyParser2.contains("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test106"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    boolean b4 = hierarchyPropertyParser0.goToChild("");
    hierarchyPropertyParser0.setSeperator("hi!");
    int i7 = hierarchyPropertyParser0.depth();
    // The following exception was thrown during execution in test generation
    try {
    boolean b9 = hierarchyPropertyParser0.contains("");
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
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test107"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    boolean b6 = hierarchyPropertyParser0.isHierachic("hi!");
    int i7 = hierarchyPropertyParser0.depth();
    java.lang.String str8 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.setSeperator("");
    java.lang.String[] str_array12 = hierarchyPropertyParser0.tokenize("");
    java.lang.String str13 = hierarchyPropertyParser0.fullValue();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser0.build(".", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test108"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    boolean b6 = hierarchyPropertyParser0.isHierachic("hi!");
    int i7 = hierarchyPropertyParser0.depth();
    int i8 = hierarchyPropertyParser0.depth();
    hierarchyPropertyParser0.goToRoot();
    hierarchyPropertyParser0.add("null(0)[null]\n");
    boolean b13 = hierarchyPropertyParser0.goDown("hi!");
    hierarchyPropertyParser0.goToRoot();
    boolean b16 = hierarchyPropertyParser0.goTo("");
    java.util.Vector vector17 = null;
    int i19 = hierarchyPropertyParser0.search(vector17, "");
    java.lang.String str20 = hierarchyPropertyParser0.getSeperator();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser0.add("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "."+ "'", str20.equals("."));

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test109"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    boolean b6 = hierarchyPropertyParser0.isHierachic("hi!");
    java.lang.String str7 = hierarchyPropertyParser0.getSeperator();
    java.lang.String str8 = hierarchyPropertyParser0.showTree();
    boolean b10 = hierarchyPropertyParser0.goToChild("null(0)[null]\n");
    hierarchyPropertyParser0.add("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "."+ "'", str7.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null(0)[null]\n"+ "'", str8.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test110"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    boolean b4 = hierarchyPropertyParser0.contains("hi!");
    java.util.Vector vector5 = null;
    int i7 = hierarchyPropertyParser0.search(vector5, "hi!");
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser0.search(vector8, "null(0)[null]\n");
    java.lang.String str11 = hierarchyPropertyParser0.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test111"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    int i3 = hierarchyPropertyParser0.getLevel();
    hierarchyPropertyParser0.goToRoot();
    boolean b5 = hierarchyPropertyParser0.isLeafReached();
    int i6 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.add("null(0)[null]\n");
    boolean b9 = hierarchyPropertyParser0.isLeafReached();
    boolean b11 = hierarchyPropertyParser0.goTo("null(0)[null]\n(0)[null]\n");
    boolean b13 = hierarchyPropertyParser0.goToChild("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test112"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b1 = hierarchyPropertyParser0.isLeafReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test113"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    hierarchyPropertyParser0.build("", "");
    hierarchyPropertyParser0.build("hi!", "hi!");
    int i9 = hierarchyPropertyParser0.getLevel();
    int i10 = hierarchyPropertyParser0.depth();
    java.lang.String str11 = hierarchyPropertyParser0.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test114"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    boolean b4 = hierarchyPropertyParser0.goToChild("");
    hierarchyPropertyParser0.build("", "");
    boolean b9 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str10 = hierarchyPropertyParser0.getSeperator();
    int i11 = hierarchyPropertyParser0.numChildren();
    java.lang.String str12 = hierarchyPropertyParser0.context();
    // The following exception was thrown during execution in test generation
    try {
    boolean b14 = hierarchyPropertyParser0.contains(".");
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
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "."+ "'", str10.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test115"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    boolean b6 = hierarchyPropertyParser0.isHierachic("hi!");
    int i7 = hierarchyPropertyParser0.depth();
    boolean b9 = hierarchyPropertyParser0.goDown(".");
    boolean b11 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str12 = hierarchyPropertyParser0.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test116"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    boolean b4 = hierarchyPropertyParser0.goToChild("");
    hierarchyPropertyParser0.build("", "");
    boolean b9 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str10 = hierarchyPropertyParser0.getSeperator();
    hierarchyPropertyParser0.setSeperator("hi!");
    boolean b14 = hierarchyPropertyParser0.goDown("null(0)[null]\n");
    hierarchyPropertyParser0.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "."+ "'", str10.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test117"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    boolean b6 = hierarchyPropertyParser0.isHierachic("hi!");
    int i7 = hierarchyPropertyParser0.depth();
    int i8 = hierarchyPropertyParser0.depth();
    hierarchyPropertyParser0.goToRoot();
    hierarchyPropertyParser0.add("null(0)[null]\n");
    boolean b13 = hierarchyPropertyParser0.goDown("hi!");
    hierarchyPropertyParser0.goToRoot();
    boolean b16 = hierarchyPropertyParser0.goTo("");
    boolean b18 = hierarchyPropertyParser0.goTo("hi!");
    hierarchyPropertyParser0.goToRoot();
    hierarchyPropertyParser0.build("", "null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test118"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    hierarchyPropertyParser0.build("", "");
    hierarchyPropertyParser0.build("hi!", "hi!");
    int i9 = hierarchyPropertyParser0.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test119"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    int i3 = hierarchyPropertyParser0.getLevel();
    java.lang.String[] str_array4 = hierarchyPropertyParser0.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test120"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    hierarchyPropertyParser0.build("", "");
    int i6 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToParent();
    java.lang.String str8 = hierarchyPropertyParser0.getValue();
    java.lang.String str9 = hierarchyPropertyParser0.showTree();
    int i10 = hierarchyPropertyParser0.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null(0)[null]\n"+ "'", str9.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test121"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    boolean b4 = hierarchyPropertyParser0.contains("hi!");
    boolean b6 = hierarchyPropertyParser0.isHierachic("hi!");
    java.lang.String[] str_array8 = hierarchyPropertyParser0.tokenize("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test122"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    int i3 = hierarchyPropertyParser0.getLevel();
    java.lang.String[] str_array5 = hierarchyPropertyParser0.tokenize("");
    int i6 = hierarchyPropertyParser0.getLevel();
    boolean b7 = hierarchyPropertyParser0.isRootReached();
    boolean b9 = hierarchyPropertyParser0.goDown("hi!(0)[null]\n");
    boolean b10 = hierarchyPropertyParser0.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test123"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.fullValue();
    hierarchyPropertyParser0.setSeperator(".");
    java.lang.String[] str_array7 = hierarchyPropertyParser0.tokenize("");
    hierarchyPropertyParser0.setSeperator("");
    int i10 = hierarchyPropertyParser0.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test124"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    hierarchyPropertyParser0.build("", "");
    hierarchyPropertyParser0.add("null(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test125"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    boolean b6 = hierarchyPropertyParser0.isHierachic("hi!");
    int i7 = hierarchyPropertyParser0.depth();
    java.lang.String str8 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.setSeperator("");
    java.lang.String[] str_array12 = hierarchyPropertyParser0.tokenize("");
    java.lang.String str13 = hierarchyPropertyParser0.getValue();
    boolean b15 = hierarchyPropertyParser0.goDown("null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test126"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser0.getSeperator();
    java.lang.String str5 = hierarchyPropertyParser0.fullValue();
    java.util.Vector vector6 = null;
    int i8 = hierarchyPropertyParser0.search(vector6, "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "."+ "'", str4.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test127"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    boolean b5 = hierarchyPropertyParser0.contains("hi!");
    boolean b7 = hierarchyPropertyParser0.goToChild("null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test128"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    boolean b6 = hierarchyPropertyParser0.isHierachic("hi!");
    int i7 = hierarchyPropertyParser0.depth();
    int i8 = hierarchyPropertyParser0.depth();
    hierarchyPropertyParser0.goToRoot();
    hierarchyPropertyParser0.add("null(0)[null]\n");
    java.util.Vector vector12 = null;
    int i14 = hierarchyPropertyParser0.search(vector12, "null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test129"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n(0)[null]\n", "hi!(0)[null]\n");

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test130"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    boolean b4 = hierarchyPropertyParser0.goToChild("");
    hierarchyPropertyParser0.setSeperator("hi!");
    hierarchyPropertyParser0.goToParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test131"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser(".", ".");
    java.lang.String[] str_array3 = hierarchyPropertyParser2.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test132"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    boolean b6 = hierarchyPropertyParser0.isHierachic("hi!");
    int i7 = hierarchyPropertyParser0.depth();
    java.lang.String str8 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.setSeperator("");
    java.lang.String[] str_array12 = hierarchyPropertyParser0.tokenize("");
    boolean b13 = hierarchyPropertyParser0.isLeafReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test133"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    hierarchyPropertyParser0.build("", "");
    int i6 = hierarchyPropertyParser0.getLevel();
    hierarchyPropertyParser0.build("null(0)[null]\n", "null(0)[null]\n(0)[null]\n");
    java.lang.String str10 = hierarchyPropertyParser0.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!(0)[null]\n"+ "'", str10.equals("hi!(0)[null]\n"));

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test134"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    int i3 = hierarchyPropertyParser0.getLevel();
    boolean b5 = hierarchyPropertyParser0.contains("null(0)[null]\n(0)[null]\n");
    boolean b7 = hierarchyPropertyParser0.contains("null(0)[null]\n");
    boolean b9 = hierarchyPropertyParser0.isHierachic("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test135"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    hierarchyPropertyParser0.setSeperator("null(0)[null]\n");
    boolean b6 = hierarchyPropertyParser0.goToChild("null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test136"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    java.lang.String[] str_array6 = hierarchyPropertyParser0.tokenize("null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test137"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    int i3 = hierarchyPropertyParser0.getLevel();
    hierarchyPropertyParser0.goToRoot();
    java.util.Vector vector5 = null;
    int i7 = hierarchyPropertyParser0.search(vector5, "null(0)[null]\n");
    java.lang.String str8 = hierarchyPropertyParser0.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "."+ "'", str8.equals("."));

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test138"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    java.lang.String str3 = hierarchyPropertyParser2.getValue();
    boolean b5 = hierarchyPropertyParser2.goToChild("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test139"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    java.lang.String[] str_array4 = hierarchyPropertyParser2.tokenize("");
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str6 = hierarchyPropertyParser2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test140"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    int i3 = hierarchyPropertyParser0.getLevel();
    int i4 = hierarchyPropertyParser0.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test141"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    boolean b4 = hierarchyPropertyParser0.contains("hi!");
    java.util.Vector vector5 = null;
    int i7 = hierarchyPropertyParser0.search(vector5, "hi!");
    java.lang.String str8 = hierarchyPropertyParser0.getValue();
    int i9 = hierarchyPropertyParser0.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test142"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    boolean b4 = hierarchyPropertyParser0.contains("hi!");
    java.util.Vector vector5 = null;
    int i7 = hierarchyPropertyParser0.search(vector5, "hi!");
    java.lang.String str8 = hierarchyPropertyParser0.showTree();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser0.add("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!(0)[null]\n"+ "'", str8.equals("hi!(0)[null]\n"));

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test143"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    boolean b6 = hierarchyPropertyParser0.isHierachic("hi!");
    java.lang.String str7 = hierarchyPropertyParser0.getSeperator();
    java.lang.String str8 = hierarchyPropertyParser0.showTree();
    java.lang.String str9 = hierarchyPropertyParser0.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "."+ "'", str7.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null(0)[null]\n"+ "'", str8.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "."+ "'", str9.equals("."));

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test144"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    hierarchyPropertyParser0.build("", "");
    int i6 = hierarchyPropertyParser0.getLevel();
    hierarchyPropertyParser0.build("null(0)[null]\n", "null(0)[null]\n(0)[null]\n");
    java.util.Vector vector10 = null;
    int i12 = hierarchyPropertyParser0.search(vector10, "");
    int i13 = hierarchyPropertyParser0.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test145"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    int i3 = hierarchyPropertyParser0.getLevel();
    boolean b5 = hierarchyPropertyParser0.goToChild("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test146"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    boolean b5 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String str6 = hierarchyPropertyParser0.fullValue();
    boolean b7 = hierarchyPropertyParser0.isRootReached();
    boolean b9 = hierarchyPropertyParser0.contains("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test147"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser0.getSeperator();
    java.util.Vector vector5 = null;
    int i7 = hierarchyPropertyParser0.search(vector5, "hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "."+ "'", str4.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test148"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser0.add("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test149"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    int i3 = hierarchyPropertyParser0.getLevel();
    java.lang.String str4 = hierarchyPropertyParser0.context();
    java.util.Vector vector5 = null;
    int i7 = hierarchyPropertyParser0.search(vector5, "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test150"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    boolean b3 = hierarchyPropertyParser0.isLeafReached();
    java.util.Vector vector4 = null;
    int i6 = hierarchyPropertyParser0.search(vector4, "hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test151"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.fullValue();
    hierarchyPropertyParser0.setSeperator(".");
    java.lang.String[] str_array7 = hierarchyPropertyParser0.tokenize("");
    java.lang.String str8 = hierarchyPropertyParser0.fullValue();
    java.lang.String str9 = hierarchyPropertyParser0.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test152"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    boolean b6 = hierarchyPropertyParser0.isHierachic("hi!");
    int i7 = hierarchyPropertyParser0.depth();
    boolean b9 = hierarchyPropertyParser0.goDown(".");
    java.lang.String[] str_array10 = hierarchyPropertyParser0.childrenValues();
    hierarchyPropertyParser0.goToRoot();
    boolean b12 = hierarchyPropertyParser0.isLeafReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test153"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    boolean b6 = hierarchyPropertyParser0.isHierachic("hi!");
    int i7 = hierarchyPropertyParser0.depth();
    java.lang.String str8 = hierarchyPropertyParser0.parentValue();
    int i9 = hierarchyPropertyParser0.depth();
    hierarchyPropertyParser0.goToParent();
    java.lang.String str11 = hierarchyPropertyParser0.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test154"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    hierarchyPropertyParser0.build("", "");
    hierarchyPropertyParser0.build("hi!", "hi!");
    int i9 = hierarchyPropertyParser0.getLevel();
    int i10 = hierarchyPropertyParser0.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test155"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.fullValue();
    hierarchyPropertyParser0.setSeperator(".");
    java.lang.String[] str_array7 = hierarchyPropertyParser0.tokenize("");
    java.lang.String str8 = hierarchyPropertyParser0.fullValue();
    hierarchyPropertyParser0.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test156"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    int i3 = hierarchyPropertyParser0.getLevel();
    hierarchyPropertyParser0.goToRoot();
    java.util.Vector vector5 = null;
    int i7 = hierarchyPropertyParser0.search(vector5, "null(0)[null]\n");
    java.lang.String str8 = hierarchyPropertyParser0.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test157"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.fullValue();
    java.lang.String[] str_array5 = hierarchyPropertyParser0.tokenize("");
    java.lang.String str6 = hierarchyPropertyParser0.parentValue();
    boolean b8 = hierarchyPropertyParser0.goDown("null(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test158"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    int i3 = hierarchyPropertyParser0.getLevel();
    java.lang.String[] str_array5 = hierarchyPropertyParser0.tokenize("");
    boolean b6 = hierarchyPropertyParser0.isLeafReached();
    java.util.Vector vector7 = null;
    int i9 = hierarchyPropertyParser0.search(vector7, "hi!");
    hierarchyPropertyParser0.setSeperator("null(0)[null]\n");
    java.lang.String str12 = hierarchyPropertyParser0.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test159"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser2.add(".");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test160"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    boolean b4 = hierarchyPropertyParser0.goToChild("");
    hierarchyPropertyParser0.build("", "");
    boolean b9 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str10 = hierarchyPropertyParser0.getSeperator();
    int i11 = hierarchyPropertyParser0.numChildren();
    java.lang.String str12 = hierarchyPropertyParser0.context();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser0.add("");
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
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "."+ "'", str10.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test161"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    hierarchyPropertyParser0.build("", "");
    hierarchyPropertyParser0.build("hi!", "hi!");
    int i9 = hierarchyPropertyParser0.getLevel();
    int i10 = hierarchyPropertyParser0.depth();
    boolean b12 = hierarchyPropertyParser0.isHierachic("null(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test162"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser2.search(vector3, "hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test163"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    boolean b4 = hierarchyPropertyParser0.goToChild("");
    hierarchyPropertyParser0.setSeperator("hi!");
    int i7 = hierarchyPropertyParser0.depth();
    boolean b9 = hierarchyPropertyParser0.isHierachic("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test164"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    int i3 = hierarchyPropertyParser0.getLevel();
    java.lang.String[] str_array5 = hierarchyPropertyParser0.tokenize("");
    boolean b6 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String str7 = hierarchyPropertyParser0.fullValue();
    java.lang.String str8 = hierarchyPropertyParser0.parentValue();
    java.lang.String str9 = hierarchyPropertyParser0.context();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser0.add(".");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test165"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    boolean b5 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String str6 = hierarchyPropertyParser0.fullValue();
    java.util.Vector vector7 = null;
    int i9 = hierarchyPropertyParser0.search(vector7, "");
    hierarchyPropertyParser0.build("null(0)[null]\n", "hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test166"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.fullValue();
    java.lang.String[] str_array5 = hierarchyPropertyParser0.tokenize("");
    java.lang.String str6 = hierarchyPropertyParser0.parentValue();
    boolean b8 = hierarchyPropertyParser0.contains("hi!");
    hierarchyPropertyParser0.add("hi!");
    boolean b12 = hierarchyPropertyParser0.contains("null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test167"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    boolean b4 = hierarchyPropertyParser0.goToChild("");
    hierarchyPropertyParser0.build("", "");
    boolean b9 = hierarchyPropertyParser0.goToChild("hi!");
    boolean b11 = hierarchyPropertyParser0.isHierachic(".");
    boolean b12 = hierarchyPropertyParser0.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test168"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    boolean b6 = hierarchyPropertyParser0.isHierachic("hi!");
    java.lang.String str7 = hierarchyPropertyParser0.getSeperator();
    hierarchyPropertyParser0.goToRoot();
    java.lang.String str9 = hierarchyPropertyParser0.fullValue();
    boolean b11 = hierarchyPropertyParser0.goToChild("null(0)[null]\n");
    java.lang.String[] str_array12 = hierarchyPropertyParser0.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "."+ "'", str7.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test169"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    java.lang.String str3 = hierarchyPropertyParser2.showTree();
    java.lang.String str4 = hierarchyPropertyParser2.parentValue();
    boolean b6 = hierarchyPropertyParser2.goToChild("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null(0)[null]\n"+ "'", str3.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test170"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    boolean b5 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String str6 = hierarchyPropertyParser0.fullValue();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser0.goToChild(10);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test171"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    hierarchyPropertyParser0.setSeperator(".");
    java.lang.String str5 = hierarchyPropertyParser0.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!(0)[null]\n"+ "'", str5.equals("hi!(0)[null]\n"));

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test172"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    hierarchyPropertyParser0.build("", "");
    int i6 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.build("", "hi!");
    hierarchyPropertyParser0.goToParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test173"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.goToRoot();
    boolean b2 = hierarchyPropertyParser0.isLeafReached();
    hierarchyPropertyParser0.goToParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test174"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    boolean b6 = hierarchyPropertyParser0.isHierachic("hi!");
    java.lang.String str7 = hierarchyPropertyParser0.getSeperator();
    java.lang.String str8 = hierarchyPropertyParser0.showTree();
    java.lang.String str9 = hierarchyPropertyParser0.parentValue();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser0.build("hi!", "null(0)[null]\n");
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "."+ "'", str7.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null(0)[null]\n"+ "'", str8.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test175"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    boolean b6 = hierarchyPropertyParser0.isHierachic("hi!");
    int i7 = hierarchyPropertyParser0.depth();
    int i8 = hierarchyPropertyParser0.depth();
    java.util.Vector vector9 = null;
    int i11 = hierarchyPropertyParser0.search(vector9, "");
    boolean b13 = hierarchyPropertyParser0.isHierachic(".");
    boolean b14 = hierarchyPropertyParser0.isLeafReached();
    int i15 = hierarchyPropertyParser0.getLevel();
    int i16 = hierarchyPropertyParser0.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test176"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    boolean b4 = hierarchyPropertyParser0.goToChild("");
    hierarchyPropertyParser0.setSeperator("hi!");
    boolean b8 = hierarchyPropertyParser0.isHierachic("");
    java.lang.String str9 = hierarchyPropertyParser0.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test177"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    boolean b5 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String str6 = hierarchyPropertyParser0.fullValue();
    boolean b7 = hierarchyPropertyParser0.isRootReached();
    hierarchyPropertyParser0.goToParent();
    hierarchyPropertyParser0.goToParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test178"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    int i3 = hierarchyPropertyParser0.getLevel();
    java.lang.String[] str_array5 = hierarchyPropertyParser0.tokenize("");
    boolean b6 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String str7 = hierarchyPropertyParser0.fullValue();
    java.lang.String str8 = hierarchyPropertyParser0.context();
    hierarchyPropertyParser0.setSeperator("null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test179"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    boolean b4 = hierarchyPropertyParser0.goToChild("");
    hierarchyPropertyParser0.build("", "");
    boolean b8 = hierarchyPropertyParser0.isRootReached();
    boolean b10 = hierarchyPropertyParser0.goToChild("");
    java.lang.String str11 = hierarchyPropertyParser0.parentValue();
    boolean b13 = hierarchyPropertyParser0.goDown("null(0)[null]\n");
    boolean b14 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str15 = hierarchyPropertyParser0.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test180"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser0.getSeperator();
    int i5 = hierarchyPropertyParser0.depth();
    int i6 = hierarchyPropertyParser0.getLevel();
    hierarchyPropertyParser0.goToRoot();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser0.goToChild((int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "."+ "'", str4.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test181"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    int i3 = hierarchyPropertyParser0.getLevel();
    java.lang.String[] str_array5 = hierarchyPropertyParser0.tokenize("");
    boolean b6 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String str7 = hierarchyPropertyParser0.fullValue();
    java.lang.String str8 = hierarchyPropertyParser0.parentValue();
    java.lang.String str9 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.add("null(0)[null]\n");
    int i12 = hierarchyPropertyParser0.numChildren();
    java.lang.String str13 = hierarchyPropertyParser0.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "."+ "'", str13.equals("."));

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test182"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.fullValue();
    hierarchyPropertyParser0.setSeperator(".");
    java.lang.String str6 = hierarchyPropertyParser0.fullValue();
    hierarchyPropertyParser0.goToRoot();
    java.lang.String str8 = hierarchyPropertyParser0.getValue();
    java.lang.String[] str_array9 = hierarchyPropertyParser0.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array9);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test183"); }


    // The following exception was thrown during execution in test generation
    try {
    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", ".");
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test184"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.fullValue();
    hierarchyPropertyParser0.setSeperator(".");
    java.lang.String[] str_array7 = hierarchyPropertyParser0.tokenize("");
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser0.search(vector8, "hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test185"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    boolean b4 = hierarchyPropertyParser0.goToChild("");
    hierarchyPropertyParser0.build("", "");
    boolean b9 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str10 = hierarchyPropertyParser0.getSeperator();
    java.lang.String[] str_array12 = hierarchyPropertyParser0.tokenize("hi!");
    int i13 = hierarchyPropertyParser0.getLevel();
    java.lang.String str14 = hierarchyPropertyParser0.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "."+ "'", str10.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test186"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser0.getSeperator();
    java.lang.String str5 = hierarchyPropertyParser0.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "."+ "'", str4.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test187"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    boolean b4 = hierarchyPropertyParser0.goToChild("");
    hierarchyPropertyParser0.build("", "");
    boolean b8 = hierarchyPropertyParser0.isRootReached();
    boolean b10 = hierarchyPropertyParser0.goToChild("");
    java.util.Vector vector11 = null;
    int i13 = hierarchyPropertyParser0.search(vector11, ".");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test188"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser0.getSeperator();
    int i5 = hierarchyPropertyParser0.depth();
    int i6 = hierarchyPropertyParser0.getLevel();
    java.lang.String str7 = hierarchyPropertyParser0.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "."+ "'", str4.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "."+ "'", str7.equals("."));

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test189"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    hierarchyPropertyParser0.build("", "");
    int i6 = hierarchyPropertyParser0.getLevel();
    hierarchyPropertyParser0.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test190"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    boolean b4 = hierarchyPropertyParser0.goToChild("");
    hierarchyPropertyParser0.setSeperator("hi!");
    boolean b8 = hierarchyPropertyParser0.isHierachic("");
    hierarchyPropertyParser0.setSeperator("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test191"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    boolean b6 = hierarchyPropertyParser0.isHierachic("hi!");
    int i7 = hierarchyPropertyParser0.depth();
    int i8 = hierarchyPropertyParser0.depth();
    hierarchyPropertyParser0.goToRoot();
    hierarchyPropertyParser0.add("null(0)[null]\n");
    boolean b13 = hierarchyPropertyParser0.goDown("hi!");
    int i14 = hierarchyPropertyParser0.getLevel();
    boolean b16 = hierarchyPropertyParser0.contains("hi!(0)[null]\n");
    boolean b18 = hierarchyPropertyParser0.goDown(".");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test192"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    boolean b6 = hierarchyPropertyParser0.isHierachic("hi!");
    int i7 = hierarchyPropertyParser0.depth();
    boolean b9 = hierarchyPropertyParser0.goDown(".");
    boolean b11 = hierarchyPropertyParser0.goToChild("hi!");
    hierarchyPropertyParser0.add("null(0)[null]\n(0)[null]\n");
    java.lang.String str14 = hierarchyPropertyParser0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "null(0)[null]\n(0)[null]\n"+ "'", str14.equals("null(0)[null]\n(0)[null]\n"));

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test193"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    hierarchyPropertyParser0.build("", "");
    int i6 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.build("", "hi!");
    boolean b10 = hierarchyPropertyParser0.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test194"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.fullValue();
    hierarchyPropertyParser0.setSeperator(".");
    java.lang.String str6 = hierarchyPropertyParser0.fullValue();
    java.lang.String[] str_array7 = hierarchyPropertyParser0.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array7);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test195"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    boolean b5 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String[] str_array7 = hierarchyPropertyParser0.tokenize(".");
    java.lang.String str8 = hierarchyPropertyParser0.context();
    java.util.Vector vector9 = null;
    int i11 = hierarchyPropertyParser0.search(vector9, "null(0)[null]\n(0)[null]\n");
    hierarchyPropertyParser0.build("hi!(0)[null]\n", "hi!(0)[null]\n");
    java.lang.String str15 = hierarchyPropertyParser0.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "."+ "'", str15.equals("."));

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test196"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    boolean b6 = hierarchyPropertyParser0.isHierachic("hi!");
    int i7 = hierarchyPropertyParser0.depth();
    int i8 = hierarchyPropertyParser0.depth();
    hierarchyPropertyParser0.goToRoot();
    hierarchyPropertyParser0.add("null(0)[null]\n");
    boolean b13 = hierarchyPropertyParser0.goDown("hi!");
    int i14 = hierarchyPropertyParser0.getLevel();
    java.lang.String str15 = hierarchyPropertyParser0.parentValue();
    java.lang.String str16 = hierarchyPropertyParser0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "null(0)[null]\n"+ "'", str16.equals("null(0)[null]\n"));

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test197"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    java.lang.String str3 = hierarchyPropertyParser2.context();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser2.build("null(0)[null]\n(0)[null]\n", ".");
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
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test198"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    boolean b4 = hierarchyPropertyParser0.goToChild("");
    hierarchyPropertyParser0.build("", "");
    boolean b9 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str10 = hierarchyPropertyParser0.getSeperator();
    java.lang.String[] str_array12 = hierarchyPropertyParser0.tokenize("hi!");
    hierarchyPropertyParser0.add("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "."+ "'", str10.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test199"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    boolean b4 = hierarchyPropertyParser0.goToChild(".");
    hierarchyPropertyParser0.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test200"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    boolean b6 = hierarchyPropertyParser0.isHierachic("hi!");
    java.lang.String str7 = hierarchyPropertyParser0.getSeperator();
    java.lang.String str8 = hierarchyPropertyParser0.showTree();
    java.lang.String str9 = hierarchyPropertyParser0.parentValue();
    java.lang.String str10 = hierarchyPropertyParser0.showTree();
    boolean b12 = hierarchyPropertyParser0.goDown(".");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "."+ "'", str7.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null(0)[null]\n"+ "'", str8.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test201"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    hierarchyPropertyParser0.build("", "");
    int i6 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToParent();
    int i8 = hierarchyPropertyParser0.depth();
    java.lang.String str9 = hierarchyPropertyParser0.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test202"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    boolean b6 = hierarchyPropertyParser0.goToChild("");
    boolean b7 = hierarchyPropertyParser0.isLeafReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test203"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    boolean b5 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String[] str_array7 = hierarchyPropertyParser0.tokenize(".");
    java.lang.String str8 = hierarchyPropertyParser0.context();
    java.util.Vector vector9 = null;
    int i11 = hierarchyPropertyParser0.search(vector9, "null(0)[null]\n(0)[null]\n");
    boolean b13 = hierarchyPropertyParser0.goToChild(".");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test204"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    boolean b4 = hierarchyPropertyParser0.goToChild("");
    hierarchyPropertyParser0.build("", "");
    boolean b8 = hierarchyPropertyParser0.isRootReached();
    boolean b10 = hierarchyPropertyParser0.goToChild("");
    java.lang.String str11 = hierarchyPropertyParser0.parentValue();
    boolean b13 = hierarchyPropertyParser0.goDown("null(0)[null]\n");
    boolean b14 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str15 = hierarchyPropertyParser0.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!(0)[null]\n"+ "'", str15.equals("hi!(0)[null]\n"));

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test205"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    hierarchyPropertyParser0.setSeperator(".");
    boolean b6 = hierarchyPropertyParser0.goDown("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test206"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    boolean b6 = hierarchyPropertyParser0.isHierachic("hi!");
    int i7 = hierarchyPropertyParser0.depth();
    int i8 = hierarchyPropertyParser0.depth();
    hierarchyPropertyParser0.goToRoot();
    java.lang.String[] str_array10 = hierarchyPropertyParser0.childrenValues();
    java.lang.String str11 = hierarchyPropertyParser0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test207"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    boolean b6 = hierarchyPropertyParser0.isHierachic("hi!");
    int i7 = hierarchyPropertyParser0.depth();
    int i8 = hierarchyPropertyParser0.depth();
    hierarchyPropertyParser0.goToRoot();
    hierarchyPropertyParser0.add("null(0)[null]\n");
    boolean b13 = hierarchyPropertyParser0.goDown("hi!");
    hierarchyPropertyParser0.goToRoot();
    boolean b16 = hierarchyPropertyParser0.goTo("");
    java.lang.String str17 = hierarchyPropertyParser0.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test208"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    boolean b6 = hierarchyPropertyParser0.isHierachic("hi!");
    int i7 = hierarchyPropertyParser0.depth();
    // The following exception was thrown during execution in test generation
    try {
    boolean b9 = hierarchyPropertyParser0.contains("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test209"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    hierarchyPropertyParser0.build("", "");
    hierarchyPropertyParser0.build("hi!", "hi!");
    int i9 = hierarchyPropertyParser0.getLevel();
    hierarchyPropertyParser0.build("", "");
    java.lang.String str13 = hierarchyPropertyParser0.getValue();
    boolean b15 = hierarchyPropertyParser0.isHierachic(".");
    java.lang.String str16 = hierarchyPropertyParser0.fullValue();
    int i17 = hierarchyPropertyParser0.numChildren();
    boolean b18 = hierarchyPropertyParser0.isRootReached();
    boolean b20 = hierarchyPropertyParser0.goDown("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test210"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    hierarchyPropertyParser0.build("", "");
    hierarchyPropertyParser0.build("hi!", "hi!");
    int i9 = hierarchyPropertyParser0.getLevel();
    int i10 = hierarchyPropertyParser0.depth();
    int i11 = hierarchyPropertyParser0.depth();
    boolean b12 = hierarchyPropertyParser0.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test211"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    boolean b4 = hierarchyPropertyParser0.goToChild("");
    hierarchyPropertyParser0.build("", "");
    boolean b9 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str10 = hierarchyPropertyParser0.getSeperator();
    int i11 = hierarchyPropertyParser0.numChildren();
    java.lang.String str12 = hierarchyPropertyParser0.context();
    java.lang.String str13 = hierarchyPropertyParser0.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "."+ "'", str10.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test212"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser2.build(".", "null(0)[null]\n(0)[null]\n");
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test213"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    boolean b4 = hierarchyPropertyParser0.goToChild("");
    hierarchyPropertyParser0.build("", "");
    boolean b8 = hierarchyPropertyParser0.isRootReached();
    int i9 = hierarchyPropertyParser0.getLevel();
    int i10 = hierarchyPropertyParser0.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test214"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    boolean b6 = hierarchyPropertyParser0.isHierachic("hi!");
    int i7 = hierarchyPropertyParser0.depth();
    int i8 = hierarchyPropertyParser0.depth();
    hierarchyPropertyParser0.goToRoot();
    hierarchyPropertyParser0.add("null(0)[null]\n");
    boolean b13 = hierarchyPropertyParser0.goDown("hi!");
    hierarchyPropertyParser0.goToRoot();
    boolean b16 = hierarchyPropertyParser0.goTo("");
    boolean b18 = hierarchyPropertyParser0.goDown("null(0)[null]\n(0)[null]\n");
    java.lang.String[] str_array19 = hierarchyPropertyParser0.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array19);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test215"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.fullValue();
    hierarchyPropertyParser0.setSeperator(".");
    java.lang.String str6 = hierarchyPropertyParser0.fullValue();
    hierarchyPropertyParser0.goToRoot();
    boolean b8 = hierarchyPropertyParser0.isLeafReached();
    hierarchyPropertyParser0.build("", "null(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test216"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.fullValue();
    hierarchyPropertyParser0.setSeperator(".");
    java.lang.String[] str_array7 = hierarchyPropertyParser0.tokenize("");
    hierarchyPropertyParser0.goToRoot();
    boolean b9 = hierarchyPropertyParser0.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test217"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    boolean b4 = hierarchyPropertyParser0.goToChild("");
    hierarchyPropertyParser0.build("", "");
    boolean b9 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str10 = hierarchyPropertyParser0.getSeperator();
    hierarchyPropertyParser0.setSeperator("hi!");
    int i13 = hierarchyPropertyParser0.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "."+ "'", str10.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test218"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    boolean b6 = hierarchyPropertyParser0.isHierachic("hi!");
    int i7 = hierarchyPropertyParser0.depth();
    int i8 = hierarchyPropertyParser0.depth();
    hierarchyPropertyParser0.goToRoot();
    hierarchyPropertyParser0.add("null(0)[null]\n");
    java.lang.String str12 = hierarchyPropertyParser0.context();
    java.lang.String[] str_array13 = hierarchyPropertyParser0.childrenValues();
    java.lang.String str14 = hierarchyPropertyParser0.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "null(0)[null]\n"+ "'", str14.equals("null(0)[null]\n"));

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test219"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    int i3 = hierarchyPropertyParser0.getLevel();
    java.lang.String[] str_array5 = hierarchyPropertyParser0.tokenize("");
    boolean b6 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String str7 = hierarchyPropertyParser0.fullValue();
    java.lang.String str8 = hierarchyPropertyParser0.parentValue();
    java.lang.String[] str_array9 = hierarchyPropertyParser0.childrenValues();
    hierarchyPropertyParser0.add("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test220"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    boolean b6 = hierarchyPropertyParser0.isHierachic("hi!");
    int i7 = hierarchyPropertyParser0.depth();
    java.lang.String str8 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test221"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    hierarchyPropertyParser0.build("", "");
    int i6 = hierarchyPropertyParser0.numChildren();
    java.lang.String str7 = hierarchyPropertyParser0.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test222"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    boolean b4 = hierarchyPropertyParser0.contains("hi!");
    java.util.Vector vector5 = null;
    int i7 = hierarchyPropertyParser0.search(vector5, "hi!");
    java.lang.String str8 = hierarchyPropertyParser0.getValue();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser0.build("null(0)[null]\n", ".");
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test223"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    boolean b5 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String str6 = hierarchyPropertyParser0.fullValue();
    java.util.Vector vector7 = null;
    int i9 = hierarchyPropertyParser0.search(vector7, "");
    boolean b10 = hierarchyPropertyParser0.isLeafReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test224"); }


    // The following exception was thrown during execution in test generation
    try {
    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!(0)[null]\n", ".");
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test225"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    int i3 = hierarchyPropertyParser0.getLevel();
    boolean b5 = hierarchyPropertyParser0.contains("null(0)[null]\n(0)[null]\n");
    java.lang.String str6 = hierarchyPropertyParser0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test226"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    int i3 = hierarchyPropertyParser0.getLevel();
    java.lang.String[] str_array5 = hierarchyPropertyParser0.tokenize("");
    boolean b6 = hierarchyPropertyParser0.isLeafReached();
    boolean b7 = hierarchyPropertyParser0.isRootReached();
    hierarchyPropertyParser0.goToRoot();
    java.lang.String str9 = hierarchyPropertyParser0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test227"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.fullValue();
    java.lang.String str4 = hierarchyPropertyParser0.getSeperator();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser0.add(".");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "."+ "'", str4.equals("."));

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test228"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    boolean b4 = hierarchyPropertyParser0.isHierachic("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test229"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    hierarchyPropertyParser0.build("", "");
    int i6 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.build("", "hi!");
    boolean b11 = hierarchyPropertyParser0.goDown("");
    java.lang.String str12 = hierarchyPropertyParser0.getValue();
    java.lang.String str13 = hierarchyPropertyParser0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test230"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    boolean b6 = hierarchyPropertyParser0.isHierachic("hi!");
    int i7 = hierarchyPropertyParser0.depth();
    boolean b9 = hierarchyPropertyParser0.goDown("");
    java.lang.String str10 = hierarchyPropertyParser0.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test231"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    int i3 = hierarchyPropertyParser0.getLevel();
    java.lang.String[] str_array5 = hierarchyPropertyParser0.tokenize("");
    int i6 = hierarchyPropertyParser0.getLevel();
    boolean b7 = hierarchyPropertyParser0.isRootReached();
    boolean b9 = hierarchyPropertyParser0.goDown("hi!(0)[null]\n");
    boolean b11 = hierarchyPropertyParser0.goToChild("null(0)[null]\n(0)[null]\n");
    int i12 = hierarchyPropertyParser0.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test232"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    boolean b6 = hierarchyPropertyParser0.isHierachic("hi!");
    int i7 = hierarchyPropertyParser0.depth();
    int i8 = hierarchyPropertyParser0.depth();
    hierarchyPropertyParser0.goToRoot();
    hierarchyPropertyParser0.add("null(0)[null]\n");
    boolean b13 = hierarchyPropertyParser0.goDown("hi!");
    hierarchyPropertyParser0.goToRoot();
    boolean b16 = hierarchyPropertyParser0.goTo("");
    java.util.Vector vector17 = null;
    int i19 = hierarchyPropertyParser0.search(vector17, "");
    java.lang.String str20 = hierarchyPropertyParser0.getSeperator();
    boolean b21 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str22 = hierarchyPropertyParser0.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "."+ "'", str20.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test233"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    int i3 = hierarchyPropertyParser0.getLevel();
    hierarchyPropertyParser0.goToRoot();
    java.util.Vector vector5 = null;
    int i7 = hierarchyPropertyParser0.search(vector5, "null(0)[null]\n");
    java.lang.String str8 = hierarchyPropertyParser0.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test234"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    boolean b4 = hierarchyPropertyParser0.contains("hi!");
    java.util.Vector vector5 = null;
    int i7 = hierarchyPropertyParser0.search(vector5, "hi!");
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser0.search(vector8, "null(0)[null]\n");
    java.lang.String str11 = hierarchyPropertyParser0.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "."+ "'", str11.equals("."));

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test235"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    boolean b6 = hierarchyPropertyParser0.isHierachic("hi!");
    int i7 = hierarchyPropertyParser0.depth();
    boolean b9 = hierarchyPropertyParser0.goDown(".");
    boolean b11 = hierarchyPropertyParser0.goToChild("hi!");
    hierarchyPropertyParser0.add("null(0)[null]\n(0)[null]\n");
    boolean b14 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str15 = hierarchyPropertyParser0.context();
    java.lang.String str16 = hierarchyPropertyParser0.getValue();
    int i17 = hierarchyPropertyParser0.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "null(0)[null]\n(0)[null]\n"+ "'", str16.equals("null(0)[null]\n(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test236"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    boolean b5 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String[] str_array6 = hierarchyPropertyParser0.childrenValues();
    int i7 = hierarchyPropertyParser0.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test237"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    boolean b4 = hierarchyPropertyParser0.contains("hi!");
    hierarchyPropertyParser0.goToRoot();
    java.lang.String[] str_array7 = hierarchyPropertyParser0.tokenize("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test238"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    hierarchyPropertyParser0.build("", "");
    hierarchyPropertyParser0.build("hi!", "hi!");
    int i9 = hierarchyPropertyParser0.getLevel();
    hierarchyPropertyParser0.build("", "");
    java.lang.String str13 = hierarchyPropertyParser0.getValue();
    java.lang.String str14 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    java.lang.String str16 = hierarchyPropertyParser0.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "."+ "'", str16.equals("."));

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test239"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    boolean b6 = hierarchyPropertyParser0.isHierachic("hi!");
    int i7 = hierarchyPropertyParser0.depth();
    java.lang.String str8 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.setSeperator("");
    java.util.Vector vector11 = null;
    int i13 = hierarchyPropertyParser0.search(vector11, "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test240"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    int i3 = hierarchyPropertyParser0.getLevel();
    java.lang.String[] str_array5 = hierarchyPropertyParser0.tokenize("");
    int i6 = hierarchyPropertyParser0.getLevel();
    boolean b7 = hierarchyPropertyParser0.isRootReached();
    boolean b9 = hierarchyPropertyParser0.goDown("hi!(0)[null]\n");
    java.lang.String str10 = hierarchyPropertyParser0.context();
    boolean b12 = hierarchyPropertyParser0.goDown("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test241"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    int i3 = hierarchyPropertyParser0.getLevel();
    java.lang.String[] str_array5 = hierarchyPropertyParser0.tokenize("");
    int i6 = hierarchyPropertyParser0.getLevel();
    boolean b7 = hierarchyPropertyParser0.isRootReached();
    boolean b9 = hierarchyPropertyParser0.goDown("hi!(0)[null]\n");
    boolean b11 = hierarchyPropertyParser0.goToChild("null(0)[null]\n(0)[null]\n");
    java.lang.String[] str_array13 = hierarchyPropertyParser0.tokenize(".");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test242"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    boolean b6 = hierarchyPropertyParser0.isHierachic("hi!");
    hierarchyPropertyParser0.add("null(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test243"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    hierarchyPropertyParser0.build("", "");
    int i6 = hierarchyPropertyParser0.getLevel();
    java.lang.String[] str_array7 = hierarchyPropertyParser0.childrenValues();
    java.lang.String str8 = hierarchyPropertyParser0.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "."+ "'", str8.equals("."));

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test244"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    java.lang.String[] str_array4 = hierarchyPropertyParser2.tokenize("");
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.setSeperator("hi!");
    java.lang.String str8 = hierarchyPropertyParser2.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test245"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    boolean b5 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String[] str_array7 = hierarchyPropertyParser0.tokenize(".");
    java.lang.String str8 = hierarchyPropertyParser0.context();
    java.util.Vector vector9 = null;
    int i11 = hierarchyPropertyParser0.search(vector9, "null(0)[null]\n(0)[null]\n");
    java.lang.String str12 = hierarchyPropertyParser0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test246"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    boolean b6 = hierarchyPropertyParser0.isHierachic("hi!");
    int i7 = hierarchyPropertyParser0.depth();
    int i8 = hierarchyPropertyParser0.depth();
    hierarchyPropertyParser0.goToRoot();
    hierarchyPropertyParser0.add("null(0)[null]\n");
    boolean b13 = hierarchyPropertyParser0.goDown("hi!");
    hierarchyPropertyParser0.goToRoot();
    boolean b16 = hierarchyPropertyParser0.goTo("");
    java.util.Vector vector17 = null;
    int i19 = hierarchyPropertyParser0.search(vector17, "");
    java.lang.String str20 = hierarchyPropertyParser0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "null(0)[null]\n"+ "'", str20.equals("null(0)[null]\n"));

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test247"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    java.lang.String str3 = hierarchyPropertyParser2.getValue();
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n");
    java.lang.String[] str_array6 = hierarchyPropertyParser2.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test248"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    boolean b4 = hierarchyPropertyParser0.goToChild("");
    hierarchyPropertyParser0.build("", "");
    boolean b8 = hierarchyPropertyParser0.isRootReached();
    int i9 = hierarchyPropertyParser0.getLevel();
    java.lang.String[] str_array10 = hierarchyPropertyParser0.childrenValues();
    boolean b12 = hierarchyPropertyParser0.goTo("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test249"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    boolean b6 = hierarchyPropertyParser0.isHierachic("hi!");
    java.lang.String str7 = hierarchyPropertyParser0.getSeperator();
    java.lang.String str8 = hierarchyPropertyParser0.showTree();
    java.lang.String str9 = hierarchyPropertyParser0.parentValue();
    java.lang.String str10 = hierarchyPropertyParser0.showTree();
    boolean b11 = hierarchyPropertyParser0.isLeafReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "."+ "'", str7.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null(0)[null]\n"+ "'", str8.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test250"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    hierarchyPropertyParser0.build("", "");
    hierarchyPropertyParser0.build("hi!", "hi!");
    int i9 = hierarchyPropertyParser0.getLevel();
    hierarchyPropertyParser0.build("", "");
    int i13 = hierarchyPropertyParser0.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test251"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    boolean b5 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String str6 = hierarchyPropertyParser0.fullValue();
    boolean b7 = hierarchyPropertyParser0.isRootReached();
    boolean b9 = hierarchyPropertyParser0.isHierachic(".");
    int i10 = hierarchyPropertyParser0.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test252"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("");
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    boolean b6 = hierarchyPropertyParser0.isHierachic("hi!");
    java.lang.String str7 = hierarchyPropertyParser0.getSeperator();
    java.lang.String str8 = hierarchyPropertyParser0.getValue();
    java.lang.String str9 = hierarchyPropertyParser0.getValue();
    java.util.Vector vector10 = null;
    int i12 = hierarchyPropertyParser0.search(vector10, "null(0)[null]\n(0)[null]\n");
    int i13 = hierarchyPropertyParser0.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "."+ "'", str7.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test253"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.add("hi!");
    boolean b4 = hierarchyPropertyParser0.contains("hi!");
    boolean b6 = hierarchyPropertyParser0.isHierachic("hi!");
    java.lang.String[] str_array7 = hierarchyPropertyParser0.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array7);

  }

}
