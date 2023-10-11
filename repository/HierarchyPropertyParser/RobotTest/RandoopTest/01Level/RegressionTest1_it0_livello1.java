
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test001"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    // The following exception was thrown during execution in test generation
    try {
    boolean b8 = hierarchyPropertyParser2.contains("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test002"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    java.lang.String str6 = hierarchyPropertyParser2.parentValue();
    hierarchyPropertyParser2.goToParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test003"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    hierarchyPropertyParser2.build("hi!", "hi!");
    int i6 = hierarchyPropertyParser2.numChildren();
    java.util.Vector vector7 = null;
    int i9 = hierarchyPropertyParser2.search(vector7, "hi!");
    boolean b11 = hierarchyPropertyParser2.isHierachic(".");
    int i12 = hierarchyPropertyParser2.numChildren();
    java.lang.String[] str_array13 = hierarchyPropertyParser2.childrenValues();
    // The following exception was thrown during execution in test generation
    try {
    boolean b15 = hierarchyPropertyParser2.goTo("null(0)[null]\n(0)[null]\n");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test004"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str4 = hierarchyPropertyParser2.getValue();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    java.lang.String[] str_array7 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String str8 = hierarchyPropertyParser2.showTree();
    java.lang.String str9 = hierarchyPropertyParser2.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null(0)[null]\n"+ "'", str8.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "."+ "'", str9.equals("."));

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test005"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str5 = hierarchyPropertyParser2.parentValue();
    boolean b7 = hierarchyPropertyParser2.goDown("null(0)[null]\n");
    java.lang.String str8 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n(0)[null]\n");
    int i11 = hierarchyPropertyParser2.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null(0)[null]\n"+ "'", str8.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test006"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str6 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array8 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    boolean b10 = hierarchyPropertyParser2.goToChild("hi!");
    java.lang.String str11 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str12 = hierarchyPropertyParser2.parentValue();
    hierarchyPropertyParser2.add("null(0)[null]\n(0)[null]\n");
    boolean b16 = hierarchyPropertyParser2.contains("hi!");
    java.lang.String str17 = hierarchyPropertyParser2.fullValue();
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
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "."+ "'", str11.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "null(0)[null]\n(0)[null]\n"+ "'", str17.equals("null(0)[null]\n(0)[null]\n"));

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test007"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.build("", ".");
    int i6 = hierarchyPropertyParser2.getLevel();
    boolean b8 = hierarchyPropertyParser2.isHierachic("");
    hierarchyPropertyParser2.goToRoot();
    boolean b10 = hierarchyPropertyParser2.isRootReached();
    boolean b12 = hierarchyPropertyParser2.goToChild("");
    int i13 = hierarchyPropertyParser2.getLevel();
    boolean b14 = hierarchyPropertyParser2.isLeafReached();
    int i15 = hierarchyPropertyParser2.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test008"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    int i4 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToRoot();
    boolean b7 = hierarchyPropertyParser2.isHierachic(".");
    boolean b8 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.childrenValues();
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    java.lang.String str11 = hierarchyPropertyParser2.showTree();
    boolean b12 = hierarchyPropertyParser2.isLeafReached();
    boolean b14 = hierarchyPropertyParser2.contains("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null(0)[null]\n"+ "'", str11.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test009"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    int i4 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array7 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.build("hi!", "hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test010"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    boolean b7 = hierarchyPropertyParser2.goDown(".");
    java.lang.String str8 = hierarchyPropertyParser2.context();
    java.lang.String str9 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.setSeperator("hi!(0)[null]\n");
    // The following exception was thrown during execution in test generation
    try {
    boolean b13 = hierarchyPropertyParser2.contains("null(0)[null]\n");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "."+ "'", str9.equals("."));

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test011"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n");
    java.lang.String[] str_array9 = hierarchyPropertyParser2.tokenize("hi!");
    boolean b11 = hierarchyPropertyParser2.isHierachic("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test012"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.build("", ".");
    int i6 = hierarchyPropertyParser2.getLevel();
    boolean b8 = hierarchyPropertyParser2.isHierachic("");
    boolean b9 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    java.lang.String str11 = hierarchyPropertyParser2.parentValue();
    java.lang.String str12 = hierarchyPropertyParser2.getValue();
    int i13 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test013"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.goToRoot();
    int i5 = hierarchyPropertyParser2.depth();
    int i6 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str9 = hierarchyPropertyParser2.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test014"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    boolean b5 = hierarchyPropertyParser2.goDown("hi!");
    java.lang.String[] str_array6 = hierarchyPropertyParser2.childrenValues();
    java.lang.String str7 = hierarchyPropertyParser2.getValue();
    hierarchyPropertyParser2.add("hi!");
    java.lang.String str10 = hierarchyPropertyParser2.getValue();
    java.util.Vector vector11 = null;
    int i13 = hierarchyPropertyParser2.search(vector11, "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test015"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isRootReached();
    boolean b5 = hierarchyPropertyParser2.isHierachic("");
    int i6 = hierarchyPropertyParser2.numChildren();
    boolean b7 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str8 = hierarchyPropertyParser2.showTree();
    java.lang.String str9 = hierarchyPropertyParser2.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null(0)[null]\n"+ "'", str8.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test016"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    boolean b8 = hierarchyPropertyParser2.goToChild("");
    java.lang.String[] str_array9 = hierarchyPropertyParser2.childrenValues();
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
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test017"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str7 = hierarchyPropertyParser2.showTree();
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser2.search(vector8, "hi!");
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str12 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.build("", "hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null(0)[null]\n"+ "'", str7.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null(0)[null]\n"+ "'", str12.equals("null(0)[null]\n"));

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test018"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    java.util.Vector vector6 = null;
    int i8 = hierarchyPropertyParser2.search(vector6, ".");
    boolean b10 = hierarchyPropertyParser2.goToChild("");
    int i11 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n");
    java.lang.String str14 = hierarchyPropertyParser2.getValue();
    boolean b15 = hierarchyPropertyParser2.isLeafReached();
    int i16 = hierarchyPropertyParser2.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test019"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("hi!");
    boolean b7 = hierarchyPropertyParser2.isRootReached();
    int i8 = hierarchyPropertyParser2.depth();
    java.lang.String str9 = hierarchyPropertyParser2.parentValue();
    boolean b11 = hierarchyPropertyParser2.isHierachic("hi!");
    java.lang.String str12 = hierarchyPropertyParser2.context();
    java.lang.String str13 = hierarchyPropertyParser2.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test020"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    int i4 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToRoot();
    boolean b7 = hierarchyPropertyParser2.isHierachic(".");
    boolean b8 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str9 = hierarchyPropertyParser2.parentValue();
    boolean b11 = hierarchyPropertyParser2.goDown(".");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str13 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.setSeperator(".");
    java.lang.String str16 = hierarchyPropertyParser2.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null(0)[null]\n"+ "'", str13.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test021"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String[] str_array4 = hierarchyPropertyParser2.childrenValues();
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test022"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str7 = hierarchyPropertyParser2.showTree();
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser2.search(vector8, "hi!");
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str12 = hierarchyPropertyParser2.parentValue();
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array14 = hierarchyPropertyParser2.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null(0)[null]\n"+ "'", str7.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test023"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    int i6 = hierarchyPropertyParser2.getLevel();
    boolean b8 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str10 = hierarchyPropertyParser2.getValue();
    hierarchyPropertyParser2.build("null(0)[null]\n", "hi!(0)[null]\n");
    boolean b14 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str16 = hierarchyPropertyParser2.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "."+ "'", str16.equals("."));

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test024"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    boolean b7 = hierarchyPropertyParser2.goToChild("hi!");
    hierarchyPropertyParser2.goToParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test025"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.build("", ".");
    int i6 = hierarchyPropertyParser2.getLevel();
    boolean b8 = hierarchyPropertyParser2.isHierachic("");
    hierarchyPropertyParser2.goToRoot();
    boolean b10 = hierarchyPropertyParser2.isRootReached();
    boolean b12 = hierarchyPropertyParser2.goToChild("");
    java.lang.String str13 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str15 = hierarchyPropertyParser2.showTree();
    boolean b17 = hierarchyPropertyParser2.goToChild("null(0)[null]\n(0)[null]\n");
    java.lang.String[] str_array19 = hierarchyPropertyParser2.tokenize("null(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null(0)[null]\n"+ "'", str13.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "null(0)[null]\n"+ "'", str15.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test026"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    boolean b5 = hierarchyPropertyParser2.goDown("hi!");
    int i6 = hierarchyPropertyParser2.depth();
    java.lang.String str7 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str9 = hierarchyPropertyParser2.fullValue();
    boolean b11 = hierarchyPropertyParser2.contains("hi!");
    int i12 = hierarchyPropertyParser2.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test027"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str6 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.goToRoot();
    int i9 = hierarchyPropertyParser2.numChildren();
    boolean b11 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n");
    java.lang.String str12 = hierarchyPropertyParser2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "."+ "'", str6.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test028"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    int i4 = hierarchyPropertyParser2.numChildren();
    java.lang.String str5 = hierarchyPropertyParser2.getValue();
    int i6 = hierarchyPropertyParser2.depth();
    java.lang.String str7 = hierarchyPropertyParser2.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null(0)[null]\n"+ "'", str7.equals("null(0)[null]\n"));

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test029"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str7 = hierarchyPropertyParser2.showTree();
    boolean b9 = hierarchyPropertyParser2.goToChild("");
    boolean b10 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str11 = hierarchyPropertyParser2.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null(0)[null]\n"+ "'", str7.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test030"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str6 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.add("hi!");
    java.lang.String str11 = hierarchyPropertyParser2.fullValue();
    boolean b13 = hierarchyPropertyParser2.goTo("null(0)[null]\n");
    java.lang.String str14 = hierarchyPropertyParser2.parentValue();
    java.lang.String str15 = hierarchyPropertyParser2.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "."+ "'", str6.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "."+ "'", str15.equals("."));

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test031"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    int i4 = hierarchyPropertyParser2.numChildren();
    int i5 = hierarchyPropertyParser2.getLevel();
    int i6 = hierarchyPropertyParser2.getLevel();
    java.lang.String[] str_array8 = hierarchyPropertyParser2.tokenize("");
    java.lang.String str9 = hierarchyPropertyParser2.fullValue();
    java.lang.String str10 = hierarchyPropertyParser2.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test032"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToRoot();
    boolean b8 = hierarchyPropertyParser2.contains("hi!");
    boolean b10 = hierarchyPropertyParser2.contains("hi!");
    int i11 = hierarchyPropertyParser2.numChildren();
    boolean b13 = hierarchyPropertyParser2.goDown("null(0)[null]\n");
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
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test033"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    boolean b5 = hierarchyPropertyParser2.goDown("hi!");
    int i6 = hierarchyPropertyParser2.depth();
    boolean b8 = hierarchyPropertyParser2.goDown("null(0)[null]\n(0)[null]\n");
    java.lang.String str9 = hierarchyPropertyParser2.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test034"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    int i4 = hierarchyPropertyParser2.numChildren();
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
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test035"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    int i6 = hierarchyPropertyParser2.getLevel();
    boolean b8 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str10 = hierarchyPropertyParser2.getValue();
    boolean b12 = hierarchyPropertyParser2.goDown("");
    int i13 = hierarchyPropertyParser2.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test036"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.setSeperator(".");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "hi!");
    hierarchyPropertyParser0.goToRoot();
    boolean b8 = hierarchyPropertyParser0.isHierachic(".");
    boolean b10 = hierarchyPropertyParser0.isHierachic("hi!");
    java.lang.String[] str_array12 = hierarchyPropertyParser0.tokenize("null(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test037"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    boolean b7 = hierarchyPropertyParser2.goDown(".");
    int i8 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.goToParent();
    boolean b11 = hierarchyPropertyParser2.contains("hi!(0)[null]\n");
    boolean b12 = hierarchyPropertyParser2.isRootReached();
    hierarchyPropertyParser2.setSeperator("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test038"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str6 = hierarchyPropertyParser2.context();
    int i7 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.build("hi!", "hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test039"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    int i4 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToRoot();
    boolean b7 = hierarchyPropertyParser2.isHierachic(".");
    boolean b8 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str9 = hierarchyPropertyParser2.parentValue();
    boolean b11 = hierarchyPropertyParser2.goDown(".");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str13 = hierarchyPropertyParser2.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "."+ "'", str13.equals("."));

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test040"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String[] str_array4 = hierarchyPropertyParser2.childrenValues();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.childrenValues();
    boolean b6 = hierarchyPropertyParser2.isRootReached();
    boolean b7 = hierarchyPropertyParser2.isRootReached();
    boolean b8 = hierarchyPropertyParser2.isLeafReached();
    boolean b10 = hierarchyPropertyParser2.goToChild(".");
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser2.goToChild((int)(short)10);
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
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test041"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str6 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.goToRoot();
    int i9 = hierarchyPropertyParser2.numChildren();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "."+ "'", str6.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test042"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str5 = hierarchyPropertyParser2.parentValue();
    boolean b7 = hierarchyPropertyParser2.goDown("null(0)[null]\n");
    java.lang.String str8 = hierarchyPropertyParser2.showTree();
    java.lang.String str9 = hierarchyPropertyParser2.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null(0)[null]\n"+ "'", str8.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test043"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str7 = hierarchyPropertyParser2.showTree();
    boolean b9 = hierarchyPropertyParser2.goToChild("");
    boolean b10 = hierarchyPropertyParser2.isRootReached();
    boolean b11 = hierarchyPropertyParser2.isRootReached();
    int i12 = hierarchyPropertyParser2.depth();
    java.lang.String str13 = hierarchyPropertyParser2.parentValue();
    hierarchyPropertyParser2.setSeperator(".");
    java.util.Vector vector16 = null;
    int i18 = hierarchyPropertyParser2.search(vector16, "hi!");
    hierarchyPropertyParser2.setSeperator("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null(0)[null]\n"+ "'", str7.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-1));

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test044"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.goToRoot();
    int i5 = hierarchyPropertyParser2.depth();
    int i6 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str9 = hierarchyPropertyParser2.context();
    boolean b11 = hierarchyPropertyParser2.goDown(".");
    java.lang.String str12 = hierarchyPropertyParser2.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test045"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    boolean b7 = hierarchyPropertyParser2.isHierachic("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test046"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String str7 = hierarchyPropertyParser2.showTree();
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser2.search(vector8, "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null(0)[null]\n"+ "'", str7.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test047"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    boolean b9 = hierarchyPropertyParser2.isHierachic("hi!");
    java.util.Vector vector10 = null;
    int i12 = hierarchyPropertyParser2.search(vector10, "null(0)[null]\n");
    java.lang.String[] str_array14 = hierarchyPropertyParser2.tokenize(".");
    java.lang.String str15 = hierarchyPropertyParser2.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "null(0)[null]\n"+ "'", str15.equals("null(0)[null]\n"));

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test048"); }


    // The following exception was thrown during execution in test generation
    try {
    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "null(0)[null]\n(0)[null]\n");
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test049"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str7 = hierarchyPropertyParser2.showTree();
    boolean b9 = hierarchyPropertyParser2.goToChild("");
    boolean b10 = hierarchyPropertyParser2.isRootReached();
    boolean b11 = hierarchyPropertyParser2.isLeafReached();
    java.util.Vector vector12 = null;
    int i14 = hierarchyPropertyParser2.search(vector12, "null(0)[null]\n");
    java.lang.String str15 = hierarchyPropertyParser2.getValue();
    boolean b17 = hierarchyPropertyParser2.goDown("hi!");
    int i18 = hierarchyPropertyParser2.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null(0)[null]\n"+ "'", str7.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test050"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToRoot();
    boolean b8 = hierarchyPropertyParser2.contains("hi!");
    boolean b10 = hierarchyPropertyParser2.contains("hi!");
    java.lang.String[] str_array11 = hierarchyPropertyParser2.childrenValues();
    int i12 = hierarchyPropertyParser2.getLevel();
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
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test051"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.setSeperator(".");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "hi!");
    java.lang.String[] str_array7 = hierarchyPropertyParser0.tokenize("null(0)[null]\n");
    boolean b8 = hierarchyPropertyParser0.isRootReached();
    boolean b9 = hierarchyPropertyParser0.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test052"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    java.lang.String str3 = hierarchyPropertyParser2.parentValue();
    boolean b4 = hierarchyPropertyParser2.isRootReached();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("null(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test053"); }


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
    hierarchyPropertyParser2.build("null(0)[null]\n", "hi!(0)[null]\n");
    int i17 = hierarchyPropertyParser2.depth();
    java.lang.String str18 = hierarchyPropertyParser2.getSeperator();
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
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "."+ "'", str9.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "."+ "'", str18.equals("."));

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test054"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    int i4 = hierarchyPropertyParser2.numChildren();
    int i5 = hierarchyPropertyParser2.getLevel();
    int i6 = hierarchyPropertyParser2.depth();
    int i7 = hierarchyPropertyParser2.getLevel();
    int i8 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test055"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String[] str_array4 = hierarchyPropertyParser2.childrenValues();
    boolean b6 = hierarchyPropertyParser2.isHierachic("hi!");
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test056"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.add("hi!");
    java.lang.String[] str_array5 = hierarchyPropertyParser2.childrenValues();
    hierarchyPropertyParser2.goToRoot();
    java.util.Vector vector7 = null;
    int i9 = hierarchyPropertyParser2.search(vector7, "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test057"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    int i7 = hierarchyPropertyParser2.getLevel();
    int i8 = hierarchyPropertyParser2.depth();
    java.lang.String str9 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    java.lang.String str11 = hierarchyPropertyParser2.getSeperator();
    int i12 = hierarchyPropertyParser2.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "."+ "'", str9.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "."+ "'", str11.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test058"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    boolean b7 = hierarchyPropertyParser2.contains("hi!");
    java.lang.String str8 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str9 = hierarchyPropertyParser2.getValue();
    java.lang.String str10 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str11 = hierarchyPropertyParser2.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "."+ "'", str8.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "."+ "'", str10.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test059"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array7 = hierarchyPropertyParser2.childrenValues();
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser2.search(vector8, "");
    int i11 = hierarchyPropertyParser2.numChildren();
    // The following exception was thrown during execution in test generation
    try {
    boolean b13 = hierarchyPropertyParser2.goTo("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test060"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser(".", ".");
    // The following exception was thrown during execution in test generation
    try {
    boolean b4 = hierarchyPropertyParser2.contains("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test061"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    boolean b9 = hierarchyPropertyParser2.goDown("null(0)[null]\n");
    int i10 = hierarchyPropertyParser2.depth();
    boolean b12 = hierarchyPropertyParser2.contains("hi!");
    hierarchyPropertyParser2.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test062"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array7 = hierarchyPropertyParser2.childrenValues();
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser2.search(vector8, "");
    int i11 = hierarchyPropertyParser2.numChildren();
    java.util.Vector vector12 = null;
    int i14 = hierarchyPropertyParser2.search(vector12, "hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test063"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    boolean b6 = hierarchyPropertyParser2.goDown(".");
    boolean b7 = hierarchyPropertyParser2.isRootReached();
    int i8 = hierarchyPropertyParser2.numChildren();
    java.lang.String str9 = hierarchyPropertyParser2.getValue();
    hierarchyPropertyParser2.goToRoot();
    java.util.Vector vector11 = null;
    int i13 = hierarchyPropertyParser2.search(vector11, "hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test064"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.add("hi!");
    java.lang.String[] str_array5 = hierarchyPropertyParser2.childrenValues();
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
    org.junit.Assert.assertNull(str_array5);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test065"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n(0)[null]\n", "hi!(0)[null]\n");

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test066"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!(0)[null]\n");
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser2.build("null(0)[null]\n", "");
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test067"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.build("", ".");
    int i6 = hierarchyPropertyParser2.getLevel();
    java.lang.String[] str_array7 = hierarchyPropertyParser2.childrenValues();
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String[] str_array10 = hierarchyPropertyParser2.childrenValues();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser2.build(".", "hi!");
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
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test068"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    int i7 = hierarchyPropertyParser2.getLevel();
    int i8 = hierarchyPropertyParser2.depth();
    java.lang.String str9 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str10 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "."+ "'", str9.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test069"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    java.lang.String str6 = hierarchyPropertyParser2.parentValue();
    java.lang.String[] str_array7 = hierarchyPropertyParser2.childrenValues();
    int i8 = hierarchyPropertyParser2.depth();
    java.lang.String str9 = hierarchyPropertyParser2.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "."+ "'", str9.equals("."));

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test070"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    boolean b6 = hierarchyPropertyParser2.goDown(".");
    boolean b8 = hierarchyPropertyParser2.goToChild("");
    hierarchyPropertyParser2.setSeperator("hi!");
    java.lang.String str11 = hierarchyPropertyParser2.getSeperator();
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
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test071"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    boolean b9 = hierarchyPropertyParser2.isHierachic("hi!");
    java.util.Vector vector10 = null;
    int i12 = hierarchyPropertyParser2.search(vector10, "null(0)[null]\n");
    java.lang.String[] str_array14 = hierarchyPropertyParser2.tokenize(".");
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
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test072"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.add("hi!");
    java.lang.String[] str_array5 = hierarchyPropertyParser2.childrenValues();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str7 = hierarchyPropertyParser2.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!(0)[null]\n"+ "'", str7.equals("hi!(0)[null]\n"));

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test073"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.setSeperator(".");
    java.lang.String str3 = hierarchyPropertyParser0.getSeperator();
    boolean b4 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String[] str_array6 = hierarchyPropertyParser0.tokenize("hi!");
    java.lang.String[] str_array7 = hierarchyPropertyParser0.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "."+ "'", str3.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test074"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.goToParent();
    boolean b7 = hierarchyPropertyParser2.goToChild("");
    boolean b8 = hierarchyPropertyParser2.isRootReached();
    int i9 = hierarchyPropertyParser2.depth();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize(".");
    java.lang.String str12 = hierarchyPropertyParser2.parentValue();
    boolean b14 = hierarchyPropertyParser2.goDown("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test075"); }


    // The following exception was thrown during execution in test generation
    try {
    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser(".", "null(0)[null]\n(0)[null]\n");
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test076"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.build("", ".");
    int i6 = hierarchyPropertyParser2.getLevel();
    boolean b8 = hierarchyPropertyParser2.isHierachic("");
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.goToRoot();
    boolean b12 = hierarchyPropertyParser2.goToChild("");
    java.lang.String str13 = hierarchyPropertyParser2.fullValue();
    java.lang.String[] str_array14 = hierarchyPropertyParser2.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test077"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.setSeperator("hi!");
    java.lang.String str8 = hierarchyPropertyParser2.fullValue();
    java.util.Vector vector9 = null;
    int i11 = hierarchyPropertyParser2.search(vector9, "");
    boolean b13 = hierarchyPropertyParser2.isHierachic("");
    int i14 = hierarchyPropertyParser2.depth();
    // The following exception was thrown during execution in test generation
    try {
    boolean b16 = hierarchyPropertyParser2.goTo("");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test078"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    java.lang.String str6 = hierarchyPropertyParser2.parentValue();
    java.lang.String[] str_array7 = hierarchyPropertyParser2.childrenValues();
    boolean b9 = hierarchyPropertyParser2.isHierachic("");
    java.lang.String[] str_array10 = hierarchyPropertyParser2.childrenValues();
    boolean b11 = hierarchyPropertyParser2.isRootReached();
    hierarchyPropertyParser2.build("", "null(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test079"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.goToParent();
    int i7 = hierarchyPropertyParser2.depth();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.tokenize("hi!(0)[null]\n");
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser2.build("hi!(0)[null]\n", "null(0)[null]\n(0)[null]\n");
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
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test080"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    int i8 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.add("hi!(0)[null]\n");
    java.lang.String str11 = hierarchyPropertyParser2.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!(0)[null]\n"+ "'", str11.equals("hi!(0)[null]\n"));

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test081"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str6 = hierarchyPropertyParser2.getSeperator();
    boolean b7 = hierarchyPropertyParser2.isRootReached();
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
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "."+ "'", str6.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test082"); }


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
    java.lang.String str13 = hierarchyPropertyParser2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test083"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    boolean b6 = hierarchyPropertyParser2.goDown(".");
    boolean b7 = hierarchyPropertyParser2.isRootReached();
    int i8 = hierarchyPropertyParser2.numChildren();
    boolean b9 = hierarchyPropertyParser2.isRootReached();
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n");
    boolean b13 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n(0)[null]\n");
    java.lang.String str14 = hierarchyPropertyParser2.parentValue();
    java.util.Vector vector15 = null;
    int i17 = hierarchyPropertyParser2.search(vector15, ".");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test084"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    int i4 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToRoot();
    boolean b7 = hierarchyPropertyParser2.isHierachic(".");
    boolean b8 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.childrenValues();
    java.lang.String str10 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array12 = hierarchyPropertyParser2.tokenize("hi!(0)[null]\n");
    int i13 = hierarchyPropertyParser2.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test085"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    int i6 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("hi!");
    java.lang.String str10 = hierarchyPropertyParser2.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test086"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.build("", ".");
    int i6 = hierarchyPropertyParser2.getLevel();
    boolean b8 = hierarchyPropertyParser2.isHierachic("");
    hierarchyPropertyParser2.goToRoot();
    boolean b10 = hierarchyPropertyParser2.isRootReached();
    boolean b12 = hierarchyPropertyParser2.goToChild("");
    hierarchyPropertyParser2.goToParent();
    boolean b15 = hierarchyPropertyParser2.goToChild("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test087"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b4 = hierarchyPropertyParser2.goToChild("");
    boolean b6 = hierarchyPropertyParser2.goToChild("");
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test088"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.build("", ".");
    int i6 = hierarchyPropertyParser2.getLevel();
    boolean b8 = hierarchyPropertyParser2.isHierachic("");
    boolean b9 = hierarchyPropertyParser2.isLeafReached();
    boolean b10 = hierarchyPropertyParser2.isRootReached();
    boolean b11 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.setSeperator("hi!");
    java.lang.String str14 = hierarchyPropertyParser2.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test089"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    int i6 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.goToRoot();
    boolean b8 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.add("hi!");
    int i11 = hierarchyPropertyParser2.numChildren();
    java.lang.String str12 = hierarchyPropertyParser2.parentValue();
    int i13 = hierarchyPropertyParser2.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test090"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser0.build("hi!(0)[null]\n", ".");
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test091"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String str5 = hierarchyPropertyParser2.getValue();
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
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test092"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToRoot();
    boolean b7 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str8 = hierarchyPropertyParser2.parentValue();
    java.lang.String str9 = hierarchyPropertyParser2.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test093"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String[] str_array4 = hierarchyPropertyParser2.childrenValues();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.childrenValues();
    hierarchyPropertyParser2.setSeperator("hi!(0)[null]\n");
    java.lang.String str8 = hierarchyPropertyParser2.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test094"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.childrenValues();
    hierarchyPropertyParser2.setSeperator("hi!");
    boolean b9 = hierarchyPropertyParser2.goToChild("hi!(0)[null]\n");
    hierarchyPropertyParser2.goToRoot();
    int i11 = hierarchyPropertyParser2.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test095"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    boolean b6 = hierarchyPropertyParser2.goDown(".");
    boolean b7 = hierarchyPropertyParser2.isRootReached();
    int i8 = hierarchyPropertyParser2.numChildren();
    java.lang.String str9 = hierarchyPropertyParser2.getValue();
    java.lang.String str10 = hierarchyPropertyParser2.parentValue();
    java.lang.String[] str_array12 = hierarchyPropertyParser2.tokenize(".");
    boolean b14 = hierarchyPropertyParser2.isHierachic("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test096"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("hi!");
    boolean b7 = hierarchyPropertyParser2.isRootReached();
    int i8 = hierarchyPropertyParser2.depth();
    java.lang.String str9 = hierarchyPropertyParser2.parentValue();
    boolean b11 = hierarchyPropertyParser2.isHierachic("hi!");
    java.lang.String[] str_array13 = hierarchyPropertyParser2.tokenize("hi!(0)[null]\n");
    hierarchyPropertyParser2.add("null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test097"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str7 = hierarchyPropertyParser2.showTree();
    boolean b9 = hierarchyPropertyParser2.goToChild("");
    java.util.Vector vector10 = null;
    int i12 = hierarchyPropertyParser2.search(vector10, "");
    int i13 = hierarchyPropertyParser2.numChildren();
    java.lang.String str14 = hierarchyPropertyParser2.getValue();
    int i15 = hierarchyPropertyParser2.getLevel();
    java.lang.String str16 = hierarchyPropertyParser2.parentValue();
    boolean b18 = hierarchyPropertyParser2.isHierachic("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null(0)[null]\n"+ "'", str7.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test098"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str7 = hierarchyPropertyParser2.showTree();
    boolean b9 = hierarchyPropertyParser2.goToChild("");
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    boolean b12 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str13 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null(0)[null]\n"+ "'", str7.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null(0)[null]\n"+ "'", str13.equals("null(0)[null]\n"));

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test099"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.build("", ".");
    int i6 = hierarchyPropertyParser2.getLevel();
    boolean b8 = hierarchyPropertyParser2.isHierachic("");
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.goToRoot();
    boolean b12 = hierarchyPropertyParser2.goToChild("");
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
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test100"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!(0)[null]\n");
    int i3 = hierarchyPropertyParser2.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test101"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.setSeperator("hi!");
    java.lang.String str8 = hierarchyPropertyParser2.fullValue();
    java.util.Vector vector9 = null;
    int i11 = hierarchyPropertyParser2.search(vector9, "");
    boolean b13 = hierarchyPropertyParser2.isHierachic("");
    int i14 = hierarchyPropertyParser2.depth();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser2.build("hi!(0)[null]\n", "hi!");
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
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test102"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("hi!");
    int i7 = hierarchyPropertyParser2.depth();
    boolean b9 = hierarchyPropertyParser2.isHierachic("hi!(0)[null]\n");
    hierarchyPropertyParser2.goToParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test103"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    int i4 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToRoot();
    boolean b7 = hierarchyPropertyParser2.isHierachic(".");
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser2.search(vector8, ".");
    java.lang.String[] str_array11 = hierarchyPropertyParser2.childrenValues();
    boolean b12 = hierarchyPropertyParser2.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test104"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    int i6 = hierarchyPropertyParser2.getLevel();
    java.lang.String str7 = hierarchyPropertyParser2.getValue();
    java.lang.String str8 = hierarchyPropertyParser2.getValue();
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
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test105"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    boolean b5 = hierarchyPropertyParser2.goDown("hi!");
    int i6 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.setSeperator(".");
    java.lang.String str9 = hierarchyPropertyParser2.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null(0)[null]\n"+ "'", str9.equals("null(0)[null]\n"));

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test106"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array4 = hierarchyPropertyParser2.childrenValues();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test107"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n");
    int i7 = hierarchyPropertyParser2.numChildren();
    java.lang.String str8 = hierarchyPropertyParser2.context();
    boolean b9 = hierarchyPropertyParser2.isLeafReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test108"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToRoot();
    boolean b7 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str8 = hierarchyPropertyParser2.fullValue();
    int i9 = hierarchyPropertyParser2.numChildren();
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    java.lang.String str11 = hierarchyPropertyParser2.getValue();
    java.util.Vector vector12 = null;
    int i14 = hierarchyPropertyParser2.search(vector12, "null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test109"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("hi!");
    boolean b7 = hierarchyPropertyParser2.isRootReached();
    boolean b9 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n");
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize(".");
    boolean b13 = hierarchyPropertyParser2.contains("hi!");
    boolean b14 = hierarchyPropertyParser2.isLeafReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test110"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    int i5 = hierarchyPropertyParser2.getLevel();
    int i6 = hierarchyPropertyParser2.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test111"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    int i4 = hierarchyPropertyParser2.numChildren();
    int i5 = hierarchyPropertyParser2.getLevel();
    int i6 = hierarchyPropertyParser2.depth();
    int i7 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n");
    hierarchyPropertyParser2.goToParent();
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
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test112"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    int i7 = hierarchyPropertyParser2.getLevel();
    // The following exception was thrown during execution in test generation
    try {
    boolean b9 = hierarchyPropertyParser2.contains(".");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test113"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getValue();
    java.lang.String[] str_array7 = hierarchyPropertyParser2.tokenize("");
    int i8 = hierarchyPropertyParser2.numChildren();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser2.build("null(0)[null]\n", "");
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
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test114"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("hi!");
    boolean b7 = hierarchyPropertyParser2.isRootReached();
    boolean b9 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n");
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize(".");
    boolean b13 = hierarchyPropertyParser2.contains("hi!");
    boolean b15 = hierarchyPropertyParser2.goDown("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test115"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.build("", ".");
    int i6 = hierarchyPropertyParser2.getLevel();
    boolean b8 = hierarchyPropertyParser2.isHierachic("");
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.goToRoot();
    boolean b12 = hierarchyPropertyParser2.goToChild("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str14 = hierarchyPropertyParser2.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test116"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    boolean b7 = hierarchyPropertyParser2.contains("hi!");
    java.lang.String str8 = hierarchyPropertyParser2.getSeperator();
    boolean b10 = hierarchyPropertyParser2.goDown(".");
    java.util.Vector vector11 = null;
    int i13 = hierarchyPropertyParser2.search(vector11, "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "."+ "'", str8.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test117"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.build("", ".");
    int i6 = hierarchyPropertyParser2.getLevel();
    java.lang.String str7 = hierarchyPropertyParser2.getSeperator();
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser2.search(vector8, "");
    int i11 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToRoot();
    boolean b13 = hierarchyPropertyParser2.isLeafReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "."+ "'", str7.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test118"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    boolean b9 = hierarchyPropertyParser2.goDown("null(0)[null]\n");
    int i10 = hierarchyPropertyParser2.depth();
    boolean b11 = hierarchyPropertyParser2.isRootReached();
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
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test119"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String str3 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.goToParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test120"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    boolean b5 = hierarchyPropertyParser2.goDown("hi!");
    int i6 = hierarchyPropertyParser2.getLevel();
    boolean b8 = hierarchyPropertyParser2.goToChild(".");
    java.lang.String str9 = hierarchyPropertyParser2.showTree();
    java.util.Vector vector10 = null;
    int i12 = hierarchyPropertyParser2.search(vector10, "null(0)[null]\n(0)[null]\n");
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
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null(0)[null]\n"+ "'", str9.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test121"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    int i6 = hierarchyPropertyParser2.getLevel();
    int i7 = hierarchyPropertyParser2.numChildren();
    int i8 = hierarchyPropertyParser2.depth();
    boolean b9 = hierarchyPropertyParser2.isLeafReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test122"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isRootReached();
    boolean b5 = hierarchyPropertyParser2.isHierachic("");
    java.lang.String[] str_array7 = hierarchyPropertyParser2.tokenize("hi!");
    boolean b8 = hierarchyPropertyParser2.isRootReached();
    int i9 = hierarchyPropertyParser2.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test123"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    hierarchyPropertyParser2.build("hi!", "hi!");
    int i6 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.add("hi!");
    java.lang.String str9 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.goToParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test124"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    boolean b9 = hierarchyPropertyParser2.goDown("null(0)[null]\n");
    boolean b10 = hierarchyPropertyParser2.isLeafReached();
    int i11 = hierarchyPropertyParser2.numChildren();
    java.lang.String str12 = hierarchyPropertyParser2.getValue();
    java.lang.String str13 = hierarchyPropertyParser2.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test125"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str6 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array8 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    java.lang.String[] str_array9 = hierarchyPropertyParser2.childrenValues();
    boolean b11 = hierarchyPropertyParser2.goDown("hi!");
    hierarchyPropertyParser2.goToRoot();
    java.lang.String[] str_array13 = hierarchyPropertyParser2.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test126"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    int i8 = hierarchyPropertyParser2.numChildren();
    boolean b9 = hierarchyPropertyParser2.isLeafReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test127"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.build("", ".");
    int i6 = hierarchyPropertyParser2.getLevel();
    boolean b8 = hierarchyPropertyParser2.isHierachic("");
    boolean b9 = hierarchyPropertyParser2.isLeafReached();
    boolean b10 = hierarchyPropertyParser2.isRootReached();
    // The following exception was thrown during execution in test generation
    try {
    boolean b12 = hierarchyPropertyParser2.contains(".");
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
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test128"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    boolean b5 = hierarchyPropertyParser2.goDown("hi!");
    int i6 = hierarchyPropertyParser2.depth();
    java.lang.String str7 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str9 = hierarchyPropertyParser2.showTree();
    boolean b11 = hierarchyPropertyParser2.goToChild("hi!(0)[null]\n");
    java.lang.String str12 = hierarchyPropertyParser2.showTree();
    java.lang.String[] str_array13 = hierarchyPropertyParser2.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null(0)[null]\n"+ "'", str9.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null(0)[null]\n"+ "'", str12.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test129"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    boolean b6 = hierarchyPropertyParser2.goDown(".");
    java.lang.String[] str_array8 = hierarchyPropertyParser2.tokenize(".");
    java.util.Vector vector9 = null;
    int i11 = hierarchyPropertyParser2.search(vector9, ".");
    java.lang.String[] str_array13 = hierarchyPropertyParser2.tokenize("");
    int i14 = hierarchyPropertyParser2.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test130"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    int i4 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str6 = hierarchyPropertyParser2.parentValue();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str8 = hierarchyPropertyParser2.showTree();
    boolean b10 = hierarchyPropertyParser2.isHierachic("");
    hierarchyPropertyParser2.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null(0)[null]\n"+ "'", str8.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test131"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.goToParent();
    java.lang.String str2 = hierarchyPropertyParser0.showTree();
    int i3 = hierarchyPropertyParser0.numChildren();
    boolean b5 = hierarchyPropertyParser0.goDown("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "null(0)[null]\n"+ "'", str2.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test132"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    int i6 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.goToRoot();
    boolean b11 = hierarchyPropertyParser2.goToChild("hi!");
    java.lang.String str12 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.add("hi!(0)[null]\n");
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
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test133"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.setSeperator("hi!");
    int i8 = hierarchyPropertyParser2.getLevel();
    int i9 = hierarchyPropertyParser2.depth();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("");
    int i12 = hierarchyPropertyParser2.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test134"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    java.util.Vector vector7 = null;
    int i9 = hierarchyPropertyParser2.search(vector7, "hi!");
    boolean b11 = hierarchyPropertyParser2.isHierachic("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test135"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getValue();
    boolean b7 = hierarchyPropertyParser2.goDown("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test136"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str7 = hierarchyPropertyParser2.showTree();
    boolean b9 = hierarchyPropertyParser2.goToChild("");
    java.util.Vector vector10 = null;
    int i12 = hierarchyPropertyParser2.search(vector10, "");
    int i13 = hierarchyPropertyParser2.numChildren();
    java.lang.String str14 = hierarchyPropertyParser2.getValue();
    int i15 = hierarchyPropertyParser2.getLevel();
    java.lang.String str16 = hierarchyPropertyParser2.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null(0)[null]\n"+ "'", str7.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "."+ "'", str16.equals("."));

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test137"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.setSeperator(".");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "hi!");
    boolean b7 = hierarchyPropertyParser0.isHierachic("hi!");
    hierarchyPropertyParser0.goToRoot();
    java.lang.String str9 = hierarchyPropertyParser0.getValue();
    int i10 = hierarchyPropertyParser0.numChildren();
    // The following exception was thrown during execution in test generation
    try {
    boolean b12 = hierarchyPropertyParser0.contains("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test138"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.add("hi!");
    hierarchyPropertyParser2.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test139"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    boolean b5 = hierarchyPropertyParser2.goDown("hi!");
    int i6 = hierarchyPropertyParser2.depth();
    java.lang.String str7 = hierarchyPropertyParser2.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null(0)[null]\n"+ "'", str7.equals("null(0)[null]\n"));

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test140"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n");
    int i7 = hierarchyPropertyParser2.numChildren();
    java.lang.String str8 = hierarchyPropertyParser2.parentValue();
    boolean b10 = hierarchyPropertyParser2.goToChild(".");
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test141"); }


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
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test142"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    boolean b6 = hierarchyPropertyParser2.goDown(".");
    java.lang.String[] str_array8 = hierarchyPropertyParser2.tokenize("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test143"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.goToParent();
    java.lang.String str2 = hierarchyPropertyParser0.showTree();
    hierarchyPropertyParser0.build("hi!", "hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "null(0)[null]\n"+ "'", str2.equals("null(0)[null]\n"));

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test144"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    boolean b5 = hierarchyPropertyParser2.goToChild("hi!");
    boolean b7 = hierarchyPropertyParser2.goToChild("");
    boolean b9 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n");
    boolean b11 = hierarchyPropertyParser2.isHierachic("");
    hierarchyPropertyParser2.setSeperator("");
    // The following exception was thrown during execution in test generation
    try {
    boolean b15 = hierarchyPropertyParser2.contains("");
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
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test145"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    boolean b7 = hierarchyPropertyParser2.goDown(".");
    boolean b9 = hierarchyPropertyParser2.isHierachic("");
    java.lang.String str10 = hierarchyPropertyParser2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test146"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    int i4 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToRoot();
    boolean b7 = hierarchyPropertyParser2.isHierachic(".");
    boolean b8 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.childrenValues();
    java.lang.String str10 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array12 = hierarchyPropertyParser2.tokenize("hi!(0)[null]\n");
    int i13 = hierarchyPropertyParser2.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test147"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str6 = hierarchyPropertyParser2.context();
    int i7 = hierarchyPropertyParser2.getLevel();
    boolean b9 = hierarchyPropertyParser2.goDown("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test148"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array7 = hierarchyPropertyParser2.childrenValues();
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser2.search(vector8, "");
    boolean b11 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str12 = hierarchyPropertyParser2.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test149"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    java.lang.String str6 = hierarchyPropertyParser2.parentValue();
    java.lang.String[] str_array7 = hierarchyPropertyParser2.childrenValues();
    boolean b9 = hierarchyPropertyParser2.isHierachic("");
    java.lang.String[] str_array10 = hierarchyPropertyParser2.childrenValues();
    java.lang.String[] str_array12 = hierarchyPropertyParser2.tokenize("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test150"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    boolean b5 = hierarchyPropertyParser2.goDown("hi!");
    java.lang.String[] str_array6 = hierarchyPropertyParser2.childrenValues();
    java.lang.String str7 = hierarchyPropertyParser2.getValue();
    java.lang.String str8 = hierarchyPropertyParser2.getValue();
    boolean b10 = hierarchyPropertyParser2.goDown("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test151"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str7 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.tokenize("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test152"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.goToParent();
    int i7 = hierarchyPropertyParser2.depth();
    java.lang.String str8 = hierarchyPropertyParser2.getValue();
    boolean b9 = hierarchyPropertyParser2.isLeafReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test153"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("hi!");
    int i7 = hierarchyPropertyParser2.depth();
    java.lang.String str8 = hierarchyPropertyParser2.getValue();
    boolean b9 = hierarchyPropertyParser2.isLeafReached();
    boolean b11 = hierarchyPropertyParser2.isHierachic("hi!");
    int i12 = hierarchyPropertyParser2.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test154"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    int i6 = hierarchyPropertyParser2.getLevel();
    java.lang.String str7 = hierarchyPropertyParser2.getValue();
    java.lang.String str8 = hierarchyPropertyParser2.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test155"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.build("", ".");
    int i6 = hierarchyPropertyParser2.getLevel();
    java.lang.String str7 = hierarchyPropertyParser2.getSeperator();
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser2.search(vector8, "");
    boolean b11 = hierarchyPropertyParser2.isLeafReached();
    int i12 = hierarchyPropertyParser2.getLevel();
    java.lang.String str13 = hierarchyPropertyParser2.context();
    int i14 = hierarchyPropertyParser2.numChildren();
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
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "."+ "'", str7.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test156"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str6 = hierarchyPropertyParser2.context();
    java.lang.String str7 = hierarchyPropertyParser2.fullValue();
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser2.search(vector8, ".");
    java.lang.String str11 = hierarchyPropertyParser2.getValue();
    java.lang.String[] str_array13 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String str14 = hierarchyPropertyParser2.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "null(0)[null]\n"+ "'", str14.equals("null(0)[null]\n"));

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test157"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str5 = hierarchyPropertyParser2.parentValue();
    java.lang.String str6 = hierarchyPropertyParser2.context();
    java.lang.String str7 = hierarchyPropertyParser2.getValue();
    boolean b9 = hierarchyPropertyParser2.contains("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test158"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.build("", ".");
    int i6 = hierarchyPropertyParser2.getLevel();
    boolean b8 = hierarchyPropertyParser2.isHierachic("");
    hierarchyPropertyParser2.goToRoot();
    boolean b10 = hierarchyPropertyParser2.isRootReached();
    boolean b12 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
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
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test159"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    int i6 = hierarchyPropertyParser2.getLevel();
    boolean b8 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator(".");
    java.lang.String str12 = hierarchyPropertyParser2.parentValue();
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
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test160"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.setSeperator(".");
    java.lang.String str3 = hierarchyPropertyParser0.getSeperator();
    boolean b4 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String[] str_array6 = hierarchyPropertyParser0.tokenize("hi!");
    java.lang.String str7 = hierarchyPropertyParser0.context();
    int i8 = hierarchyPropertyParser0.getLevel();
    boolean b10 = hierarchyPropertyParser0.contains("hi!(0)[null]\n");
    boolean b12 = hierarchyPropertyParser0.isHierachic("");
    int i13 = hierarchyPropertyParser0.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "."+ "'", str3.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test161"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b4 = hierarchyPropertyParser2.goToChild("");
    boolean b6 = hierarchyPropertyParser2.goToChild("");
    boolean b8 = hierarchyPropertyParser2.goToChild(".");
    java.lang.String str9 = hierarchyPropertyParser2.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test162"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    hierarchyPropertyParser2.build("hi!", "hi!");
    int i6 = hierarchyPropertyParser2.numChildren();
    java.util.Vector vector7 = null;
    int i9 = hierarchyPropertyParser2.search(vector7, "hi!");
    boolean b11 = hierarchyPropertyParser2.isHierachic(".");
    int i12 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.add("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test163"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str4 = hierarchyPropertyParser2.getValue();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    java.lang.String[] str_array7 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String str8 = hierarchyPropertyParser2.showTree();
    java.lang.String str9 = hierarchyPropertyParser2.parentValue();
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
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null(0)[null]\n"+ "'", str8.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test164"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.goToRoot();
    int i5 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.add("hi!");
    hierarchyPropertyParser2.goToRoot();
    boolean b10 = hierarchyPropertyParser2.isHierachic(".");
    boolean b12 = hierarchyPropertyParser2.contains("null(0)[null]\n");
    int i13 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.build("null(0)[null]\n", "null(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test165"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    boolean b9 = hierarchyPropertyParser2.goDown("null(0)[null]\n");
    boolean b11 = hierarchyPropertyParser2.isHierachic("hi!");
    int i12 = hierarchyPropertyParser2.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test166"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    boolean b6 = hierarchyPropertyParser2.goDown(".");
    boolean b8 = hierarchyPropertyParser2.goToChild("");
    java.lang.String[] str_array9 = hierarchyPropertyParser2.childrenValues();
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
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test167"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isRootReached();
    boolean b5 = hierarchyPropertyParser2.isHierachic("");
    java.lang.String[] str_array7 = hierarchyPropertyParser2.tokenize("hi!");
    boolean b8 = hierarchyPropertyParser2.isRootReached();
    hierarchyPropertyParser2.build("", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test168"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    int i6 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.goToParent();
    int i8 = hierarchyPropertyParser2.numChildren();
    java.lang.String str9 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test169"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.goToRoot();
    int i5 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.add("hi!");
    java.lang.String str8 = hierarchyPropertyParser2.showTree();
    boolean b10 = hierarchyPropertyParser2.contains("null(0)[null]\n");
    java.lang.String[] str_array12 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!(0)[null]\n"+ "'", str8.equals("hi!(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test170"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    boolean b5 = hierarchyPropertyParser2.goDown("hi!");
    int i6 = hierarchyPropertyParser2.depth();
    java.lang.String str7 = hierarchyPropertyParser2.fullValue();
    boolean b9 = hierarchyPropertyParser2.contains("null(0)[null]\n");
    int i10 = hierarchyPropertyParser2.getLevel();
    boolean b12 = hierarchyPropertyParser2.contains("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test171"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str7 = hierarchyPropertyParser2.showTree();
    boolean b9 = hierarchyPropertyParser2.goToChild("");
    boolean b10 = hierarchyPropertyParser2.isRootReached();
    boolean b11 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array12 = hierarchyPropertyParser2.childrenValues();
    hierarchyPropertyParser2.goToParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null(0)[null]\n"+ "'", str7.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test172"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.setSeperator(".");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "hi!");
    hierarchyPropertyParser0.goToRoot();
    java.lang.String str7 = hierarchyPropertyParser0.getValue();
    java.lang.String str8 = hierarchyPropertyParser0.showTree();
    int i9 = hierarchyPropertyParser0.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null(0)[null]\n"+ "'", str8.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test173"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    boolean b9 = hierarchyPropertyParser2.goDown("null(0)[null]\n");
    int i10 = hierarchyPropertyParser2.depth();
    boolean b11 = hierarchyPropertyParser2.isRootReached();
    java.util.Vector vector12 = null;
    int i14 = hierarchyPropertyParser2.search(vector12, "");
    java.lang.String[] str_array16 = hierarchyPropertyParser2.tokenize("hi!");
    boolean b18 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n");
    java.lang.String str19 = hierarchyPropertyParser2.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test174"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    boolean b7 = hierarchyPropertyParser2.contains("hi!");
    java.lang.String str8 = hierarchyPropertyParser2.getSeperator();
    boolean b10 = hierarchyPropertyParser2.isHierachic("hi!(0)[null]\n");
    java.lang.String str11 = hierarchyPropertyParser2.getValue();
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
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "."+ "'", str8.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test175"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    int i4 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.add("null(0)[null]\n");
    java.util.Vector vector7 = null;
    int i9 = hierarchyPropertyParser2.search(vector7, "");
    java.lang.String str10 = hierarchyPropertyParser2.getValue();
    java.lang.String[] str_array12 = hierarchyPropertyParser2.tokenize("null(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test176"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.build("", ".");
    int i6 = hierarchyPropertyParser2.getLevel();
    boolean b8 = hierarchyPropertyParser2.isHierachic("");
    boolean b9 = hierarchyPropertyParser2.isLeafReached();
    boolean b10 = hierarchyPropertyParser2.isRootReached();
    java.lang.String[] str_array12 = hierarchyPropertyParser2.tokenize("");
    int i13 = hierarchyPropertyParser2.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test177"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToRoot();
    boolean b7 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str8 = hierarchyPropertyParser2.fullValue();
    int i9 = hierarchyPropertyParser2.numChildren();
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    boolean b12 = hierarchyPropertyParser2.isHierachic(".");
    java.util.Vector vector13 = null;
    int i15 = hierarchyPropertyParser2.search(vector13, "null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-1));

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test178"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str6 = hierarchyPropertyParser2.context();
    java.lang.String str7 = hierarchyPropertyParser2.fullValue();
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser2.search(vector8, ".");
    java.lang.String str11 = hierarchyPropertyParser2.getValue();
    java.lang.String[] str_array13 = hierarchyPropertyParser2.tokenize("hi!");
    int i14 = hierarchyPropertyParser2.getLevel();
    java.lang.String str15 = hierarchyPropertyParser2.parentValue();
    java.lang.String str16 = hierarchyPropertyParser2.getSeperator();
    java.lang.String[] str_array17 = hierarchyPropertyParser2.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "."+ "'", str16.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test179"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    boolean b6 = hierarchyPropertyParser2.goDown(".");
    boolean b7 = hierarchyPropertyParser2.isRootReached();
    int i8 = hierarchyPropertyParser2.numChildren();
    java.lang.String[] str_array10 = hierarchyPropertyParser2.tokenize("hi!(0)[null]\n");
    hierarchyPropertyParser2.add("null(0)[null]\n(0)[null]\n");
    int i13 = hierarchyPropertyParser2.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test180"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    java.lang.String str6 = hierarchyPropertyParser2.parentValue();
    int i7 = hierarchyPropertyParser2.getLevel();
    boolean b9 = hierarchyPropertyParser2.isHierachic(".");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test181"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    java.lang.String str3 = hierarchyPropertyParser2.getValue();
    java.lang.String str4 = hierarchyPropertyParser2.fullValue();
    java.lang.String str5 = hierarchyPropertyParser2.parentValue();
    hierarchyPropertyParser2.setSeperator("");
    // The following exception was thrown during execution in test generation
    try {
    boolean b9 = hierarchyPropertyParser2.goTo("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test182"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n");
    boolean b7 = hierarchyPropertyParser2.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test183"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.build("", ".");
    int i6 = hierarchyPropertyParser2.getLevel();
    java.lang.String str7 = hierarchyPropertyParser2.getSeperator();
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser2.search(vector8, "");
    int i11 = hierarchyPropertyParser2.numChildren();
    boolean b13 = hierarchyPropertyParser2.isHierachic(".");
    int i14 = hierarchyPropertyParser2.numChildren();
    boolean b16 = hierarchyPropertyParser2.goToChild("hi!");
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
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "."+ "'", str7.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test184"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str7 = hierarchyPropertyParser2.showTree();
    boolean b9 = hierarchyPropertyParser2.goToChild("");
    java.util.Vector vector10 = null;
    int i12 = hierarchyPropertyParser2.search(vector10, "");
    int i13 = hierarchyPropertyParser2.numChildren();
    java.lang.String str14 = hierarchyPropertyParser2.getValue();
    boolean b15 = hierarchyPropertyParser2.isLeafReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null(0)[null]\n"+ "'", str7.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test185"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    boolean b5 = hierarchyPropertyParser2.goToChild("hi!");
    boolean b7 = hierarchyPropertyParser2.goToChild("");
    boolean b9 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n");
    java.lang.String str10 = hierarchyPropertyParser2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test186"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.build("", ".");
    int i6 = hierarchyPropertyParser2.getLevel();
    java.lang.String str7 = hierarchyPropertyParser2.getSeperator();
    boolean b9 = hierarchyPropertyParser2.goToChild("");
    int i10 = hierarchyPropertyParser2.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "."+ "'", str7.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test187"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    java.lang.String str7 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str8 = hierarchyPropertyParser2.parentValue();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.childrenValues();
    java.util.Vector vector10 = null;
    int i12 = hierarchyPropertyParser2.search(vector10, "");
    java.lang.String str13 = hierarchyPropertyParser2.showTree();
    java.lang.String[] str_array14 = hierarchyPropertyParser2.childrenValues();
    java.lang.String str15 = hierarchyPropertyParser2.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "."+ "'", str7.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null(0)[null]\n"+ "'", str13.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test188"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    boolean b6 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array7 = hierarchyPropertyParser2.childrenValues();
    boolean b9 = hierarchyPropertyParser2.goToChild("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test189"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n");
    int i8 = hierarchyPropertyParser2.depth();
    java.lang.String str9 = hierarchyPropertyParser2.fullValue();
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
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test190"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.goToRoot();
    int i5 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.add("hi!");
    hierarchyPropertyParser2.goToRoot();
    boolean b10 = hierarchyPropertyParser2.goDown("hi!(0)[null]\n");
    java.lang.String[] str_array12 = hierarchyPropertyParser2.tokenize("");
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
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test191"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.build("", ".");
    int i6 = hierarchyPropertyParser2.getLevel();
    java.lang.String str7 = hierarchyPropertyParser2.getSeperator();
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser2.search(vector8, "");
    boolean b11 = hierarchyPropertyParser2.isLeafReached();
    int i12 = hierarchyPropertyParser2.getLevel();
    java.lang.String str13 = hierarchyPropertyParser2.context();
    int i14 = hierarchyPropertyParser2.numChildren();
    java.lang.String[] str_array16 = hierarchyPropertyParser2.tokenize("null(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "."+ "'", str7.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test192"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    boolean b6 = hierarchyPropertyParser2.isHierachic(".");
    hierarchyPropertyParser2.goToParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test193"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.goToRoot();
    int i5 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.add("hi!");
    hierarchyPropertyParser2.goToRoot();
    boolean b10 = hierarchyPropertyParser2.isHierachic(".");
    int i11 = hierarchyPropertyParser2.numChildren();
    java.lang.String str12 = hierarchyPropertyParser2.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!(0)[null]\n"+ "'", str12.equals("hi!(0)[null]\n"));

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test194"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str6 = hierarchyPropertyParser2.context();
    java.lang.String str7 = hierarchyPropertyParser2.fullValue();
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser2.search(vector8, ".");
    int i11 = hierarchyPropertyParser2.depth();
    boolean b13 = hierarchyPropertyParser2.contains("hi!");
    java.lang.String str14 = hierarchyPropertyParser2.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "."+ "'", str14.equals("."));

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test195"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.build("", ".");
    int i6 = hierarchyPropertyParser2.getLevel();
    boolean b8 = hierarchyPropertyParser2.isHierachic("");
    boolean b9 = hierarchyPropertyParser2.isLeafReached();
    boolean b10 = hierarchyPropertyParser2.isRootReached();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.childrenValues();
    java.util.Vector vector12 = null;
    int i14 = hierarchyPropertyParser2.search(vector12, "");
    boolean b16 = hierarchyPropertyParser2.isHierachic("hi!(0)[null]\n");
    java.lang.String str17 = hierarchyPropertyParser2.context();
    int i18 = hierarchyPropertyParser2.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test196"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str7 = hierarchyPropertyParser2.showTree();
    boolean b9 = hierarchyPropertyParser2.goToChild("");
    boolean b10 = hierarchyPropertyParser2.isRootReached();
    boolean b11 = hierarchyPropertyParser2.isRootReached();
    java.util.Vector vector12 = null;
    int i14 = hierarchyPropertyParser2.search(vector12, "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null(0)[null]\n"+ "'", str7.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test197"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    boolean b7 = hierarchyPropertyParser2.goDown(".");
    int i8 = hierarchyPropertyParser2.depth();
    java.lang.String str9 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.goToRoot();
    int i11 = hierarchyPropertyParser2.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null(0)[null]\n"+ "'", str9.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test198"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str5 = hierarchyPropertyParser2.parentValue();
    java.lang.String str6 = hierarchyPropertyParser2.context();
    java.lang.String str7 = hierarchyPropertyParser2.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test199"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str6 = hierarchyPropertyParser2.getSeperator();
    boolean b7 = hierarchyPropertyParser2.isRootReached();
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n(0)[null]\n");
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "."+ "'", str6.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test200"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.goToParent();
    boolean b7 = hierarchyPropertyParser2.goToChild("");
    boolean b8 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str9 = hierarchyPropertyParser2.fullValue();
    boolean b11 = hierarchyPropertyParser2.goDown("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test201"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.build("", ".");
    int i6 = hierarchyPropertyParser2.getLevel();
    java.lang.String[] str_array7 = hierarchyPropertyParser2.childrenValues();
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str10 = hierarchyPropertyParser2.getValue();
    java.lang.String str11 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.goToRoot();
    int i13 = hierarchyPropertyParser2.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "."+ "'", str11.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test202"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n");
    boolean b9 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test203"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str6 = hierarchyPropertyParser2.context();
    java.lang.String str7 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array8 = hierarchyPropertyParser2.childrenValues();
    boolean b10 = hierarchyPropertyParser2.isHierachic("");
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser2.build("null(0)[null]\n", "");
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
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test204"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b4 = hierarchyPropertyParser2.goToChild("");
    java.lang.String str5 = hierarchyPropertyParser2.context();
    int i6 = hierarchyPropertyParser2.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test205"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser2.search(vector8, "null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test206"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str7 = hierarchyPropertyParser2.showTree();
    boolean b9 = hierarchyPropertyParser2.goToChild("");
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    boolean b13 = hierarchyPropertyParser2.isHierachic("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null(0)[null]\n"+ "'", str7.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test207"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    boolean b5 = hierarchyPropertyParser2.goDown("hi!");
    int i6 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test208"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    int i4 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.add("null(0)[null]\n");
    java.util.Vector vector7 = null;
    int i9 = hierarchyPropertyParser2.search(vector7, "");
    java.lang.String str10 = hierarchyPropertyParser2.getValue();
    boolean b12 = hierarchyPropertyParser2.contains("null(0)[null]\n");
    boolean b13 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array14 = hierarchyPropertyParser2.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array14);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test209"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "null(0)[null]\n");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test210"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.build("", ".");
    int i6 = hierarchyPropertyParser2.getLevel();
    java.lang.String str7 = hierarchyPropertyParser2.getSeperator();
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser2.search(vector8, "");
    boolean b11 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.goToParent();
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
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "."+ "'", str7.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test211"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    hierarchyPropertyParser2.build("hi!", "hi!");
    java.lang.String[] str_array6 = hierarchyPropertyParser2.childrenValues();
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
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test212"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.goToParent();
    int i6 = hierarchyPropertyParser2.numChildren();
    java.lang.String str7 = hierarchyPropertyParser2.getValue();
    java.lang.String str8 = hierarchyPropertyParser2.showTree();
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
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null(0)[null]\n"+ "'", str8.equals("null(0)[null]\n"));

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test213"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.goToParent();
    boolean b7 = hierarchyPropertyParser2.goToChild("");
    boolean b8 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str9 = hierarchyPropertyParser2.getSeperator();
    int i10 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "."+ "'", str9.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test214"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array7 = hierarchyPropertyParser2.childrenValues();
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser2.search(vector8, "");
    boolean b11 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str12 = hierarchyPropertyParser2.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test215"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n");
    java.lang.String[] str_array9 = hierarchyPropertyParser2.tokenize("hi!");
    boolean b10 = hierarchyPropertyParser2.isLeafReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test216"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str6 = hierarchyPropertyParser2.getSeperator();
    boolean b7 = hierarchyPropertyParser2.isRootReached();
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser2.search(vector8, "hi!(0)[null]\n");
    java.lang.String str11 = hierarchyPropertyParser2.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "."+ "'", str6.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test217"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    int i4 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.add("null(0)[null]\n");
    java.util.Vector vector7 = null;
    int i9 = hierarchyPropertyParser2.search(vector7, "");
    java.lang.String str10 = hierarchyPropertyParser2.getValue();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.childrenValues();
    hierarchyPropertyParser2.goToParent();
    int i13 = hierarchyPropertyParser2.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test218"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.goToRoot();
    int i5 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.add("hi!");
    java.lang.String str8 = hierarchyPropertyParser2.showTree();
    int i9 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!(0)[null]\n"+ "'", str8.equals("hi!(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test219"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str7 = hierarchyPropertyParser2.showTree();
    boolean b9 = hierarchyPropertyParser2.goToChild("");
    java.util.Vector vector10 = null;
    int i12 = hierarchyPropertyParser2.search(vector10, "");
    int i13 = hierarchyPropertyParser2.numChildren();
    java.lang.String str14 = hierarchyPropertyParser2.getValue();
    int i15 = hierarchyPropertyParser2.getLevel();
    boolean b17 = hierarchyPropertyParser2.contains("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null(0)[null]\n"+ "'", str7.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test220"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    boolean b5 = hierarchyPropertyParser2.goDown("hi!");
    java.lang.String[] str_array6 = hierarchyPropertyParser2.childrenValues();
    java.lang.String str7 = hierarchyPropertyParser2.getValue();
    java.lang.String str8 = hierarchyPropertyParser2.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null(0)[null]\n"+ "'", str8.equals("null(0)[null]\n"));

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test221"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isRootReached();
    hierarchyPropertyParser2.add("hi!");
    java.lang.String str6 = hierarchyPropertyParser2.context();
    java.lang.String str7 = hierarchyPropertyParser2.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test222"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    int i4 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToRoot();
    boolean b7 = hierarchyPropertyParser2.isHierachic(".");
    boolean b8 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.childrenValues();
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.childrenValues();
    java.lang.String str12 = hierarchyPropertyParser2.parentValue();
    hierarchyPropertyParser2.setSeperator(".");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test223"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.goToParent();
    boolean b5 = hierarchyPropertyParser2.isLeafReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test224"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    boolean b5 = hierarchyPropertyParser2.goToChild("hi!");
    boolean b7 = hierarchyPropertyParser2.goDown("hi!");
    java.lang.String str8 = hierarchyPropertyParser2.getSeperator();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.childrenValues();
    int i10 = hierarchyPropertyParser2.depth();
    // The following exception was thrown during execution in test generation
    try {
    boolean b12 = hierarchyPropertyParser2.contains(".");
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
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "."+ "'", str8.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test225"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.goToRoot();
    int i5 = hierarchyPropertyParser2.depth();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.childrenValues();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str8 = hierarchyPropertyParser2.getValue();
    java.util.Vector vector9 = null;
    int i11 = hierarchyPropertyParser2.search(vector9, ".");
    int i12 = hierarchyPropertyParser2.depth();
    boolean b14 = hierarchyPropertyParser2.goToChild("null(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test226"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    boolean b5 = hierarchyPropertyParser2.goDown("hi!");
    int i6 = hierarchyPropertyParser2.depth();
    boolean b8 = hierarchyPropertyParser2.goDown("null(0)[null]\n(0)[null]\n");
    int i9 = hierarchyPropertyParser2.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test227"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    int i4 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str6 = hierarchyPropertyParser2.parentValue();
    java.lang.String str7 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str8 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String[] str_array10 = hierarchyPropertyParser2.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "."+ "'", str7.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test228"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    boolean b6 = hierarchyPropertyParser2.goDown(".");
    boolean b8 = hierarchyPropertyParser2.goToChild("");
    java.lang.String[] str_array9 = hierarchyPropertyParser2.childrenValues();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser2.build("hi!", "");
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
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test229"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    java.lang.String str3 = hierarchyPropertyParser2.getValue();
    java.lang.String str4 = hierarchyPropertyParser2.getValue();
    java.lang.String str5 = hierarchyPropertyParser2.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test230"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.goToParent();
    boolean b7 = hierarchyPropertyParser2.isLeafReached();
    boolean b9 = hierarchyPropertyParser2.contains("hi!(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test231"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str7 = hierarchyPropertyParser2.showTree();
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser2.search(vector8, "hi!");
    hierarchyPropertyParser2.goToRoot();
    java.lang.String[] str_array13 = hierarchyPropertyParser2.tokenize("null(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null(0)[null]\n"+ "'", str7.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test232"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.setSeperator("hi!");
    java.lang.String[] str_array7 = hierarchyPropertyParser2.childrenValues();
    int i8 = hierarchyPropertyParser2.depth();
    java.lang.String str9 = hierarchyPropertyParser2.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test233"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    int i6 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.add("null(0)[null]\n(0)[null]\n");
    boolean b10 = hierarchyPropertyParser2.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test234"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.goToParent();
    boolean b7 = hierarchyPropertyParser2.goToChild("");
    boolean b8 = hierarchyPropertyParser2.isLeafReached();
    boolean b10 = hierarchyPropertyParser2.goDown(".");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test235"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    boolean b5 = hierarchyPropertyParser2.goDown("hi!");
    int i6 = hierarchyPropertyParser2.depth();
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    boolean b8 = hierarchyPropertyParser2.isLeafReached();
    boolean b10 = hierarchyPropertyParser2.contains("null(0)[null]\n");
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
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test236"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    boolean b5 = hierarchyPropertyParser2.goToChild("hi!");
    boolean b7 = hierarchyPropertyParser2.goDown("hi!");
    java.lang.String str8 = hierarchyPropertyParser2.getSeperator();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.childrenValues();
    int i10 = hierarchyPropertyParser2.depth();
    boolean b12 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "."+ "'", str8.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test237"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str5 = hierarchyPropertyParser2.showTree();
    java.lang.String str6 = hierarchyPropertyParser2.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null(0)[null]\n"+ "'", str5.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null(0)[null]\n"+ "'", str6.equals("null(0)[null]\n"));

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test238"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.build("", ".");
    int i6 = hierarchyPropertyParser2.getLevel();
    int i7 = hierarchyPropertyParser2.getLevel();
    java.lang.String[] str_array8 = hierarchyPropertyParser2.childrenValues();
    int i9 = hierarchyPropertyParser2.numChildren();
    boolean b11 = hierarchyPropertyParser2.isHierachic("hi!");
    java.lang.String str12 = hierarchyPropertyParser2.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test239"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str6 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str7 = hierarchyPropertyParser2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "."+ "'", str6.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test240"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("hi!");
    int i7 = hierarchyPropertyParser2.depth();
    java.lang.String str8 = hierarchyPropertyParser2.getValue();
    boolean b9 = hierarchyPropertyParser2.isLeafReached();
    boolean b10 = hierarchyPropertyParser2.isLeafReached();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser2.build("hi!(0)[null]\n", ".");
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
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test241"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    boolean b7 = hierarchyPropertyParser2.goDown(".");
    java.lang.String str8 = hierarchyPropertyParser2.context();
    java.lang.String str9 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.add("hi!(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "."+ "'", str9.equals("."));

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test242"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    boolean b5 = hierarchyPropertyParser2.goDown("hi!");
    int i6 = hierarchyPropertyParser2.getLevel();
    boolean b8 = hierarchyPropertyParser2.goToChild(".");
    java.lang.String str9 = hierarchyPropertyParser2.showTree();
    java.util.Vector vector10 = null;
    int i12 = hierarchyPropertyParser2.search(vector10, "null(0)[null]\n(0)[null]\n");
    boolean b13 = hierarchyPropertyParser2.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null(0)[null]\n"+ "'", str9.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test243"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    int i6 = hierarchyPropertyParser2.getLevel();
    java.lang.String str7 = hierarchyPropertyParser2.getValue();
    java.lang.String str8 = hierarchyPropertyParser2.getValue();
    boolean b10 = hierarchyPropertyParser2.contains("hi!(0)[null]\n");
    int i11 = hierarchyPropertyParser2.numChildren();
    java.lang.String str12 = hierarchyPropertyParser2.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "."+ "'", str12.equals("."));

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test244"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str7 = hierarchyPropertyParser2.showTree();
    boolean b9 = hierarchyPropertyParser2.goToChild("");
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    boolean b12 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str13 = hierarchyPropertyParser2.context();
    java.util.Vector vector14 = null;
    int i16 = hierarchyPropertyParser2.search(vector14, "null(0)[null]\n");
    java.lang.String str17 = hierarchyPropertyParser2.getValue();
    java.lang.String str18 = hierarchyPropertyParser2.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null(0)[null]\n"+ "'", str7.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test245"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    int i7 = hierarchyPropertyParser2.getLevel();
    int i8 = hierarchyPropertyParser2.depth();
    java.lang.String str9 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n(0)[null]\n");
    boolean b13 = hierarchyPropertyParser2.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "."+ "'", str9.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test246"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    boolean b7 = hierarchyPropertyParser2.goDown(".");
    java.lang.String str8 = hierarchyPropertyParser2.context();
    java.lang.String str9 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.setSeperator("hi!(0)[null]\n");
    int i12 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.setSeperator("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "."+ "'", str9.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test247"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    java.lang.String str3 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str4 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n(0)[null]\n");
    boolean b8 = hierarchyPropertyParser2.goToChild("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "."+ "'", str3.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "."+ "'", str4.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test248"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    boolean b9 = hierarchyPropertyParser2.goDown("null(0)[null]\n");
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test249"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.build("", ".");
    int i6 = hierarchyPropertyParser2.getLevel();
    boolean b8 = hierarchyPropertyParser2.isHierachic("");
    boolean b9 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    java.lang.String str11 = hierarchyPropertyParser2.parentValue();
    java.lang.String str12 = hierarchyPropertyParser2.fullValue();
    java.lang.String str13 = hierarchyPropertyParser2.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test250"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    boolean b5 = hierarchyPropertyParser2.goToChild("hi!");
    boolean b7 = hierarchyPropertyParser2.goToChild("");
    boolean b9 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n");
    boolean b11 = hierarchyPropertyParser2.isHierachic("");
    boolean b12 = hierarchyPropertyParser2.isLeafReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test251"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    java.util.Vector vector6 = null;
    int i8 = hierarchyPropertyParser2.search(vector6, ".");
    boolean b10 = hierarchyPropertyParser2.goToChild("");
    int i11 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n");
    java.lang.String str14 = hierarchyPropertyParser2.getValue();
    boolean b16 = hierarchyPropertyParser2.isHierachic("");
    boolean b17 = hierarchyPropertyParser2.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test252"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    boolean b5 = hierarchyPropertyParser2.goDown("hi!");
    int i6 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.setSeperator(".");
    java.lang.String str9 = hierarchyPropertyParser2.getSeperator();
    boolean b11 = hierarchyPropertyParser2.goToChild("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "."+ "'", str9.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test253"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String str5 = hierarchyPropertyParser2.getValue();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser2.build("null(0)[null]\n(0)[null]\n", "hi!");
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
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test254"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    boolean b6 = hierarchyPropertyParser2.isRootReached();
    boolean b7 = hierarchyPropertyParser2.isRootReached();
    boolean b8 = hierarchyPropertyParser2.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test255"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    boolean b5 = hierarchyPropertyParser2.goDown("hi!");
    int i6 = hierarchyPropertyParser2.getLevel();
    boolean b8 = hierarchyPropertyParser2.goToChild(".");
    java.lang.String[] str_array9 = hierarchyPropertyParser2.childrenValues();
    int i10 = hierarchyPropertyParser2.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test256"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToRoot();
    boolean b8 = hierarchyPropertyParser2.contains("hi!");
    boolean b10 = hierarchyPropertyParser2.contains("hi!");
    int i11 = hierarchyPropertyParser2.numChildren();
    boolean b13 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n");
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
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test257"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    boolean b6 = hierarchyPropertyParser2.goDown(".");
    boolean b7 = hierarchyPropertyParser2.isRootReached();
    int i8 = hierarchyPropertyParser2.numChildren();
    java.lang.String str9 = hierarchyPropertyParser2.getValue();
    hierarchyPropertyParser2.goToParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test258"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    int i4 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.add("null(0)[null]\n");
    java.util.Vector vector7 = null;
    int i9 = hierarchyPropertyParser2.search(vector7, "");
    java.lang.String str10 = hierarchyPropertyParser2.getValue();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.childrenValues();
    boolean b12 = hierarchyPropertyParser2.isLeafReached();
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
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test259"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    int i6 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.add("hi!");
    java.lang.String str10 = hierarchyPropertyParser2.getValue();
    boolean b12 = hierarchyPropertyParser2.goTo("null(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test260"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isRootReached();
    boolean b5 = hierarchyPropertyParser2.isHierachic("");
    boolean b7 = hierarchyPropertyParser2.goDown("hi!");
    hierarchyPropertyParser2.setSeperator(".");
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
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test261"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getValue();
    boolean b7 = hierarchyPropertyParser2.goToChild("null(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test262"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.goToRoot();
    int i5 = hierarchyPropertyParser2.depth();
    int i6 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.setSeperator(".");
    boolean b10 = hierarchyPropertyParser2.goDown("");
    boolean b12 = hierarchyPropertyParser2.goToChild(".");
    java.lang.String[] str_array14 = hierarchyPropertyParser2.tokenize("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test263"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.build("", ".");
    int i6 = hierarchyPropertyParser2.getLevel();
    boolean b8 = hierarchyPropertyParser2.isHierachic("");
    hierarchyPropertyParser2.goToRoot();
    boolean b10 = hierarchyPropertyParser2.isRootReached();
    boolean b12 = hierarchyPropertyParser2.goToChild("");
    hierarchyPropertyParser2.goToParent();
    boolean b15 = hierarchyPropertyParser2.contains("null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test264"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str6 = hierarchyPropertyParser2.context();
    java.lang.String str7 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array8 = hierarchyPropertyParser2.childrenValues();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser2.goToChild(10);
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
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test265"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    int i6 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.goToRoot();
    boolean b11 = hierarchyPropertyParser2.goToChild("hi!");
    java.lang.String str12 = hierarchyPropertyParser2.showTree();
    int i13 = hierarchyPropertyParser2.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null(0)[null]\n"+ "'", str12.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test266"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    int i4 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToRoot();
    boolean b7 = hierarchyPropertyParser2.isHierachic(".");
    boolean b8 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str9 = hierarchyPropertyParser2.parentValue();
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.setSeperator("");
    boolean b13 = hierarchyPropertyParser2.isLeafReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test267"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.childrenValues();
    hierarchyPropertyParser2.setSeperator("hi!");
    java.lang.String[] str_array8 = hierarchyPropertyParser2.childrenValues();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.childrenValues();
    int i10 = hierarchyPropertyParser2.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test268"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str6 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array8 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    boolean b10 = hierarchyPropertyParser2.goToChild("hi!");
    java.lang.String str11 = hierarchyPropertyParser2.parentValue();
    hierarchyPropertyParser2.goToParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test269"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str5 = hierarchyPropertyParser2.parentValue();
    java.lang.String str6 = hierarchyPropertyParser2.context();
    int i7 = hierarchyPropertyParser2.numChildren();
    java.lang.String str8 = hierarchyPropertyParser2.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test270"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToRoot();
    boolean b7 = hierarchyPropertyParser2.isRootReached();
    java.lang.String[] str_array8 = hierarchyPropertyParser2.childrenValues();
    java.lang.String str9 = hierarchyPropertyParser2.fullValue();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser2.goToChild(10);
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
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test271"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    int i6 = hierarchyPropertyParser2.getLevel();
    boolean b8 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str10 = hierarchyPropertyParser2.getValue();
    hierarchyPropertyParser2.build("null(0)[null]\n", "hi!(0)[null]\n");
    boolean b14 = hierarchyPropertyParser2.isLeafReached();
    boolean b16 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test272"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    java.lang.String str3 = hierarchyPropertyParser2.getSeperator();
    boolean b5 = hierarchyPropertyParser2.contains("null(0)[null]\n");
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    java.lang.String str7 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str8 = hierarchyPropertyParser2.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "."+ "'", str3.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "."+ "'", str7.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "."+ "'", str8.equals("."));

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test273"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str7 = hierarchyPropertyParser2.showTree();
    boolean b9 = hierarchyPropertyParser2.goToChild("");
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    boolean b12 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str13 = hierarchyPropertyParser2.context();
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
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null(0)[null]\n"+ "'", str7.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test274"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    boolean b6 = hierarchyPropertyParser2.goDown(".");
    boolean b7 = hierarchyPropertyParser2.isRootReached();
    int i8 = hierarchyPropertyParser2.numChildren();
    boolean b9 = hierarchyPropertyParser2.isRootReached();
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n");
    boolean b13 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n(0)[null]\n");
    java.lang.String str14 = hierarchyPropertyParser2.parentValue();
    java.lang.String str15 = hierarchyPropertyParser2.parentValue();
    // The following exception was thrown during execution in test generation
    try {
    boolean b17 = hierarchyPropertyParser2.goDown("null(0)[null]\n");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test275"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String[] str_array4 = hierarchyPropertyParser2.childrenValues();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.childrenValues();
    hierarchyPropertyParser2.setSeperator("hi!(0)[null]\n");
    java.lang.String str8 = hierarchyPropertyParser2.parentValue();
    java.util.Vector vector9 = null;
    int i11 = hierarchyPropertyParser2.search(vector9, "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test276"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    int i6 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("hi!");
    java.util.Vector vector10 = null;
    int i12 = hierarchyPropertyParser2.search(vector10, ".");
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
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test277"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.build("", ".");
    int i6 = hierarchyPropertyParser2.getLevel();
    int i7 = hierarchyPropertyParser2.getLevel();
    java.lang.String[] str_array8 = hierarchyPropertyParser2.childrenValues();
    boolean b10 = hierarchyPropertyParser2.goDown("hi!");
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test278"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.build("", ".");
    int i6 = hierarchyPropertyParser2.getLevel();
    java.lang.String str7 = hierarchyPropertyParser2.getSeperator();
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser2.search(vector8, "");
    java.lang.String[] str_array12 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String[] str_array14 = hierarchyPropertyParser2.tokenize(".");
    java.lang.String str15 = hierarchyPropertyParser2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "."+ "'", str7.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test279"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isRootReached();
    boolean b5 = hierarchyPropertyParser2.isHierachic("");
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str7 = hierarchyPropertyParser2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test280"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    hierarchyPropertyParser2.build("hi!", "hi!");
    int i6 = hierarchyPropertyParser2.numChildren();
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    java.lang.String str8 = hierarchyPropertyParser2.fullValue();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test281"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.goToParent();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser0.goToChild((-1));
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test282"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    int i6 = hierarchyPropertyParser2.getLevel();
    boolean b8 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n");
    java.lang.String str9 = hierarchyPropertyParser2.getValue();
    hierarchyPropertyParser2.setSeperator(".");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test283"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.build("", ".");
    int i6 = hierarchyPropertyParser2.getLevel();
    boolean b8 = hierarchyPropertyParser2.isHierachic("");
    int i9 = hierarchyPropertyParser2.numChildren();
    int i10 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.goToRoot();
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
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test284"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.build("", ".");
    int i6 = hierarchyPropertyParser2.getLevel();
    boolean b8 = hierarchyPropertyParser2.isHierachic("");
    boolean b9 = hierarchyPropertyParser2.isLeafReached();
    boolean b10 = hierarchyPropertyParser2.isRootReached();
    java.lang.String[] str_array12 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.add("hi!(0)[null]\n");
    boolean b15 = hierarchyPropertyParser2.isLeafReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test285"); }


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
    hierarchyPropertyParser2.build("null(0)[null]\n", "hi!(0)[null]\n");
    int i17 = hierarchyPropertyParser2.depth();
    java.lang.String str18 = hierarchyPropertyParser2.getValue();
    hierarchyPropertyParser2.setSeperator("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "."+ "'", str9.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test286"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str6 = hierarchyPropertyParser2.context();
    java.lang.String str7 = hierarchyPropertyParser2.fullValue();
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser2.search(vector8, ".");
    java.lang.String str11 = hierarchyPropertyParser2.getValue();
    java.lang.String[] str_array13 = hierarchyPropertyParser2.tokenize("hi!");
    int i14 = hierarchyPropertyParser2.getLevel();
    java.lang.String str15 = hierarchyPropertyParser2.parentValue();
    java.lang.String str16 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str17 = hierarchyPropertyParser2.parentValue();
    java.lang.String str18 = hierarchyPropertyParser2.context();
    java.lang.String str19 = hierarchyPropertyParser2.parentValue();
    java.lang.String str20 = hierarchyPropertyParser2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "."+ "'", str16.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test287"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    boolean b7 = hierarchyPropertyParser2.goDown(".");
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
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test288"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    boolean b5 = hierarchyPropertyParser2.goDown("hi!");
    java.lang.String[] str_array7 = hierarchyPropertyParser2.tokenize("");
    boolean b9 = hierarchyPropertyParser2.goDown("hi!");
    java.lang.String str10 = hierarchyPropertyParser2.getSeperator();
    boolean b12 = hierarchyPropertyParser2.isHierachic("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "."+ "'", str10.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test289"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str7 = hierarchyPropertyParser2.showTree();
    boolean b9 = hierarchyPropertyParser2.goToChild("");
    boolean b10 = hierarchyPropertyParser2.isRootReached();
    boolean b11 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array12 = hierarchyPropertyParser2.childrenValues();
    int i13 = hierarchyPropertyParser2.getLevel();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser2.build("hi!(0)[null]\n", "null(0)[null]\n");
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
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null(0)[null]\n"+ "'", str7.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test290"); }


    // The following exception was thrown during execution in test generation
    try {
    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!(0)[null]\n(0)[null]\n", "null(0)[null]\n");
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test291"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    java.lang.String str6 = hierarchyPropertyParser2.parentValue();
    java.lang.String[] str_array8 = hierarchyPropertyParser2.tokenize(".");
    java.lang.String str9 = hierarchyPropertyParser2.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null(0)[null]\n"+ "'", str9.equals("null(0)[null]\n"));

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test292"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.childrenValues();
    hierarchyPropertyParser2.setSeperator("hi!");
    java.lang.String[] str_array8 = hierarchyPropertyParser2.childrenValues();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.childrenValues();
    java.lang.String str10 = hierarchyPropertyParser2.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test293"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    java.util.Vector vector7 = null;
    int i9 = hierarchyPropertyParser2.search(vector7, "hi!");
    java.lang.String str10 = hierarchyPropertyParser2.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test294"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    boolean b5 = hierarchyPropertyParser2.goToChild("hi!");
    java.lang.String str6 = hierarchyPropertyParser2.getValue();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.tokenize(".");
    // The following exception was thrown during execution in test generation
    try {
    boolean b11 = hierarchyPropertyParser2.contains("");
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
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test295"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.build("", ".");
    int i6 = hierarchyPropertyParser2.getLevel();
    int i7 = hierarchyPropertyParser2.getLevel();
    java.lang.String[] str_array8 = hierarchyPropertyParser2.childrenValues();
    boolean b10 = hierarchyPropertyParser2.goDown("hi!");
    java.lang.String str11 = hierarchyPropertyParser2.parentValue();
    java.util.Vector vector12 = null;
    int i14 = hierarchyPropertyParser2.search(vector12, "null(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test296"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    boolean b5 = hierarchyPropertyParser2.goDown("hi!");
    int i6 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.setSeperator(".");
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser2.build("hi!(0)[null]\n", "null(0)[null]\n(0)[null]\n");
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
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test297"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str6 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array8 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    java.lang.String[] str_array9 = hierarchyPropertyParser2.childrenValues();
    boolean b11 = hierarchyPropertyParser2.goDown("hi!");
    boolean b12 = hierarchyPropertyParser2.isRootReached();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser2.goToChild((int)(short)10);
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
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test298"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str7 = hierarchyPropertyParser2.showTree();
    boolean b9 = hierarchyPropertyParser2.goToChild("");
    boolean b10 = hierarchyPropertyParser2.isRootReached();
    boolean b11 = hierarchyPropertyParser2.isLeafReached();
    boolean b13 = hierarchyPropertyParser2.goDown("hi!");
    hierarchyPropertyParser2.add("hi!(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null(0)[null]\n"+ "'", str7.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test299"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.build("", ".");
    int i6 = hierarchyPropertyParser2.getLevel();
    java.lang.String str7 = hierarchyPropertyParser2.getSeperator();
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser2.search(vector8, "");
    int i11 = hierarchyPropertyParser2.numChildren();
    boolean b13 = hierarchyPropertyParser2.isHierachic(".");
    java.lang.String str14 = hierarchyPropertyParser2.getValue();
    hierarchyPropertyParser2.add("hi!(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "."+ "'", str7.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test300"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String[] str_array4 = hierarchyPropertyParser2.childrenValues();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.childrenValues();
    boolean b6 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    int i8 = hierarchyPropertyParser2.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test301"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str6 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array8 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    boolean b10 = hierarchyPropertyParser2.goToChild("hi!");
    java.lang.String str11 = hierarchyPropertyParser2.parentValue();
    java.lang.String str12 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str13 = hierarchyPropertyParser2.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "."+ "'", str12.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "."+ "'", str13.equals("."));

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test302"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str6 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array8 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    boolean b10 = hierarchyPropertyParser2.goToChild("hi!");
    java.lang.String str11 = hierarchyPropertyParser2.parentValue();
    java.lang.String str12 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str13 = hierarchyPropertyParser2.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "."+ "'", str12.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test303"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.add("hi!");
    boolean b7 = hierarchyPropertyParser2.goToChild("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test304"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToRoot();
    boolean b8 = hierarchyPropertyParser2.contains("hi!");
    boolean b10 = hierarchyPropertyParser2.contains("hi!");
    boolean b12 = hierarchyPropertyParser2.goDown("");
    int i13 = hierarchyPropertyParser2.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test305"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    int i4 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToRoot();
    boolean b7 = hierarchyPropertyParser2.isHierachic(".");
    boolean b8 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str9 = hierarchyPropertyParser2.parentValue();
    boolean b11 = hierarchyPropertyParser2.goDown(".");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.setSeperator("");
    boolean b16 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.goToParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test306"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str5 = hierarchyPropertyParser2.parentValue();
    boolean b7 = hierarchyPropertyParser2.goToChild("");
    boolean b9 = hierarchyPropertyParser2.goDown("null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test307"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.setSeperator(".");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "hi!");
    hierarchyPropertyParser0.goToRoot();
    boolean b8 = hierarchyPropertyParser0.isHierachic(".");
    java.lang.String str9 = hierarchyPropertyParser0.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "."+ "'", str9.equals("."));

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test308"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    java.lang.String str6 = hierarchyPropertyParser2.parentValue();
    java.lang.String[] str_array7 = hierarchyPropertyParser2.childrenValues();
    boolean b9 = hierarchyPropertyParser2.isHierachic("");
    java.lang.String str10 = hierarchyPropertyParser2.getSeperator();
    int i11 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.add("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "."+ "'", str10.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test309"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.build("", ".");
    int i6 = hierarchyPropertyParser2.getLevel();
    boolean b8 = hierarchyPropertyParser2.isHierachic("");
    boolean b9 = hierarchyPropertyParser2.isLeafReached();
    boolean b10 = hierarchyPropertyParser2.isRootReached();
    java.util.Vector vector11 = null;
    int i13 = hierarchyPropertyParser2.search(vector11, ".");
    boolean b14 = hierarchyPropertyParser2.isRootReached();
    hierarchyPropertyParser2.add("null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test310"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str7 = hierarchyPropertyParser2.showTree();
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser2.search(vector8, "hi!");
    int i11 = hierarchyPropertyParser2.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null(0)[null]\n"+ "'", str7.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test311"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n(0)[null]\n", "hi!(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test312"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    boolean b9 = hierarchyPropertyParser2.goDown("null(0)[null]\n");
    int i10 = hierarchyPropertyParser2.depth();
    boolean b11 = hierarchyPropertyParser2.isRootReached();
    java.util.Vector vector12 = null;
    int i14 = hierarchyPropertyParser2.search(vector12, "");
    java.lang.String[] str_array16 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String[] str_array18 = hierarchyPropertyParser2.tokenize(".");
    hierarchyPropertyParser2.build("null(0)[null]\n", "hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test313"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.build("", ".");
    int i6 = hierarchyPropertyParser2.getLevel();
    boolean b8 = hierarchyPropertyParser2.isHierachic("");
    int i9 = hierarchyPropertyParser2.numChildren();
    int i10 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str12 = hierarchyPropertyParser2.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test314"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str6 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    java.lang.String str9 = hierarchyPropertyParser2.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "."+ "'", str6.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null(0)[null]\n"+ "'", str9.equals("null(0)[null]\n"));

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test315"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    int i6 = hierarchyPropertyParser2.getLevel();
    boolean b8 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str10 = hierarchyPropertyParser2.getValue();
    boolean b12 = hierarchyPropertyParser2.goToChild("");
    boolean b14 = hierarchyPropertyParser2.goToChild("hi!(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test316"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str6 = hierarchyPropertyParser2.context();
    int i7 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.add("null(0)[null]\n");
    boolean b11 = hierarchyPropertyParser2.goToChild("");
    java.lang.String str12 = hierarchyPropertyParser2.parentValue();
    boolean b13 = hierarchyPropertyParser2.isRootReached();
    boolean b14 = hierarchyPropertyParser2.isLeafReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test317"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n");
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n");
    java.lang.String str10 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.setSeperator("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test318"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n");
    java.lang.String str8 = hierarchyPropertyParser2.getValue();
    int i9 = hierarchyPropertyParser2.getLevel();
    boolean b11 = hierarchyPropertyParser2.isHierachic("hi!(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test319"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.build("", ".");
    int i6 = hierarchyPropertyParser2.getLevel();
    boolean b8 = hierarchyPropertyParser2.isHierachic("");
    hierarchyPropertyParser2.goToRoot();
    boolean b10 = hierarchyPropertyParser2.isRootReached();
    boolean b12 = hierarchyPropertyParser2.goToChild("");
    java.lang.String str13 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str15 = hierarchyPropertyParser2.showTree();
    boolean b17 = hierarchyPropertyParser2.goToChild("null(0)[null]\n(0)[null]\n");
    hierarchyPropertyParser2.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null(0)[null]\n"+ "'", str13.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "null(0)[null]\n"+ "'", str15.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test320"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    boolean b6 = hierarchyPropertyParser2.goDown(".");
    boolean b7 = hierarchyPropertyParser2.isRootReached();
    int i8 = hierarchyPropertyParser2.numChildren();
    boolean b9 = hierarchyPropertyParser2.isRootReached();
    java.lang.String[] str_array10 = hierarchyPropertyParser2.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test321"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    boolean b7 = hierarchyPropertyParser2.contains("hi!");
    java.lang.String str8 = hierarchyPropertyParser2.getSeperator();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser2.build("hi!(0)[null]\n(0)[null]\n", "null(0)[null]\n(0)[null]\n");
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
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "."+ "'", str8.equals("."));

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test322"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.build("", ".");
    int i6 = hierarchyPropertyParser2.getLevel();
    java.lang.String[] str_array7 = hierarchyPropertyParser2.childrenValues();
    hierarchyPropertyParser2.goToParent();
    boolean b10 = hierarchyPropertyParser2.goDown("null(0)[null]\n");
    hierarchyPropertyParser2.setSeperator("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test323"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.build("", ".");
    int i6 = hierarchyPropertyParser2.getLevel();
    boolean b8 = hierarchyPropertyParser2.isHierachic("");
    boolean b9 = hierarchyPropertyParser2.isLeafReached();
    boolean b10 = hierarchyPropertyParser2.isRootReached();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.childrenValues();
    java.util.Vector vector12 = null;
    int i14 = hierarchyPropertyParser2.search(vector12, "");
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n");
    boolean b17 = hierarchyPropertyParser2.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test324"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    hierarchyPropertyParser2.build("hi!", "hi!");
    int i6 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.add("hi!");
    java.lang.String str9 = hierarchyPropertyParser2.fullValue();
    boolean b11 = hierarchyPropertyParser2.goTo(".");
    hierarchyPropertyParser2.goToParent();
    boolean b14 = hierarchyPropertyParser2.contains("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test325"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
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
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test326"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    boolean b6 = hierarchyPropertyParser2.goDown(".");
    boolean b7 = hierarchyPropertyParser2.isRootReached();
    int i8 = hierarchyPropertyParser2.numChildren();
    boolean b9 = hierarchyPropertyParser2.isRootReached();
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n");
    hierarchyPropertyParser2.setSeperator("hi!");
    boolean b15 = hierarchyPropertyParser2.contains("hi!(0)[null]\n");
    // The following exception was thrown during execution in test generation
    try {
    boolean b17 = hierarchyPropertyParser2.goTo("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test327"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    java.lang.String str3 = hierarchyPropertyParser2.getValue();
    hierarchyPropertyParser2.setSeperator("");
    boolean b7 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    boolean b8 = hierarchyPropertyParser2.isLeafReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test328"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.goToParent();
    int i6 = hierarchyPropertyParser2.numChildren();
    boolean b8 = hierarchyPropertyParser2.goToChild(".");
    java.lang.String str9 = hierarchyPropertyParser2.getValue();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test329"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    int i6 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.goToParent();
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser2.search(vector8, "");
    java.lang.String str11 = hierarchyPropertyParser2.getValue();
    hierarchyPropertyParser2.goToParent();
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
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test330"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    java.lang.String str3 = hierarchyPropertyParser2.getValue();
    hierarchyPropertyParser2.setSeperator("");
    boolean b7 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n");
    java.lang.String str8 = hierarchyPropertyParser2.parentValue();
    hierarchyPropertyParser2.setSeperator("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test331"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    int i6 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.goToRoot();
    boolean b11 = hierarchyPropertyParser2.goToChild("hi!");
    java.lang.String str12 = hierarchyPropertyParser2.showTree();
    java.lang.String str13 = hierarchyPropertyParser2.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null(0)[null]\n"+ "'", str12.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "."+ "'", str13.equals("."));

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test332"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    boolean b5 = hierarchyPropertyParser2.goDown("hi!");
    boolean b6 = hierarchyPropertyParser2.isLeafReached();
    int i7 = hierarchyPropertyParser2.depth();
    java.lang.String str8 = hierarchyPropertyParser2.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test333"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.goToParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test334"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToRoot();
    boolean b8 = hierarchyPropertyParser2.contains("hi!");
    hierarchyPropertyParser2.goToRoot();
    int i10 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test335"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    int i4 = hierarchyPropertyParser2.numChildren();
    int i5 = hierarchyPropertyParser2.getLevel();
    int i6 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.goToParent();
    boolean b10 = hierarchyPropertyParser2.goToChild("hi!");
    java.lang.String[] str_array12 = hierarchyPropertyParser2.tokenize("");
    boolean b14 = hierarchyPropertyParser2.contains("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test336"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str6 = hierarchyPropertyParser2.context();
    java.lang.String str7 = hierarchyPropertyParser2.fullValue();
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser2.search(vector8, ".");
    int i11 = hierarchyPropertyParser2.depth();
    java.util.Vector vector12 = null;
    int i14 = hierarchyPropertyParser2.search(vector12, "hi!");
    hierarchyPropertyParser2.setSeperator(".");
    boolean b18 = hierarchyPropertyParser2.contains("null(0)[null]\n(0)[null]\n");
    java.lang.String[] str_array19 = hierarchyPropertyParser2.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test337"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str5 = hierarchyPropertyParser2.parentValue();
    hierarchyPropertyParser2.setSeperator(".");
    int i8 = hierarchyPropertyParser2.numChildren();
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
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test338"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    int i6 = hierarchyPropertyParser2.getLevel();
    boolean b8 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n");
    boolean b10 = hierarchyPropertyParser2.goToChild("hi!");
    boolean b12 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n(0)[null]\n");
    hierarchyPropertyParser2.setSeperator("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test339"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    int i6 = hierarchyPropertyParser2.getLevel();
    boolean b8 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator(".");
    java.lang.String str12 = hierarchyPropertyParser2.parentValue();
    boolean b14 = hierarchyPropertyParser2.contains("null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test340"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.setSeperator(".");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "hi!");
    java.lang.String str6 = hierarchyPropertyParser0.parentValue();
    boolean b7 = hierarchyPropertyParser0.isLeafReached();
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser0.search(vector8, ".");
    java.lang.String str11 = hierarchyPropertyParser0.getSeperator();
    java.util.Vector vector12 = null;
    int i14 = hierarchyPropertyParser0.search(vector12, "null(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "."+ "'", str11.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test341"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    boolean b6 = hierarchyPropertyParser2.isRootReached();
    java.util.Vector vector7 = null;
    int i9 = hierarchyPropertyParser2.search(vector7, ".");
    java.lang.String[] str_array10 = hierarchyPropertyParser2.childrenValues();
    hierarchyPropertyParser2.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test342"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    int i6 = hierarchyPropertyParser2.getLevel();
    java.lang.String str7 = hierarchyPropertyParser2.getValue();
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser2.search(vector8, "hi!(0)[null]\n");
    java.lang.String str11 = hierarchyPropertyParser2.context();
    boolean b13 = hierarchyPropertyParser2.contains("hi!");
    int i14 = hierarchyPropertyParser2.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test343"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.goToParent();
    boolean b7 = hierarchyPropertyParser2.goToChild("");
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser2.search(vector8, "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test344"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.add("hi!");
    hierarchyPropertyParser2.goToRoot();
    int i6 = hierarchyPropertyParser2.numChildren();
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    boolean b9 = hierarchyPropertyParser2.goTo("");
    boolean b11 = hierarchyPropertyParser2.goTo(".");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test345"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    java.lang.String str6 = hierarchyPropertyParser2.parentValue();
    java.lang.String[] str_array7 = hierarchyPropertyParser2.childrenValues();
    boolean b9 = hierarchyPropertyParser2.isHierachic("");
    java.lang.String str10 = hierarchyPropertyParser2.getSeperator();
    int i11 = hierarchyPropertyParser2.numChildren();
    boolean b13 = hierarchyPropertyParser2.goDown("hi!");
    int i14 = hierarchyPropertyParser2.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "."+ "'", str10.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test346"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    int i4 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.goToRoot();
    int i7 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.build("", "hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test347"); }


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
    int i18 = hierarchyPropertyParser2.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test348"); }


    // The following exception was thrown during execution in test generation
    try {
    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!(0)[null]\n(0)[null]\n", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test349"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.build("", ".");
    int i6 = hierarchyPropertyParser2.getLevel();
    boolean b8 = hierarchyPropertyParser2.isHierachic("");
    hierarchyPropertyParser2.goToRoot();
    boolean b10 = hierarchyPropertyParser2.isRootReached();
    boolean b12 = hierarchyPropertyParser2.goToChild("");
    java.lang.String str13 = hierarchyPropertyParser2.showTree();
    int i14 = hierarchyPropertyParser2.getLevel();
    java.lang.String str15 = hierarchyPropertyParser2.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null(0)[null]\n"+ "'", str13.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test350"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    boolean b5 = hierarchyPropertyParser2.goToChild("hi!");
    java.lang.String str6 = hierarchyPropertyParser2.parentValue();
    boolean b7 = hierarchyPropertyParser2.isLeafReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test351"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getValue();
    boolean b7 = hierarchyPropertyParser2.contains("null(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test352"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    int i7 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.add("null(0)[null]\n");
    java.lang.String str10 = hierarchyPropertyParser2.getValue();
    boolean b12 = hierarchyPropertyParser2.goTo(".");
    java.util.Vector vector13 = null;
    int i15 = hierarchyPropertyParser2.search(vector13, "");
    java.lang.String str16 = hierarchyPropertyParser2.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "null(0)[null]\n"+ "'", str16.equals("null(0)[null]\n"));

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test353"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n");
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n");
    java.lang.String str10 = hierarchyPropertyParser2.getSeperator();
    boolean b11 = hierarchyPropertyParser2.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test354"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.setSeperator("hi!");
    int i8 = hierarchyPropertyParser2.getLevel();
    int i9 = hierarchyPropertyParser2.depth();
    boolean b11 = hierarchyPropertyParser2.isHierachic("hi!(0)[null]\n");
    boolean b13 = hierarchyPropertyParser2.goDown("null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test355"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    int i6 = hierarchyPropertyParser2.getLevel();
    boolean b8 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str10 = hierarchyPropertyParser2.getValue();
    boolean b12 = hierarchyPropertyParser2.goToChild("");
    java.lang.String[] str_array13 = hierarchyPropertyParser2.childrenValues();
    java.lang.String str14 = hierarchyPropertyParser2.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "null(0)[null]\n"+ "'", str14.equals("null(0)[null]\n"));

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test356"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String str5 = hierarchyPropertyParser2.parentValue();
    boolean b7 = hierarchyPropertyParser2.goDown("null(0)[null]\n");
    java.lang.String str8 = hierarchyPropertyParser2.showTree();
    boolean b10 = hierarchyPropertyParser2.isHierachic("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null(0)[null]\n"+ "'", str8.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test357"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isRootReached();
    boolean b5 = hierarchyPropertyParser2.isHierachic("");
    boolean b7 = hierarchyPropertyParser2.goDown("hi!");
    hierarchyPropertyParser2.setSeperator(".");
    java.lang.String str10 = hierarchyPropertyParser2.getValue();
    int i11 = hierarchyPropertyParser2.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test358"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    int i4 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToRoot();
    boolean b7 = hierarchyPropertyParser2.isHierachic(".");
    boolean b8 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.childrenValues();
    int i10 = hierarchyPropertyParser2.getLevel();
    boolean b11 = hierarchyPropertyParser2.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test359"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b4 = hierarchyPropertyParser2.goToChild("");
    java.lang.String str5 = hierarchyPropertyParser2.context();
    boolean b6 = hierarchyPropertyParser2.isLeafReached();
    java.util.Vector vector7 = null;
    int i9 = hierarchyPropertyParser2.search(vector7, "hi!");
    int i10 = hierarchyPropertyParser2.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test360"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.goToRoot();
    int i5 = hierarchyPropertyParser2.depth();
    int i6 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.setSeperator("");
    boolean b10 = hierarchyPropertyParser2.goToChild("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test361"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.build("", ".");
    int i6 = hierarchyPropertyParser2.getLevel();
    boolean b8 = hierarchyPropertyParser2.isHierachic("");
    boolean b9 = hierarchyPropertyParser2.isLeafReached();
    boolean b10 = hierarchyPropertyParser2.isRootReached();
    java.lang.String[] str_array12 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    boolean b15 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test362"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str5 = hierarchyPropertyParser2.getValue();
    boolean b7 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    boolean b8 = hierarchyPropertyParser2.isRootReached();
    hierarchyPropertyParser2.add("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test363"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    boolean b6 = hierarchyPropertyParser2.goDown(".");
    java.lang.String[] str_array8 = hierarchyPropertyParser2.tokenize(".");
    java.lang.String str9 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array10 = hierarchyPropertyParser2.childrenValues();
    hierarchyPropertyParser2.goToParent();
    boolean b12 = hierarchyPropertyParser2.isLeafReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test364"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.build("", ".");
    int i6 = hierarchyPropertyParser2.getLevel();
    boolean b8 = hierarchyPropertyParser2.isHierachic("");
    hierarchyPropertyParser2.goToRoot();
    boolean b10 = hierarchyPropertyParser2.isRootReached();
    boolean b12 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    java.lang.String[] str_array14 = hierarchyPropertyParser2.tokenize("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test365"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str5 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str7 = hierarchyPropertyParser2.showTree();
    java.lang.String[] str_array8 = hierarchyPropertyParser2.childrenValues();
    java.lang.String str9 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.setSeperator(".");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null(0)[null]\n"+ "'", str5.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null(0)[null]\n"+ "'", str7.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test366"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    int i4 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToRoot();
    boolean b7 = hierarchyPropertyParser2.isHierachic(".");
    boolean b8 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.childrenValues();
    int i10 = hierarchyPropertyParser2.getLevel();
    int i11 = hierarchyPropertyParser2.getLevel();
    java.lang.String str12 = hierarchyPropertyParser2.context();
    java.lang.String str13 = hierarchyPropertyParser2.showTree();
    java.lang.String str14 = hierarchyPropertyParser2.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null(0)[null]\n"+ "'", str13.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "null(0)[null]\n"+ "'", str14.equals("null(0)[null]\n"));

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test367"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.goToRoot();
    int i5 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.add("hi!");
    java.lang.String str8 = hierarchyPropertyParser2.fullValue();
    boolean b10 = hierarchyPropertyParser2.goDown("hi!");
    java.lang.String str11 = hierarchyPropertyParser2.getSeperator();
    int i12 = hierarchyPropertyParser2.getLevel();
    int i13 = hierarchyPropertyParser2.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "."+ "'", str11.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test368"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str7 = hierarchyPropertyParser2.showTree();
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser2.search(vector8, "hi!");
    hierarchyPropertyParser2.add("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null(0)[null]\n"+ "'", str7.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test369"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.build("", ".");
    int i6 = hierarchyPropertyParser2.getLevel();
    java.lang.String[] str_array7 = hierarchyPropertyParser2.childrenValues();
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str10 = hierarchyPropertyParser2.getValue();
    java.lang.String str11 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.goToRoot();
    java.util.Vector vector13 = null;
    int i15 = hierarchyPropertyParser2.search(vector13, "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "."+ "'", str11.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-1));

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test370"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.goToRoot();
    int i5 = hierarchyPropertyParser2.depth();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.childrenValues();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str8 = hierarchyPropertyParser2.getValue();
    java.util.Vector vector9 = null;
    int i11 = hierarchyPropertyParser2.search(vector9, ".");
    int i12 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test371"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.build("", ".");
    int i6 = hierarchyPropertyParser2.getLevel();
    int i7 = hierarchyPropertyParser2.getLevel();
    java.lang.String[] str_array8 = hierarchyPropertyParser2.childrenValues();
    java.lang.String str9 = hierarchyPropertyParser2.showTree();
    java.lang.String str10 = hierarchyPropertyParser2.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null(0)[null]\n"+ "'", str9.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test372"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    boolean b5 = hierarchyPropertyParser2.goDown("hi!");
    boolean b6 = hierarchyPropertyParser2.isLeafReached();
    int i7 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.build("", "hi!(0)[null]\n");
    java.lang.String str11 = hierarchyPropertyParser2.fullValue();
    java.lang.String str12 = hierarchyPropertyParser2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test373"); }


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
    boolean b16 = hierarchyPropertyParser2.contains("null(0)[null]\n(0)[null]\n");
    java.lang.String str17 = hierarchyPropertyParser2.getSeperator();
    boolean b19 = hierarchyPropertyParser2.contains("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "."+ "'", str17.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test374"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str7 = hierarchyPropertyParser2.showTree();
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser2.search(vector8, "hi!");
    boolean b11 = hierarchyPropertyParser2.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null(0)[null]\n"+ "'", str7.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test375"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.build("", ".");
    int i6 = hierarchyPropertyParser2.getLevel();
    boolean b8 = hierarchyPropertyParser2.isHierachic("");
    hierarchyPropertyParser2.goToRoot();
    boolean b10 = hierarchyPropertyParser2.isRootReached();
    boolean b12 = hierarchyPropertyParser2.goToChild("");
    int i13 = hierarchyPropertyParser2.getLevel();
    java.lang.String str14 = hierarchyPropertyParser2.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test376"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.build("", ".");
    int i6 = hierarchyPropertyParser2.getLevel();
    boolean b8 = hierarchyPropertyParser2.isHierachic("");
    boolean b9 = hierarchyPropertyParser2.isLeafReached();
    boolean b10 = hierarchyPropertyParser2.isRootReached();
    java.lang.String[] str_array12 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.add("null(0)[null]\n");
    java.lang.String str15 = hierarchyPropertyParser2.parentValue();
    boolean b16 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.goToParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test377"); }


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
    java.lang.String str18 = hierarchyPropertyParser2.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test378"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    int i6 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.goToParent();
    int i8 = hierarchyPropertyParser2.numChildren();
    boolean b10 = hierarchyPropertyParser2.goDown("null(0)[null]\n");
    int i11 = hierarchyPropertyParser2.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test379"); }


    // The following exception was thrown during execution in test generation
    try {
    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n(0)[null]\n", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test380"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    boolean b7 = hierarchyPropertyParser2.isRootReached();
    hierarchyPropertyParser2.build("hi!", "hi!(0)[null]\n");
    boolean b11 = hierarchyPropertyParser2.isLeafReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test381"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.setSeperator("hi!");
    int i8 = hierarchyPropertyParser2.getLevel();
    java.lang.String str9 = hierarchyPropertyParser2.showTree();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser2.build("null(0)[null]\n(0)[null]\n", "hi!");
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
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null(0)[null]\n"+ "'", str9.equals("null(0)[null]\n"));

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test382"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.build("", ".");
    int i6 = hierarchyPropertyParser2.getLevel();
    boolean b8 = hierarchyPropertyParser2.isHierachic("");
    int i9 = hierarchyPropertyParser2.numChildren();
    int i10 = hierarchyPropertyParser2.depth();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.childrenValues();
    boolean b13 = hierarchyPropertyParser2.contains("hi!");
    int i14 = hierarchyPropertyParser2.depth();
    java.lang.String str15 = hierarchyPropertyParser2.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "."+ "'", str15.equals("."));

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test383"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!(0)[null]\n");
    // The following exception was thrown during execution in test generation
    try {
    boolean b4 = hierarchyPropertyParser2.contains("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test384"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    int i4 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToRoot();
    boolean b7 = hierarchyPropertyParser2.isHierachic(".");
    boolean b8 = hierarchyPropertyParser2.isLeafReached();
    boolean b10 = hierarchyPropertyParser2.isHierachic("");
    java.lang.String[] str_array12 = hierarchyPropertyParser2.tokenize("hi!");
    boolean b14 = hierarchyPropertyParser2.isHierachic(".");
    boolean b16 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test385"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    int i4 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    boolean b8 = hierarchyPropertyParser2.isHierachic("hi!(0)[null]\n");
    boolean b10 = hierarchyPropertyParser2.goToChild("null(0)[null]\n(0)[null]\n");
    hierarchyPropertyParser2.goToParent();
    boolean b13 = hierarchyPropertyParser2.isHierachic("hi!(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test386"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    boolean b7 = hierarchyPropertyParser2.isRootReached();
    boolean b9 = hierarchyPropertyParser2.goDown("hi!(0)[null]\n");
    java.lang.String str10 = hierarchyPropertyParser2.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test387"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isRootReached();
    boolean b5 = hierarchyPropertyParser2.isHierachic("");
    int i6 = hierarchyPropertyParser2.numChildren();
    boolean b7 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str8 = hierarchyPropertyParser2.fullValue();
    java.lang.String str9 = hierarchyPropertyParser2.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test388"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    java.lang.String str6 = hierarchyPropertyParser2.parentValue();
    java.lang.String str7 = hierarchyPropertyParser2.getValue();
    int i8 = hierarchyPropertyParser2.numChildren();
    java.lang.String str9 = hierarchyPropertyParser2.getSeperator();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("hi!(0)[null]\n");
    boolean b12 = hierarchyPropertyParser2.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "."+ "'", str9.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test389"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.goToParent();
    boolean b7 = hierarchyPropertyParser2.goToChild("");
    boolean b8 = hierarchyPropertyParser2.isRootReached();
    int i9 = hierarchyPropertyParser2.depth();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize(".");
    boolean b13 = hierarchyPropertyParser2.goDown("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test390"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    int i4 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    java.lang.String str7 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str9 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str10 = hierarchyPropertyParser2.getValue();
    java.lang.String[] str_array12 = hierarchyPropertyParser2.tokenize("hi!");
    boolean b14 = hierarchyPropertyParser2.goToChild("");
    hierarchyPropertyParser2.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "."+ "'", str7.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "."+ "'", str9.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test391"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.goToRoot();
    int i5 = hierarchyPropertyParser2.depth();
    int i6 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.setSeperator(".");
    hierarchyPropertyParser2.goToParent();
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
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test392"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String[] str_array4 = hierarchyPropertyParser2.childrenValues();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.childrenValues();
    hierarchyPropertyParser2.setSeperator("hi!(0)[null]\n");
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test393"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str6 = hierarchyPropertyParser2.context();
    int i7 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.add("null(0)[null]\n");
    int i10 = hierarchyPropertyParser2.numChildren();
    boolean b11 = hierarchyPropertyParser2.isLeafReached();
    boolean b12 = hierarchyPropertyParser2.isLeafReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test394"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.setSeperator("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test395"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str5 = hierarchyPropertyParser2.parentValue();
    hierarchyPropertyParser2.setSeperator(".");
    int i8 = hierarchyPropertyParser2.numChildren();
    java.util.Vector vector9 = null;
    int i11 = hierarchyPropertyParser2.search(vector9, "null(0)[null]\n");
    java.lang.String str12 = hierarchyPropertyParser2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test396"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str6 = hierarchyPropertyParser2.context();
    int i7 = hierarchyPropertyParser2.getLevel();
    java.lang.String str8 = hierarchyPropertyParser2.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test397"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    boolean b9 = hierarchyPropertyParser2.goDown("null(0)[null]\n");
    int i10 = hierarchyPropertyParser2.depth();
    boolean b11 = hierarchyPropertyParser2.isRootReached();
    boolean b12 = hierarchyPropertyParser2.isLeafReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test398"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    boolean b5 = hierarchyPropertyParser2.goDown("hi!");
    boolean b6 = hierarchyPropertyParser2.isLeafReached();
    int i7 = hierarchyPropertyParser2.depth();
    int i8 = hierarchyPropertyParser2.depth();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.childrenValues();
    java.lang.String[] str_array10 = hierarchyPropertyParser2.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test399"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str6 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.add("hi!");
    java.lang.String str11 = hierarchyPropertyParser2.fullValue();
    java.lang.String str12 = hierarchyPropertyParser2.showTree();
    boolean b13 = hierarchyPropertyParser2.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "."+ "'", str6.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!(0)[null]\n"+ "'", str12.equals("hi!(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test400"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    boolean b9 = hierarchyPropertyParser2.goDown("null(0)[null]\n");
    hierarchyPropertyParser2.goToParent();
    java.util.Vector vector11 = null;
    int i13 = hierarchyPropertyParser2.search(vector11, "null(0)[null]\n");
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
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test401"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    int i6 = hierarchyPropertyParser2.getLevel();
    java.lang.String[] str_array8 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    hierarchyPropertyParser2.add("null(0)[null]\n");
    java.lang.String[] str_array12 = hierarchyPropertyParser2.tokenize(".");
    java.lang.String str13 = hierarchyPropertyParser2.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null(0)[null]\n"+ "'", str13.equals("null(0)[null]\n"));

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test402"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.build("", ".");
    int i6 = hierarchyPropertyParser2.getLevel();
    boolean b8 = hierarchyPropertyParser2.isHierachic("");
    boolean b9 = hierarchyPropertyParser2.isLeafReached();
    boolean b10 = hierarchyPropertyParser2.isRootReached();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.childrenValues();
    java.util.Vector vector12 = null;
    int i14 = hierarchyPropertyParser2.search(vector12, "");
    boolean b16 = hierarchyPropertyParser2.isHierachic("hi!(0)[null]\n");
    java.lang.String str17 = hierarchyPropertyParser2.context();
    java.lang.String str18 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.setSeperator("hi!(0)[null]\n(0)[null]\n");
    // The following exception was thrown during execution in test generation
    try {
    boolean b22 = hierarchyPropertyParser2.contains("");
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
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test403"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    int i4 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    java.lang.String str7 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str9 = hierarchyPropertyParser2.getSeperator();
    java.lang.String[] str_array10 = hierarchyPropertyParser2.childrenValues();
    int i11 = hierarchyPropertyParser2.depth();
    boolean b12 = hierarchyPropertyParser2.isRootReached();
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
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "."+ "'", str7.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "."+ "'", str9.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test404"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    int i4 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.goToRoot();
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
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test405"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.build("", ".");
    int i6 = hierarchyPropertyParser2.getLevel();
    java.util.Vector vector7 = null;
    int i9 = hierarchyPropertyParser2.search(vector7, "null(0)[null]\n");
    boolean b10 = hierarchyPropertyParser2.isLeafReached();
    boolean b12 = hierarchyPropertyParser2.isHierachic("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test406"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String[] str_array4 = hierarchyPropertyParser2.childrenValues();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.childrenValues();
    hierarchyPropertyParser2.setSeperator("hi!(0)[null]\n");
    java.lang.String str8 = hierarchyPropertyParser2.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!(0)[null]\n"+ "'", str8.equals("hi!(0)[null]\n"));

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test407"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    java.lang.String str6 = hierarchyPropertyParser2.parentValue();
    java.lang.String[] str_array7 = hierarchyPropertyParser2.childrenValues();
    boolean b9 = hierarchyPropertyParser2.isHierachic("");
    java.lang.String[] str_array10 = hierarchyPropertyParser2.childrenValues();
    java.lang.String str11 = hierarchyPropertyParser2.showTree();
    java.lang.String str12 = hierarchyPropertyParser2.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null(0)[null]\n"+ "'", str11.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test408"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    boolean b7 = hierarchyPropertyParser2.isRootReached();
    boolean b9 = hierarchyPropertyParser2.goDown("hi!(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test409"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    java.lang.String str3 = hierarchyPropertyParser2.fullValue();
    int i4 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.add("null(0)[null]\n");
    java.lang.String str7 = hierarchyPropertyParser2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null(0)[null]\n"+ "'", str7.equals("null(0)[null]\n"));

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test410"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.setSeperator(".");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "hi!");
    hierarchyPropertyParser0.goToRoot();
    boolean b8 = hierarchyPropertyParser0.isHierachic(".");
    java.lang.String[] str_array9 = hierarchyPropertyParser0.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test411"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!(0)[null]\n", "hi!(0)[null]\n");
    java.lang.String str3 = hierarchyPropertyParser2.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test412"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    java.lang.String str3 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str4 = hierarchyPropertyParser2.getSeperator();
    boolean b6 = hierarchyPropertyParser2.isHierachic("");
    java.lang.String[] str_array7 = hierarchyPropertyParser2.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "."+ "'", str3.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "."+ "'", str4.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test413"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.add("hi!");
    int i5 = hierarchyPropertyParser2.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test414"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.build("", ".");
    int i6 = hierarchyPropertyParser2.getLevel();
    boolean b8 = hierarchyPropertyParser2.isHierachic("");
    boolean b9 = hierarchyPropertyParser2.isLeafReached();
    boolean b10 = hierarchyPropertyParser2.isRootReached();
    java.lang.String[] str_array12 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.add("null(0)[null]\n");
    java.lang.String str15 = hierarchyPropertyParser2.parentValue();
    java.lang.String str16 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str17 = hierarchyPropertyParser2.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "."+ "'", str16.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "null(0)[null]\n"+ "'", str17.equals("null(0)[null]\n"));

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test415"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    boolean b7 = hierarchyPropertyParser2.isRootReached();
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser2.search(vector8, "null(0)[null]\n");
    java.lang.String str11 = hierarchyPropertyParser2.getValue();
    java.lang.String str12 = hierarchyPropertyParser2.getValue();
    int i13 = hierarchyPropertyParser2.depth();
    java.lang.String[] str_array14 = hierarchyPropertyParser2.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test416"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str6 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.add("hi!");
    java.lang.String str11 = hierarchyPropertyParser2.fullValue();
    java.lang.String str12 = hierarchyPropertyParser2.showTree();
    boolean b14 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    java.lang.String str15 = hierarchyPropertyParser2.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "."+ "'", str6.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!(0)[null]\n"+ "'", str12.equals("hi!(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test417"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    int i4 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToRoot();
    boolean b7 = hierarchyPropertyParser2.isHierachic(".");
    boolean b8 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.childrenValues();
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.childrenValues();
    java.lang.String[] str_array12 = hierarchyPropertyParser2.childrenValues();
    java.lang.String str13 = hierarchyPropertyParser2.parentValue();
    java.util.Vector vector14 = null;
    int i16 = hierarchyPropertyParser2.search(vector14, "null(0)[null]\n(0)[null]\n");
    java.lang.String str17 = hierarchyPropertyParser2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test418"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    boolean b6 = hierarchyPropertyParser2.goDown(".");
    boolean b8 = hierarchyPropertyParser2.goToChild("");
    boolean b10 = hierarchyPropertyParser2.goToChild("");
    java.lang.String[] str_array12 = hierarchyPropertyParser2.tokenize(".");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test419"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    java.lang.String str3 = hierarchyPropertyParser2.getValue();
    hierarchyPropertyParser2.goToRoot();
    boolean b6 = hierarchyPropertyParser2.goToChild("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test420"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    int i4 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str6 = hierarchyPropertyParser2.parentValue();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str8 = hierarchyPropertyParser2.showTree();
    boolean b10 = hierarchyPropertyParser2.isHierachic("");
    java.lang.String str11 = hierarchyPropertyParser2.getSeperator();
    boolean b13 = hierarchyPropertyParser2.goToChild("null(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null(0)[null]\n"+ "'", str8.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "."+ "'", str11.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test421"); }


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
    hierarchyPropertyParser2.build("hi!(0)[null]\n(0)[null]\n", "hi!(0)[null]\n");
    boolean b18 = hierarchyPropertyParser2.goDown("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test422"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    int i6 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.add("null(0)[null]\n(0)[null]\n");
    java.lang.String str10 = hierarchyPropertyParser2.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test423"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isRootReached();
    boolean b5 = hierarchyPropertyParser2.isHierachic("");
    int i6 = hierarchyPropertyParser2.numChildren();
    boolean b7 = hierarchyPropertyParser2.isRootReached();
    boolean b9 = hierarchyPropertyParser2.isHierachic(".");
    boolean b11 = hierarchyPropertyParser2.goToChild("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test424"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    int i4 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    java.lang.String str7 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str9 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str10 = hierarchyPropertyParser2.getValue();
    java.lang.String str11 = hierarchyPropertyParser2.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "."+ "'", str7.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "."+ "'", str9.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test425"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    boolean b5 = hierarchyPropertyParser2.goDown("hi!");
    int i6 = hierarchyPropertyParser2.depth();
    java.lang.String str7 = hierarchyPropertyParser2.fullValue();
    boolean b9 = hierarchyPropertyParser2.contains("null(0)[null]\n");
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("hi!");
    boolean b13 = hierarchyPropertyParser2.isHierachic("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test426"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.build("", ".");
    int i6 = hierarchyPropertyParser2.getLevel();
    java.lang.String str7 = hierarchyPropertyParser2.getSeperator();
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser2.search(vector8, "");
    boolean b12 = hierarchyPropertyParser2.isHierachic("");
    hierarchyPropertyParser2.setSeperator("hi!");
    int i15 = hierarchyPropertyParser2.depth();
    java.lang.String str16 = hierarchyPropertyParser2.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "."+ "'", str7.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test427"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.parentValue();
    hierarchyPropertyParser2.add("hi!");
    int i8 = hierarchyPropertyParser2.depth();
    boolean b10 = hierarchyPropertyParser2.goTo("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test428"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    int i4 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.add("null(0)[null]\n");
    java.util.Vector vector7 = null;
    int i9 = hierarchyPropertyParser2.search(vector7, "");
    java.lang.String str10 = hierarchyPropertyParser2.getValue();
    boolean b12 = hierarchyPropertyParser2.contains("null(0)[null]\n");
    boolean b13 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.goToParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test429"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    int i6 = hierarchyPropertyParser2.getLevel();
    boolean b8 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n");
    java.lang.String str9 = hierarchyPropertyParser2.parentValue();
    java.lang.String str10 = hierarchyPropertyParser2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test430"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str4 = hierarchyPropertyParser2.getValue();
    hierarchyPropertyParser2.goToRoot();
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
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test431"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    java.lang.String str3 = hierarchyPropertyParser2.parentValue();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.setSeperator("hi!");
    java.lang.String[] str_array8 = hierarchyPropertyParser2.tokenize("null(0)[null]\n(0)[null]\n");
    boolean b10 = hierarchyPropertyParser2.goToChild("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test432"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.childrenValues();
    boolean b7 = hierarchyPropertyParser2.goDown("hi!");
    java.lang.String str8 = hierarchyPropertyParser2.fullValue();
    int i9 = hierarchyPropertyParser2.getLevel();
    int i10 = hierarchyPropertyParser2.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test433"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("hi!");
    int i7 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.goToParent();
    java.util.Vector vector9 = null;
    int i11 = hierarchyPropertyParser2.search(vector9, "");
    boolean b12 = hierarchyPropertyParser2.isLeafReached();
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
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test434"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.setSeperator("hi!");
    java.lang.String str8 = hierarchyPropertyParser2.fullValue();
    java.util.Vector vector9 = null;
    int i11 = hierarchyPropertyParser2.search(vector9, "");
    boolean b13 = hierarchyPropertyParser2.isHierachic("");
    int i14 = hierarchyPropertyParser2.depth();
    boolean b15 = hierarchyPropertyParser2.isRootReached();
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
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test435"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.goToRoot();
    int i5 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.add("hi!");
    hierarchyPropertyParser2.goToRoot();
    boolean b10 = hierarchyPropertyParser2.isHierachic(".");
    java.lang.String str11 = hierarchyPropertyParser2.getValue();
    hierarchyPropertyParser2.add("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test436"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str7 = hierarchyPropertyParser2.showTree();
    boolean b9 = hierarchyPropertyParser2.goToChild("");
    boolean b10 = hierarchyPropertyParser2.isRootReached();
    boolean b11 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n");
    boolean b15 = hierarchyPropertyParser2.isHierachic("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null(0)[null]\n"+ "'", str7.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test437"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    int i6 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.goToParent();
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser2.search(vector8, "");
    int i11 = hierarchyPropertyParser2.depth();
    int i12 = hierarchyPropertyParser2.depth();
    java.lang.String str13 = hierarchyPropertyParser2.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "."+ "'", str13.equals("."));

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test438"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.build("", ".");
    int i6 = hierarchyPropertyParser2.getLevel();
    boolean b8 = hierarchyPropertyParser2.isHierachic("");
    boolean b9 = hierarchyPropertyParser2.isLeafReached();
    boolean b10 = hierarchyPropertyParser2.isRootReached();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.childrenValues();
    java.util.Vector vector12 = null;
    int i14 = hierarchyPropertyParser2.search(vector12, "");
    boolean b16 = hierarchyPropertyParser2.isHierachic("hi!(0)[null]\n");
    java.lang.String str17 = hierarchyPropertyParser2.context();
    java.lang.String str18 = hierarchyPropertyParser2.context();
    java.lang.String str19 = hierarchyPropertyParser2.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "null(0)[null]\n"+ "'", str19.equals("null(0)[null]\n"));

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test439"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    boolean b7 = hierarchyPropertyParser2.goDown(".");
    java.lang.String str8 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n");
    hierarchyPropertyParser2.goToRoot();
    boolean b13 = hierarchyPropertyParser2.isHierachic("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test440"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.goToRoot();
    int i5 = hierarchyPropertyParser2.depth();
    int i6 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.setSeperator(".");
    boolean b10 = hierarchyPropertyParser2.goDown("");
    boolean b11 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str12 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str13 = hierarchyPropertyParser2.showTree();
    boolean b15 = hierarchyPropertyParser2.goDown("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "."+ "'", str12.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null(0)[null]\n"+ "'", str13.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test441"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.setSeperator("hi!");
    java.lang.String[] str_array7 = hierarchyPropertyParser2.childrenValues();
    java.lang.String str8 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str10 = hierarchyPropertyParser2.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test442"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.goToParent();
    boolean b7 = hierarchyPropertyParser2.goToChild("");
    boolean b8 = hierarchyPropertyParser2.isRootReached();
    int i9 = hierarchyPropertyParser2.depth();
    boolean b10 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str11 = hierarchyPropertyParser2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test443"); }


    // The following exception was thrown during execution in test generation
    try {
    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!(0)[null]\n(0)[null]\n", "null(0)[null]\n(0)[null]\n");
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test444"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    boolean b5 = hierarchyPropertyParser2.goDown("hi!");
    int i6 = hierarchyPropertyParser2.depth();
    java.lang.String str7 = hierarchyPropertyParser2.fullValue();
    boolean b9 = hierarchyPropertyParser2.contains("null(0)[null]\n");
    int i10 = hierarchyPropertyParser2.getLevel();
    boolean b12 = hierarchyPropertyParser2.contains("null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test445"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.build("", ".");
    int i6 = hierarchyPropertyParser2.getLevel();
    boolean b8 = hierarchyPropertyParser2.isHierachic("");
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.goToRoot();
    boolean b12 = hierarchyPropertyParser2.contains("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test446"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.add("hi!");
    boolean b7 = hierarchyPropertyParser2.goToChild("");
    boolean b9 = hierarchyPropertyParser2.isHierachic("hi!");
    hierarchyPropertyParser2.add("null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test447"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.build("", ".");
    int i6 = hierarchyPropertyParser2.getLevel();
    boolean b8 = hierarchyPropertyParser2.isHierachic("");
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.goToRoot();
    boolean b12 = hierarchyPropertyParser2.goToChild("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str14 = hierarchyPropertyParser2.parentValue();
    java.lang.String str15 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "null(0)[null]\n"+ "'", str15.equals("null(0)[null]\n"));

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test448"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String[] str_array8 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    java.lang.String str9 = hierarchyPropertyParser2.context();
    java.lang.String str10 = hierarchyPropertyParser2.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test449"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    boolean b6 = hierarchyPropertyParser2.isRootReached();
    java.util.Vector vector7 = null;
    int i9 = hierarchyPropertyParser2.search(vector7, ".");
    java.util.Vector vector10 = null;
    int i12 = hierarchyPropertyParser2.search(vector10, "hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test450"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    int i6 = hierarchyPropertyParser2.getLevel();
    boolean b8 = hierarchyPropertyParser2.isHierachic("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test451"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    int i4 = hierarchyPropertyParser2.numChildren();
    int i5 = hierarchyPropertyParser2.getLevel();
    int i6 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.goToParent();
    java.util.Vector vector9 = null;
    int i11 = hierarchyPropertyParser2.search(vector9, "");
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser2.goToChild(10);
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
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test452"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str6 = hierarchyPropertyParser2.context();
    java.lang.String str7 = hierarchyPropertyParser2.fullValue();
    boolean b8 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str9 = hierarchyPropertyParser2.showTree();
    boolean b11 = hierarchyPropertyParser2.goDown("null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null(0)[null]\n"+ "'", str9.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test453"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str7 = hierarchyPropertyParser2.showTree();
    boolean b9 = hierarchyPropertyParser2.goToChild("");
    boolean b10 = hierarchyPropertyParser2.isRootReached();
    boolean b11 = hierarchyPropertyParser2.isLeafReached();
    java.util.Vector vector12 = null;
    int i14 = hierarchyPropertyParser2.search(vector12, "null(0)[null]\n");
    java.lang.String str15 = hierarchyPropertyParser2.getValue();
    hierarchyPropertyParser2.setSeperator("hi!(0)[null]\n");
    hierarchyPropertyParser2.goToRoot();
    java.lang.String[] str_array19 = hierarchyPropertyParser2.childrenValues();
    java.lang.String str20 = hierarchyPropertyParser2.getValue();
    // The following exception was thrown during execution in test generation
    try {
    boolean b22 = hierarchyPropertyParser2.goTo(".");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null(0)[null]\n"+ "'", str7.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test454"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    java.lang.String str3 = hierarchyPropertyParser2.parentValue();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToRoot();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser2.build("null(0)[null]\n(0)[null]\n", "");
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
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test455"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.goToParent();
    int i6 = hierarchyPropertyParser2.numChildren();
    boolean b8 = hierarchyPropertyParser2.goToChild(".");
    java.lang.String str9 = hierarchyPropertyParser2.getValue();
    // The following exception was thrown during execution in test generation
    try {
    boolean b11 = hierarchyPropertyParser2.contains(".");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test456"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b4 = hierarchyPropertyParser2.goToChild("");
    boolean b6 = hierarchyPropertyParser2.goToChild("");
    int i7 = hierarchyPropertyParser2.getLevel();
    boolean b9 = hierarchyPropertyParser2.goToChild("hi!");
    
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
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test457"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    boolean b9 = hierarchyPropertyParser2.goDown("null(0)[null]\n");
    int i10 = hierarchyPropertyParser2.depth();
    boolean b11 = hierarchyPropertyParser2.isRootReached();
    java.util.Vector vector12 = null;
    int i14 = hierarchyPropertyParser2.search(vector12, "");
    java.lang.String[] str_array16 = hierarchyPropertyParser2.tokenize("hi!");
    boolean b18 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n");
    java.lang.String str19 = hierarchyPropertyParser2.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "."+ "'", str19.equals("."));

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test458"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToRoot();
    boolean b8 = hierarchyPropertyParser2.contains("hi!");
    boolean b10 = hierarchyPropertyParser2.contains("hi!");
    int i11 = hierarchyPropertyParser2.numChildren();
    java.lang.String[] str_array13 = hierarchyPropertyParser2.tokenize(".");
    boolean b15 = hierarchyPropertyParser2.goDown("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test459"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getValue();
    java.lang.String[] str_array7 = hierarchyPropertyParser2.tokenize("");
    java.lang.String[] str_array9 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    boolean b11 = hierarchyPropertyParser2.goToChild(".");
    java.lang.String str12 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str13 = hierarchyPropertyParser2.parentValue();
    int i14 = hierarchyPropertyParser2.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "."+ "'", str12.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test460"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isRootReached();
    boolean b5 = hierarchyPropertyParser2.isHierachic("");
    int i6 = hierarchyPropertyParser2.numChildren();
    java.lang.String str7 = hierarchyPropertyParser2.fullValue();
    java.lang.String str8 = hierarchyPropertyParser2.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
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
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test461"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.add("null(0)[null]\n(0)[null]\n");
    hierarchyPropertyParser2.goToParent();
    int i10 = hierarchyPropertyParser2.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test462"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    java.util.Vector vector6 = null;
    int i8 = hierarchyPropertyParser2.search(vector6, ".");
    boolean b10 = hierarchyPropertyParser2.goToChild("");
    int i11 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n");
    java.lang.String str14 = hierarchyPropertyParser2.getValue();
    int i15 = hierarchyPropertyParser2.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test463"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.build("", ".");
    int i6 = hierarchyPropertyParser2.getLevel();
    java.lang.String[] str_array7 = hierarchyPropertyParser2.childrenValues();
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str10 = hierarchyPropertyParser2.getValue();
    java.lang.String str11 = hierarchyPropertyParser2.getSeperator();
    int i12 = hierarchyPropertyParser2.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "."+ "'", str11.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test464"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    boolean b5 = hierarchyPropertyParser2.goDown("hi!");
    int i6 = hierarchyPropertyParser2.depth();
    boolean b7 = hierarchyPropertyParser2.isRootReached();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str9 = hierarchyPropertyParser2.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null(0)[null]\n"+ "'", str9.equals("null(0)[null]\n"));

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test465"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    boolean b7 = hierarchyPropertyParser2.goDown(".");
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser2.search(vector8, ".");
    java.lang.String str11 = hierarchyPropertyParser2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test466"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.build("", ".");
    int i6 = hierarchyPropertyParser2.getLevel();
    boolean b8 = hierarchyPropertyParser2.isHierachic("");
    hierarchyPropertyParser2.goToRoot();
    boolean b10 = hierarchyPropertyParser2.isRootReached();
    boolean b12 = hierarchyPropertyParser2.goToChild("");
    int i13 = hierarchyPropertyParser2.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test467"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    boolean b5 = hierarchyPropertyParser2.goDown("hi!");
    java.lang.String[] str_array6 = hierarchyPropertyParser2.childrenValues();
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test468"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.build("", ".");
    int i6 = hierarchyPropertyParser2.getLevel();
    boolean b8 = hierarchyPropertyParser2.isHierachic("");
    boolean b9 = hierarchyPropertyParser2.isLeafReached();
    boolean b10 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n(0)[null]\n");
    boolean b14 = hierarchyPropertyParser2.goDown("null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test469"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str6 = hierarchyPropertyParser2.context();
    java.lang.String str7 = hierarchyPropertyParser2.fullValue();
    boolean b8 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str9 = hierarchyPropertyParser2.showTree();
    int i10 = hierarchyPropertyParser2.numChildren();
    int i11 = hierarchyPropertyParser2.depth();
    java.lang.String str12 = hierarchyPropertyParser2.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null(0)[null]\n"+ "'", str9.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null(0)[null]\n"+ "'", str12.equals("null(0)[null]\n"));

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test470"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.childrenValues();
    hierarchyPropertyParser2.setSeperator("hi!");
    java.lang.String[] str_array8 = hierarchyPropertyParser2.childrenValues();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.childrenValues();
    java.lang.String str10 = hierarchyPropertyParser2.fullValue();
    boolean b12 = hierarchyPropertyParser2.isHierachic(".");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test471"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    java.lang.String str6 = hierarchyPropertyParser2.parentValue();
    java.lang.String str7 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str9 = hierarchyPropertyParser2.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "."+ "'", str9.equals("."));

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test472"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    java.lang.String str6 = hierarchyPropertyParser2.parentValue();
    java.lang.String str7 = hierarchyPropertyParser2.getValue();
    int i8 = hierarchyPropertyParser2.numChildren();
    java.lang.String str9 = hierarchyPropertyParser2.getSeperator();
    boolean b10 = hierarchyPropertyParser2.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "."+ "'", str9.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test473"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    int i6 = hierarchyPropertyParser2.getLevel();
    java.lang.String str7 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str9 = hierarchyPropertyParser2.getValue();
    boolean b10 = hierarchyPropertyParser2.isRootReached();
    java.lang.String[] str_array12 = hierarchyPropertyParser2.tokenize("hi!(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "."+ "'", str7.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test474"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.build("", ".");
    int i6 = hierarchyPropertyParser2.getLevel();
    java.lang.String str7 = hierarchyPropertyParser2.getSeperator();
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser2.search(vector8, "");
    java.lang.String str11 = hierarchyPropertyParser2.getSeperator();
    java.lang.String[] str_array12 = hierarchyPropertyParser2.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "."+ "'", str7.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "."+ "'", str11.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test475"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.setSeperator("hi!");
    int i8 = hierarchyPropertyParser2.getLevel();
    boolean b9 = hierarchyPropertyParser2.isRootReached();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str11 = hierarchyPropertyParser2.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test476"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.build("", ".");
    int i6 = hierarchyPropertyParser2.getLevel();
    boolean b8 = hierarchyPropertyParser2.isHierachic("");
    hierarchyPropertyParser2.goToRoot();
    boolean b10 = hierarchyPropertyParser2.isRootReached();
    boolean b12 = hierarchyPropertyParser2.goToChild("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str14 = hierarchyPropertyParser2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test477"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str6 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array8 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    java.lang.String[] str_array9 = hierarchyPropertyParser2.childrenValues();
    boolean b11 = hierarchyPropertyParser2.goDown("hi!");
    java.lang.String str12 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null(0)[null]\n"+ "'", str12.equals("null(0)[null]\n"));

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test478"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    int i6 = hierarchyPropertyParser2.getLevel();
    java.lang.String[] str_array8 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    hierarchyPropertyParser2.goToParent();
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
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test479"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.setSeperator(".");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "hi!");
    hierarchyPropertyParser0.goToRoot();
    boolean b8 = hierarchyPropertyParser0.isHierachic(".");
    boolean b10 = hierarchyPropertyParser0.isHierachic("hi!");
    java.lang.String str11 = hierarchyPropertyParser0.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test480"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.build("", ".");
    int i6 = hierarchyPropertyParser2.getLevel();
    boolean b8 = hierarchyPropertyParser2.isHierachic("");
    int i9 = hierarchyPropertyParser2.numChildren();
    int i10 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str12 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str13 = hierarchyPropertyParser2.getValue();
    int i14 = hierarchyPropertyParser2.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "."+ "'", str12.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test481"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.goToRoot();
    int i5 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.add("hi!");
    hierarchyPropertyParser2.goToRoot();
    boolean b10 = hierarchyPropertyParser2.isHierachic(".");
    int i11 = hierarchyPropertyParser2.numChildren();
    boolean b13 = hierarchyPropertyParser2.goToChild(".");
    java.lang.String str14 = hierarchyPropertyParser2.showTree();
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
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!(0)[null]\n"+ "'", str14.equals("hi!(0)[null]\n"));

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test482"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str5 = hierarchyPropertyParser2.parentValue();
    hierarchyPropertyParser2.setSeperator(".");
    int i8 = hierarchyPropertyParser2.numChildren();
    java.util.Vector vector9 = null;
    int i11 = hierarchyPropertyParser2.search(vector9, "null(0)[null]\n");
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n(0)[null]\n");
    // The following exception was thrown during execution in test generation
    try {
    boolean b15 = hierarchyPropertyParser2.contains("null(0)[null]\n(0)[null]\n");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test483"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.goToRoot();
    int i5 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("hi!");
    boolean b9 = hierarchyPropertyParser2.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test484"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    boolean b5 = hierarchyPropertyParser2.goDown("hi!");
    int i6 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.setSeperator(".");
    java.lang.String str9 = hierarchyPropertyParser2.getSeperator();
    boolean b11 = hierarchyPropertyParser2.goDown("hi!(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "."+ "'", str9.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test485"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str5 = hierarchyPropertyParser2.showTree();
    java.lang.String str6 = hierarchyPropertyParser2.getValue();
    boolean b8 = hierarchyPropertyParser2.isHierachic(".");
    java.util.Vector vector9 = null;
    int i11 = hierarchyPropertyParser2.search(vector9, "");
    hierarchyPropertyParser2.setSeperator(".");
    java.lang.String str14 = hierarchyPropertyParser2.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null(0)[null]\n"+ "'", str5.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test486"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    int i4 = hierarchyPropertyParser2.numChildren();
    int i5 = hierarchyPropertyParser2.getLevel();
    int i6 = hierarchyPropertyParser2.depth();
    int i7 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n");
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str11 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.setSeperator(".");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null(0)[null]\n"+ "'", str11.equals("null(0)[null]\n"));

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test487"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.goToRoot();
    int i5 = hierarchyPropertyParser2.depth();
    int i6 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.setSeperator(".");
    boolean b10 = hierarchyPropertyParser2.goDown("");
    hierarchyPropertyParser2.add("hi!(0)[null]\n");
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser2.build("hi!", "null(0)[null]\n(0)[null]\n");
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
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test488"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    hierarchyPropertyParser2.build("", ".");
    int i6 = hierarchyPropertyParser2.getLevel();
    boolean b8 = hierarchyPropertyParser2.isHierachic("");
    boolean b9 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    java.lang.String str11 = hierarchyPropertyParser2.parentValue();
    java.lang.String str12 = hierarchyPropertyParser2.getValue();
    hierarchyPropertyParser2.setSeperator("hi!");
    // The following exception was thrown during execution in test generation
    try {
    boolean b16 = hierarchyPropertyParser2.goDown("hi!");
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
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test489"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    java.lang.String str6 = hierarchyPropertyParser2.parentValue();
    java.lang.String str7 = hierarchyPropertyParser2.getValue();
    int i8 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.add("hi!(0)[null]\n");
    int i11 = hierarchyPropertyParser2.getLevel();
    int i12 = hierarchyPropertyParser2.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test490"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    boolean b6 = hierarchyPropertyParser2.goDown(".");
    java.lang.String[] str_array8 = hierarchyPropertyParser2.tokenize(".");
    java.util.Vector vector9 = null;
    int i11 = hierarchyPropertyParser2.search(vector9, "hi!(0)[null]\n");
    int i12 = hierarchyPropertyParser2.getLevel();
    java.lang.String str13 = hierarchyPropertyParser2.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null(0)[null]\n"+ "'", str13.equals("null(0)[null]\n"));

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test491"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str7 = hierarchyPropertyParser2.showTree();
    boolean b9 = hierarchyPropertyParser2.goToChild("");
    java.util.Vector vector10 = null;
    int i12 = hierarchyPropertyParser2.search(vector10, "");
    int i13 = hierarchyPropertyParser2.numChildren();
    java.lang.String str14 = hierarchyPropertyParser2.getValue();
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
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null(0)[null]\n"+ "'", str7.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test492"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.tokenize("");
    java.lang.String str6 = hierarchyPropertyParser2.parentValue();
    java.util.Vector vector7 = null;
    int i9 = hierarchyPropertyParser2.search(vector7, "");
    boolean b10 = hierarchyPropertyParser2.isLeafReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test493"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String[] str_array8 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    java.lang.String str9 = hierarchyPropertyParser2.context();
    boolean b10 = hierarchyPropertyParser2.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test494"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    int i4 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToRoot();
    boolean b7 = hierarchyPropertyParser2.isHierachic(".");
    boolean b8 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.childrenValues();
    int i10 = hierarchyPropertyParser2.getLevel();
    java.lang.String str11 = hierarchyPropertyParser2.context();
    boolean b12 = hierarchyPropertyParser2.isLeafReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test495"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    int i4 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str6 = hierarchyPropertyParser2.parentValue();
    boolean b8 = hierarchyPropertyParser2.goDown("hi!");
    java.util.Vector vector9 = null;
    int i11 = hierarchyPropertyParser2.search(vector9, "hi!(0)[null]\n");
    java.lang.String str12 = hierarchyPropertyParser2.showTree();
    java.lang.String str13 = hierarchyPropertyParser2.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null(0)[null]\n"+ "'", str12.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null(0)[null]\n"+ "'", str13.equals("null(0)[null]\n"));

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test496"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str5 = hierarchyPropertyParser2.parentValue();
    java.lang.String str6 = hierarchyPropertyParser2.context();
    java.lang.String str7 = hierarchyPropertyParser2.getValue();
    java.lang.String str8 = hierarchyPropertyParser2.getValue();
    java.lang.String str9 = hierarchyPropertyParser2.getValue();
    java.lang.String str10 = hierarchyPropertyParser2.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "."+ "'", str10.equals("."));

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test497"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    boolean b9 = hierarchyPropertyParser2.goDown("null(0)[null]\n");
    java.lang.String str10 = hierarchyPropertyParser2.getValue();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String[] str_array14 = hierarchyPropertyParser2.tokenize("null(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test498"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    boolean b5 = hierarchyPropertyParser2.goDown("hi!");
    java.lang.String[] str_array7 = hierarchyPropertyParser2.tokenize("");
    boolean b9 = hierarchyPropertyParser2.goDown("hi!");
    java.lang.String str10 = hierarchyPropertyParser2.getSeperator();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "."+ "'", str10.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test499"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    int i3 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str5 = hierarchyPropertyParser2.getValue();
    boolean b7 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    boolean b8 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str9 = hierarchyPropertyParser2.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null(0)[null]\n"+ "'", str9.equals("null(0)[null]\n"));

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test500"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.goToParent();
    boolean b7 = hierarchyPropertyParser2.goToChild("");
    boolean b8 = hierarchyPropertyParser2.isRootReached();
    int i9 = hierarchyPropertyParser2.depth();
    boolean b11 = hierarchyPropertyParser2.goDown("hi!");
    java.lang.String str12 = hierarchyPropertyParser2.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "."+ "'", str12.equals("."));

  }

}
