
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test001"); }


    boolean b1 = ResultSetHelper.typeIsNumeric((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test002"); }


    java.lang.Class class1 = ResultSetHelper.typeToClass(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(class1);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test003"); }


    boolean b1 = ResultSetHelper.typeIsNumeric(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test004"); }


    boolean b1 = ResultSetHelper.typeIsNumeric((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test005"); }


    boolean b1 = ResultSetHelper.typeIsNumeric((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test006"); }


    boolean b1 = ResultSetHelper.typeIsNumeric(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test007"); }


    boolean b1 = ResultSetHelper.typeIsNumeric(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test008"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (int)(short)1);
    java.sql.ResultSet resultSet3 = resultSetHelper2.getResultSet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resultSet3);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test009"); }


    boolean b1 = ResultSetHelper.typeIsNumeric((int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test010"); }


    java.lang.Class class1 = ResultSetHelper.typeToClass((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(class1);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test011"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper1 = new ResultSetHelper(resultSet0);
    int i2 = resultSetHelper1.getColumnCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test012"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper1 = new ResultSetHelper(resultSet0);
    boolean b2 = resultSetHelper1.hasMaxRows();
    java.lang.Object[][] obj_array_array3 = resultSetHelper1.getCells();
    boolean[] b_array4 = resultSetHelper1.getNumericColumns();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b_array4);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test013"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (int)'a');
    java.lang.Object[][] obj_array_array3 = resultSetHelper2.getCells();
    java.lang.String[] str_array4 = resultSetHelper2.getColumnNames();
    java.lang.Object[][] obj_array_array5 = resultSetHelper2.getCells();
    boolean[] b_array6 = resultSetHelper2.getNumericColumns();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b_array6);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test014"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (int)(byte)100);
    boolean b3 = resultSetHelper2.hasMaxRows();
    java.lang.String[] str_array4 = resultSetHelper2.getColumnNames();
    boolean[] b_array5 = resultSetHelper2.getNumericColumns();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b_array5);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test015"); }


    boolean b1 = ResultSetHelper.typeIsNumeric((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test016"); }


    boolean b1 = ResultSetHelper.typeIsNumeric((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test017"); }


    boolean b1 = ResultSetHelper.typeIsNumeric((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test018"); }


    java.lang.Class class1 = ResultSetHelper.typeToClass((int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(class1);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test019"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper1 = new ResultSetHelper(resultSet0);
    boolean b2 = resultSetHelper1.hasMaxRows();
    java.lang.Object[][] obj_array_array3 = resultSetHelper1.getCells();
    java.lang.Object[][] obj_array_array4 = resultSetHelper1.getCells();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array4);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test020"); }


    java.lang.Class class1 = ResultSetHelper.typeToClass((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(class1);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test021"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (int)(byte)100);
    boolean b3 = resultSetHelper2.hasMaxRows();
    java.sql.ResultSet resultSet4 = resultSetHelper2.getResultSet();
    java.lang.Object[][] obj_array_array5 = resultSetHelper2.getCells();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resultSet4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array5);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test022"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (int)(byte)100);
    boolean b3 = resultSetHelper2.hasMaxRows();
    java.sql.ResultSet resultSet4 = resultSetHelper2.getResultSet();
    int i5 = resultSetHelper2.getRowCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resultSet4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test023"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (int)'a');
    boolean[] b_array3 = resultSetHelper2.getNumericColumns();
    boolean b4 = resultSetHelper2.hasMaxRows();
    int i5 = resultSetHelper2.getColumnCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test024"); }


    java.lang.Class class1 = ResultSetHelper.typeToClass((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(class1);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test025"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (int)(byte)100);
    java.lang.String[] str_array3 = resultSetHelper2.getColumnNames();
    java.lang.Class[] class_array4 = resultSetHelper2.getColumnClasses();
    int i5 = resultSetHelper2.getMaxRows();
    java.lang.String[] str_array6 = resultSetHelper2.getColumnNames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(class_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array6);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test026"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (int)(short)-1);
    java.lang.Object[][] obj_array_array3 = resultSetHelper2.getCells();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array3);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test027"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (int)(byte)100);
    java.lang.Class[] class_array3 = resultSetHelper2.getColumnClasses();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(class_array3);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test028"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (int)(short)1);
    boolean[] b_array3 = resultSetHelper2.getNumericColumns();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b_array3);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test029"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, 97);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test030"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper1 = new ResultSetHelper(resultSet0);
    boolean b2 = resultSetHelper1.hasMaxRows();
    java.lang.Object[][] obj_array_array3 = resultSetHelper1.getCells();
    int i4 = resultSetHelper1.getMaxRows();
    java.lang.Class[] class_array5 = resultSetHelper1.getColumnClasses();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(class_array5);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test031"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (int)(short)100);
    int i3 = resultSetHelper2.getColumnCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test032"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper1 = new ResultSetHelper(resultSet0);
    int i2 = resultSetHelper1.getMaxRows();
    boolean[] b_array3 = resultSetHelper1.getNumericColumns();
    java.lang.Object[][] obj_array_array4 = resultSetHelper1.getCells();
    java.lang.Object[][] obj_array_array5 = resultSetHelper1.getCells();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array5);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test033"); }


    java.lang.Class class1 = ResultSetHelper.typeToClass((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(class1);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test034"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (int)(byte)100);
    boolean[] b_array3 = resultSetHelper2.getNumericColumns();
    boolean b4 = resultSetHelper2.hasMaxRows();
    int i5 = resultSetHelper2.getMaxRows();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test035"); }


    boolean b1 = ResultSetHelper.typeIsNumeric((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test036"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper1 = new ResultSetHelper(resultSet0);
    boolean b2 = resultSetHelper1.hasMaxRows();
    java.sql.ResultSet resultSet3 = resultSetHelper1.getResultSet();
    java.sql.ResultSet resultSet4 = resultSetHelper1.getResultSet();
    java.sql.ResultSet resultSet5 = resultSetHelper1.getResultSet();
    int i6 = resultSetHelper1.getMaxRows();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resultSet3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resultSet4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resultSet5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test037"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, 1);
    int i3 = resultSetHelper2.getColumnCount();
    int i4 = resultSetHelper2.getColumnCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test038"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (int)(byte)100);
    java.lang.String[] str_array3 = resultSetHelper2.getColumnNames();
    boolean[] b_array4 = resultSetHelper2.getNumericColumns();
    java.lang.Object[][] obj_array_array5 = resultSetHelper2.getCells();
    int i6 = resultSetHelper2.getColumnCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test039"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (int)(byte)100);
    java.lang.String[] str_array3 = resultSetHelper2.getColumnNames();
    java.sql.ResultSet resultSet4 = resultSetHelper2.getResultSet();
    int i5 = resultSetHelper2.getRowCount();
    boolean b6 = resultSetHelper2.hasMaxRows();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resultSet4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test040"); }


    java.lang.Class class1 = ResultSetHelper.typeToClass((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(class1);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test041"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper1 = new ResultSetHelper(resultSet0);
    int i2 = resultSetHelper1.getMaxRows();
    boolean[] b_array3 = resultSetHelper1.getNumericColumns();
    java.lang.Class[] class_array4 = resultSetHelper1.getColumnClasses();
    boolean[] b_array5 = resultSetHelper1.getNumericColumns();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(class_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b_array5);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test042"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (int)(byte)100);
    java.lang.String[] str_array3 = resultSetHelper2.getColumnNames();
    java.lang.Class[] class_array4 = resultSetHelper2.getColumnClasses();
    int i5 = resultSetHelper2.getMaxRows();
    int i6 = resultSetHelper2.getRowCount();
    java.lang.String[] str_array7 = resultSetHelper2.getColumnNames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(class_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array7);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test043"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper1 = new ResultSetHelper(resultSet0);
    boolean b2 = resultSetHelper1.hasMaxRows();
    java.lang.String[] str_array3 = resultSetHelper1.getColumnNames();
    java.lang.Object[][] obj_array_array4 = resultSetHelper1.getCells();
    int i5 = resultSetHelper1.getColumnCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test044"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (-1));

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test045"); }


    boolean b1 = ResultSetHelper.typeIsNumeric((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test046"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper1 = new ResultSetHelper(resultSet0);
    boolean b2 = resultSetHelper1.hasMaxRows();
    java.lang.String[] str_array3 = resultSetHelper1.getColumnNames();
    java.lang.Class[] class_array4 = resultSetHelper1.getColumnClasses();
    int i5 = resultSetHelper1.getRowCount();
    java.sql.ResultSet resultSet6 = resultSetHelper1.getResultSet();
    java.lang.Object[][] obj_array_array7 = resultSetHelper1.getCells();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(class_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resultSet6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array7);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test047"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (int)(byte)100);
    java.lang.String[] str_array3 = resultSetHelper2.getColumnNames();
    boolean[] b_array4 = resultSetHelper2.getNumericColumns();
    java.lang.String[] str_array5 = resultSetHelper2.getColumnNames();
    int i6 = resultSetHelper2.getRowCount();
    boolean b7 = resultSetHelper2.hasMaxRows();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test048"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, 100);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test049"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (int)'a');
    boolean[] b_array3 = resultSetHelper2.getNumericColumns();
    int i4 = resultSetHelper2.getMaxRows();
    int i5 = resultSetHelper2.getColumnCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test050"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper1 = new ResultSetHelper(resultSet0);
    boolean b2 = resultSetHelper1.hasMaxRows();
    java.lang.Object[][] obj_array_array3 = resultSetHelper1.getCells();
    int i4 = resultSetHelper1.getMaxRows();
    int i5 = resultSetHelper1.getMaxRows();
    int i6 = resultSetHelper1.getMaxRows();
    int i7 = resultSetHelper1.getRowCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array3);
    
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
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test051"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (int)(byte)100);
    boolean b3 = resultSetHelper2.hasMaxRows();
    java.sql.ResultSet resultSet4 = resultSetHelper2.getResultSet();
    boolean[] b_array5 = resultSetHelper2.getNumericColumns();
    int i6 = resultSetHelper2.getRowCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resultSet4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test052"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (int)'a');
    java.lang.Object[][] obj_array_array3 = resultSetHelper2.getCells();
    int i4 = resultSetHelper2.getColumnCount();
    boolean[] b_array5 = resultSetHelper2.getNumericColumns();
    int i6 = resultSetHelper2.getColumnCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test053"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (int)(byte)-1);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test054"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (int)(byte)100);
    boolean b3 = resultSetHelper2.hasMaxRows();
    java.sql.ResultSet resultSet4 = resultSetHelper2.getResultSet();
    java.lang.String[] str_array5 = resultSetHelper2.getColumnNames();
    boolean b6 = resultSetHelper2.hasMaxRows();
    boolean[] b_array7 = resultSetHelper2.getNumericColumns();
    int i8 = resultSetHelper2.getMaxRows();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resultSet4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test055"); }


    java.lang.Class class1 = ResultSetHelper.typeToClass(97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(class1);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test056"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (int)(byte)100);
    boolean b3 = resultSetHelper2.hasMaxRows();
    java.sql.ResultSet resultSet4 = resultSetHelper2.getResultSet();
    int i5 = resultSetHelper2.getMaxRows();
    int i6 = resultSetHelper2.getRowCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resultSet4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test057"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper1 = new ResultSetHelper(resultSet0);
    boolean b2 = resultSetHelper1.hasMaxRows();
    java.lang.String[] str_array3 = resultSetHelper1.getColumnNames();
    java.lang.Object[][] obj_array_array4 = resultSetHelper1.getCells();
    boolean b5 = resultSetHelper1.hasMaxRows();
    java.lang.Class[] class_array6 = resultSetHelper1.getColumnClasses();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(class_array6);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test058"); }


    java.lang.Class class1 = ResultSetHelper.typeToClass((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(class1);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test059"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (int)(byte)100);
    java.lang.String[] str_array3 = resultSetHelper2.getColumnNames();
    java.sql.ResultSet resultSet4 = resultSetHelper2.getResultSet();
    int i5 = resultSetHelper2.getRowCount();
    int i6 = resultSetHelper2.getColumnCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resultSet4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test060"); }


    java.lang.Class class1 = ResultSetHelper.typeToClass((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(class1);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test061"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper1 = new ResultSetHelper(resultSet0);
    boolean b2 = resultSetHelper1.hasMaxRows();
    java.lang.String[] str_array3 = resultSetHelper1.getColumnNames();
    java.lang.Class[] class_array4 = resultSetHelper1.getColumnClasses();
    java.sql.ResultSet resultSet5 = resultSetHelper1.getResultSet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(class_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resultSet5);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test062"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper1 = new ResultSetHelper(resultSet0);
    int i2 = resultSetHelper1.getMaxRows();
    java.lang.Object[][] obj_array_array3 = resultSetHelper1.getCells();
    boolean[] b_array4 = resultSetHelper1.getNumericColumns();
    int i5 = resultSetHelper1.getMaxRows();
    java.lang.Object[][] obj_array_array6 = resultSetHelper1.getCells();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array6);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test063"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (int)(byte)100);
    boolean b3 = resultSetHelper2.hasMaxRows();
    int i4 = resultSetHelper2.getRowCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test064"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (int)(byte)1);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test065"); }


    boolean b1 = ResultSetHelper.typeIsNumeric((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test066"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (int)'a');
    boolean[] b_array3 = resultSetHelper2.getNumericColumns();
    boolean b4 = resultSetHelper2.hasMaxRows();
    boolean b5 = resultSetHelper2.hasMaxRows();
    java.lang.String[] str_array6 = resultSetHelper2.getColumnNames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array6);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test067"); }


    boolean b1 = ResultSetHelper.typeIsNumeric((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test068"); }


    java.lang.Class class1 = ResultSetHelper.typeToClass((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(class1);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test069"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (int)(byte)100);
    java.lang.String[] str_array3 = resultSetHelper2.getColumnNames();
    java.sql.ResultSet resultSet4 = resultSetHelper2.getResultSet();
    int i5 = resultSetHelper2.getRowCount();
    java.lang.Object[][] obj_array_array6 = resultSetHelper2.getCells();
    java.sql.ResultSet resultSet7 = resultSetHelper2.getResultSet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resultSet4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resultSet7);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test070"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (int)(byte)100);
    int i3 = resultSetHelper2.getRowCount();
    int i4 = resultSetHelper2.getColumnCount();
    int i5 = resultSetHelper2.getColumnCount();
    int i6 = resultSetHelper2.getRowCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test071"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (int)(byte)100);
    java.lang.String[] str_array3 = resultSetHelper2.getColumnNames();
    boolean[] b_array4 = resultSetHelper2.getNumericColumns();
    java.lang.String[] str_array5 = resultSetHelper2.getColumnNames();
    boolean b6 = resultSetHelper2.hasMaxRows();
    java.lang.String[] str_array7 = resultSetHelper2.getColumnNames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array7);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test072"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper1 = new ResultSetHelper(resultSet0);
    boolean b2 = resultSetHelper1.hasMaxRows();
    java.lang.String[] str_array3 = resultSetHelper1.getColumnNames();
    java.lang.String[] str_array4 = resultSetHelper1.getColumnNames();
    int i5 = resultSetHelper1.getColumnCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test073"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (int)(short)-1);
    java.sql.ResultSet resultSet3 = resultSetHelper2.getResultSet();
    int i4 = resultSetHelper2.getMaxRows();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resultSet3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test074"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (int)(byte)100);
    boolean b3 = resultSetHelper2.hasMaxRows();
    java.sql.ResultSet resultSet4 = resultSetHelper2.getResultSet();
    int i5 = resultSetHelper2.getMaxRows();
    boolean[] b_array6 = resultSetHelper2.getNumericColumns();
    java.lang.Object[][] obj_array_array7 = resultSetHelper2.getCells();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resultSet4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array7);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test075"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (int)(byte)100);
    java.lang.String[] str_array3 = resultSetHelper2.getColumnNames();
    java.sql.ResultSet resultSet4 = resultSetHelper2.getResultSet();
    int i5 = resultSetHelper2.getColumnCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resultSet4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test076"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (int)(short)1);
    java.lang.Object[][] obj_array_array3 = resultSetHelper2.getCells();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array3);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test077"); }


    java.lang.Class class1 = ResultSetHelper.typeToClass((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(class1);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test078"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (int)'a');
    java.lang.Object[][] obj_array_array3 = resultSetHelper2.getCells();
    java.lang.String[] str_array4 = resultSetHelper2.getColumnNames();
    boolean[] b_array5 = resultSetHelper2.getNumericColumns();
    java.sql.ResultSet resultSet6 = resultSetHelper2.getResultSet();
    int i7 = resultSetHelper2.getColumnCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resultSet6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test079"); }


    boolean b1 = ResultSetHelper.typeIsNumeric((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test080"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (int)(short)0);
    int i3 = resultSetHelper2.getRowCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test081"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper1 = new ResultSetHelper(resultSet0);
    boolean b2 = resultSetHelper1.hasMaxRows();
    java.lang.Object[][] obj_array_array3 = resultSetHelper1.getCells();
    int i4 = resultSetHelper1.getMaxRows();
    int i5 = resultSetHelper1.getMaxRows();
    int i6 = resultSetHelper1.getMaxRows();
    int i7 = resultSetHelper1.getMaxRows();
    java.lang.Class[] class_array8 = resultSetHelper1.getColumnClasses();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(class_array8);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test082"); }


    java.lang.Class class1 = ResultSetHelper.typeToClass(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(class1);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test083"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper1 = new ResultSetHelper(resultSet0);
    boolean b2 = resultSetHelper1.hasMaxRows();
    java.sql.ResultSet resultSet3 = resultSetHelper1.getResultSet();
    int i4 = resultSetHelper1.getRowCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resultSet3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test084"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper1 = new ResultSetHelper(resultSet0);
    boolean b2 = resultSetHelper1.hasMaxRows();
    java.sql.ResultSet resultSet3 = resultSetHelper1.getResultSet();
    java.sql.ResultSet resultSet4 = resultSetHelper1.getResultSet();
    java.sql.ResultSet resultSet5 = resultSetHelper1.getResultSet();
    boolean[] b_array6 = resultSetHelper1.getNumericColumns();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resultSet3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resultSet4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resultSet5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b_array6);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test085"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (int)(byte)100);
    java.lang.String[] str_array3 = resultSetHelper2.getColumnNames();
    boolean[] b_array4 = resultSetHelper2.getNumericColumns();
    java.lang.String[] str_array5 = resultSetHelper2.getColumnNames();
    int i6 = resultSetHelper2.getRowCount();
    int i7 = resultSetHelper2.getMaxRows();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test086"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (int)'a');
    boolean[] b_array3 = resultSetHelper2.getNumericColumns();
    boolean b4 = resultSetHelper2.hasMaxRows();
    java.sql.ResultSet resultSet5 = resultSetHelper2.getResultSet();
    java.lang.Class[] class_array6 = resultSetHelper2.getColumnClasses();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resultSet5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(class_array6);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test087"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper1 = new ResultSetHelper(resultSet0);
    boolean b2 = resultSetHelper1.hasMaxRows();
    java.lang.String[] str_array3 = resultSetHelper1.getColumnNames();
    java.lang.Class[] class_array4 = resultSetHelper1.getColumnClasses();
    int i5 = resultSetHelper1.getRowCount();
    int i6 = resultSetHelper1.getColumnCount();
    boolean[] b_array7 = resultSetHelper1.getNumericColumns();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(class_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b_array7);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test088"); }


    java.lang.Class class1 = ResultSetHelper.typeToClass(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(class1);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test089"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper1 = new ResultSetHelper(resultSet0);
    int i2 = resultSetHelper1.getMaxRows();
    java.lang.Object[][] obj_array_array3 = resultSetHelper1.getCells();
    int i4 = resultSetHelper1.getRowCount();
    java.sql.ResultSet resultSet5 = resultSetHelper1.getResultSet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resultSet5);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test090"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper1 = new ResultSetHelper(resultSet0);
    boolean b2 = resultSetHelper1.hasMaxRows();
    boolean[] b_array3 = resultSetHelper1.getNumericColumns();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b_array3);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test091"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper1 = new ResultSetHelper(resultSet0);
    boolean b2 = resultSetHelper1.hasMaxRows();
    java.lang.String[] str_array3 = resultSetHelper1.getColumnNames();
    java.lang.String[] str_array4 = resultSetHelper1.getColumnNames();
    int i5 = resultSetHelper1.getRowCount();
    int i6 = resultSetHelper1.getColumnCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test092"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (int)(byte)100);
    boolean b3 = resultSetHelper2.hasMaxRows();
    java.sql.ResultSet resultSet4 = resultSetHelper2.getResultSet();
    java.lang.String[] str_array5 = resultSetHelper2.getColumnNames();
    boolean b6 = resultSetHelper2.hasMaxRows();
    boolean[] b_array7 = resultSetHelper2.getNumericColumns();
    java.lang.String[] str_array8 = resultSetHelper2.getColumnNames();
    int i9 = resultSetHelper2.getColumnCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resultSet4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test093"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (int)(byte)100);
    java.lang.String[] str_array3 = resultSetHelper2.getColumnNames();
    int i4 = resultSetHelper2.getMaxRows();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test094"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (int)'a');
    java.lang.Object[][] obj_array_array3 = resultSetHelper2.getCells();
    int i4 = resultSetHelper2.getColumnCount();
    boolean[] b_array5 = resultSetHelper2.getNumericColumns();
    java.lang.String[] str_array6 = resultSetHelper2.getColumnNames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array6);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test095"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (int)'a');
    java.lang.Object[][] obj_array_array3 = resultSetHelper2.getCells();
    int i4 = resultSetHelper2.getColumnCount();
    boolean[] b_array5 = resultSetHelper2.getNumericColumns();
    int i6 = resultSetHelper2.getRowCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test096"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper1 = new ResultSetHelper(resultSet0);
    java.sql.ResultSet resultSet2 = resultSetHelper1.getResultSet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resultSet2);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test097"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (int)(byte)100);
    java.lang.String[] str_array3 = resultSetHelper2.getColumnNames();
    boolean[] b_array4 = resultSetHelper2.getNumericColumns();
    java.lang.String[] str_array5 = resultSetHelper2.getColumnNames();
    boolean b6 = resultSetHelper2.hasMaxRows();
    int i7 = resultSetHelper2.getMaxRows();
    java.lang.String[] str_array8 = resultSetHelper2.getColumnNames();
    java.sql.ResultSet resultSet9 = resultSetHelper2.getResultSet();
    java.lang.String[] str_array10 = resultSetHelper2.getColumnNames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resultSet9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array10);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test098"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (int)(byte)100);
    java.lang.String[] str_array3 = resultSetHelper2.getColumnNames();
    boolean[] b_array4 = resultSetHelper2.getNumericColumns();
    java.lang.String[] str_array5 = resultSetHelper2.getColumnNames();
    boolean b6 = resultSetHelper2.hasMaxRows();
    int i7 = resultSetHelper2.getMaxRows();
    boolean b8 = resultSetHelper2.hasMaxRows();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test099"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper1 = new ResultSetHelper(resultSet0);
    boolean b2 = resultSetHelper1.hasMaxRows();
    java.lang.String[] str_array3 = resultSetHelper1.getColumnNames();
    java.lang.Class[] class_array4 = resultSetHelper1.getColumnClasses();
    int i5 = resultSetHelper1.getRowCount();
    java.lang.String[] str_array6 = resultSetHelper1.getColumnNames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(class_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array6);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test100"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper1 = new ResultSetHelper(resultSet0);
    int i2 = resultSetHelper1.getMaxRows();
    boolean[] b_array3 = resultSetHelper1.getNumericColumns();
    java.sql.ResultSet resultSet4 = resultSetHelper1.getResultSet();
    int i5 = resultSetHelper1.getRowCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resultSet4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test101"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper1 = new ResultSetHelper(resultSet0);
    boolean b2 = resultSetHelper1.hasMaxRows();
    java.lang.String[] str_array3 = resultSetHelper1.getColumnNames();
    java.lang.String[] str_array4 = resultSetHelper1.getColumnNames();
    boolean[] b_array5 = resultSetHelper1.getNumericColumns();
    int i6 = resultSetHelper1.getRowCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test102"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (int)(byte)100);
    java.lang.String[] str_array3 = resultSetHelper2.getColumnNames();
    boolean[] b_array4 = resultSetHelper2.getNumericColumns();
    java.lang.String[] str_array5 = resultSetHelper2.getColumnNames();
    boolean b6 = resultSetHelper2.hasMaxRows();
    int i7 = resultSetHelper2.getMaxRows();
    java.lang.String[] str_array8 = resultSetHelper2.getColumnNames();
    int i9 = resultSetHelper2.getColumnCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test103"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (int)(short)-1);
    java.lang.String[] str_array3 = resultSetHelper2.getColumnNames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array3);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test104"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (int)(byte)10);
    java.lang.Class[] class_array3 = resultSetHelper2.getColumnClasses();
    java.sql.ResultSet resultSet4 = resultSetHelper2.getResultSet();
    boolean[] b_array5 = resultSetHelper2.getNumericColumns();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(class_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resultSet4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b_array5);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test105"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (int)'a');
    java.lang.Object[][] obj_array_array3 = resultSetHelper2.getCells();
    int i4 = resultSetHelper2.getColumnCount();
    boolean[] b_array5 = resultSetHelper2.getNumericColumns();
    java.sql.ResultSet resultSet6 = resultSetHelper2.getResultSet();
    java.lang.String[] str_array7 = resultSetHelper2.getColumnNames();
    java.sql.ResultSet resultSet8 = resultSetHelper2.getResultSet();
    java.sql.ResultSet resultSet9 = resultSetHelper2.getResultSet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resultSet6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resultSet8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resultSet9);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test106"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (int)(byte)100);
    boolean b3 = resultSetHelper2.hasMaxRows();
    java.sql.ResultSet resultSet4 = resultSetHelper2.getResultSet();
    int i5 = resultSetHelper2.getMaxRows();
    boolean[] b_array6 = resultSetHelper2.getNumericColumns();
    java.lang.Class[] class_array7 = resultSetHelper2.getColumnClasses();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resultSet4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(class_array7);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test107"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (int)'a');
    boolean[] b_array3 = resultSetHelper2.getNumericColumns();
    int i4 = resultSetHelper2.getMaxRows();
    int i5 = resultSetHelper2.getRowCount();
    boolean b6 = resultSetHelper2.hasMaxRows();
    java.lang.Class[] class_array7 = resultSetHelper2.getColumnClasses();
    java.lang.String[] str_array8 = resultSetHelper2.getColumnNames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(class_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array8);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test108"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (int)(byte)100);
    java.lang.String[] str_array3 = resultSetHelper2.getColumnNames();
    boolean[] b_array4 = resultSetHelper2.getNumericColumns();
    int i5 = resultSetHelper2.getColumnCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test109"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (int)'a');
    boolean[] b_array3 = resultSetHelper2.getNumericColumns();
    boolean b4 = resultSetHelper2.hasMaxRows();
    java.sql.ResultSet resultSet5 = resultSetHelper2.getResultSet();
    java.sql.ResultSet resultSet6 = resultSetHelper2.getResultSet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resultSet5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resultSet6);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test110"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (int)'a');
    java.lang.Object[][] obj_array_array3 = resultSetHelper2.getCells();
    java.lang.String[] str_array4 = resultSetHelper2.getColumnNames();
    java.lang.Class[] class_array5 = resultSetHelper2.getColumnClasses();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(class_array5);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test111"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (int)(byte)100);
    java.lang.String[] str_array3 = resultSetHelper2.getColumnNames();
    boolean[] b_array4 = resultSetHelper2.getNumericColumns();
    java.lang.String[] str_array5 = resultSetHelper2.getColumnNames();
    boolean[] b_array6 = resultSetHelper2.getNumericColumns();
    int i7 = resultSetHelper2.getColumnCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test112"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (int)(byte)0);
    java.lang.Object[][] obj_array_array3 = resultSetHelper2.getCells();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array3);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test113"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (int)(byte)100);
    java.lang.String[] str_array3 = resultSetHelper2.getColumnNames();
    boolean[] b_array4 = resultSetHelper2.getNumericColumns();
    java.lang.String[] str_array5 = resultSetHelper2.getColumnNames();
    int i6 = resultSetHelper2.getColumnCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test114"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (int)'#');
    boolean[] b_array3 = resultSetHelper2.getNumericColumns();
    boolean b4 = resultSetHelper2.hasMaxRows();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test115"); }


    boolean b1 = ResultSetHelper.typeIsNumeric((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test116"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper1 = new ResultSetHelper(resultSet0);
    boolean b2 = resultSetHelper1.hasMaxRows();
    java.lang.String[] str_array3 = resultSetHelper1.getColumnNames();
    java.lang.String[] str_array4 = resultSetHelper1.getColumnNames();
    int i5 = resultSetHelper1.getRowCount();
    boolean b6 = resultSetHelper1.hasMaxRows();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test117"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (int)(short)0);
    int i3 = resultSetHelper2.getMaxRows();
    java.sql.ResultSet resultSet4 = resultSetHelper2.getResultSet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resultSet4);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test118"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper1 = new ResultSetHelper(resultSet0);
    int i2 = resultSetHelper1.getMaxRows();
    int i3 = resultSetHelper1.getMaxRows();
    java.lang.Object[][] obj_array_array4 = resultSetHelper1.getCells();
    boolean b5 = resultSetHelper1.hasMaxRows();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test119"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper1 = new ResultSetHelper(resultSet0);
    int i2 = resultSetHelper1.getMaxRows();
    boolean[] b_array3 = resultSetHelper1.getNumericColumns();
    java.lang.Object[][] obj_array_array4 = resultSetHelper1.getCells();
    int i5 = resultSetHelper1.getColumnCount();
    java.lang.Object[][] obj_array_array6 = resultSetHelper1.getCells();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array6);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test120"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (int)'a');
    boolean[] b_array3 = resultSetHelper2.getNumericColumns();
    boolean b4 = resultSetHelper2.hasMaxRows();
    java.lang.String[] str_array5 = resultSetHelper2.getColumnNames();
    boolean[] b_array6 = resultSetHelper2.getNumericColumns();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b_array6);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test121"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (int)(byte)100);
    boolean b3 = resultSetHelper2.hasMaxRows();
    java.sql.ResultSet resultSet4 = resultSetHelper2.getResultSet();
    java.lang.String[] str_array5 = resultSetHelper2.getColumnNames();
    boolean b6 = resultSetHelper2.hasMaxRows();
    int i7 = resultSetHelper2.getColumnCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resultSet4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test122"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (int)(byte)100);
    boolean b3 = resultSetHelper2.hasMaxRows();
    java.sql.ResultSet resultSet4 = resultSetHelper2.getResultSet();
    java.lang.String[] str_array5 = resultSetHelper2.getColumnNames();
    int i6 = resultSetHelper2.getMaxRows();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resultSet4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test123"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (int)'a');
    boolean[] b_array3 = resultSetHelper2.getNumericColumns();
    int i4 = resultSetHelper2.getMaxRows();
    java.lang.Object[][] obj_array_array5 = resultSetHelper2.getCells();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array5);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test124"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (int)(byte)100);
    int i3 = resultSetHelper2.getRowCount();
    int i4 = resultSetHelper2.getColumnCount();
    java.lang.Class[] class_array5 = resultSetHelper2.getColumnClasses();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(class_array5);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test125"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (int)'a');
    java.lang.Object[][] obj_array_array3 = resultSetHelper2.getCells();
    java.lang.String[] str_array4 = resultSetHelper2.getColumnNames();
    java.lang.Object[][] obj_array_array5 = resultSetHelper2.getCells();
    boolean b6 = resultSetHelper2.hasMaxRows();
    boolean b7 = resultSetHelper2.hasMaxRows();
    java.sql.ResultSet resultSet8 = resultSetHelper2.getResultSet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resultSet8);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test126"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (int)'a');
    boolean[] b_array3 = resultSetHelper2.getNumericColumns();
    int i4 = resultSetHelper2.getMaxRows();
    int i5 = resultSetHelper2.getRowCount();
    boolean[] b_array6 = resultSetHelper2.getNumericColumns();
    java.lang.Object[][] obj_array_array7 = resultSetHelper2.getCells();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array7);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test127"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper1 = new ResultSetHelper(resultSet0);
    boolean b2 = resultSetHelper1.hasMaxRows();
    java.lang.String[] str_array3 = resultSetHelper1.getColumnNames();
    java.lang.String[] str_array4 = resultSetHelper1.getColumnNames();
    boolean[] b_array5 = resultSetHelper1.getNumericColumns();
    java.sql.ResultSet resultSet6 = resultSetHelper1.getResultSet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resultSet6);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test128"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (int)'a');
    java.lang.Object[][] obj_array_array3 = resultSetHelper2.getCells();
    java.lang.String[] str_array4 = resultSetHelper2.getColumnNames();
    int i5 = resultSetHelper2.getRowCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test129"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (int)(byte)10);
    java.lang.Class[] class_array3 = resultSetHelper2.getColumnClasses();
    java.sql.ResultSet resultSet4 = resultSetHelper2.getResultSet();
    java.lang.String[] str_array5 = resultSetHelper2.getColumnNames();
    int i6 = resultSetHelper2.getRowCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(class_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resultSet4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test130"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (int)(byte)0);
    int i3 = resultSetHelper2.getRowCount();
    boolean[] b_array4 = resultSetHelper2.getNumericColumns();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b_array4);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test131"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (int)(byte)100);
    boolean b3 = resultSetHelper2.hasMaxRows();
    java.sql.ResultSet resultSet4 = resultSetHelper2.getResultSet();
    java.lang.String[] str_array5 = resultSetHelper2.getColumnNames();
    java.lang.Class[] class_array6 = resultSetHelper2.getColumnClasses();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resultSet4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(class_array6);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test132"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (int)(byte)100);
    java.lang.String[] str_array3 = resultSetHelper2.getColumnNames();
    java.sql.ResultSet resultSet4 = resultSetHelper2.getResultSet();
    int i5 = resultSetHelper2.getRowCount();
    java.lang.Object[][] obj_array_array6 = resultSetHelper2.getCells();
    java.lang.Object[][] obj_array_array7 = resultSetHelper2.getCells();
    java.lang.String[] str_array8 = resultSetHelper2.getColumnNames();
    boolean b9 = resultSetHelper2.hasMaxRows();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resultSet4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test133"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper1 = new ResultSetHelper(resultSet0);
    int i2 = resultSetHelper1.getMaxRows();
    boolean[] b_array3 = resultSetHelper1.getNumericColumns();
    java.lang.Object[][] obj_array_array4 = resultSetHelper1.getCells();
    boolean[] b_array5 = resultSetHelper1.getNumericColumns();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b_array5);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test134"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper1 = new ResultSetHelper(resultSet0);
    boolean b2 = resultSetHelper1.hasMaxRows();
    java.lang.String[] str_array3 = resultSetHelper1.getColumnNames();
    java.lang.Object[][] obj_array_array4 = resultSetHelper1.getCells();
    boolean b5 = resultSetHelper1.hasMaxRows();
    java.sql.ResultSet resultSet6 = resultSetHelper1.getResultSet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resultSet6);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test135"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (int)'a');
    int i3 = resultSetHelper2.getRowCount();
    int i4 = resultSetHelper2.getRowCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test136"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (int)'a');
    java.lang.Object[][] obj_array_array3 = resultSetHelper2.getCells();
    java.lang.String[] str_array4 = resultSetHelper2.getColumnNames();
    java.lang.Object[][] obj_array_array5 = resultSetHelper2.getCells();
    boolean b6 = resultSetHelper2.hasMaxRows();
    boolean b7 = resultSetHelper2.hasMaxRows();
    boolean[] b_array8 = resultSetHelper2.getNumericColumns();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b_array8);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test137"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (int)'a');
    java.lang.Object[][] obj_array_array3 = resultSetHelper2.getCells();
    int i4 = resultSetHelper2.getMaxRows();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test138"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (int)'a');
    java.lang.Object[][] obj_array_array3 = resultSetHelper2.getCells();
    int i4 = resultSetHelper2.getColumnCount();
    boolean[] b_array5 = resultSetHelper2.getNumericColumns();
    java.sql.ResultSet resultSet6 = resultSetHelper2.getResultSet();
    java.lang.String[] str_array7 = resultSetHelper2.getColumnNames();
    java.sql.ResultSet resultSet8 = resultSetHelper2.getResultSet();
    boolean[] b_array9 = resultSetHelper2.getNumericColumns();
    java.sql.ResultSet resultSet10 = resultSetHelper2.getResultSet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resultSet6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resultSet8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resultSet10);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test139"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (int)'a');
    boolean[] b_array3 = resultSetHelper2.getNumericColumns();
    boolean b4 = resultSetHelper2.hasMaxRows();
    boolean b5 = resultSetHelper2.hasMaxRows();
    int i6 = resultSetHelper2.getColumnCount();
    java.lang.Class[] class_array7 = resultSetHelper2.getColumnClasses();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(class_array7);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test140"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (int)'a');
    boolean[] b_array3 = resultSetHelper2.getNumericColumns();
    boolean b4 = resultSetHelper2.hasMaxRows();
    boolean b5 = resultSetHelper2.hasMaxRows();
    int i6 = resultSetHelper2.getColumnCount();
    java.lang.String[] str_array7 = resultSetHelper2.getColumnNames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array7);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test141"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (int)'a');
    boolean[] b_array3 = resultSetHelper2.getNumericColumns();
    int i4 = resultSetHelper2.getMaxRows();
    boolean b5 = resultSetHelper2.hasMaxRows();
    int i6 = resultSetHelper2.getRowCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test142"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (int)'a');
    boolean[] b_array3 = resultSetHelper2.getNumericColumns();
    int i4 = resultSetHelper2.getMaxRows();
    boolean b5 = resultSetHelper2.hasMaxRows();
    int i6 = resultSetHelper2.getMaxRows();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test143"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (int)(byte)100);
    boolean b3 = resultSetHelper2.hasMaxRows();
    java.sql.ResultSet resultSet4 = resultSetHelper2.getResultSet();
    int i5 = resultSetHelper2.getMaxRows();
    boolean[] b_array6 = resultSetHelper2.getNumericColumns();
    java.lang.String[] str_array7 = resultSetHelper2.getColumnNames();
    boolean b8 = resultSetHelper2.hasMaxRows();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resultSet4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test144"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper1 = new ResultSetHelper(resultSet0);
    boolean b2 = resultSetHelper1.hasMaxRows();
    java.lang.Object[][] obj_array_array3 = resultSetHelper1.getCells();
    int i4 = resultSetHelper1.getMaxRows();
    int i5 = resultSetHelper1.getMaxRows();
    int i6 = resultSetHelper1.getMaxRows();
    int i7 = resultSetHelper1.getMaxRows();
    java.lang.Object[][] obj_array_array8 = resultSetHelper1.getCells();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array8);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test145"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, 0);
    java.sql.ResultSet resultSet3 = resultSetHelper2.getResultSet();
    boolean[] b_array4 = resultSetHelper2.getNumericColumns();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resultSet3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b_array4);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test146"); }


    boolean b1 = ResultSetHelper.typeIsNumeric(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test147"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (int)(short)0);
    java.lang.String[] str_array3 = resultSetHelper2.getColumnNames();
    int i4 = resultSetHelper2.getMaxRows();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test148"); }


    boolean b1 = ResultSetHelper.typeIsNumeric((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test149"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper1 = new ResultSetHelper(resultSet0);
    int i2 = resultSetHelper1.getMaxRows();
    int i3 = resultSetHelper1.getMaxRows();
    boolean[] b_array4 = resultSetHelper1.getNumericColumns();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b_array4);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test150"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper2 = new ResultSetHelper(resultSet0, (int)'a');
    boolean[] b_array3 = resultSetHelper2.getNumericColumns();
    int i4 = resultSetHelper2.getMaxRows();
    java.sql.ResultSet resultSet5 = resultSetHelper2.getResultSet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resultSet5);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test151"); }


    java.sql.ResultSet resultSet0 = null;
    ResultSetHelper resultSetHelper1 = new ResultSetHelper(resultSet0);
    boolean b2 = resultSetHelper1.hasMaxRows();
    java.lang.String[] str_array3 = resultSetHelper1.getColumnNames();
    java.lang.Object[][] obj_array_array4 = resultSetHelper1.getCells();
    java.sql.ResultSet resultSet5 = resultSetHelper1.getResultSet();
    int i6 = resultSetHelper1.getMaxRows();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resultSet5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

}
