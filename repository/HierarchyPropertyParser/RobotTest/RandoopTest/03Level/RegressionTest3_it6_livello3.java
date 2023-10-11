
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test001"); }


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
    int i19 = hierarchyPropertyParser2.depth();
    
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
    org.junit.Assert.assertTrue(i19 == 0);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test002"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.context();
    boolean b9 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array10 = hierarchyPropertyParser2.childrenValues();
    java.lang.String str11 = hierarchyPropertyParser2.parentValue();
    boolean b13 = hierarchyPropertyParser2.contains(".(0)[null](0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test003"); }


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
    java.lang.String[] str_array15 = hierarchyPropertyParser2.tokenize(".(0)[null]\n");
    java.lang.String str16 = hierarchyPropertyParser2.showTree();
    
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
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "null(0)[null]\n"+ "'", str16.equals("null(0)[null]\n"));

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test004"); }


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
    boolean b20 = hierarchyPropertyParser2.goDown(".(0)[null]\n");
    boolean b21 = hierarchyPropertyParser2.isRootReached();
    
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
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test005"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String str3 = hierarchyPropertyParser2.showTree();
    boolean b4 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    boolean b6 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str7 = hierarchyPropertyParser2.showTree();
    java.lang.String str8 = hierarchyPropertyParser2.getValue();
    boolean b9 = hierarchyPropertyParser2.isRootReached();
    int i10 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str12 = hierarchyPropertyParser2.getValue();
    int i13 = hierarchyPropertyParser2.getLevel();
    
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
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test006"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    boolean b8 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    java.util.Vector vector9 = null;
    int i11 = hierarchyPropertyParser2.search(vector9, ".");
    java.lang.String[] str_array13 = hierarchyPropertyParser2.tokenize(".");
    java.lang.String str14 = hierarchyPropertyParser2.context();
    boolean b16 = hierarchyPropertyParser2.contains("null(0)[null]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test007"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    int i7 = hierarchyPropertyParser2.depth();
    int i8 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.setSeperator("");
    int i11 = hierarchyPropertyParser2.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test008"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    boolean b4 = hierarchyPropertyParser2.isHierachic("");
    hierarchyPropertyParser2.setSeperator("");
    boolean b8 = hierarchyPropertyParser2.isHierachic("hi!");
    java.lang.String[] str_array9 = hierarchyPropertyParser2.childrenValues();
    int i10 = hierarchyPropertyParser2.numChildren();
    boolean b11 = hierarchyPropertyParser2.isRootReached();
    hierarchyPropertyParser2.build("hi!(0)[null]\n", "");
    java.lang.String str15 = hierarchyPropertyParser2.parentValue();
    java.lang.String str16 = hierarchyPropertyParser2.context();
    
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
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test009"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    boolean b4 = hierarchyPropertyParser2.goDown("");
    java.lang.String str5 = hierarchyPropertyParser2.fullValue();
    int i6 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToRoot();
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser2.search(vector8, ".");
    int i11 = hierarchyPropertyParser2.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test010"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    java.lang.String[] str_array4 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String str5 = hierarchyPropertyParser2.context();
    int i6 = hierarchyPropertyParser2.getLevel();
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    boolean b9 = hierarchyPropertyParser2.goToChild("hi!");
    boolean b11 = hierarchyPropertyParser2.goDown("null(0)[null]\n(0)[null]\n");
    
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
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test011"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    int i7 = hierarchyPropertyParser2.depth();
    java.lang.String str8 = hierarchyPropertyParser2.context();
    java.lang.String str9 = hierarchyPropertyParser2.context();
    boolean b11 = hierarchyPropertyParser2.isHierachic("");
    int i12 = hierarchyPropertyParser2.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test012"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String str3 = hierarchyPropertyParser2.showTree();
    boolean b4 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    boolean b6 = hierarchyPropertyParser2.isRootReached();
    hierarchyPropertyParser2.add("null(0)[null]\n");
    int i9 = hierarchyPropertyParser2.numChildren();
    boolean b10 = hierarchyPropertyParser2.isRootReached();
    boolean b12 = hierarchyPropertyParser2.goToChild("hi!");
    
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
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test013"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.parentValue();
    java.lang.String str9 = hierarchyPropertyParser2.fullValue();
    java.lang.String str10 = hierarchyPropertyParser2.parentValue();
    hierarchyPropertyParser2.setSeperator("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test014"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser(".", ".(0)[null]\n");

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test015"); }


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
    java.lang.String str19 = hierarchyPropertyParser2.fullValue();
    java.lang.String str20 = hierarchyPropertyParser2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test016"); }


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
    java.lang.String str16 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.setSeperator("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "null(0)[null]\n"+ "'", str16.equals("null(0)[null]\n"));

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test017"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.parentValue();
    boolean b9 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str10 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str11 = hierarchyPropertyParser2.fullValue();
    java.lang.String str12 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.setSeperator("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null(0)[null]\n"+ "'", str12.equals("null(0)[null]\n"));

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test018"); }


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
    boolean b14 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.build("", ".(0)[null](0)[null]\n");
    
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
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test019"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser2.search(vector8, "null(0)[null]\n");
    java.lang.String[] str_array11 = hierarchyPropertyParser2.childrenValues();
    boolean b13 = hierarchyPropertyParser2.contains("null(0)[null]\n(0)[null]\n");
    int i14 = hierarchyPropertyParser2.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test020"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    boolean b6 = hierarchyPropertyParser2.goDown("");
    int i7 = hierarchyPropertyParser2.numChildren();
    int i8 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    hierarchyPropertyParser2.build("null(0)[null]\n", "null(0)[null]\n");
    boolean b16 = hierarchyPropertyParser2.contains("null(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test021"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String str3 = hierarchyPropertyParser2.showTree();
    boolean b4 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    boolean b6 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array8 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    java.lang.String str9 = hierarchyPropertyParser2.getSeperator();
    int i10 = hierarchyPropertyParser2.getLevel();
    
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
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "."+ "'", str9.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test022"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    int i9 = hierarchyPropertyParser2.depth();
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    java.lang.String str11 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test023"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    java.lang.String[] str_array4 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String str5 = hierarchyPropertyParser2.context();
    int i6 = hierarchyPropertyParser2.getLevel();
    java.lang.String str7 = hierarchyPropertyParser2.parentValue();
    int i8 = hierarchyPropertyParser2.numChildren();
    java.lang.String str9 = hierarchyPropertyParser2.getSeperator();
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
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "."+ "'", str9.equals("."));

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test024"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    boolean b4 = hierarchyPropertyParser2.isHierachic("");
    hierarchyPropertyParser2.setSeperator("");
    boolean b8 = hierarchyPropertyParser2.isHierachic("hi!");
    java.lang.String[] str_array9 = hierarchyPropertyParser2.childrenValues();
    int i10 = hierarchyPropertyParser2.numChildren();
    boolean b11 = hierarchyPropertyParser2.isRootReached();
    hierarchyPropertyParser2.build("hi!(0)[null]\n", "");
    java.lang.String str15 = hierarchyPropertyParser2.parentValue();
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
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test025"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.context();
    boolean b10 = hierarchyPropertyParser2.contains("null(0)[null]\n");
    java.lang.String str11 = hierarchyPropertyParser2.getSeperator();
    int i12 = hierarchyPropertyParser2.getLevel();
    int i13 = hierarchyPropertyParser2.depth();
    java.lang.String str14 = hierarchyPropertyParser2.showTree();
    
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
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "null(0)[null]\n"+ "'", str14.equals("null(0)[null]\n"));

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test026"); }


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
    hierarchyPropertyParser2.setSeperator(".(0)[null]\n");
    
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
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test027"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    boolean b8 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    java.util.Vector vector9 = null;
    int i11 = hierarchyPropertyParser2.search(vector9, ".");
    java.lang.String[] str_array13 = hierarchyPropertyParser2.tokenize(".");
    int i14 = hierarchyPropertyParser2.depth();
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
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test028"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null](0)[null]\n", ".(0)[null](0)[null]\n");

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test029"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    boolean b4 = hierarchyPropertyParser2.goDown("");
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize(".");
    int i7 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.goToRoot();
    boolean b11 = hierarchyPropertyParser2.goDown("hi!");
    java.lang.String str12 = hierarchyPropertyParser2.parentValue();
    java.lang.String str13 = hierarchyPropertyParser2.showTree();
    boolean b15 = hierarchyPropertyParser2.goToChild("hi!");
    boolean b17 = hierarchyPropertyParser2.contains(".(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null(0)[null]\n"+ "'", str13.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test030"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.add("null(0)[null]\n");
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.goToParent();
    boolean b8 = hierarchyPropertyParser2.goDown("null(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test031"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("");
    java.lang.String[] str_array13 = hierarchyPropertyParser2.tokenize(".");
    boolean b15 = hierarchyPropertyParser2.contains("null(0)[null]\n");
    java.lang.String str16 = hierarchyPropertyParser2.fullValue();
    java.lang.String str17 = hierarchyPropertyParser2.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
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
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test032"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    java.lang.String str9 = hierarchyPropertyParser2.showTree();
    java.lang.String str10 = hierarchyPropertyParser2.context();
    java.lang.String str11 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.build("null(0)[null]\n", "hi!");
    java.lang.String[] str_array15 = hierarchyPropertyParser2.childrenValues();
    int i16 = hierarchyPropertyParser2.numChildren();
    java.lang.String str17 = hierarchyPropertyParser2.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null(0)[null]\n"+ "'", str9.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test033"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    boolean b4 = hierarchyPropertyParser2.isHierachic("");
    hierarchyPropertyParser2.setSeperator("");
    boolean b8 = hierarchyPropertyParser2.isHierachic("hi!");
    java.lang.String str9 = hierarchyPropertyParser2.getSeperator();
    boolean b11 = hierarchyPropertyParser2.goToChild("null(0)[null]\n(0)[null]\n");
    hierarchyPropertyParser2.build("", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test034"); }


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
    boolean b19 = hierarchyPropertyParser2.goDown("null(0)[null]\n");
    
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
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test035"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.add("null(0)[null]\n");
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    java.lang.String str7 = hierarchyPropertyParser2.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null(0)[null]\n"+ "'", str6.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "."+ "'", str7.equals("."));

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test036"); }


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
    boolean b19 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    java.lang.String[] str_array20 = hierarchyPropertyParser2.childrenValues();
    boolean b22 = hierarchyPropertyParser2.goDown(".(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test037"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.context();
    boolean b10 = hierarchyPropertyParser2.contains("null(0)[null]\n");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str12 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str13 = hierarchyPropertyParser2.fullValue();
    java.lang.String str14 = hierarchyPropertyParser2.getValue();
    int i15 = hierarchyPropertyParser2.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test038"); }


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
    java.lang.String str14 = hierarchyPropertyParser2.showTree();
    
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
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "null(0)[null]\n"+ "'", str14.equals("null(0)[null]\n"));

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test039"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String str3 = hierarchyPropertyParser2.showTree();
    boolean b5 = hierarchyPropertyParser2.goToChild("hi!");
    boolean b7 = hierarchyPropertyParser2.contains("null(0)[null]\n");
    boolean b8 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str9 = hierarchyPropertyParser2.fullValue();
    java.lang.String str10 = hierarchyPropertyParser2.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null(0)[null]\n"+ "'", str3.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test040"); }


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

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test041"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    int i9 = hierarchyPropertyParser2.depth();
    java.lang.String str10 = hierarchyPropertyParser2.fullValue();
    boolean b12 = hierarchyPropertyParser2.goDown("null(0)[null](0)[null]\n");
    
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
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test042"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.parentValue();
    java.lang.String str9 = hierarchyPropertyParser2.context();
    boolean b11 = hierarchyPropertyParser2.isHierachic("");
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.goToParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test043"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String str3 = hierarchyPropertyParser2.showTree();
    boolean b4 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    boolean b6 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str7 = hierarchyPropertyParser2.fullValue();
    java.lang.String str8 = hierarchyPropertyParser2.fullValue();
    boolean b9 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    int i11 = hierarchyPropertyParser2.getLevel();
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
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test044"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.add("null(0)[null]\n");
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.goToParent();
    int i7 = hierarchyPropertyParser2.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test045"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    boolean b10 = hierarchyPropertyParser2.goToChild("");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n");
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n(0)[null]\n");
    java.lang.String[] str_array18 = hierarchyPropertyParser2.tokenize("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test046"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String[] str_array4 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String str5 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str8 = hierarchyPropertyParser2.parentValue();
    boolean b10 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n(0)[null]\n");
    hierarchyPropertyParser2.add("hi!(0)[null]\n");
    boolean b14 = hierarchyPropertyParser2.isHierachic("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null(0)[null]\n"+ "'", str5.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test047"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.context();
    boolean b9 = hierarchyPropertyParser2.isRootReached();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    hierarchyPropertyParser2.build("null(0)[null]\n", "");
    int i15 = hierarchyPropertyParser2.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test048"); }


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
    java.lang.String str19 = hierarchyPropertyParser2.getSeperator();
    boolean b20 = hierarchyPropertyParser2.isLeafReached();
    
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
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test049"); }


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
    java.lang.String str21 = hierarchyPropertyParser2.context();
    
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
    org.junit.Assert.assertNull(str21);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test050"); }


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
    boolean b19 = hierarchyPropertyParser2.contains("null(0)[null]\n");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test051"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.context();
    boolean b9 = hierarchyPropertyParser2.isRootReached();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    hierarchyPropertyParser2.build("null(0)[null]\n", "");
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str16 = hierarchyPropertyParser2.showTree();
    java.lang.String[] str_array18 = hierarchyPropertyParser2.tokenize("null(0)[null]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "null(0)[null](0)[null]\n"+ "'", str16.equals("null(0)[null](0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test052"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    int i5 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test053"); }


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
    boolean b19 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str20 = hierarchyPropertyParser2.parentValue();
    
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
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test054"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    boolean b4 = hierarchyPropertyParser2.isHierachic("");
    hierarchyPropertyParser2.setSeperator("");
    boolean b8 = hierarchyPropertyParser2.isHierachic("hi!");
    java.lang.String str9 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str10 = hierarchyPropertyParser2.getValue();
    
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
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test055"); }


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
    java.lang.String[] str_array16 = hierarchyPropertyParser2.childrenValues();
    java.lang.String str17 = hierarchyPropertyParser2.parentValue();
    java.lang.String str18 = hierarchyPropertyParser2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test056"); }


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
    boolean b18 = hierarchyPropertyParser2.isRootReached();
    
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
    org.junit.Assert.assertTrue(b18 == true);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test057"); }


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
    java.util.Vector vector22 = null;
    int i24 = hierarchyPropertyParser2.search(vector22, ".(0)[null]\n");
    
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
    org.junit.Assert.assertTrue(i24 == (-1));

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test058"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String str3 = hierarchyPropertyParser2.showTree();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    boolean b6 = hierarchyPropertyParser2.contains("null(0)[null]\n");
    boolean b8 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n(0)[null]\n");
    java.lang.String str9 = hierarchyPropertyParser2.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null(0)[null]\n"+ "'", str3.equals("null(0)[null]\n"));
    
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
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test059"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    boolean b4 = hierarchyPropertyParser2.isHierachic("");
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    int i6 = hierarchyPropertyParser2.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test060"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isRootReached();
    boolean b5 = hierarchyPropertyParser2.isRootReached();
    boolean b6 = hierarchyPropertyParser2.isRootReached();
    int i7 = hierarchyPropertyParser2.numChildren();
    java.lang.String str8 = hierarchyPropertyParser2.context();
    boolean b9 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.setSeperator(".(0)[null]\n");
    
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
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test061"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    int i9 = hierarchyPropertyParser2.depth();
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    java.lang.String[] str_array12 = hierarchyPropertyParser2.tokenize(".");
    java.util.Vector vector13 = null;
    int i15 = hierarchyPropertyParser2.search(vector13, ".");
    java.lang.String[] str_array16 = hierarchyPropertyParser2.childrenValues();
    int i17 = hierarchyPropertyParser2.depth();
    boolean b19 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n(0)[null]\n");
    boolean b20 = hierarchyPropertyParser2.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test062"); }


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
    java.lang.String[] str_array15 = hierarchyPropertyParser2.childrenValues();
    
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
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test063"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.goToRoot();
    boolean b2 = hierarchyPropertyParser0.isRootReached();
    boolean b3 = hierarchyPropertyParser0.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test064"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String str3 = hierarchyPropertyParser2.showTree();
    boolean b4 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    boolean b6 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str7 = hierarchyPropertyParser2.showTree();
    boolean b9 = hierarchyPropertyParser2.isHierachic("hi!(0)[null]\n");
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
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test065"); }


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
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n");
    boolean b17 = hierarchyPropertyParser2.isLeafReached();
    
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
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test066"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    boolean b4 = hierarchyPropertyParser2.isHierachic("");
    hierarchyPropertyParser2.setSeperator("");
    boolean b8 = hierarchyPropertyParser2.isHierachic("hi!");
    java.lang.String str9 = hierarchyPropertyParser2.fullValue();
    java.lang.String str10 = hierarchyPropertyParser2.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test067"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.add("null(0)[null]\n");
    int i5 = hierarchyPropertyParser2.getLevel();
    java.lang.String[] str_array7 = hierarchyPropertyParser2.tokenize("");
    java.lang.String str8 = hierarchyPropertyParser2.fullValue();
    boolean b9 = hierarchyPropertyParser2.isLeafReached();
    int i10 = hierarchyPropertyParser2.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null(0)[null]\n"+ "'", str8.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test068"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("");
    java.lang.String[] str_array13 = hierarchyPropertyParser2.tokenize(".");
    boolean b15 = hierarchyPropertyParser2.contains("null(0)[null]\n");
    hierarchyPropertyParser2.add("hi!");
    hierarchyPropertyParser2.goToParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test069"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    int i3 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.tokenize("");
    boolean b7 = hierarchyPropertyParser2.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test070"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String[] str_array4 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String str5 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.setSeperator("");
    boolean b9 = hierarchyPropertyParser2.goToChild("null(0)[null](0)[null]\n");
    int i10 = hierarchyPropertyParser2.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null(0)[null]\n"+ "'", str5.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test071"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    boolean b10 = hierarchyPropertyParser2.goToChild("");
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str13 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str14 = hierarchyPropertyParser2.getValue();
    boolean b15 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array17 = hierarchyPropertyParser2.tokenize("null(0)[null](0)[null]\n");
    java.lang.String str18 = hierarchyPropertyParser2.parentValue();
    java.lang.String str19 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.build("null(0)[null]\n", "null(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test072"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    boolean b4 = hierarchyPropertyParser2.goDown("");
    java.lang.String str5 = hierarchyPropertyParser2.fullValue();
    boolean b7 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    java.lang.String str8 = hierarchyPropertyParser2.getSeperator();
    boolean b10 = hierarchyPropertyParser2.goToChild("hi!");
    java.lang.String str11 = hierarchyPropertyParser2.getValue();
    hierarchyPropertyParser2.add("hi!");
    hierarchyPropertyParser2.add("hi!");
    int i16 = hierarchyPropertyParser2.getLevel();
    
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
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test073"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    java.lang.String str9 = hierarchyPropertyParser2.showTree();
    java.lang.String str10 = hierarchyPropertyParser2.context();
    boolean b12 = hierarchyPropertyParser2.contains("null(0)[null]\n");
    boolean b14 = hierarchyPropertyParser2.isHierachic("hi!");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n");
    
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

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test074"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.context();
    java.util.Vector vector9 = null;
    int i11 = hierarchyPropertyParser2.search(vector9, "null(0)[null]\n");
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str13 = hierarchyPropertyParser2.fullValue();
    java.lang.String str14 = hierarchyPropertyParser2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test075"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("");
    java.lang.String[] str_array13 = hierarchyPropertyParser2.tokenize(".");
    boolean b15 = hierarchyPropertyParser2.contains("null(0)[null]\n");
    hierarchyPropertyParser2.goToParent();
    boolean b17 = hierarchyPropertyParser2.isRootReached();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str19 = hierarchyPropertyParser2.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test076"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("null(0)[null]\n");
    hierarchyPropertyParser0.setSeperator("hi!");
    java.lang.String str5 = hierarchyPropertyParser0.context();
    java.util.Vector vector6 = null;
    int i8 = hierarchyPropertyParser0.search(vector6, "hi!");
    boolean b9 = hierarchyPropertyParser0.isLeafReached();
    java.util.Vector vector10 = null;
    int i12 = hierarchyPropertyParser0.search(vector10, "null(0)[null]\n(0)[null]\n");
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser0.build("hi!", ".(0)[null](0)[null]\n");
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
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test077"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    boolean b10 = hierarchyPropertyParser2.goToChild("");
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str13 = hierarchyPropertyParser2.getSeperator();
    java.lang.String[] str_array14 = hierarchyPropertyParser2.childrenValues();
    int i15 = hierarchyPropertyParser2.depth();
    boolean b16 = hierarchyPropertyParser2.isLeafReached();
    int i17 = hierarchyPropertyParser2.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test078"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser2.search(vector8, "null(0)[null]\n");
    java.lang.String str11 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str12 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.add("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test079"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isRootReached();
    hierarchyPropertyParser2.goToParent();
    boolean b6 = hierarchyPropertyParser2.isLeafReached();
    boolean b7 = hierarchyPropertyParser2.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test080"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    int i3 = hierarchyPropertyParser2.numChildren();
    boolean b5 = hierarchyPropertyParser2.goToChild("null(0)[null]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test081"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    boolean b6 = hierarchyPropertyParser2.goDown("");
    int i7 = hierarchyPropertyParser2.numChildren();
    int i8 = hierarchyPropertyParser2.depth();
    boolean b10 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n");
    boolean b12 = hierarchyPropertyParser2.goToChild("hi!");
    int i13 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.add("null(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
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
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test082"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.parentValue();
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.setSeperator("");
    boolean b13 = hierarchyPropertyParser2.goToChild("");
    java.lang.String[] str_array14 = hierarchyPropertyParser2.childrenValues();
    boolean b15 = hierarchyPropertyParser2.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test083"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    boolean b2 = hierarchyPropertyParser0.goToChild("null(0)[null]\n");
    hierarchyPropertyParser0.setSeperator("hi!");
    java.lang.String str5 = hierarchyPropertyParser0.context();
    int i6 = hierarchyPropertyParser0.numChildren();
    hierarchyPropertyParser0.setSeperator("null(0)[null]\n(0)[null]\n");
    java.util.Vector vector9 = null;
    int i11 = hierarchyPropertyParser0.search(vector9, ".");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test084"); }


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
    java.lang.String str16 = hierarchyPropertyParser2.parentValue();
    hierarchyPropertyParser2.goToParent();
    
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
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test085"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String str3 = hierarchyPropertyParser2.showTree();
    boolean b4 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    boolean b6 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str7 = hierarchyPropertyParser2.showTree();
    java.lang.String str8 = hierarchyPropertyParser2.getValue();
    boolean b9 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str10 = hierarchyPropertyParser2.fullValue();
    
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
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test086"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    int i1 = hierarchyPropertyParser0.depth();
    boolean b3 = hierarchyPropertyParser0.contains("null(0)[null]\n");
    boolean b5 = hierarchyPropertyParser0.goDown(".");
    hierarchyPropertyParser0.goToParent();
    boolean b8 = hierarchyPropertyParser0.goDown(".(0)[null]\n");
    hierarchyPropertyParser0.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test087"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("");
    boolean b13 = hierarchyPropertyParser2.contains("null(0)[null]\n(0)[null]\n");
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
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test088"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.context();
    boolean b9 = hierarchyPropertyParser2.isRootReached();
    java.lang.String[] str_array10 = hierarchyPropertyParser2.childrenValues();
    java.lang.String str11 = hierarchyPropertyParser2.parentValue();
    hierarchyPropertyParser2.build("", "");
    java.lang.String[] str_array16 = hierarchyPropertyParser2.tokenize("null(0)[null]\n(0)[null]\n");
    java.lang.String str17 = hierarchyPropertyParser2.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test089"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str7 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.add("null(0)[null]\n");
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize(".");
    int i12 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.setSeperator("null(0)[null]");
    java.lang.String str15 = hierarchyPropertyParser2.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "null(0)[null]"+ "'", str15.equals("null(0)[null]"));

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test090"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    int i9 = hierarchyPropertyParser2.depth();
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    java.lang.String str11 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str12 = hierarchyPropertyParser2.getValue();
    java.lang.String str13 = hierarchyPropertyParser2.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test091"); }


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
    java.util.Vector vector17 = null;
    int i19 = hierarchyPropertyParser2.search(vector17, "hi!(0)[null]\n");
    
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
    org.junit.Assert.assertTrue(i19 == (-1));

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test092"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n(0)[null]\n");
    boolean b4 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    java.lang.String str5 = hierarchyPropertyParser2.context();
    boolean b7 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    java.lang.String str8 = hierarchyPropertyParser2.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test093"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    boolean b6 = hierarchyPropertyParser2.goDown("");
    int i7 = hierarchyPropertyParser2.numChildren();
    java.lang.String str8 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str10 = hierarchyPropertyParser2.parentValue();
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.goToParent();
    int i13 = hierarchyPropertyParser2.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null(0)[null]\n"+ "'", str8.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test094"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    int i1 = hierarchyPropertyParser0.depth();
    hierarchyPropertyParser0.goToRoot();
    java.lang.String[] str_array4 = hierarchyPropertyParser0.tokenize(".");
    boolean b5 = hierarchyPropertyParser0.isRootReached();
    java.lang.String str6 = hierarchyPropertyParser0.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test095"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    java.lang.String[] str_array4 = hierarchyPropertyParser2.tokenize("hi!");
    int i5 = hierarchyPropertyParser2.numChildren();
    java.lang.String str6 = hierarchyPropertyParser2.parentValue();
    java.lang.String str7 = hierarchyPropertyParser2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test096"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("");
    java.lang.String[] str_array13 = hierarchyPropertyParser2.tokenize(".");
    boolean b15 = hierarchyPropertyParser2.contains("null(0)[null]\n");
    hierarchyPropertyParser2.goToParent();
    boolean b17 = hierarchyPropertyParser2.isRootReached();
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.goToRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test097"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.add("null(0)[null]\n");
    int i5 = hierarchyPropertyParser2.getLevel();
    java.lang.String[] str_array7 = hierarchyPropertyParser2.tokenize("");
    java.lang.String str8 = hierarchyPropertyParser2.fullValue();
    boolean b9 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n(0)[null]\n");
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
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null(0)[null]\n"+ "'", str8.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test098"); }


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
    hierarchyPropertyParser2.setSeperator("hi!(0)[null]\n");
    
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

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test099"); }


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
    java.lang.String[] str_array23 = hierarchyPropertyParser2.childrenValues();
    boolean b25 = hierarchyPropertyParser2.isHierachic("null(0)[null]");
    
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
    org.junit.Assert.assertNotNull(str_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test100"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.build("", "hi!");
    hierarchyPropertyParser2.build("null(0)[null]\n", "");
    java.lang.String str13 = hierarchyPropertyParser2.showTree();
    int i14 = hierarchyPropertyParser2.numChildren();
    boolean b15 = hierarchyPropertyParser2.isLeafReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null(0)[null](0)[null]\n"+ "'", str13.equals("null(0)[null](0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test101"); }


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
    hierarchyPropertyParser2.goToRoot();
    int i15 = hierarchyPropertyParser2.numChildren();
    
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
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test102"); }


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
    int i21 = hierarchyPropertyParser2.getLevel();
    int i22 = hierarchyPropertyParser2.depth();
    
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
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test103"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    boolean b4 = hierarchyPropertyParser2.isHierachic("");
    hierarchyPropertyParser2.setSeperator("");
    boolean b8 = hierarchyPropertyParser2.isHierachic("hi!");
    java.lang.String[] str_array9 = hierarchyPropertyParser2.childrenValues();
    boolean b10 = hierarchyPropertyParser2.isRootReached();
    int i11 = hierarchyPropertyParser2.depth();
    int i12 = hierarchyPropertyParser2.getLevel();
    boolean b13 = hierarchyPropertyParser2.isRootReached();
    boolean b15 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n(0)[null]\n");
    java.util.Vector vector16 = null;
    int i18 = hierarchyPropertyParser2.search(vector16, "hi!(0)[null]\n");
    boolean b20 = hierarchyPropertyParser2.contains("null(0)[null]");
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test104"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    boolean b4 = hierarchyPropertyParser2.isHierachic("");
    hierarchyPropertyParser2.setSeperator("");
    boolean b8 = hierarchyPropertyParser2.isHierachic("hi!");
    java.lang.String[] str_array9 = hierarchyPropertyParser2.childrenValues();
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    boolean b13 = hierarchyPropertyParser2.isLeafReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test105"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    boolean b4 = hierarchyPropertyParser2.isHierachic("");
    hierarchyPropertyParser2.setSeperator("");
    boolean b8 = hierarchyPropertyParser2.isHierachic("hi!");
    java.lang.String str9 = hierarchyPropertyParser2.getSeperator();
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
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test106"); }


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
    int i21 = hierarchyPropertyParser2.getLevel();
    java.lang.String str22 = hierarchyPropertyParser2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test107"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.context();
    boolean b9 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    java.lang.String str11 = hierarchyPropertyParser2.fullValue();
    int i12 = hierarchyPropertyParser2.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test108"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    int i3 = hierarchyPropertyParser2.numChildren();
    java.util.Vector vector4 = null;
    int i6 = hierarchyPropertyParser2.search(vector4, "null(0)[null]\n");
    java.lang.String[] str_array8 = hierarchyPropertyParser2.tokenize("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test109"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    int i9 = hierarchyPropertyParser2.depth();
    java.lang.String str10 = hierarchyPropertyParser2.getValue();
    java.lang.String[] str_array12 = hierarchyPropertyParser2.tokenize(".");
    java.lang.String str13 = hierarchyPropertyParser2.parentValue();
    boolean b14 = hierarchyPropertyParser2.isLeafReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test110"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String[] str_array4 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String str5 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.add("null(0)[null]\n(0)[null]\n");
    java.lang.String str8 = hierarchyPropertyParser2.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null(0)[null]\n"+ "'", str5.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null(0)[null]\n(0)[null]\n"+ "'", str8.equals("null(0)[null]\n(0)[null]\n"));

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test111"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    int i9 = hierarchyPropertyParser2.depth();
    java.lang.String str10 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str12 = hierarchyPropertyParser2.parentValue();
    int i13 = hierarchyPropertyParser2.numChildren();
    java.util.Vector vector14 = null;
    int i16 = hierarchyPropertyParser2.search(vector14, "hi!");
    boolean b17 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str18 = hierarchyPropertyParser2.parentValue();
    
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
    org.junit.Assert.assertTrue(i16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test112"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    boolean b6 = hierarchyPropertyParser2.goDown("");
    int i7 = hierarchyPropertyParser2.numChildren();
    int i8 = hierarchyPropertyParser2.depth();
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
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test113"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.context();
    boolean b9 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array10 = hierarchyPropertyParser2.childrenValues();
    int i11 = hierarchyPropertyParser2.numChildren();
    boolean b13 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n(0)[null]\n");
    int i14 = hierarchyPropertyParser2.numChildren();
    
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
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test114"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    java.lang.String[] str_array4 = hierarchyPropertyParser2.tokenize("hi!");
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    int i6 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.add("hi!");
    hierarchyPropertyParser2.goToParent();
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
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test115"); }


    // The following exception was thrown during execution in test generation
    try {
    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null](0)[null]\n", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test116"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String str3 = hierarchyPropertyParser2.showTree();
    boolean b4 = hierarchyPropertyParser2.isRootReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.childrenValues();
    java.util.Vector vector6 = null;
    int i8 = hierarchyPropertyParser2.search(vector6, ".(0)[null](0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null(0)[null]\n"+ "'", str3.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test117"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.add("null(0)[null]\n");
    int i5 = hierarchyPropertyParser2.getLevel();
    int i6 = hierarchyPropertyParser2.getLevel();
    int i7 = hierarchyPropertyParser2.depth();
    java.lang.String str8 = hierarchyPropertyParser2.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test118"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String str3 = hierarchyPropertyParser2.showTree();
    boolean b4 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    boolean b6 = hierarchyPropertyParser2.isRootReached();
    hierarchyPropertyParser2.build("", "null(0)[null]\n(0)[null]\n");
    java.util.Vector vector10 = null;
    int i12 = hierarchyPropertyParser2.search(vector10, "null(0)[null](0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null(0)[null]\n"+ "'", str3.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test119"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("");
    java.lang.String[] str_array13 = hierarchyPropertyParser2.tokenize(".");
    int i14 = hierarchyPropertyParser2.numChildren();
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
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test120"); }


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
    boolean b21 = hierarchyPropertyParser2.goTo("null(0)[null]\n");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test121"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    int i1 = hierarchyPropertyParser0.depth();
    boolean b3 = hierarchyPropertyParser0.contains("null(0)[null]\n");
    boolean b4 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser0.showTree();
    java.lang.String str6 = hierarchyPropertyParser0.showTree();
    java.lang.String[] str_array8 = hierarchyPropertyParser0.tokenize("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null(0)[null]\n"+ "'", str5.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null(0)[null]\n"+ "'", str6.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test122"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    boolean b4 = hierarchyPropertyParser2.goDown("");
    java.lang.String str5 = hierarchyPropertyParser2.fullValue();
    boolean b7 = hierarchyPropertyParser2.goToChild("null(0)[null]\n");
    java.lang.String str8 = hierarchyPropertyParser2.getSeperator();
    int i9 = hierarchyPropertyParser2.getLevel();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    hierarchyPropertyParser2.goToParent();
    boolean b14 = hierarchyPropertyParser2.isHierachic("");
    boolean b15 = hierarchyPropertyParser2.isLeafReached();
    int i16 = hierarchyPropertyParser2.getLevel();
    
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
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test123"); }


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
    boolean b20 = hierarchyPropertyParser2.goToChild("hi!");
    int i21 = hierarchyPropertyParser2.getLevel();
    
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
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test124"); }


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
    java.lang.String str19 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.goToRoot();
    
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
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "null(0)[null]\n"+ "'", str19.equals("null(0)[null]\n"));

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test125"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.context();
    java.util.Vector vector9 = null;
    int i11 = hierarchyPropertyParser2.search(vector9, "hi!");
    java.lang.String str12 = hierarchyPropertyParser2.getValue();
    java.lang.String str13 = hierarchyPropertyParser2.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null(0)[null]\n"+ "'", str13.equals("null(0)[null]\n"));

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test126"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    boolean b4 = hierarchyPropertyParser2.isHierachic("");
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test127"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    boolean b4 = hierarchyPropertyParser2.isHierachic("");
    hierarchyPropertyParser2.setSeperator("");
    boolean b8 = hierarchyPropertyParser2.isHierachic("hi!");
    java.lang.String[] str_array9 = hierarchyPropertyParser2.childrenValues();
    hierarchyPropertyParser2.goToParent();
    boolean b11 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str12 = hierarchyPropertyParser2.getValue();
    int i13 = hierarchyPropertyParser2.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test128"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str10 = hierarchyPropertyParser2.context();
    java.lang.String str11 = hierarchyPropertyParser2.fullValue();
    java.lang.String str12 = hierarchyPropertyParser2.fullValue();
    boolean b14 = hierarchyPropertyParser2.isHierachic(".");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test129"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    int i1 = hierarchyPropertyParser0.depth();
    java.lang.String str2 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToRoot();
    java.lang.String str4 = hierarchyPropertyParser0.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test130"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    boolean b4 = hierarchyPropertyParser2.isHierachic("");
    hierarchyPropertyParser2.setSeperator("");
    int i7 = hierarchyPropertyParser2.depth();
    int i8 = hierarchyPropertyParser2.getLevel();
    java.lang.String str9 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.goToRoot();
    int i11 = hierarchyPropertyParser2.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test131"); }


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
    hierarchyPropertyParser2.setSeperator("");
    
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

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test132"); }


    // The following exception was thrown during execution in test generation
    try {
    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!", ".(0)[null](0)[null]\n");
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test133"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    hierarchyPropertyParser0.goToRoot();
    boolean b3 = hierarchyPropertyParser0.contains("null(0)[null]\n(0)[null]\n");
    java.lang.String str4 = hierarchyPropertyParser0.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null(0)[null]\n"+ "'", str4.equals("null(0)[null]\n"));

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test134"); }


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
    java.lang.String str16 = hierarchyPropertyParser2.parentValue();
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
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test135"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    int i1 = hierarchyPropertyParser0.depth();
    boolean b3 = hierarchyPropertyParser0.contains("null(0)[null]\n");
    boolean b4 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String str5 = hierarchyPropertyParser0.showTree();
    java.lang.String str6 = hierarchyPropertyParser0.parentValue();
    java.lang.String str7 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToParent();
    
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

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test136"); }


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
    hierarchyPropertyParser2.add("null(0)[null]\n(0)[null]\n");
    
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

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test137"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    boolean b10 = hierarchyPropertyParser2.goToChild("");
    java.lang.String str11 = hierarchyPropertyParser2.getValue();
    java.lang.String str12 = hierarchyPropertyParser2.getSeperator();
    java.lang.String[] str_array14 = hierarchyPropertyParser2.tokenize("");
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.add("null(0)[null](0)[null]\n");
    
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

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test138"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    boolean b6 = hierarchyPropertyParser2.goDown("");
    int i7 = hierarchyPropertyParser2.numChildren();
    java.lang.String str8 = hierarchyPropertyParser2.showTree();
    boolean b10 = hierarchyPropertyParser2.goToChild("");
    java.util.Vector vector11 = null;
    int i13 = hierarchyPropertyParser2.search(vector11, "null(0)[null]\n(0)[null]\n");
    hierarchyPropertyParser2.setSeperator(".");
    java.lang.String[] str_array16 = hierarchyPropertyParser2.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null(0)[null]\n"+ "'", str8.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test139"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    int i9 = hierarchyPropertyParser2.depth();
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    int i11 = hierarchyPropertyParser2.depth();
    boolean b12 = hierarchyPropertyParser2.isRootReached();
    int i13 = hierarchyPropertyParser2.depth();
    
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
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test140"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.build("", "hi!");
    hierarchyPropertyParser2.build("hi!", "");
    boolean b14 = hierarchyPropertyParser2.goTo(".");
    java.lang.String str15 = hierarchyPropertyParser2.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test141"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    boolean b10 = hierarchyPropertyParser2.goToChild("");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n");
    java.lang.String str15 = hierarchyPropertyParser2.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test142"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.build("", "hi!");
    int i10 = hierarchyPropertyParser2.getLevel();
    boolean b11 = hierarchyPropertyParser2.isRootReached();
    int i12 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.goToParent();
    java.util.Vector vector14 = null;
    int i16 = hierarchyPropertyParser2.search(vector14, ".(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test143"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.context();
    boolean b9 = hierarchyPropertyParser2.isRootReached();
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n");
    java.util.Vector vector12 = null;
    int i14 = hierarchyPropertyParser2.search(vector12, "");
    boolean b15 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str17 = hierarchyPropertyParser2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test144"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.context();
    boolean b10 = hierarchyPropertyParser2.contains("null(0)[null]\n");
    java.lang.String str11 = hierarchyPropertyParser2.getSeperator();
    int i12 = hierarchyPropertyParser2.getLevel();
    int i13 = hierarchyPropertyParser2.depth();
    boolean b15 = hierarchyPropertyParser2.goDown(".(0)[null]\n");
    java.lang.String str16 = hierarchyPropertyParser2.showTree();
    
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
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "null(0)[null]\n"+ "'", str16.equals("null(0)[null]\n"));

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test145"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.parentValue();
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.setSeperator("");
    boolean b13 = hierarchyPropertyParser2.goToChild("");
    java.lang.String[] str_array14 = hierarchyPropertyParser2.childrenValues();
    java.lang.String str15 = hierarchyPropertyParser2.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test146"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    boolean b4 = hierarchyPropertyParser2.isHierachic("");
    hierarchyPropertyParser2.setSeperator("");
    boolean b8 = hierarchyPropertyParser2.isHierachic("hi!");
    java.lang.String[] str_array9 = hierarchyPropertyParser2.childrenValues();
    int i10 = hierarchyPropertyParser2.numChildren();
    hierarchyPropertyParser2.setSeperator(".");
    boolean b13 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.add("null(0)[null]\n(0)[null]\n");
    int i16 = hierarchyPropertyParser2.getLevel();
    boolean b18 = hierarchyPropertyParser2.goToChild("null(0)[null]\n(0)[null]\n");
    
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
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test147"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    int i9 = hierarchyPropertyParser2.depth();
    java.lang.String str10 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str11 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str12 = hierarchyPropertyParser2.getValue();
    boolean b13 = hierarchyPropertyParser2.isRootReached();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test148"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    int i9 = hierarchyPropertyParser2.depth();
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    int i11 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.setSeperator("null(0)[null]");
    boolean b14 = hierarchyPropertyParser2.isLeafReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test149"); }


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
    boolean b16 = hierarchyPropertyParser2.goToChild("null(0)[null](0)[null]\n");
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.goToParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test150"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String str3 = hierarchyPropertyParser2.showTree();
    boolean b4 = hierarchyPropertyParser2.isRootReached();
    java.lang.String[] str_array5 = hierarchyPropertyParser2.childrenValues();
    java.lang.String str6 = hierarchyPropertyParser2.getValue();
    java.util.Vector vector7 = null;
    int i9 = hierarchyPropertyParser2.search(vector7, "");
    java.lang.String str10 = hierarchyPropertyParser2.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null(0)[null]\n"+ "'", str3.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test151"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    java.lang.String str9 = hierarchyPropertyParser2.showTree();
    java.lang.String str10 = hierarchyPropertyParser2.context();
    java.lang.String str11 = hierarchyPropertyParser2.getSeperator();
    boolean b13 = hierarchyPropertyParser2.goToChild("null(0)[null](0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null(0)[null]\n"+ "'", str9.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test152"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    java.lang.String[] str_array4 = hierarchyPropertyParser2.tokenize("hi!");
    java.util.Vector vector5 = null;
    int i7 = hierarchyPropertyParser2.search(vector5, "hi!");
    java.lang.String str8 = hierarchyPropertyParser2.parentValue();
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser2.build(".(0)[null](0)[null]\n", "null(0)[null]");
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
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test153"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    int i9 = hierarchyPropertyParser2.depth();
    java.lang.String str10 = hierarchyPropertyParser2.fullValue();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str12 = hierarchyPropertyParser2.getSeperator();
    boolean b14 = hierarchyPropertyParser2.contains("null(0)[null]\n");
    java.lang.String[] str_array16 = hierarchyPropertyParser2.tokenize(".");
    java.lang.String str17 = hierarchyPropertyParser2.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test154"); }


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
    java.lang.String str23 = hierarchyPropertyParser2.parentValue();
    
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
    org.junit.Assert.assertNull(str23);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test155"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.parentValue();
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.setSeperator("");
    int i12 = hierarchyPropertyParser2.depth();
    java.lang.String str13 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str14 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.goToParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test156"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]", "null(0)[null](0)[null]\n");

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test157"); }


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
    java.lang.String str15 = hierarchyPropertyParser2.context();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test158"); }


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
    java.lang.String[] str_array17 = hierarchyPropertyParser2.tokenize("null(0)[null]\n(0)[null]\n");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test159"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    boolean b10 = hierarchyPropertyParser2.goToChild("");
    java.lang.String str11 = hierarchyPropertyParser2.parentValue();
    int i12 = hierarchyPropertyParser2.numChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test160"); }


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
    java.lang.String str19 = hierarchyPropertyParser2.parentValue();
    
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
    org.junit.Assert.assertNull(str19);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test161"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    int i1 = hierarchyPropertyParser0.depth();
    boolean b3 = hierarchyPropertyParser0.contains("hi!");
    java.util.Vector vector4 = null;
    int i6 = hierarchyPropertyParser0.search(vector4, "null(0)[null]\n");
    boolean b7 = hierarchyPropertyParser0.isRootReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test162"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.build("", "hi!");
    hierarchyPropertyParser2.build("null(0)[null]\n", "");
    int i13 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n");
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser2.build(".(0)[null](0)[null]\n", "null(0)[null]\n(0)[null]\n");
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test163"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    java.lang.String str11 = hierarchyPropertyParser2.getSeperator();
    boolean b12 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str13 = hierarchyPropertyParser2.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test164"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    boolean b6 = hierarchyPropertyParser2.goDown("");
    int i7 = hierarchyPropertyParser2.numChildren();
    int i8 = hierarchyPropertyParser2.depth();
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    int i12 = hierarchyPropertyParser2.getLevel();
    boolean b14 = hierarchyPropertyParser2.goDown(".(0)[null](0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test165"); }


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
    java.lang.String[] str_array29 = hierarchyPropertyParser2.tokenize(".(0)[null]\n");
    java.lang.String str30 = hierarchyPropertyParser2.parentValue();
    
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
    org.junit.Assert.assertNotNull(str_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str30);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test166"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    boolean b6 = hierarchyPropertyParser2.goDown("");
    int i7 = hierarchyPropertyParser2.numChildren();
    java.lang.String str8 = hierarchyPropertyParser2.showTree();
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str12 = hierarchyPropertyParser2.fullValue();
    java.util.Vector vector13 = null;
    int i15 = hierarchyPropertyParser2.search(vector13, "hi!");
    boolean b17 = hierarchyPropertyParser2.goToChild(".(0)[null](0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null(0)[null]\n"+ "'", str8.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test167"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String str3 = hierarchyPropertyParser2.showTree();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    boolean b6 = hierarchyPropertyParser2.contains("null(0)[null]\n");
    java.lang.String str7 = hierarchyPropertyParser2.getSeperator();
    java.lang.String str8 = hierarchyPropertyParser2.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null(0)[null]\n"+ "'", str3.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "."+ "'", str7.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test168"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    java.lang.String[] str_array4 = hierarchyPropertyParser2.tokenize("hi!");
    hierarchyPropertyParser2.setSeperator(".");
    boolean b8 = hierarchyPropertyParser2.goDown("hi!");
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n");
    boolean b12 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n");
    int i13 = hierarchyPropertyParser2.depth();
    java.lang.String str14 = hierarchyPropertyParser2.parentValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test169"); }


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
    java.lang.String str20 = hierarchyPropertyParser2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test170"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    int i9 = hierarchyPropertyParser2.depth();
    java.lang.String str10 = hierarchyPropertyParser2.getValue();
    boolean b12 = hierarchyPropertyParser2.contains("hi!");
    int i13 = hierarchyPropertyParser2.getLevel();
    java.lang.String str14 = hierarchyPropertyParser2.getSeperator();
    java.util.Vector vector15 = null;
    int i17 = hierarchyPropertyParser2.search(vector15, "null(0)[null]");
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n(0)[null]\n");
    
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
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test171"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    boolean b4 = hierarchyPropertyParser2.isHierachic("");
    hierarchyPropertyParser2.setSeperator("");
    int i7 = hierarchyPropertyParser2.depth();
    int i8 = hierarchyPropertyParser2.getLevel();
    java.lang.String[] str_array9 = hierarchyPropertyParser2.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test172"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    boolean b4 = hierarchyPropertyParser2.isHierachic("");
    boolean b5 = hierarchyPropertyParser2.isLeafReached();
    int i6 = hierarchyPropertyParser2.getLevel();
    java.lang.String str7 = hierarchyPropertyParser2.getSeperator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "."+ "'", str7.equals("."));

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test173"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str7 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.add("null(0)[null]\n");
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize(".");
    int i12 = hierarchyPropertyParser2.numChildren();
    java.lang.String[] str_array13 = hierarchyPropertyParser2.childrenValues();
    hierarchyPropertyParser2.goToParent();
    hierarchyPropertyParser2.goToRoot();
    java.util.Vector vector16 = null;
    int i18 = hierarchyPropertyParser2.search(vector16, "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-1));

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test174"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    int i1 = hierarchyPropertyParser0.depth();
    java.lang.String str2 = hierarchyPropertyParser0.getValue();
    hierarchyPropertyParser0.goToRoot();
    java.lang.String[] str_array5 = hierarchyPropertyParser0.tokenize("");
    java.lang.String[] str_array6 = hierarchyPropertyParser0.childrenValues();
    boolean b7 = hierarchyPropertyParser0.isLeafReached();
    java.lang.String str8 = hierarchyPropertyParser0.getValue();
    boolean b10 = hierarchyPropertyParser0.goToChild(".(0)[null]\n");
    
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
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test175"); }


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
    hierarchyPropertyParser2.add("hi!(0)[null]\n");
    
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

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test176"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    java.lang.String str9 = hierarchyPropertyParser2.getValue();
    boolean b11 = hierarchyPropertyParser2.isHierachic("");
    hierarchyPropertyParser2.setSeperator(".(0)[null]\n");
    int i14 = hierarchyPropertyParser2.depth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test177"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    boolean b6 = hierarchyPropertyParser2.goDown("");
    java.lang.String str7 = hierarchyPropertyParser2.getValue();
    java.util.Vector vector8 = null;
    int i10 = hierarchyPropertyParser2.search(vector8, ".");
    boolean b12 = hierarchyPropertyParser2.isHierachic("null(0)[null]\n(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test178"); }


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
    boolean b23 = hierarchyPropertyParser2.contains(".(0)[null](0)[null]\n");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test179"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isRootReached();
    hierarchyPropertyParser2.goToParent();
    java.lang.String str6 = hierarchyPropertyParser2.fullValue();
    java.lang.String str7 = hierarchyPropertyParser2.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null(0)[null]\n"+ "'", str7.equals("null(0)[null]\n"));

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test180"); }


    // The following exception was thrown during execution in test generation
    try {
    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("hi!(0)[null]\n", ".(0)[null](0)[null]\n");
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test181"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.parentValue();
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array12 = hierarchyPropertyParser2.tokenize("");
    java.lang.String str13 = hierarchyPropertyParser2.context();
    java.lang.String[] str_array15 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
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
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test182"); }


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
    boolean b18 = hierarchyPropertyParser2.goDown("null(0)[null]");
    
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
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test183"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    boolean b4 = hierarchyPropertyParser2.isHierachic("");
    int i5 = hierarchyPropertyParser2.getLevel();
    java.lang.String str6 = hierarchyPropertyParser2.context();
    boolean b8 = hierarchyPropertyParser2.contains("hi!(0)[null]\n");
    hierarchyPropertyParser2.goToParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test184"); }


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
    boolean b28 = hierarchyPropertyParser2.contains(".(0)[null]\n");
    boolean b30 = hierarchyPropertyParser2.goToChild("null(0)[null](0)[null]\n");
    
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
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test185"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    boolean b6 = hierarchyPropertyParser2.goDown("");
    int i7 = hierarchyPropertyParser2.numChildren();
    java.lang.String str8 = hierarchyPropertyParser2.showTree();
    boolean b10 = hierarchyPropertyParser2.goToChild("");
    java.util.Vector vector11 = null;
    int i13 = hierarchyPropertyParser2.search(vector11, "null(0)[null]\n(0)[null]\n");
    hierarchyPropertyParser2.build("null(0)[null]\n", "null(0)[null](0)[null]\n");
    boolean b18 = hierarchyPropertyParser2.goDown("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null(0)[null]\n"+ "'", str8.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test186"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String str3 = hierarchyPropertyParser2.showTree();
    boolean b4 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    boolean b6 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str7 = hierarchyPropertyParser2.fullValue();
    java.lang.String str8 = hierarchyPropertyParser2.fullValue();
    boolean b9 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str10 = hierarchyPropertyParser2.showTree();
    java.lang.String[] str_array11 = hierarchyPropertyParser2.childrenValues();
    
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
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null(0)[null]\n"+ "'", str10.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test187"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    boolean b10 = hierarchyPropertyParser2.goToChild("");
    java.lang.String str11 = hierarchyPropertyParser2.getValue();
    int i12 = hierarchyPropertyParser2.getLevel();
    java.lang.String str13 = hierarchyPropertyParser2.parentValue();
    java.lang.String str14 = hierarchyPropertyParser2.getValue();
    int i15 = hierarchyPropertyParser2.getLevel();
    java.lang.String str16 = hierarchyPropertyParser2.parentValue();
    hierarchyPropertyParser2.build("hi!", "null(0)[null]\n");
    java.lang.String str20 = hierarchyPropertyParser2.context();
    hierarchyPropertyParser2.goToParent();
    
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
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test188"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.build("", "hi!");
    hierarchyPropertyParser2.build("null(0)[null]\n", "");
    java.lang.String[] str_array14 = hierarchyPropertyParser2.tokenize("");
    java.lang.String[] str_array15 = hierarchyPropertyParser2.childrenValues();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array15);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test189"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String str3 = hierarchyPropertyParser2.showTree();
    boolean b4 = hierarchyPropertyParser2.isLeafReached();
    hierarchyPropertyParser2.goToRoot();
    java.lang.String[] str_array6 = hierarchyPropertyParser2.childrenValues();
    java.lang.String[] str_array8 = hierarchyPropertyParser2.tokenize("null(0)[null](0)[null]\n");
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
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null(0)[null]\n"+ "'", str3.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test190"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.parentValue();
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.setSeperator("");
    boolean b13 = hierarchyPropertyParser2.goToChild("");
    java.lang.String[] str_array14 = hierarchyPropertyParser2.childrenValues();
    boolean b16 = hierarchyPropertyParser2.isHierachic("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test191"); }


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
    boolean b16 = hierarchyPropertyParser2.isLeafReached();
    
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
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test192"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToParent();
    java.lang.String str8 = hierarchyPropertyParser2.context();
    boolean b9 = hierarchyPropertyParser2.isRootReached();
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n");
    int i12 = hierarchyPropertyParser2.numChildren();
    boolean b14 = hierarchyPropertyParser2.isHierachic("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test193"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    boolean b10 = hierarchyPropertyParser2.goToChild("");
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str13 = hierarchyPropertyParser2.getSeperator();
    java.lang.String[] str_array14 = hierarchyPropertyParser2.childrenValues();
    int i15 = hierarchyPropertyParser2.depth();
    boolean b16 = hierarchyPropertyParser2.isRootReached();
    java.lang.String str17 = hierarchyPropertyParser2.parentValue();
    int i18 = hierarchyPropertyParser2.numChildren();
    java.lang.String str19 = hierarchyPropertyParser2.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test194"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    int i9 = hierarchyPropertyParser2.depth();
    java.lang.String str10 = hierarchyPropertyParser2.parentValue();
    hierarchyPropertyParser2.goToParent();
    java.util.Vector vector12 = null;
    int i14 = hierarchyPropertyParser2.search(vector12, "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test195"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    java.lang.String str1 = hierarchyPropertyParser0.parentValue();
    hierarchyPropertyParser0.goToParent();
    hierarchyPropertyParser0.build("null(0)[null](0)[null]\n", "null(0)[null](0)[null]\n");
    java.lang.String str6 = hierarchyPropertyParser0.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test196"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String str3 = hierarchyPropertyParser2.showTree();
    boolean b5 = hierarchyPropertyParser2.goToChild("hi!");
    boolean b7 = hierarchyPropertyParser2.contains("null(0)[null]\n");
    boolean b9 = hierarchyPropertyParser2.isHierachic("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null(0)[null]\n"+ "'", str3.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test197"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    boolean b6 = hierarchyPropertyParser2.goDown("");
    int i7 = hierarchyPropertyParser2.numChildren();
    int i8 = hierarchyPropertyParser2.numChildren();
    java.lang.String str9 = hierarchyPropertyParser2.parentValue();
    boolean b10 = hierarchyPropertyParser2.isLeafReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test198"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    java.lang.String str9 = hierarchyPropertyParser2.getValue();
    boolean b11 = hierarchyPropertyParser2.isHierachic("");
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n");
    hierarchyPropertyParser2.setSeperator(".");
    java.lang.String[] str_array17 = hierarchyPropertyParser2.tokenize("hi!");
    int i18 = hierarchyPropertyParser2.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test199"); }


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
    boolean b19 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String[] str_array20 = hierarchyPropertyParser2.childrenValues();
    hierarchyPropertyParser2.goToParent();
    
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
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test200"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    boolean b10 = hierarchyPropertyParser2.goToChild("");
    java.lang.String str11 = hierarchyPropertyParser2.getValue();
    java.lang.String str12 = hierarchyPropertyParser2.getSeperator();
    java.lang.String[] str_array14 = hierarchyPropertyParser2.tokenize("");
    java.lang.String[] str_array16 = hierarchyPropertyParser2.tokenize(".");
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
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test201"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.add("null(0)[null]\n");
    int i5 = hierarchyPropertyParser2.getLevel();
    java.lang.String str6 = hierarchyPropertyParser2.parentValue();
    hierarchyPropertyParser2.setSeperator("hi!(0)[null]\n");
    hierarchyPropertyParser2.add(".");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test202"); }


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
    int i15 = hierarchyPropertyParser2.numChildren();
    
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

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test203"); }


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
    hierarchyPropertyParser2.goToParent();
    java.lang.String[] str_array18 = hierarchyPropertyParser2.tokenize("");
    
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
    org.junit.Assert.assertNotNull(str_array18);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test204"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str7 = hierarchyPropertyParser2.getSeperator();
    hierarchyPropertyParser2.add("null(0)[null]\n");
    java.lang.String[] str_array11 = hierarchyPropertyParser2.tokenize(".");
    int i12 = hierarchyPropertyParser2.numChildren();
    java.lang.String[] str_array13 = hierarchyPropertyParser2.childrenValues();
    boolean b15 = hierarchyPropertyParser2.goDown("hi!(0)[null]\n");
    hierarchyPropertyParser2.add("null(0)[null](0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test205"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    int i8 = hierarchyPropertyParser2.numChildren();
    boolean b10 = hierarchyPropertyParser2.goToChild("");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.setSeperator("null(0)[null]\n");
    boolean b15 = hierarchyPropertyParser2.isLeafReached();
    java.lang.String str16 = hierarchyPropertyParser2.context();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test206"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    int i5 = hierarchyPropertyParser2.getLevel();
    hierarchyPropertyParser2.setSeperator("");
    boolean b8 = hierarchyPropertyParser2.isLeafReached();
    boolean b10 = hierarchyPropertyParser2.goToChild("hi!(0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test207"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.add("null(0)[null]\n");
    java.lang.String str5 = hierarchyPropertyParser2.getSeperator();
    boolean b6 = hierarchyPropertyParser2.isRootReached();
    boolean b8 = hierarchyPropertyParser2.goTo(".");
    boolean b9 = hierarchyPropertyParser2.isRootReached();
    int i10 = hierarchyPropertyParser2.getLevel();
    boolean b12 = hierarchyPropertyParser2.isHierachic("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "."+ "'", str5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test208"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.add("null(0)[null]\n");
    hierarchyPropertyParser2.goToRoot();
    boolean b7 = hierarchyPropertyParser2.goTo("hi!");
    java.lang.String str8 = hierarchyPropertyParser2.fullValue();
    java.lang.String str9 = hierarchyPropertyParser2.context();
    java.lang.String str10 = hierarchyPropertyParser2.getSeperator();
    java.lang.String[] str_array12 = hierarchyPropertyParser2.tokenize("null(0)[null](0)[null]\n");
    // The following exception was thrown during execution in test generation
    try {
    hierarchyPropertyParser2.build("null(0)[null]\n(0)[null]\n", "null(0)[null]");
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "."+ "'", str10.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test209"); }


    HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
    int i1 = hierarchyPropertyParser0.depth();
    hierarchyPropertyParser0.goToRoot();
    java.lang.String[] str_array4 = hierarchyPropertyParser0.tokenize(".");
    boolean b5 = hierarchyPropertyParser0.isLeafReached();
    int i6 = hierarchyPropertyParser0.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test210"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String str3 = hierarchyPropertyParser2.parentValue();
    java.lang.String str4 = hierarchyPropertyParser2.showTree();
    java.lang.String str5 = hierarchyPropertyParser2.showTree();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null(0)[null]\n"+ "'", str4.equals("null(0)[null]\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null(0)[null]\n"+ "'", str5.equals("null(0)[null]\n"));

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test211"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("null(0)[null]\n", "null(0)[null]\n");
    java.lang.String[] str_array4 = hierarchyPropertyParser2.tokenize("hi!");
    hierarchyPropertyParser2.setSeperator("");
    boolean b8 = hierarchyPropertyParser2.goToChild("hi!(0)[null]\n");
    java.lang.String str9 = hierarchyPropertyParser2.fullValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test212"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    boolean b3 = hierarchyPropertyParser2.isLeafReached();
    boolean b4 = hierarchyPropertyParser2.isRootReached();
    boolean b6 = hierarchyPropertyParser2.goDown(".");
    hierarchyPropertyParser2.add("hi!");
    java.lang.String[] str_array10 = hierarchyPropertyParser2.tokenize("null(0)[null]\n(0)[null]\n");
    boolean b11 = hierarchyPropertyParser2.isLeafReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test213"); }


    HierarchyPropertyParser hierarchyPropertyParser2 = new HierarchyPropertyParser("", "hi!");
    hierarchyPropertyParser2.setSeperator("hi!");
    hierarchyPropertyParser2.setSeperator("");
    hierarchyPropertyParser2.goToRoot();
    hierarchyPropertyParser2.setSeperator("");
    java.lang.String str10 = hierarchyPropertyParser2.context();
    java.lang.String str11 = hierarchyPropertyParser2.parentValue();
    int i12 = hierarchyPropertyParser2.numChildren();
    java.lang.String[] str_array14 = hierarchyPropertyParser2.tokenize("null(0)[null]\n");
    boolean b16 = hierarchyPropertyParser2.contains("hi!");
    hierarchyPropertyParser2.add("null(0)[null](0)[null]\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

}
