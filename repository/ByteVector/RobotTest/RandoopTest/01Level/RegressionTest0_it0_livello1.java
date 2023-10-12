
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test001"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    byte[] byte_array5 = new byte[] { (byte)-1 };
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector8 = byteVector3.putByteArray(byte_array5, 0, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test002"); }


    ByteVector byteVector1 = new ByteVector((int)(byte)10);
    byte[] byte_array6 = new byte[] { (byte)-1, (byte)1, (byte)0, (byte)0 };
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector9 = byteVector1.putByteArray(byte_array6, 1, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array6);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test003"); }


    ByteVector byteVector1 = new ByteVector((int)' ');

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test004"); }


    ByteVector byteVector0 = new ByteVector();
    byte[] byte_array6 = new byte[] { (byte)100, (byte)1, (byte)0, (byte)-1, (byte)10 };
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector9 = byteVector0.putByteArray(byte_array6, (-1), 1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array6);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test005"); }


    ByteVector byteVector1 = new ByteVector(0);
    byte[] byte_array7 = new byte[] { (byte)-1, (byte)-1, (byte)-1, (byte)100, (byte)-1 };
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(byte)10, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test006"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putUTF8("");
    byte[] byte_array10 = new byte[] { (byte)100, (byte)100, (byte)0, (byte)-1 };
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector13 = byteVector1.putByteArray(byte_array10, (int)'#', (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array10);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test007"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putUTF8("");
    byte[] byte_array10 = new byte[] { (byte)0, (byte)0, (byte)100, (byte)10 };
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector13 = byteVector5.putByteArray(byte_array10, (int)(short)100, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array10);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test008"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector5.putLong(0L);
    ByteVector byteVector9 = byteVector5.putByte((-1));
    ByteVector byteVector11 = byteVector9.putShort((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test009"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector5.putLong(0L);
    ByteVector byteVector9 = byteVector7.putByte((int)(byte)1);
    ByteVector byteVector11 = byteVector7.putLong((long)(short)0);
    ByteVector byteVector13 = byteVector11.putUTF8("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test010"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector5.putLong(0L);
    ByteVector byteVector9 = byteVector5.putByte((-1));
    ByteVector byteVector11 = byteVector5.putLong(100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test011"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector5.putLong(0L);
    ByteVector byteVector9 = byteVector7.putByte((int)(byte)1);
    ByteVector byteVector11 = byteVector7.putLong((long)(short)0);
    byte[] byte_array12 = new byte[] {  };
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector15 = byteVector7.putByteArray(byte_array12, 100, (int)(short)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array12);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test012"); }


    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector1 = new ByteVector((-1));
      org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NegativeArraySizeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test013"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector5.putLong(0L);
    ByteVector byteVector9 = byteVector7.putByte((int)(byte)1);
    ByteVector byteVector11 = byteVector7.putLong((long)(short)0);
    ByteVector byteVector13 = byteVector7.putShort(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test014"); }


    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector1 = new ByteVector((int)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NegativeArraySizeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test015"); }


    ByteVector byteVector1 = new ByteVector((int)(short)100);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test016"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putUTF8("hi!");
    byte[] byte_array8 = new byte[] { (byte)-1, (byte)10, (byte)1, (byte)100, (byte)10 };
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector11 = byteVector0.putByteArray(byte_array8, 1, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array8);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test017"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector5.putLong(0L);
    ByteVector byteVector9 = byteVector7.putShort((int)(byte)100);
    ByteVector byteVector11 = byteVector7.putByte((int)(byte)100);
    byte[] byte_array14 = new byte[] { (byte)-1, (byte)100 };
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector17 = byteVector7.putByteArray(byte_array14, 100, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array14);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test018"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector3.putShort(10);
    ByteVector byteVector7 = byteVector3.putByte((int)'#');
    ByteVector byteVector9 = byteVector3.putInt((int)(byte)1);
    ByteVector byteVector11 = byteVector3.putShort(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test019"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector3.putShort(10);
    ByteVector byteVector7 = byteVector3.putByte((int)'#');
    ByteVector byteVector9 = byteVector3.putInt((int)(short)10);
    ByteVector byteVector11 = byteVector9.putShort((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test020"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector5.putShort(1);
    ByteVector byteVector9 = byteVector5.putShort((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test021"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector5.putShort(1);
    ByteVector byteVector9 = byteVector7.putByte((int)(byte)100);
    ByteVector byteVector11 = byteVector9.putLong((-1L));
    byte[] byte_array16 = new byte[] { (byte)0, (byte)1, (byte)100, (byte)-1 };
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector19 = byteVector11.putByteArray(byte_array16, (int)(short)10, (int)(short)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array16);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test022"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector1.putLong((long)'a');
    ByteVector byteVector7 = byteVector1.putLong((long)(byte)0);
    ByteVector byteVector9 = byteVector1.putInt(100);
    ByteVector byteVector11 = byteVector9.putUTF8("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test023"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector5.putLong(0L);
    ByteVector byteVector9 = byteVector7.putShort((int)(byte)100);
    ByteVector byteVector11 = byteVector7.putByte((int)(byte)100);
    ByteVector byteVector13 = byteVector7.putByte(100);
    ByteVector byteVector15 = byteVector7.putInt((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test024"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector5.putLong(0L);
    ByteVector byteVector9 = byteVector7.putShort((int)(byte)100);
    ByteVector byteVector11 = byteVector7.putByte((int)(byte)100);
    ByteVector byteVector13 = byteVector7.putByte(100);
    ByteVector byteVector15 = byteVector13.putLong(0L);
    ByteVector byteVector17 = byteVector13.putLong((long)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test025"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putShort((int)(byte)100);
    ByteVector byteVector7 = byteVector1.putShort((int)'a');
    ByteVector byteVector9 = byteVector1.putInt(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test026"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector5.putLong((long)(short)0);
    ByteVector byteVector9 = byteVector5.putLong((long)(short)0);
    byte[] byte_array15 = new byte[] { (byte)10, (byte)10, (byte)100, (byte)-1, (byte)0 };
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector18 = byteVector9.putByteArray(byte_array15, (int)(short)-1, (int)(short)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array15);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test027"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector5.putShort(1);
    ByteVector byteVector9 = byteVector7.putByte((int)(byte)100);
    ByteVector byteVector11 = byteVector9.putUTF8("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test028"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector1.putLong((long)'a');
    ByteVector byteVector7 = byteVector1.putLong((long)(byte)0);
    ByteVector byteVector9 = byteVector1.putByte(0);
    ByteVector byteVector11 = byteVector9.putLong((long)(byte)1);
    ByteVector byteVector13 = byteVector9.putLong((long)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test029"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector1.putLong((long)'a');
    ByteVector byteVector7 = byteVector1.putLong((long)(byte)0);
    ByteVector byteVector9 = byteVector7.putLong((long)(byte)-1);
    ByteVector byteVector11 = byteVector9.putShort((int)(byte)10);
    ByteVector byteVector13 = byteVector11.putUTF8("");
    ByteVector byteVector15 = byteVector11.putUTF8("");
    ByteVector byteVector17 = byteVector11.putInt((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test030"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector1.putLong((long)'a');
    ByteVector byteVector7 = byteVector1.putLong((long)(byte)0);
    ByteVector byteVector9 = byteVector1.putUTF8("");
    ByteVector byteVector11 = byteVector1.putUTF8("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test031"); }


    ByteVector byteVector1 = new ByteVector((int)(byte)0);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test032"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'a');
    ByteVector byteVector5 = byteVector3.putLong((long)(byte)100);
    ByteVector byteVector7 = byteVector3.putLong(1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test033"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector1.putLong((long)'a');
    ByteVector byteVector7 = byteVector1.putLong((long)(byte)0);
    ByteVector byteVector9 = byteVector1.putInt(100);
    ByteVector byteVector11 = byteVector9.putInt((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test034"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector5.putShort(1);
    byte[] byte_array11 = new byte[] { (byte)100, (byte)0, (byte)100 };
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector14 = byteVector5.putByteArray(byte_array11, (int)(short)100, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test035"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector5.putLong(0L);
    ByteVector byteVector9 = byteVector5.putByte((-1));
    ByteVector byteVector11 = byteVector5.putShort(0);
    ByteVector byteVector13 = byteVector5.putUTF8("hi!");
    ByteVector byteVector15 = byteVector13.putLong((long)(byte)0);
    ByteVector byteVector17 = byteVector15.putInt((int)(short)0);
    ByteVector byteVector19 = byteVector15.putByte((int)(byte)0);
    byte[] byte_array20 = new byte[] {  };
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector23 = byteVector19.putByteArray(byte_array20, 100, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array20);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test036"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector1.putLong((long)'a');
    ByteVector byteVector7 = byteVector1.putLong((long)(byte)0);
    ByteVector byteVector9 = byteVector1.putByte(0);
    ByteVector byteVector11 = byteVector9.putLong((long)(byte)1);
    ByteVector byteVector13 = new ByteVector((int)(short)1);
    ByteVector byteVector15 = byteVector13.putUTF8("");
    ByteVector byteVector17 = byteVector13.putLong((long)'a');
    ByteVector byteVector19 = byteVector17.putUTF8("");
    ByteVector byteVector21 = byteVector19.putShort((int)(short)1);
    byte[] byte_array28 = new byte[] { (byte)1, (byte)1, (byte)-1, (byte)10, (byte)0, (byte)-1 };
    ByteVector byteVector31 = byteVector21.putByteArray(byte_array28, (int)(short)1, 0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector34 = byteVector11.putByteArray(byte_array28, (int)(byte)100, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector31);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test037"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector5.putLong(0L);
    ByteVector byteVector9 = byteVector5.putByte((-1));
    ByteVector byteVector11 = byteVector5.putShort(0);
    ByteVector byteVector13 = byteVector5.putUTF8("hi!");
    ByteVector byteVector15 = byteVector13.putLong((long)(byte)0);
    ByteVector byteVector17 = byteVector13.putShort((int)(byte)-1);
    ByteVector byteVector19 = byteVector13.putByte((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test038"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector3.putShort(10);
    ByteVector byteVector7 = byteVector3.putByte((int)'#');
    ByteVector byteVector9 = byteVector3.putInt((int)(short)10);
    ByteVector byteVector11 = byteVector3.putInt((int)(byte)0);
    byte[] byte_array18 = new byte[] { (byte)1, (byte)10, (byte)1, (byte)10, (byte)100, (byte)-1 };
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector21 = byteVector3.putByteArray(byte_array18, (int)(byte)1, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array18);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test039"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector1.putShort((int)(byte)1);
    ByteVector byteVector9 = new ByteVector((int)(short)1);
    ByteVector byteVector11 = byteVector9.putUTF8("hi!");
    ByteVector byteVector13 = byteVector9.putUTF8("");
    ByteVector byteVector15 = byteVector13.putLong(0L);
    ByteVector byteVector17 = byteVector15.putShort((int)(byte)100);
    ByteVector byteVector19 = byteVector15.putByte((int)(byte)100);
    ByteVector byteVector21 = byteVector15.putByte(100);
    ByteVector byteVector23 = byteVector15.putUTF8("hi!");
    byte[] byte_array27 = new byte[] { (byte)10, (byte)1, (byte)1 };
    ByteVector byteVector30 = byteVector15.putByteArray(byte_array27, 0, 0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector33 = byteVector7.putByteArray(byte_array27, (int)(byte)10, (int)(short)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector30);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test040"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector3.putShort(10);
    ByteVector byteVector7 = byteVector3.putByte((int)'#');
    ByteVector byteVector9 = byteVector3.putInt((int)(short)10);
    ByteVector byteVector11 = byteVector3.putShort((int)(short)0);
    ByteVector byteVector13 = byteVector11.putUTF8("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test041"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector3.putShort(10);
    ByteVector byteVector7 = byteVector3.putByte((int)'#');
    ByteVector byteVector9 = byteVector3.putInt((int)(short)10);
    ByteVector byteVector11 = byteVector3.putInt((int)(byte)0);
    ByteVector byteVector13 = new ByteVector((int)(short)1);
    ByteVector byteVector15 = byteVector13.putUTF8("hi!");
    ByteVector byteVector17 = byteVector13.putUTF8("");
    ByteVector byteVector19 = byteVector17.putLong(0L);
    ByteVector byteVector21 = byteVector19.putShort((int)(byte)100);
    ByteVector byteVector23 = byteVector19.putByte((int)(byte)100);
    ByteVector byteVector25 = byteVector19.putByte(100);
    ByteVector byteVector27 = byteVector19.putUTF8("hi!");
    byte[] byte_array31 = new byte[] { (byte)10, (byte)1, (byte)1 };
    ByteVector byteVector34 = byteVector19.putByteArray(byte_array31, 0, 0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector37 = byteVector3.putByteArray(byte_array31, (int)' ', (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector34);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test042"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector1.putLong((long)'a');
    ByteVector byteVector7 = byteVector1.putLong((long)(byte)0);
    ByteVector byteVector9 = byteVector7.putByte((int)'a');
    ByteVector byteVector11 = new ByteVector((int)(short)1);
    ByteVector byteVector13 = byteVector11.putUTF8("hi!");
    ByteVector byteVector15 = byteVector11.putUTF8("");
    ByteVector byteVector17 = byteVector15.putLong(0L);
    ByteVector byteVector19 = byteVector17.putShort((int)(byte)100);
    ByteVector byteVector21 = byteVector17.putByte((int)(byte)100);
    ByteVector byteVector23 = byteVector17.putByte(100);
    ByteVector byteVector25 = byteVector17.putUTF8("hi!");
    byte[] byte_array29 = new byte[] { (byte)10, (byte)1, (byte)1 };
    ByteVector byteVector32 = byteVector17.putByteArray(byte_array29, 0, 0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector35 = byteVector9.putByteArray(byte_array29, (int)'#', (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector32);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test043"); }


    ByteVector byteVector1 = new ByteVector((int)(byte)100);
    byte[] byte_array7 = new byte[] { (byte)100, (byte)10, (byte)-1, (byte)100, (byte)1 };
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(byte)0, (int)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test044"); }


    ByteVector byteVector1 = new ByteVector((int)'a');
    byte[] byte_array3 = new byte[] { (byte)-1 };
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector6 = byteVector1.putByteArray(byte_array3, 100, 1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array3);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test045"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector5.putByte((int)'#');
    ByteVector byteVector9 = byteVector7.putUTF8("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test046"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector5.putLong(0L);
    ByteVector byteVector9 = byteVector7.putShort((int)(byte)100);
    ByteVector byteVector11 = byteVector7.putByte((int)(byte)100);
    ByteVector byteVector13 = byteVector7.putByte(100);
    ByteVector byteVector15 = byteVector7.putUTF8("hi!");
    byte[] byte_array19 = new byte[] { (byte)10, (byte)1, (byte)1 };
    ByteVector byteVector22 = byteVector7.putByteArray(byte_array19, 0, 0);
    ByteVector byteVector24 = byteVector7.putByte((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector24);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test047"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector3.putUTF8("hi!");
    byte[] byte_array8 = new byte[] { (byte)100, (byte)0 };
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector11 = byteVector3.putByteArray(byte_array8, (int)(short)0, (int)(short)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array8);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test048"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector1.putLong((long)'a');
    ByteVector byteVector7 = byteVector1.putLong((long)(byte)0);
    ByteVector byteVector9 = byteVector7.putLong((long)(byte)-1);
    ByteVector byteVector11 = byteVector9.putShort((int)(byte)10);
    ByteVector byteVector13 = byteVector9.putInt(100);
    ByteVector byteVector15 = byteVector13.putLong((long)(short)100);
    ByteVector byteVector17 = byteVector15.putShort((int)'4');
    ByteVector byteVector19 = byteVector15.putByte(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test049"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector1.putShort((int)(byte)1);
    ByteVector byteVector9 = byteVector1.putInt(10);
    ByteVector byteVector11 = new ByteVector((int)(short)1);
    ByteVector byteVector13 = byteVector11.putUTF8("");
    ByteVector byteVector15 = byteVector11.putLong((long)'a');
    ByteVector byteVector17 = byteVector15.putUTF8("");
    ByteVector byteVector19 = byteVector17.putShort((int)(short)1);
    byte[] byte_array26 = new byte[] { (byte)1, (byte)1, (byte)-1, (byte)10, (byte)0, (byte)-1 };
    ByteVector byteVector29 = byteVector19.putByteArray(byte_array26, (int)(short)1, 0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector32 = byteVector9.putByteArray(byte_array26, (int)' ', (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector29);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test050"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector5.putLong(0L);
    ByteVector byteVector9 = byteVector7.putByte((int)(byte)1);
    ByteVector byteVector11 = byteVector7.putLong((long)(short)0);
    ByteVector byteVector13 = byteVector7.putLong((long)10);
    byte[] byte_array20 = new byte[] { (byte)-1, (byte)10, (byte)0, (byte)100, (byte)100, (byte)1 };
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector23 = byteVector13.putByteArray(byte_array20, (int)(short)0, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array20);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test051"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector5.putLong(0L);
    ByteVector byteVector9 = byteVector5.putByte((-1));
    ByteVector byteVector11 = byteVector5.putShort(0);
    ByteVector byteVector13 = byteVector11.putUTF8("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test052"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector3.putShort(10);
    ByteVector byteVector7 = byteVector3.putByte((int)'#');
    ByteVector byteVector9 = byteVector3.putInt((int)(byte)1);
    ByteVector byteVector11 = byteVector3.putLong(0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test053"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector5.putLong(0L);
    ByteVector byteVector9 = byteVector5.putByte((-1));
    ByteVector byteVector11 = byteVector5.putShort(0);
    ByteVector byteVector13 = byteVector5.putUTF8("hi!");
    ByteVector byteVector15 = byteVector13.putLong((long)(byte)0);
    ByteVector byteVector17 = byteVector15.putLong((long)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test054"); }


    ByteVector byteVector1 = new ByteVector((int)(byte)1);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test055"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector1.putLong((long)'a');
    ByteVector byteVector7 = byteVector5.putUTF8("");
    ByteVector byteVector9 = byteVector7.putShort((int)(short)1);
    ByteVector byteVector11 = byteVector7.putInt((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test056"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector1.putLong((long)0);
    ByteVector byteVector7 = byteVector5.putUTF8("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test057"); }


    ByteVector byteVector1 = new ByteVector((int)'#');
    ByteVector byteVector3 = byteVector1.putByte(0);
    ByteVector byteVector5 = byteVector3.putShort(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test058"); }


    ByteVector byteVector1 = new ByteVector((int)'4');

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test059"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector3.putShort(10);
    ByteVector byteVector7 = byteVector3.putByte((int)'#');
    ByteVector byteVector9 = byteVector3.putInt((int)(short)10);
    ByteVector byteVector11 = byteVector9.putInt((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test060"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector5.putLong(0L);
    ByteVector byteVector9 = byteVector7.putByte((int)(byte)1);
    ByteVector byteVector11 = byteVector7.putLong((long)(short)0);
    ByteVector byteVector13 = byteVector7.putLong((long)10);
    ByteVector byteVector15 = byteVector13.putUTF8("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test061"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putByte(10);
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector5.putInt((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test062"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector1.putLong((long)'a');
    ByteVector byteVector7 = byteVector1.putLong((long)(byte)0);
    ByteVector byteVector9 = byteVector7.putLong((long)(byte)-1);
    ByteVector byteVector11 = byteVector7.putUTF8("");
    ByteVector byteVector13 = byteVector11.putUTF8("");
    ByteVector byteVector15 = new ByteVector((int)(short)1);
    ByteVector byteVector17 = byteVector15.putUTF8("hi!");
    ByteVector byteVector19 = byteVector15.putUTF8("");
    ByteVector byteVector21 = byteVector19.putLong(0L);
    ByteVector byteVector23 = byteVector21.putShort((int)(byte)100);
    ByteVector byteVector25 = byteVector21.putByte((int)(byte)100);
    ByteVector byteVector27 = byteVector21.putByte(100);
    ByteVector byteVector29 = byteVector21.putUTF8("hi!");
    byte[] byte_array33 = new byte[] { (byte)10, (byte)1, (byte)1 };
    ByteVector byteVector36 = byteVector21.putByteArray(byte_array33, 0, 0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector39 = byteVector11.putByteArray(byte_array33, 0, (int)(short)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector36);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test063"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector1.putLong((long)'a');
    ByteVector byteVector7 = byteVector5.putUTF8("");
    ByteVector byteVector9 = byteVector7.putShort((int)(short)1);
    byte[] byte_array16 = new byte[] { (byte)1, (byte)1, (byte)-1, (byte)10, (byte)0, (byte)-1 };
    ByteVector byteVector19 = byteVector9.putByteArray(byte_array16, (int)(short)1, 0);
    ByteVector byteVector21 = new ByteVector((int)(short)1);
    ByteVector byteVector23 = byteVector21.putUTF8("");
    ByteVector byteVector25 = byteVector21.putLong((long)'a');
    ByteVector byteVector27 = byteVector25.putUTF8("");
    ByteVector byteVector29 = byteVector27.putShort((int)(short)1);
    byte[] byte_array36 = new byte[] { (byte)1, (byte)1, (byte)-1, (byte)10, (byte)0, (byte)-1 };
    ByteVector byteVector39 = byteVector29.putByteArray(byte_array36, (int)(short)1, 0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector42 = byteVector9.putByteArray(byte_array36, (-1), (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector39);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test064"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putByte(10);
    ByteVector byteVector5 = byteVector3.putUTF8("");
    ByteVector byteVector7 = byteVector3.putShort((int)(byte)-1);
    ByteVector byteVector9 = byteVector3.putUTF8("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test065"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putLong((long)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test066"); }


    ByteVector byteVector1 = new ByteVector((int)(byte)100);
    ByteVector byteVector3 = byteVector1.putShort((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test067"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = new ByteVector((int)(short)1);
    ByteVector byteVector5 = byteVector3.putUTF8("hi!");
    ByteVector byteVector7 = byteVector3.putUTF8("");
    ByteVector byteVector9 = byteVector7.putLong(0L);
    ByteVector byteVector11 = byteVector9.putShort((int)(byte)100);
    ByteVector byteVector13 = byteVector9.putByte((int)(byte)100);
    ByteVector byteVector15 = byteVector9.putByte(100);
    ByteVector byteVector17 = byteVector9.putUTF8("hi!");
    byte[] byte_array21 = new byte[] { (byte)10, (byte)1, (byte)1 };
    ByteVector byteVector24 = byteVector9.putByteArray(byte_array21, 0, 0);
    ByteVector byteVector27 = byteVector1.putByteArray(byte_array21, (int)(short)1, 0);
    ByteVector byteVector29 = byteVector27.putByte((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector29);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test068"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector5.putLong(0L);
    ByteVector byteVector9 = byteVector7.putByte((int)(byte)1);
    ByteVector byteVector11 = byteVector7.putUTF8("");
    ByteVector byteVector13 = byteVector11.putByte(10);
    ByteVector byteVector15 = byteVector13.putLong(10L);
    ByteVector byteVector17 = byteVector15.putLong((long)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test069"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector1.putLong((long)'a');
    ByteVector byteVector7 = byteVector1.putLong((long)(byte)0);
    ByteVector byteVector9 = byteVector7.putLong((long)(byte)-1);
    ByteVector byteVector11 = byteVector9.putShort((int)(byte)10);
    ByteVector byteVector13 = new ByteVector((int)(short)1);
    ByteVector byteVector15 = byteVector13.putUTF8("");
    ByteVector byteVector17 = byteVector13.putLong((long)'a');
    ByteVector byteVector19 = byteVector17.putUTF8("");
    ByteVector byteVector21 = byteVector19.putShort((int)(short)1);
    ByteVector byteVector23 = new ByteVector((int)(short)1);
    ByteVector byteVector25 = byteVector23.putUTF8("hi!");
    ByteVector byteVector27 = byteVector23.putUTF8("");
    ByteVector byteVector29 = byteVector27.putLong(0L);
    ByteVector byteVector31 = byteVector29.putShort((int)(byte)100);
    ByteVector byteVector33 = byteVector29.putByte((int)(byte)100);
    ByteVector byteVector35 = byteVector29.putByte(100);
    ByteVector byteVector37 = byteVector29.putUTF8("hi!");
    byte[] byte_array41 = new byte[] { (byte)10, (byte)1, (byte)1 };
    ByteVector byteVector44 = byteVector29.putByteArray(byte_array41, 0, 0);
    ByteVector byteVector47 = byteVector21.putByteArray(byte_array41, 1, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector50 = byteVector9.putByteArray(byte_array41, (int)(short)0, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector47);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test070"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector1.putLong((long)'a');
    ByteVector byteVector7 = byteVector1.putLong((long)(byte)0);
    ByteVector byteVector9 = byteVector7.putLong((long)(byte)-1);
    ByteVector byteVector11 = byteVector9.putShort((int)(byte)10);
    ByteVector byteVector13 = byteVector11.putUTF8("");
    ByteVector byteVector15 = byteVector11.putUTF8("");
    ByteVector byteVector17 = byteVector11.putInt(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test071"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector3.putUTF8("hi!");
    ByteVector byteVector7 = byteVector3.putInt((int)(byte)1);
    ByteVector byteVector9 = byteVector3.putInt((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test072"); }


    ByteVector byteVector1 = new ByteVector((int)'#');
    ByteVector byteVector3 = byteVector1.putByte(0);
    ByteVector byteVector5 = new ByteVector((int)(short)1);
    ByteVector byteVector7 = byteVector5.putUTF8("");
    ByteVector byteVector9 = byteVector5.putLong((long)'a');
    ByteVector byteVector11 = byteVector9.putUTF8("");
    ByteVector byteVector13 = byteVector11.putShort((int)(short)1);
    ByteVector byteVector15 = new ByteVector((int)(short)1);
    ByteVector byteVector17 = byteVector15.putUTF8("hi!");
    ByteVector byteVector19 = byteVector15.putUTF8("");
    ByteVector byteVector21 = byteVector19.putLong(0L);
    ByteVector byteVector23 = byteVector21.putShort((int)(byte)100);
    ByteVector byteVector25 = byteVector21.putByte((int)(byte)100);
    ByteVector byteVector27 = byteVector21.putByte(100);
    ByteVector byteVector29 = byteVector21.putUTF8("hi!");
    byte[] byte_array33 = new byte[] { (byte)10, (byte)1, (byte)1 };
    ByteVector byteVector36 = byteVector21.putByteArray(byte_array33, 0, 0);
    ByteVector byteVector39 = byteVector13.putByteArray(byte_array33, 1, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector42 = byteVector3.putByteArray(byte_array33, (-1), (int)(short)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector39);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test073"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector5.putLong(0L);
    ByteVector byteVector9 = byteVector5.putByte((-1));
    ByteVector byteVector11 = byteVector5.putShort(0);
    ByteVector byteVector13 = byteVector5.putUTF8("hi!");
    ByteVector byteVector15 = byteVector13.putLong((long)(byte)0);
    ByteVector byteVector17 = new ByteVector((int)(short)1);
    ByteVector byteVector19 = byteVector17.putUTF8("hi!");
    ByteVector byteVector21 = byteVector17.putUTF8("");
    ByteVector byteVector23 = byteVector21.putLong(0L);
    ByteVector byteVector25 = byteVector23.putShort((int)(byte)100);
    ByteVector byteVector27 = byteVector23.putByte((int)(byte)100);
    ByteVector byteVector29 = byteVector23.putByte(100);
    ByteVector byteVector31 = byteVector23.putUTF8("hi!");
    byte[] byte_array35 = new byte[] { (byte)10, (byte)1, (byte)1 };
    ByteVector byteVector38 = byteVector23.putByteArray(byte_array35, 0, 0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector41 = byteVector13.putByteArray(byte_array35, (int)(byte)10, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector38);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test074"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector3.putShort(10);
    ByteVector byteVector7 = byteVector3.putByte((int)'#');
    ByteVector byteVector9 = byteVector7.putLong((long)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test075"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector1.putLong((long)'a');
    ByteVector byteVector7 = byteVector1.putLong((long)(byte)0);
    ByteVector byteVector9 = byteVector1.putInt(100);
    ByteVector byteVector11 = byteVector1.putByte(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test076"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector3.putShort(10);
    ByteVector byteVector7 = byteVector3.putByte((int)'#');
    ByteVector byteVector9 = byteVector3.putInt((int)(byte)1);
    ByteVector byteVector11 = byteVector9.putLong((long)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test077"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector3.putShort(10);
    ByteVector byteVector7 = byteVector5.putInt((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test078"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putByte(10);
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putByte((int)'4');
    ByteVector byteVector9 = byteVector1.putInt((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test079"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector3.putShort(10);
    ByteVector byteVector7 = byteVector3.putByte((int)'#');
    ByteVector byteVector9 = byteVector3.putInt((int)(short)10);
    ByteVector byteVector11 = byteVector3.putInt((int)(byte)0);
    ByteVector byteVector13 = byteVector11.putInt((int)(short)100);
    ByteVector byteVector15 = byteVector13.putShort(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test080"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector1.putShort((int)(byte)1);
    ByteVector byteVector9 = byteVector1.putLong((long)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test081"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector1.putLong((long)'a');
    ByteVector byteVector7 = byteVector1.putLong((long)(byte)0);
    ByteVector byteVector9 = byteVector7.putByte((int)'a');
    ByteVector byteVector11 = byteVector7.putShort((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test082"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putInt(0);
    ByteVector byteVector5 = byteVector3.putUTF8("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test083"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector5.putLong(0L);
    ByteVector byteVector9 = byteVector7.putByte((int)(byte)1);
    ByteVector byteVector11 = byteVector7.putLong((long)(short)0);
    ByteVector byteVector13 = byteVector7.putLong((long)'#');
    ByteVector byteVector15 = byteVector7.putInt((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test084"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'a');
    ByteVector byteVector5 = byteVector3.putShort(10);
    ByteVector byteVector7 = byteVector5.putShort((int)(short)-1);
    ByteVector byteVector9 = byteVector5.putInt((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test085"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector3.putUTF8("hi!");
    ByteVector byteVector7 = new ByteVector((int)(short)1);
    ByteVector byteVector9 = byteVector7.putUTF8("");
    ByteVector byteVector11 = byteVector7.putLong((long)'a');
    ByteVector byteVector13 = byteVector11.putUTF8("");
    ByteVector byteVector15 = byteVector13.putShort((int)(short)1);
    ByteVector byteVector17 = new ByteVector((int)(short)1);
    ByteVector byteVector19 = byteVector17.putUTF8("hi!");
    ByteVector byteVector21 = byteVector17.putUTF8("");
    ByteVector byteVector23 = byteVector21.putLong(0L);
    ByteVector byteVector25 = byteVector23.putShort((int)(byte)100);
    ByteVector byteVector27 = byteVector23.putByte((int)(byte)100);
    ByteVector byteVector29 = byteVector23.putByte(100);
    ByteVector byteVector31 = byteVector23.putUTF8("hi!");
    byte[] byte_array35 = new byte[] { (byte)10, (byte)1, (byte)1 };
    ByteVector byteVector38 = byteVector23.putByteArray(byte_array35, 0, 0);
    ByteVector byteVector41 = byteVector15.putByteArray(byte_array35, 1, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector44 = byteVector3.putByteArray(byte_array35, (int)(byte)10, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector41);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test086"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector5.putShort(1);
    ByteVector byteVector9 = byteVector7.putByte((int)(byte)100);
    ByteVector byteVector11 = byteVector7.putUTF8("");
    ByteVector byteVector13 = byteVector7.putShort((int)(short)-1);
    ByteVector byteVector15 = byteVector7.putShort((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test087"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector5.putLong((long)10);
    ByteVector byteVector9 = byteVector5.putLong((-1L));
    ByteVector byteVector11 = byteVector5.putInt(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test088"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'a');
    ByteVector byteVector5 = byteVector3.putShort(10);
    ByteVector byteVector7 = byteVector5.putUTF8("");
    ByteVector byteVector9 = byteVector5.putByte((int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test089"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector5.putLong(0L);
    ByteVector byteVector9 = byteVector5.putByte((-1));
    byte[] byte_array10 = null;
    ByteVector byteVector13 = byteVector9.putByteArray(byte_array10, 1, (-1));
    ByteVector byteVector15 = byteVector9.putByte((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test090"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector5.putLong(0L);
    ByteVector byteVector9 = byteVector7.putShort((int)(byte)100);
    ByteVector byteVector11 = byteVector9.putUTF8("hi!");
    ByteVector byteVector13 = byteVector11.putInt(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test091"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector5.putLong(0L);
    ByteVector byteVector9 = byteVector7.putShort((int)(byte)100);
    ByteVector byteVector11 = byteVector7.putByte((int)(byte)100);
    ByteVector byteVector13 = byteVector7.putByte(100);
    ByteVector byteVector15 = byteVector7.putUTF8("hi!");
    ByteVector byteVector17 = byteVector15.putByte((int)'4');
    ByteVector byteVector19 = byteVector15.putLong((long)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test092"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector5.putLong(0L);
    ByteVector byteVector9 = byteVector7.putShort((int)(byte)100);
    ByteVector byteVector11 = byteVector7.putByte((int)(byte)100);
    ByteVector byteVector13 = byteVector7.putByte(100);
    ByteVector byteVector15 = byteVector7.putUTF8("hi!");
    ByteVector byteVector17 = byteVector15.putUTF8("");
    ByteVector byteVector19 = byteVector15.putByte((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test093"); }


    ByteVector byteVector1 = new ByteVector((int)(byte)100);
    ByteVector byteVector3 = byteVector1.putShort((int)' ');
    ByteVector byteVector5 = byteVector1.putUTF8("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test094"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector5.putShort(1);
    ByteVector byteVector9 = byteVector7.putByte((int)(byte)100);
    ByteVector byteVector11 = byteVector7.putUTF8("");
    ByteVector byteVector13 = byteVector7.putLong((-1L));
    ByteVector byteVector15 = byteVector7.putShort((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test095"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector1.putLong((long)'a');
    ByteVector byteVector7 = byteVector5.putUTF8("");
    ByteVector byteVector9 = byteVector7.putUTF8("");
    ByteVector byteVector11 = byteVector7.putUTF8("");
    ByteVector byteVector13 = byteVector11.putUTF8("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test096"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'a');
    ByteVector byteVector5 = byteVector3.putLong((long)(byte)100);
    ByteVector byteVector7 = byteVector3.putShort(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test097"); }


    ByteVector byteVector1 = new ByteVector(1);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test098"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector5.putInt((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test099"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector5.putLong(0L);
    ByteVector byteVector9 = byteVector5.putByte((-1));
    byte[] byte_array10 = null;
    ByteVector byteVector13 = byteVector9.putByteArray(byte_array10, 1, (-1));
    ByteVector byteVector15 = byteVector13.putInt((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test100"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector1.putLong((long)'a');
    ByteVector byteVector7 = byteVector5.putUTF8("");
    ByteVector byteVector9 = byteVector7.putShort((int)(short)1);
    byte[] byte_array16 = new byte[] { (byte)1, (byte)1, (byte)-1, (byte)10, (byte)0, (byte)-1 };
    ByteVector byteVector19 = byteVector9.putByteArray(byte_array16, (int)(short)1, 0);
    ByteVector byteVector21 = byteVector9.putUTF8("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test101"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = new ByteVector((int)(short)1);
    ByteVector byteVector7 = byteVector5.putUTF8("");
    ByteVector byteVector9 = byteVector5.putLong((long)'a');
    ByteVector byteVector11 = byteVector9.putUTF8("");
    ByteVector byteVector13 = byteVector11.putShort((int)(short)1);
    ByteVector byteVector15 = new ByteVector((int)(short)1);
    ByteVector byteVector17 = byteVector15.putUTF8("hi!");
    ByteVector byteVector19 = byteVector15.putUTF8("");
    ByteVector byteVector21 = byteVector19.putLong(0L);
    ByteVector byteVector23 = byteVector21.putShort((int)(byte)100);
    ByteVector byteVector25 = byteVector21.putByte((int)(byte)100);
    ByteVector byteVector27 = byteVector21.putByte(100);
    ByteVector byteVector29 = byteVector21.putUTF8("hi!");
    byte[] byte_array33 = new byte[] { (byte)10, (byte)1, (byte)1 };
    ByteVector byteVector36 = byteVector21.putByteArray(byte_array33, 0, 0);
    ByteVector byteVector39 = byteVector13.putByteArray(byte_array33, 1, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector42 = byteVector1.putByteArray(byte_array33, 0, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector39);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test102"); }


    ByteVector byteVector1 = new ByteVector((int)'a');
    ByteVector byteVector3 = byteVector1.putLong(0L);
    ByteVector byteVector5 = new ByteVector((int)(short)1);
    ByteVector byteVector7 = byteVector5.putUTF8("");
    ByteVector byteVector9 = byteVector5.putLong((long)'a');
    ByteVector byteVector11 = byteVector9.putUTF8("");
    ByteVector byteVector13 = byteVector11.putShort((int)(short)1);
    ByteVector byteVector15 = new ByteVector((int)(short)1);
    ByteVector byteVector17 = byteVector15.putUTF8("hi!");
    ByteVector byteVector19 = byteVector15.putUTF8("");
    ByteVector byteVector21 = byteVector19.putLong(0L);
    ByteVector byteVector23 = byteVector21.putShort((int)(byte)100);
    ByteVector byteVector25 = byteVector21.putByte((int)(byte)100);
    ByteVector byteVector27 = byteVector21.putByte(100);
    ByteVector byteVector29 = byteVector21.putUTF8("hi!");
    byte[] byte_array33 = new byte[] { (byte)10, (byte)1, (byte)1 };
    ByteVector byteVector36 = byteVector21.putByteArray(byte_array33, 0, 0);
    ByteVector byteVector39 = byteVector13.putByteArray(byte_array33, 1, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector42 = byteVector3.putByteArray(byte_array33, (int)(short)10, (int)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector39);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test103"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector5.putLong(0L);
    ByteVector byteVector9 = byteVector5.putByte((-1));
    ByteVector byteVector11 = byteVector5.putShort(0);
    ByteVector byteVector13 = byteVector5.putUTF8("hi!");
    ByteVector byteVector15 = byteVector13.putLong((long)(byte)0);
    ByteVector byteVector17 = byteVector15.putInt((int)(short)0);
    ByteVector byteVector19 = byteVector15.putByte((int)(byte)0);
    ByteVector byteVector21 = byteVector19.putShort((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test104"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector1.putLong((long)'a');
    ByteVector byteVector7 = byteVector1.putLong((long)(byte)0);
    ByteVector byteVector9 = byteVector7.putLong((long)(byte)-1);
    ByteVector byteVector11 = byteVector7.putUTF8("");
    ByteVector byteVector13 = byteVector11.putShort(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test105"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector5.putLong(0L);
    ByteVector byteVector9 = byteVector7.putByte((int)(byte)1);
    ByteVector byteVector11 = byteVector9.putUTF8("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test106"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector1.putLong((long)'a');
    ByteVector byteVector7 = byteVector1.putLong((long)(byte)0);
    ByteVector byteVector9 = byteVector7.putByte((int)'a');
    ByteVector byteVector11 = byteVector9.putInt((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test107"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'a');
    ByteVector byteVector5 = byteVector3.putShort(10);
    ByteVector byteVector7 = byteVector5.putShort((int)(short)-1);
    ByteVector byteVector9 = byteVector5.putShort((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test108"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector5.putLong((long)(short)0);
    ByteVector byteVector9 = byteVector5.putLong((long)(short)0);
    ByteVector byteVector11 = byteVector5.putUTF8("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test109"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector3.putShort(10);
    ByteVector byteVector7 = byteVector3.putByte((int)'#');
    ByteVector byteVector9 = byteVector3.putInt((int)(byte)1);
    ByteVector byteVector11 = byteVector9.putLong(100L);
    ByteVector byteVector13 = byteVector11.putByte((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test110"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector1.putLong((long)'a');
    ByteVector byteVector7 = byteVector5.putUTF8("");
    ByteVector byteVector9 = byteVector7.putShort((int)(short)1);
    byte[] byte_array16 = new byte[] { (byte)1, (byte)1, (byte)-1, (byte)10, (byte)0, (byte)-1 };
    ByteVector byteVector19 = byteVector9.putByteArray(byte_array16, (int)(short)1, 0);
    ByteVector byteVector21 = byteVector19.putUTF8("hi!");
    ByteVector byteVector23 = byteVector19.putShort(0);
    ByteVector byteVector25 = new ByteVector((int)(short)1);
    ByteVector byteVector27 = byteVector25.putUTF8("");
    ByteVector byteVector29 = byteVector25.putLong((long)'a');
    ByteVector byteVector31 = byteVector29.putUTF8("");
    ByteVector byteVector33 = byteVector31.putShort((int)(short)1);
    ByteVector byteVector35 = new ByteVector((int)(short)1);
    ByteVector byteVector37 = byteVector35.putUTF8("hi!");
    ByteVector byteVector39 = byteVector35.putUTF8("");
    ByteVector byteVector41 = byteVector39.putLong(0L);
    ByteVector byteVector43 = byteVector41.putShort((int)(byte)100);
    ByteVector byteVector45 = byteVector41.putByte((int)(byte)100);
    ByteVector byteVector47 = byteVector41.putByte(100);
    ByteVector byteVector49 = byteVector41.putUTF8("hi!");
    byte[] byte_array53 = new byte[] { (byte)10, (byte)1, (byte)1 };
    ByteVector byteVector56 = byteVector41.putByteArray(byte_array53, 0, 0);
    ByteVector byteVector59 = byteVector33.putByteArray(byte_array53, 1, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector62 = byteVector23.putByteArray(byte_array53, (int)(byte)10, (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector59);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test111"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector1.putShort(1);
    ByteVector byteVector9 = byteVector7.putUTF8("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test112"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector1.putShort((int)(byte)1);
    ByteVector byteVector9 = byteVector1.putInt(10);
    ByteVector byteVector11 = byteVector9.putInt((int)'a');
    ByteVector byteVector13 = byteVector9.putLong((long)(short)1);
    ByteVector byteVector15 = byteVector9.putShort(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test113"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector1.putShort((int)(byte)1);
    ByteVector byteVector9 = byteVector1.putInt(10);
    ByteVector byteVector11 = byteVector1.putUTF8("hi!");
    ByteVector byteVector13 = byteVector1.putLong((long)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test114"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector1.putShort((int)(byte)1);
    ByteVector byteVector9 = byteVector1.putUTF8("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test115"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector1.putLong((long)'a');
    ByteVector byteVector7 = byteVector1.putLong((long)(byte)0);
    ByteVector byteVector9 = byteVector7.putLong((long)(byte)-1);
    ByteVector byteVector11 = byteVector9.putShort((int)(byte)10);
    ByteVector byteVector13 = byteVector9.putInt(100);
    ByteVector byteVector15 = byteVector13.putLong((long)(short)100);
    ByteVector byteVector17 = byteVector15.putShort((int)'4');
    ByteVector byteVector19 = byteVector17.putInt((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test116"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putByte(10);
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putLong((long)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test117"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector5.putLong(0L);
    ByteVector byteVector9 = byteVector5.putByte((-1));
    ByteVector byteVector11 = byteVector5.putShort(0);
    ByteVector byteVector13 = byteVector5.putUTF8("hi!");
    ByteVector byteVector15 = byteVector13.putLong((long)(byte)0);
    ByteVector byteVector17 = byteVector15.putInt((int)(short)0);
    ByteVector byteVector19 = byteVector15.putInt((int)(byte)1);
    ByteVector byteVector21 = byteVector19.putShort(100);
    ByteVector byteVector23 = byteVector19.putShort((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test118"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector5.putLong(0L);
    ByteVector byteVector9 = byteVector7.putByte((int)(byte)1);
    ByteVector byteVector11 = byteVector7.putUTF8("");
    ByteVector byteVector13 = new ByteVector((int)(short)1);
    ByteVector byteVector15 = byteVector13.putUTF8("");
    ByteVector byteVector17 = byteVector13.putLong((long)'a');
    ByteVector byteVector19 = byteVector17.putUTF8("");
    ByteVector byteVector21 = byteVector19.putShort((int)(short)1);
    ByteVector byteVector23 = new ByteVector((int)(short)1);
    ByteVector byteVector25 = byteVector23.putUTF8("hi!");
    ByteVector byteVector27 = byteVector23.putUTF8("");
    ByteVector byteVector29 = byteVector27.putLong(0L);
    ByteVector byteVector31 = byteVector29.putShort((int)(byte)100);
    ByteVector byteVector33 = byteVector29.putByte((int)(byte)100);
    ByteVector byteVector35 = byteVector29.putByte(100);
    ByteVector byteVector37 = byteVector29.putUTF8("hi!");
    byte[] byte_array41 = new byte[] { (byte)10, (byte)1, (byte)1 };
    ByteVector byteVector44 = byteVector29.putByteArray(byte_array41, 0, 0);
    ByteVector byteVector47 = byteVector21.putByteArray(byte_array41, 1, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector50 = byteVector7.putByteArray(byte_array41, (int)(byte)1, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector47);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test119"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putByte(10);
    ByteVector byteVector5 = byteVector3.putUTF8("");
    ByteVector byteVector7 = byteVector3.putShort((int)(byte)-1);
    ByteVector byteVector9 = byteVector7.putLong(10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test120"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putShort((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test121"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector1.putLong((long)'a');
    ByteVector byteVector7 = byteVector1.putLong((long)(byte)0);
    ByteVector byteVector9 = byteVector1.putByte(0);
    ByteVector byteVector11 = byteVector9.putInt((int)(short)10);
    ByteVector byteVector13 = byteVector9.putByte((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test122"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector5.putLong(0L);
    ByteVector byteVector9 = byteVector7.putByte((int)(byte)1);
    ByteVector byteVector11 = byteVector7.putLong((long)1);
    ByteVector byteVector13 = byteVector7.putUTF8("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test123"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector5.putLong(0L);
    ByteVector byteVector9 = byteVector7.putShort((int)(byte)100);
    ByteVector byteVector11 = byteVector7.putByte((int)(byte)100);
    ByteVector byteVector13 = byteVector7.putByte(100);
    ByteVector byteVector15 = byteVector13.putLong(0L);
    ByteVector byteVector17 = byteVector15.putLong(100L);
    ByteVector byteVector19 = byteVector15.putUTF8("");
    ByteVector byteVector21 = byteVector19.putByte((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test124"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector1.putLong((long)'a');
    ByteVector byteVector7 = byteVector1.putLong((long)(byte)0);
    ByteVector byteVector9 = byteVector7.putShort((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test125"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putInt(0);
    ByteVector byteVector5 = new ByteVector((int)(short)1);
    ByteVector byteVector7 = byteVector5.putUTF8("hi!");
    ByteVector byteVector9 = byteVector5.putUTF8("");
    ByteVector byteVector11 = byteVector9.putLong(0L);
    ByteVector byteVector13 = byteVector11.putShort((int)(byte)100);
    ByteVector byteVector15 = byteVector11.putByte((int)(byte)100);
    ByteVector byteVector17 = byteVector11.putByte(100);
    ByteVector byteVector19 = byteVector11.putUTF8("hi!");
    byte[] byte_array23 = new byte[] { (byte)10, (byte)1, (byte)1 };
    ByteVector byteVector26 = byteVector11.putByteArray(byte_array23, 0, 0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector29 = byteVector3.putByteArray(byte_array23, 10, (int)(short)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector26);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test126"); }


    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector1 = new ByteVector((int)(short)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NegativeArraySizeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test127"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector3.putShort(10);
    ByteVector byteVector7 = byteVector3.putByte((int)'#');
    ByteVector byteVector9 = byteVector3.putInt((int)(short)10);
    ByteVector byteVector11 = byteVector3.putInt((int)(byte)0);
    ByteVector byteVector13 = byteVector11.putInt((int)(short)100);
    ByteVector byteVector15 = byteVector13.putUTF8("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test128"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector1.putLong((long)'a');
    ByteVector byteVector7 = byteVector1.putLong((long)(byte)0);
    ByteVector byteVector9 = byteVector7.putByte((int)'a');
    ByteVector byteVector11 = byteVector7.putUTF8("");
    ByteVector byteVector13 = byteVector11.putLong((long)(byte)10);
    ByteVector byteVector15 = byteVector13.putShort(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test129"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector5.putLong((long)(short)0);
    ByteVector byteVector9 = byteVector5.putLong((long)(short)0);
    ByteVector byteVector11 = byteVector5.putUTF8("hi!");
    ByteVector byteVector13 = byteVector11.putShort((int)(byte)-1);
    ByteVector byteVector15 = byteVector13.putByte((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test130"); }


    ByteVector byteVector1 = new ByteVector(100);
    ByteVector byteVector3 = byteVector1.putInt((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test131"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector5.putLong(0L);
    ByteVector byteVector9 = byteVector5.putByte((-1));
    byte[] byte_array10 = null;
    ByteVector byteVector13 = byteVector9.putByteArray(byte_array10, 1, (-1));
    ByteVector byteVector15 = byteVector13.putLong((long)(short)-1);
    ByteVector byteVector17 = byteVector15.putUTF8("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test132"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector3.putShort(10);
    ByteVector byteVector7 = byteVector3.putByte((int)'#');
    ByteVector byteVector9 = byteVector3.putInt((int)(short)10);
    ByteVector byteVector11 = byteVector3.putShort((int)(short)0);
    ByteVector byteVector13 = byteVector3.putInt((int)(short)-1);
    ByteVector byteVector15 = byteVector13.putShort((int)(short)0);
    ByteVector byteVector17 = byteVector15.putByte((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test133"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector5.putLong(0L);
    ByteVector byteVector9 = byteVector7.putByte((int)(byte)1);
    ByteVector byteVector11 = byteVector7.putLong((long)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test134"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putInt(0);
    ByteVector byteVector5 = byteVector1.putByte((int)(byte)0);
    ByteVector byteVector7 = byteVector5.putLong((long)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test135"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector5.putLong(0L);
    ByteVector byteVector9 = byteVector7.putShort((int)(byte)100);
    ByteVector byteVector11 = byteVector7.putByte((int)(byte)100);
    ByteVector byteVector13 = byteVector7.putByte(100);
    ByteVector byteVector15 = byteVector7.putUTF8("hi!");
    byte[] byte_array19 = new byte[] { (byte)10, (byte)1, (byte)1 };
    ByteVector byteVector22 = byteVector7.putByteArray(byte_array19, 0, 0);
    ByteVector byteVector24 = byteVector22.putLong(0L);
    ByteVector byteVector26 = new ByteVector((int)(short)1);
    ByteVector byteVector28 = byteVector26.putUTF8("");
    ByteVector byteVector30 = byteVector26.putLong((long)'a');
    ByteVector byteVector32 = byteVector30.putUTF8("");
    ByteVector byteVector34 = byteVector32.putShort((int)(short)1);
    ByteVector byteVector36 = new ByteVector((int)(short)1);
    ByteVector byteVector38 = byteVector36.putUTF8("hi!");
    ByteVector byteVector40 = byteVector36.putUTF8("");
    ByteVector byteVector42 = byteVector40.putLong(0L);
    ByteVector byteVector44 = byteVector42.putShort((int)(byte)100);
    ByteVector byteVector46 = byteVector42.putByte((int)(byte)100);
    ByteVector byteVector48 = byteVector42.putByte(100);
    ByteVector byteVector50 = byteVector42.putUTF8("hi!");
    byte[] byte_array54 = new byte[] { (byte)10, (byte)1, (byte)1 };
    ByteVector byteVector57 = byteVector42.putByteArray(byte_array54, 0, 0);
    ByteVector byteVector60 = byteVector34.putByteArray(byte_array54, 1, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector63 = byteVector22.putByteArray(byte_array54, (int)'4', (int)(short)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector60);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test136"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putInt(0);
    ByteVector byteVector5 = byteVector1.putByte((int)(byte)0);
    ByteVector byteVector7 = byteVector5.putLong((long)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test137"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putShort((int)(byte)100);
    ByteVector byteVector7 = byteVector5.putUTF8("");
    ByteVector byteVector9 = byteVector5.putShort((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test138"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector1.putShort(1);
    ByteVector byteVector9 = byteVector7.putShort((int)(short)10);
    ByteVector byteVector11 = byteVector7.putLong((long)1);
    ByteVector byteVector13 = byteVector7.putInt((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test139"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector5.putShort(1);
    ByteVector byteVector9 = byteVector7.putByte((int)(byte)100);
    ByteVector byteVector11 = byteVector7.putUTF8("");
    ByteVector byteVector13 = byteVector7.putShort((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test140"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector1.putShort(1);
    ByteVector byteVector9 = byteVector7.putByte((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test141"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector5.putLong(0L);
    ByteVector byteVector9 = byteVector5.putByte((-1));
    ByteVector byteVector11 = byteVector5.putShort(0);
    ByteVector byteVector13 = byteVector5.putUTF8("hi!");
    ByteVector byteVector15 = byteVector13.putLong((long)(byte)0);
    ByteVector byteVector17 = byteVector15.putInt((int)(short)0);
    ByteVector byteVector19 = byteVector15.putInt((int)(byte)1);
    byte[] byte_array23 = new byte[] { (byte)100, (byte)-1, (byte)10 };
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector26 = byteVector15.putByteArray(byte_array23, 100, (int)(byte)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array23);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test142"); }


    ByteVector byteVector1 = new ByteVector(100);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test143"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector5.putShort(1);
    ByteVector byteVector9 = byteVector7.putByte((int)(byte)100);
    ByteVector byteVector11 = byteVector7.putUTF8("");
    ByteVector byteVector13 = byteVector7.putShort((int)(short)-1);
    ByteVector byteVector15 = new ByteVector((int)(short)1);
    ByteVector byteVector17 = byteVector15.putUTF8("");
    ByteVector byteVector19 = byteVector15.putLong((long)'a');
    ByteVector byteVector21 = byteVector19.putUTF8("");
    ByteVector byteVector23 = byteVector21.putShort((int)(short)1);
    byte[] byte_array30 = new byte[] { (byte)1, (byte)1, (byte)-1, (byte)10, (byte)0, (byte)-1 };
    ByteVector byteVector33 = byteVector23.putByteArray(byte_array30, (int)(short)1, 0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector36 = byteVector13.putByteArray(byte_array30, 100, (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector33);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test144"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector5.putLong(0L);
    ByteVector byteVector9 = byteVector5.putByte((-1));
    ByteVector byteVector11 = byteVector5.putShort(0);
    ByteVector byteVector13 = byteVector5.putUTF8("hi!");
    ByteVector byteVector15 = byteVector13.putLong((long)(byte)0);
    ByteVector byteVector17 = byteVector13.putLong(10L);
    ByteVector byteVector19 = new ByteVector((int)(short)1);
    ByteVector byteVector21 = byteVector19.putUTF8("");
    ByteVector byteVector23 = byteVector19.putLong((long)'a');
    ByteVector byteVector25 = byteVector23.putUTF8("");
    ByteVector byteVector27 = byteVector25.putShort((int)(short)1);
    ByteVector byteVector29 = new ByteVector((int)(short)1);
    ByteVector byteVector31 = byteVector29.putUTF8("hi!");
    ByteVector byteVector33 = byteVector29.putUTF8("");
    ByteVector byteVector35 = byteVector33.putLong(0L);
    ByteVector byteVector37 = byteVector35.putShort((int)(byte)100);
    ByteVector byteVector39 = byteVector35.putByte((int)(byte)100);
    ByteVector byteVector41 = byteVector35.putByte(100);
    ByteVector byteVector43 = byteVector35.putUTF8("hi!");
    byte[] byte_array47 = new byte[] { (byte)10, (byte)1, (byte)1 };
    ByteVector byteVector50 = byteVector35.putByteArray(byte_array47, 0, 0);
    ByteVector byteVector53 = byteVector27.putByteArray(byte_array47, 1, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector56 = byteVector13.putByteArray(byte_array47, 0, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector53);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test145"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector5.putLong(0L);
    ByteVector byteVector9 = byteVector5.putByte((-1));
    ByteVector byteVector11 = byteVector5.putShort(0);
    ByteVector byteVector13 = byteVector5.putUTF8("hi!");
    ByteVector byteVector15 = byteVector13.putLong((long)(byte)0);
    ByteVector byteVector17 = byteVector15.putInt((int)(short)0);
    ByteVector byteVector19 = byteVector15.putInt((int)(byte)1);
    ByteVector byteVector21 = byteVector19.putShort(100);
    byte[] byte_array22 = new byte[] {  };
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector25 = byteVector19.putByteArray(byte_array22, (int)(byte)-1, 0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array22);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test146"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector1.putLong((long)'a');
    ByteVector byteVector7 = byteVector5.putUTF8("");
    ByteVector byteVector9 = byteVector7.putShort((int)(short)1);
    byte[] byte_array16 = new byte[] { (byte)1, (byte)1, (byte)-1, (byte)10, (byte)0, (byte)-1 };
    ByteVector byteVector19 = byteVector9.putByteArray(byte_array16, (int)(short)1, 0);
    ByteVector byteVector21 = byteVector9.putUTF8("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test147"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector1.putLong((long)'a');
    ByteVector byteVector7 = byteVector1.putLong((long)(byte)0);
    ByteVector byteVector9 = byteVector1.putInt((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test148"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector5.putLong(0L);
    ByteVector byteVector9 = byteVector5.putByte((-1));
    ByteVector byteVector11 = byteVector5.putShort(0);
    ByteVector byteVector13 = byteVector5.putUTF8("hi!");
    ByteVector byteVector15 = byteVector13.putLong((long)(byte)0);
    ByteVector byteVector17 = byteVector15.putInt((int)(short)0);
    ByteVector byteVector19 = byteVector15.putInt((int)(byte)1);
    ByteVector byteVector21 = byteVector19.putInt(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test149"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector5.putShort(1);
    ByteVector byteVector9 = byteVector7.putByte((int)(byte)100);
    ByteVector byteVector11 = byteVector7.putUTF8("");
    ByteVector byteVector13 = byteVector7.putInt(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test150"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'a');
    ByteVector byteVector5 = byteVector3.putLong((long)(byte)100);
    ByteVector byteVector7 = byteVector3.putByte((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test151"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector5.putLong(0L);
    ByteVector byteVector9 = byteVector7.putShort((int)(byte)100);
    ByteVector byteVector11 = byteVector7.putByte((int)(byte)100);
    ByteVector byteVector13 = byteVector7.putByte(100);
    ByteVector byteVector15 = byteVector7.putUTF8("hi!");
    ByteVector byteVector17 = byteVector15.putUTF8("");
    ByteVector byteVector19 = byteVector17.putInt((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test152"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector1.putLong((long)'a');
    ByteVector byteVector7 = byteVector1.putLong((long)(byte)0);
    ByteVector byteVector9 = byteVector7.putLong((long)(byte)-1);
    ByteVector byteVector11 = byteVector7.putUTF8("");
    ByteVector byteVector13 = byteVector11.putUTF8("");
    ByteVector byteVector15 = byteVector11.putInt(100);
    ByteVector byteVector17 = byteVector15.putInt((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test153"); }


    ByteVector byteVector1 = new ByteVector((int)(byte)10);
    ByteVector byteVector3 = new ByteVector(0);
    ByteVector byteVector5 = new ByteVector((int)(short)1);
    ByteVector byteVector7 = byteVector5.putUTF8("hi!");
    ByteVector byteVector9 = byteVector5.putUTF8("");
    ByteVector byteVector11 = byteVector9.putLong(0L);
    ByteVector byteVector13 = byteVector11.putShort((int)(byte)100);
    ByteVector byteVector15 = byteVector11.putByte((int)(byte)100);
    ByteVector byteVector17 = byteVector11.putByte(100);
    ByteVector byteVector19 = byteVector11.putUTF8("hi!");
    byte[] byte_array23 = new byte[] { (byte)10, (byte)1, (byte)1 };
    ByteVector byteVector26 = byteVector11.putByteArray(byte_array23, 0, 0);
    ByteVector byteVector29 = byteVector3.putByteArray(byte_array23, (int)(short)1, 0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector32 = byteVector1.putByteArray(byte_array23, (int)' ', 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector29);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test154"); }


    ByteVector byteVector1 = new ByteVector((int)(short)0);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector3.putInt((int)'a');
    ByteVector byteVector7 = new ByteVector(0);
    ByteVector byteVector9 = new ByteVector((int)(short)1);
    ByteVector byteVector11 = byteVector9.putUTF8("hi!");
    ByteVector byteVector13 = byteVector9.putUTF8("");
    ByteVector byteVector15 = byteVector13.putLong(0L);
    ByteVector byteVector17 = byteVector15.putShort((int)(byte)100);
    ByteVector byteVector19 = byteVector15.putByte((int)(byte)100);
    ByteVector byteVector21 = byteVector15.putByte(100);
    ByteVector byteVector23 = byteVector15.putUTF8("hi!");
    byte[] byte_array27 = new byte[] { (byte)10, (byte)1, (byte)1 };
    ByteVector byteVector30 = byteVector15.putByteArray(byte_array27, 0, 0);
    ByteVector byteVector33 = byteVector7.putByteArray(byte_array27, (int)(short)1, 0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector36 = byteVector3.putByteArray(byte_array27, (int)'a', 0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector33);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test155"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putByte(10);
    ByteVector byteVector5 = byteVector1.putShort((int)'a');
    ByteVector byteVector7 = byteVector1.putInt((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test156"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector5.putLong(0L);
    ByteVector byteVector9 = byteVector7.putByte((int)(byte)1);
    ByteVector byteVector11 = byteVector7.putShort((int)'#');
    ByteVector byteVector13 = byteVector11.putUTF8("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test157"); }


    ByteVector byteVector1 = new ByteVector((int)(short)0);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector3.putInt((int)'a');
    ByteVector byteVector7 = byteVector5.putLong((long)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test158"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector5.putLong(0L);
    ByteVector byteVector9 = byteVector7.putByte((int)(byte)1);
    ByteVector byteVector11 = byteVector7.putLong((long)(short)0);
    ByteVector byteVector13 = byteVector7.putLong((long)'#');
    ByteVector byteVector15 = byteVector13.putByte((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test159"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putByte(10);
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector5.putByte((int)'#');
    ByteVector byteVector9 = byteVector7.putUTF8("");
    byte[] byte_array14 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)-1 };
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector17 = byteVector7.putByteArray(byte_array14, 0, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array14);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test160"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector5.putLong(0L);
    ByteVector byteVector9 = byteVector7.putShort((int)(byte)100);
    ByteVector byteVector11 = byteVector7.putLong((long)(short)-1);
    ByteVector byteVector13 = byteVector7.putInt((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test161"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector5.putLong(0L);
    ByteVector byteVector9 = byteVector7.putShort((int)(byte)100);
    ByteVector byteVector11 = byteVector7.putByte((int)(byte)100);
    ByteVector byteVector13 = byteVector7.putByte(100);
    ByteVector byteVector15 = byteVector13.putLong(0L);
    ByteVector byteVector17 = byteVector15.putLong(100L);
    ByteVector byteVector19 = byteVector17.putLong((long)(-1));
    ByteVector byteVector21 = byteVector19.putInt((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test162"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector3.putShort(10);
    ByteVector byteVector7 = byteVector3.putByte((int)'#');
    ByteVector byteVector9 = byteVector3.putInt((int)(short)10);
    ByteVector byteVector11 = byteVector3.putInt((int)(byte)0);
    ByteVector byteVector13 = byteVector11.putByte((int)(short)-1);
    ByteVector byteVector15 = byteVector11.putUTF8("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test163"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector1.putLong((long)'a');
    ByteVector byteVector7 = byteVector5.putUTF8("");
    ByteVector byteVector9 = byteVector7.putShort((int)(short)1);
    ByteVector byteVector11 = new ByteVector((int)(short)1);
    ByteVector byteVector13 = byteVector11.putUTF8("hi!");
    ByteVector byteVector15 = byteVector11.putUTF8("");
    ByteVector byteVector17 = byteVector15.putLong(0L);
    ByteVector byteVector19 = byteVector17.putShort((int)(byte)100);
    ByteVector byteVector21 = byteVector17.putByte((int)(byte)100);
    ByteVector byteVector23 = byteVector17.putByte(100);
    ByteVector byteVector25 = byteVector17.putUTF8("hi!");
    byte[] byte_array29 = new byte[] { (byte)10, (byte)1, (byte)1 };
    ByteVector byteVector32 = byteVector17.putByteArray(byte_array29, 0, 0);
    ByteVector byteVector35 = byteVector9.putByteArray(byte_array29, 1, (int)(short)1);
    ByteVector byteVector37 = byteVector9.putUTF8("");
    ByteVector byteVector39 = byteVector9.putUTF8("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector39);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test164"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector1.putLong((long)'a');
    ByteVector byteVector7 = byteVector5.putByte((int)'#');
    ByteVector byteVector9 = byteVector5.putShort((int)(short)100);
    ByteVector byteVector11 = byteVector5.putInt((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test165"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector1.putShort(1);
    ByteVector byteVector9 = byteVector7.putShort((int)(short)10);
    ByteVector byteVector11 = byteVector7.putLong((long)1);
    ByteVector byteVector13 = byteVector11.putInt((int)(byte)100);
    ByteVector byteVector15 = new ByteVector((int)(short)1);
    ByteVector byteVector17 = byteVector15.putUTF8("hi!");
    ByteVector byteVector19 = byteVector15.putUTF8("");
    ByteVector byteVector21 = byteVector19.putLong(0L);
    ByteVector byteVector23 = byteVector21.putShort((int)(byte)100);
    ByteVector byteVector25 = byteVector21.putByte((int)(byte)100);
    ByteVector byteVector27 = byteVector21.putByte(100);
    ByteVector byteVector29 = byteVector21.putUTF8("hi!");
    byte[] byte_array33 = new byte[] { (byte)10, (byte)1, (byte)1 };
    ByteVector byteVector36 = byteVector21.putByteArray(byte_array33, 0, 0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector39 = byteVector11.putByteArray(byte_array33, (int)(short)10, (int)(short)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector36);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test166"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector5.putLong(0L);
    ByteVector byteVector9 = byteVector5.putByte((-1));
    ByteVector byteVector11 = byteVector5.putShort(0);
    ByteVector byteVector13 = byteVector5.putUTF8("hi!");
    ByteVector byteVector15 = byteVector13.putLong((long)(byte)0);
    ByteVector byteVector17 = byteVector15.putInt((int)(short)0);
    ByteVector byteVector19 = byteVector15.putByte((int)(byte)0);
    ByteVector byteVector21 = new ByteVector((int)(short)1);
    ByteVector byteVector23 = byteVector21.putUTF8("hi!");
    ByteVector byteVector25 = byteVector21.putUTF8("");
    ByteVector byteVector27 = byteVector25.putLong(0L);
    ByteVector byteVector29 = byteVector27.putShort((int)(byte)100);
    ByteVector byteVector31 = byteVector27.putByte((int)(byte)100);
    ByteVector byteVector33 = byteVector27.putByte(100);
    ByteVector byteVector35 = byteVector27.putUTF8("hi!");
    byte[] byte_array39 = new byte[] { (byte)10, (byte)1, (byte)1 };
    ByteVector byteVector42 = byteVector27.putByteArray(byte_array39, 0, 0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector45 = byteVector19.putByteArray(byte_array39, (int)'4', (int)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector42);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test167"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector5.putLong(0L);
    ByteVector byteVector9 = byteVector7.putByte((int)(byte)1);
    ByteVector byteVector11 = byteVector7.putLong((long)(short)0);
    ByteVector byteVector13 = byteVector7.putLong((long)'#');
    ByteVector byteVector15 = byteVector7.putLong((long)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test168"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector5.putInt((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test169"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector5.putLong(0L);
    ByteVector byteVector9 = byteVector7.putShort((int)(byte)100);
    ByteVector byteVector11 = byteVector7.putByte((int)(byte)100);
    ByteVector byteVector13 = byteVector7.putByte(100);
    ByteVector byteVector15 = byteVector7.putUTF8("hi!");
    byte[] byte_array19 = new byte[] { (byte)10, (byte)1, (byte)1 };
    ByteVector byteVector22 = byteVector7.putByteArray(byte_array19, 0, 0);
    ByteVector byteVector24 = byteVector22.putInt((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector24);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test170"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector5.putLong(0L);
    ByteVector byteVector9 = byteVector7.putShort((int)(byte)100);
    ByteVector byteVector11 = byteVector7.putByte((int)(byte)100);
    ByteVector byteVector13 = byteVector7.putByte(100);
    ByteVector byteVector15 = byteVector13.putLong(0L);
    ByteVector byteVector17 = byteVector13.putShort((int)(byte)100);
    ByteVector byteVector19 = byteVector17.putInt(100);
    ByteVector byteVector21 = byteVector19.putUTF8("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test171"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector5.putLong(0L);
    ByteVector byteVector9 = byteVector5.putByte((-1));
    ByteVector byteVector11 = byteVector5.putShort(0);
    ByteVector byteVector13 = byteVector5.putUTF8("hi!");
    ByteVector byteVector15 = byteVector13.putLong((long)(byte)0);
    ByteVector byteVector17 = byteVector13.putLong(10L);
    ByteVector byteVector19 = byteVector17.putUTF8("hi!");
    ByteVector byteVector21 = byteVector19.putInt((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test172"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector1.putLong((long)'a');
    ByteVector byteVector7 = byteVector5.putUTF8("");
    ByteVector byteVector9 = byteVector7.putShort((int)(short)1);
    byte[] byte_array16 = new byte[] { (byte)1, (byte)1, (byte)-1, (byte)10, (byte)0, (byte)-1 };
    ByteVector byteVector19 = byteVector9.putByteArray(byte_array16, (int)(short)1, 0);
    ByteVector byteVector21 = byteVector19.putUTF8("hi!");
    ByteVector byteVector23 = byteVector21.putInt((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test173"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector1.putLong((long)'a');
    ByteVector byteVector7 = byteVector1.putLong((long)(byte)0);
    ByteVector byteVector9 = byteVector7.putLong((long)(byte)-1);
    ByteVector byteVector11 = byteVector9.putShort((int)(byte)10);
    ByteVector byteVector13 = byteVector9.putInt(100);
    ByteVector byteVector15 = byteVector13.putLong((long)(short)100);
    ByteVector byteVector17 = new ByteVector((int)(short)1);
    ByteVector byteVector19 = byteVector17.putUTF8("");
    ByteVector byteVector21 = byteVector17.putLong((long)'a');
    ByteVector byteVector23 = byteVector21.putUTF8("");
    ByteVector byteVector25 = byteVector23.putShort((int)(short)1);
    byte[] byte_array32 = new byte[] { (byte)1, (byte)1, (byte)-1, (byte)10, (byte)0, (byte)-1 };
    ByteVector byteVector35 = byteVector25.putByteArray(byte_array32, (int)(short)1, 0);
    ByteVector byteVector38 = byteVector15.putByteArray(byte_array32, 0, (int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector38);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test174"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector5.putLong(0L);
    ByteVector byteVector9 = byteVector5.putByte((-1));
    ByteVector byteVector11 = byteVector5.putShort(0);
    ByteVector byteVector13 = byteVector5.putUTF8("hi!");
    ByteVector byteVector15 = byteVector13.putLong((long)(byte)0);
    ByteVector byteVector17 = byteVector15.putInt((int)(short)0);
    ByteVector byteVector19 = byteVector15.putByte((int)(byte)0);
    ByteVector byteVector21 = byteVector19.putLong(0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test175"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector5.putLong(0L);
    ByteVector byteVector9 = byteVector7.putShort((int)(byte)100);
    ByteVector byteVector11 = byteVector7.putLong((long)(short)-1);
    ByteVector byteVector13 = byteVector11.putInt(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test176"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector5.putLong(0L);
    ByteVector byteVector9 = byteVector7.putShort((int)(byte)100);
    ByteVector byteVector11 = byteVector7.putByte((int)(byte)100);
    ByteVector byteVector13 = byteVector7.putByte(100);
    ByteVector byteVector15 = byteVector7.putUTF8("hi!");
    ByteVector byteVector17 = byteVector7.putShort((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test177"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector5.putShort(1);
    ByteVector byteVector9 = byteVector7.putUTF8("");
    ByteVector byteVector11 = byteVector9.putByte((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test178"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = new ByteVector((int)(short)1);
    ByteVector byteVector5 = byteVector3.putUTF8("hi!");
    ByteVector byteVector7 = byteVector3.putUTF8("");
    ByteVector byteVector9 = byteVector7.putLong(0L);
    ByteVector byteVector11 = byteVector9.putShort((int)(byte)100);
    ByteVector byteVector13 = byteVector9.putByte((int)(byte)100);
    ByteVector byteVector15 = byteVector9.putByte(100);
    ByteVector byteVector17 = byteVector9.putUTF8("hi!");
    byte[] byte_array21 = new byte[] { (byte)10, (byte)1, (byte)1 };
    ByteVector byteVector24 = byteVector9.putByteArray(byte_array21, 0, 0);
    ByteVector byteVector27 = byteVector1.putByteArray(byte_array21, (int)(short)1, 0);
    ByteVector byteVector29 = byteVector1.putByte((int)(byte)1);
    ByteVector byteVector31 = byteVector1.putInt((int)(byte)-1);
    ByteVector byteVector33 = byteVector31.putLong((long)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector33);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test179"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'a');
    ByteVector byteVector5 = byteVector3.putShort(10);
    ByteVector byteVector7 = byteVector5.putShort((int)(short)-1);
    ByteVector byteVector9 = byteVector7.putLong((long)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test180"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector1.putLong((long)'a');
    ByteVector byteVector7 = byteVector5.putUTF8("");
    ByteVector byteVector9 = byteVector7.putShort((int)(short)1);
    byte[] byte_array16 = new byte[] { (byte)1, (byte)1, (byte)-1, (byte)10, (byte)0, (byte)-1 };
    ByteVector byteVector19 = byteVector9.putByteArray(byte_array16, (int)(short)1, 0);
    ByteVector byteVector21 = byteVector19.putUTF8("hi!");
    ByteVector byteVector23 = byteVector19.putInt((int)(short)10);
    ByteVector byteVector25 = byteVector23.putLong((long)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector25);

  }

}
