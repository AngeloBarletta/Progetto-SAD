
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
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    byte[] byte_array8 = new byte[] { (byte)-1, (byte)10, (byte)10, (byte)1 };
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector11 = byteVector1.putByteArray(byte_array8, 0, 100);
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
    org.junit.Assert.assertNotNull(byte_array8);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test002"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    byte[] byte_array9 = new byte[] { (byte)10, (byte)0, (byte)1 };
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector12 = byteVector5.putByteArray(byte_array9, 100, 10);
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
    org.junit.Assert.assertNotNull(byte_array9);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test003"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    byte[] byte_array7 = new byte[] { (byte)-1 };
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(short)0, (int)(byte)0);
    ByteVector byteVector12 = new ByteVector((int)(short)1);
    ByteVector byteVector14 = byteVector12.putLong((long)'#');
    ByteVector byteVector16 = byteVector12.putInt((int)' ');
    byte[] byte_array18 = new byte[] { (byte)-1 };
    ByteVector byteVector21 = byteVector12.putByteArray(byte_array18, (int)(short)0, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector24 = byteVector10.putByteArray(byte_array18, (int)(byte)10, (-1));
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
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test004"); }


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
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test005"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector5.putInt((int)(byte)0);
    ByteVector byteVector9 = new ByteVector((int)(short)1);
    ByteVector byteVector11 = byteVector9.putLong((long)'#');
    ByteVector byteVector13 = byteVector9.putInt((int)' ');
    byte[] byte_array15 = new byte[] { (byte)-1 };
    ByteVector byteVector18 = byteVector9.putByteArray(byte_array15, (int)(short)0, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector21 = byteVector5.putByteArray(byte_array15, 0, (int)' ');
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
    org.junit.Assert.assertNotNull(byte_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test006"); }


    ByteVector byteVector1 = new ByteVector((int)' ');

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test007"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    ByteVector byteVector7 = new ByteVector((int)(short)1);
    ByteVector byteVector9 = byteVector7.putLong((long)'#');
    ByteVector byteVector11 = byteVector7.putInt((int)' ');
    byte[] byte_array13 = new byte[] { (byte)-1 };
    ByteVector byteVector16 = byteVector7.putByteArray(byte_array13, (int)(short)0, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector19 = byteVector1.putByteArray(byte_array13, (int)'4', 1);
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
    org.junit.Assert.assertNotNull(byte_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test008"); }


    ByteVector byteVector1 = new ByteVector((int)(short)10);
    ByteVector byteVector3 = new ByteVector((int)(short)1);
    ByteVector byteVector5 = byteVector3.putLong((long)'#');
    ByteVector byteVector7 = byteVector3.putInt((int)' ');
    byte[] byte_array9 = new byte[] { (byte)-1 };
    ByteVector byteVector12 = byteVector3.putByteArray(byte_array9, (int)(short)0, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector15 = byteVector1.putByteArray(byte_array9, (int)'4', 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test009"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector3.putShort((int)'4');
    ByteVector byteVector7 = new ByteVector((int)(short)1);
    ByteVector byteVector9 = byteVector7.putLong((long)'#');
    ByteVector byteVector11 = byteVector7.putInt((int)' ');
    byte[] byte_array13 = new byte[] { (byte)-1 };
    ByteVector byteVector16 = byteVector7.putByteArray(byte_array13, (int)(short)0, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector19 = byteVector5.putByteArray(byte_array13, (int)(byte)0, 100);
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
    org.junit.Assert.assertNotNull(byte_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test010"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putShort((int)'#');
    ByteVector byteVector5 = new ByteVector((int)(short)1);
    ByteVector byteVector7 = byteVector5.putLong((long)'#');
    ByteVector byteVector9 = byteVector5.putInt((int)' ');
    byte[] byte_array11 = new byte[] { (byte)-1 };
    ByteVector byteVector14 = byteVector5.putByteArray(byte_array11, (int)(short)0, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector17 = byteVector1.putByteArray(byte_array11, (int)(short)0, (int)(short)10);
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
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test011"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    byte[] byte_array7 = new byte[] { (byte)-1 };
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(short)0, (int)(byte)0);
    ByteVector byteVector12 = byteVector1.putUTF8("hi!");
    ByteVector byteVector14 = new ByteVector((int)(short)1);
    ByteVector byteVector16 = byteVector14.putLong((long)'#');
    ByteVector byteVector18 = byteVector14.putInt((int)' ');
    byte[] byte_array20 = new byte[] { (byte)-1 };
    ByteVector byteVector23 = byteVector14.putByteArray(byte_array20, (int)(short)0, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector26 = byteVector1.putByteArray(byte_array20, (int)(short)-1, 0);
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
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test012"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector3.putByte((int)' ');
    ByteVector byteVector7 = byteVector3.putShort(0);
    ByteVector byteVector9 = new ByteVector((int)(short)1);
    ByteVector byteVector11 = byteVector9.putLong((long)'#');
    ByteVector byteVector13 = byteVector9.putInt((int)' ');
    byte[] byte_array15 = new byte[] { (byte)-1 };
    ByteVector byteVector18 = byteVector9.putByteArray(byte_array15, (int)(short)0, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector21 = byteVector3.putByteArray(byte_array15, (int)(byte)1, (int)'4');
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
    org.junit.Assert.assertNotNull(byte_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test013"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector7.putUTF8("hi!");
    ByteVector byteVector11 = new ByteVector((int)(short)1);
    ByteVector byteVector13 = byteVector11.putLong((long)'#');
    ByteVector byteVector15 = byteVector11.putInt((int)' ');
    byte[] byte_array17 = new byte[] { (byte)-1 };
    ByteVector byteVector20 = byteVector11.putByteArray(byte_array17, (int)(short)0, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector23 = byteVector9.putByteArray(byte_array17, (int)(byte)1, (int)'#');
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
    org.junit.Assert.assertNotNull(byte_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test014"); }


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
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test015"); }


    ByteVector byteVector1 = new ByteVector(1);
    ByteVector byteVector3 = byteVector1.putByte((int)' ');
    ByteVector byteVector5 = new ByteVector((int)(short)1);
    ByteVector byteVector7 = byteVector5.putLong((long)'#');
    ByteVector byteVector9 = byteVector5.putInt((int)' ');
    byte[] byte_array11 = new byte[] { (byte)-1 };
    ByteVector byteVector14 = byteVector5.putByteArray(byte_array11, (int)(short)0, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector17 = byteVector3.putByteArray(byte_array11, (int)(short)100, (int)'4');
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
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test016"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    byte[] byte_array7 = new byte[] { (byte)-1 };
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(short)0, (int)(byte)0);
    ByteVector byteVector12 = byteVector1.putUTF8("hi!");
    ByteVector byteVector14 = byteVector1.putLong((long)(short)1);
    ByteVector byteVector16 = byteVector1.putShort((int)(byte)1);
    ByteVector byteVector18 = byteVector1.putByte(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test017"); }


    ByteVector byteVector1 = new ByteVector(100);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test018"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector3.putByte((int)' ');
    ByteVector byteVector7 = byteVector3.putShort(0);
    ByteVector byteVector9 = new ByteVector((int)(short)1);
    ByteVector byteVector11 = byteVector9.putLong((long)'#');
    ByteVector byteVector13 = byteVector9.putInt((int)' ');
    byte[] byte_array15 = new byte[] { (byte)-1 };
    ByteVector byteVector18 = byteVector9.putByteArray(byte_array15, (int)(short)0, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector21 = byteVector3.putByteArray(byte_array15, 10, (int)'a');
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
    org.junit.Assert.assertNotNull(byte_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test019"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putInt((int)(short)0);
    ByteVector byteVector13 = new ByteVector((int)(short)1);
    ByteVector byteVector15 = byteVector13.putLong((long)'#');
    ByteVector byteVector17 = byteVector13.putInt((int)' ');
    byte[] byte_array19 = new byte[] { (byte)-1 };
    ByteVector byteVector22 = byteVector13.putByteArray(byte_array19, (int)(short)0, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector25 = byteVector9.putByteArray(byte_array19, (int)(byte)1, 100);
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
    org.junit.Assert.assertNotNull(byte_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector22);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test020"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putInt((int)(short)0);
    ByteVector byteVector13 = byteVector9.putByte((int)(byte)-1);
    ByteVector byteVector15 = byteVector13.putLong((long)(short)10);
    
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
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test021"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector3.putByte((int)' ');
    ByteVector byteVector7 = byteVector5.putUTF8("");
    ByteVector byteVector9 = byteVector7.putLong((long)'a');
    ByteVector byteVector11 = byteVector7.putShort((int)(byte)-1);
    
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
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test022"); }


    ByteVector byteVector1 = new ByteVector((int)(byte)1);
    ByteVector byteVector3 = new ByteVector((int)(short)1);
    ByteVector byteVector5 = byteVector3.putLong((long)'#');
    ByteVector byteVector7 = byteVector3.putInt((int)' ');
    byte[] byte_array9 = new byte[] { (byte)-1 };
    ByteVector byteVector12 = byteVector3.putByteArray(byte_array9, (int)(short)0, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector15 = byteVector1.putByteArray(byte_array9, (-1), (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test023"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    byte[] byte_array7 = new byte[] { (byte)-1 };
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(short)0, (int)(byte)0);
    ByteVector byteVector12 = byteVector1.putInt((int)' ');
    byte[] byte_array18 = new byte[] { (byte)100, (byte)-1, (byte)100, (byte)-1, (byte)-1 };
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector21 = byteVector12.putByteArray(byte_array18, (-1), 100);
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
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array18);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test024"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    byte[] byte_array7 = new byte[] { (byte)-1 };
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(short)0, (int)(byte)0);
    ByteVector byteVector12 = byteVector1.putInt((int)' ');
    ByteVector byteVector14 = new ByteVector((int)(short)1);
    ByteVector byteVector16 = byteVector14.putLong((long)'#');
    ByteVector byteVector18 = byteVector14.putInt(0);
    ByteVector byteVector20 = byteVector14.putShort((int)(short)10);
    ByteVector byteVector22 = new ByteVector((int)(short)1);
    ByteVector byteVector24 = byteVector22.putLong((long)'#');
    ByteVector byteVector26 = byteVector22.putInt((int)' ');
    byte[] byte_array28 = new byte[] { (byte)-1 };
    ByteVector byteVector31 = byteVector22.putByteArray(byte_array28, (int)(short)0, (int)(byte)0);
    ByteVector byteVector34 = byteVector20.putByteArray(byte_array28, 0, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector37 = byteVector1.putByteArray(byte_array28, 0, (int)'4');
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
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector34);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test025"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector3.putByte((int)' ');
    ByteVector byteVector7 = byteVector3.putShort(0);
    ByteVector byteVector9 = byteVector3.putInt((int)(short)100);
    ByteVector byteVector11 = new ByteVector((int)(short)1);
    ByteVector byteVector13 = byteVector11.putLong((long)'#');
    ByteVector byteVector15 = byteVector11.putInt((int)' ');
    byte[] byte_array17 = new byte[] { (byte)-1 };
    ByteVector byteVector20 = byteVector11.putByteArray(byte_array17, (int)(short)0, (int)(byte)0);
    ByteVector byteVector23 = byteVector3.putByteArray(byte_array17, (int)(byte)0, 0);
    ByteVector byteVector25 = new ByteVector((int)(short)1);
    ByteVector byteVector27 = byteVector25.putLong((long)'#');
    ByteVector byteVector29 = byteVector25.putInt((int)' ');
    byte[] byte_array31 = new byte[] { (byte)-1 };
    ByteVector byteVector34 = byteVector25.putByteArray(byte_array31, (int)(short)0, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector37 = byteVector23.putByteArray(byte_array31, (int)(byte)10, 10);
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
    org.junit.Assert.assertNotNull(byte_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector34);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test026"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    byte[] byte_array7 = new byte[] { (byte)-1 };
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(short)0, (int)(byte)0);
    ByteVector byteVector12 = byteVector1.putLong((long)10);
    ByteVector byteVector14 = byteVector12.putLong((long)(-1));
    ByteVector byteVector16 = new ByteVector((int)(short)1);
    ByteVector byteVector18 = byteVector16.putLong((long)'#');
    ByteVector byteVector20 = byteVector16.putInt(0);
    ByteVector byteVector22 = byteVector16.putShort((int)(short)10);
    ByteVector byteVector24 = new ByteVector((int)(short)1);
    ByteVector byteVector26 = byteVector24.putLong((long)'#');
    ByteVector byteVector28 = byteVector24.putInt((int)' ');
    byte[] byte_array30 = new byte[] { (byte)-1 };
    ByteVector byteVector33 = byteVector24.putByteArray(byte_array30, (int)(short)0, (int)(byte)0);
    ByteVector byteVector36 = byteVector22.putByteArray(byte_array30, 0, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector39 = byteVector14.putByteArray(byte_array30, 10, 1);
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
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector36);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test027"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    byte[] byte_array7 = new byte[] { (byte)-1 };
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(short)0, (int)(byte)0);
    ByteVector byteVector12 = byteVector10.putInt((int)(byte)10);
    ByteVector byteVector14 = byteVector12.putByte((int)(byte)-1);
    ByteVector byteVector16 = new ByteVector((int)(short)1);
    ByteVector byteVector18 = byteVector16.putLong((long)'#');
    ByteVector byteVector20 = byteVector16.putInt((int)' ');
    byte[] byte_array22 = new byte[] { (byte)-1 };
    ByteVector byteVector25 = byteVector16.putByteArray(byte_array22, (int)(short)0, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector28 = byteVector14.putByteArray(byte_array22, (int)(byte)100, (int)'a');
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
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector25);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test028"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    ByteVector byteVector7 = byteVector5.putShort(1);
    ByteVector byteVector9 = byteVector5.putLong((long)100);
    
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
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test029"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    ByteVector byteVector7 = byteVector1.putShort((int)(short)-1);
    ByteVector byteVector9 = byteVector7.putInt(0);
    
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
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test030"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector7.putUTF8("hi!");
    ByteVector byteVector11 = byteVector7.putUTF8("");
    
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


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    byte[] byte_array7 = new byte[] { (byte)-1 };
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(short)0, (int)(byte)0);
    ByteVector byteVector12 = byteVector10.putInt((int)(byte)10);
    ByteVector byteVector14 = byteVector10.putLong((long)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test032"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    ByteVector byteVector7 = byteVector5.putShort(1);
    ByteVector byteVector9 = byteVector5.putInt((int)(short)10);
    ByteVector byteVector11 = byteVector5.putUTF8("");
    byte[] byte_array17 = new byte[] { (byte)10, (byte)0, (byte)0, (byte)100, (byte)10 };
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector20 = byteVector11.putByteArray(byte_array17, (int)'#', (int)(byte)0);
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
    org.junit.Assert.assertNotNull(byte_array17);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test033"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putShort((int)'#');
    ByteVector byteVector5 = byteVector3.putByte(0);
    ByteVector byteVector7 = byteVector5.putUTF8("hi!");
    ByteVector byteVector9 = byteVector5.putShort((int)(byte)10);
    
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
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test034"); }


    ByteVector byteVector1 = new ByteVector(1);
    ByteVector byteVector3 = byteVector1.putLong((long)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test035"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    byte[] byte_array7 = new byte[] { (byte)-1 };
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(short)0, (int)(byte)0);
    ByteVector byteVector12 = byteVector1.putLong((long)10);
    ByteVector byteVector14 = byteVector12.putLong((long)(-1));
    byte[] byte_array15 = new byte[] {  };
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector18 = byteVector12.putByteArray(byte_array15, (int)'#', (int)(byte)0);
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
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array15);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test036"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    ByteVector byteVector7 = byteVector5.putShort(1);
    ByteVector byteVector9 = byteVector5.putInt((int)(short)10);
    ByteVector byteVector11 = byteVector9.putShort((int)(byte)100);
    
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
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test037"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    ByteVector byteVector7 = byteVector5.putShort(1);
    ByteVector byteVector9 = byteVector5.putInt((int)'#');
    ByteVector byteVector11 = byteVector5.putShort(0);
    
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
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test038"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    byte[] byte_array7 = new byte[] { (byte)-1 };
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(short)0, (int)(byte)0);
    ByteVector byteVector12 = byteVector1.putInt((int)' ');
    ByteVector byteVector14 = byteVector12.putByte((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test039"); }


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
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test040"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = new ByteVector((int)(short)1);
    ByteVector byteVector4 = byteVector2.putLong((long)'#');
    ByteVector byteVector6 = byteVector2.putInt(0);
    ByteVector byteVector8 = byteVector2.putShort((int)(short)10);
    ByteVector byteVector10 = byteVector2.putUTF8("hi!");
    ByteVector byteVector12 = byteVector2.putShort((int)(short)1);
    ByteVector byteVector14 = new ByteVector((int)'4');
    ByteVector byteVector16 = byteVector14.putByte((int)(byte)100);
    byte[] byte_array18 = new byte[] { (byte)-1 };
    ByteVector byteVector21 = byteVector16.putByteArray(byte_array18, (int)(byte)0, 1);
    ByteVector byteVector24 = byteVector2.putByteArray(byte_array18, 0, 0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector27 = byteVector0.putByteArray(byte_array18, (int)'#', (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector24);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test041"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = new ByteVector((int)(short)1);
    ByteVector byteVector11 = byteVector9.putLong((long)'#');
    ByteVector byteVector13 = byteVector9.putInt((int)' ');
    byte[] byte_array15 = new byte[] { (byte)-1 };
    ByteVector byteVector18 = byteVector9.putByteArray(byte_array15, (int)(short)0, (int)(byte)0);
    ByteVector byteVector21 = byteVector7.putByteArray(byte_array15, 0, (int)(short)1);
    ByteVector byteVector23 = new ByteVector((int)(short)1);
    ByteVector byteVector25 = byteVector23.putLong((long)'#');
    ByteVector byteVector27 = byteVector23.putInt(0);
    ByteVector byteVector29 = byteVector23.putShort((int)(short)10);
    ByteVector byteVector31 = byteVector23.putUTF8("hi!");
    ByteVector byteVector33 = byteVector23.putShort((int)(short)1);
    ByteVector byteVector35 = new ByteVector((int)'4');
    ByteVector byteVector37 = byteVector35.putByte((int)(byte)100);
    byte[] byte_array39 = new byte[] { (byte)-1 };
    ByteVector byteVector42 = byteVector37.putByteArray(byte_array39, (int)(byte)0, 1);
    ByteVector byteVector45 = byteVector23.putByteArray(byte_array39, 0, 0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector48 = byteVector7.putByteArray(byte_array39, (int)(short)10, (int)(short)0);
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
    org.junit.Assert.assertNotNull(byte_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);
    
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
    org.junit.Assert.assertNotNull(byteVector37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector45);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test042"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector3.putByte((int)' ');
    ByteVector byteVector7 = byteVector3.putShort(0);
    ByteVector byteVector9 = byteVector3.putInt((int)(short)100);
    ByteVector byteVector11 = byteVector3.putLong((long)'a');
    ByteVector byteVector13 = byteVector3.putUTF8("hi!");
    ByteVector byteVector15 = byteVector3.putInt((-1));
    
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
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test043"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector3.putByte((int)' ');
    ByteVector byteVector7 = byteVector5.putUTF8("");
    ByteVector byteVector9 = byteVector7.putLong((long)'a');
    ByteVector byteVector11 = byteVector9.putShort(100);
    
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
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test044"); }


    ByteVector byteVector1 = new ByteVector(1);
    ByteVector byteVector3 = byteVector1.putByte((int)' ');
    ByteVector byteVector5 = byteVector3.putShort((int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test045"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putInt((int)(short)0);
    ByteVector byteVector13 = byteVector9.putByte((int)(byte)-1);
    ByteVector byteVector15 = byteVector9.putLong((long)(short)10);
    
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
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test046"); }


    ByteVector byteVector1 = new ByteVector((int)(byte)100);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test047"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putInt((int)(short)0);
    ByteVector byteVector13 = byteVector9.putByte((int)(byte)-1);
    ByteVector byteVector15 = byteVector9.putUTF8("hi!");
    ByteVector byteVector17 = byteVector9.putLong((long)10);
    byte[] byte_array18 = null;
    ByteVector byteVector21 = byteVector9.putByteArray(byte_array18, (int)' ', (int)'#');
    ByteVector byteVector23 = byteVector21.putByte((int)' ');
    
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

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test048"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putInt((int)(short)0);
    ByteVector byteVector13 = byteVector9.putByte((int)(byte)-1);
    ByteVector byteVector15 = byteVector9.putUTF8("hi!");
    ByteVector byteVector17 = byteVector9.putLong((long)10);
    byte[] byte_array18 = null;
    ByteVector byteVector21 = byteVector9.putByteArray(byte_array18, (int)' ', (int)'#');
    ByteVector byteVector23 = new ByteVector((int)'4');
    ByteVector byteVector25 = byteVector23.putByte((int)(byte)100);
    byte[] byte_array27 = new byte[] { (byte)-1 };
    ByteVector byteVector30 = byteVector25.putByteArray(byte_array27, (int)(byte)0, 1);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector33 = byteVector9.putByteArray(byte_array27, 10, (int)(short)-1);
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
    org.junit.Assert.assertNotNull(byteVector25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector30);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test049"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putShort((int)(short)-1);
    ByteVector byteVector13 = byteVector9.putByte(1);
    ByteVector byteVector15 = byteVector9.putInt(0);
    ByteVector byteVector17 = byteVector15.putInt((int)(short)100);
    
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
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test050"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector3.putByte((int)' ');
    ByteVector byteVector7 = byteVector3.putShort(0);
    ByteVector byteVector9 = byteVector3.putInt((int)(short)100);
    ByteVector byteVector11 = new ByteVector((int)(short)1);
    ByteVector byteVector13 = byteVector11.putLong((long)'#');
    ByteVector byteVector15 = byteVector11.putInt((int)' ');
    byte[] byte_array17 = new byte[] { (byte)-1 };
    ByteVector byteVector20 = byteVector11.putByteArray(byte_array17, (int)(short)0, (int)(byte)0);
    ByteVector byteVector23 = byteVector3.putByteArray(byte_array17, (int)(byte)0, 0);
    ByteVector byteVector25 = byteVector23.putUTF8("hi!");
    
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
    org.junit.Assert.assertNotNull(byte_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector25);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test051"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    byte[] byte_array7 = new byte[] { (byte)-1 };
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(short)0, (int)(byte)0);
    ByteVector byteVector12 = new ByteVector((int)'4');
    ByteVector byteVector14 = byteVector12.putByte((int)(byte)100);
    byte[] byte_array16 = new byte[] { (byte)-1 };
    ByteVector byteVector19 = byteVector14.putByteArray(byte_array16, (int)(byte)0, 1);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector22 = byteVector1.putByteArray(byte_array16, (int)'4', (-1));
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
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test052"); }


    ByteVector byteVector1 = new ByteVector((int)(short)0);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test053"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putShort((int)'#');
    ByteVector byteVector5 = new ByteVector((int)(short)1);
    ByteVector byteVector7 = byteVector5.putLong((long)'#');
    ByteVector byteVector9 = byteVector5.putInt((int)' ');
    byte[] byte_array11 = new byte[] { (byte)-1 };
    ByteVector byteVector14 = byteVector5.putByteArray(byte_array11, (int)(short)0, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector17 = byteVector1.putByteArray(byte_array11, 0, 10);
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
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test054"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector3.putByte((int)' ');
    ByteVector byteVector7 = byteVector3.putLong((long)1);
    ByteVector byteVector9 = byteVector7.putShort((int)(byte)0);
    
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
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test055"); }


    ByteVector byteVector1 = new ByteVector((int)'a');
    ByteVector byteVector3 = byteVector1.putByte(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test056"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    ByteVector byteVector7 = byteVector5.putShort(1);
    ByteVector byteVector9 = byteVector5.putInt((int)(short)10);
    ByteVector byteVector11 = byteVector5.putShort(0);
    ByteVector byteVector13 = byteVector11.putLong(1L);
    ByteVector byteVector15 = byteVector11.putLong((-1L));
    
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
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test057"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    ByteVector byteVector7 = byteVector5.putShort(1);
    ByteVector byteVector9 = byteVector5.putInt((int)(short)10);
    ByteVector byteVector11 = byteVector5.putInt((int)(short)0);
    ByteVector byteVector13 = byteVector11.putInt((int)(byte)0);
    
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
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test058"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    ByteVector byteVector7 = byteVector5.putShort(1);
    ByteVector byteVector9 = byteVector5.putInt((int)(short)10);
    ByteVector byteVector11 = byteVector5.putInt((int)(short)0);
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
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test059"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    ByteVector byteVector7 = byteVector1.putUTF8("");
    ByteVector byteVector9 = byteVector7.putInt((int)(byte)10);
    ByteVector byteVector11 = byteVector9.putInt((int)(byte)1);
    
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
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(byte)10);
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
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test061"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putInt((int)(short)0);
    ByteVector byteVector13 = byteVector9.putByte((int)(byte)-1);
    ByteVector byteVector15 = byteVector13.putShort((int)'a');
    ByteVector byteVector17 = byteVector13.putLong((long)(short)1);
    ByteVector byteVector19 = byteVector13.putInt((int)(byte)100);
    ByteVector byteVector21 = byteVector13.putShort(1);
    
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
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test062"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putUTF8("hi!");
    ByteVector byteVector11 = byteVector1.putInt(0);
    ByteVector byteVector13 = byteVector1.putUTF8("");
    
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
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test063"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector1.putUTF8("");
    ByteVector byteVector13 = byteVector1.putUTF8("hi!");
    ByteVector byteVector15 = byteVector1.putLong((long)(short)1);
    
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
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test064"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    ByteVector byteVector7 = byteVector5.putShort(1);
    ByteVector byteVector9 = byteVector5.putInt((int)(short)10);
    ByteVector byteVector11 = byteVector9.putShort((int)'a');
    ByteVector byteVector13 = byteVector9.putLong((long)(short)10);
    
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
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test065"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    byte[] byte_array7 = new byte[] { (byte)-1 };
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(short)0, (int)(byte)0);
    ByteVector byteVector12 = byteVector1.putInt((int)' ');
    ByteVector byteVector14 = byteVector1.putShort((int)' ');
    ByteVector byteVector16 = byteVector14.putLong((long)(byte)100);
    ByteVector byteVector18 = new ByteVector((int)(short)1);
    ByteVector byteVector20 = byteVector18.putLong((long)'#');
    ByteVector byteVector22 = byteVector18.putInt(0);
    ByteVector byteVector24 = byteVector18.putShort((int)(short)10);
    ByteVector byteVector26 = new ByteVector((int)(short)1);
    ByteVector byteVector28 = byteVector26.putLong((long)'#');
    ByteVector byteVector30 = byteVector26.putInt((int)' ');
    byte[] byte_array32 = new byte[] { (byte)-1 };
    ByteVector byteVector35 = byteVector26.putByteArray(byte_array32, (int)(short)0, (int)(byte)0);
    ByteVector byteVector38 = byteVector24.putByteArray(byte_array32, 0, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector41 = byteVector14.putByteArray(byte_array32, (int)(byte)1, (int)(short)1);
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
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector38);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test066"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector3.putByte((int)' ');
    ByteVector byteVector7 = new ByteVector((int)(short)1);
    ByteVector byteVector9 = byteVector7.putLong((long)'#');
    ByteVector byteVector11 = byteVector7.putInt(0);
    ByteVector byteVector13 = byteVector7.putShort((int)(short)10);
    ByteVector byteVector15 = new ByteVector((int)(short)1);
    ByteVector byteVector17 = byteVector15.putLong((long)'#');
    ByteVector byteVector19 = byteVector15.putInt((int)' ');
    byte[] byte_array21 = new byte[] { (byte)-1 };
    ByteVector byteVector24 = byteVector15.putByteArray(byte_array21, (int)(short)0, (int)(byte)0);
    ByteVector byteVector27 = byteVector13.putByteArray(byte_array21, 0, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector30 = byteVector3.putByteArray(byte_array21, (int)(byte)1, (int)'4');
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
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector27);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test067"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    byte[] byte_array7 = new byte[] { (byte)-1 };
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(short)0, (int)(byte)0);
    ByteVector byteVector12 = byteVector1.putUTF8("hi!");
    ByteVector byteVector14 = byteVector1.putInt((int)(short)-1);
    ByteVector byteVector16 = new ByteVector((int)(short)1);
    ByteVector byteVector18 = byteVector16.putLong((long)'#');
    ByteVector byteVector20 = byteVector18.putByte((int)' ');
    ByteVector byteVector22 = byteVector18.putShort(0);
    ByteVector byteVector24 = byteVector18.putInt((int)(short)100);
    ByteVector byteVector26 = new ByteVector((int)(short)1);
    ByteVector byteVector28 = byteVector26.putLong((long)'#');
    ByteVector byteVector30 = byteVector26.putInt((int)' ');
    byte[] byte_array32 = new byte[] { (byte)-1 };
    ByteVector byteVector35 = byteVector26.putByteArray(byte_array32, (int)(short)0, (int)(byte)0);
    ByteVector byteVector38 = byteVector18.putByteArray(byte_array32, (int)(byte)0, 0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector41 = byteVector1.putByteArray(byte_array32, (int)(short)1, 10);
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
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector38);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test068"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putLong((long)10);
    
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
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test069"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putLong((long)100);
    ByteVector byteVector13 = byteVector9.putUTF8("hi!");
    ByteVector byteVector15 = new ByteVector((int)(short)1);
    ByteVector byteVector17 = byteVector15.putLong((long)'#');
    ByteVector byteVector19 = byteVector15.putInt(0);
    ByteVector byteVector21 = byteVector15.putShort((int)(short)10);
    ByteVector byteVector23 = byteVector15.putByte((int)(short)0);
    ByteVector byteVector25 = byteVector23.putShort((int)(short)-1);
    ByteVector byteVector27 = byteVector23.putUTF8("");
    ByteVector byteVector29 = byteVector23.putShort(1);
    ByteVector byteVector31 = new ByteVector((int)'4');
    ByteVector byteVector33 = byteVector31.putByte((int)(byte)100);
    byte[] byte_array35 = new byte[] { (byte)-1 };
    ByteVector byteVector38 = byteVector33.putByteArray(byte_array35, (int)(byte)0, 1);
    ByteVector byteVector41 = byteVector23.putByteArray(byte_array35, 1, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector44 = byteVector13.putByteArray(byte_array35, (int)(short)0, 10);
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
    org.junit.Assert.assertNotNull(byteVector33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector41);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test070"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putUTF8("hi!");
    ByteVector byteVector7 = byteVector1.putUTF8("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test071"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector3.putByte((int)' ');
    ByteVector byteVector7 = new ByteVector((int)(short)1);
    ByteVector byteVector9 = byteVector7.putLong((long)'#');
    ByteVector byteVector11 = byteVector9.putByte((int)' ');
    ByteVector byteVector13 = byteVector11.putLong((long)0);
    ByteVector byteVector15 = byteVector11.putUTF8("hi!");
    ByteVector byteVector17 = byteVector15.putByte((int)(byte)-1);
    ByteVector byteVector19 = new ByteVector((int)(short)1);
    ByteVector byteVector21 = byteVector19.putLong((long)'#');
    ByteVector byteVector23 = byteVector19.putInt(0);
    ByteVector byteVector25 = byteVector19.putShort((int)(short)10);
    ByteVector byteVector27 = new ByteVector((int)(short)1);
    ByteVector byteVector29 = byteVector27.putLong((long)'#');
    ByteVector byteVector31 = byteVector27.putInt((int)' ');
    byte[] byte_array33 = new byte[] { (byte)-1 };
    ByteVector byteVector36 = byteVector27.putByteArray(byte_array33, (int)(short)0, (int)(byte)0);
    ByteVector byteVector39 = byteVector25.putByteArray(byte_array33, 0, (int)(short)1);
    ByteVector byteVector42 = byteVector15.putByteArray(byte_array33, (int)(byte)0, 1);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector45 = byteVector5.putByteArray(byte_array33, (int)(byte)10, (int)(short)0);
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
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector42);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test072"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putShort((int)(short)-1);
    ByteVector byteVector13 = byteVector11.putUTF8("");
    ByteVector byteVector15 = byteVector11.putUTF8("hi!");
    
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
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test073"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector5.putShort((int)(byte)0);
    ByteVector byteVector9 = new ByteVector((int)(short)1);
    ByteVector byteVector11 = byteVector9.putLong((long)'#');
    ByteVector byteVector13 = byteVector11.putByte((int)' ');
    ByteVector byteVector15 = byteVector11.putShort(0);
    ByteVector byteVector17 = byteVector11.putInt((int)(short)100);
    ByteVector byteVector19 = new ByteVector((int)(short)1);
    ByteVector byteVector21 = byteVector19.putLong((long)'#');
    ByteVector byteVector23 = byteVector19.putInt((int)' ');
    byte[] byte_array25 = new byte[] { (byte)-1 };
    ByteVector byteVector28 = byteVector19.putByteArray(byte_array25, (int)(short)0, (int)(byte)0);
    ByteVector byteVector31 = byteVector11.putByteArray(byte_array25, (int)(byte)0, 0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector34 = byteVector5.putByteArray(byte_array25, (int)'a', 0);
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
    org.junit.Assert.assertNotNull(byteVector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector31);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test074"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    ByteVector byteVector7 = byteVector1.putUTF8("");
    ByteVector byteVector9 = byteVector1.putLong((long)(short)-1);
    ByteVector byteVector11 = byteVector9.putShort((-1));
    
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
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test075"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putInt((int)(short)0);
    ByteVector byteVector13 = byteVector9.putByte((int)(byte)-1);
    ByteVector byteVector15 = byteVector13.putShort((int)'a');
    ByteVector byteVector17 = byteVector13.putByte((-1));
    
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
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test076"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putLong((long)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test077"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    byte[] byte_array7 = new byte[] { (byte)-1 };
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(short)0, (int)(byte)0);
    ByteVector byteVector12 = byteVector1.putUTF8("hi!");
    ByteVector byteVector14 = byteVector1.putInt((int)(short)-1);
    ByteVector byteVector16 = byteVector1.putLong((long)(byte)0);
    ByteVector byteVector18 = byteVector1.putShort(10);
    ByteVector byteVector20 = byteVector1.putShort((int)(short)100);
    ByteVector byteVector22 = new ByteVector((int)(short)1);
    ByteVector byteVector24 = byteVector22.putLong((long)'#');
    ByteVector byteVector26 = byteVector22.putInt(0);
    ByteVector byteVector28 = byteVector22.putShort((int)(short)10);
    ByteVector byteVector30 = new ByteVector((int)(short)1);
    ByteVector byteVector32 = byteVector30.putLong((long)'#');
    ByteVector byteVector34 = byteVector30.putInt((int)' ');
    byte[] byte_array36 = new byte[] { (byte)-1 };
    ByteVector byteVector39 = byteVector30.putByteArray(byte_array36, (int)(short)0, (int)(byte)0);
    ByteVector byteVector42 = byteVector28.putByteArray(byte_array36, 0, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector45 = byteVector20.putByteArray(byte_array36, (int)(short)0, (int)' ');
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
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector42);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test078"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector5.putShort((int)(byte)0);
    ByteVector byteVector9 = byteVector7.putLong(0L);
    ByteVector byteVector11 = byteVector9.putShort((int)'a');
    ByteVector byteVector13 = byteVector11.putByte((int)(byte)10);
    
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
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test079"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector1.putUTF8("");
    ByteVector byteVector13 = byteVector1.putUTF8("hi!");
    ByteVector byteVector15 = byteVector13.putUTF8("");
    ByteVector byteVector17 = byteVector15.putLong((long)'4');
    
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
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test080"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putShort((int)(short)-1);
    ByteVector byteVector13 = byteVector11.putShort((int)(short)0);
    ByteVector byteVector15 = byteVector11.putShort((-1));
    
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
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test081"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putInt((int)(short)0);
    ByteVector byteVector13 = byteVector9.putByte((int)(byte)-1);
    ByteVector byteVector15 = byteVector13.putShort((int)'a');
    ByteVector byteVector17 = byteVector13.putLong((long)(short)1);
    ByteVector byteVector19 = byteVector13.putUTF8("");
    ByteVector byteVector21 = byteVector13.putUTF8("");
    
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
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test082"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putShort((int)(short)-1);
    ByteVector byteVector13 = byteVector9.putUTF8("hi!");
    ByteVector byteVector15 = byteVector13.putByte(100);
    ByteVector byteVector17 = byteVector13.putInt((int)'#');
    ByteVector byteVector19 = byteVector17.putByte(1);
    
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
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test083"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putShort((int)(short)-1);
    ByteVector byteVector13 = byteVector11.putUTF8("");
    ByteVector byteVector15 = byteVector11.putUTF8("");
    ByteVector byteVector17 = byteVector15.putShort((int)(byte)10);
    ByteVector byteVector19 = byteVector15.putUTF8("");
    byte[] byte_array20 = new byte[] {  };
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector23 = byteVector19.putByteArray(byte_array20, 100, 0);
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
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test084"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putByte((int)'a');
    ByteVector byteVector5 = byteVector1.putInt(100);
    ByteVector byteVector7 = byteVector5.putInt((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test085"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector3.putByte((int)' ');
    ByteVector byteVector7 = byteVector5.putLong((long)0);
    ByteVector byteVector9 = byteVector5.putUTF8("hi!");
    ByteVector byteVector11 = byteVector9.putByte((int)(byte)-1);
    ByteVector byteVector13 = new ByteVector((int)(short)1);
    ByteVector byteVector15 = byteVector13.putLong((long)'#');
    ByteVector byteVector17 = byteVector13.putInt(0);
    ByteVector byteVector19 = byteVector13.putShort((int)(short)10);
    ByteVector byteVector21 = new ByteVector((int)(short)1);
    ByteVector byteVector23 = byteVector21.putLong((long)'#');
    ByteVector byteVector25 = byteVector21.putInt((int)' ');
    byte[] byte_array27 = new byte[] { (byte)-1 };
    ByteVector byteVector30 = byteVector21.putByteArray(byte_array27, (int)(short)0, (int)(byte)0);
    ByteVector byteVector33 = byteVector19.putByteArray(byte_array27, 0, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector36 = byteVector11.putByteArray(byte_array27, 0, (int)'4');
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
    org.junit.Assert.assertNotNull(byteVector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector33);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test086"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putShort((int)(short)-1);
    ByteVector byteVector13 = byteVector11.putUTF8("");
    ByteVector byteVector15 = byteVector11.putUTF8("");
    ByteVector byteVector17 = byteVector15.putShort((int)(byte)10);
    ByteVector byteVector19 = byteVector15.putUTF8("");
    ByteVector byteVector21 = byteVector15.putUTF8("hi!");
    ByteVector byteVector23 = byteVector15.putByte(0);
    ByteVector byteVector25 = byteVector23.putUTF8("hi!");
    ByteVector byteVector27 = byteVector25.putUTF8("");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector27);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test087"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    byte[] byte_array7 = new byte[] { (byte)-1 };
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(short)0, (int)(byte)0);
    ByteVector byteVector12 = byteVector1.putUTF8("hi!");
    ByteVector byteVector14 = byteVector1.putInt((int)(short)-1);
    ByteVector byteVector16 = byteVector1.putLong((long)(byte)0);
    ByteVector byteVector18 = byteVector16.putInt((int)'#');
    ByteVector byteVector20 = byteVector18.putUTF8("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test088"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    byte[] byte_array7 = new byte[] { (byte)-1 };
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(short)0, (int)(byte)0);
    ByteVector byteVector12 = byteVector1.putLong((long)10);
    ByteVector byteVector14 = byteVector1.putShort(0);
    ByteVector byteVector16 = byteVector14.putByte((int)(byte)10);
    ByteVector byteVector18 = byteVector16.putUTF8("");
    ByteVector byteVector20 = byteVector16.putUTF8("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test089"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector3.putByte((int)' ');
    ByteVector byteVector7 = byteVector5.putUTF8("");
    ByteVector byteVector9 = byteVector5.putLong(10L);
    ByteVector byteVector11 = byteVector9.putInt(0);
    
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
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test090"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putUTF8("hi!");
    ByteVector byteVector11 = byteVector1.putInt(0);
    ByteVector byteVector13 = byteVector11.putByte((int)(byte)100);
    
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
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    byte[] byte_array7 = new byte[] { (byte)-1 };
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(short)0, (int)(byte)0);
    ByteVector byteVector12 = byteVector1.putUTF8("hi!");
    ByteVector byteVector14 = byteVector1.putInt((int)(short)-1);
    ByteVector byteVector16 = byteVector1.putLong((long)(byte)0);
    ByteVector byteVector18 = byteVector16.putShort(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test092"); }


    ByteVector byteVector1 = new ByteVector((int)'4');
    ByteVector byteVector3 = byteVector1.putByte((int)(byte)100);
    byte[] byte_array5 = new byte[] { (byte)-1 };
    ByteVector byteVector8 = byteVector3.putByteArray(byte_array5, (int)(byte)0, 1);
    ByteVector byteVector10 = byteVector3.putLong((long)(byte)0);
    ByteVector byteVector12 = byteVector3.putInt(0);
    ByteVector byteVector14 = new ByteVector((int)'4');
    ByteVector byteVector16 = byteVector14.putByte((int)(byte)100);
    byte[] byte_array18 = new byte[] { (byte)-1 };
    ByteVector byteVector21 = byteVector16.putByteArray(byte_array18, (int)(byte)0, 1);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector24 = byteVector3.putByteArray(byte_array18, (int)(short)100, (int)'#');
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test093"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector3.putShort((int)'4');
    ByteVector byteVector7 = byteVector3.putShort((int)(short)10);
    ByteVector byteVector9 = new ByteVector((int)(short)1);
    ByteVector byteVector11 = byteVector9.putLong((long)'#');
    ByteVector byteVector13 = byteVector11.putByte((int)' ');
    ByteVector byteVector15 = byteVector13.putLong((long)0);
    ByteVector byteVector17 = byteVector13.putUTF8("hi!");
    ByteVector byteVector19 = byteVector17.putByte((int)(byte)-1);
    ByteVector byteVector21 = new ByteVector((int)(short)1);
    ByteVector byteVector23 = byteVector21.putLong((long)'#');
    ByteVector byteVector25 = byteVector21.putInt(0);
    ByteVector byteVector27 = byteVector21.putShort((int)(short)10);
    ByteVector byteVector29 = new ByteVector((int)(short)1);
    ByteVector byteVector31 = byteVector29.putLong((long)'#');
    ByteVector byteVector33 = byteVector29.putInt((int)' ');
    byte[] byte_array35 = new byte[] { (byte)-1 };
    ByteVector byteVector38 = byteVector29.putByteArray(byte_array35, (int)(short)0, (int)(byte)0);
    ByteVector byteVector41 = byteVector27.putByteArray(byte_array35, 0, (int)(short)1);
    ByteVector byteVector44 = byteVector17.putByteArray(byte_array35, (int)(byte)0, 1);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector47 = byteVector3.putByteArray(byte_array35, 1, (int)(short)-1);
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
    org.junit.Assert.assertNotNull(byte_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector44);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test094"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putShort((int)(short)-1);
    ByteVector byteVector13 = byteVector9.putUTF8("");
    ByteVector byteVector15 = byteVector13.putLong((long)'#');
    ByteVector byteVector17 = byteVector15.putLong(0L);
    ByteVector byteVector19 = byteVector17.putByte((-1));
    ByteVector byteVector21 = byteVector17.putLong((long)(short)-1);
    
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
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test095"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putShort((int)(short)-1);
    ByteVector byteVector13 = byteVector11.putUTF8("");
    ByteVector byteVector15 = byteVector11.putUTF8("");
    ByteVector byteVector17 = byteVector11.putUTF8("");
    ByteVector byteVector19 = byteVector17.putShort(1);
    ByteVector byteVector21 = byteVector17.putUTF8("hi!");
    
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
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test096"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(byte)10);
    ByteVector byteVector9 = byteVector1.putLong((-1L));
    ByteVector byteVector11 = new ByteVector((int)(short)1);
    ByteVector byteVector13 = byteVector11.putLong((long)'#');
    ByteVector byteVector15 = byteVector11.putInt(0);
    ByteVector byteVector17 = byteVector11.putShort((int)(short)10);
    ByteVector byteVector19 = new ByteVector((int)(short)1);
    ByteVector byteVector21 = byteVector19.putLong((long)'#');
    ByteVector byteVector23 = byteVector19.putInt((int)' ');
    byte[] byte_array25 = new byte[] { (byte)-1 };
    ByteVector byteVector28 = byteVector19.putByteArray(byte_array25, (int)(short)0, (int)(byte)0);
    ByteVector byteVector31 = byteVector17.putByteArray(byte_array25, 0, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector34 = byteVector9.putByteArray(byte_array25, (-1), (int)(short)0);
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
    org.junit.Assert.assertNotNull(byteVector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector31);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test097"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    ByteVector byteVector7 = byteVector5.putShort(1);
    ByteVector byteVector9 = byteVector5.putInt((int)(short)10);
    ByteVector byteVector11 = byteVector5.putInt((int)(short)0);
    ByteVector byteVector13 = new ByteVector((int)(short)1);
    ByteVector byteVector15 = byteVector13.putLong((long)'#');
    ByteVector byteVector17 = byteVector13.putInt((int)' ');
    byte[] byte_array19 = new byte[] { (byte)-1 };
    ByteVector byteVector22 = byteVector13.putByteArray(byte_array19, (int)(short)0, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector25 = byteVector11.putByteArray(byte_array19, (int)'a', 10);
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
    org.junit.Assert.assertNotNull(byte_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector22);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test098"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    byte[] byte_array7 = new byte[] { (byte)-1 };
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(short)0, (int)(byte)0);
    ByteVector byteVector12 = byteVector1.putUTF8("hi!");
    ByteVector byteVector14 = byteVector1.putInt((int)(short)-1);
    ByteVector byteVector16 = byteVector14.putShort((int)(short)10);
    ByteVector byteVector18 = byteVector14.putShort(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test099"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    byte[] byte_array7 = new byte[] { (byte)-1 };
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(short)0, (int)(byte)0);
    ByteVector byteVector12 = byteVector1.putLong((long)10);
    ByteVector byteVector14 = byteVector12.putLong((long)(-1));
    ByteVector byteVector16 = byteVector14.putInt((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test100"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector5.putShort((int)(byte)0);
    ByteVector byteVector9 = byteVector7.putLong(0L);
    ByteVector byteVector11 = byteVector9.putShort((int)'a');
    ByteVector byteVector13 = byteVector11.putInt((int)(byte)1);
    
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
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test101"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector3.putByte((int)' ');
    ByteVector byteVector7 = byteVector5.putLong((long)0);
    ByteVector byteVector9 = byteVector5.putUTF8("hi!");
    ByteVector byteVector11 = byteVector9.putByte((int)(byte)-1);
    ByteVector byteVector13 = new ByteVector((int)(short)1);
    ByteVector byteVector15 = byteVector13.putLong((long)'#');
    ByteVector byteVector17 = byteVector15.putByte((int)' ');
    ByteVector byteVector19 = byteVector17.putLong((long)0);
    ByteVector byteVector21 = byteVector17.putUTF8("hi!");
    ByteVector byteVector23 = byteVector21.putByte((int)(byte)-1);
    ByteVector byteVector25 = new ByteVector((int)(short)1);
    ByteVector byteVector27 = byteVector25.putLong((long)'#');
    ByteVector byteVector29 = byteVector25.putInt(0);
    ByteVector byteVector31 = byteVector25.putShort((int)(short)10);
    ByteVector byteVector33 = new ByteVector((int)(short)1);
    ByteVector byteVector35 = byteVector33.putLong((long)'#');
    ByteVector byteVector37 = byteVector33.putInt((int)' ');
    byte[] byte_array39 = new byte[] { (byte)-1 };
    ByteVector byteVector42 = byteVector33.putByteArray(byte_array39, (int)(short)0, (int)(byte)0);
    ByteVector byteVector45 = byteVector31.putByteArray(byte_array39, 0, (int)(short)1);
    ByteVector byteVector48 = byteVector21.putByteArray(byte_array39, (int)(byte)0, 1);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector51 = byteVector9.putByteArray(byte_array39, (int)(short)0, (int)(short)-1);
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
    org.junit.Assert.assertNotNull(byteVector27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector48);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test102"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putShort((int)(short)-1);
    ByteVector byteVector13 = byteVector9.putUTF8("");
    ByteVector byteVector15 = byteVector9.putShort(1);
    ByteVector byteVector17 = byteVector15.putByte((int)'#');
    ByteVector byteVector19 = byteVector15.putByte(100);
    ByteVector byteVector21 = byteVector15.putLong((long)'4');
    byte[] byte_array23 = new byte[] { (byte)100 };
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector26 = byteVector21.putByteArray(byte_array23, 10, 10);
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
    org.junit.Assert.assertNotNull(byte_array23);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test103"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector3.putByte((int)' ');
    ByteVector byteVector7 = byteVector5.putShort((int)(byte)100);
    ByteVector byteVector9 = byteVector7.putByte((int)(short)10);
    
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
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test104"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putShort((int)(short)-1);
    ByteVector byteVector13 = byteVector11.putUTF8("");
    ByteVector byteVector15 = byteVector11.putUTF8("");
    ByteVector byteVector17 = byteVector11.putUTF8("");
    ByteVector byteVector19 = byteVector11.putByte(0);
    
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
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test105"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector3.putShort((int)'4');
    ByteVector byteVector7 = byteVector3.putByte(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test106"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    byte[] byte_array7 = new byte[] { (byte)-1 };
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(short)0, (int)(byte)0);
    ByteVector byteVector12 = byteVector1.putUTF8("hi!");
    ByteVector byteVector14 = byteVector12.putUTF8("");
    ByteVector byteVector16 = byteVector12.putInt((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test107"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putShort((int)(short)-1);
    ByteVector byteVector13 = byteVector9.putUTF8("");
    ByteVector byteVector15 = byteVector9.putShort(1);
    ByteVector byteVector17 = byteVector15.putByte((int)'#');
    ByteVector byteVector19 = byteVector15.putInt((int)(short)1);
    ByteVector byteVector21 = new ByteVector((int)(short)1);
    ByteVector byteVector23 = byteVector21.putLong((long)'#');
    ByteVector byteVector25 = byteVector21.putInt(0);
    ByteVector byteVector27 = byteVector21.putShort((int)(short)10);
    ByteVector byteVector29 = new ByteVector((int)(short)1);
    ByteVector byteVector31 = byteVector29.putLong((long)'#');
    ByteVector byteVector33 = byteVector29.putInt((int)' ');
    byte[] byte_array35 = new byte[] { (byte)-1 };
    ByteVector byteVector38 = byteVector29.putByteArray(byte_array35, (int)(short)0, (int)(byte)0);
    ByteVector byteVector41 = byteVector27.putByteArray(byte_array35, 0, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector44 = byteVector19.putByteArray(byte_array35, (int)(short)-1, (int)(short)-1);
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
    org.junit.Assert.assertNotNull(byteVector31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector41);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test108"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = new ByteVector((int)(short)1);
    ByteVector byteVector11 = byteVector9.putLong((long)'#');
    ByteVector byteVector13 = byteVector9.putInt((int)' ');
    byte[] byte_array15 = new byte[] { (byte)-1 };
    ByteVector byteVector18 = byteVector9.putByteArray(byte_array15, (int)(short)0, (int)(byte)0);
    ByteVector byteVector21 = byteVector7.putByteArray(byte_array15, 0, (int)(short)1);
    ByteVector byteVector23 = byteVector21.putByte((int)' ');
    ByteVector byteVector25 = new ByteVector((int)(short)1);
    ByteVector byteVector27 = byteVector25.putLong((long)'#');
    ByteVector byteVector29 = byteVector25.putInt((int)' ');
    byte[] byte_array31 = new byte[] { (byte)-1 };
    ByteVector byteVector34 = byteVector25.putByteArray(byte_array31, (int)(short)0, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector37 = byteVector21.putByteArray(byte_array31, (int)(byte)100, (-1));
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
    org.junit.Assert.assertNotNull(byte_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector34);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test109"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putShort((int)(short)-1);
    ByteVector byteVector13 = byteVector9.putUTF8("");
    ByteVector byteVector15 = byteVector13.putLong((long)'#');
    ByteVector byteVector17 = byteVector15.putLong(0L);
    ByteVector byteVector19 = byteVector15.putInt((int)(short)0);
    ByteVector byteVector21 = byteVector15.putInt((int)(byte)-1);
    ByteVector byteVector23 = byteVector21.putUTF8("");
    
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
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test110"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector1.putUTF8("");
    ByteVector byteVector13 = byteVector11.putLong((long)(short)100);
    ByteVector byteVector15 = byteVector13.putLong((long)100);
    
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
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test111"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector3.putShort((int)'4');
    ByteVector byteVector7 = byteVector3.putInt(0);
    ByteVector byteVector9 = byteVector7.putByte((int)(byte)1);
    
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
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putShort((int)(short)-1);
    ByteVector byteVector13 = byteVector11.putUTF8("");
    ByteVector byteVector15 = byteVector13.putUTF8("");
    ByteVector byteVector17 = byteVector13.putUTF8("hi!");
    
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
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test113"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector3.putByte((int)' ');
    ByteVector byteVector7 = byteVector5.putLong((long)0);
    ByteVector byteVector9 = byteVector5.putUTF8("hi!");
    ByteVector byteVector11 = byteVector9.putByte((int)(byte)10);
    
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
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test114"); }


    ByteVector byteVector1 = new ByteVector((int)(short)100);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test115"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    byte[] byte_array7 = new byte[] { (byte)-1 };
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(short)0, (int)(byte)0);
    ByteVector byteVector12 = byteVector1.putInt((int)' ');
    ByteVector byteVector14 = byteVector1.putShort((int)' ');
    ByteVector byteVector16 = byteVector14.putLong((long)(byte)100);
    ByteVector byteVector18 = byteVector14.putByte((int)(byte)0);
    ByteVector byteVector20 = byteVector18.putLong((long)'a');
    ByteVector byteVector22 = byteVector20.putInt((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector22);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test116"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putShort((int)(short)-1);
    ByteVector byteVector13 = byteVector9.putUTF8("");
    ByteVector byteVector15 = byteVector13.putLong((long)'#');
    ByteVector byteVector17 = byteVector15.putLong(0L);
    ByteVector byteVector19 = byteVector15.putInt((int)(short)0);
    ByteVector byteVector21 = byteVector15.putInt((int)(byte)-1);
    byte[] byte_array25 = new byte[] { (byte)10, (byte)1, (byte)10 };
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector28 = byteVector21.putByteArray(byte_array25, (int)(short)10, 1);
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
    org.junit.Assert.assertNotNull(byte_array25);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test117"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putShort((int)(short)-1);
    ByteVector byteVector13 = byteVector9.putUTF8("");
    ByteVector byteVector15 = byteVector9.putShort(1);
    ByteVector byteVector17 = byteVector15.putByte((int)'#');
    ByteVector byteVector19 = byteVector15.putByte(100);
    ByteVector byteVector21 = byteVector19.putByte((int)(byte)10);
    ByteVector byteVector23 = byteVector19.putByte((int)'4');
    ByteVector byteVector25 = byteVector23.putInt((int)'a');
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector25);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test118"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putShort((int)(short)-1);
    ByteVector byteVector13 = byteVector11.putUTF8("");
    ByteVector byteVector15 = byteVector11.putUTF8("");
    ByteVector byteVector17 = byteVector15.putShort((int)(byte)10);
    ByteVector byteVector19 = byteVector15.putUTF8("");
    ByteVector byteVector21 = byteVector15.putUTF8("hi!");
    ByteVector byteVector23 = new ByteVector((int)(short)1);
    ByteVector byteVector25 = byteVector23.putLong((long)'#');
    ByteVector byteVector27 = byteVector25.putByte((int)' ');
    ByteVector byteVector29 = byteVector27.putLong((long)0);
    ByteVector byteVector31 = byteVector27.putUTF8("hi!");
    ByteVector byteVector33 = byteVector31.putByte((int)(byte)-1);
    ByteVector byteVector35 = new ByteVector((int)(short)1);
    ByteVector byteVector37 = byteVector35.putLong((long)'#');
    ByteVector byteVector39 = byteVector35.putInt(0);
    ByteVector byteVector41 = byteVector35.putShort((int)(short)10);
    ByteVector byteVector43 = new ByteVector((int)(short)1);
    ByteVector byteVector45 = byteVector43.putLong((long)'#');
    ByteVector byteVector47 = byteVector43.putInt((int)' ');
    byte[] byte_array49 = new byte[] { (byte)-1 };
    ByteVector byteVector52 = byteVector43.putByteArray(byte_array49, (int)(short)0, (int)(byte)0);
    ByteVector byteVector55 = byteVector41.putByteArray(byte_array49, 0, (int)(short)1);
    ByteVector byteVector58 = byteVector31.putByteArray(byte_array49, (int)(byte)0, 1);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector61 = byteVector21.putByteArray(byte_array49, 10, (int)'a');
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
    org.junit.Assert.assertNotNull(byteVector37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector58);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test119"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putShort((int)(short)-1);
    ByteVector byteVector13 = byteVector9.putUTF8("hi!");
    ByteVector byteVector15 = byteVector13.putByte(100);
    ByteVector byteVector17 = byteVector13.putInt((int)'#');
    ByteVector byteVector19 = byteVector17.putByte((int)' ');
    ByteVector byteVector21 = byteVector19.putShort((int)(short)-1);
    
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
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test120"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putInt((int)(short)0);
    ByteVector byteVector13 = byteVector9.putByte((int)(byte)-1);
    ByteVector byteVector15 = byteVector13.putShort((int)'a');
    ByteVector byteVector17 = byteVector13.putLong((long)(short)1);
    ByteVector byteVector19 = byteVector13.putByte(100);
    ByteVector byteVector21 = byteVector13.putLong((long)' ');
    ByteVector byteVector23 = byteVector13.putInt(10);
    
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
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test121"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector5.putShort((int)(byte)0);
    ByteVector byteVector9 = byteVector5.putShort((int)(short)1);
    ByteVector byteVector11 = new ByteVector((int)(short)1);
    ByteVector byteVector13 = byteVector11.putLong((long)'#');
    ByteVector byteVector15 = byteVector11.putInt((int)' ');
    byte[] byte_array17 = new byte[] { (byte)-1 };
    ByteVector byteVector20 = byteVector11.putByteArray(byte_array17, (int)(short)0, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector23 = byteVector5.putByteArray(byte_array17, (int)(byte)-1, (int)(byte)0);
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
    org.junit.Assert.assertNotNull(byte_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test122"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putShort((int)(short)-1);
    ByteVector byteVector13 = byteVector11.putUTF8("");
    ByteVector byteVector15 = byteVector11.putUTF8("");
    ByteVector byteVector17 = byteVector15.putShort((int)(byte)10);
    ByteVector byteVector19 = byteVector15.putUTF8("");
    ByteVector byteVector21 = byteVector15.putUTF8("hi!");
    ByteVector byteVector23 = byteVector15.putByte(0);
    ByteVector byteVector25 = byteVector15.putUTF8("hi!");
    ByteVector byteVector27 = byteVector15.putLong((long)(byte)100);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector27);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test123"); }


    ByteVector byteVector1 = new ByteVector((int)(byte)1);
    ByteVector byteVector3 = byteVector1.putShort((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test124"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putShort((int)(short)-1);
    ByteVector byteVector13 = byteVector9.putUTF8("");
    ByteVector byteVector15 = byteVector9.putShort(1);
    ByteVector byteVector17 = byteVector15.putByte((int)'#');
    ByteVector byteVector19 = byteVector15.putShort((int)(byte)-1);
    
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
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test125"); }


    ByteVector byteVector1 = new ByteVector((int)(byte)10);
    ByteVector byteVector3 = byteVector1.putShort((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test126"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    byte[] byte_array7 = new byte[] { (byte)-1 };
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(short)0, (int)(byte)0);
    ByteVector byteVector12 = byteVector10.putInt((int)(short)-1);
    ByteVector byteVector14 = byteVector10.putByte((-1));
    ByteVector byteVector16 = byteVector10.putShort((int)(short)10);
    ByteVector byteVector18 = byteVector10.putUTF8("hi!");
    ByteVector byteVector20 = byteVector10.putInt((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test127"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    byte[] byte_array7 = new byte[] { (byte)-1 };
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(short)0, (int)(byte)0);
    ByteVector byteVector12 = byteVector10.putInt((int)(short)-1);
    ByteVector byteVector14 = new ByteVector((int)(short)1);
    ByteVector byteVector16 = byteVector14.putLong((long)'#');
    ByteVector byteVector18 = byteVector16.putByte((int)' ');
    ByteVector byteVector20 = byteVector16.putShort(0);
    ByteVector byteVector22 = byteVector16.putInt((int)(short)100);
    ByteVector byteVector24 = new ByteVector((int)(short)1);
    ByteVector byteVector26 = byteVector24.putLong((long)'#');
    ByteVector byteVector28 = byteVector24.putInt((int)' ');
    byte[] byte_array30 = new byte[] { (byte)-1 };
    ByteVector byteVector33 = byteVector24.putByteArray(byte_array30, (int)(short)0, (int)(byte)0);
    ByteVector byteVector36 = byteVector16.putByteArray(byte_array30, (int)(byte)0, 0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector39 = byteVector12.putByteArray(byte_array30, (int)'a', (int)(short)0);
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
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector36);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test128"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putInt((int)(short)0);
    ByteVector byteVector13 = byteVector9.putByte((int)(byte)-1);
    ByteVector byteVector15 = byteVector13.putShort((int)'a');
    ByteVector byteVector17 = byteVector13.putUTF8("");
    ByteVector byteVector19 = byteVector17.putUTF8("hi!");
    
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
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test129"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    byte[] byte_array7 = new byte[] { (byte)-1 };
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(short)0, (int)(byte)0);
    ByteVector byteVector12 = byteVector1.putUTF8("hi!");
    ByteVector byteVector14 = byteVector12.putUTF8("");
    ByteVector byteVector16 = byteVector12.putUTF8("hi!");
    ByteVector byteVector18 = byteVector12.putByte((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test130"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    ByteVector byteVector7 = byteVector1.putUTF8("");
    ByteVector byteVector9 = byteVector1.putLong((long)(short)-1);
    ByteVector byteVector11 = byteVector1.putUTF8("hi!");
    ByteVector byteVector13 = byteVector1.putInt((int)(byte)0);
    
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
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test131"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putShort((int)(short)-1);
    ByteVector byteVector13 = byteVector9.putByte(1);
    ByteVector byteVector15 = byteVector13.putByte(1);
    
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
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test132"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector3.putByte((int)' ');
    ByteVector byteVector7 = byteVector3.putShort(0);
    ByteVector byteVector9 = byteVector3.putInt((int)(short)100);
    ByteVector byteVector11 = byteVector3.putLong((long)'a');
    ByteVector byteVector13 = byteVector3.putUTF8("hi!");
    ByteVector byteVector15 = byteVector3.putShort((int)' ');
    ByteVector byteVector17 = new ByteVector((int)(short)1);
    ByteVector byteVector19 = byteVector17.putLong((long)'#');
    ByteVector byteVector21 = byteVector17.putInt(0);
    ByteVector byteVector23 = byteVector21.putShort((int)(byte)0);
    ByteVector byteVector25 = byteVector23.putLong(0L);
    ByteVector byteVector27 = byteVector25.putShort((int)'a');
    ByteVector byteVector29 = new ByteVector((int)'4');
    ByteVector byteVector31 = byteVector29.putByte((int)(byte)100);
    byte[] byte_array33 = new byte[] { (byte)-1 };
    ByteVector byteVector36 = byteVector31.putByteArray(byte_array33, (int)(byte)0, 1);
    ByteVector byteVector39 = byteVector25.putByteArray(byte_array33, (int)(short)0, 1);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector42 = byteVector3.putByteArray(byte_array33, (int)' ', (int)(byte)1);
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
    org.junit.Assert.assertNotNull(byteVector31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector39);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test133"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = new ByteVector((int)'4');
    ByteVector byteVector9 = byteVector7.putByte((int)(byte)100);
    byte[] byte_array11 = new byte[] { (byte)-1 };
    ByteVector byteVector14 = byteVector9.putByteArray(byte_array11, (int)(byte)0, 1);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector17 = byteVector1.putByteArray(byte_array11, 10, (int)(short)10);
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
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test134"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putShort((int)'#');
    ByteVector byteVector5 = byteVector3.putByte(0);
    ByteVector byteVector7 = byteVector3.putUTF8("");
    ByteVector byteVector9 = byteVector7.putLong(10L);
    ByteVector byteVector11 = byteVector9.putByte((int)(byte)1);
    ByteVector byteVector13 = new ByteVector((int)(short)1);
    ByteVector byteVector15 = byteVector13.putLong((long)'#');
    ByteVector byteVector17 = byteVector13.putInt((int)' ');
    byte[] byte_array19 = new byte[] { (byte)-1 };
    ByteVector byteVector22 = byteVector13.putByteArray(byte_array19, (int)(short)0, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector25 = byteVector9.putByteArray(byte_array19, (int)'4', (int)(short)0);
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
    org.junit.Assert.assertNotNull(byte_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector22);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test135"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putShort((int)'#');
    ByteVector byteVector5 = byteVector3.putByte(0);
    ByteVector byteVector7 = byteVector5.putUTF8("hi!");
    ByteVector byteVector9 = byteVector5.putUTF8("hi!");
    ByteVector byteVector11 = byteVector9.putInt((-1));
    ByteVector byteVector13 = new ByteVector((int)(short)1);
    ByteVector byteVector15 = byteVector13.putLong((long)'#');
    ByteVector byteVector17 = byteVector13.putInt(0);
    ByteVector byteVector19 = byteVector17.putShort((int)(byte)0);
    ByteVector byteVector21 = byteVector19.putLong(0L);
    ByteVector byteVector23 = byteVector21.putShort((int)'a');
    ByteVector byteVector25 = new ByteVector((int)'4');
    ByteVector byteVector27 = byteVector25.putByte((int)(byte)100);
    byte[] byte_array29 = new byte[] { (byte)-1 };
    ByteVector byteVector32 = byteVector27.putByteArray(byte_array29, (int)(byte)0, 1);
    ByteVector byteVector35 = byteVector21.putByteArray(byte_array29, (int)(short)0, 1);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector38 = byteVector11.putByteArray(byte_array29, (-1), (int)'a');
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
    org.junit.Assert.assertNotNull(byteVector27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector35);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test136"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    byte[] byte_array7 = new byte[] { (byte)-1 };
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(short)0, (int)(byte)0);
    ByteVector byteVector12 = byteVector1.putInt((int)' ');
    ByteVector byteVector14 = byteVector1.putByte((int)(short)1);
    ByteVector byteVector16 = byteVector1.putUTF8("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test137"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector5.putShort((int)(byte)0);
    ByteVector byteVector9 = byteVector7.putLong(0L);
    ByteVector byteVector11 = byteVector9.putShort((int)'a');
    ByteVector byteVector13 = new ByteVector((int)'4');
    ByteVector byteVector15 = byteVector13.putByte((int)(byte)100);
    byte[] byte_array17 = new byte[] { (byte)-1 };
    ByteVector byteVector20 = byteVector15.putByteArray(byte_array17, (int)(byte)0, 1);
    ByteVector byteVector23 = byteVector9.putByteArray(byte_array17, (int)(short)0, 1);
    ByteVector byteVector25 = byteVector9.putLong(100L);
    
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
    org.junit.Assert.assertNotNull(byte_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector25);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test138"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    ByteVector byteVector7 = byteVector5.putShort(1);
    ByteVector byteVector9 = byteVector5.putInt((int)(short)10);
    ByteVector byteVector11 = byteVector5.putLong((long)(byte)0);
    
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
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test139"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putShort((int)(short)-1);
    ByteVector byteVector13 = byteVector9.putUTF8("");
    ByteVector byteVector15 = byteVector13.putLong((long)'#');
    ByteVector byteVector17 = byteVector15.putInt((int)'#');
    ByteVector byteVector19 = byteVector17.putInt((int)(byte)100);
    ByteVector byteVector21 = byteVector17.putShort((int)'#');
    
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
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test140"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putShort((int)'#');
    ByteVector byteVector5 = byteVector3.putByte(0);
    ByteVector byteVector7 = byteVector5.putUTF8("hi!");
    ByteVector byteVector9 = byteVector5.putUTF8("hi!");
    ByteVector byteVector11 = byteVector9.putInt((-1));
    ByteVector byteVector13 = byteVector9.putUTF8("hi!");
    ByteVector byteVector15 = new ByteVector((int)(short)1);
    ByteVector byteVector17 = byteVector15.putLong((long)'#');
    ByteVector byteVector19 = byteVector17.putByte((int)' ');
    ByteVector byteVector21 = byteVector17.putShort(0);
    ByteVector byteVector23 = byteVector17.putInt((int)(short)100);
    ByteVector byteVector25 = new ByteVector((int)(short)1);
    ByteVector byteVector27 = byteVector25.putLong((long)'#');
    ByteVector byteVector29 = byteVector25.putInt((int)' ');
    byte[] byte_array31 = new byte[] { (byte)-1 };
    ByteVector byteVector34 = byteVector25.putByteArray(byte_array31, (int)(short)0, (int)(byte)0);
    ByteVector byteVector37 = byteVector17.putByteArray(byte_array31, (int)(byte)0, 0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector40 = byteVector9.putByteArray(byte_array31, (int)(byte)-1, (int)(short)0);
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
    org.junit.Assert.assertNotNull(byteVector27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector37);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test141"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putLong((long)100);
    ByteVector byteVector13 = new ByteVector((int)(short)1);
    ByteVector byteVector15 = byteVector13.putLong((long)'#');
    ByteVector byteVector17 = byteVector13.putInt(0);
    ByteVector byteVector19 = byteVector17.putShort((int)(byte)0);
    ByteVector byteVector21 = byteVector19.putLong(0L);
    ByteVector byteVector23 = byteVector21.putShort((int)'a');
    ByteVector byteVector25 = new ByteVector((int)'4');
    ByteVector byteVector27 = byteVector25.putByte((int)(byte)100);
    byte[] byte_array29 = new byte[] { (byte)-1 };
    ByteVector byteVector32 = byteVector27.putByteArray(byte_array29, (int)(byte)0, 1);
    ByteVector byteVector35 = byteVector21.putByteArray(byte_array29, (int)(short)0, 1);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector38 = byteVector9.putByteArray(byte_array29, (int)(short)0, (int)'a');
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
    org.junit.Assert.assertNotNull(byteVector27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector35);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test142"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector1.putUTF8("");
    ByteVector byteVector13 = byteVector1.putUTF8("hi!");
    ByteVector byteVector15 = byteVector1.putLong((long)(short)100);
    ByteVector byteVector17 = byteVector15.putInt((int)'a');
    
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
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test143"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putInt((int)(short)0);
    ByteVector byteVector13 = byteVector9.putByte((int)(byte)-1);
    ByteVector byteVector15 = byteVector13.putShort((int)'a');
    ByteVector byteVector17 = byteVector13.putLong((long)(short)-1);
    ByteVector byteVector19 = byteVector17.putByte((int)'#');
    ByteVector byteVector21 = byteVector17.putShort((int)' ');
    
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
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test144"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector3.putByte((int)' ');
    ByteVector byteVector7 = byteVector5.putShort((int)(short)0);
    ByteVector byteVector9 = byteVector7.putInt((int)(short)100);
    ByteVector byteVector11 = byteVector9.putUTF8("");
    ByteVector byteVector13 = byteVector9.putUTF8("hi!");
    
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
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test145"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putShort((int)'#');
    ByteVector byteVector5 = byteVector3.putByte(0);
    ByteVector byteVector7 = byteVector5.putUTF8("hi!");
    ByteVector byteVector9 = byteVector5.putShort((int)(byte)-1);
    ByteVector byteVector11 = byteVector5.putUTF8("hi!");
    ByteVector byteVector13 = byteVector5.putInt(0);
    ByteVector byteVector15 = byteVector5.putInt(0);
    
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
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test146"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(byte)10);
    ByteVector byteVector9 = byteVector1.putLong((-1L));
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
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test147"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    byte[] byte_array7 = new byte[] { (byte)-1 };
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(short)0, (int)(byte)0);
    ByteVector byteVector12 = byteVector1.putLong((long)10);
    ByteVector byteVector14 = byteVector1.putShort(0);
    ByteVector byteVector16 = byteVector14.putByte((int)(byte)10);
    ByteVector byteVector18 = byteVector16.putInt((int)(short)0);
    ByteVector byteVector20 = byteVector18.putUTF8("");
    ByteVector byteVector22 = byteVector18.putUTF8("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector22);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test148"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putShort((int)(short)-1);
    ByteVector byteVector13 = byteVector11.putUTF8("");
    ByteVector byteVector15 = byteVector11.putUTF8("");
    ByteVector byteVector17 = byteVector15.putShort((int)(byte)10);
    ByteVector byteVector19 = byteVector15.putUTF8("");
    ByteVector byteVector21 = byteVector15.putUTF8("hi!");
    ByteVector byteVector23 = byteVector21.putByte(10);
    
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
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test149"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putInt((int)(short)0);
    ByteVector byteVector13 = byteVector9.putByte((int)(byte)-1);
    ByteVector byteVector15 = byteVector9.putByte((int)(short)-1);
    ByteVector byteVector17 = byteVector9.putShort((int)(byte)100);
    ByteVector byteVector19 = new ByteVector((int)(short)1);
    ByteVector byteVector21 = byteVector19.putLong((long)'#');
    ByteVector byteVector23 = byteVector19.putInt(0);
    ByteVector byteVector25 = byteVector19.putShort((int)(short)10);
    ByteVector byteVector27 = byteVector19.putUTF8("hi!");
    ByteVector byteVector29 = byteVector19.putShort((int)(short)1);
    ByteVector byteVector31 = new ByteVector((int)'4');
    ByteVector byteVector33 = byteVector31.putByte((int)(byte)100);
    byte[] byte_array35 = new byte[] { (byte)-1 };
    ByteVector byteVector38 = byteVector33.putByteArray(byte_array35, (int)(byte)0, 1);
    ByteVector byteVector41 = byteVector19.putByteArray(byte_array35, 0, 0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector44 = byteVector17.putByteArray(byte_array35, (int)(byte)-1, (int)(short)-1);
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
    org.junit.Assert.assertNotNull(byteVector29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector41);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test150"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    byte[] byte_array7 = new byte[] { (byte)-1 };
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(short)0, (int)(byte)0);
    ByteVector byteVector12 = byteVector10.putInt((int)(byte)10);
    ByteVector byteVector14 = byteVector12.putByte((int)(byte)-1);
    ByteVector byteVector16 = byteVector14.putLong((long)(byte)0);
    ByteVector byteVector18 = byteVector14.putInt((int)'a');
    ByteVector byteVector20 = byteVector14.putUTF8("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test151"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putShort((int)'#');
    ByteVector byteVector5 = byteVector3.putByte(0);
    ByteVector byteVector7 = byteVector5.putUTF8("hi!");
    ByteVector byteVector9 = byteVector7.putShort((int)'a');
    ByteVector byteVector11 = byteVector7.putUTF8("");
    
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
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test152"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector3.putByte((int)' ');
    ByteVector byteVector7 = byteVector3.putShort(0);
    ByteVector byteVector9 = byteVector7.putUTF8("");
    ByteVector byteVector11 = new ByteVector((int)(short)1);
    ByteVector byteVector13 = byteVector11.putLong((long)'#');
    ByteVector byteVector15 = byteVector11.putInt(0);
    ByteVector byteVector17 = byteVector11.putShort((int)(short)10);
    ByteVector byteVector19 = new ByteVector((int)(short)1);
    ByteVector byteVector21 = byteVector19.putLong((long)'#');
    ByteVector byteVector23 = byteVector19.putInt((int)' ');
    byte[] byte_array25 = new byte[] { (byte)-1 };
    ByteVector byteVector28 = byteVector19.putByteArray(byte_array25, (int)(short)0, (int)(byte)0);
    ByteVector byteVector31 = byteVector17.putByteArray(byte_array25, 0, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector34 = byteVector7.putByteArray(byte_array25, 100, (int)(short)100);
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
    org.junit.Assert.assertNotNull(byteVector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector31);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test153"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    byte[] byte_array7 = new byte[] { (byte)-1 };
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(short)0, (int)(byte)0);
    ByteVector byteVector12 = byteVector1.putUTF8("hi!");
    ByteVector byteVector14 = byteVector1.putLong((long)(short)1);
    ByteVector byteVector16 = byteVector1.putLong((long)'#');
    ByteVector byteVector18 = byteVector16.putByte(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test154"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putInt((int)(short)0);
    ByteVector byteVector13 = byteVector9.putByte((int)(byte)-1);
    ByteVector byteVector15 = byteVector13.putShort((int)'a');
    ByteVector byteVector17 = byteVector15.putShort((int)'a');
    ByteVector byteVector19 = byteVector17.putShort((int)(byte)-1);
    ByteVector byteVector21 = byteVector19.putLong((long)(short)0);
    
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
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test155"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector5.putShort((int)(byte)0);
    ByteVector byteVector9 = byteVector7.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector7.putShort((int)(byte)-1);
    ByteVector byteVector13 = byteVector7.putShort(0);
    ByteVector byteVector15 = byteVector13.putLong((long)(byte)-1);
    ByteVector byteVector17 = byteVector15.putByte((int)(byte)-1);
    
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
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test156"); }


    ByteVector byteVector1 = new ByteVector((int)'4');
    ByteVector byteVector3 = byteVector1.putByte((int)(byte)100);
    byte[] byte_array5 = new byte[] { (byte)-1 };
    ByteVector byteVector8 = byteVector3.putByteArray(byte_array5, (int)(byte)0, 1);
    ByteVector byteVector10 = byteVector3.putLong((long)(byte)0);
    ByteVector byteVector12 = byteVector3.putByte((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test157"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector5.putShort((int)(byte)0);
    ByteVector byteVector9 = byteVector7.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putInt(0);
    
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
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test158"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putShort((int)'#');
    ByteVector byteVector5 = byteVector3.putByte(0);
    ByteVector byteVector7 = byteVector5.putUTF8("hi!");
    ByteVector byteVector9 = byteVector5.putShort((int)(byte)-1);
    ByteVector byteVector11 = byteVector5.putLong((long)'a');
    
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
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test159"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putShort((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test160"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector5.putShort((int)(byte)0);
    ByteVector byteVector9 = byteVector7.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector7.putShort((int)(byte)-1);
    ByteVector byteVector13 = new ByteVector((int)'4');
    ByteVector byteVector15 = byteVector13.putByte((int)(byte)100);
    byte[] byte_array17 = new byte[] { (byte)-1 };
    ByteVector byteVector20 = byteVector15.putByteArray(byte_array17, (int)(byte)0, 1);
    ByteVector byteVector23 = byteVector11.putByteArray(byte_array17, 0, (int)(byte)0);
    ByteVector byteVector25 = byteVector23.putByte((int)(byte)10);
    
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
    org.junit.Assert.assertNotNull(byte_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector25);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test161"); }


    ByteVector byteVector1 = new ByteVector((int)'4');
    ByteVector byteVector3 = byteVector1.putByte((int)(byte)100);
    byte[] byte_array5 = new byte[] { (byte)-1 };
    ByteVector byteVector8 = byteVector3.putByteArray(byte_array5, (int)(byte)0, 1);
    ByteVector byteVector10 = byteVector8.putLong((long)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test162"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putInt((int)(short)0);
    ByteVector byteVector13 = byteVector9.putByte((int)(byte)-1);
    ByteVector byteVector15 = byteVector9.putUTF8("hi!");
    ByteVector byteVector17 = byteVector9.putLong((long)10);
    ByteVector byteVector19 = byteVector17.putUTF8("hi!");
    ByteVector byteVector21 = byteVector19.putShort(1);
    ByteVector byteVector23 = byteVector21.putShort((int)(short)100);
    
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
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test163"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putShort((int)(short)-1);
    ByteVector byteVector13 = byteVector11.putUTF8("");
    ByteVector byteVector15 = byteVector11.putUTF8("");
    ByteVector byteVector17 = byteVector15.putShort((int)(byte)10);
    ByteVector byteVector19 = byteVector15.putUTF8("");
    ByteVector byteVector21 = byteVector15.putUTF8("hi!");
    ByteVector byteVector23 = byteVector15.putByte(0);
    ByteVector byteVector25 = byteVector15.putUTF8("hi!");
    ByteVector byteVector27 = new ByteVector((int)'4');
    ByteVector byteVector29 = byteVector27.putByte((int)(byte)100);
    byte[] byte_array31 = new byte[] { (byte)-1 };
    ByteVector byteVector34 = byteVector29.putByteArray(byte_array31, (int)(byte)0, 1);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector37 = byteVector15.putByteArray(byte_array31, (int)'#', 10);
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
    org.junit.Assert.assertNotNull(byteVector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector34);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test164"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    byte[] byte_array7 = new byte[] { (byte)-1 };
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(short)0, (int)(byte)0);
    ByteVector byteVector12 = byteVector10.putInt((int)(byte)10);
    ByteVector byteVector14 = byteVector12.putByte((int)(byte)-1);
    ByteVector byteVector16 = byteVector14.putLong((long)(byte)0);
    ByteVector byteVector18 = byteVector16.putShort((int)(byte)-1);
    ByteVector byteVector20 = byteVector16.putByte((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test165"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    byte[] byte_array7 = new byte[] { (byte)-1 };
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(short)0, (int)(byte)0);
    ByteVector byteVector12 = byteVector1.putUTF8("hi!");
    ByteVector byteVector14 = byteVector1.putInt((int)(short)-1);
    ByteVector byteVector16 = byteVector1.putLong((long)(byte)0);
    ByteVector byteVector18 = byteVector1.putShort(10);
    ByteVector byteVector20 = byteVector1.putShort((int)(short)100);
    ByteVector byteVector22 = new ByteVector((int)(short)1);
    ByteVector byteVector24 = byteVector22.putLong((long)'#');
    ByteVector byteVector26 = byteVector22.putInt(0);
    ByteVector byteVector28 = byteVector22.putShort((int)(short)10);
    ByteVector byteVector30 = byteVector22.putUTF8("hi!");
    ByteVector byteVector32 = byteVector22.putShort((int)(short)1);
    ByteVector byteVector34 = new ByteVector((int)'4');
    ByteVector byteVector36 = byteVector34.putByte((int)(byte)100);
    byte[] byte_array38 = new byte[] { (byte)-1 };
    ByteVector byteVector41 = byteVector36.putByteArray(byte_array38, (int)(byte)0, 1);
    ByteVector byteVector44 = byteVector22.putByteArray(byte_array38, 0, 0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector47 = byteVector1.putByteArray(byte_array38, (int)(short)10, (int)' ');
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
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector44);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test166"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putShort((int)(short)-1);
    ByteVector byteVector13 = byteVector9.putUTF8("");
    ByteVector byteVector15 = byteVector13.putLong((long)'#');
    ByteVector byteVector17 = byteVector15.putLong(0L);
    ByteVector byteVector19 = byteVector15.putShort((int)(short)10);
    
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
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test167"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector3.putByte((int)' ');
    ByteVector byteVector7 = byteVector5.putInt((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test168"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector5.putInt((int)(byte)0);
    ByteVector byteVector9 = byteVector5.putShort((int)'4');
    ByteVector byteVector11 = byteVector5.putByte((int)'4');
    ByteVector byteVector13 = byteVector5.putUTF8("hi!");
    
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
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test169"); }


    ByteVector byteVector1 = new ByteVector((int)'4');
    ByteVector byteVector3 = byteVector1.putByte((int)(byte)100);
    ByteVector byteVector5 = byteVector3.putUTF8("");
    ByteVector byteVector7 = byteVector3.putLong((long)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test170"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putShort((int)(short)-1);
    ByteVector byteVector13 = byteVector9.putUTF8("");
    ByteVector byteVector15 = byteVector9.putShort(1);
    ByteVector byteVector17 = byteVector15.putByte((int)'#');
    ByteVector byteVector19 = byteVector15.putByte(100);
    ByteVector byteVector21 = byteVector15.putLong((long)'4');
    ByteVector byteVector23 = byteVector21.putLong(0L);
    
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
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test171"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    byte[] byte_array7 = new byte[] { (byte)-1 };
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(short)0, (int)(byte)0);
    ByteVector byteVector12 = byteVector1.putUTF8("hi!");
    ByteVector byteVector14 = byteVector12.putUTF8("");
    ByteVector byteVector16 = byteVector12.putUTF8("hi!");
    ByteVector byteVector18 = byteVector16.putShort((int)(byte)1);
    ByteVector byteVector20 = new ByteVector((int)(short)1);
    ByteVector byteVector22 = byteVector20.putLong((long)'#');
    ByteVector byteVector24 = byteVector20.putInt((int)' ');
    byte[] byte_array26 = new byte[] { (byte)-1 };
    ByteVector byteVector29 = byteVector20.putByteArray(byte_array26, (int)(short)0, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector32 = byteVector16.putByteArray(byte_array26, 100, (-1));
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
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector29);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test172"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = new ByteVector((int)(short)1);
    ByteVector byteVector11 = byteVector9.putLong((long)'#');
    ByteVector byteVector13 = byteVector9.putInt((int)' ');
    byte[] byte_array15 = new byte[] { (byte)-1 };
    ByteVector byteVector18 = byteVector9.putByteArray(byte_array15, (int)(short)0, (int)(byte)0);
    ByteVector byteVector21 = byteVector7.putByteArray(byte_array15, 0, (int)(short)1);
    ByteVector byteVector23 = byteVector21.putByte((int)' ');
    ByteVector byteVector25 = byteVector23.putUTF8("");
    ByteVector byteVector27 = byteVector25.putShort((int)'#');
    
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
    org.junit.Assert.assertNotNull(byte_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector27);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test173"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putInt((int)(short)0);
    ByteVector byteVector13 = byteVector9.putByte((int)(byte)-1);
    ByteVector byteVector15 = byteVector9.putUTF8("hi!");
    ByteVector byteVector17 = byteVector9.putLong((long)10);
    ByteVector byteVector19 = byteVector17.putUTF8("hi!");
    ByteVector byteVector21 = new ByteVector((int)(short)1);
    ByteVector byteVector23 = byteVector21.putLong((long)'#');
    ByteVector byteVector25 = byteVector21.putInt(0);
    ByteVector byteVector27 = byteVector25.putShort((int)(byte)0);
    ByteVector byteVector29 = byteVector27.putLong(0L);
    ByteVector byteVector31 = byteVector29.putShort((int)'a');
    ByteVector byteVector33 = new ByteVector((int)'4');
    ByteVector byteVector35 = byteVector33.putByte((int)(byte)100);
    byte[] byte_array37 = new byte[] { (byte)-1 };
    ByteVector byteVector40 = byteVector35.putByteArray(byte_array37, (int)(byte)0, 1);
    ByteVector byteVector43 = byteVector29.putByteArray(byte_array37, (int)(short)0, 1);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector46 = byteVector19.putByteArray(byte_array37, (int)'a', (int)(byte)10);
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
    org.junit.Assert.assertNotNull(byteVector35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector43);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test174"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    byte[] byte_array7 = new byte[] { (byte)-1 };
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(short)0, (int)(byte)0);
    ByteVector byteVector12 = byteVector10.putInt((int)(byte)10);
    ByteVector byteVector14 = byteVector12.putByte((int)(byte)-1);
    ByteVector byteVector16 = byteVector14.putLong((long)(byte)0);
    ByteVector byteVector18 = byteVector16.putShort((int)(byte)-1);
    ByteVector byteVector20 = byteVector16.putByte((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test175"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putShort((int)(short)-1);
    ByteVector byteVector13 = byteVector9.putUTF8("");
    ByteVector byteVector15 = byteVector9.putShort(1);
    ByteVector byteVector17 = byteVector15.putByte((int)'#');
    ByteVector byteVector19 = byteVector15.putShort(0);
    ByteVector byteVector21 = byteVector15.putByte((int)'#');
    
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
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test176"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector1.putUTF8("");
    ByteVector byteVector13 = byteVector11.putLong((long)(short)100);
    ByteVector byteVector15 = byteVector11.putInt(10);
    ByteVector byteVector17 = byteVector15.putLong((long)(byte)0);
    
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
    ByteVector byteVector3 = byteVector1.putLong(0L);
    ByteVector byteVector5 = byteVector3.putLong((long)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test178"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putUTF8("hi!");
    ByteVector byteVector11 = byteVector1.putLong((long)'4');
    ByteVector byteVector13 = byteVector11.putInt((-1));
    
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
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test179"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putInt((int)(short)0);
    ByteVector byteVector13 = byteVector9.putByte((int)(byte)-1);
    ByteVector byteVector15 = byteVector13.putShort((int)'a');
    ByteVector byteVector17 = byteVector15.putShort((int)'a');
    ByteVector byteVector19 = byteVector17.putShort((int)(byte)-1);
    ByteVector byteVector21 = byteVector17.putByte(100);
    
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
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test180"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putInt((int)(short)0);
    ByteVector byteVector13 = new ByteVector((int)(short)1);
    ByteVector byteVector15 = byteVector13.putLong((long)'#');
    ByteVector byteVector17 = byteVector13.putInt(0);
    ByteVector byteVector19 = byteVector17.putShort((int)(byte)0);
    ByteVector byteVector21 = byteVector19.putLong(0L);
    ByteVector byteVector23 = byteVector21.putShort((int)'a');
    ByteVector byteVector25 = new ByteVector((int)'4');
    ByteVector byteVector27 = byteVector25.putByte((int)(byte)100);
    byte[] byte_array29 = new byte[] { (byte)-1 };
    ByteVector byteVector32 = byteVector27.putByteArray(byte_array29, (int)(byte)0, 1);
    ByteVector byteVector35 = byteVector21.putByteArray(byte_array29, (int)(short)0, 1);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector38 = byteVector11.putByteArray(byte_array29, (int)(byte)-1, (int)(short)10);
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
    org.junit.Assert.assertNotNull(byteVector27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector35);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test181"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector3.putByte((int)' ');
    ByteVector byteVector7 = byteVector3.putUTF8("hi!");
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
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test182"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    ByteVector byteVector7 = byteVector1.putUTF8("");
    ByteVector byteVector9 = byteVector7.putInt((int)(byte)10);
    ByteVector byteVector11 = new ByteVector((int)(short)1);
    ByteVector byteVector13 = byteVector11.putLong((long)'#');
    ByteVector byteVector15 = byteVector11.putInt(0);
    ByteVector byteVector17 = byteVector15.putShort((int)(byte)0);
    ByteVector byteVector19 = byteVector17.putByte((int)(short)0);
    ByteVector byteVector21 = byteVector17.putShort((int)(byte)-1);
    ByteVector byteVector23 = new ByteVector((int)'4');
    ByteVector byteVector25 = byteVector23.putByte((int)(byte)100);
    byte[] byte_array27 = new byte[] { (byte)-1 };
    ByteVector byteVector30 = byteVector25.putByteArray(byte_array27, (int)(byte)0, 1);
    ByteVector byteVector33 = byteVector21.putByteArray(byte_array27, 0, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector36 = byteVector7.putByteArray(byte_array27, 0, (int)'4');
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
    org.junit.Assert.assertNotNull(byteVector25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector33);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test183"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector3.putLong((long)(-1));
    ByteVector byteVector7 = byteVector5.putLong((long)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test184"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putShort((int)'#');
    ByteVector byteVector5 = byteVector3.putByte(0);
    ByteVector byteVector7 = byteVector5.putUTF8("hi!");
    ByteVector byteVector9 = byteVector5.putShort((int)(byte)-1);
    ByteVector byteVector11 = byteVector5.putUTF8("hi!");
    ByteVector byteVector13 = byteVector5.putInt(0);
    ByteVector byteVector15 = byteVector13.putByte((-1));
    
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
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test185"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    byte[] byte_array7 = new byte[] { (byte)-1 };
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(short)0, (int)(byte)0);
    ByteVector byteVector12 = byteVector10.putInt((int)(short)-1);
    ByteVector byteVector14 = byteVector10.putByte((-1));
    ByteVector byteVector16 = byteVector10.putShort((int)(short)10);
    ByteVector byteVector18 = byteVector10.putLong((long)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test186"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    ByteVector byteVector7 = byteVector1.putShort((int)(short)-1);
    ByteVector byteVector9 = byteVector1.putLong((long)(-1));
    ByteVector byteVector11 = byteVector9.putShort((int)'a');
    
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
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test187"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector5.putShort((int)(byte)0);
    ByteVector byteVector9 = byteVector7.putInt((int)(short)-1);
    ByteVector byteVector11 = byteVector7.putShort(0);
    ByteVector byteVector13 = byteVector11.putShort((int)'#');
    ByteVector byteVector15 = byteVector13.putByte(1);
    ByteVector byteVector17 = new ByteVector((int)(short)1);
    ByteVector byteVector19 = byteVector17.putLong((long)'#');
    ByteVector byteVector21 = byteVector17.putInt(0);
    ByteVector byteVector23 = byteVector21.putShort((int)(byte)0);
    ByteVector byteVector25 = byteVector23.putByte((int)(short)0);
    ByteVector byteVector27 = byteVector23.putShort((int)(byte)-1);
    ByteVector byteVector29 = new ByteVector((int)'4');
    ByteVector byteVector31 = byteVector29.putByte((int)(byte)100);
    byte[] byte_array33 = new byte[] { (byte)-1 };
    ByteVector byteVector36 = byteVector31.putByteArray(byte_array33, (int)(byte)0, 1);
    ByteVector byteVector39 = byteVector27.putByteArray(byte_array33, 0, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector42 = byteVector15.putByteArray(byte_array33, (int)(short)10, (int)(short)0);
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
    org.junit.Assert.assertNotNull(byteVector31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector39);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test188"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector3.putShort((int)'4');
    ByteVector byteVector7 = byteVector3.putInt(0);
    ByteVector byteVector9 = byteVector7.putByte((int)' ');
    ByteVector byteVector11 = byteVector7.putByte(1);
    
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
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test189"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putShort((int)(short)-1);
    ByteVector byteVector13 = byteVector9.putUTF8("");
    ByteVector byteVector15 = byteVector13.putLong((long)'#');
    ByteVector byteVector17 = byteVector15.putLong(0L);
    ByteVector byteVector19 = byteVector17.putByte((-1));
    ByteVector byteVector21 = byteVector19.putUTF8("hi!");
    
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
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test190"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    byte[] byte_array7 = new byte[] { (byte)-1 };
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(short)0, (int)(byte)0);
    ByteVector byteVector12 = byteVector1.putUTF8("hi!");
    ByteVector byteVector14 = byteVector12.putUTF8("");
    ByteVector byteVector16 = byteVector12.putUTF8("hi!");
    ByteVector byteVector18 = byteVector16.putShort((int)(byte)1);
    ByteVector byteVector20 = byteVector16.putInt((int)(short)0);
    ByteVector byteVector22 = new ByteVector((int)(short)1);
    ByteVector byteVector24 = byteVector22.putLong((long)'#');
    ByteVector byteVector26 = byteVector22.putInt(0);
    ByteVector byteVector28 = byteVector22.putShort((int)(short)10);
    ByteVector byteVector30 = byteVector22.putUTF8("hi!");
    ByteVector byteVector32 = byteVector22.putShort((int)(short)1);
    ByteVector byteVector34 = new ByteVector((int)'4');
    ByteVector byteVector36 = byteVector34.putByte((int)(byte)100);
    byte[] byte_array38 = new byte[] { (byte)-1 };
    ByteVector byteVector41 = byteVector36.putByteArray(byte_array38, (int)(byte)0, 1);
    ByteVector byteVector44 = byteVector22.putByteArray(byte_array38, 0, 0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector47 = byteVector16.putByteArray(byte_array38, (int)(short)10, (int)'#');
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
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector44);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test191"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    byte[] byte_array7 = new byte[] { (byte)-1 };
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(short)0, (int)(byte)0);
    ByteVector byteVector12 = byteVector10.putInt((int)(byte)10);
    ByteVector byteVector14 = byteVector12.putByte((int)(byte)-1);
    ByteVector byteVector16 = byteVector12.putUTF8("hi!");
    ByteVector byteVector18 = new ByteVector((int)(short)1);
    ByteVector byteVector20 = byteVector18.putLong((long)'#');
    ByteVector byteVector22 = byteVector20.putByte((int)' ');
    ByteVector byteVector24 = byteVector20.putShort(0);
    ByteVector byteVector26 = byteVector20.putInt((int)(short)100);
    ByteVector byteVector28 = new ByteVector((int)(short)1);
    ByteVector byteVector30 = byteVector28.putLong((long)'#');
    ByteVector byteVector32 = byteVector28.putInt((int)' ');
    byte[] byte_array34 = new byte[] { (byte)-1 };
    ByteVector byteVector37 = byteVector28.putByteArray(byte_array34, (int)(short)0, (int)(byte)0);
    ByteVector byteVector40 = byteVector20.putByteArray(byte_array34, (int)(byte)0, 0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector43 = byteVector16.putByteArray(byte_array34, (-1), (int)' ');
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
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector40);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test192"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putShort((int)(short)-1);
    ByteVector byteVector13 = byteVector11.putUTF8("");
    ByteVector byteVector15 = byteVector11.putUTF8("");
    ByteVector byteVector17 = byteVector15.putShort((int)(byte)10);
    ByteVector byteVector19 = byteVector15.putUTF8("");
    ByteVector byteVector21 = byteVector15.putUTF8("hi!");
    ByteVector byteVector23 = byteVector15.putByte(0);
    ByteVector byteVector25 = byteVector23.putUTF8("hi!");
    ByteVector byteVector27 = byteVector23.putUTF8("hi!");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector27);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test193"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putShort((int)(short)-1);
    ByteVector byteVector13 = byteVector11.putUTF8("");
    ByteVector byteVector15 = byteVector11.putUTF8("");
    ByteVector byteVector17 = byteVector15.putShort((int)(byte)10);
    ByteVector byteVector19 = byteVector15.putUTF8("");
    ByteVector byteVector21 = byteVector15.putUTF8("hi!");
    ByteVector byteVector23 = byteVector15.putByte(0);
    ByteVector byteVector25 = byteVector23.putUTF8("hi!");
    ByteVector byteVector27 = byteVector23.putShort((int)(short)1);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector27);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test194"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector3.putShort((int)'4');
    ByteVector byteVector7 = byteVector3.putInt(0);
    ByteVector byteVector9 = byteVector7.putByte((int)' ');
    ByteVector byteVector11 = byteVector9.putShort((int)(short)100);
    ByteVector byteVector13 = byteVector9.putInt((int)'a');
    ByteVector byteVector15 = byteVector9.putShort((int)(byte)1);
    
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
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test195"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector5.putShort((int)(byte)0);
    ByteVector byteVector9 = byteVector7.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector7.putShort((int)(byte)-1);
    ByteVector byteVector13 = byteVector7.putShort(0);
    ByteVector byteVector15 = byteVector13.putLong((long)(byte)-1);
    ByteVector byteVector17 = byteVector15.putInt((int)'4');
    
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
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test196"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    byte[] byte_array7 = new byte[] { (byte)-1 };
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(short)0, (int)(byte)0);
    ByteVector byteVector12 = byteVector1.putUTF8("hi!");
    ByteVector byteVector14 = byteVector12.putUTF8("");
    ByteVector byteVector16 = byteVector14.putLong((long)(short)0);
    ByteVector byteVector18 = byteVector14.putShort((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test197"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector5.putShort((int)(byte)0);
    ByteVector byteVector9 = byteVector7.putInt((int)(short)-1);
    ByteVector byteVector11 = byteVector7.putShort(0);
    ByteVector byteVector13 = byteVector11.putShort((int)'#');
    ByteVector byteVector15 = byteVector11.putInt((int)(short)100);
    ByteVector byteVector17 = byteVector11.putLong((long)(byte)10);
    
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
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test198"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putShort((int)(short)-1);
    ByteVector byteVector13 = byteVector9.putUTF8("");
    ByteVector byteVector15 = byteVector13.putLong((long)'#');
    ByteVector byteVector17 = byteVector15.putInt((int)'#');
    ByteVector byteVector19 = byteVector15.putLong(10L);
    
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
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test199"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector5.putShort((int)(byte)0);
    ByteVector byteVector9 = byteVector7.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector7.putShort((int)(byte)-1);
    ByteVector byteVector13 = byteVector7.putShort(0);
    ByteVector byteVector15 = byteVector13.putLong((long)(byte)-1);
    ByteVector byteVector17 = byteVector13.putInt((int)(byte)-1);
    ByteVector byteVector19 = byteVector17.putShort((int)(byte)10);
    
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
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test200"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector3.putByte((int)' ');
    ByteVector byteVector7 = byteVector3.putShort(0);
    ByteVector byteVector9 = byteVector7.putUTF8("hi!");
    ByteVector byteVector11 = byteVector7.putUTF8("hi!");
    
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
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test201"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putInt((int)(short)0);
    ByteVector byteVector13 = byteVector9.putByte((int)(byte)-1);
    ByteVector byteVector15 = byteVector9.putUTF8("hi!");
    ByteVector byteVector17 = byteVector9.putLong((long)10);
    ByteVector byteVector19 = byteVector17.putUTF8("hi!");
    ByteVector byteVector21 = byteVector19.putShort(1);
    ByteVector byteVector23 = byteVector21.putShort((int)'#');
    ByteVector byteVector25 = byteVector23.putInt(0);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector25);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test202"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector3.putByte((int)' ');
    ByteVector byteVector7 = byteVector5.putLong((long)0);
    ByteVector byteVector9 = byteVector7.putInt(1);
    
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
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test203"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    byte[] byte_array7 = new byte[] { (byte)-1 };
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(short)0, (int)(byte)0);
    ByteVector byteVector12 = byteVector1.putUTF8("hi!");
    ByteVector byteVector14 = byteVector12.putByte(0);
    ByteVector byteVector16 = new ByteVector((int)(short)1);
    ByteVector byteVector18 = byteVector16.putLong((long)'#');
    ByteVector byteVector20 = byteVector16.putInt(0);
    ByteVector byteVector22 = byteVector16.putShort((int)(short)10);
    ByteVector byteVector24 = byteVector16.putByte((int)(short)0);
    ByteVector byteVector26 = byteVector16.putUTF8("");
    ByteVector byteVector28 = new ByteVector((int)(short)1);
    ByteVector byteVector30 = byteVector28.putLong((long)'#');
    ByteVector byteVector32 = byteVector28.putInt(0);
    ByteVector byteVector34 = byteVector32.putShort((int)(byte)0);
    ByteVector byteVector36 = byteVector34.putLong(0L);
    ByteVector byteVector38 = byteVector36.putShort((int)'a');
    ByteVector byteVector40 = new ByteVector((int)'4');
    ByteVector byteVector42 = byteVector40.putByte((int)(byte)100);
    byte[] byte_array44 = new byte[] { (byte)-1 };
    ByteVector byteVector47 = byteVector42.putByteArray(byte_array44, (int)(byte)0, 1);
    ByteVector byteVector50 = byteVector36.putByteArray(byte_array44, (int)(short)0, 1);
    ByteVector byteVector53 = byteVector26.putByteArray(byte_array44, (int)(byte)0, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector56 = byteVector14.putByteArray(byte_array44, (int)'a', (int)'a');
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
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector53);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test204"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putInt((int)(short)0);
    ByteVector byteVector13 = byteVector9.putByte((int)(byte)-1);
    ByteVector byteVector15 = byteVector13.putShort((int)'a');
    ByteVector byteVector17 = byteVector15.putShort((int)'a');
    ByteVector byteVector19 = byteVector15.putInt((int)(short)10);
    
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
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test205"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector3.putShort((int)'4');
    ByteVector byteVector7 = byteVector3.putInt(0);
    ByteVector byteVector9 = new ByteVector((int)'4');
    ByteVector byteVector11 = byteVector9.putByte((int)(byte)100);
    byte[] byte_array13 = new byte[] { (byte)-1 };
    ByteVector byteVector16 = byteVector11.putByteArray(byte_array13, (int)(byte)0, 1);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector19 = byteVector3.putByteArray(byte_array13, (int)(short)1, (int)'a');
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
    org.junit.Assert.assertNotNull(byte_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test206"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    ByteVector byteVector7 = byteVector1.putUTF8("");
    ByteVector byteVector9 = byteVector7.putInt((int)(byte)10);
    ByteVector byteVector11 = byteVector7.putLong((long)(byte)100);
    ByteVector byteVector13 = byteVector7.putByte(100);
    
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
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test207"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector1.putUTF8("");
    ByteVector byteVector13 = byteVector11.putLong((long)(short)100);
    ByteVector byteVector15 = byteVector11.putInt(10);
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
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test208"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    byte[] byte_array7 = new byte[] { (byte)-1 };
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(short)0, (int)(byte)0);
    ByteVector byteVector12 = byteVector1.putUTF8("hi!");
    ByteVector byteVector14 = new ByteVector((int)(short)1);
    ByteVector byteVector16 = byteVector14.putLong((long)'#');
    ByteVector byteVector18 = byteVector14.putInt(0);
    ByteVector byteVector20 = byteVector14.putShort((int)(short)10);
    ByteVector byteVector22 = byteVector14.putUTF8("hi!");
    ByteVector byteVector24 = byteVector14.putShort((int)(short)1);
    ByteVector byteVector26 = new ByteVector((int)'4');
    ByteVector byteVector28 = byteVector26.putByte((int)(byte)100);
    byte[] byte_array30 = new byte[] { (byte)-1 };
    ByteVector byteVector33 = byteVector28.putByteArray(byte_array30, (int)(byte)0, 1);
    ByteVector byteVector36 = byteVector14.putByteArray(byte_array30, 0, 0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector39 = byteVector1.putByteArray(byte_array30, (int)(short)100, (int)'a');
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
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector36);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test209"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector5.putInt((int)(byte)0);
    ByteVector byteVector9 = byteVector7.putLong(0L);
    ByteVector byteVector11 = byteVector7.putLong((long)' ');
    ByteVector byteVector13 = byteVector11.putUTF8("hi!");
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
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test210"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putShort((int)(short)-1);
    ByteVector byteVector13 = byteVector9.putUTF8("hi!");
    ByteVector byteVector15 = byteVector13.putByte(100);
    ByteVector byteVector17 = byteVector13.putInt((int)'#');
    ByteVector byteVector19 = byteVector17.putByte((int)' ');
    ByteVector byteVector21 = byteVector19.putInt((-1));
    ByteVector byteVector23 = byteVector19.putShort((int)'a');
    ByteVector byteVector25 = byteVector23.putUTF8("hi!");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector25);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test211"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector3.putByte((int)' ');
    ByteVector byteVector7 = byteVector3.putShort(0);
    ByteVector byteVector9 = byteVector3.putInt((int)(short)100);
    ByteVector byteVector11 = byteVector3.putLong((long)'a');
    ByteVector byteVector13 = byteVector3.putLong((long)(byte)-1);
    byte[] byte_array14 = null;
    ByteVector byteVector17 = byteVector3.putByteArray(byte_array14, (int)(byte)-1, (int)(byte)0);
    ByteVector byteVector19 = new ByteVector((int)(short)1);
    ByteVector byteVector21 = byteVector19.putLong((long)'#');
    ByteVector byteVector23 = byteVector19.putInt((int)' ');
    ByteVector byteVector25 = byteVector23.putShort(1);
    ByteVector byteVector27 = byteVector23.putInt((int)(short)10);
    ByteVector byteVector29 = byteVector27.putByte((int)(short)1);
    ByteVector byteVector31 = byteVector27.putShort((int)(byte)10);
    ByteVector byteVector33 = new ByteVector((int)(short)1);
    ByteVector byteVector35 = byteVector33.putLong((long)'#');
    ByteVector byteVector37 = byteVector33.putInt(0);
    ByteVector byteVector39 = byteVector33.putShort((int)(short)10);
    ByteVector byteVector41 = byteVector33.putByte((int)(short)0);
    ByteVector byteVector43 = byteVector33.putUTF8("");
    ByteVector byteVector45 = new ByteVector((int)(short)1);
    ByteVector byteVector47 = byteVector45.putLong((long)'#');
    ByteVector byteVector49 = byteVector45.putInt(0);
    ByteVector byteVector51 = byteVector49.putShort((int)(byte)0);
    ByteVector byteVector53 = byteVector51.putLong(0L);
    ByteVector byteVector55 = byteVector53.putShort((int)'a');
    ByteVector byteVector57 = new ByteVector((int)'4');
    ByteVector byteVector59 = byteVector57.putByte((int)(byte)100);
    byte[] byte_array61 = new byte[] { (byte)-1 };
    ByteVector byteVector64 = byteVector59.putByteArray(byte_array61, (int)(byte)0, 1);
    ByteVector byteVector67 = byteVector53.putByteArray(byte_array61, (int)(short)0, 1);
    ByteVector byteVector70 = byteVector43.putByteArray(byte_array61, (int)(byte)0, (int)(short)0);
    ByteVector byteVector73 = byteVector31.putByteArray(byte_array61, (int)(byte)1, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector76 = byteVector17.putByteArray(byte_array61, 10, (int)(short)1);
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
    org.junit.Assert.assertNotNull(byteVector47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector73);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test212"); }


    ByteVector byteVector1 = new ByteVector((int)'4');
    ByteVector byteVector3 = byteVector1.putByte((int)(byte)100);
    byte[] byte_array5 = new byte[] { (byte)-1 };
    ByteVector byteVector8 = byteVector3.putByteArray(byte_array5, (int)(byte)0, 1);
    ByteVector byteVector10 = byteVector3.putLong((long)(byte)0);
    ByteVector byteVector12 = byteVector3.putUTF8("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test213"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    ByteVector byteVector7 = byteVector5.putShort(1);
    ByteVector byteVector9 = byteVector5.putInt((int)(short)10);
    ByteVector byteVector11 = byteVector5.putInt((int)'#');
    ByteVector byteVector13 = new ByteVector((int)(short)1);
    ByteVector byteVector15 = byteVector13.putLong((long)'#');
    ByteVector byteVector17 = byteVector13.putInt(0);
    ByteVector byteVector19 = byteVector17.putShort((int)(byte)0);
    ByteVector byteVector21 = byteVector19.putLong(0L);
    ByteVector byteVector23 = byteVector21.putShort((int)'a');
    ByteVector byteVector25 = new ByteVector((int)'4');
    ByteVector byteVector27 = byteVector25.putByte((int)(byte)100);
    byte[] byte_array29 = new byte[] { (byte)-1 };
    ByteVector byteVector32 = byteVector27.putByteArray(byte_array29, (int)(byte)0, 1);
    ByteVector byteVector35 = byteVector21.putByteArray(byte_array29, (int)(short)0, 1);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector38 = byteVector5.putByteArray(byte_array29, (int)'a', 100);
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
    org.junit.Assert.assertNotNull(byteVector27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector35);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test214"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    byte[] byte_array7 = new byte[] { (byte)-1 };
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(short)0, (int)(byte)0);
    ByteVector byteVector12 = byteVector1.putLong((long)10);
    ByteVector byteVector14 = new ByteVector((int)(short)1);
    ByteVector byteVector16 = byteVector14.putLong((long)'#');
    ByteVector byteVector18 = byteVector14.putInt((int)' ');
    byte[] byte_array20 = new byte[] { (byte)-1 };
    ByteVector byteVector23 = byteVector14.putByteArray(byte_array20, (int)(short)0, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector26 = byteVector12.putByteArray(byte_array20, (int)(short)100, (-1));
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
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test215"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putUTF8("hi!");
    ByteVector byteVector11 = byteVector1.putByte(10);
    
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
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test216"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putShort((int)(short)-1);
    ByteVector byteVector13 = byteVector11.putUTF8("");
    ByteVector byteVector15 = byteVector11.putUTF8("");
    ByteVector byteVector17 = byteVector15.putShort((int)(byte)10);
    ByteVector byteVector19 = byteVector15.putUTF8("");
    ByteVector byteVector21 = byteVector15.putUTF8("hi!");
    ByteVector byteVector23 = byteVector15.putLong((long)(byte)10);
    
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
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test217"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector3.putShort((int)'4');
    ByteVector byteVector7 = byteVector3.putInt(0);
    ByteVector byteVector9 = new ByteVector((int)(short)1);
    ByteVector byteVector11 = byteVector9.putLong((long)'#');
    ByteVector byteVector13 = byteVector9.putInt((int)' ');
    byte[] byte_array15 = new byte[] { (byte)-1 };
    ByteVector byteVector18 = byteVector9.putByteArray(byte_array15, (int)(short)0, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector21 = byteVector3.putByteArray(byte_array15, (int)(short)10, 100);
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
    org.junit.Assert.assertNotNull(byte_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test218"); }


    ByteVector byteVector1 = new ByteVector((int)'4');
    ByteVector byteVector3 = byteVector1.putByte((int)(byte)100);
    byte[] byte_array5 = new byte[] { (byte)-1 };
    ByteVector byteVector8 = byteVector3.putByteArray(byte_array5, (int)(byte)0, 1);
    ByteVector byteVector10 = byteVector3.putLong((long)(byte)0);
    ByteVector byteVector12 = byteVector10.putUTF8("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test219"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putInt((int)(short)0);
    ByteVector byteVector13 = byteVector9.putByte((int)(byte)-1);
    ByteVector byteVector15 = byteVector9.putUTF8("hi!");
    ByteVector byteVector17 = byteVector9.putLong((long)10);
    byte[] byte_array18 = null;
    ByteVector byteVector21 = byteVector9.putByteArray(byte_array18, (int)' ', (int)'#');
    ByteVector byteVector23 = byteVector9.putLong((long)0);
    
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

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test220"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    ByteVector byteVector7 = byteVector5.putShort(1);
    ByteVector byteVector9 = byteVector5.putInt((int)(short)10);
    ByteVector byteVector11 = byteVector9.putLong((long)0);
    
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
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test221"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putShort((int)'#');
    ByteVector byteVector5 = byteVector3.putByte(0);
    ByteVector byteVector7 = byteVector5.putByte((-1));
    ByteVector byteVector9 = new ByteVector((int)(short)1);
    ByteVector byteVector11 = byteVector9.putLong((long)'#');
    ByteVector byteVector13 = byteVector11.putByte((int)' ');
    ByteVector byteVector15 = byteVector13.putLong((long)0);
    ByteVector byteVector17 = byteVector13.putUTF8("hi!");
    ByteVector byteVector19 = byteVector17.putByte((int)(byte)-1);
    ByteVector byteVector21 = new ByteVector((int)(short)1);
    ByteVector byteVector23 = byteVector21.putLong((long)'#');
    ByteVector byteVector25 = byteVector21.putInt(0);
    ByteVector byteVector27 = byteVector21.putShort((int)(short)10);
    ByteVector byteVector29 = new ByteVector((int)(short)1);
    ByteVector byteVector31 = byteVector29.putLong((long)'#');
    ByteVector byteVector33 = byteVector29.putInt((int)' ');
    byte[] byte_array35 = new byte[] { (byte)-1 };
    ByteVector byteVector38 = byteVector29.putByteArray(byte_array35, (int)(short)0, (int)(byte)0);
    ByteVector byteVector41 = byteVector27.putByteArray(byte_array35, 0, (int)(short)1);
    ByteVector byteVector44 = byteVector17.putByteArray(byte_array35, (int)(byte)0, 1);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector47 = byteVector7.putByteArray(byte_array35, (int)'#', (int)'4');
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
    org.junit.Assert.assertNotNull(byte_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector44);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test222"); }


    ByteVector byteVector1 = new ByteVector((int)'#');
    ByteVector byteVector3 = byteVector1.putShort((int)(short)100);
    ByteVector byteVector5 = byteVector3.putShort((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test223"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putShort((int)(short)-1);
    ByteVector byteVector13 = new ByteVector((int)(short)1);
    ByteVector byteVector15 = byteVector13.putLong((long)'#');
    ByteVector byteVector17 = byteVector13.putInt(0);
    ByteVector byteVector19 = byteVector13.putShort((int)(short)10);
    ByteVector byteVector21 = byteVector13.putByte((int)(short)0);
    ByteVector byteVector23 = byteVector21.putShort((int)(short)-1);
    ByteVector byteVector25 = byteVector21.putUTF8("");
    ByteVector byteVector27 = byteVector21.putShort(1);
    ByteVector byteVector29 = new ByteVector((int)'4');
    ByteVector byteVector31 = byteVector29.putByte((int)(byte)100);
    byte[] byte_array33 = new byte[] { (byte)-1 };
    ByteVector byteVector36 = byteVector31.putByteArray(byte_array33, (int)(byte)0, 1);
    ByteVector byteVector39 = byteVector21.putByteArray(byte_array33, 1, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector42 = byteVector9.putByteArray(byte_array33, 1, (-1));
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
    org.junit.Assert.assertNotNull(byteVector31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector39);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test224"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    byte[] byte_array7 = new byte[] { (byte)-1 };
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(short)0, (int)(byte)0);
    ByteVector byteVector12 = byteVector10.putInt((int)(byte)10);
    ByteVector byteVector14 = byteVector12.putByte((int)(byte)-1);
    ByteVector byteVector16 = new ByteVector((int)(short)1);
    ByteVector byteVector18 = byteVector16.putLong((long)'#');
    ByteVector byteVector20 = byteVector16.putInt(0);
    ByteVector byteVector22 = byteVector20.putShort((int)(byte)0);
    ByteVector byteVector24 = byteVector22.putLong(0L);
    ByteVector byteVector26 = byteVector24.putShort((int)'a');
    ByteVector byteVector28 = new ByteVector((int)'4');
    ByteVector byteVector30 = byteVector28.putByte((int)(byte)100);
    byte[] byte_array32 = new byte[] { (byte)-1 };
    ByteVector byteVector35 = byteVector30.putByteArray(byte_array32, (int)(byte)0, 1);
    ByteVector byteVector38 = byteVector24.putByteArray(byte_array32, (int)(short)0, 1);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector41 = byteVector12.putByteArray(byte_array32, (int)(byte)10, 10);
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
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector38);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test225"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    byte[] byte_array7 = new byte[] { (byte)-1 };
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(short)0, (int)(byte)0);
    ByteVector byteVector12 = byteVector10.putInt((int)(short)-1);
    ByteVector byteVector14 = byteVector10.putByte((-1));
    ByteVector byteVector16 = byteVector10.putShort((int)(short)0);
    ByteVector byteVector18 = byteVector10.putLong(100L);
    ByteVector byteVector20 = byteVector18.putShort((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test226"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putInt((int)(short)0);
    ByteVector byteVector13 = byteVector9.putByte((int)(byte)-1);
    ByteVector byteVector15 = byteVector13.putShort((int)'a');
    ByteVector byteVector17 = byteVector13.putShort((int)(short)10);
    ByteVector byteVector19 = byteVector17.putShort(1);
    ByteVector byteVector21 = new ByteVector((int)(short)1);
    ByteVector byteVector23 = byteVector21.putLong((long)'#');
    ByteVector byteVector25 = byteVector23.putByte((int)' ');
    ByteVector byteVector27 = byteVector23.putShort(0);
    ByteVector byteVector29 = byteVector23.putInt((int)(short)100);
    ByteVector byteVector31 = new ByteVector((int)(short)1);
    ByteVector byteVector33 = byteVector31.putLong((long)'#');
    ByteVector byteVector35 = byteVector31.putInt((int)' ');
    byte[] byte_array37 = new byte[] { (byte)-1 };
    ByteVector byteVector40 = byteVector31.putByteArray(byte_array37, (int)(short)0, (int)(byte)0);
    ByteVector byteVector43 = byteVector23.putByteArray(byte_array37, (int)(byte)0, 0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector46 = byteVector17.putByteArray(byte_array37, (int)(byte)0, (int)'a');
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
    org.junit.Assert.assertNotNull(byteVector33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector43);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test227"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    byte[] byte_array7 = new byte[] { (byte)-1 };
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(short)0, (int)(byte)0);
    ByteVector byteVector12 = byteVector1.putUTF8("hi!");
    ByteVector byteVector14 = byteVector12.putByte((int)(short)-1);
    ByteVector byteVector16 = byteVector12.putInt(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test228"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putShort((int)'#');
    ByteVector byteVector5 = byteVector3.putByte(0);
    ByteVector byteVector7 = byteVector5.putUTF8("hi!");
    ByteVector byteVector9 = byteVector5.putUTF8("hi!");
    ByteVector byteVector11 = byteVector9.putInt((-1));
    ByteVector byteVector13 = byteVector11.putInt((int)(short)-1);
    
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
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test229"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector5.putShort((int)(byte)0);
    ByteVector byteVector9 = byteVector7.putShort(10);
    ByteVector byteVector11 = byteVector9.putInt((-1));
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
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test230"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putShort((int)'#');
    ByteVector byteVector5 = byteVector3.putByte(0);
    ByteVector byteVector7 = byteVector3.putUTF8("");
    ByteVector byteVector9 = byteVector7.putByte((int)(byte)1);
    ByteVector byteVector11 = byteVector7.putByte((int)(short)10);
    ByteVector byteVector13 = new ByteVector((int)'4');
    ByteVector byteVector15 = byteVector13.putByte((int)(byte)100);
    byte[] byte_array17 = new byte[] { (byte)-1 };
    ByteVector byteVector20 = byteVector15.putByteArray(byte_array17, (int)(byte)0, 1);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector23 = byteVector11.putByteArray(byte_array17, (int)' ', (-1));
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
    org.junit.Assert.assertNotNull(byte_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test231"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putShort((int)(short)-1);
    ByteVector byteVector13 = byteVector9.putByte(1);
    ByteVector byteVector15 = byteVector13.putLong(10L);
    
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
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test232"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector3.putShort((int)'4');
    ByteVector byteVector7 = byteVector3.putInt(0);
    ByteVector byteVector9 = byteVector7.putByte((int)' ');
    ByteVector byteVector11 = byteVector9.putShort((int)(short)100);
    ByteVector byteVector13 = byteVector9.putInt((int)'a');
    ByteVector byteVector15 = byteVector13.putUTF8("hi!");
    ByteVector byteVector17 = byteVector13.putLong((long)(byte)100);
    ByteVector byteVector19 = byteVector13.putInt((int)(short)10);
    
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
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test233"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    byte[] byte_array7 = new byte[] { (byte)-1 };
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(short)0, (int)(byte)0);
    ByteVector byteVector12 = byteVector1.putLong((long)10);
    ByteVector byteVector14 = byteVector12.putByte((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test234"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    byte[] byte_array7 = new byte[] { (byte)-1 };
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(short)0, (int)(byte)0);
    ByteVector byteVector12 = byteVector1.putLong((long)10);
    ByteVector byteVector14 = byteVector12.putLong((long)(-1));
    ByteVector byteVector16 = byteVector14.putLong(0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test235"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putInt((int)(short)0);
    ByteVector byteVector13 = byteVector9.putByte((int)(byte)-1);
    ByteVector byteVector15 = byteVector9.putByte((int)(short)-1);
    ByteVector byteVector17 = byteVector9.putShort((int)(byte)100);
    ByteVector byteVector19 = byteVector9.putUTF8("hi!");
    
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
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test236"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    byte[] byte_array7 = new byte[] { (byte)-1 };
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(short)0, (int)(byte)0);
    ByteVector byteVector12 = byteVector1.putInt((int)' ');
    ByteVector byteVector14 = byteVector1.putByte((int)(short)1);
    ByteVector byteVector16 = byteVector1.putLong((long)(byte)1);
    ByteVector byteVector18 = byteVector1.putInt(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test237"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putShort((int)(short)-1);
    ByteVector byteVector13 = byteVector9.putUTF8("");
    ByteVector byteVector15 = byteVector9.putUTF8("hi!");
    ByteVector byteVector17 = new ByteVector((int)(short)1);
    ByteVector byteVector19 = byteVector17.putLong((long)'#');
    ByteVector byteVector21 = byteVector17.putInt(0);
    ByteVector byteVector23 = byteVector21.putShort((int)(byte)0);
    ByteVector byteVector25 = byteVector23.putByte((int)(short)0);
    ByteVector byteVector27 = byteVector23.putShort((int)(byte)-1);
    ByteVector byteVector29 = new ByteVector((int)'4');
    ByteVector byteVector31 = byteVector29.putByte((int)(byte)100);
    byte[] byte_array33 = new byte[] { (byte)-1 };
    ByteVector byteVector36 = byteVector31.putByteArray(byte_array33, (int)(byte)0, 1);
    ByteVector byteVector39 = byteVector27.putByteArray(byte_array33, 0, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector42 = byteVector15.putByteArray(byte_array33, 0, 10);
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
    org.junit.Assert.assertNotNull(byteVector31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector39);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test238"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    byte[] byte_array7 = new byte[] { (byte)-1 };
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(short)0, (int)(byte)0);
    ByteVector byteVector12 = byteVector1.putUTF8("hi!");
    ByteVector byteVector14 = byteVector12.putUTF8("");
    ByteVector byteVector16 = byteVector12.putUTF8("");
    ByteVector byteVector18 = byteVector12.putByte(10);
    ByteVector byteVector20 = byteVector12.putByte(100);
    ByteVector byteVector22 = byteVector20.putByte((-1));
    ByteVector byteVector24 = byteVector20.putLong((long)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector24);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test239"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putShort((int)'#');
    ByteVector byteVector5 = byteVector3.putByte(0);
    ByteVector byteVector7 = byteVector5.putUTF8("hi!");
    ByteVector byteVector9 = byteVector5.putShort((int)(byte)-1);
    ByteVector byteVector11 = byteVector5.putLong((long)(short)-1);
    ByteVector byteVector13 = byteVector11.putInt((int)(short)-1);
    ByteVector byteVector15 = byteVector11.putUTF8("hi!");
    
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
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test240"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putShort((int)(short)-1);
    ByteVector byteVector13 = byteVector11.putUTF8("");
    ByteVector byteVector15 = byteVector11.putUTF8("");
    ByteVector byteVector17 = byteVector11.putLong((long)1);
    byte[] byte_array21 = new byte[] { (byte)-1, (byte)10, (byte)-1 };
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector24 = byteVector11.putByteArray(byte_array21, (int)'4', 10);
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
    org.junit.Assert.assertNotNull(byte_array21);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test241"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putShort((int)(short)-1);
    ByteVector byteVector13 = byteVector9.putUTF8("");
    ByteVector byteVector15 = byteVector13.putInt(10);
    ByteVector byteVector17 = new ByteVector((int)(short)1);
    ByteVector byteVector19 = byteVector17.putLong((long)'#');
    ByteVector byteVector21 = byteVector17.putInt(0);
    ByteVector byteVector23 = byteVector17.putShort((int)(short)10);
    ByteVector byteVector25 = byteVector17.putByte((int)(short)0);
    ByteVector byteVector27 = byteVector17.putUTF8("");
    ByteVector byteVector29 = new ByteVector((int)(short)1);
    ByteVector byteVector31 = byteVector29.putLong((long)'#');
    ByteVector byteVector33 = byteVector29.putInt(0);
    ByteVector byteVector35 = byteVector33.putShort((int)(byte)0);
    ByteVector byteVector37 = byteVector35.putLong(0L);
    ByteVector byteVector39 = byteVector37.putShort((int)'a');
    ByteVector byteVector41 = new ByteVector((int)'4');
    ByteVector byteVector43 = byteVector41.putByte((int)(byte)100);
    byte[] byte_array45 = new byte[] { (byte)-1 };
    ByteVector byteVector48 = byteVector43.putByteArray(byte_array45, (int)(byte)0, 1);
    ByteVector byteVector51 = byteVector37.putByteArray(byte_array45, (int)(short)0, 1);
    ByteVector byteVector54 = byteVector27.putByteArray(byte_array45, (int)(byte)0, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector57 = byteVector13.putByteArray(byte_array45, (int)(byte)1, (int)(byte)-1);
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
    org.junit.Assert.assertNotNull(byteVector43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector54);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test242"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putShort((int)'#');
    ByteVector byteVector5 = byteVector3.putByte(0);
    ByteVector byteVector7 = byteVector5.putUTF8("hi!");
    ByteVector byteVector9 = byteVector5.putUTF8("hi!");
    ByteVector byteVector11 = byteVector9.putInt((-1));
    ByteVector byteVector13 = byteVector11.putByte((int)(short)-1);
    ByteVector byteVector15 = byteVector11.putLong(1L);
    
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
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test243"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector5.putInt((int)(byte)0);
    ByteVector byteVector9 = byteVector5.putShort((int)'4');
    ByteVector byteVector11 = byteVector5.putByte((int)'4');
    ByteVector byteVector13 = byteVector5.putByte((int)(byte)1);
    ByteVector byteVector15 = byteVector13.putByte((int)(short)10);
    
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
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test244"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(byte)10);
    ByteVector byteVector9 = byteVector1.putShort((int)'4');
    
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
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test245"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    byte[] byte_array7 = new byte[] { (byte)-1 };
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(short)0, (int)(byte)0);
    ByteVector byteVector12 = byteVector10.putInt((int)(short)-1);
    ByteVector byteVector14 = byteVector10.putByte((-1));
    ByteVector byteVector16 = byteVector14.putShort(100);
    ByteVector byteVector18 = byteVector16.putByte(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test246"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putShort((int)'#');
    ByteVector byteVector5 = byteVector3.putByte(0);
    ByteVector byteVector7 = byteVector5.putUTF8("hi!");
    ByteVector byteVector9 = byteVector5.putShort((int)(byte)-1);
    ByteVector byteVector11 = byteVector5.putUTF8("hi!");
    ByteVector byteVector13 = byteVector5.putByte((int)(short)-1);
    
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
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test247"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector3.putShort((int)'4');
    ByteVector byteVector7 = byteVector3.putByte((int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test248"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector1.putUTF8("");
    ByteVector byteVector13 = byteVector11.putLong((long)(short)100);
    ByteVector byteVector15 = byteVector11.putLong((long)' ');
    ByteVector byteVector17 = byteVector11.putByte(10);
    
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
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test249"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putInt((int)(short)0);
    ByteVector byteVector13 = byteVector9.putByte((int)(byte)-1);
    ByteVector byteVector15 = byteVector9.putUTF8("hi!");
    ByteVector byteVector17 = byteVector9.putLong((long)10);
    ByteVector byteVector19 = byteVector17.putUTF8("hi!");
    ByteVector byteVector21 = byteVector19.putShort(1);
    ByteVector byteVector23 = byteVector21.putUTF8("");
    ByteVector byteVector25 = byteVector23.putUTF8("hi!");
    ByteVector byteVector27 = byteVector25.putInt((int)' ');
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector27);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test250"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putInt((int)(short)0);
    ByteVector byteVector13 = byteVector9.putByte((int)(byte)-1);
    ByteVector byteVector15 = byteVector9.putUTF8("hi!");
    ByteVector byteVector17 = byteVector9.putLong((long)10);
    byte[] byte_array18 = null;
    ByteVector byteVector21 = byteVector9.putByteArray(byte_array18, (int)' ', (int)'#');
    ByteVector byteVector23 = new ByteVector((int)(short)1);
    ByteVector byteVector25 = byteVector23.putLong((long)'#');
    ByteVector byteVector27 = byteVector23.putInt(0);
    ByteVector byteVector29 = byteVector23.putShort((int)(short)10);
    ByteVector byteVector31 = new ByteVector((int)(short)1);
    ByteVector byteVector33 = byteVector31.putLong((long)'#');
    ByteVector byteVector35 = byteVector31.putInt((int)' ');
    byte[] byte_array37 = new byte[] { (byte)-1 };
    ByteVector byteVector40 = byteVector31.putByteArray(byte_array37, (int)(short)0, (int)(byte)0);
    ByteVector byteVector43 = byteVector29.putByteArray(byte_array37, 0, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector46 = byteVector9.putByteArray(byte_array37, 10, (int)(short)-1);
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
    org.junit.Assert.assertNotNull(byteVector25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector43);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test251"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putInt((int)(short)0);
    ByteVector byteVector13 = new ByteVector((int)(short)1);
    ByteVector byteVector15 = byteVector13.putLong((long)'#');
    ByteVector byteVector17 = byteVector13.putInt(0);
    ByteVector byteVector19 = byteVector17.putShort((int)(byte)0);
    ByteVector byteVector21 = byteVector19.putLong(0L);
    ByteVector byteVector23 = byteVector21.putShort((int)'a');
    ByteVector byteVector25 = new ByteVector((int)'4');
    ByteVector byteVector27 = byteVector25.putByte((int)(byte)100);
    byte[] byte_array29 = new byte[] { (byte)-1 };
    ByteVector byteVector32 = byteVector27.putByteArray(byte_array29, (int)(byte)0, 1);
    ByteVector byteVector35 = byteVector21.putByteArray(byte_array29, (int)(short)0, 1);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector38 = byteVector9.putByteArray(byte_array29, (int)'4', 0);
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
    org.junit.Assert.assertNotNull(byteVector27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector35);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test252"); }


    ByteVector byteVector1 = new ByteVector((int)'4');
    ByteVector byteVector3 = byteVector1.putByte((int)(byte)100);
    byte[] byte_array5 = new byte[] { (byte)-1 };
    ByteVector byteVector8 = byteVector3.putByteArray(byte_array5, (int)(byte)0, 1);
    ByteVector byteVector10 = byteVector3.putLong((long)(byte)0);
    ByteVector byteVector12 = byteVector3.putInt(0);
    byte[] byte_array13 = null;
    ByteVector byteVector16 = byteVector3.putByteArray(byte_array13, 0, 100);
    ByteVector byteVector18 = byteVector16.putInt((int)'a');
    ByteVector byteVector20 = byteVector18.putShort((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test253"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector5.putShort((int)(byte)0);
    ByteVector byteVector9 = byteVector7.putLong(0L);
    ByteVector byteVector11 = byteVector9.putByte((int)'#');
    ByteVector byteVector13 = byteVector9.putByte((int)'4');
    
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
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test254"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((-1L));
    ByteVector byteVector5 = byteVector3.putInt(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test255"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector11 = byteVector9.putShort((int)'#');
    byte[] byte_array15 = new byte[] { (byte)-1, (byte)-1, (byte)1 };
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector18 = byteVector11.putByteArray(byte_array15, (int)'a', (int)(short)100);
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
    org.junit.Assert.assertNotNull(byte_array15);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test256"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putShort((int)(short)-1);
    ByteVector byteVector13 = byteVector11.putUTF8("");
    ByteVector byteVector15 = byteVector11.putUTF8("");
    ByteVector byteVector17 = byteVector11.putUTF8("");
    ByteVector byteVector19 = byteVector17.putByte((int)'4');
    
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
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test257"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector3.putByte((int)' ');
    ByteVector byteVector7 = byteVector5.putLong((long)0);
    ByteVector byteVector9 = byteVector5.putUTF8("hi!");
    ByteVector byteVector11 = byteVector9.putByte((int)(byte)-1);
    ByteVector byteVector13 = new ByteVector((int)(short)1);
    ByteVector byteVector15 = byteVector13.putLong((long)'#');
    ByteVector byteVector17 = byteVector13.putInt(0);
    ByteVector byteVector19 = byteVector13.putShort((int)(short)10);
    ByteVector byteVector21 = new ByteVector((int)(short)1);
    ByteVector byteVector23 = byteVector21.putLong((long)'#');
    ByteVector byteVector25 = byteVector21.putInt((int)' ');
    byte[] byte_array27 = new byte[] { (byte)-1 };
    ByteVector byteVector30 = byteVector21.putByteArray(byte_array27, (int)(short)0, (int)(byte)0);
    ByteVector byteVector33 = byteVector19.putByteArray(byte_array27, 0, (int)(short)1);
    ByteVector byteVector36 = byteVector9.putByteArray(byte_array27, (int)(byte)0, 1);
    ByteVector byteVector38 = byteVector9.putUTF8("hi!");
    ByteVector byteVector40 = new ByteVector((int)(short)1);
    ByteVector byteVector42 = byteVector40.putLong((long)'#');
    ByteVector byteVector44 = byteVector40.putInt((int)' ');
    ByteVector byteVector46 = byteVector44.putShort(1);
    ByteVector byteVector48 = byteVector44.putInt((int)(short)10);
    ByteVector byteVector50 = byteVector48.putByte((int)(short)1);
    ByteVector byteVector52 = byteVector48.putShort((int)(byte)10);
    ByteVector byteVector54 = new ByteVector((int)(short)1);
    ByteVector byteVector56 = byteVector54.putLong((long)'#');
    ByteVector byteVector58 = byteVector54.putInt(0);
    ByteVector byteVector60 = byteVector54.putShort((int)(short)10);
    ByteVector byteVector62 = byteVector54.putByte((int)(short)0);
    ByteVector byteVector64 = byteVector54.putUTF8("");
    ByteVector byteVector66 = new ByteVector((int)(short)1);
    ByteVector byteVector68 = byteVector66.putLong((long)'#');
    ByteVector byteVector70 = byteVector66.putInt(0);
    ByteVector byteVector72 = byteVector70.putShort((int)(byte)0);
    ByteVector byteVector74 = byteVector72.putLong(0L);
    ByteVector byteVector76 = byteVector74.putShort((int)'a');
    ByteVector byteVector78 = new ByteVector((int)'4');
    ByteVector byteVector80 = byteVector78.putByte((int)(byte)100);
    byte[] byte_array82 = new byte[] { (byte)-1 };
    ByteVector byteVector85 = byteVector80.putByteArray(byte_array82, (int)(byte)0, 1);
    ByteVector byteVector88 = byteVector74.putByteArray(byte_array82, (int)(short)0, 1);
    ByteVector byteVector91 = byteVector64.putByteArray(byte_array82, (int)(byte)0, (int)(short)0);
    ByteVector byteVector94 = byteVector52.putByteArray(byte_array82, (int)(byte)1, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector97 = byteVector9.putByteArray(byte_array82, (int)(byte)10, 10);
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
    org.junit.Assert.assertNotNull(byteVector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector38);
    
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
    org.junit.Assert.assertNotNull(byteVector52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector94);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test258"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    ByteVector byteVector7 = byteVector1.putUTF8("");
    ByteVector byteVector9 = byteVector7.putShort((int)(byte)100);
    ByteVector byteVector11 = new ByteVector((int)(short)1);
    ByteVector byteVector13 = byteVector11.putLong((long)'#');
    ByteVector byteVector15 = byteVector11.putInt(0);
    ByteVector byteVector17 = byteVector11.putShort((int)(short)10);
    ByteVector byteVector19 = new ByteVector((int)(short)1);
    ByteVector byteVector21 = byteVector19.putLong((long)'#');
    ByteVector byteVector23 = byteVector19.putInt((int)' ');
    byte[] byte_array25 = new byte[] { (byte)-1 };
    ByteVector byteVector28 = byteVector19.putByteArray(byte_array25, (int)(short)0, (int)(byte)0);
    ByteVector byteVector31 = byteVector17.putByteArray(byte_array25, 0, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector34 = byteVector7.putByteArray(byte_array25, (-1), (int)(short)1);
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
    org.junit.Assert.assertNotNull(byteVector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector31);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test259"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    ByteVector byteVector7 = byteVector1.putUTF8("");
    ByteVector byteVector9 = byteVector7.putInt((int)(byte)10);
    ByteVector byteVector11 = byteVector7.putLong((long)'#');
    ByteVector byteVector13 = new ByteVector((int)(short)1);
    ByteVector byteVector15 = byteVector13.putLong((long)'#');
    ByteVector byteVector17 = byteVector13.putInt((int)' ');
    ByteVector byteVector19 = byteVector17.putShort(1);
    ByteVector byteVector21 = byteVector17.putInt((int)(short)10);
    ByteVector byteVector23 = byteVector21.putByte((int)(short)1);
    ByteVector byteVector25 = byteVector21.putShort((int)(byte)10);
    ByteVector byteVector27 = new ByteVector((int)(short)1);
    ByteVector byteVector29 = byteVector27.putLong((long)'#');
    ByteVector byteVector31 = byteVector27.putInt(0);
    ByteVector byteVector33 = byteVector27.putShort((int)(short)10);
    ByteVector byteVector35 = byteVector27.putByte((int)(short)0);
    ByteVector byteVector37 = byteVector27.putUTF8("");
    ByteVector byteVector39 = new ByteVector((int)(short)1);
    ByteVector byteVector41 = byteVector39.putLong((long)'#');
    ByteVector byteVector43 = byteVector39.putInt(0);
    ByteVector byteVector45 = byteVector43.putShort((int)(byte)0);
    ByteVector byteVector47 = byteVector45.putLong(0L);
    ByteVector byteVector49 = byteVector47.putShort((int)'a');
    ByteVector byteVector51 = new ByteVector((int)'4');
    ByteVector byteVector53 = byteVector51.putByte((int)(byte)100);
    byte[] byte_array55 = new byte[] { (byte)-1 };
    ByteVector byteVector58 = byteVector53.putByteArray(byte_array55, (int)(byte)0, 1);
    ByteVector byteVector61 = byteVector47.putByteArray(byte_array55, (int)(short)0, 1);
    ByteVector byteVector64 = byteVector37.putByteArray(byte_array55, (int)(byte)0, (int)(short)0);
    ByteVector byteVector67 = byteVector25.putByteArray(byte_array55, (int)(byte)1, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector70 = byteVector11.putByteArray(byte_array55, 0, (int)(byte)-1);
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
    org.junit.Assert.assertNotNull(byteVector53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector67);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test260"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector7.putUTF8("hi!");
    byte[] byte_array16 = new byte[] { (byte)-1, (byte)10, (byte)10, (byte)-1, (byte)10, (byte)1 };
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector19 = byteVector9.putByteArray(byte_array16, 1, (int)'4');
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

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test261"); }


    ByteVector byteVector1 = new ByteVector(10);
    ByteVector byteVector3 = byteVector1.putByte((int)(short)1);
    ByteVector byteVector5 = new ByteVector((int)(short)1);
    ByteVector byteVector7 = byteVector5.putLong((long)'#');
    ByteVector byteVector9 = byteVector5.putInt(0);
    ByteVector byteVector11 = byteVector9.putShort((int)(byte)0);
    ByteVector byteVector13 = byteVector11.putByte((int)(short)0);
    ByteVector byteVector15 = byteVector11.putShort((int)(byte)-1);
    ByteVector byteVector17 = new ByteVector((int)'4');
    ByteVector byteVector19 = byteVector17.putByte((int)(byte)100);
    byte[] byte_array21 = new byte[] { (byte)-1 };
    ByteVector byteVector24 = byteVector19.putByteArray(byte_array21, (int)(byte)0, 1);
    ByteVector byteVector27 = byteVector15.putByteArray(byte_array21, 0, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector30 = byteVector3.putByteArray(byte_array21, (int)(short)0, (-1));
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
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector27);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test262"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putInt((int)(short)0);
    ByteVector byteVector13 = byteVector9.putByte((int)(byte)-1);
    ByteVector byteVector15 = byteVector13.putShort((int)'a');
    ByteVector byteVector17 = byteVector13.putUTF8("");
    ByteVector byteVector19 = byteVector13.putInt((-1));
    ByteVector byteVector21 = byteVector13.putUTF8("hi!");
    
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
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test263"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putInt((int)(short)0);
    ByteVector byteVector13 = byteVector9.putByte((int)(byte)-1);
    ByteVector byteVector15 = byteVector13.putShort((int)'a');
    ByteVector byteVector17 = byteVector13.putShort((int)(short)10);
    ByteVector byteVector19 = byteVector17.putByte((int)' ');
    ByteVector byteVector21 = byteVector17.putShort((int)(byte)1);
    
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
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test264"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putShort((int)(short)-1);
    ByteVector byteVector13 = byteVector9.putUTF8("");
    ByteVector byteVector15 = byteVector9.putShort(1);
    ByteVector byteVector17 = byteVector15.putByte((int)'#');
    ByteVector byteVector19 = byteVector15.putShort(0);
    ByteVector byteVector21 = new ByteVector((int)'4');
    ByteVector byteVector23 = byteVector21.putByte((int)(byte)100);
    byte[] byte_array25 = new byte[] { (byte)-1 };
    ByteVector byteVector28 = byteVector23.putByteArray(byte_array25, (int)(byte)0, 1);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector31 = byteVector15.putByteArray(byte_array25, (int)(byte)100, 0);
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
    org.junit.Assert.assertNotNull(byte_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector28);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test265"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector1.putUTF8("");
    ByteVector byteVector13 = byteVector11.putLong((long)(short)100);
    ByteVector byteVector15 = byteVector11.putShort(0);
    
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
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test266"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong(0L);
    ByteVector byteVector5 = byteVector1.putByte((int)'a');
    ByteVector byteVector7 = byteVector5.putLong((long)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test267"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector3.putByte((int)' ');
    ByteVector byteVector7 = byteVector5.putShort((int)(byte)100);
    ByteVector byteVector9 = byteVector7.putShort((int)'a');
    
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
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test268"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    byte[] byte_array7 = new byte[] { (byte)-1 };
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(short)0, (int)(byte)0);
    ByteVector byteVector12 = byteVector1.putLong((long)10);
    ByteVector byteVector14 = byteVector1.putShort(0);
    ByteVector byteVector16 = byteVector14.putByte((int)(byte)10);
    ByteVector byteVector18 = byteVector16.putInt((int)(short)0);
    ByteVector byteVector20 = byteVector18.putUTF8("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test269"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putShort((int)(short)-1);
    ByteVector byteVector13 = byteVector9.putUTF8("");
    ByteVector byteVector15 = byteVector13.putLong((long)'#');
    ByteVector byteVector17 = byteVector15.putLong(0L);
    ByteVector byteVector19 = byteVector15.putInt((int)(short)0);
    ByteVector byteVector21 = byteVector15.putInt((int)(byte)-1);
    ByteVector byteVector23 = byteVector15.putUTF8("");
    ByteVector byteVector25 = new ByteVector((int)'4');
    ByteVector byteVector27 = byteVector25.putByte((int)(byte)100);
    byte[] byte_array29 = new byte[] { (byte)-1 };
    ByteVector byteVector32 = byteVector27.putByteArray(byte_array29, (int)(byte)0, 1);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector35 = byteVector15.putByteArray(byte_array29, (int)'4', (int)(byte)-1);
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
    org.junit.Assert.assertNotNull(byteVector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector32);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test270"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector3.putByte((int)' ');
    ByteVector byteVector7 = byteVector3.putShort(0);
    ByteVector byteVector9 = byteVector3.putInt((int)(short)100);
    ByteVector byteVector11 = byteVector3.putLong((long)'a');
    ByteVector byteVector13 = byteVector3.putLong((long)(byte)-1);
    byte[] byte_array14 = null;
    ByteVector byteVector17 = byteVector3.putByteArray(byte_array14, (int)(byte)-1, (int)(byte)0);
    ByteVector byteVector19 = byteVector3.putByte((-1));
    
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

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test271"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putInt((int)(short)0);
    ByteVector byteVector13 = byteVector9.putByte((int)(byte)-1);
    ByteVector byteVector15 = byteVector13.putShort((int)'a');
    ByteVector byteVector17 = byteVector13.putLong((long)(short)1);
    ByteVector byteVector19 = byteVector13.putByte(100);
    ByteVector byteVector21 = byteVector19.putLong((long)0);
    ByteVector byteVector23 = byteVector19.putUTF8("");
    
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
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test272"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector3.putByte((int)' ');
    ByteVector byteVector7 = byteVector3.putUTF8("hi!");
    ByteVector byteVector9 = byteVector7.putInt(10);
    ByteVector byteVector11 = byteVector9.putByte((int)(short)-1);
    
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
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test273"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putShort((int)(short)-1);
    byte[] byte_array12 = null;
    ByteVector byteVector15 = byteVector11.putByteArray(byte_array12, (int)(short)0, (int)'a');
    
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

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test274"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector5.putInt((int)(byte)0);
    ByteVector byteVector9 = byteVector7.putShort((int)(byte)100);
    ByteVector byteVector11 = byteVector7.putByte((int)(short)0);
    
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
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test275"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector3.putByte((int)' ');
    ByteVector byteVector7 = byteVector5.putLong((long)0);
    ByteVector byteVector9 = byteVector5.putUTF8("hi!");
    ByteVector byteVector11 = byteVector9.putByte((int)(byte)-1);
    ByteVector byteVector13 = new ByteVector((int)(short)1);
    ByteVector byteVector15 = byteVector13.putLong((long)'#');
    ByteVector byteVector17 = byteVector13.putInt((int)' ');
    ByteVector byteVector19 = byteVector17.putShort(1);
    ByteVector byteVector21 = byteVector17.putInt((int)(short)10);
    ByteVector byteVector23 = byteVector21.putByte((int)(short)1);
    ByteVector byteVector25 = byteVector21.putShort((int)(byte)10);
    ByteVector byteVector27 = new ByteVector((int)(short)1);
    ByteVector byteVector29 = byteVector27.putLong((long)'#');
    ByteVector byteVector31 = byteVector27.putInt(0);
    ByteVector byteVector33 = byteVector27.putShort((int)(short)10);
    ByteVector byteVector35 = byteVector27.putByte((int)(short)0);
    ByteVector byteVector37 = byteVector27.putUTF8("");
    ByteVector byteVector39 = new ByteVector((int)(short)1);
    ByteVector byteVector41 = byteVector39.putLong((long)'#');
    ByteVector byteVector43 = byteVector39.putInt(0);
    ByteVector byteVector45 = byteVector43.putShort((int)(byte)0);
    ByteVector byteVector47 = byteVector45.putLong(0L);
    ByteVector byteVector49 = byteVector47.putShort((int)'a');
    ByteVector byteVector51 = new ByteVector((int)'4');
    ByteVector byteVector53 = byteVector51.putByte((int)(byte)100);
    byte[] byte_array55 = new byte[] { (byte)-1 };
    ByteVector byteVector58 = byteVector53.putByteArray(byte_array55, (int)(byte)0, 1);
    ByteVector byteVector61 = byteVector47.putByteArray(byte_array55, (int)(short)0, 1);
    ByteVector byteVector64 = byteVector37.putByteArray(byte_array55, (int)(byte)0, (int)(short)0);
    ByteVector byteVector67 = byteVector25.putByteArray(byte_array55, (int)(byte)1, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector70 = byteVector9.putByteArray(byte_array55, (int)'a', 0);
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
    org.junit.Assert.assertNotNull(byteVector53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector67);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test276"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putInt((int)(short)0);
    ByteVector byteVector13 = byteVector9.putByte((int)(byte)-1);
    ByteVector byteVector15 = byteVector9.putByte((int)(short)-1);
    ByteVector byteVector17 = byteVector15.putByte((int)(short)1);
    ByteVector byteVector19 = new ByteVector((int)(short)1);
    ByteVector byteVector21 = byteVector19.putLong(0L);
    ByteVector byteVector23 = byteVector19.putByte((int)'a');
    ByteVector byteVector25 = new ByteVector((int)(short)1);
    ByteVector byteVector27 = byteVector25.putLong((long)'#');
    ByteVector byteVector29 = byteVector25.putInt(0);
    ByteVector byteVector31 = byteVector29.putShort((int)(byte)0);
    ByteVector byteVector33 = byteVector31.putLong(0L);
    ByteVector byteVector35 = byteVector33.putShort((int)'a');
    ByteVector byteVector37 = new ByteVector((int)'4');
    ByteVector byteVector39 = byteVector37.putByte((int)(byte)100);
    byte[] byte_array41 = new byte[] { (byte)-1 };
    ByteVector byteVector44 = byteVector39.putByteArray(byte_array41, (int)(byte)0, 1);
    ByteVector byteVector47 = byteVector33.putByteArray(byte_array41, (int)(short)0, 1);
    ByteVector byteVector50 = byteVector23.putByteArray(byte_array41, (int)(byte)0, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector53 = byteVector15.putByteArray(byte_array41, 1, (int)(short)-1);
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
    org.junit.Assert.assertNotNull(byteVector39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector50);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test277"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putShort((int)(short)-1);
    ByteVector byteVector13 = byteVector9.putByte(1);
    ByteVector byteVector15 = byteVector9.putInt(0);
    ByteVector byteVector17 = byteVector9.putInt((int)'a');
    
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
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test278"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    ByteVector byteVector7 = byteVector1.putUTF8("");
    ByteVector byteVector9 = new ByteVector((int)(short)1);
    ByteVector byteVector11 = byteVector9.putLong((long)'#');
    ByteVector byteVector13 = byteVector9.putInt(0);
    ByteVector byteVector15 = byteVector9.putShort((int)(short)10);
    ByteVector byteVector17 = byteVector9.putUTF8("hi!");
    ByteVector byteVector19 = byteVector9.putShort((int)(short)1);
    ByteVector byteVector21 = new ByteVector((int)'4');
    ByteVector byteVector23 = byteVector21.putByte((int)(byte)100);
    byte[] byte_array25 = new byte[] { (byte)-1 };
    ByteVector byteVector28 = byteVector23.putByteArray(byte_array25, (int)(byte)0, 1);
    ByteVector byteVector31 = byteVector9.putByteArray(byte_array25, 0, 0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector34 = byteVector1.putByteArray(byte_array25, (int)(byte)100, (int)(byte)0);
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
    org.junit.Assert.assertNotNull(byteVector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector31);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test279"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    byte[] byte_array7 = new byte[] { (byte)-1 };
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(short)0, (int)(byte)0);
    ByteVector byteVector12 = byteVector1.putUTF8("hi!");
    ByteVector byteVector14 = byteVector1.putInt((int)(short)-1);
    ByteVector byteVector16 = byteVector14.putByte((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test280"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putShort((int)(short)-1);
    ByteVector byteVector13 = byteVector9.putUTF8("");
    ByteVector byteVector15 = byteVector9.putShort(1);
    ByteVector byteVector17 = byteVector15.putByte((int)'#');
    ByteVector byteVector19 = byteVector15.putByte(100);
    ByteVector byteVector21 = byteVector19.putUTF8("");
    ByteVector byteVector23 = byteVector21.putLong((long)100);
    ByteVector byteVector25 = byteVector23.putLong((long)(-1));
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector25);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test281"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putInt((int)(short)0);
    ByteVector byteVector13 = byteVector9.putByte((int)(byte)-1);
    ByteVector byteVector15 = byteVector13.putShort((int)'a');
    ByteVector byteVector17 = byteVector13.putShort((int)(short)10);
    ByteVector byteVector19 = byteVector17.putShort(1);
    ByteVector byteVector21 = byteVector17.putUTF8("");
    ByteVector byteVector23 = byteVector17.putShort(0);
    
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
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test282"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putInt((int)(short)0);
    ByteVector byteVector13 = byteVector9.putByte((int)(byte)-1);
    ByteVector byteVector15 = byteVector13.putShort((int)'a');
    ByteVector byteVector17 = byteVector13.putShort((int)(short)10);
    ByteVector byteVector19 = byteVector17.putShort(1);
    ByteVector byteVector21 = byteVector19.putUTF8("hi!");
    ByteVector byteVector23 = byteVector21.putShort(100);
    
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
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test283"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector5.putShort((int)(byte)0);
    ByteVector byteVector9 = byteVector7.putLong(0L);
    ByteVector byteVector11 = byteVector9.putShort((int)'a');
    ByteVector byteVector13 = byteVector11.putUTF8("");
    ByteVector byteVector15 = byteVector13.putShort((int)' ');
    
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
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test284"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    byte[] byte_array7 = new byte[] { (byte)-1 };
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(short)0, (int)(byte)0);
    ByteVector byteVector12 = byteVector1.putUTF8("hi!");
    ByteVector byteVector14 = byteVector12.putUTF8("");
    ByteVector byteVector16 = byteVector12.putUTF8("hi!");
    ByteVector byteVector18 = byteVector16.putShort((int)(byte)1);
    ByteVector byteVector20 = new ByteVector((int)(short)1);
    ByteVector byteVector22 = byteVector20.putLong((long)'#');
    ByteVector byteVector24 = byteVector22.putByte((int)' ');
    ByteVector byteVector26 = byteVector22.putShort(0);
    ByteVector byteVector28 = byteVector22.putInt((int)(short)100);
    ByteVector byteVector30 = new ByteVector((int)(short)1);
    ByteVector byteVector32 = byteVector30.putLong((long)'#');
    ByteVector byteVector34 = byteVector30.putInt((int)' ');
    byte[] byte_array36 = new byte[] { (byte)-1 };
    ByteVector byteVector39 = byteVector30.putByteArray(byte_array36, (int)(short)0, (int)(byte)0);
    ByteVector byteVector42 = byteVector22.putByteArray(byte_array36, (int)(byte)0, 0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector45 = byteVector18.putByteArray(byte_array36, 0, 10);
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
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector42);

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test285"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector5.putShort((int)(byte)0);
    ByteVector byteVector9 = byteVector7.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector7.putInt((int)(short)10);
    ByteVector byteVector13 = byteVector7.putLong((long)(byte)10);
    
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
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test286"); }


    ByteVector byteVector1 = new ByteVector(10);
    ByteVector byteVector3 = byteVector1.putByte((int)(short)1);
    ByteVector byteVector5 = byteVector3.putShort((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test287"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong(0L);
    ByteVector byteVector5 = byteVector3.putLong((long)(byte)-1);
    ByteVector byteVector7 = byteVector5.putLong(100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test288"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    ByteVector byteVector7 = byteVector5.putShort(1);
    ByteVector byteVector9 = byteVector7.putLong(100L);
    ByteVector byteVector11 = byteVector9.putShort((int)(short)100);
    ByteVector byteVector13 = byteVector9.putUTF8("hi!");
    
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
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test289"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putShort((int)(short)-1);
    ByteVector byteVector13 = byteVector11.putShort((int)(short)0);
    ByteVector byteVector15 = new ByteVector((int)(short)1);
    ByteVector byteVector17 = byteVector15.putLong(0L);
    ByteVector byteVector19 = byteVector15.putByte((int)'a');
    ByteVector byteVector21 = new ByteVector((int)(short)1);
    ByteVector byteVector23 = byteVector21.putLong((long)'#');
    ByteVector byteVector25 = byteVector21.putInt(0);
    ByteVector byteVector27 = byteVector25.putShort((int)(byte)0);
    ByteVector byteVector29 = byteVector27.putLong(0L);
    ByteVector byteVector31 = byteVector29.putShort((int)'a');
    ByteVector byteVector33 = new ByteVector((int)'4');
    ByteVector byteVector35 = byteVector33.putByte((int)(byte)100);
    byte[] byte_array37 = new byte[] { (byte)-1 };
    ByteVector byteVector40 = byteVector35.putByteArray(byte_array37, (int)(byte)0, 1);
    ByteVector byteVector43 = byteVector29.putByteArray(byte_array37, (int)(short)0, 1);
    ByteVector byteVector46 = byteVector19.putByteArray(byte_array37, (int)(byte)0, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector49 = byteVector11.putByteArray(byte_array37, (int)'#', (int)(short)0);
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
    org.junit.Assert.assertNotNull(byteVector35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector46);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test290"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    ByteVector byteVector7 = byteVector1.putShort((int)(short)-1);
    ByteVector byteVector9 = byteVector7.putLong((-1L));
    ByteVector byteVector11 = byteVector7.putShort((int)(short)1);
    ByteVector byteVector13 = byteVector7.putByte((int)'4');
    
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
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test291"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    byte[] byte_array7 = new byte[] { (byte)-1 };
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(short)0, (int)(byte)0);
    ByteVector byteVector12 = byteVector1.putUTF8("hi!");
    ByteVector byteVector14 = byteVector12.putUTF8("");
    ByteVector byteVector16 = byteVector12.putUTF8("hi!");
    ByteVector byteVector18 = byteVector16.putUTF8("");
    ByteVector byteVector20 = byteVector18.putUTF8("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test292"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector5.putShort((int)(byte)0);
    ByteVector byteVector9 = byteVector7.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putLong((long)' ');
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
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test293"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector7.putUTF8("hi!");
    ByteVector byteVector11 = byteVector9.putUTF8("");
    ByteVector byteVector13 = byteVector11.putByte(1);
    
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
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test294"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    ByteVector byteVector7 = byteVector1.putShort((int)(short)-1);
    ByteVector byteVector9 = byteVector7.putLong((long)'4');
    ByteVector byteVector11 = byteVector9.putByte((int)' ');
    ByteVector byteVector13 = byteVector9.putUTF8("");
    
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
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test295"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector3.putByte((int)' ');
    ByteVector byteVector7 = byteVector5.putLong((long)0);
    ByteVector byteVector9 = byteVector5.putUTF8("hi!");
    ByteVector byteVector11 = byteVector9.putUTF8("hi!");
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
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test296"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = new ByteVector((int)(short)1);
    ByteVector byteVector11 = byteVector9.putLong((long)'#');
    ByteVector byteVector13 = byteVector9.putInt((int)' ');
    byte[] byte_array15 = new byte[] { (byte)-1 };
    ByteVector byteVector18 = byteVector9.putByteArray(byte_array15, (int)(short)0, (int)(byte)0);
    ByteVector byteVector21 = byteVector7.putByteArray(byte_array15, 0, (int)(short)1);
    ByteVector byteVector23 = byteVector21.putInt((int)(short)100);
    ByteVector byteVector25 = byteVector21.putShort(10);
    ByteVector byteVector27 = byteVector25.putByte((int)'a');
    
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
    org.junit.Assert.assertNotNull(byte_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector27);

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test297"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putUTF8("hi!");
    ByteVector byteVector11 = byteVector1.putShort((int)(short)1);
    ByteVector byteVector13 = new ByteVector((int)'4');
    ByteVector byteVector15 = byteVector13.putByte((int)(byte)100);
    byte[] byte_array17 = new byte[] { (byte)-1 };
    ByteVector byteVector20 = byteVector15.putByteArray(byte_array17, (int)(byte)0, 1);
    ByteVector byteVector23 = byteVector1.putByteArray(byte_array17, 0, 0);
    ByteVector byteVector25 = byteVector1.putUTF8("");
    
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
    org.junit.Assert.assertNotNull(byte_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector25);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test298"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putLong((long)100);
    ByteVector byteVector13 = byteVector9.putUTF8("hi!");
    ByteVector byteVector15 = byteVector13.putInt(1);
    
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
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test299"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putShort((int)'#');
    ByteVector byteVector5 = byteVector3.putByte(0);
    ByteVector byteVector7 = byteVector5.putByte((-1));
    ByteVector byteVector9 = new ByteVector((int)(short)1);
    ByteVector byteVector11 = byteVector9.putLong((long)'#');
    ByteVector byteVector13 = byteVector9.putInt(0);
    ByteVector byteVector15 = byteVector9.putShort((int)(short)10);
    ByteVector byteVector17 = byteVector9.putUTF8("hi!");
    ByteVector byteVector19 = byteVector9.putShort((int)(short)1);
    ByteVector byteVector21 = new ByteVector((int)'4');
    ByteVector byteVector23 = byteVector21.putByte((int)(byte)100);
    byte[] byte_array25 = new byte[] { (byte)-1 };
    ByteVector byteVector28 = byteVector23.putByteArray(byte_array25, (int)(byte)0, 1);
    ByteVector byteVector31 = byteVector9.putByteArray(byte_array25, 0, 0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector34 = byteVector5.putByteArray(byte_array25, (int)(short)100, 0);
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
    org.junit.Assert.assertNotNull(byteVector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector31);

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test300"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    byte[] byte_array7 = new byte[] { (byte)-1 };
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(short)0, (int)(byte)0);
    ByteVector byteVector12 = byteVector10.putInt((int)(short)-1);
    ByteVector byteVector14 = byteVector10.putByte((-1));
    ByteVector byteVector16 = byteVector10.putShort((int)(short)0);
    ByteVector byteVector18 = byteVector10.putUTF8("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test301"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    byte[] byte_array7 = new byte[] { (byte)-1 };
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(short)0, (int)(byte)0);
    ByteVector byteVector12 = byteVector1.putUTF8("hi!");
    ByteVector byteVector14 = byteVector12.putUTF8("");
    ByteVector byteVector16 = byteVector12.putUTF8("");
    ByteVector byteVector18 = byteVector12.putByte(10);
    ByteVector byteVector20 = byteVector12.putByte(100);
    ByteVector byteVector22 = byteVector12.putLong((long)(short)0);
    ByteVector byteVector24 = new ByteVector((int)(short)1);
    ByteVector byteVector26 = byteVector24.putLong((long)'#');
    ByteVector byteVector28 = byteVector24.putInt(0);
    ByteVector byteVector30 = byteVector24.putShort((int)(short)10);
    ByteVector byteVector32 = byteVector24.putUTF8("hi!");
    ByteVector byteVector34 = byteVector24.putShort((int)(short)1);
    ByteVector byteVector36 = new ByteVector((int)'4');
    ByteVector byteVector38 = byteVector36.putByte((int)(byte)100);
    byte[] byte_array40 = new byte[] { (byte)-1 };
    ByteVector byteVector43 = byteVector38.putByteArray(byte_array40, (int)(byte)0, 1);
    ByteVector byteVector46 = byteVector24.putByteArray(byte_array40, 0, 0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector49 = byteVector22.putByteArray(byte_array40, (int)(byte)10, 10);
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
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector26);
    
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
    org.junit.Assert.assertNotNull(byte_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector46);

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test302"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putShort((int)(short)-1);
    ByteVector byteVector13 = byteVector9.putUTF8("hi!");
    ByteVector byteVector15 = byteVector13.putByte(100);
    ByteVector byteVector17 = byteVector13.putInt((int)'#');
    ByteVector byteVector19 = byteVector17.putByte((int)' ');
    ByteVector byteVector21 = byteVector17.putLong((long)(short)1);
    
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
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test303"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putShort((int)(short)-1);
    ByteVector byteVector13 = byteVector9.putUTF8("");
    ByteVector byteVector15 = byteVector9.putShort(1);
    ByteVector byteVector17 = byteVector15.putByte((int)'#');
    ByteVector byteVector19 = byteVector15.putShort(0);
    ByteVector byteVector21 = byteVector19.putByte((int)' ');
    byte[] byte_array22 = new byte[] {  };
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector25 = byteVector19.putByteArray(byte_array22, (int)'a', (int)'4');
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
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test304"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector5.putLong((long)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test305"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector5.putShort((int)(byte)0);
    ByteVector byteVector9 = byteVector7.putInt((int)(short)-1);
    ByteVector byteVector11 = byteVector7.putShort(0);
    ByteVector byteVector13 = new ByteVector((int)(short)1);
    ByteVector byteVector15 = byteVector13.putLong((long)'#');
    ByteVector byteVector17 = byteVector15.putByte((int)' ');
    ByteVector byteVector19 = byteVector17.putLong((long)0);
    ByteVector byteVector21 = byteVector17.putUTF8("hi!");
    ByteVector byteVector23 = byteVector21.putByte((int)(byte)-1);
    ByteVector byteVector25 = new ByteVector((int)(short)1);
    ByteVector byteVector27 = byteVector25.putLong((long)'#');
    ByteVector byteVector29 = byteVector25.putInt(0);
    ByteVector byteVector31 = byteVector25.putShort((int)(short)10);
    ByteVector byteVector33 = new ByteVector((int)(short)1);
    ByteVector byteVector35 = byteVector33.putLong((long)'#');
    ByteVector byteVector37 = byteVector33.putInt((int)' ');
    byte[] byte_array39 = new byte[] { (byte)-1 };
    ByteVector byteVector42 = byteVector33.putByteArray(byte_array39, (int)(short)0, (int)(byte)0);
    ByteVector byteVector45 = byteVector31.putByteArray(byte_array39, 0, (int)(short)1);
    ByteVector byteVector48 = byteVector21.putByteArray(byte_array39, (int)(byte)0, 1);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector51 = byteVector11.putByteArray(byte_array39, (int)'#', 0);
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
    org.junit.Assert.assertNotNull(byteVector27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector48);

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test306"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector5.putShort((int)(byte)0);
    ByteVector byteVector9 = byteVector7.putShort(0);
    ByteVector byteVector11 = byteVector9.putInt((int)(short)10);
    
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
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test307"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putInt((int)(short)0);
    ByteVector byteVector13 = byteVector9.putByte((int)(byte)-1);
    ByteVector byteVector15 = byteVector13.putShort((int)'a');
    ByteVector byteVector17 = byteVector13.putShort((int)(short)10);
    ByteVector byteVector19 = byteVector17.putInt(0);
    
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
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test308"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    byte[] byte_array7 = new byte[] { (byte)-1 };
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(short)0, (int)(byte)0);
    ByteVector byteVector12 = byteVector10.putInt((int)(byte)10);
    ByteVector byteVector14 = byteVector12.putByte((int)(byte)-1);
    ByteVector byteVector16 = byteVector14.putLong((long)(byte)0);
    ByteVector byteVector18 = byteVector16.putShort((int)(byte)-1);
    ByteVector byteVector20 = byteVector16.putByte((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test309"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    byte[] byte_array7 = new byte[] { (byte)-1 };
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(short)0, (int)(byte)0);
    ByteVector byteVector12 = byteVector1.putUTF8("hi!");
    ByteVector byteVector14 = byteVector1.putInt((int)(short)-1);
    ByteVector byteVector16 = byteVector14.putUTF8("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test310"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putShort((int)(short)10);
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
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test311"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector5.putShort((int)(byte)0);
    ByteVector byteVector9 = byteVector7.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector7.putShort((int)(byte)-1);
    ByteVector byteVector13 = new ByteVector((int)'4');
    ByteVector byteVector15 = byteVector13.putByte((int)(byte)100);
    byte[] byte_array17 = new byte[] { (byte)-1 };
    ByteVector byteVector20 = byteVector15.putByteArray(byte_array17, (int)(byte)0, 1);
    ByteVector byteVector23 = byteVector11.putByteArray(byte_array17, 0, (int)(byte)0);
    ByteVector byteVector25 = byteVector11.putByte(1);
    
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
    org.junit.Assert.assertNotNull(byte_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector25);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test312"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    byte[] byte_array7 = new byte[] { (byte)-1 };
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(short)0, (int)(byte)0);
    ByteVector byteVector12 = byteVector10.putInt((int)(byte)10);
    ByteVector byteVector14 = byteVector12.putLong((long)(-1));
    ByteVector byteVector16 = byteVector12.putByte((int)(byte)-1);
    ByteVector byteVector18 = byteVector16.putShort(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test313"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putShort((int)'#');
    ByteVector byteVector5 = byteVector3.putByte(0);
    ByteVector byteVector7 = byteVector5.putUTF8("hi!");
    ByteVector byteVector9 = byteVector5.putShort((int)(byte)-1);
    ByteVector byteVector11 = byteVector5.putInt((int)(short)100);
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
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test314"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector5.putShort((int)(byte)0);
    ByteVector byteVector9 = byteVector7.putLong(0L);
    ByteVector byteVector11 = byteVector9.putShort((int)'a');
    ByteVector byteVector13 = byteVector9.putByte(0);
    
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
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test315"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector5.putShort((int)(byte)0);
    ByteVector byteVector9 = byteVector7.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector7.putShort((int)(byte)-1);
    ByteVector byteVector13 = byteVector7.putLong((long)(-1));
    ByteVector byteVector15 = new ByteVector((int)(short)1);
    ByteVector byteVector17 = byteVector15.putLong((long)'#');
    ByteVector byteVector19 = byteVector15.putInt(0);
    ByteVector byteVector21 = byteVector15.putShort((int)(short)10);
    ByteVector byteVector23 = byteVector15.putUTF8("hi!");
    ByteVector byteVector25 = byteVector15.putShort((int)(short)1);
    ByteVector byteVector27 = new ByteVector((int)'4');
    ByteVector byteVector29 = byteVector27.putByte((int)(byte)100);
    byte[] byte_array31 = new byte[] { (byte)-1 };
    ByteVector byteVector34 = byteVector29.putByteArray(byte_array31, (int)(byte)0, 1);
    ByteVector byteVector37 = byteVector15.putByteArray(byte_array31, 0, 0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector40 = byteVector7.putByteArray(byte_array31, (int)' ', (int)'4');
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
    org.junit.Assert.assertNotNull(byteVector29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector37);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test316"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putShort((int)(short)-1);
    ByteVector byteVector13 = byteVector11.putUTF8("");
    ByteVector byteVector15 = byteVector11.putUTF8("");
    ByteVector byteVector17 = byteVector11.putUTF8("");
    ByteVector byteVector19 = byteVector17.putShort(1);
    ByteVector byteVector21 = byteVector17.putLong(0L);
    ByteVector byteVector23 = byteVector21.putShort((int)(short)100);
    
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
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test317"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector1.putUTF8("");
    ByteVector byteVector13 = byteVector11.putLong((long)(short)100);
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
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test318"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    byte[] byte_array7 = new byte[] { (byte)-1 };
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(short)0, (int)(byte)0);
    ByteVector byteVector12 = byteVector1.putInt((int)' ');
    ByteVector byteVector14 = byteVector12.putByte((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test319"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putInt((int)(short)0);
    ByteVector byteVector13 = byteVector9.putByte((int)(byte)-1);
    ByteVector byteVector15 = byteVector13.putShort((int)'a');
    ByteVector byteVector17 = byteVector13.putShort((int)(short)10);
    ByteVector byteVector19 = byteVector17.putByte((int)' ');
    ByteVector byteVector21 = byteVector19.putUTF8("hi!");
    
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
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test320"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    ByteVector byteVector7 = byteVector5.putShort(1);
    ByteVector byteVector9 = byteVector5.putInt((int)(short)10);
    ByteVector byteVector11 = byteVector9.putShort((int)'a');
    ByteVector byteVector13 = byteVector9.putLong((long)(byte)10);
    ByteVector byteVector15 = byteVector13.putUTF8("");
    
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
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test321"); }


    ByteVector byteVector1 = new ByteVector((int)'4');
    ByteVector byteVector3 = byteVector1.putByte((int)(byte)100);
    byte[] byte_array5 = new byte[] { (byte)-1 };
    ByteVector byteVector8 = byteVector3.putByteArray(byte_array5, (int)(byte)0, 1);
    ByteVector byteVector10 = byteVector3.putLong((long)(byte)0);
    ByteVector byteVector12 = byteVector3.putInt(0);
    byte[] byte_array13 = null;
    ByteVector byteVector16 = byteVector3.putByteArray(byte_array13, 0, 100);
    ByteVector byteVector18 = byteVector16.putLong((long)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test322"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putUTF8("hi!");
    ByteVector byteVector11 = byteVector1.putLong((long)'4');
    ByteVector byteVector13 = byteVector11.putByte((int)(byte)0);
    ByteVector byteVector15 = new ByteVector((int)(short)1);
    ByteVector byteVector17 = byteVector15.putLong((long)'#');
    ByteVector byteVector19 = byteVector15.putInt(0);
    ByteVector byteVector21 = byteVector19.putShort((int)(byte)0);
    ByteVector byteVector23 = byteVector21.putByte((int)(short)0);
    ByteVector byteVector25 = byteVector21.putShort((int)(byte)-1);
    ByteVector byteVector27 = new ByteVector((int)'4');
    ByteVector byteVector29 = byteVector27.putByte((int)(byte)100);
    byte[] byte_array31 = new byte[] { (byte)-1 };
    ByteVector byteVector34 = byteVector29.putByteArray(byte_array31, (int)(byte)0, 1);
    ByteVector byteVector37 = byteVector25.putByteArray(byte_array31, 0, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector40 = byteVector11.putByteArray(byte_array31, (int)'#', 10);
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
    org.junit.Assert.assertNotNull(byteVector29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector37);

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test323"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    ByteVector byteVector7 = byteVector5.putShort(1);
    ByteVector byteVector9 = byteVector5.putInt((int)(short)10);
    ByteVector byteVector11 = byteVector5.putShort(0);
    ByteVector byteVector13 = new ByteVector((int)(short)1);
    ByteVector byteVector15 = byteVector13.putLong((long)'#');
    ByteVector byteVector17 = byteVector13.putInt(0);
    ByteVector byteVector19 = byteVector13.putShort((int)(short)10);
    ByteVector byteVector21 = new ByteVector((int)(short)1);
    ByteVector byteVector23 = byteVector21.putLong((long)'#');
    ByteVector byteVector25 = byteVector21.putInt((int)' ');
    byte[] byte_array27 = new byte[] { (byte)-1 };
    ByteVector byteVector30 = byteVector21.putByteArray(byte_array27, (int)(short)0, (int)(byte)0);
    ByteVector byteVector33 = byteVector19.putByteArray(byte_array27, 0, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector36 = byteVector11.putByteArray(byte_array27, (int)'a', 0);
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
    org.junit.Assert.assertNotNull(byteVector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector33);

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test324"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    byte[] byte_array7 = new byte[] { (byte)-1 };
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(short)0, (int)(byte)0);
    ByteVector byteVector12 = byteVector1.putLong((long)10);
    ByteVector byteVector14 = byteVector1.putShort(0);
    ByteVector byteVector16 = byteVector14.putByte((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test325"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putShort((int)(short)-1);
    ByteVector byteVector13 = byteVector11.putUTF8("");
    ByteVector byteVector15 = byteVector11.putUTF8("");
    ByteVector byteVector17 = byteVector11.putUTF8("");
    ByteVector byteVector19 = byteVector17.putLong((long)(short)0);
    ByteVector byteVector21 = byteVector17.putInt((int)(short)0);
    ByteVector byteVector23 = byteVector21.putUTF8("hi!");
    ByteVector byteVector25 = byteVector23.putShort((int)(short)0);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector25);

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test326"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putShort((int)'#');
    ByteVector byteVector5 = byteVector3.putByte(0);
    ByteVector byteVector7 = byteVector5.putUTF8("hi!");
    ByteVector byteVector9 = byteVector5.putUTF8("hi!");
    ByteVector byteVector11 = byteVector9.putShort(0);
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
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test327"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putShort((int)(short)-1);
    ByteVector byteVector13 = byteVector11.putUTF8("");
    ByteVector byteVector15 = byteVector11.putUTF8("");
    ByteVector byteVector17 = byteVector15.putLong((long)'4');
    ByteVector byteVector19 = byteVector15.putByte((int)(byte)1);
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
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test328"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector3.putShort((int)'4');
    ByteVector byteVector7 = byteVector3.putInt(0);
    ByteVector byteVector9 = byteVector7.putByte((int)' ');
    ByteVector byteVector11 = byteVector7.putByte((int)(byte)1);
    
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
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test329"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector1.putUTF8("");
    ByteVector byteVector13 = byteVector11.putLong((long)(short)100);
    ByteVector byteVector15 = byteVector11.putLong((long)' ');
    ByteVector byteVector17 = byteVector11.putUTF8("hi!");
    
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
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test330"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong(0L);
    ByteVector byteVector5 = byteVector1.putByte((int)'a');
    ByteVector byteVector7 = new ByteVector((int)(short)1);
    ByteVector byteVector9 = byteVector7.putLong((long)'#');
    ByteVector byteVector11 = byteVector7.putInt(0);
    ByteVector byteVector13 = byteVector11.putShort((int)(byte)0);
    ByteVector byteVector15 = byteVector13.putLong(0L);
    ByteVector byteVector17 = byteVector15.putShort((int)'a');
    ByteVector byteVector19 = new ByteVector((int)'4');
    ByteVector byteVector21 = byteVector19.putByte((int)(byte)100);
    byte[] byte_array23 = new byte[] { (byte)-1 };
    ByteVector byteVector26 = byteVector21.putByteArray(byte_array23, (int)(byte)0, 1);
    ByteVector byteVector29 = byteVector15.putByteArray(byte_array23, (int)(short)0, 1);
    ByteVector byteVector32 = byteVector5.putByteArray(byte_array23, (int)(byte)0, (int)(byte)0);
    ByteVector byteVector34 = byteVector32.putShort(100);
    byte[] byte_array35 = null;
    ByteVector byteVector38 = byteVector32.putByteArray(byte_array35, (int)'#', (int)'4');
    
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
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector38);

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test331"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((-1L));
    ByteVector byteVector5 = byteVector3.putLong((long)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test332"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putByte((int)'a');
    ByteVector byteVector5 = byteVector1.putShort((int)'#');
    ByteVector byteVector7 = byteVector1.putShort((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test333"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((-1L));
    ByteVector byteVector5 = byteVector3.putLong((-1L));
    ByteVector byteVector7 = byteVector5.putInt((int)(byte)10);
    ByteVector byteVector9 = byteVector7.putInt((int)' ');
    ByteVector byteVector11 = byteVector7.putShort(10);
    ByteVector byteVector13 = byteVector11.putInt((int)'#');
    
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
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test334"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putByte((int)'a');
    ByteVector byteVector5 = byteVector1.putInt(100);
    ByteVector byteVector7 = byteVector5.putLong((long)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test335"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    ByteVector byteVector7 = byteVector5.putShort(1);
    ByteVector byteVector9 = byteVector7.putLong(100L);
    ByteVector byteVector11 = byteVector9.putShort((int)(short)100);
    ByteVector byteVector13 = byteVector9.putByte((int)(short)0);
    
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
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test336"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector5.putShort((int)(byte)0);
    ByteVector byteVector9 = byteVector7.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector7.putShort((int)(byte)-1);
    ByteVector byteVector13 = new ByteVector((int)'4');
    ByteVector byteVector15 = byteVector13.putByte((int)(byte)100);
    byte[] byte_array17 = new byte[] { (byte)-1 };
    ByteVector byteVector20 = byteVector15.putByteArray(byte_array17, (int)(byte)0, 1);
    ByteVector byteVector23 = byteVector11.putByteArray(byte_array17, 0, (int)(byte)0);
    ByteVector byteVector25 = byteVector11.putUTF8("");
    
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
    org.junit.Assert.assertNotNull(byte_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector25);

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test337"); }


    ByteVector byteVector1 = new ByteVector((int)'4');
    ByteVector byteVector3 = byteVector1.putByte((int)(byte)100);
    ByteVector byteVector5 = byteVector3.putUTF8("");
    ByteVector byteVector7 = byteVector5.putInt((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test338"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    ByteVector byteVector7 = byteVector1.putShort((int)(short)-1);
    ByteVector byteVector9 = byteVector1.putLong((long)(-1));
    ByteVector byteVector11 = byteVector9.putUTF8("");
    ByteVector byteVector13 = byteVector9.putByte((int)(short)1);
    
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
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test339"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    byte[] byte_array7 = new byte[] { (byte)-1 };
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(short)0, (int)(byte)0);
    ByteVector byteVector12 = byteVector1.putUTF8("hi!");
    ByteVector byteVector14 = byteVector1.putLong((long)(short)1);
    ByteVector byteVector16 = byteVector1.putShort((int)(byte)1);
    ByteVector byteVector18 = byteVector1.putShort((int)(short)100);
    ByteVector byteVector20 = byteVector18.putInt(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test340"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    byte[] byte_array7 = new byte[] { (byte)-1 };
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(short)0, (int)(byte)0);
    ByteVector byteVector12 = byteVector10.putInt((int)(byte)10);
    ByteVector byteVector14 = byteVector12.putByte((int)(byte)-1);
    ByteVector byteVector16 = new ByteVector((int)'4');
    ByteVector byteVector18 = byteVector16.putByte((int)(byte)100);
    byte[] byte_array20 = new byte[] { (byte)-1 };
    ByteVector byteVector23 = byteVector18.putByteArray(byte_array20, (int)(byte)0, 1);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector26 = byteVector14.putByteArray(byte_array20, 100, (int)'4');
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
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test341"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    byte[] byte_array7 = new byte[] { (byte)-1 };
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(short)0, (int)(byte)0);
    ByteVector byteVector12 = byteVector1.putUTF8("hi!");
    ByteVector byteVector14 = byteVector12.putUTF8("");
    ByteVector byteVector16 = byteVector12.putShort(0);
    ByteVector byteVector18 = byteVector16.putLong((long)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test342"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector5.putShort((int)(byte)0);
    ByteVector byteVector9 = byteVector5.putShort((int)(short)1);
    ByteVector byteVector11 = byteVector9.putByte((int)(byte)0);
    ByteVector byteVector13 = byteVector9.putByte(100);
    ByteVector byteVector15 = byteVector9.putLong((long)'a');
    
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
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test343"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putShort((int)'#');
    ByteVector byteVector5 = byteVector3.putByte(0);
    ByteVector byteVector7 = byteVector5.putByte((int)' ');
    ByteVector byteVector9 = byteVector7.putShort(0);
    
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
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test344"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putUTF8("hi!");
    ByteVector byteVector7 = byteVector1.putShort(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test345"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector1.putUTF8("");
    ByteVector byteVector13 = byteVector1.putUTF8("hi!");
    ByteVector byteVector15 = byteVector1.putLong(0L);
    
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
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test346"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    byte[] byte_array7 = new byte[] { (byte)-1 };
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(short)0, (int)(byte)0);
    ByteVector byteVector12 = byteVector10.putInt((int)(short)-1);
    ByteVector byteVector14 = byteVector10.putByte((-1));
    ByteVector byteVector16 = byteVector10.putShort((int)(short)0);
    ByteVector byteVector18 = byteVector10.putLong(100L);
    ByteVector byteVector20 = byteVector10.putShort((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test347"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector5.putShort((int)(byte)0);
    ByteVector byteVector9 = byteVector7.putInt((int)(byte)0);
    ByteVector byteVector11 = byteVector9.putByte(0);
    
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
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test348"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    byte[] byte_array7 = new byte[] { (byte)-1 };
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(short)0, (int)(byte)0);
    ByteVector byteVector12 = byteVector10.putInt((int)(short)-1);
    ByteVector byteVector14 = byteVector10.putByte((-1));
    ByteVector byteVector16 = byteVector10.putByte((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test349"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putInt((int)(short)0);
    ByteVector byteVector13 = byteVector9.putByte((int)(byte)-1);
    ByteVector byteVector15 = byteVector9.putUTF8("hi!");
    ByteVector byteVector17 = byteVector9.putLong((long)10);
    byte[] byte_array18 = null;
    ByteVector byteVector21 = byteVector9.putByteArray(byte_array18, (int)' ', (int)'#');
    ByteVector byteVector23 = byteVector9.putByte((int)'a');
    ByteVector byteVector25 = byteVector9.putLong((long)(short)1);
    
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

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test350"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector3.putByte((int)' ');
    ByteVector byteVector7 = byteVector3.putShort(0);
    ByteVector byteVector9 = byteVector7.putUTF8("hi!");
    ByteVector byteVector11 = byteVector7.putByte((int)(short)-1);
    ByteVector byteVector13 = byteVector11.putInt((int)(byte)-1);
    ByteVector byteVector15 = byteVector11.putInt((int)(short)-1);
    
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
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test351"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putShort((int)'#');
    ByteVector byteVector5 = new ByteVector((int)(short)1);
    ByteVector byteVector7 = byteVector5.putLong((long)'#');
    ByteVector byteVector9 = byteVector7.putByte((int)' ');
    ByteVector byteVector11 = byteVector9.putLong((long)0);
    ByteVector byteVector13 = byteVector9.putUTF8("hi!");
    ByteVector byteVector15 = byteVector13.putByte((int)(byte)-1);
    ByteVector byteVector17 = new ByteVector((int)(short)1);
    ByteVector byteVector19 = byteVector17.putLong((long)'#');
    ByteVector byteVector21 = byteVector17.putInt(0);
    ByteVector byteVector23 = byteVector17.putShort((int)(short)10);
    ByteVector byteVector25 = new ByteVector((int)(short)1);
    ByteVector byteVector27 = byteVector25.putLong((long)'#');
    ByteVector byteVector29 = byteVector25.putInt((int)' ');
    byte[] byte_array31 = new byte[] { (byte)-1 };
    ByteVector byteVector34 = byteVector25.putByteArray(byte_array31, (int)(short)0, (int)(byte)0);
    ByteVector byteVector37 = byteVector23.putByteArray(byte_array31, 0, (int)(short)1);
    ByteVector byteVector40 = byteVector13.putByteArray(byte_array31, (int)(byte)0, 1);
    ByteVector byteVector43 = byteVector1.putByteArray(byte_array31, (int)(byte)0, 1);
    
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
    org.junit.Assert.assertNotNull(byte_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector43);

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test352"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putInt((int)(short)0);
    ByteVector byteVector13 = byteVector9.putByte((int)(byte)-1);
    ByteVector byteVector15 = byteVector9.putUTF8("hi!");
    ByteVector byteVector17 = byteVector9.putLong((long)10);
    ByteVector byteVector19 = byteVector17.putUTF8("hi!");
    ByteVector byteVector21 = byteVector17.putShort((int)(short)0);
    
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
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test353"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    byte[] byte_array7 = new byte[] { (byte)-1 };
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(short)0, (int)(byte)0);
    ByteVector byteVector12 = byteVector1.putUTF8("hi!");
    ByteVector byteVector14 = byteVector12.putByte(0);
    ByteVector byteVector16 = byteVector12.putLong(100L);
    ByteVector byteVector18 = byteVector16.putUTF8("hi!");
    ByteVector byteVector20 = new ByteVector((int)(short)1);
    ByteVector byteVector22 = byteVector20.putLong((long)'#');
    ByteVector byteVector24 = byteVector20.putInt(0);
    ByteVector byteVector26 = byteVector20.putShort((int)(short)10);
    ByteVector byteVector28 = new ByteVector((int)(short)1);
    ByteVector byteVector30 = byteVector28.putLong((long)'#');
    ByteVector byteVector32 = byteVector28.putInt((int)' ');
    byte[] byte_array34 = new byte[] { (byte)-1 };
    ByteVector byteVector37 = byteVector28.putByteArray(byte_array34, (int)(short)0, (int)(byte)0);
    ByteVector byteVector40 = byteVector26.putByteArray(byte_array34, 0, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector43 = byteVector16.putByteArray(byte_array34, (int)(short)10, 0);
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
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector40);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test354"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putShort((int)(short)-1);
    ByteVector byteVector13 = byteVector11.putUTF8("");
    ByteVector byteVector15 = byteVector11.putUTF8("");
    ByteVector byteVector17 = byteVector15.putShort((int)(byte)10);
    ByteVector byteVector19 = byteVector17.putInt((int)'#');
    byte[] byte_array20 = null;
    ByteVector byteVector23 = byteVector17.putByteArray(byte_array20, (int)(byte)10, (int)'4');
    
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

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test355"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    byte[] byte_array7 = new byte[] { (byte)-1 };
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(short)0, (int)(byte)0);
    ByteVector byteVector12 = byteVector1.putLong((long)10);
    ByteVector byteVector14 = byteVector12.putLong((long)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test356"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    byte[] byte_array7 = new byte[] { (byte)-1 };
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(short)0, (int)(byte)0);
    ByteVector byteVector12 = byteVector10.putInt((int)(byte)10);
    ByteVector byteVector14 = byteVector12.putLong((long)(-1));
    ByteVector byteVector16 = byteVector12.putByte((int)(byte)-1);
    ByteVector byteVector18 = new ByteVector((int)(short)1);
    ByteVector byteVector20 = byteVector18.putLong((long)'#');
    ByteVector byteVector22 = byteVector18.putInt((int)' ');
    byte[] byte_array24 = new byte[] { (byte)-1 };
    ByteVector byteVector27 = byteVector18.putByteArray(byte_array24, (int)(short)0, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector30 = byteVector16.putByteArray(byte_array24, 100, (int)' ');
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
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector27);

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test357"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putShort((int)'#');
    ByteVector byteVector5 = byteVector3.putByte(0);
    ByteVector byteVector7 = byteVector3.putUTF8("");
    ByteVector byteVector9 = byteVector7.putLong(10L);
    ByteVector byteVector11 = byteVector9.putInt((int)(byte)1);
    ByteVector byteVector13 = byteVector9.putByte((int)(byte)0);
    ByteVector byteVector15 = byteVector9.putInt((int)' ');
    
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
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test358"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector3.putShort((int)'4');
    ByteVector byteVector7 = byteVector3.putInt(0);
    ByteVector byteVector9 = byteVector7.putByte((int)' ');
    ByteVector byteVector11 = byteVector9.putShort((int)(short)100);
    ByteVector byteVector13 = byteVector9.putByte((int)'4');
    
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
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test359"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putShort((int)(short)-1);
    ByteVector byteVector13 = byteVector9.putUTF8("");
    ByteVector byteVector15 = byteVector9.putShort(1);
    ByteVector byteVector17 = byteVector15.putByte((int)'#');
    ByteVector byteVector19 = byteVector15.putInt((int)(short)1);
    ByteVector byteVector21 = byteVector15.putShort((-1));
    
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
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test360"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putShort((int)'#');
    ByteVector byteVector5 = byteVector3.putByte(0);
    ByteVector byteVector7 = byteVector5.putUTF8("hi!");
    ByteVector byteVector9 = byteVector5.putUTF8("hi!");
    ByteVector byteVector11 = byteVector9.putInt((-1));
    ByteVector byteVector13 = byteVector11.putByte(0);
    ByteVector byteVector15 = byteVector13.putShort((int)' ');
    ByteVector byteVector17 = byteVector15.putInt((int)(byte)10);
    
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
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test361"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    byte[] byte_array7 = new byte[] { (byte)-1 };
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(short)0, (int)(byte)0);
    ByteVector byteVector12 = byteVector1.putUTF8("hi!");
    ByteVector byteVector14 = byteVector12.putUTF8("");
    ByteVector byteVector16 = byteVector14.putLong((long)(short)0);
    ByteVector byteVector18 = new ByteVector((int)(short)1);
    ByteVector byteVector20 = byteVector18.putLong((long)'#');
    ByteVector byteVector22 = byteVector18.putInt(0);
    ByteVector byteVector24 = byteVector22.putShort((int)(byte)0);
    ByteVector byteVector26 = byteVector24.putLong(0L);
    ByteVector byteVector28 = byteVector26.putShort((int)'a');
    ByteVector byteVector30 = new ByteVector((int)'4');
    ByteVector byteVector32 = byteVector30.putByte((int)(byte)100);
    byte[] byte_array34 = new byte[] { (byte)-1 };
    ByteVector byteVector37 = byteVector32.putByteArray(byte_array34, (int)(byte)0, 1);
    ByteVector byteVector40 = byteVector26.putByteArray(byte_array34, (int)(short)0, 1);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector43 = byteVector14.putByteArray(byte_array34, 0, (int)(byte)100);
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
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector40);

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test362"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    ByteVector byteVector7 = byteVector5.putShort(1);
    ByteVector byteVector9 = byteVector5.putInt((int)(short)10);
    ByteVector byteVector11 = byteVector5.putShort(0);
    ByteVector byteVector13 = byteVector11.putLong(1L);
    ByteVector byteVector15 = byteVector13.putLong((-1L));
    ByteVector byteVector17 = byteVector15.putByte((int)(short)0);
    
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
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test363"); }


    ByteVector byteVector1 = new ByteVector((int)(byte)10);
    ByteVector byteVector3 = new ByteVector((int)(short)1);
    ByteVector byteVector5 = byteVector3.putLong((long)'#');
    ByteVector byteVector7 = byteVector3.putInt(0);
    ByteVector byteVector9 = byteVector3.putShort((int)(short)10);
    ByteVector byteVector11 = byteVector3.putByte((int)(short)0);
    ByteVector byteVector13 = byteVector11.putShort((int)(short)-1);
    ByteVector byteVector15 = byteVector11.putUTF8("");
    ByteVector byteVector17 = byteVector11.putShort(1);
    ByteVector byteVector19 = new ByteVector((int)'4');
    ByteVector byteVector21 = byteVector19.putByte((int)(byte)100);
    byte[] byte_array23 = new byte[] { (byte)-1 };
    ByteVector byteVector26 = byteVector21.putByteArray(byte_array23, (int)(byte)0, 1);
    ByteVector byteVector29 = byteVector11.putByteArray(byte_array23, 1, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector32 = byteVector1.putByteArray(byte_array23, (int)(short)-1, (int)(short)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
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
    org.junit.Assert.assertNotNull(byte_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector29);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test364"); }


    ByteVector byteVector1 = new ByteVector((int)'4');
    ByteVector byteVector3 = byteVector1.putByte((int)(byte)100);
    byte[] byte_array5 = new byte[] { (byte)-1 };
    ByteVector byteVector8 = byteVector3.putByteArray(byte_array5, (int)(byte)0, 1);
    ByteVector byteVector10 = byteVector3.putLong((long)(byte)0);
    ByteVector byteVector12 = byteVector3.putInt(0);
    byte[] byte_array13 = null;
    ByteVector byteVector16 = byteVector3.putByteArray(byte_array13, 0, 100);
    ByteVector byteVector18 = byteVector16.putInt((int)'a');
    ByteVector byteVector20 = byteVector16.putUTF8("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test365"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putShort((int)(short)-1);
    ByteVector byteVector13 = byteVector9.putUTF8("");
    ByteVector byteVector15 = byteVector13.putLong((long)'#');
    ByteVector byteVector17 = byteVector15.putLong(0L);
    ByteVector byteVector19 = byteVector15.putInt((int)(short)0);
    ByteVector byteVector21 = byteVector15.putInt((int)(byte)-1);
    ByteVector byteVector23 = byteVector21.putByte((int)(short)-1);
    ByteVector byteVector25 = byteVector23.putShort(1);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector25);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test366"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putShort((int)'#');
    ByteVector byteVector5 = byteVector3.putByte(0);
    ByteVector byteVector7 = byteVector3.putShort(0);
    ByteVector byteVector9 = byteVector3.putInt((int)(byte)10);
    ByteVector byteVector11 = byteVector9.putByte(0);
    
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
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test367"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector5.putShort((int)(byte)0);
    ByteVector byteVector9 = byteVector7.putLong(0L);
    ByteVector byteVector11 = byteVector9.putShort((int)'a');
    ByteVector byteVector13 = byteVector9.putByte((int)(byte)10);
    ByteVector byteVector15 = byteVector9.putByte((int)(short)-1);
    
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
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test368"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector3.putByte((int)' ');
    ByteVector byteVector7 = byteVector3.putShort(0);
    ByteVector byteVector9 = byteVector3.putUTF8("");
    
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
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test369"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    byte[] byte_array7 = new byte[] { (byte)-1 };
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(short)0, (int)(byte)0);
    ByteVector byteVector12 = byteVector1.putUTF8("hi!");
    ByteVector byteVector14 = byteVector12.putByte(0);
    ByteVector byteVector16 = byteVector12.putByte((int)(byte)10);
    ByteVector byteVector18 = byteVector16.putByte((int)'#');
    ByteVector byteVector20 = byteVector18.putInt((int)'4');
    ByteVector byteVector22 = byteVector20.putUTF8("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector22);

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test370"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector3.putByte((int)' ');
    ByteVector byteVector7 = byteVector5.putLong((long)0);
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
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test371"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector5.putShort((int)(byte)0);
    ByteVector byteVector9 = byteVector7.putShort(0);
    ByteVector byteVector11 = byteVector7.putLong(10L);
    
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
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test372"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector3.putByte((int)' ');
    ByteVector byteVector7 = byteVector3.putShort(0);
    ByteVector byteVector9 = byteVector3.putInt((int)(short)100);
    ByteVector byteVector11 = byteVector3.putLong((long)'a');
    ByteVector byteVector13 = byteVector3.putLong((long)(byte)-1);
    ByteVector byteVector15 = byteVector13.putByte(100);
    
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
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test373"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putShort((int)(short)-1);
    ByteVector byteVector13 = byteVector9.putUTF8("");
    ByteVector byteVector15 = byteVector13.putLong((long)'#');
    ByteVector byteVector17 = byteVector15.putLong(0L);
    ByteVector byteVector19 = byteVector15.putInt((int)(short)0);
    ByteVector byteVector21 = byteVector15.putUTF8("");
    ByteVector byteVector23 = byteVector21.putUTF8("hi!");
    
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
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test374"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = new ByteVector((int)(short)1);
    ByteVector byteVector11 = byteVector9.putLong((long)'#');
    ByteVector byteVector13 = byteVector9.putInt((int)' ');
    byte[] byte_array15 = new byte[] { (byte)-1 };
    ByteVector byteVector18 = byteVector9.putByteArray(byte_array15, (int)(short)0, (int)(byte)0);
    ByteVector byteVector21 = byteVector7.putByteArray(byte_array15, 0, (int)(short)1);
    ByteVector byteVector23 = byteVector21.putInt((int)(short)100);
    ByteVector byteVector25 = byteVector21.putShort(10);
    ByteVector byteVector27 = byteVector25.putByte((int)(short)-1);
    
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
    org.junit.Assert.assertNotNull(byte_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector27);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test375"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    byte[] byte_array7 = new byte[] { (byte)-1 };
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(short)0, (int)(byte)0);
    ByteVector byteVector12 = byteVector10.putInt((int)(byte)10);
    ByteVector byteVector14 = byteVector12.putByte((int)(byte)-1);
    ByteVector byteVector16 = byteVector12.putUTF8("hi!");
    ByteVector byteVector18 = byteVector12.putLong((long)100);
    ByteVector byteVector20 = byteVector12.putLong((long)(short)100);
    ByteVector byteVector22 = byteVector20.putLong((long)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector22);

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test376"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putInt((int)(short)0);
    ByteVector byteVector13 = byteVector9.putByte((int)(byte)-1);
    ByteVector byteVector15 = byteVector13.putShort((int)'a');
    ByteVector byteVector17 = byteVector15.putShort((int)' ');
    ByteVector byteVector19 = byteVector17.putShort((int)(byte)1);
    ByteVector byteVector21 = byteVector19.putInt(100);
    ByteVector byteVector23 = byteVector21.putUTF8("");
    
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
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test377"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector5.putInt((int)(byte)0);
    byte[] byte_array13 = new byte[] { (byte)1, (byte)0, (byte)0, (byte)10, (byte)-1 };
    ByteVector byteVector16 = byteVector5.putByteArray(byte_array13, 1, (int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test378"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putShort((int)(short)-1);
    ByteVector byteVector13 = byteVector9.putUTF8("");
    ByteVector byteVector15 = byteVector13.putLong((long)'#');
    ByteVector byteVector17 = byteVector13.putUTF8("hi!");
    ByteVector byteVector19 = byteVector13.putByte((int)'a');
    ByteVector byteVector21 = byteVector13.putInt(100);
    ByteVector byteVector23 = byteVector21.putShort(0);
    
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
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test379"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector3.putShort((int)'4');
    ByteVector byteVector7 = byteVector3.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector3.putLong((long)10);
    ByteVector byteVector11 = new ByteVector((int)(short)1);
    ByteVector byteVector13 = byteVector11.putLong((long)'#');
    ByteVector byteVector15 = byteVector11.putInt(0);
    ByteVector byteVector17 = byteVector11.putShort((int)(short)10);
    ByteVector byteVector19 = byteVector11.putUTF8("hi!");
    ByteVector byteVector21 = byteVector11.putShort((int)(short)1);
    ByteVector byteVector23 = new ByteVector((int)'4');
    ByteVector byteVector25 = byteVector23.putByte((int)(byte)100);
    byte[] byte_array27 = new byte[] { (byte)-1 };
    ByteVector byteVector30 = byteVector25.putByteArray(byte_array27, (int)(byte)0, 1);
    ByteVector byteVector33 = byteVector11.putByteArray(byte_array27, 0, 0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector36 = byteVector3.putByteArray(byte_array27, (int)(short)10, (int)'4');
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
    org.junit.Assert.assertNotNull(byteVector25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector33);

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test380"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putInt((int)(short)0);
    ByteVector byteVector13 = byteVector9.putByte((int)(byte)-1);
    ByteVector byteVector15 = byteVector13.putShort((int)'a');
    ByteVector byteVector17 = byteVector13.putLong((long)(short)1);
    ByteVector byteVector19 = byteVector13.putByte(100);
    ByteVector byteVector21 = byteVector13.putLong((long)' ');
    ByteVector byteVector23 = byteVector21.putUTF8("hi!");
    
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
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test381"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    ByteVector byteVector7 = byteVector5.putShort(1);
    ByteVector byteVector9 = byteVector5.putInt((int)(short)10);
    ByteVector byteVector11 = byteVector5.putShort(0);
    ByteVector byteVector13 = byteVector5.putLong((long)(byte)100);
    
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
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test382"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putShort((int)(short)-1);
    ByteVector byteVector13 = byteVector11.putUTF8("");
    ByteVector byteVector15 = byteVector11.putUTF8("");
    ByteVector byteVector17 = byteVector15.putShort((int)(byte)10);
    ByteVector byteVector19 = byteVector15.putUTF8("");
    ByteVector byteVector21 = byteVector15.putUTF8("hi!");
    ByteVector byteVector23 = byteVector15.putByte(0);
    ByteVector byteVector25 = byteVector23.putUTF8("hi!");
    ByteVector byteVector27 = byteVector23.putInt((int)(byte)-1);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector27);

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test383"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector3.putByte((int)' ');
    ByteVector byteVector7 = byteVector3.putShort(0);
    ByteVector byteVector9 = byteVector3.putInt((int)(short)100);
    ByteVector byteVector11 = new ByteVector((int)(short)1);
    ByteVector byteVector13 = byteVector11.putLong((long)'#');
    ByteVector byteVector15 = byteVector11.putInt((int)' ');
    byte[] byte_array17 = new byte[] { (byte)-1 };
    ByteVector byteVector20 = byteVector11.putByteArray(byte_array17, (int)(short)0, (int)(byte)0);
    ByteVector byteVector23 = byteVector3.putByteArray(byte_array17, (int)(byte)0, 0);
    ByteVector byteVector25 = byteVector23.putLong((long)(short)100);
    
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
    org.junit.Assert.assertNotNull(byte_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector25);

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test384"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector5.putInt((int)(byte)0);
    ByteVector byteVector9 = byteVector5.putShort((int)'4');
    ByteVector byteVector11 = byteVector5.putByte((int)'4');
    ByteVector byteVector13 = byteVector5.putLong((long)(byte)1);
    
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
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test385"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector3.putByte((int)' ');
    ByteVector byteVector7 = byteVector3.putShort((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test386"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector5.putInt((int)(byte)0);
    ByteVector byteVector9 = byteVector5.putShort((int)'4');
    ByteVector byteVector11 = byteVector5.putByte((int)'4');
    ByteVector byteVector13 = byteVector5.putByte((int)(byte)1);
    ByteVector byteVector15 = byteVector13.putInt((int)(short)-1);
    
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
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test387"); }


    ByteVector byteVector1 = new ByteVector((int)'#');
    ByteVector byteVector3 = byteVector1.putByte((int)(short)10);
    ByteVector byteVector5 = byteVector3.putShort((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test388"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector3.putByte((int)' ');
    ByteVector byteVector7 = byteVector3.putShort(0);
    ByteVector byteVector9 = byteVector3.putUTF8("hi!");
    ByteVector byteVector11 = byteVector9.putInt(10);
    
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
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test389"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector3.putByte((int)' ');
    ByteVector byteVector7 = byteVector5.putLong((long)0);
    ByteVector byteVector9 = byteVector5.putUTF8("hi!");
    ByteVector byteVector11 = byteVector5.putByte((int)'a');
    ByteVector byteVector13 = byteVector5.putShort((int)(short)10);
    ByteVector byteVector15 = byteVector5.putLong((long)(byte)1);
    
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
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test390"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector1.putUTF8("");
    ByteVector byteVector13 = byteVector1.putUTF8("hi!");
    ByteVector byteVector15 = byteVector13.putByte((int)(short)-1);
    
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
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test391"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    byte[] byte_array7 = new byte[] { (byte)-1 };
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(short)0, (int)(byte)0);
    ByteVector byteVector12 = byteVector1.putLong((long)10);
    ByteVector byteVector14 = byteVector12.putLong((long)(-1));
    ByteVector byteVector16 = byteVector14.putUTF8("");
    ByteVector byteVector18 = byteVector14.putInt((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test392"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putShort((int)'#');
    ByteVector byteVector5 = byteVector3.putByte(0);
    ByteVector byteVector7 = byteVector5.putUTF8("hi!");
    ByteVector byteVector9 = byteVector5.putShort((int)(byte)-1);
    ByteVector byteVector11 = byteVector5.putLong((long)(short)-1);
    ByteVector byteVector13 = byteVector11.putInt((int)(short)-1);
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
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test393"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putShort((int)(short)-1);
    ByteVector byteVector13 = byteVector9.putUTF8("");
    ByteVector byteVector15 = byteVector9.putShort(1);
    ByteVector byteVector17 = byteVector15.putByte((int)'#');
    ByteVector byteVector19 = byteVector15.putInt((int)(short)1);
    ByteVector byteVector21 = new ByteVector((int)(short)1);
    ByteVector byteVector23 = byteVector21.putLong((long)'#');
    ByteVector byteVector25 = byteVector21.putInt(0);
    ByteVector byteVector27 = byteVector21.putShort((int)(short)10);
    ByteVector byteVector29 = byteVector21.putUTF8("hi!");
    ByteVector byteVector31 = byteVector21.putShort((int)(short)1);
    ByteVector byteVector33 = new ByteVector((int)'4');
    ByteVector byteVector35 = byteVector33.putByte((int)(byte)100);
    byte[] byte_array37 = new byte[] { (byte)-1 };
    ByteVector byteVector40 = byteVector35.putByteArray(byte_array37, (int)(byte)0, 1);
    ByteVector byteVector43 = byteVector21.putByteArray(byte_array37, 0, 0);
    ByteVector byteVector46 = byteVector19.putByteArray(byte_array37, 1, (int)(short)0);
    
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
    org.junit.Assert.assertNotNull(byteVector35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector46);

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test394"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = new ByteVector((int)(short)1);
    ByteVector byteVector11 = byteVector9.putLong((long)'#');
    ByteVector byteVector13 = byteVector9.putInt((int)' ');
    byte[] byte_array15 = new byte[] { (byte)-1 };
    ByteVector byteVector18 = byteVector9.putByteArray(byte_array15, (int)(short)0, (int)(byte)0);
    ByteVector byteVector21 = byteVector7.putByteArray(byte_array15, 0, (int)(short)1);
    ByteVector byteVector23 = byteVector21.putByte((int)' ');
    ByteVector byteVector25 = byteVector21.putByte((int)'#');
    ByteVector byteVector27 = byteVector25.putInt((int)(byte)0);
    
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
    org.junit.Assert.assertNotNull(byte_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector27);

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test395"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putShort((int)'#');
    ByteVector byteVector5 = byteVector3.putByte(0);
    ByteVector byteVector7 = byteVector5.putUTF8("hi!");
    ByteVector byteVector9 = byteVector5.putUTF8("hi!");
    ByteVector byteVector11 = byteVector9.putInt((-1));
    ByteVector byteVector13 = byteVector11.putByte(0);
    ByteVector byteVector15 = byteVector13.putShort((int)' ');
    ByteVector byteVector17 = byteVector15.putInt((int)'4');
    
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
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test396"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putShort((int)(short)-1);
    ByteVector byteVector13 = byteVector9.putUTF8("");
    ByteVector byteVector15 = byteVector9.putShort(1);
    ByteVector byteVector17 = byteVector15.putByte((int)'#');
    ByteVector byteVector19 = byteVector15.putByte((int)(short)-1);
    ByteVector byteVector21 = byteVector19.putByte((int)'#');
    
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
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test397"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putUTF8("hi!");
    ByteVector byteVector11 = byteVector9.putInt((int)(byte)10);
    ByteVector byteVector13 = byteVector11.putByte(100);
    
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
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test398"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putInt((int)(short)0);
    ByteVector byteVector13 = byteVector9.putByte((int)(byte)-1);
    ByteVector byteVector15 = byteVector9.putByte((int)(short)-1);
    ByteVector byteVector17 = byteVector15.putByte((int)(short)1);
    ByteVector byteVector19 = byteVector17.putByte((int)(byte)0);
    
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
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test399"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    ByteVector byteVector7 = byteVector1.putUTF8("");
    ByteVector byteVector9 = byteVector1.putLong((long)(short)-1);
    ByteVector byteVector11 = byteVector9.putByte((int)(byte)-1);
    
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
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test400"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    byte[] byte_array7 = new byte[] { (byte)-1 };
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(short)0, (int)(byte)0);
    ByteVector byteVector12 = byteVector1.putUTF8("hi!");
    ByteVector byteVector14 = byteVector12.putUTF8("");
    ByteVector byteVector16 = byteVector12.putShort(0);
    ByteVector byteVector18 = byteVector16.putLong(0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test401"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    byte[] byte_array7 = new byte[] { (byte)-1 };
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(short)0, (int)(byte)0);
    ByteVector byteVector12 = byteVector1.putUTF8("hi!");
    ByteVector byteVector14 = byteVector1.putInt((int)(short)-1);
    ByteVector byteVector16 = byteVector1.putLong((long)(byte)0);
    ByteVector byteVector18 = byteVector1.putShort(10);
    ByteVector byteVector20 = byteVector18.putShort((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test402"); }


    ByteVector byteVector1 = new ByteVector((int)'4');
    ByteVector byteVector3 = byteVector1.putByte((int)(byte)100);
    byte[] byte_array5 = new byte[] { (byte)-1 };
    ByteVector byteVector8 = byteVector3.putByteArray(byte_array5, (int)(byte)0, 1);
    ByteVector byteVector10 = byteVector3.putLong((long)(byte)0);
    ByteVector byteVector12 = byteVector3.putInt(0);
    byte[] byte_array13 = null;
    ByteVector byteVector16 = byteVector3.putByteArray(byte_array13, 0, 100);
    ByteVector byteVector18 = byteVector16.putInt((int)'a');
    ByteVector byteVector20 = byteVector18.putInt(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test403"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector3.putShort((int)'4');
    ByteVector byteVector7 = byteVector3.putInt(0);
    ByteVector byteVector9 = byteVector7.putByte((int)' ');
    ByteVector byteVector11 = byteVector7.putShort((int)' ');
    ByteVector byteVector13 = byteVector11.putByte((int)'a');
    ByteVector byteVector15 = byteVector13.putShort((int)(byte)100);
    
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
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test404"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    byte[] byte_array7 = new byte[] { (byte)-1 };
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(short)0, (int)(byte)0);
    ByteVector byteVector12 = byteVector10.putInt((int)(short)-1);
    ByteVector byteVector14 = byteVector12.putInt((int)(short)10);
    ByteVector byteVector16 = byteVector12.putUTF8("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test405"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putInt((int)(short)0);
    ByteVector byteVector13 = byteVector9.putByte((int)(byte)-1);
    ByteVector byteVector15 = byteVector13.putShort((int)'a');
    ByteVector byteVector17 = byteVector13.putLong((long)(short)-1);
    ByteVector byteVector19 = byteVector17.putByte((int)'#');
    ByteVector byteVector21 = byteVector17.putLong(0L);
    ByteVector byteVector23 = byteVector17.putUTF8("hi!");
    
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
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test406"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    byte[] byte_array7 = new byte[] { (byte)-1 };
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(short)0, (int)(byte)0);
    ByteVector byteVector12 = byteVector1.putInt((int)' ');
    ByteVector byteVector14 = byteVector1.putLong((long)100);
    ByteVector byteVector16 = byteVector14.putByte((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test407"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    byte[] byte_array7 = new byte[] { (byte)-1 };
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(short)0, (int)(byte)0);
    ByteVector byteVector12 = byteVector1.putUTF8("hi!");
    ByteVector byteVector14 = byteVector12.putByte(0);
    ByteVector byteVector16 = byteVector12.putByte((int)(byte)10);
    ByteVector byteVector18 = byteVector12.putUTF8("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test408"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector5.putInt((int)(byte)0);
    ByteVector byteVector9 = byteVector5.putShort((int)'4');
    ByteVector byteVector11 = byteVector5.putByte((int)'4');
    ByteVector byteVector13 = byteVector5.putByte((int)(byte)1);
    ByteVector byteVector15 = byteVector5.putByte((int)(byte)0);
    
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
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test409"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    byte[] byte_array7 = new byte[] { (byte)-1 };
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(short)0, (int)(byte)0);
    ByteVector byteVector12 = byteVector1.putUTF8("hi!");
    ByteVector byteVector14 = byteVector1.putInt((int)(short)-1);
    ByteVector byteVector16 = byteVector1.putLong((long)(byte)0);
    ByteVector byteVector18 = byteVector1.putShort(10);
    ByteVector byteVector20 = byteVector18.putLong((long)(byte)1);
    ByteVector byteVector22 = byteVector20.putLong((long)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector22);

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test410"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    byte[] byte_array7 = new byte[] { (byte)-1 };
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(short)0, (int)(byte)0);
    ByteVector byteVector12 = byteVector1.putUTF8("hi!");
    ByteVector byteVector14 = byteVector12.putByte((int)(short)-1);
    ByteVector byteVector16 = byteVector14.putLong((long)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test411"); }


    ByteVector byteVector1 = new ByteVector((int)(byte)0);
    ByteVector byteVector3 = byteVector1.putLong((long)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test412"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector5.putShort((int)(byte)0);
    ByteVector byteVector9 = byteVector7.putInt((int)(short)-1);
    ByteVector byteVector11 = byteVector9.putByte((-1));
    ByteVector byteVector13 = byteVector9.putShort((int)(byte)1);
    
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
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test413"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector3.putShort((int)'4');
    ByteVector byteVector7 = byteVector3.putInt(0);
    ByteVector byteVector9 = byteVector7.putByte((int)' ');
    ByteVector byteVector11 = byteVector7.putUTF8("");
    
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
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test414"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector5.putShort((int)(byte)0);
    ByteVector byteVector9 = byteVector7.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector7.putShort((int)(byte)-1);
    ByteVector byteVector13 = byteVector11.putByte(10);
    ByteVector byteVector15 = new ByteVector((int)(short)1);
    ByteVector byteVector17 = byteVector15.putLong((long)'#');
    ByteVector byteVector19 = byteVector17.putByte((int)' ');
    ByteVector byteVector21 = byteVector19.putLong((long)0);
    ByteVector byteVector23 = byteVector19.putUTF8("hi!");
    ByteVector byteVector25 = byteVector19.putByte((int)'a');
    ByteVector byteVector27 = new ByteVector((int)(short)1);
    ByteVector byteVector29 = byteVector27.putLong((long)'#');
    ByteVector byteVector31 = byteVector27.putInt(0);
    ByteVector byteVector33 = byteVector31.putShort((int)(byte)0);
    ByteVector byteVector35 = byteVector33.putByte((int)(short)0);
    ByteVector byteVector37 = byteVector33.putShort((int)(byte)-1);
    ByteVector byteVector39 = new ByteVector((int)'4');
    ByteVector byteVector41 = byteVector39.putByte((int)(byte)100);
    byte[] byte_array43 = new byte[] { (byte)-1 };
    ByteVector byteVector46 = byteVector41.putByteArray(byte_array43, (int)(byte)0, 1);
    ByteVector byteVector49 = byteVector37.putByteArray(byte_array43, 0, (int)(byte)0);
    ByteVector byteVector52 = byteVector19.putByteArray(byte_array43, 0, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector55 = byteVector13.putByteArray(byte_array43, 0, (int)(byte)100);
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
    org.junit.Assert.assertNotNull(byteVector41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector52);

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test415"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putShort((int)(short)-1);
    ByteVector byteVector13 = byteVector9.putUTF8("");
    ByteVector byteVector15 = byteVector9.putShort(1);
    ByteVector byteVector17 = byteVector15.putByte((int)'#');
    ByteVector byteVector19 = byteVector15.putInt((int)(short)1);
    ByteVector byteVector21 = byteVector19.putLong((long)1);
    ByteVector byteVector23 = byteVector19.putInt(0);
    ByteVector byteVector25 = new ByteVector((int)(short)1);
    ByteVector byteVector27 = byteVector25.putLong((long)'#');
    ByteVector byteVector29 = byteVector25.putInt(0);
    ByteVector byteVector31 = byteVector25.putShort((int)(short)10);
    ByteVector byteVector33 = byteVector25.putByte((int)(short)0);
    ByteVector byteVector35 = byteVector33.putInt((int)(short)0);
    ByteVector byteVector37 = byteVector33.putByte((int)(byte)-1);
    ByteVector byteVector39 = byteVector33.putUTF8("hi!");
    ByteVector byteVector41 = byteVector33.putUTF8("");
    ByteVector byteVector43 = byteVector41.putShort((int)(byte)10);
    ByteVector byteVector45 = new ByteVector((int)(short)1);
    ByteVector byteVector47 = byteVector45.putLong((long)'#');
    ByteVector byteVector49 = byteVector47.putByte((int)' ');
    ByteVector byteVector51 = byteVector49.putLong((long)0);
    ByteVector byteVector53 = byteVector49.putUTF8("hi!");
    ByteVector byteVector55 = byteVector49.putByte((int)'a');
    ByteVector byteVector57 = new ByteVector((int)(short)1);
    ByteVector byteVector59 = byteVector57.putLong((long)'#');
    ByteVector byteVector61 = byteVector57.putInt(0);
    ByteVector byteVector63 = byteVector61.putShort((int)(byte)0);
    ByteVector byteVector65 = byteVector63.putByte((int)(short)0);
    ByteVector byteVector67 = byteVector63.putShort((int)(byte)-1);
    ByteVector byteVector69 = new ByteVector((int)'4');
    ByteVector byteVector71 = byteVector69.putByte((int)(byte)100);
    byte[] byte_array73 = new byte[] { (byte)-1 };
    ByteVector byteVector76 = byteVector71.putByteArray(byte_array73, (int)(byte)0, 1);
    ByteVector byteVector79 = byteVector67.putByteArray(byte_array73, 0, (int)(byte)0);
    ByteVector byteVector82 = byteVector49.putByteArray(byte_array73, 0, (int)(short)0);
    ByteVector byteVector85 = byteVector41.putByteArray(byte_array73, (int)(byte)0, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector88 = byteVector19.putByteArray(byte_array73, (int)(byte)100, (int)(byte)10);
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
    org.junit.Assert.assertNotNull(byteVector47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector85);

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test416"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putInt((int)(short)0);
    ByteVector byteVector13 = byteVector9.putByte((int)(byte)-1);
    ByteVector byteVector15 = byteVector13.putShort((int)'a');
    ByteVector byteVector17 = byteVector13.putShort((int)(short)10);
    ByteVector byteVector19 = byteVector17.putShort(1);
    ByteVector byteVector21 = byteVector17.putUTF8("");
    ByteVector byteVector23 = new ByteVector((int)(short)1);
    ByteVector byteVector25 = byteVector23.putLong((long)'#');
    ByteVector byteVector27 = byteVector23.putInt(0);
    ByteVector byteVector29 = byteVector27.putShort((int)(byte)0);
    ByteVector byteVector31 = byteVector29.putByte((int)(short)0);
    ByteVector byteVector33 = byteVector29.putShort((int)(byte)-1);
    ByteVector byteVector35 = new ByteVector((int)'4');
    ByteVector byteVector37 = byteVector35.putByte((int)(byte)100);
    byte[] byte_array39 = new byte[] { (byte)-1 };
    ByteVector byteVector42 = byteVector37.putByteArray(byte_array39, (int)(byte)0, 1);
    ByteVector byteVector45 = byteVector33.putByteArray(byte_array39, 0, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector48 = byteVector17.putByteArray(byte_array39, (int)' ', (-1));
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
    org.junit.Assert.assertNotNull(byteVector37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector45);

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test417"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector3.putByte((int)' ');
    ByteVector byteVector7 = byteVector3.putShort(0);
    ByteVector byteVector9 = byteVector7.putUTF8("hi!");
    ByteVector byteVector11 = byteVector7.putLong(100L);
    ByteVector byteVector13 = byteVector7.putUTF8("");
    ByteVector byteVector15 = byteVector13.putLong((long)(byte)-1);
    
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
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test418"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    ByteVector byteVector7 = byteVector5.putShort(1);
    ByteVector byteVector9 = byteVector5.putInt((int)(short)10);
    ByteVector byteVector11 = byteVector9.putByte((int)(short)1);
    ByteVector byteVector13 = byteVector11.putShort((int)(short)10);
    
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
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test419"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putLong((long)100);
    ByteVector byteVector13 = new ByteVector((int)(short)1);
    ByteVector byteVector15 = byteVector13.putLong((long)'#');
    ByteVector byteVector17 = byteVector15.putByte((int)' ');
    ByteVector byteVector19 = byteVector17.putLong((long)0);
    ByteVector byteVector21 = byteVector17.putUTF8("hi!");
    ByteVector byteVector23 = byteVector17.putByte((int)'a');
    ByteVector byteVector25 = new ByteVector((int)(short)1);
    ByteVector byteVector27 = byteVector25.putLong((long)'#');
    ByteVector byteVector29 = byteVector25.putInt(0);
    ByteVector byteVector31 = byteVector29.putShort((int)(byte)0);
    ByteVector byteVector33 = byteVector31.putByte((int)(short)0);
    ByteVector byteVector35 = byteVector31.putShort((int)(byte)-1);
    ByteVector byteVector37 = new ByteVector((int)'4');
    ByteVector byteVector39 = byteVector37.putByte((int)(byte)100);
    byte[] byte_array41 = new byte[] { (byte)-1 };
    ByteVector byteVector44 = byteVector39.putByteArray(byte_array41, (int)(byte)0, 1);
    ByteVector byteVector47 = byteVector35.putByteArray(byte_array41, 0, (int)(byte)0);
    ByteVector byteVector50 = byteVector17.putByteArray(byte_array41, 0, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector53 = byteVector9.putByteArray(byte_array41, (int)'a', 0);
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
    org.junit.Assert.assertNotNull(byteVector39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector50);

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test420"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putInt((int)(short)0);
    ByteVector byteVector13 = byteVector9.putByte((int)(byte)-1);
    ByteVector byteVector15 = byteVector13.putShort((int)'a');
    ByteVector byteVector17 = byteVector13.putLong((long)(short)-1);
    ByteVector byteVector19 = byteVector13.putUTF8("hi!");
    ByteVector byteVector21 = byteVector19.putLong((long)100);
    
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
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test421"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putShort((int)(short)-1);
    ByteVector byteVector13 = byteVector11.putUTF8("");
    ByteVector byteVector15 = byteVector11.putUTF8("");
    ByteVector byteVector17 = byteVector15.putShort((int)(byte)10);
    ByteVector byteVector19 = byteVector15.putUTF8("");
    ByteVector byteVector21 = byteVector15.putUTF8("hi!");
    ByteVector byteVector23 = byteVector15.putByte(0);
    ByteVector byteVector25 = byteVector23.putUTF8("hi!");
    ByteVector byteVector27 = byteVector23.putLong((-1L));
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector27);

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test422"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putShort((int)(short)-1);
    ByteVector byteVector13 = byteVector9.putUTF8("");
    ByteVector byteVector15 = byteVector9.putShort(1);
    ByteVector byteVector17 = byteVector15.putByte((int)'#');
    ByteVector byteVector19 = byteVector15.putByte(100);
    ByteVector byteVector21 = byteVector19.putUTF8("");
    ByteVector byteVector23 = byteVector21.putLong((long)100);
    ByteVector byteVector25 = byteVector23.putUTF8("");
    ByteVector byteVector27 = byteVector23.putByte((int)(byte)-1);
    ByteVector byteVector29 = byteVector23.putLong((long)'a');
    ByteVector byteVector31 = byteVector29.putUTF8("hi!");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector31);

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test423"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector3.putByte((int)' ');
    ByteVector byteVector7 = byteVector3.putUTF8("hi!");
    ByteVector byteVector9 = byteVector7.putInt(10);
    byte[] byte_array11 = new byte[] { (byte)100 };
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector14 = byteVector7.putByteArray(byte_array11, (int)' ', (int)(short)-1);
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
    org.junit.Assert.assertNotNull(byte_array11);

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test424"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    byte[] byte_array7 = new byte[] { (byte)-1 };
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(short)0, (int)(byte)0);
    ByteVector byteVector12 = byteVector1.putUTF8("hi!");
    ByteVector byteVector14 = byteVector12.putUTF8("");
    ByteVector byteVector16 = byteVector12.putByte((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test425"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putShort((int)(short)-1);
    ByteVector byteVector13 = byteVector9.putUTF8("");
    ByteVector byteVector15 = byteVector9.putShort(1);
    ByteVector byteVector17 = byteVector9.putByte(0);
    
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
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test426"); }


    ByteVector byteVector1 = new ByteVector((int)'#');
    ByteVector byteVector3 = byteVector1.putShort((int)(short)100);
    ByteVector byteVector5 = byteVector3.putByte((int)(byte)100);
    ByteVector byteVector7 = byteVector3.putByte((int)(short)10);
    ByteVector byteVector9 = byteVector7.putLong(100L);
    
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
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test427"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector5.putShort((int)(byte)0);
    ByteVector byteVector9 = byteVector7.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putLong((long)' ');
    ByteVector byteVector13 = byteVector11.putShort((int)(short)10);
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
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test428"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putShort((int)(short)-1);
    ByteVector byteVector13 = byteVector9.putUTF8("");
    ByteVector byteVector15 = byteVector9.putShort(1);
    ByteVector byteVector17 = byteVector15.putByte((int)'#');
    ByteVector byteVector19 = byteVector15.putInt((int)(short)1);
    ByteVector byteVector21 = byteVector15.putUTF8("");
    
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
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test429"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector5.putShort((int)(byte)0);
    ByteVector byteVector9 = byteVector7.putShort(10);
    ByteVector byteVector11 = byteVector7.putLong((long)100);
    ByteVector byteVector13 = byteVector7.putShort((int)(byte)0);
    ByteVector byteVector15 = byteVector13.putByte((int)(short)-1);
    
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
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test430"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector5.putShort((int)(byte)0);
    ByteVector byteVector9 = byteVector7.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector7.putInt((int)(short)10);
    ByteVector byteVector13 = byteVector7.putShort((-1));
    
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
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test431"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector11 = byteVector9.putUTF8("hi!");
    ByteVector byteVector13 = byteVector11.putLong(0L);
    ByteVector byteVector15 = byteVector13.putByte((-1));
    
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
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test432"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putShort((int)(short)-1);
    ByteVector byteVector13 = byteVector9.putUTF8("");
    ByteVector byteVector15 = byteVector9.putUTF8("hi!");
    ByteVector byteVector17 = byteVector15.putUTF8("hi!");
    
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
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test433"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putShort((int)'#');
    ByteVector byteVector5 = byteVector3.putByte(0);
    ByteVector byteVector7 = byteVector5.putUTF8("hi!");
    ByteVector byteVector9 = byteVector5.putShort((int)(byte)-1);
    ByteVector byteVector11 = byteVector5.putLong((long)(short)-1);
    ByteVector byteVector13 = byteVector5.putInt((int)'a');
    
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
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test434"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt((int)' ');
    byte[] byte_array7 = new byte[] { (byte)-1 };
    ByteVector byteVector10 = byteVector1.putByteArray(byte_array7, (int)(short)0, (int)(byte)0);
    ByteVector byteVector12 = byteVector1.putUTF8("hi!");
    ByteVector byteVector14 = byteVector12.putUTF8("");
    ByteVector byteVector16 = byteVector12.putUTF8("");
    ByteVector byteVector18 = byteVector12.putByte(100);
    ByteVector byteVector20 = byteVector18.putInt((int)(byte)-1);
    ByteVector byteVector22 = byteVector18.putShort((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector22);

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test435"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector3.putByte((int)' ');
    ByteVector byteVector7 = byteVector5.putShort((int)(short)0);
    byte[] byte_array8 = null;
    ByteVector byteVector11 = byteVector7.putByteArray(byte_array8, (int)(byte)100, (int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test436"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putLong((long)'#');
    ByteVector byteVector5 = byteVector1.putInt(0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putInt((int)(short)0);
    ByteVector byteVector13 = byteVector9.putByte((int)(byte)-1);
    byte[] byte_array14 = null;
    ByteVector byteVector17 = byteVector9.putByteArray(byte_array14, (int)'a', (int)'#');
    
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

  }

}
