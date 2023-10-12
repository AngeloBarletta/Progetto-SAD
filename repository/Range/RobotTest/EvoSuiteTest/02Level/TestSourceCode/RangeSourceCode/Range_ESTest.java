/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 11 23:48:56 GMT 2023
 */

package RangeSourceCode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import RangeSourceCode.Range;
import java.util.Comparator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Range_ESTest extends Range_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-3587)).when(comparator0).compare(any() , any());
      Range<Object> range0 = Range.is((Object) "", comparator0);
      boolean boolean0 = range0.isStartedBy((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Range<String> range0 = Range.between("N<t@6ZkSNIw&ZFU", "N<t@6ZkSNIw&ZFU");
      // Undeclared exception!
      try { 
        range0.intersectionWith((Range<String>) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot calculate intersection with non-overlapping range null
         //
         verifyException("RangeSourceCode.Range", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Range<String> range0 = Range.is(")xu1~");
      boolean boolean0 = range0.isEndedBy((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Object object0 = new Object();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-3357)).when(comparator0).compare(any() , any());
      Range<Object> range0 = Range.is(object0, comparator0);
      boolean boolean0 = range0.isBeforeRange((Range<Object>) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Range<String> range0 = Range.between("[-64..-64]", "");
      Comparator<String> comparator0 = range0.getComparator();
      Comparator<Object> comparator1 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(1).when(comparator1).compare(any() , any());
      Range<Object> range1 = Range.between((Object) comparator0, (Object) range0, comparator1);
      boolean boolean0 = range1.isAfter((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Range<Object> range0 = Range.between((Object) "", (Object) "", (Comparator<Object>) null);
      range0.hashCode();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(anyInt() , anyInt());
      Range<Integer> range0 = Range.is(integer0, comparator0);
      // Undeclared exception!
      try { 
        range0.elementCompareTo((Integer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Element is null
         //
         verifyException("RangeSourceCode.Range", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Comparator<Range<Object>> comparator0 = (Comparator<Range<Object>>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        Range.is((Range<Object>) null, comparator0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Elements in a range must not be null: element1=null, element2=null
         //
         verifyException("RangeSourceCode.Range", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Range<String> range0 = Range.is("");
      String string0 = range0.toString("..");
      assertEquals("..", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      Range<Object> range0 = Range.is((Object) "", comparator0);
      String string0 = range0.toString("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Range<String> range0 = Range.is("");
      String string0 = range0.toString();
      assertEquals("[..]", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Range<String> range0 = Range.between("", "");
      boolean boolean0 = range0.isStartedBy("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Range<String> range0 = Range.is(")xu1~");
      boolean boolean0 = range0.isOverlappedBy(range0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(3, 3, (-3373), (-417), (-408)).when(comparator0).compare(anyString() , anyString());
      Range<String> range0 = Range.is("", comparator0);
      boolean boolean0 = range0.isEndedBy("");
      boolean boolean1 = range0.isOverlappedBy(range0);
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Range<String> range0 = Range.between("7!Zq4yI4YW", "7!Zq4yI4YW");
      boolean boolean0 = range0.isNaturalOrdering();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-3357)).when(comparator0).compare(any() , any());
      Range<Object> range0 = Range.between((Object) "", (Object) "", comparator0);
      boolean boolean0 = range0.isNaturalOrdering();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Range<String> range0 = Range.between("", "");
      boolean boolean0 = range0.isEndedBy("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Range<String> range0 = Range.between("I#~!l", ";H;sS.2");
      Comparator<String> comparator0 = range0.getComparator();
      Range<String> range1 = Range.is("XH{qE4cf!W0eJK9YQ", comparator0);
      boolean boolean0 = range0.isBeforeRange(range1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Range<String> range0 = Range.between("", "");
      boolean boolean0 = range0.isBefore("S5)fF!pc}=:;7\"4Ci");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-3357)).when(comparator0).compare(any() , any());
      Range<Object> range0 = Range.between((Object) "", (Object) "", comparator0);
      boolean boolean0 = range0.isBefore((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-3357), (-3357)).when(comparator0).compare(any() , any());
      Range<Object> range0 = Range.between((Object) "", (Object) "", comparator0);
      boolean boolean0 = range0.isAfterRange(range0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Integer integer0 = new Integer((-1759));
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-1759)).when(comparator0).compare(anyInt() , anyInt());
      Range<Integer> range0 = Range.is(integer0, comparator0);
      boolean boolean0 = range0.isAfterRange((Range<Integer>) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Range<String> range0 = Range.is("mR^/KVi7FfofC-4?");
      boolean boolean0 = range0.isAfter("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Integer integer0 = new Integer((-837));
      Range<Integer> range0 = Range.is(integer0);
      Range<Integer> range1 = range0.intersectionWith(range0);
      assertSame(range1, range0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Range<String> range0 = Range.between("[-837..-837]", "");
      Comparator<String> comparator0 = range0.getComparator();
      Comparator<Object> comparator1 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(1, 1208, (-837)).when(comparator1).compare(any() , any());
      Range<Object> range1 = Range.between((Object) comparator0, (Object) range0, comparator1);
      Range<Object> range2 = range1.intersectionWith(range1);
      assertSame(range2, range1);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Range<String> range0 = Range.is("");
      Object object0 = range0.getMinimum();
      assertEquals("", object0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Range<String> range0 = Range.between("", "");
      Object object0 = range0.getMaximum();
      assertEquals("", object0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Range<String> range0 = Range.is("");
      Range<Object> range1 = Range.between((Object) "", (Object) "", (Comparator<Object>) null);
      boolean boolean0 = range1.equals(range0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Range<String> range0 = Range.between("7!Zq4yI4YW", "7!Zq4yI4YW");
      Comparator<Range<String>> comparator0 = (Comparator<Range<String>>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-1)).when(comparator0).compare(nullable(RangeSourceCode.Range.class) , nullable(RangeSourceCode.Range.class));
      Range<Range<String>> range1 = Range.is(range0, comparator0);
      boolean boolean0 = range1.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Range<String> range0 = Range.between("[-837..-837]", "");
      int int0 = range0.elementCompareTo("MlFOGu");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Range<String> range0 = Range.between("[-837..-837]", "");
      Comparator<String> comparator0 = range0.getComparator();
      Range<String> range1 = Range.is("MlFOGu", comparator0);
      int int0 = range1.elementCompareTo("[-837..-837]");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Integer integer0 = new Integer((-837));
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(24, (-837)).when(comparator0).compare(anyInt() , anyInt());
      Range<Integer> range0 = Range.is(integer0, comparator0);
      int int0 = range0.elementCompareTo(integer0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(anyInt() , anyInt());
      Range<Integer> range0 = Range.is(integer0, comparator0);
      boolean boolean0 = range0.containsRange((Range<Integer>) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Integer integer0 = new Integer((-64));
      Range<Integer> range0 = Range.is(integer0);
      boolean boolean0 = range0.contains(integer0);
      assertTrue(boolean0);
      
      String string0 = range0.toString();
      assertNotNull(string0);
      
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(5453, 1, (-1), 1208, 47).when(comparator0).compare(anyInt() , anyInt());
      Range<Integer> range1 = Range.is(integer0, comparator0);
      Integer integer1 = new Integer((-64));
      int int0 = range1.elementCompareTo(integer1);
      range0.intersectionWith(range1);
      Range<String> range2 = Range.between("[-64..-64]", "");
      Comparator<String> comparator1 = range2.getComparator();
      Range<String> range3 = Range.is("MlFOGu", comparator1);
      int int1 = range3.elementCompareTo("");
      assertEquals((-1), int1);
      
      Range<String> range4 = range3.intersectionWith(range2);
      int int2 = range4.elementCompareTo("MlFOGu");
      assertEquals(0, int2);
      
      int int3 = range3.elementCompareTo("[-64..-64]");
      assertFalse(int3 == int0);
      
      Comparator<Object> comparator2 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(1, 0, 8, 5453, 0).when(comparator2).compare(any() , any());
      Range<Object> range5 = Range.between((Object) comparator1, (Object) range4, comparator2);
      Range<Object> range6 = range5.intersectionWith(range5);
      assertNotSame(range4, range3);
      assertSame(range6, range5);
      assertTrue(range4.equals((Object)range3));
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Range<String> range0 = Range.between("$VALUES", "$VALUES");
      boolean boolean0 = range0.contains((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Range<String> range0 = Range.between("", "");
      boolean boolean0 = range0.containsRange(range0);
      assertTrue(boolean0);
  }
}
