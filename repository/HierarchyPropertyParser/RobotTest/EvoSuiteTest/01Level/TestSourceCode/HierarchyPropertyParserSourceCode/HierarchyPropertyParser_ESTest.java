/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 11 11:51:02 GMT 2023
 */

package HierarchyPropertyParserSourceCode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import HierarchyPropertyParserSourceCode.HierarchyPropertyParser;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HierarchyPropertyParser_ESTest extends HierarchyPropertyParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser("rf^f2Qdw:fv", "rf^f2Qdw:fv");
      hierarchyPropertyParser0.tokenize("8:");
      assertEquals(0, hierarchyPropertyParser0.depth());
      assertEquals(0, hierarchyPropertyParser0.getLevel());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
      String string0 = hierarchyPropertyParser0.showTree();
      assertEquals(0, hierarchyPropertyParser0.depth());
      assertEquals("null(0)[null]\n", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
      hierarchyPropertyParser0.setSeperator("jEu-6alAQf:==M");
      assertEquals(0, hierarchyPropertyParser0.depth());
      assertEquals(0, hierarchyPropertyParser0.getLevel());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
      Vector<Object> vector0 = new Vector<Object>();
      hierarchyPropertyParser0.search(vector0, "");
      assertEquals(0, hierarchyPropertyParser0.getLevel());
      assertEquals(0, hierarchyPropertyParser0.depth());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
      hierarchyPropertyParser0.parentValue();
      assertEquals(0, hierarchyPropertyParser0.depth());
      assertEquals(0, hierarchyPropertyParser0.getLevel());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser("", "");
      hierarchyPropertyParser0.numChildren();
      assertEquals(0, hierarchyPropertyParser0.depth());
      assertEquals(0, hierarchyPropertyParser0.getLevel());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String[] stringArray0 = new String[1];
      HierarchyPropertyParser.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
      boolean boolean0 = hierarchyPropertyParser0.isRootReached();
      assertTrue(boolean0);
      assertEquals(0, hierarchyPropertyParser0.depth());
      assertEquals(0, hierarchyPropertyParser0.getLevel());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
      boolean boolean0 = hierarchyPropertyParser0.isLeafReached();
      assertEquals(0, hierarchyPropertyParser0.getLevel());
      assertFalse(boolean0);
      assertEquals(0, hierarchyPropertyParser0.depth());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser("", "");
      hierarchyPropertyParser0.isHierachic("");
      assertEquals(0, hierarchyPropertyParser0.getLevel());
      assertEquals(0, hierarchyPropertyParser0.depth());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
      hierarchyPropertyParser0.goToRoot();
      assertEquals(0, hierarchyPropertyParser0.getLevel());
      assertEquals(0, hierarchyPropertyParser0.depth());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
      hierarchyPropertyParser0.goToParent();
      assertEquals(0, hierarchyPropertyParser0.getLevel());
      assertEquals(0, hierarchyPropertyParser0.depth());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
      boolean boolean0 = hierarchyPropertyParser0.goToChild("m-UZY(hZNgO|4EGN\"");
      assertEquals(0, hierarchyPropertyParser0.depth());
      assertEquals(0, hierarchyPropertyParser0.getLevel());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
      try { 
        hierarchyPropertyParser0.goToChild(0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Position out of range or leaf reached
         //
         verifyException("HierarchyPropertyParserSourceCode.HierarchyPropertyParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
      // Undeclared exception!
      try { 
        hierarchyPropertyParser0.goTo("I");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
      assertEquals(".", hierarchyPropertyParser0.getSeperator());
      
      boolean boolean0 = hierarchyPropertyParser0.goDown("");
      assertFalse(boolean0);
      assertEquals(0, hierarchyPropertyParser0.depth());
      assertEquals(0, hierarchyPropertyParser0.getLevel());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser("rf^f2Qdw:fv", "rf^f2Qdw:fv");
      hierarchyPropertyParser0.getValue();
      assertEquals(".", hierarchyPropertyParser0.getSeperator());
      assertEquals(0, hierarchyPropertyParser0.getLevel());
      assertEquals(0, hierarchyPropertyParser0.depth());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
      String string0 = hierarchyPropertyParser0.getSeperator();
      assertEquals(0, hierarchyPropertyParser0.getLevel());
      assertEquals(".", string0);
      assertEquals(0, hierarchyPropertyParser0.depth());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
      int int0 = hierarchyPropertyParser0.getLevel();
      assertEquals(".", hierarchyPropertyParser0.getSeperator());
      assertEquals(0, hierarchyPropertyParser0.depth());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
      String string0 = hierarchyPropertyParser0.fullValue();
      assertNull(string0);
      assertEquals(".", hierarchyPropertyParser0.getSeperator());
      assertEquals(0, hierarchyPropertyParser0.depth());
      assertEquals(0, hierarchyPropertyParser0.getLevel());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser(".Q", "");
      int int0 = hierarchyPropertyParser0.depth();
      assertEquals(".", hierarchyPropertyParser0.getSeperator());
      assertEquals(0, int0);
      assertEquals(0, hierarchyPropertyParser0.getLevel());
      assertTrue(hierarchyPropertyParser0.isLeafReached());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
      hierarchyPropertyParser0.context();
      assertEquals(0, hierarchyPropertyParser0.getLevel());
      assertEquals(".", hierarchyPropertyParser0.getSeperator());
      assertEquals(0, hierarchyPropertyParser0.depth());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser("", "");
      String[] stringArray0 = hierarchyPropertyParser0.childrenValues();
      assertEquals(".", hierarchyPropertyParser0.getSeperator());
      assertEquals(0, hierarchyPropertyParser0.depth());
      assertNotNull(stringArray0);
      assertEquals(0, hierarchyPropertyParser0.getLevel());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser("", "");
      hierarchyPropertyParser0.build("", "");
      assertEquals(0, hierarchyPropertyParser0.depth());
      assertEquals(".", hierarchyPropertyParser0.getSeperator());
      assertEquals(0, hierarchyPropertyParser0.getLevel());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser("", "");
      // Undeclared exception!
      try { 
        hierarchyPropertyParser0.add("");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("HierarchyPropertyParserSourceCode.HierarchyPropertyParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      HierarchyPropertyParser hierarchyPropertyParser0 = new HierarchyPropertyParser();
      boolean boolean0 = hierarchyPropertyParser0.contains("1K:Wx~f6Vg");
      assertEquals(0, hierarchyPropertyParser0.depth());
      assertFalse(boolean0);
      assertEquals(0, hierarchyPropertyParser0.getLevel());
      assertEquals(".", hierarchyPropertyParser0.getSeperator());
  }
}