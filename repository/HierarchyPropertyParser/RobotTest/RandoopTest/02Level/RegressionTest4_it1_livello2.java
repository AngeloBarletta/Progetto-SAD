
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test001"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToParent();
    boolean b7 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser0.search(vector8, "null(0)[null]\n");
    java.lang.String str11 = hierarchyPropertyParser0.fullValue();
    java.lang.String str12 = hierarchyPropertyParser0.getValue();
    boolean b14 = hierarchyPropertyParser0.contains("hi!(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test002"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    int i3 = hierarchyPropertyParser2.numChildren();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.childrenValues();
    int i6 = hierarchyPropertyParser2.getLevel();
    java.lang.String str7 = hierarchyPropertyParser2.getValue();
    java.lang.String str8 = hierarchyPropertyParser2.getSeperator();
    boolean b10 = hierarchyPropertyParser2.goDown("");
    boolean b12 = hierarchyPropertyParser2.isHierachic("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "."+ "'", str8.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test003"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    int i3 = hierarchyPropertyParser2.numChildren();
    boolean b5 = hierarchyPropertyParser2.isHierachic("hi!");
    int i6 = hierarchyPropertyParser2.depth();
    boolean b7 = hierarchyPropertyParser2.isRootReached();
    hierarchyPropertyParser2.build("null(0)[null]\n", "null(0)[null]\n");
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser2.build(".(0)[null]\n", "hi!(0)[null]\n(0)[null]\n");
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test004"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    boolean b7 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str8 = hierarchyPropertyParser0.context();
    java.lang.String[] str_array9 = hierarchyPropertyParser0.childrenValues();
    hierarchyPropertyParser0.setSeperator("null(0)[null]\n");
    java.lang.String str12 = hierarchyPropertyParser0.showTree();
    int i13 = hierarchyPropertyParser0.getLevel();
    int i14 = hierarchyPropertyParser0.depth();
    hierarchyPropertyParser0.build("hi!", "hi!");
    java.lang.String str18 = hierarchyPropertyParser0.parentValue();
    java.lang.String str19 = hierarchyPropertyParser0.fullValue();
    boolean b21 = hierarchyPropertyParser0.isHierachic("");
    java.lang.String[] str_array22 = hierarchyPropertyParser0.childrenValues();
    boolean b24 = hierarchyPropertyParser0.goDown("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null(0)[null]\n"+ "'", str12.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test005"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    java.lang.String[] str_array5 = hierarchyPropertyParser0.childrenValues();
    boolean b7 = hierarchyPropertyParser0.goDown("hi!");
    boolean b9 = hierarchyPropertyParser0.goDown("hi!");
    boolean b11 = hierarchyPropertyParser0.goToChild("");
    boolean b12 = hierarchyPropertyParser0.isRootReached();
    java.lang.String[] str_array14 = hierarchyPropertyParser0.tokenize(".");
    hierarchyPropertyParser0.goToParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test006"); }


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
    // The following exception was thrown during execution in test generation
    try {
    boolean b14 = hierarchyPropertyParser0.contains("");
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test007"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.setSeperator(".");
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser0.search(vector8, "null(0)[null]\n");
    int i11 = hierarchyPropertyParser0.getLevel();
    boolean b13 = hierarchyPropertyParser0.goToChild("hi!");
    boolean b14 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str15 = hierarchyPropertyParser0.parentValue();
    boolean b17 = hierarchyPropertyParser0.isHierachic("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test008"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    boolean b7 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str8 = hierarchyPropertyParser0.context();
    java.lang.String[] str_array9 = hierarchyPropertyParser0.childrenValues();
    hierarchyPropertyParser0.setSeperator("null(0)[null]\n");
    java.lang.String str12 = hierarchyPropertyParser0.showTree();
    int i13 = hierarchyPropertyParser0.getLevel();
    boolean b14 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str15 = hierarchyPropertyParser0.getSeperator();
    boolean b16 = hierarchyPropertyParser0.isRootReached();
    // The following exception was thrown during execution in test generation
    try {
    boolean b18 = hierarchyPropertyParser0.goTo("hi!(0)[null]\n(0)[null]\n");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null(0)[null]\n"+ "'", str12.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "null(0)[null]\n"+ "'", str15.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test009"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToParent();
    java.util.Vector vector6 = null;
    int i8 = hierarchyPropertyParser0.search(vector6, "");
    java.lang.String str9 = hierarchyPropertyParser0.showTree();
    java.lang.String str10 = hierarchyPropertyParser0.getValue();
    java.lang.String str11 = hierarchyPropertyParser0.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null(0)[null]\n"+ "'", str9.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "."+ "'", str11.equals("."));

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test010"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    java.lang.String[] str_array5 = hierarchyPropertyParser0.childrenValues();
    java.lang.String[] str_array7 = hierarchyPropertyParser0.tokenize("hi!");
    java.lang.String str8 = hierarchyPropertyParser0.fullValue();
    int i9 = hierarchyPropertyParser0.numChildren();
    java.lang.String str10 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.build("null(0)[null]\n(0)[null]\n", "hi!(0)[null]\n(0)[null]\n");
    java.util.Vector vector14 = null;
    int i16 = hierarchyPropertyParser0.search(vector14, "null(0)[null]\n");
    java.lang.String str17 = hierarchyPropertyParser0.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "."+ "'", str17.equals("."));

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test011"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToParent();
    boolean b6 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str7 = hierarchyPropertyParser0.context();
    java.lang.String str8 = hierarchyPropertyParser0.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "."+ "'", str8.equals("."));

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test012"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToParent();
    boolean b6 = hierarchyPropertyParser0.isLeafReached();
    int i7 = hierarchyPropertyParser0.numChildren();
    java.lang.String[] str_array8 = hierarchyPropertyParser0.childrenValues();
    boolean b10 = hierarchyPropertyParser0.contains("hi!(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test013"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    hierarchyPropertyParser0.setSeperator("null(0)[null]\n");
    java.lang.String str8 = hierarchyPropertyParser0.showTree();
    hierarchyPropertyParser0.setSeperator("");
    java.lang.String str11 = hierarchyPropertyParser0.getValue();
    boolean b13 = hierarchyPropertyParser0.goToChild("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null(0)[null]\n"+ "'", str8.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test014"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    boolean b7 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str8 = hierarchyPropertyParser0.context();
    java.lang.String[] str_array9 = hierarchyPropertyParser0.childrenValues();
    java.lang.String str10 = hierarchyPropertyParser0.fullValue();
    int i11 = hierarchyPropertyParser0.numChildren();
    java.lang.String str12 = hierarchyPropertyParser0.getSeperator();
    java.lang.String str13 = hierarchyPropertyParser0.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "."+ "'", str12.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test015"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    int i3 = hierarchyPropertyParser2.numChildren();
    boolean b5 = hierarchyPropertyParser2.isHierachic("hi!");
    java.lang.String[] str_array7 = hierarchyPropertyParser2.tokenize("");
    java.lang.String str8 = hierarchyPropertyParser2.fullValue();
    java.lang.String str9 = hierarchyPropertyParser2.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test016"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    boolean b5 = hierarchyPropertyParser0.goDown("");
    hierarchyPropertyParser0.setSeperator("");
    java.lang.String str8 = hierarchyPropertyParser0.getValue();
    boolean b10 = hierarchyPropertyParser0.goToChild("");
    java.lang.String str11 = hierarchyPropertyParser0.getValue();
    java.lang.String str12 = hierarchyPropertyParser0.getValue();
    java.util.Vector vector13 = null;
    int i15 = hierarchyPropertyParser0.search(vector13, "hi!(0)[null]\n(0)[null]\n");
    java.lang.String str16 = hierarchyPropertyParser0.getSeperator();
    boolean b18 = hierarchyPropertyParser0.goDown("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test017"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    int i6 = hierarchyPropertyParser0.getLevel();
    hierarchyPropertyParser0.build("", "");
    hierarchyPropertyParser0.setSeperator("hi!");
    int i12 = hierarchyPropertyParser0.depth();
    boolean b14 = hierarchyPropertyParser0.isHierachic("null(0)[null]\n(0)[null]\n");
    java.lang.String str15 = hierarchyPropertyParser0.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "null(0)[null]\n"+ "'", str15.equals("null(0)[null]\n"));

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test018"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    boolean b7 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str8 = hierarchyPropertyParser0.context();
    java.lang.String[] str_array9 = hierarchyPropertyParser0.childrenValues();
    hierarchyPropertyParser0.setSeperator("null(0)[null]\n");
    java.lang.String str12 = hierarchyPropertyParser0.showTree();
    int i13 = hierarchyPropertyParser0.getLevel();
    boolean b14 = hierarchyPropertyParser0.isRootReached();
    hierarchyPropertyParser0.setSeperator(".");
    hierarchyPropertyParser0.goToParent();
    java.lang.String str18 = hierarchyPropertyParser0.context();
    java.lang.String str19 = hierarchyPropertyParser0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null(0)[null]\n"+ "'", str12.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test019"); }


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
    java.util.Vector vector14 = null;
    int i16 = hierarchyPropertyParser0.search(vector14, "");
    int i17 = hierarchyPropertyParser0.depth();
    hierarchyPropertyParser0.goToParent();
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
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test020"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", ".");
    int i3 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array7 = hierarchyPropertyParser2.tokenize("hi!(0)[null]\n");
    java.lang.String[] str_array8 = hierarchyPropertyParser2.childrenValues();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str10 = hierarchyPropertyParser2.context();
    int i11 = hierarchyPropertyParser2.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test021"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    int i6 = hierarchyPropertyParser0.getLevel();
    boolean b8 = hierarchyPropertyParser0.isHierachic("");
    java.lang.String str9 = hierarchyPropertyParser0.parentValue();
    boolean b10 = hierarchyPropertyParser0.isLeafReached();
    boolean b12 = hierarchyPropertyParser0.goToChild(".");
    java.lang.String str13 = hierarchyPropertyParser0.parentValue();
    
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
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test022"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    boolean b7 = hierarchyPropertyParser0.goDown("");
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser0.search(vector8, "hi!");
    hierarchyPropertyParser0.setSeperator(".");
    java.lang.String str13 = hierarchyPropertyParser0.context();
    boolean b15 = hierarchyPropertyParser0.isHierachic("hi!");
    hierarchyPropertyParser0.build("null(0)[null]\n(0)[null]\n", "hi!(0)[null]\n(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test023"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    boolean b5 = hierarchyPropertyParser0.goDown("");
    hierarchyPropertyParser0.setSeperator("");
    java.lang.String str8 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToParent();
    boolean b11 = hierarchyPropertyParser0.isHierachic("");
    boolean b13 = hierarchyPropertyParser0.goDown(".");
    int i14 = hierarchyPropertyParser0.numChildren();
    int i15 = hierarchyPropertyParser0.numChildren();
    boolean b17 = hierarchyPropertyParser0.contains("null(0)[null]\n");
    // The following exception was thrown during execution in test generation
    try {
    boolean b19 = hierarchyPropertyParser0.goDown("");
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test024"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    boolean b7 = hierarchyPropertyParser0.goDown("");
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser0.search(vector8, "hi!");
    int i11 = hierarchyPropertyParser0.getLevel();
    java.lang.String str12 = hierarchyPropertyParser0.getValue();
    java.util.Vector vector13 = null;
    int i15 = hierarchyPropertyParser0.search(vector13, "");
    boolean b16 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String str17 = hierarchyPropertyParser0.context();
    int i18 = hierarchyPropertyParser0.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test025"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    int i6 = hierarchyPropertyParser0.depth();
    hierarchyPropertyParser0.add("hi!");
    boolean b10 = hierarchyPropertyParser0.goTo("hi!");
    hierarchyPropertyParser0.setSeperator("hi!");
    int i13 = hierarchyPropertyParser0.getLevel();
    hierarchyPropertyParser0.add("hi!(0)[null]\n");
    boolean b17 = hierarchyPropertyParser0.contains("null(0)[null]\n");
    hierarchyPropertyParser0.goToParent();
    java.lang.String str19 = hierarchyPropertyParser0.getValue();
    java.lang.String str20 = hierarchyPropertyParser0.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test026"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.setSeperator("");
    java.lang.String str6 = hierarchyPropertyParser0.getSeperator();
    java.lang.String str7 = hierarchyPropertyParser0.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test027"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    boolean b7 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str8 = hierarchyPropertyParser0.context();
    java.lang.String[] str_array9 = hierarchyPropertyParser0.childrenValues();
    hierarchyPropertyParser0.setSeperator("null(0)[null]\n");
    boolean b13 = hierarchyPropertyParser0.isHierachic("");
    boolean b15 = hierarchyPropertyParser0.isHierachic("");
    boolean b16 = hierarchyPropertyParser0.isRootReached();
    hierarchyPropertyParser0.goToRoot();
    hierarchyPropertyParser0.goToParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test028"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    int i3 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToParent();
    boolean b5 = hierarchyPropertyParser0.isRootReached();
    boolean b6 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String[] str_array8 = hierarchyPropertyParser0.tokenize("hi!");
    java.lang.String[] str_array10 = hierarchyPropertyParser0.tokenize("hi!");
    int i11 = hierarchyPropertyParser0.depth();
    hierarchyPropertyParser0.add("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test029"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    java.lang.String str1 = hierarchyPropertyParser0.parentValue();
    java.lang.String str2 = hierarchyPropertyParser0.showTree();
    int i3 = hierarchyPropertyParser0.numChildren();
    java.lang.String[] str_array4 = hierarchyPropertyParser0.childrenValues();
    int i5 = hierarchyPropertyParser0.depth();
    java.lang.String str6 = hierarchyPropertyParser0.context();
    java.lang.String str7 = hierarchyPropertyParser0.fullValue();
    java.lang.String str8 = hierarchyPropertyParser0.getSeperator();
    hierarchyPropertyParser0.goToRoot();
    boolean b10 = hierarchyPropertyParser0.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "null(0)[null]\n"+ "'", str2.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "."+ "'", str8.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test030"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    boolean b7 = hierarchyPropertyParser0.goDown("");
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser0.search(vector8, "hi!");
    java.lang.String str11 = hierarchyPropertyParser0.getValue();
    boolean b13 = hierarchyPropertyParser0.contains("null(0)[null]\n");
    java.lang.String str14 = hierarchyPropertyParser0.getValue();
    boolean b16 = hierarchyPropertyParser0.goToChild("null(0)[null]\n(0)[null]\n");
    hierarchyPropertyParser0.add("hi!(0)[null]\n(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test031"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToParent();
    boolean b6 = hierarchyPropertyParser0.isRootReached();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser0.build("hi!(0)[null]\n(0)[null]\n", ".");
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
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test032"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    boolean b7 = hierarchyPropertyParser0.goDown("");
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser0.search(vector8, "hi!");
    int i11 = hierarchyPropertyParser0.getLevel();
    hierarchyPropertyParser0.goToRoot();
    boolean b14 = hierarchyPropertyParser0.contains(".(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test033"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    int i3 = hierarchyPropertyParser2.numChildren();
    boolean b5 = hierarchyPropertyParser2.isHierachic("hi!");
    java.lang.String[] str_array7 = hierarchyPropertyParser2.tokenize("");
    java.lang.String str8 = hierarchyPropertyParser2.getValue();
    java.util.Vector vector9 = null;
    int i11 = hierarchyPropertyParser2.search(vector9, "null(0)[null]\n");
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
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test034"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    hierarchyPropertyParser0.setSeperator("null(0)[null]\n");
    java.lang.String str8 = hierarchyPropertyParser0.showTree();
    hierarchyPropertyParser0.setSeperator("");
    boolean b11 = hierarchyPropertyParser0.isLeafReached();
    boolean b13 = hierarchyPropertyParser0.goToChild("null(0)[null]\n(0)[null]\n");
    hierarchyPropertyParser0.setSeperator(".(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null(0)[null]\n"+ "'", str8.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test035"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToParent();
    boolean b7 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str8 = hierarchyPropertyParser0.showTree();
    java.lang.String[] str_array9 = hierarchyPropertyParser0.childrenValues();
    java.lang.String str10 = hierarchyPropertyParser0.getSeperator();
    java.lang.String str11 = hierarchyPropertyParser0.fullValue();
    java.lang.String[] str_array13 = hierarchyPropertyParser0.tokenize("null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null(0)[null]\n"+ "'", str8.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "."+ "'", str10.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test036"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    java.lang.String str5 = hierarchyPropertyParser0.showTree();
    int i6 = hierarchyPropertyParser0.numChildren();
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
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null(0)[null]\n"+ "'", str5.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test037"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    boolean b7 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str8 = hierarchyPropertyParser0.context();
    java.lang.String[] str_array9 = hierarchyPropertyParser0.childrenValues();
    hierarchyPropertyParser0.setSeperator("null(0)[null]\n");
    java.lang.String str12 = hierarchyPropertyParser0.showTree();
    int i13 = hierarchyPropertyParser0.getLevel();
    int i14 = hierarchyPropertyParser0.depth();
    hierarchyPropertyParser0.build("hi!", "hi!");
    java.lang.String str18 = hierarchyPropertyParser0.parentValue();
    int i19 = hierarchyPropertyParser0.depth();
    // The following exception was thrown during execution in test generation
    try {
    boolean b21 = hierarchyPropertyParser0.goTo("hi!(0)[null]\n(0)[null]\n(0)[null]\n");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null(0)[null]\n"+ "'", str12.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test038"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToParent();
    int i6 = hierarchyPropertyParser0.numChildren();
    boolean b7 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String[] str_array8 = hierarchyPropertyParser0.childrenValues();
    boolean b10 = hierarchyPropertyParser0.goDown("");
    java.util.Vector vector11 = null;
    int i13 = hierarchyPropertyParser0.search(vector11, "hi!");
    boolean b15 = hierarchyPropertyParser0.goToChild("hi!(0)[null]\n");
    boolean b17 = hierarchyPropertyParser0.goToChild("");
    java.lang.String str18 = hierarchyPropertyParser0.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "."+ "'", str18.equals("."));

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test039"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    boolean b4 = hierarchyPropertyParser0.isRootReached();
    boolean b6 = hierarchyPropertyParser0.goDown("");
    boolean b7 = hierarchyPropertyParser0.isLeafReached();
    boolean b9 = hierarchyPropertyParser0.goToChild(".");
    java.lang.String str10 = hierarchyPropertyParser0.showTree();
    java.lang.String str11 = hierarchyPropertyParser0.context();
    boolean b13 = hierarchyPropertyParser0.goToChild("hi!(0)[null]\n(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test040"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    int i6 = hierarchyPropertyParser0.depth();
    boolean b7 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str8 = hierarchyPropertyParser0.showTree();
    java.lang.String[] str_array10 = hierarchyPropertyParser0.tokenize("hi!(0)[null]\n(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null(0)[null]\n"+ "'", str8.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test041"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToRoot();
    int i6 = hierarchyPropertyParser0.depth();
    java.lang.String str7 = hierarchyPropertyParser0.showTree();
    java.lang.String str8 = hierarchyPropertyParser0.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null(0)[null]\n"+ "'", str7.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test042"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    boolean b6 = hierarchyPropertyParser0.isLeafReached();
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
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test043"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    boolean b7 = hierarchyPropertyParser0.goDown("");
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser0.search(vector8, "hi!");
    java.lang.String str11 = hierarchyPropertyParser0.getValue();
    java.lang.String str12 = hierarchyPropertyParser0.parentValue();
    int i13 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToRoot();
    java.lang.String str15 = hierarchyPropertyParser0.fullValue();
    int i16 = hierarchyPropertyParser0.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test044"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    boolean b5 = hierarchyPropertyParser0.goDown("");
    hierarchyPropertyParser0.setSeperator("");
    java.lang.String str8 = hierarchyPropertyParser0.getValue();
    boolean b10 = hierarchyPropertyParser0.goToChild("");
    java.lang.String[] str_array11 = hierarchyPropertyParser0.childrenValues();
    int i12 = hierarchyPropertyParser0.numChildren();
    boolean b13 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String str14 = hierarchyPropertyParser0.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test045"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToParent();
    java.util.Vector vector6 = null;
    int i8 = hierarchyPropertyParser0.search(vector6, "");
    int i9 = hierarchyPropertyParser0.getLevel();
    java.lang.String[] str_array10 = hierarchyPropertyParser0.childrenValues();
    int i11 = hierarchyPropertyParser0.numChildren();
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
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test046"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToParent();
    boolean b6 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str7 = hierarchyPropertyParser0.context();
    int i8 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.build("", "");
    java.util.Vector vector12 = null;
    int i14 = hierarchyPropertyParser0.search(vector12, "null(0)[null]\n(0)[null]\n");
    hierarchyPropertyParser0.setSeperator("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test047"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    int i6 = hierarchyPropertyParser0.getLevel();
    hierarchyPropertyParser0.build("", "hi!");
    java.lang.String str10 = hierarchyPropertyParser0.getValue();
    boolean b11 = hierarchyPropertyParser0.isLeafReached();
    int i12 = hierarchyPropertyParser0.depth();
    hierarchyPropertyParser0.setSeperator("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test048"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToParent();
    java.util.Vector vector6 = null;
    int i8 = hierarchyPropertyParser0.search(vector6, "");
    int i9 = hierarchyPropertyParser0.getLevel();
    java.lang.String[] str_array10 = hierarchyPropertyParser0.childrenValues();
    boolean b12 = hierarchyPropertyParser0.goDown("null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test049"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    int i3 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToParent();
    boolean b5 = hierarchyPropertyParser0.isRootReached();
    boolean b7 = hierarchyPropertyParser0.goDown("null(0)[null]\n");
    hierarchyPropertyParser0.setSeperator("hi!");
    hierarchyPropertyParser0.setSeperator(".");
    boolean b13 = hierarchyPropertyParser0.goToChild("hi!");
    hierarchyPropertyParser0.add("null(0)[null]\n(0)[null]\n");
    java.util.Vector vector16 = null;
    int i18 = hierarchyPropertyParser0.search(vector16, "hi!(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-1));

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test050"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    boolean b7 = hierarchyPropertyParser0.goDown("");
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser0.search(vector8, "hi!");
    int i11 = hierarchyPropertyParser0.getLevel();
    java.lang.String str12 = hierarchyPropertyParser0.getValue();
    int i13 = hierarchyPropertyParser0.numChildren();
    java.lang.String[] str_array14 = hierarchyPropertyParser0.childrenValues();
    int i15 = hierarchyPropertyParser0.numChildren();
    boolean b16 = hierarchyPropertyParser0.isLeafReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test051"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    boolean b7 = hierarchyPropertyParser0.goDown("hi!");
    int i8 = hierarchyPropertyParser0.depth();
    hierarchyPropertyParser0.add("hi!");
    java.lang.String[] str_array11 = hierarchyPropertyParser0.childrenValues();
    java.lang.String str12 = hierarchyPropertyParser0.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test052"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToRoot();
    hierarchyPropertyParser0.goToParent();
    boolean b8 = hierarchyPropertyParser0.isLeafReached();
    int i9 = hierarchyPropertyParser0.depth();
    java.lang.String str10 = hierarchyPropertyParser0.showTree();
    java.lang.String str11 = hierarchyPropertyParser0.showTree();
    java.lang.String[] str_array12 = hierarchyPropertyParser0.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null(0)[null]\n"+ "'", str11.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test053"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser2.search(vector3, "");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str7 = hierarchyPropertyParser2.fullValue();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.tokenize("hi!(0)[null]\n");
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n");
    int i12 = hierarchyPropertyParser2.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test054"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.goToParent();
    int i4 = hierarchyPropertyParser2.depth();
    java.lang.String str5 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.goToParent();
    int i8 = hierarchyPropertyParser2.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test055"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    hierarchyPropertyParser0.setSeperator("null(0)[null]\n");
    java.lang.String str8 = hierarchyPropertyParser0.showTree();
    hierarchyPropertyParser0.setSeperator("");
    boolean b12 = hierarchyPropertyParser0.goDown("hi!(0)[null]\n(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null(0)[null]\n"+ "'", str8.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test056"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b4 = hierarchyPropertyParser2.contains("null(0)[null]\n");
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test057"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    boolean b7 = hierarchyPropertyParser0.goDown("");
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser0.search(vector8, "hi!");
    java.lang.String str11 = hierarchyPropertyParser0.getValue();
    java.lang.String str12 = hierarchyPropertyParser0.parentValue();
    int i13 = hierarchyPropertyParser0.numChildren();
    java.util.Vector vector14 = null;
    int i16 = hierarchyPropertyParser0.search(vector14, "null(0)[null]\n");
    hierarchyPropertyParser0.setSeperator(".");
    hierarchyPropertyParser0.add("null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test058"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToParent();
    java.util.Vector vector6 = null;
    int i8 = hierarchyPropertyParser0.search(vector6, "");
    boolean b10 = hierarchyPropertyParser0.contains("null(0)[null]\n");
    hierarchyPropertyParser0.build("hi!", "hi!");
    boolean b15 = hierarchyPropertyParser0.goToChild("null(0)[null]\n");
    hierarchyPropertyParser0.add("hi!(0)[null]\n");
    boolean b19 = hierarchyPropertyParser0.isHierachic(".");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test059"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    boolean b7 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str8 = hierarchyPropertyParser0.context();
    java.lang.String[] str_array9 = hierarchyPropertyParser0.childrenValues();
    java.lang.String[] str_array11 = hierarchyPropertyParser0.tokenize(".");
    java.lang.String str12 = hierarchyPropertyParser0.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "."+ "'", str12.equals("."));

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test060"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    int i3 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToParent();
    boolean b5 = hierarchyPropertyParser0.isRootReached();
    boolean b6 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String[] str_array8 = hierarchyPropertyParser0.tokenize("hi!");
    java.util.Vector vector9 = null;
    int i11 = hierarchyPropertyParser0.search(vector9, "hi!(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test061"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    int i3 = hierarchyPropertyParser2.numChildren();
    boolean b5 = hierarchyPropertyParser2.isHierachic("hi!");
    int i6 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.goToRoot();
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser2.search(vector8, "");
    java.lang.String str11 = hierarchyPropertyParser2.getSeperator();
    boolean b13 = hierarchyPropertyParser2.contains("hi!(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "."+ "'", str11.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test062"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToParent();
    boolean b6 = hierarchyPropertyParser0.isRootReached();
    java.lang.String[] str_array7 = hierarchyPropertyParser0.childrenValues();
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser0.search(vector8, ".");
    // The following exception was thrown during execution in test generation
    try {
    boolean b12 = hierarchyPropertyParser0.goTo("");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test063"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    boolean b5 = hierarchyPropertyParser0.goDown("");
    hierarchyPropertyParser0.setSeperator("");
    java.lang.String str8 = hierarchyPropertyParser0.getValue();
    boolean b10 = hierarchyPropertyParser0.goToChild("");
    java.lang.String str11 = hierarchyPropertyParser0.fullValue();
    java.lang.String str12 = hierarchyPropertyParser0.context();
    boolean b13 = hierarchyPropertyParser0.isRootReached();
    int i14 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test064"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    java.lang.String[] str_array5 = hierarchyPropertyParser0.childrenValues();
    java.lang.String[] str_array7 = hierarchyPropertyParser0.tokenize("hi!");
    java.lang.String str8 = hierarchyPropertyParser0.fullValue();
    int i9 = hierarchyPropertyParser0.numChildren();
    java.lang.String str10 = hierarchyPropertyParser0.parentValue();
    java.lang.String[] str_array11 = hierarchyPropertyParser0.childrenValues();
    java.lang.String str12 = hierarchyPropertyParser0.fullValue();
    hierarchyPropertyParser0.goToParent();
    boolean b15 = hierarchyPropertyParser0.goDown("null(0)[null]\n(0)[null]\n");
    java.lang.String[] str_array16 = hierarchyPropertyParser0.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test065"); }


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
    int i17 = hierarchyPropertyParser0.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test066"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    boolean b5 = hierarchyPropertyParser0.goDown("");
    hierarchyPropertyParser0.setSeperator("");
    java.lang.String str8 = hierarchyPropertyParser0.getValue();
    boolean b10 = hierarchyPropertyParser0.goToChild("");
    java.lang.String[] str_array11 = hierarchyPropertyParser0.childrenValues();
    hierarchyPropertyParser0.setSeperator("null(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test067"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    java.lang.String str6 = hierarchyPropertyParser0.context();
    boolean b8 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String[] str_array10 = hierarchyPropertyParser0.tokenize("");
    boolean b12 = hierarchyPropertyParser0.goToChild("");
    java.lang.String str13 = hierarchyPropertyParser0.fullValue();
    boolean b14 = hierarchyPropertyParser0.isLeafReached();
    int i15 = hierarchyPropertyParser0.getLevel();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser0.goToChild(100);
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
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test068"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser2.search(vector3, "");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str7 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.setSeperator("");
    boolean b11 = hierarchyPropertyParser2.goToChild("");
    java.lang.String str12 = hierarchyPropertyParser2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test069"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    boolean b7 = hierarchyPropertyParser0.goDown("");
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser0.search(vector8, "hi!");
    java.lang.String str11 = hierarchyPropertyParser0.getValue();
    boolean b13 = hierarchyPropertyParser0.contains("null(0)[null]\n");
    java.lang.String str14 = hierarchyPropertyParser0.getValue();
    java.lang.String str15 = hierarchyPropertyParser0.showTree();
    hierarchyPropertyParser0.goToParent();
    java.util.Vector vector17 = null;
    int i19 = hierarchyPropertyParser0.search(vector17, "null(0)[null]\n(0)[null]\n");
    hierarchyPropertyParser0.goToParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "null(0)[null]\n"+ "'", str15.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == (-1));

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test070"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    boolean b7 = hierarchyPropertyParser0.goDown("hi!");
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser0.search(vector8, "");
    hierarchyPropertyParser0.setSeperator("null(0)[null]\n");
    java.lang.String str13 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.setSeperator("hi!(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test071"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToParent();
    java.util.Vector vector6 = null;
    int i8 = hierarchyPropertyParser0.search(vector6, "");
    int i9 = hierarchyPropertyParser0.getLevel();
    java.lang.String str10 = hierarchyPropertyParser0.parentValue();
    java.lang.String[] str_array11 = hierarchyPropertyParser0.childrenValues();
    java.util.Vector vector12 = null;
    int i14 = hierarchyPropertyParser0.search(vector12, "hi!");
    java.lang.String str15 = hierarchyPropertyParser0.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "."+ "'", str15.equals("."));

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test072"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.goToParent();
    int i4 = hierarchyPropertyParser2.depth();
    java.lang.String str5 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.goToParent();
    int i7 = hierarchyPropertyParser2.getLevel();
    java.lang.String str8 = hierarchyPropertyParser2.getSeperator();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.childrenValues();
    boolean b11 = hierarchyPropertyParser2.isHierachic("hi!(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "."+ "'", str8.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test073"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    boolean b5 = hierarchyPropertyParser0.goDown("");
    hierarchyPropertyParser0.setSeperator("");
    java.lang.String str8 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToParent();
    boolean b11 = hierarchyPropertyParser0.isHierachic("");
    int i12 = hierarchyPropertyParser0.numChildren();
    java.lang.String str13 = hierarchyPropertyParser0.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test074"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToParent();
    boolean b7 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str8 = hierarchyPropertyParser0.showTree();
    java.lang.String[] str_array9 = hierarchyPropertyParser0.childrenValues();
    hierarchyPropertyParser0.setSeperator("hi!(0)[null]\n");
    boolean b13 = hierarchyPropertyParser0.isHierachic(".");
    java.lang.String[] str_array15 = hierarchyPropertyParser0.tokenize(".");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null(0)[null]\n"+ "'", str8.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test075"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    int i3 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToParent();
    hierarchyPropertyParser0.setSeperator("");
    java.lang.String str7 = hierarchyPropertyParser0.showTree();
    hierarchyPropertyParser0.goToRoot();
    java.lang.String str9 = hierarchyPropertyParser0.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null(0)[null]\n"+ "'", str7.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test076"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    boolean b5 = hierarchyPropertyParser0.goDown("");
    hierarchyPropertyParser0.setSeperator("");
    java.lang.String str8 = hierarchyPropertyParser0.getValue();
    boolean b10 = hierarchyPropertyParser0.goToChild("");
    java.lang.String str11 = hierarchyPropertyParser0.showTree();
    java.lang.String[] str_array12 = hierarchyPropertyParser0.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null(0)[null]\n"+ "'", str11.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test077"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    int i6 = hierarchyPropertyParser0.depth();
    hierarchyPropertyParser0.add("hi!");
    boolean b10 = hierarchyPropertyParser0.goTo("hi!");
    hierarchyPropertyParser0.setSeperator("hi!");
    java.lang.String[] str_array14 = hierarchyPropertyParser0.tokenize("hi!");
    boolean b16 = hierarchyPropertyParser0.goTo("");
    int i17 = hierarchyPropertyParser0.getLevel();
    java.util.Vector vector18 = null;
    int i20 = hierarchyPropertyParser0.search(vector18, "hi!");
    int i21 = hierarchyPropertyParser0.depth();
    java.lang.String str22 = hierarchyPropertyParser0.getSeperator();
    java.lang.String str23 = hierarchyPropertyParser0.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test078"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToParent();
    java.util.Vector vector6 = null;
    int i8 = hierarchyPropertyParser0.search(vector6, "");
    java.lang.String str9 = hierarchyPropertyParser0.showTree();
    java.lang.String str10 = hierarchyPropertyParser0.getValue();
    boolean b12 = hierarchyPropertyParser0.goToChild("null(0)[null]\n");
    boolean b14 = hierarchyPropertyParser0.goDown("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null(0)[null]\n"+ "'", str9.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test079"); }


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
    boolean b12 = hierarchyPropertyParser0.isLeafReached();
    boolean b14 = hierarchyPropertyParser0.goDown(".");
    java.lang.String[] str_array16 = hierarchyPropertyParser0.tokenize("hi!");
    java.lang.String str17 = hierarchyPropertyParser0.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "null(0)[null]\n"+ "'", str17.equals("null(0)[null]\n"));

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test080"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    boolean b5 = hierarchyPropertyParser0.goDown("");
    hierarchyPropertyParser0.setSeperator("");
    java.lang.String str8 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToParent();
    boolean b10 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String str11 = hierarchyPropertyParser0.context();
    java.util.Vector vector12 = null;
    int i14 = hierarchyPropertyParser0.search(vector12, ".(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test081"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    int i3 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToParent();
    boolean b5 = hierarchyPropertyParser0.isRootReached();
    boolean b6 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String[] str_array8 = hierarchyPropertyParser0.tokenize("hi!");
    boolean b9 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str10 = hierarchyPropertyParser0.getSeperator();
    boolean b12 = hierarchyPropertyParser0.contains("hi!");
    boolean b14 = hierarchyPropertyParser0.goDown("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "."+ "'", str10.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test082"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    int i3 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToParent();
    boolean b5 = hierarchyPropertyParser0.isRootReached();
    boolean b6 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String[] str_array8 = hierarchyPropertyParser0.tokenize("hi!");
    boolean b9 = hierarchyPropertyParser0.isRootReached();
    java.lang.String[] str_array10 = hierarchyPropertyParser0.childrenValues();
    java.lang.String[] str_array11 = hierarchyPropertyParser0.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test083"); }


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
    java.lang.String str15 = hierarchyPropertyParser0.showTree();
    java.lang.String str16 = hierarchyPropertyParser0.parentValue();
    boolean b17 = hierarchyPropertyParser0.isLeafReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "null(0)[null]\n"+ "'", str15.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test084"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    boolean b4 = hierarchyPropertyParser0.isHierachic("null(0)[null]\n");
    java.lang.String[] str_array6 = hierarchyPropertyParser0.tokenize("hi!");
    java.lang.String[] str_array8 = hierarchyPropertyParser0.tokenize(".(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test085"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    java.lang.String str6 = hierarchyPropertyParser0.context();
    boolean b8 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String[] str_array10 = hierarchyPropertyParser0.tokenize("");
    boolean b12 = hierarchyPropertyParser0.goToChild("");
    java.lang.String str13 = hierarchyPropertyParser0.fullValue();
    java.lang.String str14 = hierarchyPropertyParser0.fullValue();
    java.lang.String str15 = hierarchyPropertyParser0.fullValue();
    java.lang.String str16 = hierarchyPropertyParser0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
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
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test086"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToRoot();
    java.lang.String str6 = hierarchyPropertyParser0.parentValue();
    boolean b8 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String[] str_array9 = hierarchyPropertyParser0.childrenValues();
    hierarchyPropertyParser0.goToParent();
    java.lang.String str11 = hierarchyPropertyParser0.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test087"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    java.lang.String str1 = hierarchyPropertyParser0.parentValue();
    java.lang.String str2 = hierarchyPropertyParser0.showTree();
    int i3 = hierarchyPropertyParser0.numChildren();
    java.lang.String[] str_array4 = hierarchyPropertyParser0.childrenValues();
    int i5 = hierarchyPropertyParser0.depth();
    boolean b7 = hierarchyPropertyParser0.goDown(".");
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
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "null(0)[null]\n"+ "'", str2.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test088"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    boolean b7 = hierarchyPropertyParser0.goDown("");
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser0.search(vector8, "hi!");
    int i11 = hierarchyPropertyParser0.getLevel();
    java.lang.String str12 = hierarchyPropertyParser0.fullValue();
    int i13 = hierarchyPropertyParser0.depth();
    boolean b15 = hierarchyPropertyParser0.contains("hi!");
    java.lang.String str16 = hierarchyPropertyParser0.context();
    int i17 = hierarchyPropertyParser0.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test089"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    int i6 = hierarchyPropertyParser0.getLevel();
    hierarchyPropertyParser0.build("", "hi!");
    int i10 = hierarchyPropertyParser0.getLevel();
    hierarchyPropertyParser0.goToRoot();
    java.lang.String str12 = hierarchyPropertyParser0.context();
    java.lang.String str13 = hierarchyPropertyParser0.fullValue();
    int i14 = hierarchyPropertyParser0.numChildren();
    java.lang.String[] str_array16 = hierarchyPropertyParser0.tokenize("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test090"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    java.util.Vector vector4 = null;
    int i6 = hierarchyPropertyParser0.search(vector4, "hi!(0)[null]\n");
    java.lang.String[] str_array8 = hierarchyPropertyParser0.tokenize("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test091"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    boolean b4 = hierarchyPropertyParser0.goDown("");
    int i5 = hierarchyPropertyParser0.getLevel();
    hierarchyPropertyParser0.build("", "hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test092"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    java.lang.String str1 = hierarchyPropertyParser0.parentValue();
    java.lang.String str2 = hierarchyPropertyParser0.showTree();
    int i3 = hierarchyPropertyParser0.getLevel();
    hierarchyPropertyParser0.add("hi!");
    java.lang.String str6 = hierarchyPropertyParser0.context();
    java.lang.String str7 = hierarchyPropertyParser0.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "null(0)[null]\n"+ "'", str2.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!(0)[null]\n"+ "'", str7.equals("hi!(0)[null]\n"));

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test093"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    java.lang.String str6 = hierarchyPropertyParser0.context();
    boolean b8 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String[] str_array10 = hierarchyPropertyParser0.tokenize("");
    boolean b12 = hierarchyPropertyParser0.goToChild("");
    java.lang.String str13 = hierarchyPropertyParser0.fullValue();
    hierarchyPropertyParser0.setSeperator("");
    hierarchyPropertyParser0.build("", "");
    int i19 = hierarchyPropertyParser0.getLevel();
    java.lang.String str20 = hierarchyPropertyParser0.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test094"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    java.lang.String[] str_array5 = hierarchyPropertyParser0.childrenValues();
    boolean b7 = hierarchyPropertyParser0.goDown("hi!");
    boolean b9 = hierarchyPropertyParser0.goDown("hi!");
    boolean b11 = hierarchyPropertyParser0.goToChild("");
    java.lang.String str12 = hierarchyPropertyParser0.getSeperator();
    java.lang.String[] str_array13 = hierarchyPropertyParser0.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "."+ "'", str12.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test095"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToRoot();
    java.lang.String str6 = hierarchyPropertyParser0.parentValue();
    java.lang.String str7 = hierarchyPropertyParser0.getSeperator();
    boolean b9 = hierarchyPropertyParser0.isHierachic("null(0)[null]\n");
    boolean b11 = hierarchyPropertyParser0.isHierachic("null(0)[null]\n");
    java.lang.String str12 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.build("null(0)[null]\n(0)[null]\n", "null(0)[null]\n");
    java.lang.String str16 = hierarchyPropertyParser0.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "."+ "'", str7.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "null(0)[null]\n"+ "'", str16.equals("null(0)[null]\n"));

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test096"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    boolean b7 = hierarchyPropertyParser0.goDown("");
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser0.search(vector8, "hi!");
    java.lang.String str11 = hierarchyPropertyParser0.getValue();
    boolean b12 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String str13 = hierarchyPropertyParser0.showTree();
    boolean b14 = hierarchyPropertyParser0.isRootReached();
    int i15 = hierarchyPropertyParser0.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null(0)[null]\n"+ "'", str13.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test097"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    int i3 = hierarchyPropertyParser0.numChildren();
    int i4 = hierarchyPropertyParser0.depth();
    hierarchyPropertyParser0.goToRoot();
    java.lang.String str6 = hierarchyPropertyParser0.fullValue();
    hierarchyPropertyParser0.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test098"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    boolean b7 = hierarchyPropertyParser0.goDown("");
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser0.search(vector8, "hi!");
    java.lang.String str11 = hierarchyPropertyParser0.getValue();
    java.lang.String str12 = hierarchyPropertyParser0.parentValue();
    int i13 = hierarchyPropertyParser0.numChildren();
    java.lang.String[] str_array15 = hierarchyPropertyParser0.tokenize("hi!(0)[null]\n");
    java.lang.String str16 = hierarchyPropertyParser0.fullValue();
    java.lang.String str17 = hierarchyPropertyParser0.context();
    hierarchyPropertyParser0.setSeperator("");
    java.lang.String str20 = hierarchyPropertyParser0.fullValue();
    java.lang.String[] str_array21 = hierarchyPropertyParser0.childrenValues();
    boolean b22 = hierarchyPropertyParser0.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test099"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    java.lang.String[] str_array5 = hierarchyPropertyParser0.childrenValues();
    boolean b7 = hierarchyPropertyParser0.goDown("hi!");
    hierarchyPropertyParser0.goToParent();
    int i9 = hierarchyPropertyParser0.getLevel();
    int i10 = hierarchyPropertyParser0.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test100"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    java.lang.String[] str_array4 = hierarchyPropertyParser0.childrenValues();
    int i5 = hierarchyPropertyParser0.depth();
    java.lang.String str6 = hierarchyPropertyParser0.parentValue();
    int i7 = hierarchyPropertyParser0.numChildren();
    java.lang.String[] str_array9 = hierarchyPropertyParser0.tokenize("hi!(0)[null]\n(0)[null]\n");
    int i10 = hierarchyPropertyParser0.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test101"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    java.lang.String str1 = hierarchyPropertyParser0.getValue();
    java.lang.String str2 = hierarchyPropertyParser0.fullValue();
    hierarchyPropertyParser0.build("null(0)[null]\n", "null(0)[null]\n");
    hierarchyPropertyParser0.goToRoot();
    java.lang.String str7 = hierarchyPropertyParser0.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null(0)[null]\n"+ "'", str7.equals("null(0)[null]\n"));

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test102"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    java.lang.String str1 = hierarchyPropertyParser0.parentValue();
    boolean b3 = hierarchyPropertyParser0.contains("hi!");
    int i4 = hierarchyPropertyParser0.numChildren();
    boolean b6 = hierarchyPropertyParser0.isHierachic("");
    boolean b8 = hierarchyPropertyParser0.goDown("hi!");
    boolean b10 = hierarchyPropertyParser0.isHierachic(".");
    boolean b12 = hierarchyPropertyParser0.isHierachic("hi!(0)[null]\n");
    java.lang.String str13 = hierarchyPropertyParser0.parentValue();
    boolean b14 = hierarchyPropertyParser0.isLeafReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test103"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    java.lang.String str6 = hierarchyPropertyParser0.context();
    boolean b7 = hierarchyPropertyParser0.isLeafReached();
    int i8 = hierarchyPropertyParser0.depth();
    int i9 = hierarchyPropertyParser0.depth();
    java.lang.String[] str_array10 = hierarchyPropertyParser0.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test104"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    boolean b7 = hierarchyPropertyParser0.goDown("");
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser0.search(vector8, "hi!");
    int i11 = hierarchyPropertyParser0.getLevel();
    int i12 = hierarchyPropertyParser0.getLevel();
    hierarchyPropertyParser0.goToParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test105"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToParent();
    boolean b6 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str7 = hierarchyPropertyParser0.context();
    boolean b9 = hierarchyPropertyParser0.contains("null(0)[null]\n");
    boolean b11 = hierarchyPropertyParser0.contains("null(0)[null]\n");
    java.lang.String[] str_array12 = hierarchyPropertyParser0.childrenValues();
    hierarchyPropertyParser0.build("null(0)[null]\n", "null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test106"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    int i3 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToParent();
    boolean b5 = hierarchyPropertyParser0.isRootReached();
    boolean b7 = hierarchyPropertyParser0.goDown("null(0)[null]\n");
    boolean b9 = hierarchyPropertyParser0.contains("null(0)[null]\n");
    hierarchyPropertyParser0.setSeperator("hi!");
    hierarchyPropertyParser0.setSeperator("hi!");
    hierarchyPropertyParser0.add("hi!(0)[null]\n");
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
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test107"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToRoot();
    int i6 = hierarchyPropertyParser0.depth();
    java.lang.String str7 = hierarchyPropertyParser0.fullValue();
    hierarchyPropertyParser0.goToRoot();
    java.lang.String str9 = hierarchyPropertyParser0.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "."+ "'", str9.equals("."));

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test108"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "null(0)[null]\n");
    int i3 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.build("null(0)[null]\n", "hi!(0)[null]\n");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.parentValue();
    java.lang.String str9 = hierarchyPropertyParser2.parentValue();
    boolean b11 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test109"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToParent();
    boolean b6 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str7 = hierarchyPropertyParser0.context();
    boolean b9 = hierarchyPropertyParser0.contains("null(0)[null]\n");
    boolean b11 = hierarchyPropertyParser0.contains("null(0)[null]\n");
    java.lang.String[] str_array12 = hierarchyPropertyParser0.childrenValues();
    boolean b14 = hierarchyPropertyParser0.isHierachic("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test110"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    int i3 = hierarchyPropertyParser0.numChildren();
    int i4 = hierarchyPropertyParser0.depth();
    hierarchyPropertyParser0.add("null(0)[null]\n(0)[null]\n");
    int i7 = hierarchyPropertyParser0.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test111"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    int i6 = hierarchyPropertyParser0.getLevel();
    hierarchyPropertyParser0.build("", "hi!");
    int i10 = hierarchyPropertyParser0.getLevel();
    java.lang.String str11 = hierarchyPropertyParser0.parentValue();
    java.lang.String[] str_array12 = hierarchyPropertyParser0.childrenValues();
    boolean b14 = hierarchyPropertyParser0.goDown("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test112"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToParent();
    java.lang.String str7 = hierarchyPropertyParser0.parentValue();
    java.lang.String str8 = hierarchyPropertyParser0.getValue();
    int i9 = hierarchyPropertyParser0.getLevel();
    hierarchyPropertyParser0.setSeperator(".(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test113"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    java.lang.String str6 = hierarchyPropertyParser0.context();
    boolean b8 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String[] str_array10 = hierarchyPropertyParser0.tokenize("");
    boolean b12 = hierarchyPropertyParser0.goToChild("");
    java.lang.String str13 = hierarchyPropertyParser0.fullValue();
    boolean b14 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String str15 = hierarchyPropertyParser0.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test114"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    boolean b4 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str5 = hierarchyPropertyParser0.context();
    java.lang.String str6 = hierarchyPropertyParser0.parentValue();
    int i7 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.setSeperator("hi!(0)[null]\n");
    java.lang.String str10 = hierarchyPropertyParser0.parentValue();
    boolean b12 = hierarchyPropertyParser0.goToChild("null(0)[null]\n");
    hierarchyPropertyParser0.setSeperator("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test115"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.setSeperator("");
    java.lang.String str6 = hierarchyPropertyParser0.context();
    boolean b8 = hierarchyPropertyParser0.contains("null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test116"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    java.lang.String str1 = hierarchyPropertyParser0.parentValue();
    java.lang.String str2 = hierarchyPropertyParser0.showTree();
    int i3 = hierarchyPropertyParser0.numChildren();
    java.lang.String[] str_array4 = hierarchyPropertyParser0.childrenValues();
    int i5 = hierarchyPropertyParser0.depth();
    java.lang.String str6 = hierarchyPropertyParser0.context();
    java.lang.String[] str_array7 = hierarchyPropertyParser0.childrenValues();
    java.lang.String str8 = hierarchyPropertyParser0.showTree();
    hierarchyPropertyParser0.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "null(0)[null]\n"+ "'", str2.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null(0)[null]\n"+ "'", str8.equals("null(0)[null]\n"));

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test117"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    boolean b7 = hierarchyPropertyParser0.goDown("hi!");
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser0.search(vector8, "");
    boolean b12 = hierarchyPropertyParser0.goToChild("");
    hierarchyPropertyParser0.goToRoot();
    boolean b14 = hierarchyPropertyParser0.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test118"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    boolean b4 = hierarchyPropertyParser0.isHierachic("hi!(0)[null]\n");
    boolean b5 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String[] str_array7 = hierarchyPropertyParser0.tokenize("null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test119"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    java.lang.String[] str_array4 = hierarchyPropertyParser0.childrenValues();
    int i5 = hierarchyPropertyParser0.depth();
    java.lang.String str6 = hierarchyPropertyParser0.parentValue();
    java.lang.String str7 = hierarchyPropertyParser0.context();
    hierarchyPropertyParser0.setSeperator("");
    boolean b10 = hierarchyPropertyParser0.isLeafReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test120"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    int i6 = hierarchyPropertyParser0.depth();
    hierarchyPropertyParser0.add("hi!");
    boolean b10 = hierarchyPropertyParser0.goTo("hi!");
    hierarchyPropertyParser0.setSeperator("hi!");
    java.lang.String[] str_array14 = hierarchyPropertyParser0.tokenize("hi!");
    boolean b16 = hierarchyPropertyParser0.goTo("");
    hierarchyPropertyParser0.goToParent();
    boolean b19 = hierarchyPropertyParser0.isHierachic(".(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test121"); }


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
    hierarchyPropertyParser0.goToParent();
    hierarchyPropertyParser0.setSeperator("null(0)[null]\n");
    boolean b21 = hierarchyPropertyParser0.isRootReached();
    hierarchyPropertyParser0.add("hi!");
    int i24 = hierarchyPropertyParser0.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test122"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    boolean b4 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str5 = hierarchyPropertyParser0.context();
    java.lang.String str6 = hierarchyPropertyParser0.parentValue();
    int i7 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.setSeperator("hi!(0)[null]\n");
    java.lang.String str10 = hierarchyPropertyParser0.parentValue();
    int i11 = hierarchyPropertyParser0.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test123"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    java.lang.String str1 = hierarchyPropertyParser0.parentValue();
    java.lang.String str2 = hierarchyPropertyParser0.showTree();
    int i3 = hierarchyPropertyParser0.getLevel();
    hierarchyPropertyParser0.add("hi!");
    java.lang.String str6 = hierarchyPropertyParser0.getSeperator();
    java.util.Vector vector7 = null;
    int i9 = hierarchyPropertyParser0.search(vector7, "hi!(0)[null]\n(0)[null]\n");
    java.lang.String str10 = hierarchyPropertyParser0.parentValue();
    java.lang.String str11 = hierarchyPropertyParser0.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "null(0)[null]\n"+ "'", str2.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "."+ "'", str6.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "."+ "'", str11.equals("."));

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test124"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.setSeperator("");
    hierarchyPropertyParser0.goToParent();
    java.lang.String[] str_array7 = hierarchyPropertyParser0.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test125"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser2.search(vector3, "");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str7 = hierarchyPropertyParser2.fullValue();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.tokenize("hi!(0)[null]\n");
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.childrenValues();
    hierarchyPropertyParser2.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test126"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    boolean b7 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str8 = hierarchyPropertyParser0.context();
    java.lang.String[] str_array9 = hierarchyPropertyParser0.childrenValues();
    hierarchyPropertyParser0.setSeperator("null(0)[null]\n");
    java.lang.String str12 = hierarchyPropertyParser0.showTree();
    int i13 = hierarchyPropertyParser0.getLevel();
    int i14 = hierarchyPropertyParser0.depth();
    hierarchyPropertyParser0.build("hi!", "hi!");
    java.lang.String str18 = hierarchyPropertyParser0.parentValue();
    boolean b19 = hierarchyPropertyParser0.isRootReached();
    java.lang.String[] str_array20 = hierarchyPropertyParser0.childrenValues();
    boolean b22 = hierarchyPropertyParser0.contains("hi!(0)[null]\n(0)[null]\n");
    int i23 = hierarchyPropertyParser0.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null(0)[null]\n"+ "'", str12.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test127"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "null(0)[null]\n");
    int i3 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.setSeperator(".");
    hierarchyPropertyParser2.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test128"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToParent();
    boolean b6 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str7 = hierarchyPropertyParser0.context();
    int i8 = hierarchyPropertyParser0.getLevel();
    int i9 = hierarchyPropertyParser0.numChildren();
    java.lang.String[] str_array11 = hierarchyPropertyParser0.tokenize(".(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test129"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    boolean b4 = hierarchyPropertyParser2.contains("null(0)[null]\n");
    boolean b5 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str6 = hierarchyPropertyParser2.context();
    int i7 = hierarchyPropertyParser2.numChildren();
    int i8 = hierarchyPropertyParser2.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test130"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    boolean b7 = hierarchyPropertyParser0.goDown("");
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser0.search(vector8, "hi!");
    java.lang.String str11 = hierarchyPropertyParser0.getValue();
    java.lang.String str12 = hierarchyPropertyParser0.parentValue();
    boolean b13 = hierarchyPropertyParser0.isRootReached();
    boolean b15 = hierarchyPropertyParser0.isHierachic(".");
    boolean b17 = hierarchyPropertyParser0.isHierachic("null(0)[null]\n(0)[null]\n");
    java.util.Vector vector18 = null;
    int i20 = hierarchyPropertyParser0.search(vector18, "null(0)[null]\n(0)[null]\n");
    java.lang.String[] str_array21 = hierarchyPropertyParser0.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array21);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test131"); }


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
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test132"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    java.lang.String str1 = hierarchyPropertyParser0.parentValue();
    java.lang.String str2 = hierarchyPropertyParser0.showTree();
    int i3 = hierarchyPropertyParser0.numChildren();
    java.lang.String[] str_array4 = hierarchyPropertyParser0.childrenValues();
    int i5 = hierarchyPropertyParser0.depth();
    java.lang.String str6 = hierarchyPropertyParser0.context();
    boolean b8 = hierarchyPropertyParser0.goToChild("hi!");
    int i9 = hierarchyPropertyParser0.depth();
    java.lang.String str10 = hierarchyPropertyParser0.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "null(0)[null]\n"+ "'", str2.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "."+ "'", str10.equals("."));

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test133"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    java.lang.String str1 = hierarchyPropertyParser0.parentValue();
    java.lang.String str2 = hierarchyPropertyParser0.parentValue();
    java.lang.String str3 = hierarchyPropertyParser0.showTree();
    boolean b5 = hierarchyPropertyParser0.contains("hi!");
    java.util.Vector vector6 = null;
    int i8 = hierarchyPropertyParser0.search(vector6, "hi!");
    java.lang.String str9 = hierarchyPropertyParser0.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null(0)[null]\n"+ "'", str3.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test134"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    boolean b5 = hierarchyPropertyParser0.goDown("");
    hierarchyPropertyParser0.setSeperator("");
    java.lang.String str8 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToParent();
    boolean b11 = hierarchyPropertyParser0.isHierachic("");
    boolean b12 = hierarchyPropertyParser0.isLeafReached();
    hierarchyPropertyParser0.build("hi!", "");
    java.lang.String str16 = hierarchyPropertyParser0.getSeperator();
    java.lang.String[] str_array18 = hierarchyPropertyParser0.tokenize("");
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test135"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    java.lang.String[] str_array4 = hierarchyPropertyParser0.childrenValues();
    boolean b5 = hierarchyPropertyParser0.isRootReached();
    boolean b7 = hierarchyPropertyParser0.goDown("hi!");
    boolean b9 = hierarchyPropertyParser0.goDown("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test136"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    int i3 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.getLevel();
    int i6 = hierarchyPropertyParser0.numChildren();
    java.lang.String str7 = hierarchyPropertyParser0.getValue();
    java.lang.String[] str_array9 = hierarchyPropertyParser0.tokenize("hi!(0)[null]\n");
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
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test137"); }


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
    hierarchyPropertyParser0.add(".");
    java.lang.String str17 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test138"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "null(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test139"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    java.lang.String str6 = hierarchyPropertyParser0.context();
    boolean b8 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String[] str_array10 = hierarchyPropertyParser0.tokenize("");
    java.lang.String[] str_array12 = hierarchyPropertyParser0.tokenize(".");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test140"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    java.lang.String[] str_array5 = hierarchyPropertyParser0.childrenValues();
    java.lang.String[] str_array7 = hierarchyPropertyParser0.tokenize("hi!");
    hierarchyPropertyParser0.goToRoot();
    boolean b10 = hierarchyPropertyParser0.isHierachic("");
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
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test141"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToParent();
    int i6 = hierarchyPropertyParser0.numChildren();
    java.lang.String[] str_array8 = hierarchyPropertyParser0.tokenize("hi!");
    boolean b10 = hierarchyPropertyParser0.contains("hi!(0)[null]\n");
    hierarchyPropertyParser0.setSeperator("");
    java.lang.String str13 = hierarchyPropertyParser0.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null(0)[null]\n"+ "'", str13.equals("null(0)[null]\n"));

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test142"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToParent();
    boolean b6 = hierarchyPropertyParser0.isRootReached();
    java.lang.String[] str_array7 = hierarchyPropertyParser0.childrenValues();
    boolean b8 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str9 = hierarchyPropertyParser0.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test143"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    boolean b5 = hierarchyPropertyParser0.goDown("");
    hierarchyPropertyParser0.setSeperator("");
    java.lang.String str8 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToParent();
    boolean b11 = hierarchyPropertyParser0.isHierachic("");
    java.lang.String str12 = hierarchyPropertyParser0.context();
    boolean b13 = hierarchyPropertyParser0.isLeafReached();
    hierarchyPropertyParser0.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test144"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    java.lang.String str1 = hierarchyPropertyParser0.parentValue();
    boolean b3 = hierarchyPropertyParser0.contains("hi!");
    int i4 = hierarchyPropertyParser0.numChildren();
    boolean b6 = hierarchyPropertyParser0.isHierachic("");
    boolean b8 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str9 = hierarchyPropertyParser0.parentValue();
    int i10 = hierarchyPropertyParser0.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
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
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test145"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    boolean b7 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str8 = hierarchyPropertyParser0.context();
    java.lang.String[] str_array9 = hierarchyPropertyParser0.childrenValues();
    hierarchyPropertyParser0.setSeperator("null(0)[null]\n");
    boolean b13 = hierarchyPropertyParser0.isHierachic("");
    boolean b15 = hierarchyPropertyParser0.isHierachic("");
    java.util.Vector vector16 = null;
    int i18 = hierarchyPropertyParser0.search(vector16, ".");
    java.lang.String str19 = hierarchyPropertyParser0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test146"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToRoot();
    hierarchyPropertyParser0.goToRoot();
    int i8 = hierarchyPropertyParser0.numChildren();
    java.lang.String str9 = hierarchyPropertyParser0.showTree();
    int i10 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToParent();
    hierarchyPropertyParser0.add("null(0)[null]\n");
    boolean b15 = hierarchyPropertyParser0.goTo("hi!(0)[null]\n(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null(0)[null]\n"+ "'", str9.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test147"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser2.search(vector3, "");
    int i6 = hierarchyPropertyParser2.depth();
    java.util.Vector vector7 = null;
    int i9 = hierarchyPropertyParser2.search(vector7, "");
    int i10 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.add("hi!(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test148"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    boolean b5 = hierarchyPropertyParser0.goDown("");
    hierarchyPropertyParser0.setSeperator("");
    java.lang.String str8 = hierarchyPropertyParser0.getValue();
    boolean b10 = hierarchyPropertyParser0.goToChild("");
    java.lang.String[] str_array11 = hierarchyPropertyParser0.childrenValues();
    int i12 = hierarchyPropertyParser0.depth();
    int i13 = hierarchyPropertyParser0.numChildren();
    int i14 = hierarchyPropertyParser0.getLevel();
    java.lang.String str15 = hierarchyPropertyParser0.showTree();
    java.lang.String str16 = hierarchyPropertyParser0.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "null(0)[null]\n"+ "'", str15.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test149"); }


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
    java.lang.String str16 = hierarchyPropertyParser0.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test150"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToRoot();
    hierarchyPropertyParser0.goToRoot();
    int i8 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.add("hi!(0)[null]\n");
    java.lang.String[] str_array11 = hierarchyPropertyParser0.childrenValues();
    int i12 = hierarchyPropertyParser0.getLevel();
    java.lang.String str13 = hierarchyPropertyParser0.getValue();
    java.lang.String[] str_array14 = hierarchyPropertyParser0.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!(0)[null]\n"+ "'", str13.equals("hi!(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array14);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test151"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    java.lang.String[] str_array5 = hierarchyPropertyParser0.childrenValues();
    boolean b7 = hierarchyPropertyParser0.goDown("hi!");
    hierarchyPropertyParser0.goToParent();
    int i9 = hierarchyPropertyParser0.getLevel();
    java.util.Vector vector10 = null;
    int i12 = hierarchyPropertyParser0.search(vector10, "null(0)[null]\n(0)[null]\n");
    boolean b14 = hierarchyPropertyParser0.isHierachic(".(0)[null]\n");
    java.lang.String[] str_array15 = hierarchyPropertyParser0.childrenValues();
    hierarchyPropertyParser0.add("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test152"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToRoot();
    boolean b7 = hierarchyPropertyParser0.isRootReached();
    boolean b8 = hierarchyPropertyParser0.isRootReached();
    boolean b9 = hierarchyPropertyParser0.isLeafReached();
    int i10 = hierarchyPropertyParser0.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test153"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    int i3 = hierarchyPropertyParser2.numChildren();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    int i5 = hierarchyPropertyParser2.getLevel();
    boolean b7 = hierarchyPropertyParser2.goToChild(".");
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str9 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.build("", "hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null(0)[null]\n"+ "'", str9.equals("null(0)[null]\n"));

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test154"); }


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
    java.lang.String str16 = hierarchyPropertyParser0.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "null(0)[null]\n"+ "'", str14.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "null(0)[null]\n"+ "'", str16.equals("null(0)[null]\n"));

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test155"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToParent();
    boolean b6 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String str7 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.setSeperator("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test156"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    java.lang.String str6 = hierarchyPropertyParser0.context();
    boolean b7 = hierarchyPropertyParser0.isLeafReached();
    boolean b9 = hierarchyPropertyParser0.isHierachic(".(0)[null]\n");
    hierarchyPropertyParser0.goToParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test157"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    boolean b4 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str5 = hierarchyPropertyParser0.showTree();
    java.lang.String[] str_array6 = hierarchyPropertyParser0.childrenValues();
    java.lang.String[] str_array8 = hierarchyPropertyParser0.tokenize("");
    hierarchyPropertyParser0.add("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null(0)[null]\n"+ "'", str5.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test158"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    boolean b7 = hierarchyPropertyParser0.goDown("hi!");
    int i8 = hierarchyPropertyParser0.depth();
    hierarchyPropertyParser0.add("hi!");
    java.lang.String[] str_array11 = hierarchyPropertyParser0.childrenValues();
    java.lang.String str12 = hierarchyPropertyParser0.getValue();
    boolean b14 = hierarchyPropertyParser0.goToChild("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test159"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    int i6 = hierarchyPropertyParser0.depth();
    hierarchyPropertyParser0.add("hi!");
    boolean b10 = hierarchyPropertyParser0.goTo("hi!");
    boolean b11 = hierarchyPropertyParser0.isRootReached();
    boolean b13 = hierarchyPropertyParser0.goTo("hi!");
    java.lang.String str14 = hierarchyPropertyParser0.context();
    hierarchyPropertyParser0.goToParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test160"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    boolean b7 = hierarchyPropertyParser0.goToChild("null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test161"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    boolean b4 = hierarchyPropertyParser0.isHierachic("null(0)[null]\n");
    java.lang.String[] str_array6 = hierarchyPropertyParser0.tokenize("hi!");
    hierarchyPropertyParser0.add("hi!(0)[null]\n");
    hierarchyPropertyParser0.add("null(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test162"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    int i3 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToParent();
    boolean b5 = hierarchyPropertyParser0.isRootReached();
    boolean b7 = hierarchyPropertyParser0.goDown("null(0)[null]\n");
    boolean b9 = hierarchyPropertyParser0.contains("null(0)[null]\n");
    java.lang.String str10 = hierarchyPropertyParser0.context();
    hierarchyPropertyParser0.goToParent();
    java.util.Vector vector12 = null;
    int i14 = hierarchyPropertyParser0.search(vector12, ".");
    java.lang.String str15 = hierarchyPropertyParser0.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test163"); }


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
    hierarchyPropertyParser0.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test164"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b1 = hierarchyPropertyParser0.isLeafReached();
    boolean b2 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.add("hi!");
    java.lang.String str6 = hierarchyPropertyParser0.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test165"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToRoot();
    int i6 = hierarchyPropertyParser0.depth();
    java.lang.String str7 = hierarchyPropertyParser0.showTree();
    java.lang.String str8 = hierarchyPropertyParser0.context();
    int i9 = hierarchyPropertyParser0.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null(0)[null]\n"+ "'", str7.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test166"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    int i6 = hierarchyPropertyParser0.depth();
    hierarchyPropertyParser0.add("hi!");
    boolean b10 = hierarchyPropertyParser0.goTo("hi!");
    hierarchyPropertyParser0.setSeperator("hi!");
    java.lang.String[] str_array14 = hierarchyPropertyParser0.tokenize("hi!");
    boolean b16 = hierarchyPropertyParser0.goTo("");
    int i17 = hierarchyPropertyParser0.getLevel();
    java.lang.String str18 = hierarchyPropertyParser0.context();
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
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test167"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    boolean b5 = hierarchyPropertyParser0.goDown("");
    hierarchyPropertyParser0.setSeperator("");
    java.lang.String str8 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToParent();
    boolean b10 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String str11 = hierarchyPropertyParser0.showTree();
    boolean b13 = hierarchyPropertyParser0.isHierachic("");
    boolean b14 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str15 = hierarchyPropertyParser0.fullValue();
    boolean b17 = hierarchyPropertyParser0.goDown("null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null(0)[null]\n"+ "'", str11.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test168"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    java.lang.String[] str_array6 = hierarchyPropertyParser0.tokenize("hi!");
    java.lang.String[] str_array8 = hierarchyPropertyParser0.tokenize("hi!");
    hierarchyPropertyParser0.goToRoot();
    java.lang.String str10 = hierarchyPropertyParser0.context();
    java.lang.String str11 = hierarchyPropertyParser0.context();
    java.lang.String str12 = hierarchyPropertyParser0.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test169"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    int i3 = hierarchyPropertyParser2.numChildren();
    java.lang.String str4 = hierarchyPropertyParser2.context();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.goToParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test170"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    int i3 = hierarchyPropertyParser2.numChildren();
    boolean b5 = hierarchyPropertyParser2.isHierachic("hi!");
    int i6 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.goToRoot();
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser2.search(vector8, "");
    boolean b12 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test171"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    boolean b7 = hierarchyPropertyParser0.goDown("hi!");
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser0.search(vector8, "");
    boolean b12 = hierarchyPropertyParser0.goToChild("");
    int i13 = hierarchyPropertyParser0.depth();
    hierarchyPropertyParser0.build("", "");
    int i17 = hierarchyPropertyParser0.getLevel();
    java.lang.String str18 = hierarchyPropertyParser0.fullValue();
    java.lang.String str19 = hierarchyPropertyParser0.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "null(0)[null]\n"+ "'", str19.equals("null(0)[null]\n"));

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test172"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    boolean b7 = hierarchyPropertyParser0.goDown("hi!");
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser0.search(vector8, "");
    boolean b12 = hierarchyPropertyParser0.goToChild("");
    int i13 = hierarchyPropertyParser0.depth();
    hierarchyPropertyParser0.build("", "");
    int i17 = hierarchyPropertyParser0.getLevel();
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
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test173"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    boolean b5 = hierarchyPropertyParser0.goDown("");
    hierarchyPropertyParser0.setSeperator("");
    java.lang.String str8 = hierarchyPropertyParser0.getValue();
    boolean b10 = hierarchyPropertyParser0.goToChild("");
    java.lang.String str11 = hierarchyPropertyParser0.getValue();
    int i12 = hierarchyPropertyParser0.depth();
    hierarchyPropertyParser0.setSeperator("null(0)[null]\n(0)[null]\n");
    java.lang.String str15 = hierarchyPropertyParser0.getSeperator();
    java.lang.String[] str_array16 = hierarchyPropertyParser0.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "null(0)[null]\n(0)[null]\n"+ "'", str15.equals("null(0)[null]\n(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test174"); }


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
    java.util.Vector vector15 = null;
    int i17 = hierarchyPropertyParser0.search(vector15, "hi!(0)[null]\n(0)[null]\n");
    java.lang.String str18 = hierarchyPropertyParser0.parentValue();
    java.lang.String[] str_array19 = hierarchyPropertyParser0.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test175"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    java.lang.String[] str_array5 = hierarchyPropertyParser0.childrenValues();
    boolean b7 = hierarchyPropertyParser0.goDown("hi!");
    boolean b9 = hierarchyPropertyParser0.goDown("hi!");
    boolean b11 = hierarchyPropertyParser0.goToChild("");
    boolean b13 = hierarchyPropertyParser0.isHierachic("null(0)[null]\n");
    int i14 = hierarchyPropertyParser0.depth();
    boolean b16 = hierarchyPropertyParser0.goDown("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test176"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    java.lang.String[] str_array5 = hierarchyPropertyParser0.childrenValues();
    int i6 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.add("null(0)[null]\n");
    java.lang.String str9 = hierarchyPropertyParser0.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "."+ "'", str9.equals("."));

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test177"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    int i6 = hierarchyPropertyParser0.depth();
    hierarchyPropertyParser0.add("hi!");
    boolean b10 = hierarchyPropertyParser0.goTo("hi!");
    boolean b12 = hierarchyPropertyParser0.goDown("hi!");
    int i13 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToParent();
    hierarchyPropertyParser0.goToRoot();
    int i16 = hierarchyPropertyParser0.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test178"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    int i6 = hierarchyPropertyParser0.getLevel();
    boolean b8 = hierarchyPropertyParser0.contains("hi!");
    hierarchyPropertyParser0.setSeperator(".");
    boolean b12 = hierarchyPropertyParser0.goToChild("");
    int i13 = hierarchyPropertyParser0.depth();
    java.lang.String str14 = hierarchyPropertyParser0.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test179"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    boolean b7 = hierarchyPropertyParser0.goDown("hi!");
    int i8 = hierarchyPropertyParser0.depth();
    hierarchyPropertyParser0.goToRoot();
    java.lang.String str10 = hierarchyPropertyParser0.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test180"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    // The following exception was thrown during execution in test generation
    try {
    boolean b7 = hierarchyPropertyParser0.goTo("hi!(0)[null]\n(0)[null]\n");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test181"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    int i3 = hierarchyPropertyParser0.numChildren();
    java.lang.String[] str_array5 = hierarchyPropertyParser0.tokenize("");
    int i6 = hierarchyPropertyParser0.getLevel();
    boolean b8 = hierarchyPropertyParser0.goDown("null(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test182"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    boolean b4 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str5 = hierarchyPropertyParser0.context();
    java.lang.String str6 = hierarchyPropertyParser0.parentValue();
    int i7 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.setSeperator("hi!(0)[null]\n");
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser0.build(".", "hi!(0)[null]\n(0)[null]\n");
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
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test183"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    int i3 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToParent();
    boolean b5 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str6 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.build("", "null(0)[null]\n");
    int i10 = hierarchyPropertyParser0.depth();
    java.lang.String str11 = hierarchyPropertyParser0.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test184"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!");
    java.lang.String str3 = hierarchyPropertyParser2.getValue();
    hierarchyPropertyParser2.build("hi!(0)[null]\n(0)[null]\n", "hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test185"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToRoot();
    java.lang.String str6 = hierarchyPropertyParser0.parentValue();
    java.lang.String str7 = hierarchyPropertyParser0.getSeperator();
    boolean b9 = hierarchyPropertyParser0.isHierachic("null(0)[null]\n");
    boolean b11 = hierarchyPropertyParser0.isHierachic("null(0)[null]\n");
    hierarchyPropertyParser0.setSeperator("null(0)[null]\n");
    java.lang.String str14 = hierarchyPropertyParser0.getSeperator();
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
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "."+ "'", str7.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "null(0)[null]\n"+ "'", str14.equals("null(0)[null]\n"));

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test186"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    java.lang.String[] str_array5 = hierarchyPropertyParser0.childrenValues();
    boolean b7 = hierarchyPropertyParser0.goDown("hi!");
    boolean b9 = hierarchyPropertyParser0.goDown("hi!");
    boolean b11 = hierarchyPropertyParser0.goToChild("");
    java.lang.String str12 = hierarchyPropertyParser0.getSeperator();
    java.lang.String str13 = hierarchyPropertyParser0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "."+ "'", str12.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test187"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    java.lang.String[] str_array5 = hierarchyPropertyParser0.childrenValues();
    boolean b7 = hierarchyPropertyParser0.goDown("hi!");
    hierarchyPropertyParser0.goToParent();
    int i9 = hierarchyPropertyParser0.getLevel();
    java.util.Vector vector10 = null;
    int i12 = hierarchyPropertyParser0.search(vector10, "null(0)[null]\n(0)[null]\n");
    boolean b14 = hierarchyPropertyParser0.isHierachic("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test188"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    boolean b5 = hierarchyPropertyParser0.goDown("");
    hierarchyPropertyParser0.setSeperator("");
    java.lang.String str8 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToParent();
    boolean b11 = hierarchyPropertyParser0.isHierachic("");
    boolean b12 = hierarchyPropertyParser0.isLeafReached();
    hierarchyPropertyParser0.build("hi!", "");
    java.util.Vector vector16 = null;
    int i18 = hierarchyPropertyParser0.search(vector16, "");
    java.lang.String str19 = hierarchyPropertyParser0.showTree();
    int i20 = hierarchyPropertyParser0.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!(0)[null]\n"+ "'", str19.equals("hi!(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test189"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    java.lang.String str1 = hierarchyPropertyParser0.parentValue();
    java.lang.String str2 = hierarchyPropertyParser0.showTree();
    int i3 = hierarchyPropertyParser0.getLevel();
    boolean b4 = hierarchyPropertyParser0.isRootReached();
    hierarchyPropertyParser0.goToRoot();
    hierarchyPropertyParser0.goToRoot();
    java.lang.String str7 = hierarchyPropertyParser0.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "null(0)[null]\n"+ "'", str2.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test190"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    int i6 = hierarchyPropertyParser0.getLevel();
    hierarchyPropertyParser0.build("", "hi!");
    java.lang.String str10 = hierarchyPropertyParser0.context();
    int i11 = hierarchyPropertyParser0.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test191"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    boolean b4 = hierarchyPropertyParser0.isHierachic("null(0)[null]\n");
    java.lang.String[] str_array6 = hierarchyPropertyParser0.tokenize("hi!");
    hierarchyPropertyParser0.add("hi!(0)[null]\n");
    hierarchyPropertyParser0.goToParent();
    boolean b11 = hierarchyPropertyParser0.goTo("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test192"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToParent();
    boolean b6 = hierarchyPropertyParser0.isRootReached();
    java.lang.String[] str_array7 = hierarchyPropertyParser0.childrenValues();
    boolean b9 = hierarchyPropertyParser0.goDown("");
    java.lang.String[] str_array11 = hierarchyPropertyParser0.tokenize("hi!(0)[null]\n(0)[null]\n");
    java.lang.String[] str_array12 = hierarchyPropertyParser0.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test193"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b1 = hierarchyPropertyParser0.isLeafReached();
    boolean b2 = hierarchyPropertyParser0.isRootReached();
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test194"); }


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
    hierarchyPropertyParser0.setSeperator("hi!(0)[null]\n(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null(0)[null]\n"+ "'", str13.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test195"); }


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
    hierarchyPropertyParser0.build("", ".");
    hierarchyPropertyParser0.goToParent();
    boolean b20 = hierarchyPropertyParser0.isHierachic("hi!(0)[null]\n(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test196"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToParent();
    boolean b6 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str7 = hierarchyPropertyParser0.context();
    boolean b9 = hierarchyPropertyParser0.contains("null(0)[null]\n");
    java.lang.String str10 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToRoot();
    boolean b13 = hierarchyPropertyParser0.isHierachic(".");
    java.lang.String str14 = hierarchyPropertyParser0.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test197"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToParent();
    boolean b6 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str7 = hierarchyPropertyParser0.context();
    boolean b9 = hierarchyPropertyParser0.contains("null(0)[null]\n");
    int i10 = hierarchyPropertyParser0.numChildren();
    boolean b12 = hierarchyPropertyParser0.goDown("null(0)[null]\n");
    int i13 = hierarchyPropertyParser0.depth();
    int i14 = hierarchyPropertyParser0.getLevel();
    hierarchyPropertyParser0.add("null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test198"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.setSeperator(".");
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser0.search(vector8, "null(0)[null]\n");
    hierarchyPropertyParser0.setSeperator("hi!(0)[null]\n");
    boolean b13 = hierarchyPropertyParser0.isLeafReached();
    boolean b15 = hierarchyPropertyParser0.goToChild("hi!(0)[null]\n(0)[null]\n");
    java.lang.String str16 = hierarchyPropertyParser0.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!(0)[null]\n"+ "'", str16.equals("hi!(0)[null]\n"));

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test199"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.goToParent();
    java.util.Vector vector4 = null;
    int i6 = hierarchyPropertyParser2.search(vector4, "hi!(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test200"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "null(0)[null]\n");
    java.lang.String str3 = hierarchyPropertyParser2.getValue();
    int i4 = hierarchyPropertyParser2.getLevel();
    java.lang.String str5 = hierarchyPropertyParser2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test201"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    int i3 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToParent();
    boolean b5 = hierarchyPropertyParser0.isRootReached();
    boolean b6 = hierarchyPropertyParser0.isLeafReached();
    boolean b7 = hierarchyPropertyParser0.isRootReached();
    hierarchyPropertyParser0.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test202"); }


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
    boolean b14 = hierarchyPropertyParser0.goToChild("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test203"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    java.lang.String str6 = hierarchyPropertyParser0.context();
    boolean b8 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String[] str_array10 = hierarchyPropertyParser0.tokenize("");
    java.lang.String[] str_array12 = hierarchyPropertyParser0.tokenize("hi!");
    java.util.Vector vector13 = null;
    int i15 = hierarchyPropertyParser0.search(vector13, ".");
    boolean b16 = hierarchyPropertyParser0.isLeafReached();
    boolean b18 = hierarchyPropertyParser0.goToChild(".");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test204"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    boolean b7 = hierarchyPropertyParser0.goDown("hi!");
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser0.search(vector8, "");
    hierarchyPropertyParser0.setSeperator("null(0)[null]\n");
    java.lang.String str13 = hierarchyPropertyParser0.getSeperator();
    java.lang.String str14 = hierarchyPropertyParser0.fullValue();
    java.lang.String[] str_array15 = hierarchyPropertyParser0.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null(0)[null]\n"+ "'", str13.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test205"); }


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
    int i16 = hierarchyPropertyParser0.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test206"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    boolean b7 = hierarchyPropertyParser0.goDown("hi!");
    hierarchyPropertyParser0.setSeperator("hi!");
    hierarchyPropertyParser0.goToRoot();
    java.lang.String str11 = hierarchyPropertyParser0.parentValue();
    boolean b13 = hierarchyPropertyParser0.goDown("hi!(0)[null]\n(0)[null]\n");
    int i14 = hierarchyPropertyParser0.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test207"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    int i3 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.getLevel();
    java.lang.String str6 = hierarchyPropertyParser0.getValue();
    boolean b8 = hierarchyPropertyParser0.contains("null(0)[null]\n");
    boolean b10 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str11 = hierarchyPropertyParser0.showTree();
    hierarchyPropertyParser0.setSeperator("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null(0)[null]\n"+ "'", str11.equals("null(0)[null]\n"));

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test208"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser2.search(vector3, "");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str7 = hierarchyPropertyParser2.fullValue();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.tokenize("hi!(0)[null]\n");
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n");
    java.lang.String str12 = hierarchyPropertyParser2.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null(0)[null]\n"+ "'", str12.equals("null(0)[null]\n"));

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test209"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "null(0)[null]\n");
    java.lang.String[] str_array4 = hierarchyPropertyParser2.tokenize("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test210"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.goToParent();
    int i4 = hierarchyPropertyParser2.depth();
    int i5 = hierarchyPropertyParser2.numChildren();
    java.util.Vector vector6 = null;
    int i8 = hierarchyPropertyParser2.search(vector6, "");
    int i9 = hierarchyPropertyParser2.numChildren();
    boolean b10 = hierarchyPropertyParser2.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test211"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToParent();
    boolean b6 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str7 = hierarchyPropertyParser0.context();
    boolean b9 = hierarchyPropertyParser0.contains("null(0)[null]\n");
    int i10 = hierarchyPropertyParser0.numChildren();
    boolean b12 = hierarchyPropertyParser0.goDown("null(0)[null]\n");
    int i13 = hierarchyPropertyParser0.depth();
    int i14 = hierarchyPropertyParser0.getLevel();
    boolean b16 = hierarchyPropertyParser0.goToChild("null(0)[null]\n(0)[null]\n");
    boolean b18 = hierarchyPropertyParser0.isHierachic("null(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test212"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.goToParent();
    int i4 = hierarchyPropertyParser2.depth();
    java.lang.String str5 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.goToParent();
    int i7 = hierarchyPropertyParser2.getLevel();
    java.lang.String str8 = hierarchyPropertyParser2.getValue();
    hierarchyPropertyParser2.add(".(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test213"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    int i3 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToParent();
    boolean b5 = hierarchyPropertyParser0.isRootReached();
    boolean b7 = hierarchyPropertyParser0.goDown("null(0)[null]\n");
    boolean b9 = hierarchyPropertyParser0.contains("null(0)[null]\n");
    java.lang.String str10 = hierarchyPropertyParser0.context();
    java.lang.String[] str_array12 = hierarchyPropertyParser0.tokenize("hi!(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test214"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    java.lang.String str5 = hierarchyPropertyParser0.fullValue();
    int i6 = hierarchyPropertyParser0.numChildren();
    int i7 = hierarchyPropertyParser0.numChildren();
    boolean b8 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str9 = hierarchyPropertyParser0.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test215"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    int i6 = hierarchyPropertyParser0.getLevel();
    hierarchyPropertyParser0.build("", "hi!");
    int i10 = hierarchyPropertyParser0.getLevel();
    hierarchyPropertyParser0.goToRoot();
    java.lang.String str12 = hierarchyPropertyParser0.context();
    java.lang.String str13 = hierarchyPropertyParser0.fullValue();
    int i14 = hierarchyPropertyParser0.numChildren();
    java.lang.String[] str_array16 = hierarchyPropertyParser0.tokenize("hi!(0)[null]\n(0)[null]\n");
    java.lang.String[] str_array18 = hierarchyPropertyParser0.tokenize("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test216"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.setSeperator(".");
    java.lang.String str8 = hierarchyPropertyParser0.parentValue();
    java.lang.String[] str_array9 = hierarchyPropertyParser0.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test217"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    int i3 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.getLevel();
    hierarchyPropertyParser0.build("", "hi!");
    java.util.Vector vector9 = null;
    int i11 = hierarchyPropertyParser0.search(vector9, "hi!(0)[null]\n");
    boolean b13 = hierarchyPropertyParser0.goToChild("");
    hierarchyPropertyParser0.goToParent();
    hierarchyPropertyParser0.setSeperator(".");
    java.util.Vector vector17 = null;
    int i19 = hierarchyPropertyParser0.search(vector17, "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == (-1));

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test218"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    java.lang.String str1 = hierarchyPropertyParser0.parentValue();
    java.lang.String str2 = hierarchyPropertyParser0.showTree();
    int i3 = hierarchyPropertyParser0.numChildren();
    java.lang.String[] str_array4 = hierarchyPropertyParser0.childrenValues();
    int i5 = hierarchyPropertyParser0.depth();
    java.lang.String str6 = hierarchyPropertyParser0.context();
    int i7 = hierarchyPropertyParser0.getLevel();
    java.lang.String[] str_array8 = hierarchyPropertyParser0.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "null(0)[null]\n"+ "'", str2.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test219"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    int i6 = hierarchyPropertyParser0.getLevel();
    hierarchyPropertyParser0.build("", "hi!");
    int i10 = hierarchyPropertyParser0.getLevel();
    java.lang.String str11 = hierarchyPropertyParser0.parentValue();
    boolean b12 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String str13 = hierarchyPropertyParser0.getValue();
    java.lang.String[] str_array14 = hierarchyPropertyParser0.childrenValues();
    boolean b16 = hierarchyPropertyParser0.goToChild("hi!(0)[null]\n(0)[null]\n");
    int i17 = hierarchyPropertyParser0.getLevel();
    int i18 = hierarchyPropertyParser0.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test220"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    boolean b7 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str8 = hierarchyPropertyParser0.context();
    java.lang.String[] str_array9 = hierarchyPropertyParser0.childrenValues();
    hierarchyPropertyParser0.setSeperator("null(0)[null]\n");
    java.lang.String str12 = hierarchyPropertyParser0.showTree();
    int i13 = hierarchyPropertyParser0.getLevel();
    int i14 = hierarchyPropertyParser0.depth();
    hierarchyPropertyParser0.build("hi!", "hi!");
    java.lang.String str18 = hierarchyPropertyParser0.parentValue();
    java.lang.String str19 = hierarchyPropertyParser0.fullValue();
    int i20 = hierarchyPropertyParser0.depth();
    java.lang.String str21 = hierarchyPropertyParser0.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null(0)[null]\n"+ "'", str12.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "null(0)[null]\n"+ "'", str21.equals("null(0)[null]\n"));

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test221"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToRoot();
    boolean b7 = hierarchyPropertyParser0.goToChild("hi!");
    int i8 = hierarchyPropertyParser0.getLevel();
    int i9 = hierarchyPropertyParser0.depth();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser0.goToChild((int)(byte)0);
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
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test222"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToParent();
    boolean b6 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str7 = hierarchyPropertyParser0.context();
    boolean b9 = hierarchyPropertyParser0.contains("null(0)[null]\n");
    int i10 = hierarchyPropertyParser0.numChildren();
    boolean b12 = hierarchyPropertyParser0.goDown("null(0)[null]\n");
    java.lang.String[] str_array13 = hierarchyPropertyParser0.childrenValues();
    java.util.Vector vector14 = null;
    int i16 = hierarchyPropertyParser0.search(vector14, "hi!");
    boolean b18 = hierarchyPropertyParser0.goToChild(".");
    hierarchyPropertyParser0.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test223"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    boolean b5 = hierarchyPropertyParser0.goDown("");
    hierarchyPropertyParser0.setSeperator("");
    java.lang.String str8 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToParent();
    boolean b11 = hierarchyPropertyParser0.isHierachic("");
    boolean b12 = hierarchyPropertyParser0.isLeafReached();
    hierarchyPropertyParser0.build("hi!", "");
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser0.build(".", "hi!(0)[null]\n");
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
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test224"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    java.lang.String[] str_array5 = hierarchyPropertyParser0.childrenValues();
    java.lang.String[] str_array7 = hierarchyPropertyParser0.tokenize("hi!");
    java.lang.String str8 = hierarchyPropertyParser0.fullValue();
    int i9 = hierarchyPropertyParser0.numChildren();
    java.lang.String str10 = hierarchyPropertyParser0.parentValue();
    java.lang.String[] str_array11 = hierarchyPropertyParser0.childrenValues();
    java.lang.String str12 = hierarchyPropertyParser0.fullValue();
    hierarchyPropertyParser0.goToParent();
    boolean b15 = hierarchyPropertyParser0.goDown("null(0)[null]\n(0)[null]\n");
    boolean b17 = hierarchyPropertyParser0.goDown("hi!(0)[null]\n");
    java.lang.String[] str_array18 = hierarchyPropertyParser0.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test225"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", ".(0)[null]\n");

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test226"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    java.lang.String str6 = hierarchyPropertyParser0.context();
    java.lang.String str7 = hierarchyPropertyParser0.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "."+ "'", str7.equals("."));

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test227"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToRoot();
    hierarchyPropertyParser0.goToParent();
    int i8 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.add("hi!");
    java.lang.String str11 = hierarchyPropertyParser0.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test228"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToRoot();
    hierarchyPropertyParser0.goToRoot();
    int i8 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.add("hi!(0)[null]\n");
    java.lang.String[] str_array11 = hierarchyPropertyParser0.childrenValues();
    int i12 = hierarchyPropertyParser0.getLevel();
    boolean b14 = hierarchyPropertyParser0.goToChild("hi!(0)[null]\n");
    java.lang.String str15 = hierarchyPropertyParser0.getValue();
    boolean b17 = hierarchyPropertyParser0.goDown("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!(0)[null]\n"+ "'", str15.equals("hi!(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test229"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    int i3 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToParent();
    boolean b5 = hierarchyPropertyParser0.isRootReached();
    boolean b6 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String[] str_array8 = hierarchyPropertyParser0.tokenize("hi!");
    java.lang.String[] str_array10 = hierarchyPropertyParser0.tokenize("hi!");
    java.lang.String str11 = hierarchyPropertyParser0.fullValue();
    int i12 = hierarchyPropertyParser0.depth();
    java.lang.String str13 = hierarchyPropertyParser0.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test230"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    boolean b7 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str8 = hierarchyPropertyParser0.context();
    java.lang.String[] str_array9 = hierarchyPropertyParser0.childrenValues();
    hierarchyPropertyParser0.goToRoot();
    // The following exception was thrown during execution in test generation
    try {
    boolean b12 = hierarchyPropertyParser0.goTo(".");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test231"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    int i3 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToParent();
    boolean b5 = hierarchyPropertyParser0.isRootReached();
    boolean b6 = hierarchyPropertyParser0.isLeafReached();
    hierarchyPropertyParser0.goToParent();
    hierarchyPropertyParser0.goToRoot();
    java.lang.String str9 = hierarchyPropertyParser0.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "."+ "'", str9.equals("."));

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test232"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    boolean b5 = hierarchyPropertyParser0.goToChild("null(0)[null]\n");
    hierarchyPropertyParser0.add("null(0)[null]\n");
    int i8 = hierarchyPropertyParser0.getLevel();
    java.lang.String str9 = hierarchyPropertyParser0.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test233"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    boolean b7 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str8 = hierarchyPropertyParser0.context();
    java.lang.String[] str_array9 = hierarchyPropertyParser0.childrenValues();
    hierarchyPropertyParser0.setSeperator("null(0)[null]\n");
    java.lang.String str12 = hierarchyPropertyParser0.showTree();
    int i13 = hierarchyPropertyParser0.getLevel();
    hierarchyPropertyParser0.goToParent();
    java.lang.String str15 = hierarchyPropertyParser0.getValue();
    java.lang.String[] str_array16 = hierarchyPropertyParser0.childrenValues();
    hierarchyPropertyParser0.setSeperator("hi!(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null(0)[null]\n"+ "'", str12.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test234"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    java.lang.String[] str_array5 = hierarchyPropertyParser0.childrenValues();
    boolean b7 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str8 = hierarchyPropertyParser0.getSeperator();
    boolean b9 = hierarchyPropertyParser0.isRootReached();
    boolean b10 = hierarchyPropertyParser0.isLeafReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "."+ "'", str8.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test235"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    java.lang.String[] str_array5 = hierarchyPropertyParser0.childrenValues();
    java.lang.String[] str_array7 = hierarchyPropertyParser0.tokenize("hi!");
    java.lang.String str8 = hierarchyPropertyParser0.fullValue();
    int i9 = hierarchyPropertyParser0.numChildren();
    int i10 = hierarchyPropertyParser0.depth();
    hierarchyPropertyParser0.goToRoot();
    boolean b12 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String str13 = hierarchyPropertyParser0.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test236"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToParent();
    java.util.Vector vector6 = null;
    int i8 = hierarchyPropertyParser0.search(vector6, "");
    java.lang.String str9 = hierarchyPropertyParser0.showTree();
    java.lang.String str10 = hierarchyPropertyParser0.getValue();
    boolean b12 = hierarchyPropertyParser0.goToChild("null(0)[null]\n");
    hierarchyPropertyParser0.setSeperator("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null(0)[null]\n"+ "'", str9.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test237"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    java.lang.String[] str_array5 = hierarchyPropertyParser0.childrenValues();
    boolean b7 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str8 = hierarchyPropertyParser0.context();
    hierarchyPropertyParser0.setSeperator("hi!");
    boolean b12 = hierarchyPropertyParser0.goDown("hi!(0)[null]\n(0)[null]\n");
    boolean b13 = hierarchyPropertyParser0.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test238"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    int i6 = hierarchyPropertyParser0.depth();
    java.lang.String str7 = hierarchyPropertyParser0.fullValue();
    int i8 = hierarchyPropertyParser0.depth();
    int i9 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.setSeperator("");
    boolean b13 = hierarchyPropertyParser0.isHierachic("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test239"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToParent();
    boolean b7 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser0.search(vector8, "null(0)[null]\n");
    java.lang.String str11 = hierarchyPropertyParser0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test240"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    boolean b7 = hierarchyPropertyParser0.goDown("");
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser0.search(vector8, "hi!");
    java.lang.String str11 = hierarchyPropertyParser0.getValue();
    java.lang.String str12 = hierarchyPropertyParser0.parentValue();
    int i13 = hierarchyPropertyParser0.numChildren();
    java.lang.String[] str_array15 = hierarchyPropertyParser0.tokenize("hi!(0)[null]\n");
    java.lang.String str16 = hierarchyPropertyParser0.fullValue();
    boolean b18 = hierarchyPropertyParser0.contains("null(0)[null]\n(0)[null]\n");
    java.lang.String str19 = hierarchyPropertyParser0.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test241"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser2.search(vector3, "");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str7 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str10 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.goToParent();
    // The following exception was thrown during execution in test generation
    try {
    boolean b13 = hierarchyPropertyParser2.goTo("null(0)[null]\n");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test242"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.setSeperator(".");
    java.lang.String str8 = hierarchyPropertyParser0.parentValue();
    java.lang.String[] str_array10 = hierarchyPropertyParser0.tokenize("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test243"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    int i6 = hierarchyPropertyParser0.depth();
    hierarchyPropertyParser0.add("hi!");
    boolean b10 = hierarchyPropertyParser0.goTo("hi!");
    hierarchyPropertyParser0.setSeperator("hi!");
    boolean b14 = hierarchyPropertyParser0.goTo("null(0)[null]\n");
    java.util.Vector vector15 = null;
    int i17 = hierarchyPropertyParser0.search(vector15, "");
    boolean b19 = hierarchyPropertyParser0.goTo("hi!(0)[null]\n(0)[null]\n");
    int i20 = hierarchyPropertyParser0.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test244"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    boolean b7 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str8 = hierarchyPropertyParser0.context();
    java.lang.String[] str_array9 = hierarchyPropertyParser0.childrenValues();
    java.lang.String str10 = hierarchyPropertyParser0.fullValue();
    int i11 = hierarchyPropertyParser0.numChildren();
    boolean b12 = hierarchyPropertyParser0.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test245"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    java.lang.String str1 = hierarchyPropertyParser0.parentValue();
    boolean b3 = hierarchyPropertyParser0.goDown("");
    int i4 = hierarchyPropertyParser0.depth();
    java.util.Vector vector5 = null;
    int i7 = hierarchyPropertyParser0.search(vector5, "hi!(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test246"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    boolean b5 = hierarchyPropertyParser0.goDown("");
    hierarchyPropertyParser0.setSeperator("");
    java.lang.String str8 = hierarchyPropertyParser0.getValue();
    boolean b10 = hierarchyPropertyParser0.goToChild("");
    java.lang.String str11 = hierarchyPropertyParser0.fullValue();
    boolean b13 = hierarchyPropertyParser0.isHierachic(".");
    java.util.Vector vector14 = null;
    int i16 = hierarchyPropertyParser0.search(vector14, "hi!");
    hierarchyPropertyParser0.goToParent();
    java.lang.String str18 = hierarchyPropertyParser0.fullValue();
    boolean b19 = hierarchyPropertyParser0.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test247"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    java.lang.String[] str_array5 = hierarchyPropertyParser0.childrenValues();
    boolean b7 = hierarchyPropertyParser0.goDown("hi!");
    hierarchyPropertyParser0.goToParent();
    int i9 = hierarchyPropertyParser0.getLevel();
    java.util.Vector vector10 = null;
    int i12 = hierarchyPropertyParser0.search(vector10, "null(0)[null]\n(0)[null]\n");
    boolean b14 = hierarchyPropertyParser0.isHierachic(".(0)[null]\n");
    java.lang.String[] str_array15 = hierarchyPropertyParser0.childrenValues();
    boolean b16 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String str17 = hierarchyPropertyParser0.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "."+ "'", str17.equals("."));

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test248"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToRoot();
    hierarchyPropertyParser0.goToRoot();
    int i8 = hierarchyPropertyParser0.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test249"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    boolean b5 = hierarchyPropertyParser0.goDown("");
    hierarchyPropertyParser0.setSeperator("");
    java.lang.String str8 = hierarchyPropertyParser0.getValue();
    java.lang.String str9 = hierarchyPropertyParser0.showTree();
    int i10 = hierarchyPropertyParser0.depth();
    java.lang.String str11 = hierarchyPropertyParser0.parentValue();
    java.util.Vector vector12 = null;
    int i14 = hierarchyPropertyParser0.search(vector12, ".");
    java.lang.String[] str_array15 = hierarchyPropertyParser0.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null(0)[null]\n"+ "'", str9.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test250"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    boolean b7 = hierarchyPropertyParser0.goDown("hi!");
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser0.search(vector8, "");
    boolean b12 = hierarchyPropertyParser0.goToChild("");
    int i13 = hierarchyPropertyParser0.depth();
    hierarchyPropertyParser0.build("", "");
    java.util.Vector vector17 = null;
    int i19 = hierarchyPropertyParser0.search(vector17, "null(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == (-1));

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test251"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    boolean b7 = hierarchyPropertyParser0.goDown("");
    boolean b9 = hierarchyPropertyParser0.isHierachic("null(0)[null]\n");
    java.lang.String str10 = hierarchyPropertyParser0.getSeperator();
    java.lang.String str11 = hierarchyPropertyParser0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "."+ "'", str10.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test252"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    boolean b5 = hierarchyPropertyParser0.goDown("");
    hierarchyPropertyParser0.setSeperator("");
    java.lang.String str8 = hierarchyPropertyParser0.getValue();
    boolean b10 = hierarchyPropertyParser0.goToChild("");
    java.lang.String[] str_array11 = hierarchyPropertyParser0.childrenValues();
    int i12 = hierarchyPropertyParser0.depth();
    int i13 = hierarchyPropertyParser0.numChildren();
    int i14 = hierarchyPropertyParser0.getLevel();
    java.lang.String str15 = hierarchyPropertyParser0.showTree();
    java.lang.String str16 = hierarchyPropertyParser0.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "null(0)[null]\n"+ "'", str15.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test253"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    int i3 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToParent();
    boolean b5 = hierarchyPropertyParser0.isRootReached();
    boolean b6 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String[] str_array8 = hierarchyPropertyParser0.tokenize("hi!");
    boolean b9 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str10 = hierarchyPropertyParser0.getSeperator();
    boolean b12 = hierarchyPropertyParser0.contains("hi!");
    java.lang.String str13 = hierarchyPropertyParser0.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "."+ "'", str10.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null(0)[null]\n"+ "'", str13.equals("null(0)[null]\n"));

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test254"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    boolean b7 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str8 = hierarchyPropertyParser0.context();
    java.lang.String[] str_array9 = hierarchyPropertyParser0.childrenValues();
    hierarchyPropertyParser0.setSeperator("null(0)[null]\n");
    java.lang.String str12 = hierarchyPropertyParser0.showTree();
    int i13 = hierarchyPropertyParser0.getLevel();
    boolean b14 = hierarchyPropertyParser0.isRootReached();
    boolean b16 = hierarchyPropertyParser0.goToChild("");
    int i17 = hierarchyPropertyParser0.getLevel();
    hierarchyPropertyParser0.build("", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null(0)[null]\n"+ "'", str12.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test255"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    boolean b7 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str8 = hierarchyPropertyParser0.context();
    java.lang.String[] str_array9 = hierarchyPropertyParser0.childrenValues();
    hierarchyPropertyParser0.setSeperator("null(0)[null]\n");
    java.lang.String str12 = hierarchyPropertyParser0.showTree();
    int i13 = hierarchyPropertyParser0.getLevel();
    int i14 = hierarchyPropertyParser0.depth();
    hierarchyPropertyParser0.build("hi!", "hi!");
    java.lang.String str18 = hierarchyPropertyParser0.parentValue();
    boolean b19 = hierarchyPropertyParser0.isRootReached();
    boolean b20 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str21 = hierarchyPropertyParser0.getValue();
    java.lang.String str22 = hierarchyPropertyParser0.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null(0)[null]\n"+ "'", str12.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "null(0)[null]\n"+ "'", str22.equals("null(0)[null]\n"));

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test256"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    int i6 = hierarchyPropertyParser0.depth();
    hierarchyPropertyParser0.add("hi!");
    boolean b10 = hierarchyPropertyParser0.goTo("hi!");
    boolean b12 = hierarchyPropertyParser0.goDown("hi!");
    int i13 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToParent();
    boolean b15 = hierarchyPropertyParser0.isRootReached();
    int i16 = hierarchyPropertyParser0.depth();
    boolean b18 = hierarchyPropertyParser0.goToChild("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test257"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToParent();
    boolean b6 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str7 = hierarchyPropertyParser0.context();
    boolean b9 = hierarchyPropertyParser0.contains("null(0)[null]\n");
    java.lang.String str10 = hierarchyPropertyParser0.getValue();
    java.lang.String str11 = hierarchyPropertyParser0.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test258"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToRoot();
    int i6 = hierarchyPropertyParser0.depth();
    java.lang.String str7 = hierarchyPropertyParser0.showTree();
    int i8 = hierarchyPropertyParser0.getLevel();
    boolean b10 = hierarchyPropertyParser0.goDown("");
    java.lang.String str11 = hierarchyPropertyParser0.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null(0)[null]\n"+ "'", str7.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test259"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    int i3 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToParent();
    java.util.Vector vector5 = null;
    int i7 = hierarchyPropertyParser0.search(vector5, "null(0)[null]\n");
    java.lang.String[] str_array8 = hierarchyPropertyParser0.childrenValues();
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
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test260"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToParent();
    java.util.Vector vector6 = null;
    int i8 = hierarchyPropertyParser0.search(vector6, "");
    java.lang.String str9 = hierarchyPropertyParser0.fullValue();
    int i10 = hierarchyPropertyParser0.depth();
    java.lang.String str11 = hierarchyPropertyParser0.getSeperator();
    java.lang.String[] str_array12 = hierarchyPropertyParser0.childrenValues();
    boolean b14 = hierarchyPropertyParser0.goToChild("null(0)[null]\n");
    hierarchyPropertyParser0.setSeperator("null(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "."+ "'", str11.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test261"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToParent();
    int i6 = hierarchyPropertyParser0.getLevel();
    java.lang.String str7 = hierarchyPropertyParser0.context();
    int i8 = hierarchyPropertyParser0.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test262"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToParent();
    int i6 = hierarchyPropertyParser0.getLevel();
    java.lang.String[] str_array7 = hierarchyPropertyParser0.childrenValues();
    hierarchyPropertyParser0.setSeperator("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test263"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    hierarchyPropertyParser0.goToParent();
    hierarchyPropertyParser0.add("hi!");
    java.lang.String[] str_array7 = hierarchyPropertyParser0.tokenize("hi!");
    hierarchyPropertyParser0.add("hi!(0)[null]\n");
    java.lang.String str10 = hierarchyPropertyParser0.parentValue();
    boolean b11 = hierarchyPropertyParser0.isRootReached();
    java.lang.String[] str_array12 = hierarchyPropertyParser0.childrenValues();
    java.lang.String str13 = hierarchyPropertyParser0.showTree();
    hierarchyPropertyParser0.setSeperator("null(0)[null]\n(0)[null]\n");
    boolean b17 = hierarchyPropertyParser0.goToChild("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!(0)[null]\n"+ "'", str13.equals("hi!(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test264"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToParent();
    boolean b7 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str8 = hierarchyPropertyParser0.showTree();
    int i9 = hierarchyPropertyParser0.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null(0)[null]\n"+ "'", str8.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test265"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!(0)[null]\n(0)[null]\n(0)[null]\n", "hi!(0)[null]\n");

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test266"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    int i6 = hierarchyPropertyParser0.depth();
    hierarchyPropertyParser0.add("hi!");
    boolean b10 = hierarchyPropertyParser0.goTo("hi!");
    hierarchyPropertyParser0.setSeperator("hi!");
    int i13 = hierarchyPropertyParser0.getLevel();
    hierarchyPropertyParser0.add("hi!(0)[null]\n");
    boolean b17 = hierarchyPropertyParser0.contains("null(0)[null]\n");
    java.lang.String[] str_array19 = hierarchyPropertyParser0.tokenize("hi!");
    boolean b21 = hierarchyPropertyParser0.isHierachic(".");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test267"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    boolean b5 = hierarchyPropertyParser0.goDown("");
    hierarchyPropertyParser0.setSeperator("");
    java.lang.String str8 = hierarchyPropertyParser0.getValue();
    boolean b10 = hierarchyPropertyParser0.contains(".");
    java.lang.String[] str_array12 = hierarchyPropertyParser0.tokenize("null(0)[null]\n");
    java.lang.String str13 = hierarchyPropertyParser0.fullValue();
    java.lang.String str14 = hierarchyPropertyParser0.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test268"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    int i3 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.getLevel();
    java.lang.String str6 = hierarchyPropertyParser0.getValue();
    boolean b8 = hierarchyPropertyParser0.contains("null(0)[null]\n");
    boolean b10 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str11 = hierarchyPropertyParser0.showTree();
    java.lang.String str12 = hierarchyPropertyParser0.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null(0)[null]\n"+ "'", str11.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "."+ "'", str12.equals("."));

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test269"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    java.lang.String str1 = hierarchyPropertyParser0.parentValue();
    java.lang.String str2 = hierarchyPropertyParser0.showTree();
    int i3 = hierarchyPropertyParser0.getLevel();
    hierarchyPropertyParser0.add("hi!");
    boolean b7 = hierarchyPropertyParser0.contains("null(0)[null]\n");
    boolean b9 = hierarchyPropertyParser0.goToChild("hi!");
    hierarchyPropertyParser0.goToRoot();
    java.lang.String str11 = hierarchyPropertyParser0.context();
    java.lang.String str12 = hierarchyPropertyParser0.showTree();
    int i13 = hierarchyPropertyParser0.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "null(0)[null]\n"+ "'", str2.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!(0)[null]\n"+ "'", str12.equals("hi!(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test270"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    int i3 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToParent();
    boolean b5 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str6 = hierarchyPropertyParser0.getValue();
    java.lang.String str7 = hierarchyPropertyParser0.showTree();
    java.lang.String[] str_array9 = hierarchyPropertyParser0.tokenize("hi!");
    int i10 = hierarchyPropertyParser0.depth();
    java.lang.String str11 = hierarchyPropertyParser0.getSeperator();
    int i12 = hierarchyPropertyParser0.depth();
    int i13 = hierarchyPropertyParser0.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null(0)[null]\n"+ "'", str7.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "."+ "'", str11.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test271"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    java.lang.String str6 = hierarchyPropertyParser0.context();
    boolean b8 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String[] str_array10 = hierarchyPropertyParser0.tokenize("");
    java.lang.String[] str_array12 = hierarchyPropertyParser0.tokenize("hi!");
    boolean b14 = hierarchyPropertyParser0.isHierachic("null(0)[null]\n");
    java.lang.String[] str_array16 = hierarchyPropertyParser0.tokenize("null(0)[null]\n");
    int i17 = hierarchyPropertyParser0.depth();
    boolean b18 = hierarchyPropertyParser0.isLeafReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test272"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.goToParent();
    int i4 = hierarchyPropertyParser2.depth();
    java.lang.String str5 = hierarchyPropertyParser2.fullValue();
    java.lang.String str6 = hierarchyPropertyParser2.getSeperator();
    java.lang.String[] str_array8 = hierarchyPropertyParser2.tokenize("null(0)[null]\n(0)[null]\n");
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
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "."+ "'", str6.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test273"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    int i6 = hierarchyPropertyParser0.depth();
    hierarchyPropertyParser0.add("hi!");
    boolean b10 = hierarchyPropertyParser0.goTo("hi!");
    boolean b12 = hierarchyPropertyParser0.goDown("hi!");
    java.util.Vector vector13 = null;
    int i15 = hierarchyPropertyParser0.search(vector13, "hi!");
    java.lang.String str16 = hierarchyPropertyParser0.getValue();
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
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test274"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.fullValue();
    java.util.Vector vector5 = null;
    int i7 = hierarchyPropertyParser0.search(vector5, "hi!");
    hierarchyPropertyParser0.setSeperator("hi!");
    hierarchyPropertyParser0.goToParent();
    java.lang.String str11 = hierarchyPropertyParser0.showTree();
    java.lang.String str12 = hierarchyPropertyParser0.getValue();
    boolean b14 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str15 = hierarchyPropertyParser0.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null(0)[null]\n"+ "'", str11.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test275"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToRoot();
    int i6 = hierarchyPropertyParser0.depth();
    java.lang.String str7 = hierarchyPropertyParser0.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test276"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    java.lang.String[] str_array6 = hierarchyPropertyParser0.tokenize("hi!");
    java.lang.String[] str_array8 = hierarchyPropertyParser0.tokenize("hi!");
    hierarchyPropertyParser0.build("", "null(0)[null]\n");
    java.lang.String str12 = hierarchyPropertyParser0.getValue();
    int i13 = hierarchyPropertyParser0.numChildren();
    int i14 = hierarchyPropertyParser0.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test277"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    boolean b7 = hierarchyPropertyParser0.goDown("hi!");
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser0.search(vector8, "");
    boolean b12 = hierarchyPropertyParser0.goToChild("");
    int i13 = hierarchyPropertyParser0.depth();
    boolean b15 = hierarchyPropertyParser0.goDown(".(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test278"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    int i3 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToParent();
    java.util.Vector vector5 = null;
    int i7 = hierarchyPropertyParser0.search(vector5, "null(0)[null]\n");
    boolean b9 = hierarchyPropertyParser0.goToChild(".");
    boolean b11 = hierarchyPropertyParser0.contains("hi!(0)[null]\n(0)[null]\n");
    int i12 = hierarchyPropertyParser0.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test279"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToParent();
    boolean b6 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str7 = hierarchyPropertyParser0.context();
    boolean b9 = hierarchyPropertyParser0.contains("null(0)[null]\n");
    java.lang.String str10 = hierarchyPropertyParser0.getValue();
    int i11 = hierarchyPropertyParser0.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test280"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    int i6 = hierarchyPropertyParser0.getLevel();
    boolean b8 = hierarchyPropertyParser0.contains("hi!");
    java.lang.String[] str_array9 = hierarchyPropertyParser0.childrenValues();
    java.lang.String[] str_array10 = hierarchyPropertyParser0.childrenValues();
    boolean b12 = hierarchyPropertyParser0.goToChild(".");
    boolean b13 = hierarchyPropertyParser0.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test281"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToRoot();
    boolean b7 = hierarchyPropertyParser0.isRootReached();
    boolean b8 = hierarchyPropertyParser0.isRootReached();
    boolean b9 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String[] str_array10 = hierarchyPropertyParser0.childrenValues();
    boolean b12 = hierarchyPropertyParser0.contains("hi!");
    int i13 = hierarchyPropertyParser0.getLevel();
    int i14 = hierarchyPropertyParser0.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test282"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    boolean b4 = hierarchyPropertyParser0.isHierachic("hi!(0)[null]\n");
    boolean b5 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String str6 = hierarchyPropertyParser0.getSeperator();
    java.lang.String str7 = hierarchyPropertyParser0.parentValue();
    boolean b9 = hierarchyPropertyParser0.goToChild("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "."+ "'", str6.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test283"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    int i6 = hierarchyPropertyParser0.depth();
    int i7 = hierarchyPropertyParser0.depth();
    java.lang.String str8 = hierarchyPropertyParser0.fullValue();
    hierarchyPropertyParser0.goToParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test284"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    boolean b5 = hierarchyPropertyParser0.goDown("");
    hierarchyPropertyParser0.setSeperator("");
    java.lang.String str8 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToParent();
    boolean b11 = hierarchyPropertyParser0.isHierachic("");
    boolean b13 = hierarchyPropertyParser0.goDown(".");
    int i14 = hierarchyPropertyParser0.numChildren();
    int i15 = hierarchyPropertyParser0.numChildren();
    boolean b17 = hierarchyPropertyParser0.contains("null(0)[null]\n");
    hierarchyPropertyParser0.build("hi!(0)[null]\n(0)[null]\n(0)[null]\n", "hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test285"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    java.lang.String[] str_array5 = hierarchyPropertyParser0.childrenValues();
    boolean b7 = hierarchyPropertyParser0.goToChild("hi!");
    boolean b8 = hierarchyPropertyParser0.isRootReached();
    boolean b10 = hierarchyPropertyParser0.goDown(".");
    boolean b12 = hierarchyPropertyParser0.goDown("null(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test286"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    boolean b7 = hierarchyPropertyParser0.goDown("");
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser0.search(vector8, "hi!");
    java.lang.String str11 = hierarchyPropertyParser0.getValue();
    boolean b13 = hierarchyPropertyParser0.contains("null(0)[null]\n");
    java.lang.String str14 = hierarchyPropertyParser0.getValue();
    java.lang.String str15 = hierarchyPropertyParser0.showTree();
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
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "null(0)[null]\n"+ "'", str15.equals("null(0)[null]\n"));

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test287"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToParent();
    boolean b7 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str8 = hierarchyPropertyParser0.showTree();
    java.lang.String[] str_array9 = hierarchyPropertyParser0.childrenValues();
    hierarchyPropertyParser0.setSeperator("hi!(0)[null]\n");
    boolean b12 = hierarchyPropertyParser0.isLeafReached();
    boolean b14 = hierarchyPropertyParser0.goDown(".");
    boolean b15 = hierarchyPropertyParser0.isRootReached();
    java.lang.String[] str_array16 = hierarchyPropertyParser0.childrenValues();
    int i17 = hierarchyPropertyParser0.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null(0)[null]\n"+ "'", str8.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test288"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    boolean b7 = hierarchyPropertyParser0.goDown("");
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser0.search(vector8, "hi!");
    hierarchyPropertyParser0.setSeperator(".");
    java.util.Vector vector13 = null;
    int i15 = hierarchyPropertyParser0.search(vector13, "");
    hierarchyPropertyParser0.add("hi!(0)[null]\n(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-1));

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test289"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    int i3 = hierarchyPropertyParser2.numChildren();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    int i5 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.add("null(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test290"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    java.lang.String[] str_array4 = hierarchyPropertyParser2.tokenize("hi!(0)[null]\n(0)[null]\n");
    boolean b6 = hierarchyPropertyParser2.contains("hi!");
    boolean b7 = hierarchyPropertyParser2.isLeafReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test291"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    int i6 = hierarchyPropertyParser0.getLevel();
    hierarchyPropertyParser0.build("", "hi!");
    java.lang.String str10 = hierarchyPropertyParser0.getValue();
    boolean b11 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String str12 = hierarchyPropertyParser0.getSeperator();
    java.lang.String str13 = hierarchyPropertyParser0.getValue();
    boolean b15 = hierarchyPropertyParser0.isHierachic("null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "."+ "'", str12.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test292"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    boolean b7 = hierarchyPropertyParser0.goDown("");
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser0.search(vector8, "hi!");
    java.lang.String str11 = hierarchyPropertyParser0.getValue();
    java.lang.String str12 = hierarchyPropertyParser0.parentValue();
    int i13 = hierarchyPropertyParser0.numChildren();
    boolean b15 = hierarchyPropertyParser0.goToChild(".");
    java.lang.String str16 = hierarchyPropertyParser0.parentValue();
    java.lang.String str17 = hierarchyPropertyParser0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test293"); }


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
    hierarchyPropertyParser0.build("hi!", "hi!(0)[null]\n(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test294"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    boolean b4 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str5 = hierarchyPropertyParser0.showTree();
    java.lang.String[] str_array6 = hierarchyPropertyParser0.childrenValues();
    int i7 = hierarchyPropertyParser0.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null(0)[null]\n"+ "'", str5.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test295"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    java.lang.String[] str_array5 = hierarchyPropertyParser0.childrenValues();
    java.lang.String[] str_array7 = hierarchyPropertyParser0.tokenize("hi!");
    java.lang.String str8 = hierarchyPropertyParser0.fullValue();
    int i9 = hierarchyPropertyParser0.numChildren();
    java.lang.String str10 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.build("null(0)[null]\n(0)[null]\n", "hi!(0)[null]\n(0)[null]\n");
    java.util.Vector vector14 = null;
    int i16 = hierarchyPropertyParser0.search(vector14, "null(0)[null]\n");
    // The following exception was thrown during execution in test generation
    try {
    boolean b18 = hierarchyPropertyParser0.goTo(".");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test296"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    hierarchyPropertyParser0.setSeperator("null(0)[null]\n");
    java.lang.String str8 = hierarchyPropertyParser0.showTree();
    int i9 = hierarchyPropertyParser0.numChildren();
    java.lang.String[] str_array10 = hierarchyPropertyParser0.childrenValues();
    java.lang.String str11 = hierarchyPropertyParser0.getValue();
    java.lang.String str12 = hierarchyPropertyParser0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null(0)[null]\n"+ "'", str8.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test297"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToParent();
    boolean b8 = hierarchyPropertyParser0.goDown("null(0)[null]\n");
    java.lang.String str9 = hierarchyPropertyParser0.getSeperator();
    hierarchyPropertyParser0.add("null(0)[null]\n");
    int i12 = hierarchyPropertyParser0.depth();
    hierarchyPropertyParser0.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "."+ "'", str9.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test298"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    int i3 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.getLevel();
    java.lang.String str6 = hierarchyPropertyParser0.getValue();
    java.lang.String str7 = hierarchyPropertyParser0.getSeperator();
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser0.search(vector8, ".");
    java.lang.String str11 = hierarchyPropertyParser0.context();
    java.util.Vector vector12 = null;
    int i14 = hierarchyPropertyParser0.search(vector12, "hi!(0)[null]\n");
    boolean b16 = hierarchyPropertyParser0.goToChild(".");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "."+ "'", str7.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test299"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToRoot();
    boolean b7 = hierarchyPropertyParser0.isRootReached();
    hierarchyPropertyParser0.setSeperator("null(0)[null]\n(0)[null]\n");
    boolean b10 = hierarchyPropertyParser0.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test300"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    int i3 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.build("null(0)[null]\n", "hi!(0)[null]\n(0)[null]\n");
    hierarchyPropertyParser0.setSeperator("hi!(0)[null]\n(0)[null]\n");
    boolean b9 = hierarchyPropertyParser0.isLeafReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test301"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    int i3 = hierarchyPropertyParser2.numChildren();
    boolean b5 = hierarchyPropertyParser2.isHierachic("hi!");
    boolean b6 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    java.lang.String str8 = hierarchyPropertyParser2.context();
    int i9 = hierarchyPropertyParser2.getLevel();
    java.util.Vector vector10 = null;
    int i12 = hierarchyPropertyParser2.search(vector10, "hi!(0)[null]\n(0)[null]\n");
    java.lang.String[] str_array13 = hierarchyPropertyParser2.childrenValues();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test302"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    boolean b7 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str8 = hierarchyPropertyParser0.context();
    java.lang.String[] str_array9 = hierarchyPropertyParser0.childrenValues();
    hierarchyPropertyParser0.setSeperator("null(0)[null]\n");
    int i12 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.build("", "hi!(0)[null]\n");
    hierarchyPropertyParser0.goToRoot();
    java.lang.String str17 = hierarchyPropertyParser0.getValue();
    int i18 = hierarchyPropertyParser0.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test303"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    hierarchyPropertyParser0.goToParent();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
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
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test304"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b1 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String str2 = hierarchyPropertyParser0.getValue();
    java.lang.String[] str_array3 = hierarchyPropertyParser0.childrenValues();
    boolean b5 = hierarchyPropertyParser0.contains("null(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test305"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    hierarchyPropertyParser0.setSeperator("null(0)[null]\n");
    java.lang.String str8 = hierarchyPropertyParser0.showTree();
    int i9 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.setSeperator("");
    boolean b13 = hierarchyPropertyParser0.goDown("null(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null(0)[null]\n"+ "'", str8.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test306"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    boolean b5 = hierarchyPropertyParser0.goDown("");
    hierarchyPropertyParser0.setSeperator("");
    java.lang.String str8 = hierarchyPropertyParser0.getValue();
    boolean b10 = hierarchyPropertyParser0.goToChild("");
    java.lang.String[] str_array11 = hierarchyPropertyParser0.childrenValues();
    int i12 = hierarchyPropertyParser0.numChildren();
    java.lang.String str13 = hierarchyPropertyParser0.parentValue();
    int i14 = hierarchyPropertyParser0.getLevel();
    hierarchyPropertyParser0.goToParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test307"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    boolean b7 = hierarchyPropertyParser0.goDown("");
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser0.search(vector8, "hi!");
    java.lang.String str11 = hierarchyPropertyParser0.getValue();
    boolean b13 = hierarchyPropertyParser0.contains("null(0)[null]\n");
    java.lang.String str14 = hierarchyPropertyParser0.getValue();
    int i15 = hierarchyPropertyParser0.numChildren();
    java.lang.String str16 = hierarchyPropertyParser0.context();
    int i17 = hierarchyPropertyParser0.numChildren();
    boolean b19 = hierarchyPropertyParser0.goDown("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test308"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test309"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    int i3 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.getLevel();
    java.lang.String str6 = hierarchyPropertyParser0.getValue();
    boolean b8 = hierarchyPropertyParser0.contains("null(0)[null]\n");
    java.lang.String str9 = hierarchyPropertyParser0.context();
    boolean b11 = hierarchyPropertyParser0.goToChild("");
    int i12 = hierarchyPropertyParser0.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test310"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    java.lang.String[] str_array4 = hierarchyPropertyParser0.childrenValues();
    int i5 = hierarchyPropertyParser0.depth();
    java.lang.String str6 = hierarchyPropertyParser0.parentValue();
    int i7 = hierarchyPropertyParser0.getLevel();
    int i8 = hierarchyPropertyParser0.numChildren();
    java.lang.String str9 = hierarchyPropertyParser0.parentValue();
    boolean b10 = hierarchyPropertyParser0.isRootReached();
    boolean b12 = hierarchyPropertyParser0.contains(".(0)[null]\n");
    hierarchyPropertyParser0.setSeperator("hi!(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test311"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    boolean b4 = hierarchyPropertyParser0.isRootReached();
    boolean b6 = hierarchyPropertyParser0.goDown("");
    boolean b7 = hierarchyPropertyParser0.isLeafReached();
    boolean b8 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str9 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.setSeperator("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test312"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToParent();
    boolean b7 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str8 = hierarchyPropertyParser0.showTree();
    java.lang.String[] str_array9 = hierarchyPropertyParser0.childrenValues();
    java.lang.String str10 = hierarchyPropertyParser0.getSeperator();
    java.lang.String str11 = hierarchyPropertyParser0.fullValue();
    java.lang.String str12 = hierarchyPropertyParser0.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null(0)[null]\n"+ "'", str8.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "."+ "'", str10.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test313"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    java.lang.String[] str_array5 = hierarchyPropertyParser0.childrenValues();
    boolean b7 = hierarchyPropertyParser0.goDown("hi!");
    boolean b9 = hierarchyPropertyParser0.goDown("hi!");
    boolean b11 = hierarchyPropertyParser0.goToChild("");
    boolean b13 = hierarchyPropertyParser0.isHierachic("null(0)[null]\n");
    boolean b15 = hierarchyPropertyParser0.goDown(".");
    boolean b17 = hierarchyPropertyParser0.goDown("null(0)[null]\n(0)[null]\n");
    hierarchyPropertyParser0.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test314"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    hierarchyPropertyParser0.goToParent();
    boolean b5 = hierarchyPropertyParser0.isHierachic(".");
    hierarchyPropertyParser0.goToParent();
    java.lang.String[] str_array7 = hierarchyPropertyParser0.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test315"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    java.lang.String[] str_array4 = hierarchyPropertyParser0.childrenValues();
    int i5 = hierarchyPropertyParser0.depth();
    java.lang.String str6 = hierarchyPropertyParser0.parentValue();
    int i7 = hierarchyPropertyParser0.getLevel();
    boolean b8 = hierarchyPropertyParser0.isRootReached();
    boolean b10 = hierarchyPropertyParser0.isHierachic("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test316"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    boolean b5 = hierarchyPropertyParser0.goDown("");
    hierarchyPropertyParser0.setSeperator("");
    java.lang.String str8 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToParent();
    boolean b11 = hierarchyPropertyParser0.isHierachic("");
    boolean b12 = hierarchyPropertyParser0.isLeafReached();
    hierarchyPropertyParser0.build("hi!", "");
    java.lang.String str16 = hierarchyPropertyParser0.getSeperator();
    java.lang.String str17 = hierarchyPropertyParser0.parentValue();
    int i18 = hierarchyPropertyParser0.depth();
    hierarchyPropertyParser0.build("hi!(0)[null]\n", ".(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test317"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser2.search(vector3, "");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str7 = hierarchyPropertyParser2.fullValue();
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser2.search(vector8, "null(0)[null]\n");
    boolean b12 = hierarchyPropertyParser2.contains("hi!(0)[null]\n");
    boolean b14 = hierarchyPropertyParser2.goToChild(".");
    int i15 = hierarchyPropertyParser2.numChildren();
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
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test318"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    boolean b7 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str8 = hierarchyPropertyParser0.context();
    java.lang.String[] str_array9 = hierarchyPropertyParser0.childrenValues();
    hierarchyPropertyParser0.setSeperator("null(0)[null]\n");
    boolean b13 = hierarchyPropertyParser0.isHierachic("");
    boolean b15 = hierarchyPropertyParser0.isHierachic("");
    boolean b16 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str17 = hierarchyPropertyParser0.getValue();
    java.util.Vector vector18 = null;
    int i20 = hierarchyPropertyParser0.search(vector18, ".(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == (-1));

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test319"); }


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
    hierarchyPropertyParser0.goToParent();
    int i16 = hierarchyPropertyParser0.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test320"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    boolean b7 = hierarchyPropertyParser0.isHierachic("hi!");
    java.lang.String str8 = hierarchyPropertyParser0.parentValue();
    java.lang.String str9 = hierarchyPropertyParser0.getValue();
    java.lang.String str10 = hierarchyPropertyParser0.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "."+ "'", str10.equals("."));

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test321"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    java.lang.String str3 = hierarchyPropertyParser2.context();
    java.lang.String str4 = hierarchyPropertyParser2.getValue();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser2.build("hi!(0)[null]\n(0)[null]\n(0)[null]\n", "");
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

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test322"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b1 = hierarchyPropertyParser0.isLeafReached();
    hierarchyPropertyParser0.add("hi!");
    java.lang.String str4 = hierarchyPropertyParser0.showTree();
    java.lang.String[] str_array5 = hierarchyPropertyParser0.childrenValues();
    boolean b7 = hierarchyPropertyParser0.goTo(".");
    int i8 = hierarchyPropertyParser0.depth();
    hierarchyPropertyParser0.add("null(0)[null]\n(0)[null]\n");
    hierarchyPropertyParser0.goToParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!(0)[null]\n"+ "'", str4.equals("hi!(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test323"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    int i6 = hierarchyPropertyParser0.depth();
    boolean b7 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str8 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.add("hi!(0)[null]\n(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test324"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    java.lang.String str5 = hierarchyPropertyParser0.fullValue();
    int i6 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test325"); }


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
    hierarchyPropertyParser0.add("hi!(0)[null]\n(0)[null]\n");
    int i17 = hierarchyPropertyParser0.numChildren();
    java.lang.String str18 = hierarchyPropertyParser0.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!(0)[null]\n(0)[null]\n"+ "'", str18.equals("hi!(0)[null]\n(0)[null]\n"));

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test326"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    boolean b5 = hierarchyPropertyParser0.goDown("");
    hierarchyPropertyParser0.setSeperator("");
    java.lang.String str8 = hierarchyPropertyParser0.getValue();
    boolean b10 = hierarchyPropertyParser0.goToChild("");
    java.lang.String[] str_array11 = hierarchyPropertyParser0.childrenValues();
    boolean b13 = hierarchyPropertyParser0.goToChild(".");
    boolean b14 = hierarchyPropertyParser0.isLeafReached();
    boolean b15 = hierarchyPropertyParser0.isLeafReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test327"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToRoot();
    hierarchyPropertyParser0.goToParent();
    boolean b8 = hierarchyPropertyParser0.isLeafReached();
    hierarchyPropertyParser0.setSeperator("hi!(0)[null]\n");
    int i11 = hierarchyPropertyParser0.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test328"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    java.lang.String[] str_array5 = hierarchyPropertyParser0.childrenValues();
    int i6 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.add("null(0)[null]\n");
    boolean b10 = hierarchyPropertyParser0.contains("hi!");
    boolean b12 = hierarchyPropertyParser0.goDown("null(0)[null]\n");
    java.util.Vector vector13 = null;
    int i15 = hierarchyPropertyParser0.search(vector13, "hi!(0)[null]\n");
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser0.build("hi!(0)[null]\n(0)[null]\n(0)[null]\n", "");
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
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-1));

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test329"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    java.lang.String str1 = hierarchyPropertyParser0.parentValue();
    java.lang.String str2 = hierarchyPropertyParser0.showTree();
    int i3 = hierarchyPropertyParser0.getLevel();
    hierarchyPropertyParser0.add("hi!");
    boolean b6 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String str7 = hierarchyPropertyParser0.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "null(0)[null]\n"+ "'", str2.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test330"); }


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
    java.util.Vector vector14 = null;
    int i16 = hierarchyPropertyParser0.search(vector14, "");
    int i17 = hierarchyPropertyParser0.depth();
    hierarchyPropertyParser0.goToParent();
    java.util.Vector vector19 = null;
    int i21 = hierarchyPropertyParser0.search(vector19, "hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == (-1));

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test331"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    java.lang.String str1 = hierarchyPropertyParser0.parentValue();
    boolean b3 = hierarchyPropertyParser0.contains("hi!");
    int i4 = hierarchyPropertyParser0.numChildren();
    boolean b6 = hierarchyPropertyParser0.isHierachic("");
    boolean b8 = hierarchyPropertyParser0.goDown("hi!");
    boolean b10 = hierarchyPropertyParser0.isHierachic(".");
    boolean b12 = hierarchyPropertyParser0.isHierachic("hi!(0)[null]\n");
    java.lang.String str13 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.setSeperator("hi!(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test332"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToParent();
    java.util.Vector vector6 = null;
    int i8 = hierarchyPropertyParser0.search(vector6, "");
    java.lang.String str9 = hierarchyPropertyParser0.showTree();
    hierarchyPropertyParser0.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null(0)[null]\n"+ "'", str9.equals("null(0)[null]\n"));

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test333"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    boolean b4 = hierarchyPropertyParser0.goDown("");
    java.lang.String str5 = hierarchyPropertyParser0.context();
    boolean b7 = hierarchyPropertyParser0.goDown("hi!(0)[null]\n");
    java.lang.String str8 = hierarchyPropertyParser0.parentValue();
    java.lang.String str9 = hierarchyPropertyParser0.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test334"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    java.lang.String[] str_array4 = hierarchyPropertyParser0.childrenValues();
    int i5 = hierarchyPropertyParser0.depth();
    java.lang.String str6 = hierarchyPropertyParser0.parentValue();
    int i7 = hierarchyPropertyParser0.getLevel();
    int i8 = hierarchyPropertyParser0.numChildren();
    java.lang.String str9 = hierarchyPropertyParser0.parentValue();
    boolean b10 = hierarchyPropertyParser0.isRootReached();
    boolean b12 = hierarchyPropertyParser0.contains(".(0)[null]\n");
    boolean b14 = hierarchyPropertyParser0.isHierachic("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test335"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    java.lang.String str6 = hierarchyPropertyParser0.context();
    hierarchyPropertyParser0.goToRoot();
    int i8 = hierarchyPropertyParser0.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test336"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    java.lang.String str1 = hierarchyPropertyParser0.parentValue();
    java.lang.String str2 = hierarchyPropertyParser0.showTree();
    int i3 = hierarchyPropertyParser0.getLevel();
    hierarchyPropertyParser0.add("hi!");
    boolean b7 = hierarchyPropertyParser0.contains("null(0)[null]\n");
    java.lang.String str8 = hierarchyPropertyParser0.showTree();
    hierarchyPropertyParser0.add("hi!(0)[null]\n");
    boolean b12 = hierarchyPropertyParser0.goTo(".");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "null(0)[null]\n"+ "'", str2.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!(0)[null]\n"+ "'", str8.equals("hi!(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test337"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    java.lang.String[] str_array5 = hierarchyPropertyParser0.childrenValues();
    java.lang.String[] str_array7 = hierarchyPropertyParser0.tokenize("hi!");
    java.lang.String str8 = hierarchyPropertyParser0.fullValue();
    int i9 = hierarchyPropertyParser0.numChildren();
    int i10 = hierarchyPropertyParser0.depth();
    java.lang.String[] str_array11 = hierarchyPropertyParser0.childrenValues();
    hierarchyPropertyParser0.goToRoot();
    boolean b14 = hierarchyPropertyParser0.isHierachic("null(0)[null]\n(0)[null]\n");
    java.lang.String str15 = hierarchyPropertyParser0.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test338"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    int i6 = hierarchyPropertyParser0.depth();
    boolean b7 = hierarchyPropertyParser0.isRootReached();
    hierarchyPropertyParser0.setSeperator("null(0)[null]\n");
    int i10 = hierarchyPropertyParser0.getLevel();
    java.lang.String[] str_array12 = hierarchyPropertyParser0.tokenize("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test339"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToParent();
    boolean b7 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str8 = hierarchyPropertyParser0.showTree();
    java.lang.String[] str_array9 = hierarchyPropertyParser0.childrenValues();
    java.lang.String[] str_array11 = hierarchyPropertyParser0.tokenize(".(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null(0)[null]\n"+ "'", str8.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test340"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b1 = hierarchyPropertyParser0.isLeafReached();
    hierarchyPropertyParser0.add("hi!");
    java.lang.String str4 = hierarchyPropertyParser0.showTree();
    int i5 = hierarchyPropertyParser0.depth();
    hierarchyPropertyParser0.add("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!(0)[null]\n"+ "'", str4.equals("hi!(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test341"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    boolean b7 = hierarchyPropertyParser0.goDown("");
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser0.search(vector8, "hi!");
    java.lang.String str11 = hierarchyPropertyParser0.getValue();
    java.lang.String str12 = hierarchyPropertyParser0.parentValue();
    int i13 = hierarchyPropertyParser0.numChildren();
    boolean b15 = hierarchyPropertyParser0.goToChild(".");
    int i16 = hierarchyPropertyParser0.getLevel();
    java.lang.String str17 = hierarchyPropertyParser0.context();
    boolean b18 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str19 = hierarchyPropertyParser0.showTree();
    hierarchyPropertyParser0.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "null(0)[null]\n"+ "'", str19.equals("null(0)[null]\n"));

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test342"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    int i6 = hierarchyPropertyParser0.getLevel();
    hierarchyPropertyParser0.build("", "hi!");
    java.lang.String str10 = hierarchyPropertyParser0.getValue();
    boolean b11 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String str12 = hierarchyPropertyParser0.getSeperator();
    java.lang.String str13 = hierarchyPropertyParser0.getValue();
    int i14 = hierarchyPropertyParser0.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
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
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test343"); }


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
    java.lang.String str15 = hierarchyPropertyParser0.parentValue();
    java.lang.String str16 = hierarchyPropertyParser0.context();
    boolean b18 = hierarchyPropertyParser0.goToChild("hi!");
    boolean b20 = hierarchyPropertyParser0.isHierachic("hi!(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test344"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    boolean b7 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str8 = hierarchyPropertyParser0.context();
    java.lang.String[] str_array9 = hierarchyPropertyParser0.childrenValues();
    hierarchyPropertyParser0.setSeperator("null(0)[null]\n");
    java.lang.String str12 = hierarchyPropertyParser0.showTree();
    int i13 = hierarchyPropertyParser0.getLevel();
    boolean b14 = hierarchyPropertyParser0.isRootReached();
    boolean b16 = hierarchyPropertyParser0.goToChild("");
    int i17 = hierarchyPropertyParser0.getLevel();
    int i18 = hierarchyPropertyParser0.getLevel();
    java.lang.String str19 = hierarchyPropertyParser0.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null(0)[null]\n"+ "'", str12.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "null(0)[null]\n"+ "'", str19.equals("null(0)[null]\n"));

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test345"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    int i6 = hierarchyPropertyParser0.depth();
    boolean b7 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str8 = hierarchyPropertyParser0.getValue();
    java.lang.String str9 = hierarchyPropertyParser0.getValue();
    boolean b10 = hierarchyPropertyParser0.isLeafReached();
    hierarchyPropertyParser0.add("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test346"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    int i3 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToParent();
    boolean b5 = hierarchyPropertyParser0.isRootReached();
    boolean b7 = hierarchyPropertyParser0.goDown("null(0)[null]\n");
    boolean b9 = hierarchyPropertyParser0.contains("null(0)[null]\n");
    boolean b11 = hierarchyPropertyParser0.goDown("");
    java.lang.String str12 = hierarchyPropertyParser0.getSeperator();
    hierarchyPropertyParser0.goToRoot();
    int i14 = hierarchyPropertyParser0.getLevel();
    java.lang.String str15 = hierarchyPropertyParser0.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "."+ "'", str12.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "."+ "'", str15.equals("."));

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test347"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToParent();
    boolean b7 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str8 = hierarchyPropertyParser0.showTree();
    java.lang.String[] str_array9 = hierarchyPropertyParser0.childrenValues();
    hierarchyPropertyParser0.setSeperator("hi!(0)[null]\n");
    java.util.Vector vector12 = null;
    int i14 = hierarchyPropertyParser0.search(vector12, ".");
    boolean b16 = hierarchyPropertyParser0.goDown("");
    java.lang.String str17 = hierarchyPropertyParser0.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null(0)[null]\n"+ "'", str8.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!(0)[null]\n"+ "'", str17.equals("hi!(0)[null]\n"));

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test348"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToRoot();
    int i6 = hierarchyPropertyParser0.depth();
    java.lang.String str7 = hierarchyPropertyParser0.showTree();
    boolean b9 = hierarchyPropertyParser0.goDown("hi!");
    hierarchyPropertyParser0.goToParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null(0)[null]\n"+ "'", str7.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test349"); }


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
    java.lang.String str15 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.setSeperator("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "null(0)[null]\n"+ "'", str14.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test350"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    int i3 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToParent();
    boolean b5 = hierarchyPropertyParser0.isRootReached();
    boolean b6 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String[] str_array8 = hierarchyPropertyParser0.tokenize("hi!");
    java.lang.String str9 = hierarchyPropertyParser0.showTree();
    boolean b10 = hierarchyPropertyParser0.isLeafReached();
    boolean b12 = hierarchyPropertyParser0.contains("hi!(0)[null]\n");
    boolean b14 = hierarchyPropertyParser0.goDown("");
    int i15 = hierarchyPropertyParser0.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null(0)[null]\n"+ "'", str9.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test351"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    int i3 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToParent();
    boolean b5 = hierarchyPropertyParser0.isRootReached();
    boolean b7 = hierarchyPropertyParser0.goDown("null(0)[null]\n");
    boolean b9 = hierarchyPropertyParser0.contains("null(0)[null]\n");
    boolean b11 = hierarchyPropertyParser0.goDown("");
    java.lang.String str12 = hierarchyPropertyParser0.getSeperator();
    hierarchyPropertyParser0.goToRoot();
    int i14 = hierarchyPropertyParser0.getLevel();
    boolean b16 = hierarchyPropertyParser0.contains("hi!(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "."+ "'", str12.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test352"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToParent();
    boolean b6 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str7 = hierarchyPropertyParser0.context();
    int i8 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.build("", "");
    java.lang.String str12 = hierarchyPropertyParser0.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null(0)[null]\n"+ "'", str12.equals("null(0)[null]\n"));

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test353"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    hierarchyPropertyParser0.setSeperator("null(0)[null]\n");
    java.lang.String str8 = hierarchyPropertyParser0.showTree();
    int i9 = hierarchyPropertyParser0.numChildren();
    java.lang.String str10 = hierarchyPropertyParser0.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null(0)[null]\n"+ "'", str8.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test354"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToParent();
    int i6 = hierarchyPropertyParser0.numChildren();
    java.lang.String[] str_array8 = hierarchyPropertyParser0.tokenize("hi!");
    boolean b10 = hierarchyPropertyParser0.contains("hi!(0)[null]\n");
    boolean b11 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String str12 = hierarchyPropertyParser0.showTree();
    hierarchyPropertyParser0.goToRoot();
    boolean b15 = hierarchyPropertyParser0.isHierachic(".(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null(0)[null]\n"+ "'", str12.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test355"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    boolean b5 = hierarchyPropertyParser0.goDown("");
    hierarchyPropertyParser0.setSeperator("");
    java.lang.String str8 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToParent();
    boolean b11 = hierarchyPropertyParser0.isHierachic("");
    boolean b13 = hierarchyPropertyParser0.contains("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test356"); }


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
    hierarchyPropertyParser0.goToParent();
    boolean b18 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str19 = hierarchyPropertyParser0.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!(0)[null]\n"+ "'", str13.equals("hi!(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test357"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    boolean b7 = hierarchyPropertyParser0.goDown("");
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser0.search(vector8, "hi!");
    java.util.Vector vector11 = null;
    int i13 = hierarchyPropertyParser0.search(vector11, "null(0)[null]\n");
    java.lang.String str14 = hierarchyPropertyParser0.fullValue();
    java.lang.String[] str_array16 = hierarchyPropertyParser0.tokenize("null(0)[null]\n");
    java.lang.String str17 = hierarchyPropertyParser0.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test358"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    int i3 = hierarchyPropertyParser2.numChildren();
    boolean b5 = hierarchyPropertyParser2.isHierachic("hi!");
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n");
    boolean b9 = hierarchyPropertyParser2.contains("hi!");
    java.lang.String str10 = hierarchyPropertyParser2.getValue();
    boolean b12 = hierarchyPropertyParser2.goDown(".");
    java.lang.String str13 = hierarchyPropertyParser2.parentValue();
    hierarchyPropertyParser2.goToParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test359"); }


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
    hierarchyPropertyParser0.setSeperator(".");
    boolean b16 = hierarchyPropertyParser0.isHierachic("hi!(0)[null]\n(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test360"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    int i3 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToParent();
    boolean b5 = hierarchyPropertyParser0.isRootReached();
    boolean b7 = hierarchyPropertyParser0.goDown("null(0)[null]\n");
    boolean b9 = hierarchyPropertyParser0.contains("null(0)[null]\n");
    boolean b11 = hierarchyPropertyParser0.goDown("");
    java.lang.String str12 = hierarchyPropertyParser0.getSeperator();
    java.lang.String str13 = hierarchyPropertyParser0.context();
    java.lang.String str14 = hierarchyPropertyParser0.context();
    java.util.Vector vector15 = null;
    int i17 = hierarchyPropertyParser0.search(vector15, "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "."+ "'", str12.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test361"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    int i6 = hierarchyPropertyParser0.getLevel();
    hierarchyPropertyParser0.build("", "");
    boolean b10 = hierarchyPropertyParser0.isRootReached();
    java.lang.String[] str_array11 = hierarchyPropertyParser0.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test362"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    java.lang.String str1 = hierarchyPropertyParser0.parentValue();
    boolean b3 = hierarchyPropertyParser0.contains("hi!");
    int i4 = hierarchyPropertyParser0.numChildren();
    boolean b6 = hierarchyPropertyParser0.goToChild("");
    hierarchyPropertyParser0.goToRoot();
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser0.search(vector8, "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test363"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToParent();
    java.util.Vector vector6 = null;
    int i8 = hierarchyPropertyParser0.search(vector6, "");
    boolean b9 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str10 = hierarchyPropertyParser0.parentValue();
    java.lang.String[] str_array12 = hierarchyPropertyParser0.tokenize(".");
    boolean b14 = hierarchyPropertyParser0.goDown("hi!(0)[null]\n(0)[null]\n");
    boolean b15 = hierarchyPropertyParser0.isRootReached();
    java.lang.String[] str_array16 = hierarchyPropertyParser0.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test364"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToParent();
    java.util.Vector vector6 = null;
    int i8 = hierarchyPropertyParser0.search(vector6, "");
    java.lang.String str9 = hierarchyPropertyParser0.fullValue();
    int i10 = hierarchyPropertyParser0.depth();
    java.lang.String str11 = hierarchyPropertyParser0.showTree();
    boolean b13 = hierarchyPropertyParser0.goToChild(".(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null(0)[null]\n"+ "'", str11.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test365"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    java.lang.String[] str_array5 = hierarchyPropertyParser0.childrenValues();
    java.lang.String[] str_array7 = hierarchyPropertyParser0.tokenize("hi!");
    java.lang.String str8 = hierarchyPropertyParser0.fullValue();
    boolean b9 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str10 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test366"); }


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
    int i13 = hierarchyPropertyParser0.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test367"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    boolean b7 = hierarchyPropertyParser0.goDown("");
    boolean b9 = hierarchyPropertyParser0.isHierachic("null(0)[null]\n");
    java.lang.String str10 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.setSeperator("null(0)[null]\n(0)[null]\n");
    int i13 = hierarchyPropertyParser0.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test368"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    int i6 = hierarchyPropertyParser0.depth();
    hierarchyPropertyParser0.add("hi!");
    boolean b10 = hierarchyPropertyParser0.goTo("hi!");
    boolean b12 = hierarchyPropertyParser0.goDown("hi!");
    int i13 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToParent();
    java.lang.String str15 = hierarchyPropertyParser0.context();
    boolean b17 = hierarchyPropertyParser0.goTo(".");
    hierarchyPropertyParser0.setSeperator("");
    boolean b21 = hierarchyPropertyParser0.goTo("null(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test369"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", ".");
    hierarchyPropertyParser2.goToParent();
    boolean b5 = hierarchyPropertyParser2.isHierachic("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test370"); }


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
    java.util.Vector vector15 = null;
    int i17 = hierarchyPropertyParser0.search(vector15, "hi!(0)[null]\n(0)[null]\n");
    java.lang.String str18 = hierarchyPropertyParser0.parentValue();
    java.lang.String str19 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.setSeperator("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test371"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    int i3 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToParent();
    boolean b5 = hierarchyPropertyParser0.isRootReached();
    hierarchyPropertyParser0.goToRoot();
    int i7 = hierarchyPropertyParser0.getLevel();
    java.lang.String str8 = hierarchyPropertyParser0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test372"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    int i6 = hierarchyPropertyParser0.depth();
    boolean b7 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str8 = hierarchyPropertyParser0.showTree();
    int i9 = hierarchyPropertyParser0.depth();
    java.lang.String str10 = hierarchyPropertyParser0.getSeperator();
    // The following exception was thrown during execution in test generation
    try {
    boolean b12 = hierarchyPropertyParser0.goTo("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null(0)[null]\n"+ "'", str8.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "."+ "'", str10.equals("."));

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test373"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    int i3 = hierarchyPropertyParser0.getLevel();
    boolean b5 = hierarchyPropertyParser0.isHierachic("hi!");
    java.lang.String[] str_array6 = hierarchyPropertyParser0.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test374"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    java.lang.String str1 = hierarchyPropertyParser0.parentValue();
    java.lang.String str2 = hierarchyPropertyParser0.showTree();
    int i3 = hierarchyPropertyParser0.getLevel();
    hierarchyPropertyParser0.add("hi!");
    boolean b7 = hierarchyPropertyParser0.contains("null(0)[null]\n");
    boolean b9 = hierarchyPropertyParser0.goToChild("hi!");
    int i10 = hierarchyPropertyParser0.numChildren();
    java.lang.String str11 = hierarchyPropertyParser0.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "null(0)[null]\n"+ "'", str2.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!(0)[null]\n"+ "'", str11.equals("hi!(0)[null]\n"));

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test375"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    int i3 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToParent();
    boolean b5 = hierarchyPropertyParser0.isRootReached();
    boolean b7 = hierarchyPropertyParser0.goDown("null(0)[null]\n");
    hierarchyPropertyParser0.setSeperator("hi!");
    hierarchyPropertyParser0.setSeperator(".");
    java.lang.String str12 = hierarchyPropertyParser0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test376"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    java.lang.String[] str_array4 = hierarchyPropertyParser2.tokenize("");
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
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
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test377"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    hierarchyPropertyParser0.goToParent();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    boolean b6 = hierarchyPropertyParser0.goToChild("null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test378"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    int i6 = hierarchyPropertyParser0.depth();
    hierarchyPropertyParser0.add("hi!");
    boolean b10 = hierarchyPropertyParser0.goTo("hi!");
    boolean b12 = hierarchyPropertyParser0.goDown("hi!");
    int i13 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToParent();
    java.lang.String str15 = hierarchyPropertyParser0.context();
    boolean b17 = hierarchyPropertyParser0.goTo(".");
    hierarchyPropertyParser0.setSeperator("");
    boolean b21 = hierarchyPropertyParser0.isHierachic("null(0)[null]\n");
    hierarchyPropertyParser0.goToParent();
    hierarchyPropertyParser0.build("hi!(0)[null]\n(0)[null]\n(0)[null]\n", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test379"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    boolean b7 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str8 = hierarchyPropertyParser0.context();
    java.lang.String[] str_array9 = hierarchyPropertyParser0.childrenValues();
    hierarchyPropertyParser0.setSeperator("null(0)[null]\n");
    boolean b13 = hierarchyPropertyParser0.isHierachic("");
    boolean b15 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String[] str_array16 = hierarchyPropertyParser0.childrenValues();
    hierarchyPropertyParser0.build("", "");
    java.lang.String str20 = hierarchyPropertyParser0.parentValue();
    java.lang.String[] str_array21 = hierarchyPropertyParser0.childrenValues();
    boolean b23 = hierarchyPropertyParser0.isHierachic("null(0)[null]\n(0)[null]\n");
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
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test380"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    boolean b5 = hierarchyPropertyParser0.goDown("");
    hierarchyPropertyParser0.setSeperator("");
    java.lang.String str8 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToParent();
    boolean b11 = hierarchyPropertyParser0.isHierachic("");
    java.lang.String str12 = hierarchyPropertyParser0.context();
    boolean b13 = hierarchyPropertyParser0.isLeafReached();
    boolean b15 = hierarchyPropertyParser0.goDown("hi!(0)[null]\n");
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
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test381"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToRoot();
    boolean b7 = hierarchyPropertyParser0.isRootReached();
    hierarchyPropertyParser0.setSeperator("null(0)[null]\n(0)[null]\n");
    int i10 = hierarchyPropertyParser0.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test382"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String[] str_array3 = hierarchyPropertyParser0.childrenValues();
    hierarchyPropertyParser0.goToParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test383"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    boolean b7 = hierarchyPropertyParser0.goDown("");
    boolean b9 = hierarchyPropertyParser0.isHierachic("null(0)[null]\n");
    java.lang.String str10 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.setSeperator("null(0)[null]\n(0)[null]\n");
    java.util.Vector vector13 = null;
    int i15 = hierarchyPropertyParser0.search(vector13, ".");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-1));

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test384"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    int i3 = hierarchyPropertyParser2.numChildren();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    boolean b5 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.childrenValues();
    java.lang.String str7 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.build("null(0)[null]\n", "hi!(0)[null]\n");
    int i11 = hierarchyPropertyParser2.getLevel();
    java.util.Vector vector12 = null;
    int i14 = hierarchyPropertyParser2.search(vector12, "hi!(0)[null]\n(0)[null]\n(0)[null]\n");
    java.lang.String str15 = hierarchyPropertyParser2.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "."+ "'", str15.equals("."));

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test385"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToRoot();
    boolean b7 = hierarchyPropertyParser0.isRootReached();
    hierarchyPropertyParser0.goToParent();
    int i9 = hierarchyPropertyParser0.getLevel();
    hierarchyPropertyParser0.add("null(0)[null]\n");
    java.lang.String str12 = hierarchyPropertyParser0.getValue();
    int i13 = hierarchyPropertyParser0.depth();
    boolean b15 = hierarchyPropertyParser0.isHierachic("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null(0)[null]\n"+ "'", str12.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test386"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    int i6 = hierarchyPropertyParser0.depth();
    hierarchyPropertyParser0.add("hi!");
    boolean b10 = hierarchyPropertyParser0.goTo("hi!");
    boolean b12 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str13 = hierarchyPropertyParser0.getSeperator();
    hierarchyPropertyParser0.setSeperator(".(0)[null]\n");
    java.lang.String str16 = hierarchyPropertyParser0.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "."+ "'", str13.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!(0)[null]\n"+ "'", str16.equals("hi!(0)[null]\n"));

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test387"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    boolean b7 = hierarchyPropertyParser0.goDown("");
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser0.search(vector8, "hi!");
    java.lang.String str11 = hierarchyPropertyParser0.getValue();
    java.lang.String str12 = hierarchyPropertyParser0.parentValue();
    java.lang.String str13 = hierarchyPropertyParser0.showTree();
    boolean b14 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String str15 = hierarchyPropertyParser0.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null(0)[null]\n"+ "'", str13.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test388"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    boolean b7 = hierarchyPropertyParser0.goDown("");
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser0.search(vector8, "hi!");
    java.lang.String str11 = hierarchyPropertyParser0.getValue();
    java.lang.String str12 = hierarchyPropertyParser0.parentValue();
    int i13 = hierarchyPropertyParser0.numChildren();
    boolean b15 = hierarchyPropertyParser0.goToChild(".");
    int i16 = hierarchyPropertyParser0.getLevel();
    java.lang.String str17 = hierarchyPropertyParser0.context();
    boolean b19 = hierarchyPropertyParser0.goDown("null(0)[null]\n");
    hierarchyPropertyParser0.goToParent();
    java.lang.String str21 = hierarchyPropertyParser0.getSeperator();
    boolean b23 = hierarchyPropertyParser0.goDown("null(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "."+ "'", str21.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test389"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    boolean b4 = hierarchyPropertyParser0.isRootReached();
    boolean b6 = hierarchyPropertyParser0.goDown("");
    java.lang.String str7 = hierarchyPropertyParser0.showTree();
    boolean b9 = hierarchyPropertyParser0.contains("hi!(0)[null]\n");
    java.lang.String str10 = hierarchyPropertyParser0.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null(0)[null]\n"+ "'", str7.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test390"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    java.lang.String str6 = hierarchyPropertyParser0.context();
    boolean b8 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String[] str_array10 = hierarchyPropertyParser0.tokenize("");
    boolean b12 = hierarchyPropertyParser0.goToChild("");
    java.lang.String str13 = hierarchyPropertyParser0.fullValue();
    hierarchyPropertyParser0.setSeperator("");
    hierarchyPropertyParser0.build("", "");
    java.lang.String str19 = hierarchyPropertyParser0.showTree();
    hierarchyPropertyParser0.build("", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "null(0)[null]\n"+ "'", str19.equals("null(0)[null]\n"));

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test391"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.setSeperator(".");
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser0.search(vector8, "null(0)[null]\n");
    int i11 = hierarchyPropertyParser0.getLevel();
    boolean b13 = hierarchyPropertyParser0.goToChild("hi!");
    boolean b14 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str15 = hierarchyPropertyParser0.showTree();
    int i16 = hierarchyPropertyParser0.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "null(0)[null]\n"+ "'", str15.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test392"); }


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
    java.lang.String str14 = hierarchyPropertyParser0.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
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
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test393"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    java.lang.String[] str_array6 = hierarchyPropertyParser0.tokenize("hi!");
    java.lang.String[] str_array8 = hierarchyPropertyParser0.tokenize("hi!");
    hierarchyPropertyParser0.build("", "null(0)[null]\n");
    java.lang.String str12 = hierarchyPropertyParser0.getValue();
    java.util.Vector vector13 = null;
    int i15 = hierarchyPropertyParser0.search(vector13, "null(0)[null]\n");
    java.lang.String str16 = hierarchyPropertyParser0.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test394"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    boolean b7 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str8 = hierarchyPropertyParser0.context();
    java.lang.String[] str_array9 = hierarchyPropertyParser0.childrenValues();
    hierarchyPropertyParser0.setSeperator("");
    java.lang.String str12 = hierarchyPropertyParser0.fullValue();
    java.lang.String str13 = hierarchyPropertyParser0.getValue();
    boolean b15 = hierarchyPropertyParser0.goDown(".(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test395"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "");
    int i3 = hierarchyPropertyParser2.depth();
    java.lang.String str4 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.setSeperator("hi!(0)[null]\n(0)[null]\n(0)[null]\n");
    boolean b7 = hierarchyPropertyParser2.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null(0)[null]\n"+ "'", str4.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test396"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "null(0)[null]\n");
    hierarchyPropertyParser2.goToRoot();
    int i4 = hierarchyPropertyParser2.depth();
    boolean b5 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.add("hi!(0)[null]\n(0)[null]\n(0)[null]\n");
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
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test397"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToParent();
    java.util.Vector vector6 = null;
    int i8 = hierarchyPropertyParser0.search(vector6, "");
    int i9 = hierarchyPropertyParser0.getLevel();
    int i10 = hierarchyPropertyParser0.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test398"); }


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
    hierarchyPropertyParser0.goToParent();
    java.lang.String str15 = hierarchyPropertyParser0.getSeperator();
    java.lang.String str16 = hierarchyPropertyParser0.parentValue();
    java.lang.String str17 = hierarchyPropertyParser0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "."+ "'", str15.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test399"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToParent();
    int i6 = hierarchyPropertyParser0.numChildren();
    boolean b7 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String[] str_array8 = hierarchyPropertyParser0.childrenValues();
    boolean b10 = hierarchyPropertyParser0.goDown("");
    hierarchyPropertyParser0.goToRoot();
    java.lang.String str12 = hierarchyPropertyParser0.showTree();
    int i13 = hierarchyPropertyParser0.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null(0)[null]\n"+ "'", str12.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test400"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    java.lang.String str5 = hierarchyPropertyParser0.showTree();
    int i6 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.add("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null(0)[null]\n"+ "'", str5.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test401"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.setSeperator(".");
    java.lang.String str8 = hierarchyPropertyParser0.showTree();
    int i9 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null(0)[null]\n"+ "'", str8.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test402"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToParent();
    java.util.Vector vector6 = null;
    int i8 = hierarchyPropertyParser0.search(vector6, "");
    java.lang.String str9 = hierarchyPropertyParser0.fullValue();
    int i10 = hierarchyPropertyParser0.depth();
    java.lang.String str11 = hierarchyPropertyParser0.getSeperator();
    java.lang.String str12 = hierarchyPropertyParser0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "."+ "'", str11.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test403"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser2.search(vector3, "");
    int i6 = hierarchyPropertyParser2.depth();
    java.util.Vector vector7 = null;
    int i9 = hierarchyPropertyParser2.search(vector7, "");
    int i10 = hierarchyPropertyParser2.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test404"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    int i3 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.getLevel();
    int i6 = hierarchyPropertyParser0.depth();
    hierarchyPropertyParser0.add("hi!(0)[null]\n");
    boolean b10 = hierarchyPropertyParser0.goTo("");
    java.lang.String str11 = hierarchyPropertyParser0.fullValue();
    java.lang.String str12 = hierarchyPropertyParser0.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!(0)[null]\n"+ "'", str11.equals("hi!(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test405"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    int i3 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.getLevel();
    int i6 = hierarchyPropertyParser0.depth();
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
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test406"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    java.lang.String str1 = hierarchyPropertyParser0.parentValue();
    java.lang.String str2 = hierarchyPropertyParser0.showTree();
    int i3 = hierarchyPropertyParser0.getLevel();
    hierarchyPropertyParser0.add("hi!");
    java.lang.String str6 = hierarchyPropertyParser0.context();
    boolean b7 = hierarchyPropertyParser0.isLeafReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "null(0)[null]\n"+ "'", str2.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test407"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    boolean b4 = hierarchyPropertyParser0.isHierachic("null(0)[null]\n");
    java.lang.String str5 = hierarchyPropertyParser0.context();
    int i6 = hierarchyPropertyParser0.getLevel();
    hierarchyPropertyParser0.add("hi!");
    java.lang.String str9 = hierarchyPropertyParser0.fullValue();
    hierarchyPropertyParser0.goToParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test408"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    int i3 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToParent();
    boolean b5 = hierarchyPropertyParser0.isRootReached();
    int i6 = hierarchyPropertyParser0.depth();
    hierarchyPropertyParser0.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test409"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToParent();
    boolean b7 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser0.search(vector8, "null(0)[null]\n");
    java.lang.String str11 = hierarchyPropertyParser0.showTree();
    java.lang.String str12 = hierarchyPropertyParser0.context();
    java.lang.String[] str_array13 = hierarchyPropertyParser0.childrenValues();
    java.lang.String str14 = hierarchyPropertyParser0.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null(0)[null]\n"+ "'", str11.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "."+ "'", str14.equals("."));

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test410"); }


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
    boolean b15 = hierarchyPropertyParser0.goDown("");
    java.lang.String str16 = hierarchyPropertyParser0.context();
    java.lang.String str17 = hierarchyPropertyParser0.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test411"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    boolean b4 = hierarchyPropertyParser0.isHierachic("hi!(0)[null]\n");
    hierarchyPropertyParser0.goToRoot();
    int i6 = hierarchyPropertyParser0.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test412"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n(0)[null]\n", "hi!(0)[null]\n(0)[null]\n(0)[null]\n");

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test413"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    boolean b4 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str5 = hierarchyPropertyParser0.showTree();
    int i6 = hierarchyPropertyParser0.numChildren();
    java.lang.String str7 = hierarchyPropertyParser0.getSeperator();
    java.lang.String str8 = hierarchyPropertyParser0.context();
    hierarchyPropertyParser0.add("hi!");
    java.lang.String[] str_array12 = hierarchyPropertyParser0.tokenize("hi!(0)[null]\n(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null(0)[null]\n"+ "'", str5.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "."+ "'", str7.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test414"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    boolean b7 = hierarchyPropertyParser0.goDown("");
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser0.search(vector8, "hi!");
    int i11 = hierarchyPropertyParser0.getLevel();
    int i12 = hierarchyPropertyParser0.getLevel();
    java.lang.String[] str_array14 = hierarchyPropertyParser0.tokenize("hi!(0)[null]\n");
    java.lang.String[] str_array16 = hierarchyPropertyParser0.tokenize("");
    int i17 = hierarchyPropertyParser0.numChildren();
    boolean b19 = hierarchyPropertyParser0.goDown("hi!(0)[null]\n(0)[null]\n");
    java.lang.String[] str_array20 = hierarchyPropertyParser0.childrenValues();
    java.lang.String str21 = hierarchyPropertyParser0.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "."+ "'", str21.equals("."));

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test415"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    java.lang.String str1 = hierarchyPropertyParser0.parentValue();
    java.lang.String str2 = hierarchyPropertyParser0.showTree();
    int i3 = hierarchyPropertyParser0.getLevel();
    boolean b5 = hierarchyPropertyParser0.goDown(".");
    hierarchyPropertyParser0.goToParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "null(0)[null]\n"+ "'", str2.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test416"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.fullValue();
    java.util.Vector vector5 = null;
    int i7 = hierarchyPropertyParser0.search(vector5, "hi!");
    hierarchyPropertyParser0.setSeperator("hi!");
    hierarchyPropertyParser0.goToParent();
    java.lang.String str11 = hierarchyPropertyParser0.showTree();
    java.util.Vector vector12 = null;
    int i14 = hierarchyPropertyParser0.search(vector12, "hi!(0)[null]\n(0)[null]\n");
    java.lang.String str15 = hierarchyPropertyParser0.showTree();
    int i16 = hierarchyPropertyParser0.numChildren();
    int i17 = hierarchyPropertyParser0.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null(0)[null]\n"+ "'", str11.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "null(0)[null]\n"+ "'", str15.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test417"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    int i3 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToParent();
    boolean b5 = hierarchyPropertyParser0.isRootReached();
    boolean b7 = hierarchyPropertyParser0.goDown("null(0)[null]\n");
    boolean b9 = hierarchyPropertyParser0.contains("null(0)[null]\n");
    boolean b11 = hierarchyPropertyParser0.goDown("");
    java.lang.String str12 = hierarchyPropertyParser0.getSeperator();
    java.lang.String str13 = hierarchyPropertyParser0.context();
    java.lang.String str14 = hierarchyPropertyParser0.context();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser0.build("hi!(0)[null]\n(0)[null]\n", "");
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
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "."+ "'", str12.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test418"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    int i6 = hierarchyPropertyParser0.getLevel();
    boolean b8 = hierarchyPropertyParser0.contains("hi!");
    java.util.Vector vector9 = null;
    int i11 = hierarchyPropertyParser0.search(vector9, "hi!(0)[null]\n");
    java.lang.String str12 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.setSeperator("hi!(0)[null]\n");
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser0.goToChild((int)(short)-1);
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
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test419"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    java.lang.String str6 = hierarchyPropertyParser0.context();
    boolean b7 = hierarchyPropertyParser0.isLeafReached();
    boolean b9 = hierarchyPropertyParser0.goDown("hi!(0)[null]\n");
    boolean b10 = hierarchyPropertyParser0.isLeafReached();
    boolean b12 = hierarchyPropertyParser0.isHierachic("");
    hierarchyPropertyParser0.add("hi!(0)[null]\n(0)[null]\n");
    boolean b16 = hierarchyPropertyParser0.goTo("hi!(0)[null]\n(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test420"); }


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
    java.lang.String str15 = hierarchyPropertyParser0.parentValue();
    java.lang.String[] str_array17 = hierarchyPropertyParser0.tokenize(".");
    hierarchyPropertyParser0.build("hi!(0)[null]\n(0)[null]\n", ".");
    boolean b22 = hierarchyPropertyParser0.isHierachic("null(0)[null]\n(0)[null]\n");
    int i23 = hierarchyPropertyParser0.depth();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser0.goToChild(100);
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
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test421"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", ".");
    int i3 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array7 = hierarchyPropertyParser2.tokenize("hi!(0)[null]\n");
    hierarchyPropertyParser2.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test422"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    java.lang.String str1 = hierarchyPropertyParser0.parentValue();
    java.lang.String str2 = hierarchyPropertyParser0.showTree();
    hierarchyPropertyParser0.build("hi!(0)[null]\n(0)[null]\n", "hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "null(0)[null]\n"+ "'", str2.equals("null(0)[null]\n"));

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test423"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b1 = hierarchyPropertyParser0.isLeafReached();
    hierarchyPropertyParser0.add("hi!");
    java.lang.String str4 = hierarchyPropertyParser0.showTree();
    java.lang.String[] str_array5 = hierarchyPropertyParser0.childrenValues();
    boolean b7 = hierarchyPropertyParser0.goTo(".");
    boolean b9 = hierarchyPropertyParser0.goTo("null(0)[null]\n");
    java.lang.String str10 = hierarchyPropertyParser0.parentValue();
    java.lang.String str11 = hierarchyPropertyParser0.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!(0)[null]\n"+ "'", str4.equals("hi!(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "."+ "'", str11.equals("."));

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test424"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    int i3 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToParent();
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
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test425"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToParent();
    boolean b6 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str7 = hierarchyPropertyParser0.context();
    int i8 = hierarchyPropertyParser0.getLevel();
    java.lang.String str9 = hierarchyPropertyParser0.showTree();
    int i10 = hierarchyPropertyParser0.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null(0)[null]\n"+ "'", str9.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test426"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    int i3 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.getLevel();
    java.lang.String str6 = hierarchyPropertyParser0.getValue();
    boolean b8 = hierarchyPropertyParser0.contains("null(0)[null]\n");
    java.lang.String str9 = hierarchyPropertyParser0.context();
    int i10 = hierarchyPropertyParser0.depth();
    boolean b12 = hierarchyPropertyParser0.goToChild("");
    boolean b14 = hierarchyPropertyParser0.isHierachic("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
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
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test427"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    java.lang.String[] str_array6 = hierarchyPropertyParser0.tokenize("hi!");
    java.lang.String[] str_array8 = hierarchyPropertyParser0.tokenize("hi!");
    hierarchyPropertyParser0.build("", "null(0)[null]\n");
    boolean b13 = hierarchyPropertyParser0.isHierachic("hi!(0)[null]\n");
    boolean b15 = hierarchyPropertyParser0.isHierachic("hi!");
    boolean b17 = hierarchyPropertyParser0.goToChild("hi!(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test428"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    boolean b5 = hierarchyPropertyParser0.goDown("");
    hierarchyPropertyParser0.setSeperator("");
    java.lang.String str8 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToParent();
    boolean b11 = hierarchyPropertyParser0.isHierachic("");
    java.lang.String str12 = hierarchyPropertyParser0.context();
    boolean b13 = hierarchyPropertyParser0.isLeafReached();
    boolean b15 = hierarchyPropertyParser0.goDown("hi!(0)[null]\n");
    boolean b16 = hierarchyPropertyParser0.isLeafReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test429"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToParent();
    java.util.Vector vector6 = null;
    int i8 = hierarchyPropertyParser0.search(vector6, "");
    int i9 = hierarchyPropertyParser0.getLevel();
    boolean b11 = hierarchyPropertyParser0.goToChild("hi!");
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
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test430"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    java.lang.String str1 = hierarchyPropertyParser0.parentValue();
    java.lang.String str2 = hierarchyPropertyParser0.showTree();
    int i3 = hierarchyPropertyParser0.getLevel();
    boolean b4 = hierarchyPropertyParser0.isRootReached();
    hierarchyPropertyParser0.goToRoot();
    hierarchyPropertyParser0.goToRoot();
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
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "null(0)[null]\n"+ "'", str2.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test431"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    boolean b7 = hierarchyPropertyParser0.goDown("");
    boolean b9 = hierarchyPropertyParser0.isHierachic("null(0)[null]\n");
    java.lang.String str10 = hierarchyPropertyParser0.fullValue();
    java.lang.String str11 = hierarchyPropertyParser0.showTree();
    int i12 = hierarchyPropertyParser0.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null(0)[null]\n"+ "'", str11.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test432"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    boolean b7 = hierarchyPropertyParser0.goDown("");
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser0.search(vector8, "hi!");
    java.lang.String str11 = hierarchyPropertyParser0.getValue();
    java.lang.String str12 = hierarchyPropertyParser0.parentValue();
    boolean b13 = hierarchyPropertyParser0.isRootReached();
    boolean b15 = hierarchyPropertyParser0.isHierachic(".");
    java.lang.String[] str_array16 = hierarchyPropertyParser0.childrenValues();
    boolean b18 = hierarchyPropertyParser0.contains("hi!(0)[null]\n(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test433"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    boolean b5 = hierarchyPropertyParser0.goDown("");
    hierarchyPropertyParser0.setSeperator("");
    java.lang.String str8 = hierarchyPropertyParser0.getValue();
    boolean b10 = hierarchyPropertyParser0.goToChild("");
    java.lang.String str11 = hierarchyPropertyParser0.fullValue();
    boolean b13 = hierarchyPropertyParser0.isHierachic(".");
    java.util.Vector vector14 = null;
    int i16 = hierarchyPropertyParser0.search(vector14, "hi!");
    hierarchyPropertyParser0.goToParent();
    java.lang.String str18 = hierarchyPropertyParser0.fullValue();
    java.lang.String[] str_array19 = hierarchyPropertyParser0.childrenValues();
    boolean b21 = hierarchyPropertyParser0.goDown("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test434"); }


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
    java.util.Vector vector14 = null;
    int i16 = hierarchyPropertyParser0.search(vector14, "");
    boolean b17 = hierarchyPropertyParser0.isRootReached();
    hierarchyPropertyParser0.add("null(0)[null]\n");
    java.lang.String[] str_array20 = hierarchyPropertyParser0.childrenValues();
    java.lang.String str21 = hierarchyPropertyParser0.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test435"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", "hi!(0)[null]\n");
    java.lang.String str3 = hierarchyPropertyParser2.getValue();
    boolean b5 = hierarchyPropertyParser2.contains("null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test436"); }


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
    int i14 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToParent();
    int i16 = hierarchyPropertyParser0.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null(0)[null]\n"+ "'", str8.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test437"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    boolean b7 = hierarchyPropertyParser0.goDown("");
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser0.search(vector8, "hi!");
    java.lang.String str11 = hierarchyPropertyParser0.getValue();
    boolean b12 = hierarchyPropertyParser0.isLeafReached();
    boolean b14 = hierarchyPropertyParser0.goDown("null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test438"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    int i3 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.getLevel();
    java.lang.String str6 = hierarchyPropertyParser0.getValue();
    boolean b8 = hierarchyPropertyParser0.contains("null(0)[null]\n");
    java.lang.String str9 = hierarchyPropertyParser0.context();
    int i10 = hierarchyPropertyParser0.depth();
    java.lang.String[] str_array11 = hierarchyPropertyParser0.childrenValues();
    java.lang.String[] str_array12 = hierarchyPropertyParser0.childrenValues();
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
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
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
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test439"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    int i3 = hierarchyPropertyParser2.numChildren();
    boolean b5 = hierarchyPropertyParser2.isHierachic("hi!");
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n");
    boolean b9 = hierarchyPropertyParser2.contains("hi!");
    java.lang.String str10 = hierarchyPropertyParser2.getValue();
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
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test440"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToParent();
    boolean b6 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str7 = hierarchyPropertyParser0.context();
    int i8 = hierarchyPropertyParser0.getLevel();
    int i9 = hierarchyPropertyParser0.depth();
    java.util.Vector vector10 = null;
    int i12 = hierarchyPropertyParser0.search(vector10, "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test441"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    int i3 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToParent();
    boolean b5 = hierarchyPropertyParser0.isRootReached();
    boolean b7 = hierarchyPropertyParser0.goDown("null(0)[null]\n");
    boolean b9 = hierarchyPropertyParser0.contains("null(0)[null]\n");
    boolean b11 = hierarchyPropertyParser0.goDown("");
    java.lang.String str12 = hierarchyPropertyParser0.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test442"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToRoot();
    hierarchyPropertyParser0.goToRoot();
    int i8 = hierarchyPropertyParser0.numChildren();
    java.lang.String str9 = hierarchyPropertyParser0.context();
    boolean b11 = hierarchyPropertyParser0.isHierachic("null(0)[null]\n");
    boolean b13 = hierarchyPropertyParser0.contains("null(0)[null]\n");
    boolean b14 = hierarchyPropertyParser0.isRootReached();
    java.util.Vector vector15 = null;
    int i17 = hierarchyPropertyParser0.search(vector15, "hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test443"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    boolean b7 = hierarchyPropertyParser0.goDown("");
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser0.search(vector8, "hi!");
    int i11 = hierarchyPropertyParser0.getLevel();
    int i12 = hierarchyPropertyParser0.getLevel();
    java.lang.String[] str_array14 = hierarchyPropertyParser0.tokenize("hi!(0)[null]\n");
    java.lang.String[] str_array16 = hierarchyPropertyParser0.tokenize("");
    int i17 = hierarchyPropertyParser0.numChildren();
    boolean b19 = hierarchyPropertyParser0.goDown("hi!(0)[null]\n(0)[null]\n");
    java.lang.String[] str_array20 = hierarchyPropertyParser0.childrenValues();
    java.lang.String str21 = hierarchyPropertyParser0.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "null(0)[null]\n"+ "'", str21.equals("null(0)[null]\n"));

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test444"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    boolean b5 = hierarchyPropertyParser0.goDown("");
    hierarchyPropertyParser0.setSeperator("");
    java.lang.String str8 = hierarchyPropertyParser0.getValue();
    boolean b10 = hierarchyPropertyParser0.goToChild("");
    java.lang.String[] str_array11 = hierarchyPropertyParser0.childrenValues();
    int i12 = hierarchyPropertyParser0.depth();
    int i13 = hierarchyPropertyParser0.numChildren();
    boolean b14 = hierarchyPropertyParser0.isLeafReached();
    int i15 = hierarchyPropertyParser0.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test445"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    boolean b7 = hierarchyPropertyParser0.goDown("");
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser0.search(vector8, "hi!");
    java.lang.String str11 = hierarchyPropertyParser0.getValue();
    java.lang.String str12 = hierarchyPropertyParser0.parentValue();
    int i13 = hierarchyPropertyParser0.numChildren();
    boolean b15 = hierarchyPropertyParser0.goToChild(".");
    java.lang.String[] str_array16 = hierarchyPropertyParser0.childrenValues();
    int i17 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.add("null(0)[null]\n");
    java.util.Vector vector20 = null;
    int i22 = hierarchyPropertyParser0.search(vector20, "hi!");
    boolean b24 = hierarchyPropertyParser0.goTo("hi!(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test446"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    boolean b5 = hierarchyPropertyParser0.goDown("");
    hierarchyPropertyParser0.setSeperator("");
    java.lang.String str8 = hierarchyPropertyParser0.getValue();
    boolean b10 = hierarchyPropertyParser0.goToChild("");
    java.lang.String[] str_array11 = hierarchyPropertyParser0.childrenValues();
    boolean b13 = hierarchyPropertyParser0.goToChild(".");
    boolean b14 = hierarchyPropertyParser0.isLeafReached();
    java.util.Vector vector15 = null;
    int i17 = hierarchyPropertyParser0.search(vector15, "hi!(0)[null]\n");
    int i18 = hierarchyPropertyParser0.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test447"); }


    // The following exception was thrown during execution in test generation
    try {
    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser(".(0)[null]\n", "hi!(0)[null]\n");
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test448"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    java.lang.String str1 = hierarchyPropertyParser0.getValue();
    java.lang.String str2 = hierarchyPropertyParser0.fullValue();
    hierarchyPropertyParser0.build("null(0)[null]\n", "null(0)[null]\n");
    hierarchyPropertyParser0.setSeperator("hi!(0)[null]\n(0)[null]\n");
    java.lang.String str8 = hierarchyPropertyParser0.context();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser0.add("null(0)[null]\n");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test449"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    int i6 = hierarchyPropertyParser0.depth();
    hierarchyPropertyParser0.add("hi!");
    boolean b10 = hierarchyPropertyParser0.goTo("hi!");
    hierarchyPropertyParser0.setSeperator("hi!");
    java.lang.String[] str_array14 = hierarchyPropertyParser0.tokenize("hi!");
    boolean b16 = hierarchyPropertyParser0.isHierachic(".");
    java.lang.String str17 = hierarchyPropertyParser0.getSeperator();
    java.lang.String str18 = hierarchyPropertyParser0.getSeperator();
    boolean b20 = hierarchyPropertyParser0.goDown(".");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test450"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    java.lang.String str1 = hierarchyPropertyParser0.parentValue();
    boolean b3 = hierarchyPropertyParser0.contains("hi!");
    int i4 = hierarchyPropertyParser0.numChildren();
    boolean b6 = hierarchyPropertyParser0.isHierachic("");
    boolean b8 = hierarchyPropertyParser0.goDown("hi!");
    boolean b10 = hierarchyPropertyParser0.isHierachic(".");
    boolean b12 = hierarchyPropertyParser0.isHierachic("hi!(0)[null]\n");
    java.lang.String str13 = hierarchyPropertyParser0.getSeperator();
    int i14 = hierarchyPropertyParser0.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "."+ "'", str13.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test451"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToParent();
    boolean b6 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str7 = hierarchyPropertyParser0.context();
    boolean b9 = hierarchyPropertyParser0.contains("null(0)[null]\n");
    int i10 = hierarchyPropertyParser0.numChildren();
    boolean b12 = hierarchyPropertyParser0.goDown("null(0)[null]\n");
    int i13 = hierarchyPropertyParser0.depth();
    int i14 = hierarchyPropertyParser0.getLevel();
    java.lang.String str15 = hierarchyPropertyParser0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
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
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test452"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    boolean b7 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str8 = hierarchyPropertyParser0.context();
    java.lang.String[] str_array9 = hierarchyPropertyParser0.childrenValues();
    hierarchyPropertyParser0.setSeperator("null(0)[null]\n");
    java.lang.String[] str_array12 = hierarchyPropertyParser0.childrenValues();
    java.lang.String[] str_array14 = hierarchyPropertyParser0.tokenize("");
    hierarchyPropertyParser0.goToRoot();
    java.lang.String str16 = hierarchyPropertyParser0.fullValue();
    boolean b18 = hierarchyPropertyParser0.contains("hi!");
    hierarchyPropertyParser0.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test453"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    boolean b7 = hierarchyPropertyParser0.goDown("");
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser0.search(vector8, "hi!");
    java.lang.String str11 = hierarchyPropertyParser0.getValue();
    java.lang.String str12 = hierarchyPropertyParser0.parentValue();
    int i13 = hierarchyPropertyParser0.numChildren();
    java.lang.String[] str_array15 = hierarchyPropertyParser0.tokenize("hi!(0)[null]\n");
    java.lang.String str16 = hierarchyPropertyParser0.fullValue();
    int i17 = hierarchyPropertyParser0.depth();
    int i18 = hierarchyPropertyParser0.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test454"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToParent();
    java.lang.String str7 = hierarchyPropertyParser0.parentValue();
    java.lang.String str8 = hierarchyPropertyParser0.getValue();
    int i9 = hierarchyPropertyParser0.getLevel();
    hierarchyPropertyParser0.goToParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test455"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    boolean b7 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str8 = hierarchyPropertyParser0.context();
    java.lang.String[] str_array9 = hierarchyPropertyParser0.childrenValues();
    hierarchyPropertyParser0.setSeperator("");
    int i12 = hierarchyPropertyParser0.depth();
    hierarchyPropertyParser0.build("null(0)[null]\n", "null(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test456"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    boolean b7 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str8 = hierarchyPropertyParser0.context();
    java.lang.String[] str_array9 = hierarchyPropertyParser0.childrenValues();
    hierarchyPropertyParser0.setSeperator("null(0)[null]\n");
    java.lang.String str12 = hierarchyPropertyParser0.showTree();
    int i13 = hierarchyPropertyParser0.getLevel();
    int i14 = hierarchyPropertyParser0.depth();
    java.util.Vector vector15 = null;
    int i17 = hierarchyPropertyParser0.search(vector15, ".");
    java.lang.String str18 = hierarchyPropertyParser0.showTree();
    java.util.Vector vector19 = null;
    int i21 = hierarchyPropertyParser0.search(vector19, ".");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null(0)[null]\n"+ "'", str12.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "null(0)[null]\n"+ "'", str18.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == (-1));

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test457"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    hierarchyPropertyParser0.setSeperator("null(0)[null]\n");
    java.lang.String str8 = hierarchyPropertyParser0.getValue();
    java.lang.String str9 = hierarchyPropertyParser0.fullValue();
    boolean b11 = hierarchyPropertyParser0.contains("hi!");
    java.lang.String[] str_array12 = hierarchyPropertyParser0.childrenValues();
    boolean b13 = hierarchyPropertyParser0.isRootReached();
    java.lang.String[] str_array14 = hierarchyPropertyParser0.childrenValues();
    hierarchyPropertyParser0.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test458"); }


    // The following exception was thrown during execution in test generation
    try {
    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!(0)[null]\n(0)[null]\n(0)[null]\n", "null(0)[null]\n(0)[null]\n");
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test459"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    java.lang.String[] str_array4 = hierarchyPropertyParser0.childrenValues();
    int i5 = hierarchyPropertyParser0.depth();
    java.lang.String str6 = hierarchyPropertyParser0.parentValue();
    int i7 = hierarchyPropertyParser0.getLevel();
    boolean b8 = hierarchyPropertyParser0.isRootReached();
    java.lang.String[] str_array10 = hierarchyPropertyParser0.tokenize("null(0)[null]\n(0)[null]\n");
    boolean b11 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str12 = hierarchyPropertyParser0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test460"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    java.lang.String str6 = hierarchyPropertyParser0.context();
    boolean b8 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String[] str_array10 = hierarchyPropertyParser0.tokenize("");
    int i11 = hierarchyPropertyParser0.numChildren();
    int i12 = hierarchyPropertyParser0.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test461"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    boolean b7 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str8 = hierarchyPropertyParser0.context();
    java.lang.String[] str_array9 = hierarchyPropertyParser0.childrenValues();
    hierarchyPropertyParser0.setSeperator("null(0)[null]\n");
    java.lang.String str12 = hierarchyPropertyParser0.showTree();
    int i13 = hierarchyPropertyParser0.getLevel();
    hierarchyPropertyParser0.build("", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null(0)[null]\n"+ "'", str12.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test462"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b1 = hierarchyPropertyParser0.isLeafReached();
    hierarchyPropertyParser0.goToRoot();
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test463"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    boolean b7 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str8 = hierarchyPropertyParser0.context();
    java.lang.String[] str_array9 = hierarchyPropertyParser0.childrenValues();
    hierarchyPropertyParser0.setSeperator("null(0)[null]\n");
    boolean b13 = hierarchyPropertyParser0.isHierachic("");
    boolean b15 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String[] str_array16 = hierarchyPropertyParser0.childrenValues();
    hierarchyPropertyParser0.build("", "");
    hierarchyPropertyParser0.goToRoot();
    boolean b22 = hierarchyPropertyParser0.isHierachic("hi!(0)[null]\n(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test464"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    int i6 = hierarchyPropertyParser0.depth();
    hierarchyPropertyParser0.add("hi!");
    boolean b10 = hierarchyPropertyParser0.goTo("hi!");
    boolean b12 = hierarchyPropertyParser0.goDown("hi!");
    int i13 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToParent();
    java.lang.String str15 = hierarchyPropertyParser0.context();
    java.lang.String str16 = hierarchyPropertyParser0.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "."+ "'", str16.equals("."));

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test465"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    int i3 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToParent();
    boolean b5 = hierarchyPropertyParser0.isRootReached();
    boolean b7 = hierarchyPropertyParser0.goDown("null(0)[null]\n");
    boolean b9 = hierarchyPropertyParser0.contains("null(0)[null]\n");
    boolean b10 = hierarchyPropertyParser0.isLeafReached();
    hierarchyPropertyParser0.setSeperator("hi!(0)[null]\n");
    int i13 = hierarchyPropertyParser0.numChildren();
    boolean b14 = hierarchyPropertyParser0.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test466"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    java.lang.String[] str_array4 = hierarchyPropertyParser0.childrenValues();
    int i5 = hierarchyPropertyParser0.depth();
    java.lang.String str6 = hierarchyPropertyParser0.parentValue();
    int i7 = hierarchyPropertyParser0.numChildren();
    java.lang.String str8 = hierarchyPropertyParser0.getSeperator();
    int i9 = hierarchyPropertyParser0.getLevel();
    int i10 = hierarchyPropertyParser0.depth();
    int i11 = hierarchyPropertyParser0.getLevel();
    boolean b12 = hierarchyPropertyParser0.isRootReached();
    java.lang.String[] str_array13 = hierarchyPropertyParser0.childrenValues();
    int i14 = hierarchyPropertyParser0.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "."+ "'", str8.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test467"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    int i3 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToParent();
    boolean b5 = hierarchyPropertyParser0.isRootReached();
    boolean b6 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String[] str_array8 = hierarchyPropertyParser0.tokenize("hi!");
    java.lang.String str9 = hierarchyPropertyParser0.showTree();
    boolean b10 = hierarchyPropertyParser0.isLeafReached();
    java.util.Vector vector11 = null;
    int i13 = hierarchyPropertyParser0.search(vector11, "null(0)[null]\n");
    boolean b14 = hierarchyPropertyParser0.isRootReached();
    java.lang.String[] str_array15 = hierarchyPropertyParser0.childrenValues();
    boolean b16 = hierarchyPropertyParser0.isLeafReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null(0)[null]\n"+ "'", str9.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test468"); }


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
    hierarchyPropertyParser0.goToParent();
    hierarchyPropertyParser0.setSeperator("null(0)[null]\n");
    boolean b21 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str22 = hierarchyPropertyParser0.context();
    java.lang.String str23 = hierarchyPropertyParser0.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str23);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test469"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    int i3 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToParent();
    boolean b5 = hierarchyPropertyParser0.isRootReached();
    boolean b7 = hierarchyPropertyParser0.goDown("null(0)[null]\n(0)[null]\n");
    java.lang.String str8 = hierarchyPropertyParser0.parentValue();
    boolean b9 = hierarchyPropertyParser0.isLeafReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test470"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser2.search(vector3, "");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str7 = hierarchyPropertyParser2.fullValue();
    boolean b8 = hierarchyPropertyParser2.isLeafReached();
    int i9 = hierarchyPropertyParser2.depth();
    java.lang.String str10 = hierarchyPropertyParser2.parentValue();
    java.lang.String str11 = hierarchyPropertyParser2.showTree();
    boolean b12 = hierarchyPropertyParser2.isRootReached();
    hierarchyPropertyParser2.goToParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null(0)[null]\n"+ "'", str11.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test471"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b1 = hierarchyPropertyParser0.isLeafReached();
    hierarchyPropertyParser0.add("hi!");
    java.lang.String str4 = hierarchyPropertyParser0.showTree();
    java.lang.String[] str_array5 = hierarchyPropertyParser0.childrenValues();
    boolean b7 = hierarchyPropertyParser0.goTo(".");
    hierarchyPropertyParser0.add("hi!(0)[null]\n(0)[null]\n");
    boolean b10 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str11 = hierarchyPropertyParser0.fullValue();
    java.lang.String str12 = hierarchyPropertyParser0.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!(0)[null]\n"+ "'", str4.equals("hi!(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test472"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.setSeperator(".");
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser0.search(vector8, "null(0)[null]\n");
    hierarchyPropertyParser0.setSeperator("hi!(0)[null]\n");
    boolean b13 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String[] str_array14 = hierarchyPropertyParser0.childrenValues();
    java.lang.String[] str_array16 = hierarchyPropertyParser0.tokenize("hi!");
    int i17 = hierarchyPropertyParser0.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test473"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    boolean b4 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str5 = hierarchyPropertyParser0.showTree();
    java.lang.String[] str_array6 = hierarchyPropertyParser0.childrenValues();
    java.lang.String[] str_array8 = hierarchyPropertyParser0.tokenize("hi!(0)[null]\n(0)[null]\n");
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
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null(0)[null]\n"+ "'", str5.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test474"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    int i3 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToParent();
    boolean b5 = hierarchyPropertyParser0.isRootReached();
    boolean b7 = hierarchyPropertyParser0.goDown("null(0)[null]\n");
    hierarchyPropertyParser0.setSeperator("hi!");
    hierarchyPropertyParser0.setSeperator(".");
    boolean b13 = hierarchyPropertyParser0.goDown("hi!(0)[null]\n");
    java.util.Vector vector14 = null;
    int i16 = hierarchyPropertyParser0.search(vector14, "null(0)[null]\n(0)[null]\n");
    boolean b18 = hierarchyPropertyParser0.goToChild("hi!");
    boolean b20 = hierarchyPropertyParser0.isHierachic("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test475"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    boolean b7 = hierarchyPropertyParser0.goDown("");
    java.lang.String[] str_array9 = hierarchyPropertyParser0.tokenize("");
    int i10 = hierarchyPropertyParser0.getLevel();
    java.lang.String str11 = hierarchyPropertyParser0.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test476"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    boolean b7 = hierarchyPropertyParser0.goDown("");
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser0.search(vector8, "hi!");
    java.util.Vector vector11 = null;
    int i13 = hierarchyPropertyParser0.search(vector11, "null(0)[null]\n");
    java.lang.String str14 = hierarchyPropertyParser0.context();
    java.lang.String[] str_array15 = hierarchyPropertyParser0.childrenValues();
    hierarchyPropertyParser0.goToRoot();
    boolean b17 = hierarchyPropertyParser0.isLeafReached();
    hierarchyPropertyParser0.goToParent();
    int i19 = hierarchyPropertyParser0.getLevel();
    java.lang.String str20 = hierarchyPropertyParser0.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "null(0)[null]\n"+ "'", str20.equals("null(0)[null]\n"));

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test477"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    java.lang.String str6 = hierarchyPropertyParser0.context();
    hierarchyPropertyParser0.goToRoot();
    java.lang.String[] str_array9 = hierarchyPropertyParser0.tokenize("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test478"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToRoot();
    hierarchyPropertyParser0.goToParent();
    boolean b8 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String[] str_array9 = hierarchyPropertyParser0.childrenValues();
    java.lang.String str10 = hierarchyPropertyParser0.context();
    boolean b12 = hierarchyPropertyParser0.goDown(".(0)[null]\n");
    hierarchyPropertyParser0.goToParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test479"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    int i3 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToRoot();
    hierarchyPropertyParser0.goToParent();
    java.lang.String[] str_array7 = hierarchyPropertyParser0.tokenize("null(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test480"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    java.lang.String str1 = hierarchyPropertyParser0.parentValue();
    java.lang.String str2 = hierarchyPropertyParser0.showTree();
    int i3 = hierarchyPropertyParser0.getLevel();
    boolean b4 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str5 = hierarchyPropertyParser0.parentValue();
    java.lang.String str6 = hierarchyPropertyParser0.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "null(0)[null]\n"+ "'", str2.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test481"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.setSeperator(".");
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser0.search(vector8, "null(0)[null]\n");
    int i11 = hierarchyPropertyParser0.getLevel();
    boolean b13 = hierarchyPropertyParser0.goToChild("hi!");
    boolean b14 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str15 = hierarchyPropertyParser0.parentValue();
    java.lang.String str16 = hierarchyPropertyParser0.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test482"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToParent();
    int i6 = hierarchyPropertyParser0.numChildren();
    boolean b7 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String[] str_array8 = hierarchyPropertyParser0.childrenValues();
    boolean b10 = hierarchyPropertyParser0.goDown("");
    hierarchyPropertyParser0.goToRoot();
    java.lang.String str12 = hierarchyPropertyParser0.showTree();
    java.lang.String str13 = hierarchyPropertyParser0.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null(0)[null]\n"+ "'", str12.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "."+ "'", str13.equals("."));

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test483"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    java.lang.String str1 = hierarchyPropertyParser0.parentValue();
    boolean b3 = hierarchyPropertyParser0.contains("hi!");
    hierarchyPropertyParser0.goToParent();
    java.util.Vector vector5 = null;
    int i7 = hierarchyPropertyParser0.search(vector5, "hi!");
    java.lang.String str8 = hierarchyPropertyParser0.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test484"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    java.lang.String str6 = hierarchyPropertyParser0.context();
    java.util.Vector vector7 = null;
    int i9 = hierarchyPropertyParser0.search(vector7, "null(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test485"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    boolean b7 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str8 = hierarchyPropertyParser0.context();
    java.lang.String[] str_array9 = hierarchyPropertyParser0.childrenValues();
    hierarchyPropertyParser0.setSeperator("null(0)[null]\n");
    int i12 = hierarchyPropertyParser0.numChildren();
    boolean b14 = hierarchyPropertyParser0.isHierachic("");
    boolean b15 = hierarchyPropertyParser0.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test486"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    java.lang.String[] str_array5 = hierarchyPropertyParser0.childrenValues();
    boolean b7 = hierarchyPropertyParser0.goDown("hi!");
    boolean b9 = hierarchyPropertyParser0.goDown("hi!");
    boolean b11 = hierarchyPropertyParser0.goToChild("");
    boolean b13 = hierarchyPropertyParser0.isHierachic("null(0)[null]\n");
    boolean b15 = hierarchyPropertyParser0.goDown(".");
    boolean b17 = hierarchyPropertyParser0.contains(".(0)[null]\n");
    boolean b18 = hierarchyPropertyParser0.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test487"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.setSeperator(".");
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser0.search(vector8, "null(0)[null]\n");
    hierarchyPropertyParser0.setSeperator("hi!(0)[null]\n");
    java.lang.String str13 = hierarchyPropertyParser0.getValue();
    boolean b15 = hierarchyPropertyParser0.isHierachic("hi!(0)[null]\n");
    int i16 = hierarchyPropertyParser0.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test488"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    int i6 = hierarchyPropertyParser0.depth();
    hierarchyPropertyParser0.add("hi!");
    boolean b10 = hierarchyPropertyParser0.goTo("hi!");
    boolean b12 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str13 = hierarchyPropertyParser0.getSeperator();
    hierarchyPropertyParser0.setSeperator(".(0)[null]\n");
    boolean b16 = hierarchyPropertyParser0.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "."+ "'", str13.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test489"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToRoot();
    hierarchyPropertyParser0.goToRoot();
    int i8 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.add("hi!(0)[null]\n");
    java.lang.String[] str_array11 = hierarchyPropertyParser0.childrenValues();
    int i12 = hierarchyPropertyParser0.getLevel();
    java.lang.String str13 = hierarchyPropertyParser0.showTree();
    java.lang.String str14 = hierarchyPropertyParser0.showTree();
    boolean b16 = hierarchyPropertyParser0.isHierachic("null(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!(0)[null]\n(0)[null]\n"+ "'", str13.equals("hi!(0)[null]\n(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!(0)[null]\n(0)[null]\n"+ "'", str14.equals("hi!(0)[null]\n(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test490"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    boolean b4 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str5 = hierarchyPropertyParser0.showTree();
    int i6 = hierarchyPropertyParser0.numChildren();
    java.lang.String str7 = hierarchyPropertyParser0.getSeperator();
    boolean b9 = hierarchyPropertyParser0.contains("null(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null(0)[null]\n"+ "'", str5.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "."+ "'", str7.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test491"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    java.lang.String str1 = hierarchyPropertyParser0.parentValue();
    java.lang.String str2 = hierarchyPropertyParser0.showTree();
    int i3 = hierarchyPropertyParser0.numChildren();
    java.lang.String[] str_array4 = hierarchyPropertyParser0.childrenValues();
    boolean b6 = hierarchyPropertyParser0.goToChild("hi!(0)[null]\n");
    java.lang.String str7 = hierarchyPropertyParser0.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "null(0)[null]\n"+ "'", str2.equals("null(0)[null]\n"));
    
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
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test492"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    int i3 = hierarchyPropertyParser2.numChildren();
    boolean b5 = hierarchyPropertyParser2.isHierachic("hi!");
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n");
    boolean b9 = hierarchyPropertyParser2.contains("hi!");
    java.lang.String str10 = hierarchyPropertyParser2.getValue();
    boolean b12 = hierarchyPropertyParser2.goDown(".");
    java.lang.String str13 = hierarchyPropertyParser2.parentValue();
    boolean b15 = hierarchyPropertyParser2.contains("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test493"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToParent();
    boolean b6 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str7 = hierarchyPropertyParser0.context();
    int i8 = hierarchyPropertyParser0.numChildren();
    boolean b10 = hierarchyPropertyParser0.goDown("null(0)[null]\n");
    hierarchyPropertyParser0.setSeperator("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test494"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToRoot();
    java.lang.String str6 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.setSeperator(".");
    boolean b9 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str10 = hierarchyPropertyParser0.context();
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
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test495"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    boolean b7 = hierarchyPropertyParser0.goDown("hi!");
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser0.search(vector8, "");
    hierarchyPropertyParser0.setSeperator("null(0)[null]\n");
    java.lang.String str13 = hierarchyPropertyParser0.getSeperator();
    java.lang.String str14 = hierarchyPropertyParser0.showTree();
    java.lang.String str15 = hierarchyPropertyParser0.fullValue();
    // The following exception was thrown during execution in test generation
    try {
    boolean b17 = hierarchyPropertyParser0.goTo("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null(0)[null]\n"+ "'", str13.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "null(0)[null]\n"+ "'", str14.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test496"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToParent();
    boolean b7 = hierarchyPropertyParser0.goToChild("hi!");
    java.lang.String str8 = hierarchyPropertyParser0.showTree();
    java.lang.String[] str_array9 = hierarchyPropertyParser0.childrenValues();
    hierarchyPropertyParser0.setSeperator("hi!(0)[null]\n");
    boolean b12 = hierarchyPropertyParser0.isLeafReached();
    int i13 = hierarchyPropertyParser0.depth();
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
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null(0)[null]\n"+ "'", str8.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test497"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    int i3 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.goToParent();
    int i5 = hierarchyPropertyParser0.getLevel();
    hierarchyPropertyParser0.goToRoot();
    boolean b8 = hierarchyPropertyParser0.goToChild("hi!(0)[null]\n(0)[null]\n");
    boolean b10 = hierarchyPropertyParser0.goDown("null(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test498"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.parentValue();
    java.lang.String[] str_array4 = hierarchyPropertyParser0.childrenValues();
    int i5 = hierarchyPropertyParser0.depth();
    java.lang.String str6 = hierarchyPropertyParser0.parentValue();
    int i7 = hierarchyPropertyParser0.getLevel();
    boolean b9 = hierarchyPropertyParser0.contains("hi!(0)[null]\n(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test499"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str3 = hierarchyPropertyParser0.getValue();
    java.lang.String str4 = hierarchyPropertyParser0.getValue();
    java.lang.String str5 = hierarchyPropertyParser0.showTree();
    int i6 = hierarchyPropertyParser0.numChildren();
    java.lang.String str7 = hierarchyPropertyParser0.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null(0)[null]\n"+ "'", str5.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test500"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("hi!");
    java.util.Vector vector3 = null;
    int i5 = hierarchyPropertyParser0.search(vector3, "");
    boolean b7 = hierarchyPropertyParser0.goDown("hi!");
    java.lang.String str8 = hierarchyPropertyParser0.context();
    boolean b10 = hierarchyPropertyParser0.isHierachic("null(0)[null]\n");
    // The following exception was thrown during execution in test generation
    try {
    boolean b12 = hierarchyPropertyParser0.goTo("null(0)[null]\n(0)[null]\n");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

}
