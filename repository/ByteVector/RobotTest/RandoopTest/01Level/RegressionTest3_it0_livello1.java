
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test001"); }


    ByteVector byteVector1 = new ByteVector(10);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector3.putByte(10);
    byte[] byte_array10 = new byte[] { (byte)100, (byte)10, (byte)10, (byte)10 };
    ByteVector byteVector13 = byteVector3.putByteArray(byte_array10, 0, (int)(short)1);
    ByteVector byteVector15 = byteVector13.putLong(100L);
    ByteVector byteVector17 = byteVector15.putInt((int)' ');
    ByteVector byteVector19 = byteVector17.putShort(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array10);
    
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
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test002"); }


    ByteVector byteVector1 = new ByteVector(10);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector3.putUTF8("");
    ByteVector byteVector7 = byteVector3.putUTF8("hi!");
    ByteVector byteVector9 = byteVector3.putByte((int)' ');
    ByteVector byteVector11 = byteVector9.putInt((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
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
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test003"); }


    ByteVector byteVector1 = new ByteVector(10);
    ByteVector byteVector3 = byteVector1.putLong((long)1);
    ByteVector byteVector5 = byteVector3.putInt((-1));
    ByteVector byteVector7 = byteVector3.putShort((int)(byte)-1);
    ByteVector byteVector9 = byteVector3.putLong(1L);
    ByteVector byteVector11 = byteVector3.putInt((int)(short)-1);
    ByteVector byteVector13 = byteVector11.putByte((int)(byte)-1);
    ByteVector byteVector15 = byteVector11.putByte((int)(short)0);
    ByteVector byteVector17 = byteVector11.putInt((int)(byte)0);
    ByteVector byteVector19 = byteVector11.putUTF8("");
    ByteVector byteVector21 = byteVector11.putShort((-1));
    ByteVector byteVector23 = byteVector11.putByte(0);
    ByteVector byteVector25 = byteVector11.putByte((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
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
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test004"); }


    ByteVector byteVector1 = new ByteVector(10);
    ByteVector byteVector3 = byteVector1.putLong((long)1);
    ByteVector byteVector5 = byteVector1.putLong(100L);
    ByteVector byteVector7 = byteVector1.putInt((-1));
    ByteVector byteVector9 = byteVector1.putInt((-1));
    ByteVector byteVector11 = byteVector9.putUTF8("");
    ByteVector byteVector13 = byteVector9.putByte((int)' ');
    ByteVector byteVector15 = byteVector13.putShort((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
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
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test005"); }


    ByteVector byteVector1 = new ByteVector(10);
    ByteVector byteVector3 = byteVector1.putLong((long)1);
    ByteVector byteVector5 = byteVector3.putInt((-1));
    ByteVector byteVector7 = byteVector3.putShort((int)(byte)-1);
    ByteVector byteVector9 = byteVector3.putLong((long)(short)10);
    ByteVector byteVector11 = byteVector9.putShort((int)'a');
    ByteVector byteVector13 = byteVector9.putInt(0);
    ByteVector byteVector15 = byteVector9.putInt(0);
    ByteVector byteVector17 = byteVector15.putShort((int)(byte)0);
    ByteVector byteVector19 = byteVector17.putByte((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
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
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test006"); }


    ByteVector byteVector1 = new ByteVector(10);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector3.putUTF8("hi!");
    ByteVector byteVector7 = byteVector3.putInt((int)(byte)1);
    ByteVector byteVector9 = new ByteVector((int)'a');
    ByteVector byteVector11 = byteVector9.putInt((int)(short)-1);
    ByteVector byteVector13 = byteVector9.putByte((int)'a');
    ByteVector byteVector15 = byteVector9.putLong((long)(-1));
    ByteVector byteVector17 = byteVector9.putShort((int)(byte)1);
    byte[] byte_array23 = new byte[] { (byte)1, (byte)1, (byte)-1, (byte)100, (byte)100 };
    ByteVector byteVector26 = byteVector17.putByteArray(byte_array23, (int)(short)0, (int)(short)0);
    ByteVector byteVector29 = byteVector7.putByteArray(byte_array23, (int)(short)1, (int)(byte)0);
    ByteVector byteVector31 = byteVector29.putUTF8("");
    ByteVector byteVector33 = byteVector29.putUTF8("");
    ByteVector byteVector35 = byteVector33.putInt((int)(byte)1);
    
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
    org.junit.Assert.assertNotNull(byte_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector35);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test007"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putInt(10);
    ByteVector byteVector4 = byteVector0.putUTF8("hi!");
    ByteVector byteVector6 = byteVector4.putUTF8("hi!");
    byte[] byte_array7 = null;
    ByteVector byteVector10 = byteVector6.putByteArray(byte_array7, (int)(byte)100, (int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test008"); }


    ByteVector byteVector1 = new ByteVector(10);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector3.putLong((long)(byte)0);
    ByteVector byteVector7 = byteVector5.putByte((int)'4');
    ByteVector byteVector9 = byteVector7.putUTF8("");
    ByteVector byteVector11 = byteVector9.putShort((int)'a');
    ByteVector byteVector13 = byteVector9.putByte((int)(byte)0);
    ByteVector byteVector15 = byteVector13.putLong((long)' ');
    ByteVector byteVector17 = byteVector15.putByte((int)(byte)-1);
    ByteVector byteVector19 = byteVector17.putInt((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
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
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test009"); }


    ByteVector byteVector1 = new ByteVector(10);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector3.putLong((long)(byte)0);
    ByteVector byteVector7 = byteVector3.putShort(0);
    ByteVector byteVector9 = byteVector7.putShort((int)(byte)1);
    ByteVector byteVector11 = byteVector9.putShort((int)(short)100);
    ByteVector byteVector13 = byteVector11.putInt(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
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

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test010"); }


    ByteVector byteVector1 = new ByteVector((int)'a');
    ByteVector byteVector3 = byteVector1.putInt((int)(short)-1);
    ByteVector byteVector5 = byteVector3.putInt((int)'4');
    ByteVector byteVector7 = byteVector3.putByte(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test011"); }


    ByteVector byteVector1 = new ByteVector(10);
    ByteVector byteVector3 = byteVector1.putLong((long)1);
    ByteVector byteVector5 = byteVector3.putInt((-1));
    ByteVector byteVector7 = byteVector3.putLong((long)100);
    ByteVector byteVector9 = byteVector3.putLong((long)(short)0);
    ByteVector byteVector11 = byteVector3.putByte(1);
    ByteVector byteVector13 = byteVector3.putInt((int)(byte)1);
    ByteVector byteVector15 = byteVector13.putInt((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
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
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test012"); }


    ByteVector byteVector1 = new ByteVector(10);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector3.putByte(10);
    ByteVector byteVector7 = byteVector3.putByte((int)(byte)10);
    ByteVector byteVector9 = byteVector7.putByte((int)(byte)100);
    ByteVector byteVector11 = byteVector7.putLong(1L);
    ByteVector byteVector13 = byteVector7.putUTF8("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
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
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test013"); }


    ByteVector byteVector1 = new ByteVector((int)'a');
    ByteVector byteVector3 = byteVector1.putInt((int)(short)-1);
    ByteVector byteVector5 = byteVector1.putByte((int)'a');
    ByteVector byteVector7 = byteVector1.putLong((long)(-1));
    ByteVector byteVector9 = byteVector1.putShort((int)(byte)1);
    byte[] byte_array15 = new byte[] { (byte)1, (byte)1, (byte)-1, (byte)100, (byte)100 };
    ByteVector byteVector18 = byteVector9.putByteArray(byte_array15, (int)(short)0, (int)(short)0);
    ByteVector byteVector20 = byteVector18.putByte((int)(byte)0);
    ByteVector byteVector22 = byteVector20.putShort((int)(byte)-1);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector22);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test014"); }


    ByteVector byteVector1 = new ByteVector((int)'4');
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
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test015"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putUTF8("");
    ByteVector byteVector4 = byteVector2.putByte(0);
    ByteVector byteVector6 = byteVector4.putInt((int)(short)0);
    ByteVector byteVector8 = byteVector4.putLong((long)10);
    ByteVector byteVector10 = byteVector8.putByte(1);
    ByteVector byteVector12 = byteVector10.putByte((int)'#');
    ByteVector byteVector14 = byteVector10.putShort((int)(byte)100);
    ByteVector byteVector16 = byteVector10.putByte((int)(byte)1);
    ByteVector byteVector18 = byteVector10.putLong((long)(short)0);
    ByteVector byteVector20 = byteVector18.putByte(0);
    ByteVector byteVector22 = byteVector20.putLong((long)(byte)1);
    byte[] byte_array27 = new byte[] { (byte)10, (byte)100, (byte)0, (byte)1 };
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector30 = byteVector20.putByteArray(byte_array27, 100, (int)(byte)10);
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
    org.junit.Assert.assertNotNull(byte_array27);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test016"); }


    ByteVector byteVector1 = new ByteVector(10);
    ByteVector byteVector3 = byteVector1.putInt((int)(byte)1);
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector1.putByte((int)(short)100);
    ByteVector byteVector9 = byteVector1.putLong((long)(byte)100);
    ByteVector byteVector11 = byteVector9.putInt((int)(byte)-1);
    ByteVector byteVector13 = byteVector11.putUTF8("");
    ByteVector byteVector15 = byteVector13.putLong((long)(short)-1);
    ByteVector byteVector17 = byteVector13.putByte(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
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
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test017"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putUTF8("");
    ByteVector byteVector4 = byteVector2.putByte(0);
    ByteVector byteVector6 = byteVector4.putInt((int)(short)0);
    ByteVector byteVector8 = byteVector4.putLong((long)10);
    ByteVector byteVector10 = byteVector4.putLong(0L);
    ByteVector byteVector12 = byteVector10.putInt((int)(short)100);
    ByteVector byteVector14 = byteVector10.putLong((long)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
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
    org.junit.Assert.assertNotNull(byteVector14);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test018"); }


    ByteVector byteVector1 = new ByteVector(10);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector3.putLong((long)(byte)0);
    ByteVector byteVector7 = byteVector3.putShort(0);
    ByteVector byteVector9 = byteVector3.putUTF8("hi!");
    ByteVector byteVector11 = byteVector3.putUTF8("");
    ByteVector byteVector13 = new ByteVector(10);
    ByteVector byteVector15 = byteVector13.putLong((long)1);
    ByteVector byteVector17 = byteVector15.putInt((-1));
    ByteVector byteVector19 = byteVector15.putShort((int)(byte)-1);
    ByteVector byteVector21 = byteVector15.putLong(1L);
    ByteVector byteVector23 = byteVector15.putInt((int)(short)-1);
    ByteVector byteVector25 = byteVector23.putShort((int)(short)-1);
    ByteVector byteVector27 = byteVector25.putByte((int)(byte)10);
    ByteVector byteVector29 = new ByteVector(10);
    ByteVector byteVector31 = byteVector29.putUTF8("");
    ByteVector byteVector33 = byteVector31.putByte(10);
    ByteVector byteVector35 = byteVector31.putByte((int)(byte)10);
    ByteVector byteVector37 = byteVector31.putUTF8("hi!");
    byte[] byte_array41 = new byte[] { (byte)10, (byte)0, (byte)10 };
    ByteVector byteVector44 = byteVector31.putByteArray(byte_array41, (int)(byte)0, (int)(short)0);
    ByteVector byteVector47 = byteVector25.putByteArray(byte_array41, 1, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector50 = byteVector11.putByteArray(byte_array41, 0, (int)(short)100);
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
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test019"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(0);
    ByteVector byteVector4 = byteVector2.putLong((long)(short)1);
    ByteVector byteVector6 = byteVector2.putShort((int)'#');
    ByteVector byteVector8 = byteVector6.putShort((int)(short)10);
    ByteVector byteVector10 = byteVector6.putLong((long)(-1));
    ByteVector byteVector12 = byteVector10.putInt((int)(short)-1);
    ByteVector byteVector14 = byteVector10.putShort((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
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
    org.junit.Assert.assertNotNull(byteVector14);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test020"); }


    ByteVector byteVector1 = new ByteVector((int)'a');
    ByteVector byteVector3 = byteVector1.putInt((int)(short)-1);
    ByteVector byteVector5 = byteVector1.putByte((int)'a');
    ByteVector byteVector7 = byteVector1.putLong((long)(-1));
    ByteVector byteVector9 = byteVector1.putUTF8("hi!");
    ByteVector byteVector11 = byteVector1.putByte(1);
    ByteVector byteVector13 = byteVector1.putShort(0);
    ByteVector byteVector15 = byteVector13.putByte((int)'a');
    ByteVector byteVector17 = new ByteVector(10);
    ByteVector byteVector19 = byteVector17.putLong((long)1);
    ByteVector byteVector21 = byteVector19.putInt((-1));
    ByteVector byteVector23 = byteVector19.putShort((int)(byte)-1);
    ByteVector byteVector25 = byteVector19.putLong(1L);
    ByteVector byteVector27 = byteVector25.putUTF8("hi!");
    ByteVector byteVector29 = byteVector27.putInt((int)'4');
    ByteVector byteVector31 = byteVector27.putInt((int)(short)0);
    ByteVector byteVector33 = new ByteVector(10);
    ByteVector byteVector35 = byteVector33.putLong((long)1);
    ByteVector byteVector37 = byteVector35.putInt((-1));
    ByteVector byteVector39 = byteVector35.putShort((int)(byte)-1);
    ByteVector byteVector41 = byteVector35.putLong(1L);
    ByteVector byteVector43 = byteVector35.putInt((int)(short)-1);
    ByteVector byteVector45 = byteVector43.putByte((int)(byte)-1);
    ByteVector byteVector47 = byteVector43.putByte((int)(short)0);
    ByteVector byteVector49 = new ByteVector(10);
    ByteVector byteVector51 = byteVector49.putUTF8("");
    ByteVector byteVector53 = byteVector51.putUTF8("hi!");
    ByteVector byteVector55 = byteVector51.putInt((int)(byte)1);
    ByteVector byteVector57 = new ByteVector((int)'a');
    ByteVector byteVector59 = byteVector57.putInt((int)(short)-1);
    ByteVector byteVector61 = byteVector57.putByte((int)'a');
    ByteVector byteVector63 = byteVector57.putLong((long)(-1));
    ByteVector byteVector65 = byteVector57.putShort((int)(byte)1);
    byte[] byte_array71 = new byte[] { (byte)1, (byte)1, (byte)-1, (byte)100, (byte)100 };
    ByteVector byteVector74 = byteVector65.putByteArray(byte_array71, (int)(short)0, (int)(short)0);
    ByteVector byteVector77 = byteVector55.putByteArray(byte_array71, (int)(short)1, (int)(byte)0);
    ByteVector byteVector80 = byteVector43.putByteArray(byte_array71, (int)(byte)1, (int)(byte)1);
    ByteVector byteVector83 = byteVector31.putByteArray(byte_array71, (int)(byte)0, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector86 = byteVector15.putByteArray(byte_array71, 100, (int)(short)-1);
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
    org.junit.Assert.assertNotNull(byteVector45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector47);
    
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
    org.junit.Assert.assertNotNull(byte_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector83);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test021"); }


    ByteVector byteVector1 = new ByteVector(10);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector3.putByte(10);
    byte[] byte_array10 = new byte[] { (byte)100, (byte)10, (byte)10, (byte)10 };
    ByteVector byteVector13 = byteVector3.putByteArray(byte_array10, 0, (int)(short)1);
    ByteVector byteVector15 = byteVector3.putInt((int)(byte)1);
    ByteVector byteVector17 = byteVector3.putLong((long)(byte)100);
    ByteVector byteVector19 = byteVector17.putUTF8("hi!");
    ByteVector byteVector21 = byteVector19.putShort(0);
    ByteVector byteVector23 = byteVector19.putInt((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array10);
    
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
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test022"); }


    ByteVector byteVector1 = new ByteVector(10);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector3.putLong((long)(byte)0);
    ByteVector byteVector7 = byteVector5.putByte((int)'4');
    ByteVector byteVector9 = byteVector7.putUTF8("");
    ByteVector byteVector11 = byteVector9.putLong((long)'4');
    ByteVector byteVector13 = byteVector9.putLong((long)10);
    ByteVector byteVector15 = byteVector9.putUTF8("hi!");
    ByteVector byteVector17 = byteVector9.putShort((int)(short)1);
    ByteVector byteVector19 = byteVector17.putUTF8("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
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
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test023"); }


    ByteVector byteVector1 = new ByteVector(10);
    ByteVector byteVector3 = byteVector1.putLong((long)1);
    ByteVector byteVector5 = byteVector3.putInt((-1));
    ByteVector byteVector7 = byteVector3.putLong((long)0);
    ByteVector byteVector9 = byteVector7.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector7.putShort((int)(byte)1);
    ByteVector byteVector13 = byteVector11.putUTF8("hi!");
    ByteVector byteVector15 = byteVector11.putLong((long)'a');
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
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test024"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putUTF8("");
    ByteVector byteVector4 = byteVector2.putByte(0);
    ByteVector byteVector6 = byteVector4.putInt((int)(short)0);
    ByteVector byteVector8 = byteVector4.putLong((long)10);
    ByteVector byteVector10 = byteVector4.putShort((int)(byte)0);
    ByteVector byteVector12 = byteVector4.putLong((long)(byte)1);
    ByteVector byteVector14 = byteVector12.putUTF8("hi!");
    ByteVector byteVector16 = byteVector12.putShort((int)(short)1);
    ByteVector byteVector18 = byteVector12.putShort(10);
    ByteVector byteVector20 = byteVector12.putShort((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
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
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test025"); }


    ByteVector byteVector1 = new ByteVector(10);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector3.putUTF8("");
    ByteVector byteVector7 = byteVector3.putUTF8("hi!");
    ByteVector byteVector9 = byteVector3.putByte((int)' ');
    ByteVector byteVector11 = byteVector3.putUTF8("");
    
    // Regression assertion (captures the current behavior of the code)
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
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test026"); }


    ByteVector byteVector1 = new ByteVector(10);
    ByteVector byteVector3 = byteVector1.putLong((long)1);
    ByteVector byteVector5 = byteVector3.putInt((-1));
    ByteVector byteVector7 = byteVector5.putShort(0);
    ByteVector byteVector9 = byteVector5.putByte((int)(short)100);
    ByteVector byteVector11 = byteVector5.putUTF8("");
    ByteVector byteVector13 = byteVector5.putInt((int)(byte)1);
    ByteVector byteVector15 = byteVector13.putShort((int)(byte)0);
    ByteVector byteVector17 = byteVector13.putLong((long)(byte)1);
    ByteVector byteVector18 = new ByteVector();
    ByteVector byteVector20 = byteVector18.putUTF8("");
    ByteVector byteVector22 = byteVector20.putByte(0);
    ByteVector byteVector24 = new ByteVector(10);
    ByteVector byteVector26 = byteVector24.putUTF8("");
    ByteVector byteVector28 = byteVector26.putByte(10);
    ByteVector byteVector30 = byteVector26.putByte((int)(byte)10);
    ByteVector byteVector32 = byteVector30.putInt((int)(byte)10);
    ByteVector byteVector34 = byteVector32.putInt(100);
    ByteVector byteVector36 = new ByteVector(10);
    ByteVector byteVector38 = byteVector36.putLong((long)1);
    ByteVector byteVector40 = byteVector36.putLong((long)1);
    ByteVector byteVector42 = byteVector40.putShort((int)(short)0);
    ByteVector byteVector43 = new ByteVector();
    ByteVector byteVector45 = byteVector43.putUTF8("");
    ByteVector byteVector47 = byteVector45.putByte(0);
    ByteVector byteVector49 = byteVector47.putInt((int)(short)0);
    ByteVector byteVector51 = byteVector49.putUTF8("");
    ByteVector byteVector53 = new ByteVector(10);
    ByteVector byteVector55 = byteVector53.putUTF8("");
    ByteVector byteVector57 = byteVector55.putUTF8("hi!");
    ByteVector byteVector59 = byteVector55.putInt((int)(byte)1);
    ByteVector byteVector61 = new ByteVector((int)'a');
    ByteVector byteVector63 = byteVector61.putInt((int)(short)-1);
    ByteVector byteVector65 = byteVector61.putByte((int)'a');
    ByteVector byteVector67 = byteVector61.putLong((long)(-1));
    ByteVector byteVector69 = byteVector61.putShort((int)(byte)1);
    byte[] byte_array75 = new byte[] { (byte)1, (byte)1, (byte)-1, (byte)100, (byte)100 };
    ByteVector byteVector78 = byteVector69.putByteArray(byte_array75, (int)(short)0, (int)(short)0);
    ByteVector byteVector81 = byteVector59.putByteArray(byte_array75, (int)(short)1, (int)(byte)0);
    ByteVector byteVector84 = byteVector51.putByteArray(byte_array75, 1, (int)(byte)0);
    ByteVector byteVector87 = byteVector42.putByteArray(byte_array75, 0, (int)(byte)1);
    ByteVector byteVector90 = byteVector34.putByteArray(byte_array75, (int)(short)1, (int)(byte)1);
    ByteVector byteVector93 = byteVector22.putByteArray(byte_array75, (int)(byte)1, 0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector96 = byteVector17.putByteArray(byte_array75, (int)(short)-1, (int)(short)100);
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
    org.junit.Assert.assertNotNull(byteVector40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector93);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test027"); }


    ByteVector byteVector1 = new ByteVector(10);
    ByteVector byteVector3 = byteVector1.putLong((long)1);
    ByteVector byteVector5 = byteVector3.putInt((-1));
    ByteVector byteVector7 = byteVector3.putShort((int)(byte)-1);
    ByteVector byteVector9 = byteVector3.putLong(1L);
    ByteVector byteVector11 = byteVector3.putInt((int)(short)-1);
    ByteVector byteVector13 = byteVector11.putByte((int)(byte)-1);
    ByteVector byteVector15 = byteVector11.putByte((int)(short)0);
    ByteVector byteVector17 = byteVector11.putInt((int)(short)0);
    byte[] byte_array18 = null;
    ByteVector byteVector21 = byteVector17.putByteArray(byte_array18, (int)'#', 10);
    ByteVector byteVector23 = byteVector17.putLong((long)(-1));
    ByteVector byteVector25 = byteVector23.putUTF8("");
    ByteVector byteVector27 = new ByteVector(10);
    ByteVector byteVector29 = byteVector27.putLong((long)1);
    ByteVector byteVector31 = byteVector29.putInt((-1));
    ByteVector byteVector33 = byteVector31.putShort(0);
    ByteVector byteVector35 = byteVector33.putByte(10);
    ByteVector byteVector37 = byteVector33.putLong((long)'a');
    ByteVector byteVector39 = byteVector33.putUTF8("");
    ByteVector byteVector41 = new ByteVector(10);
    ByteVector byteVector43 = byteVector41.putUTF8("");
    ByteVector byteVector45 = byteVector43.putUTF8("hi!");
    ByteVector byteVector47 = byteVector43.putInt((int)(byte)1);
    ByteVector byteVector49 = new ByteVector((int)'a');
    ByteVector byteVector51 = byteVector49.putInt((int)(short)-1);
    ByteVector byteVector53 = byteVector49.putByte((int)'a');
    ByteVector byteVector55 = byteVector49.putLong((long)(-1));
    ByteVector byteVector57 = byteVector49.putShort((int)(byte)1);
    byte[] byte_array63 = new byte[] { (byte)1, (byte)1, (byte)-1, (byte)100, (byte)100 };
    ByteVector byteVector66 = byteVector57.putByteArray(byte_array63, (int)(short)0, (int)(short)0);
    ByteVector byteVector69 = byteVector47.putByteArray(byte_array63, (int)(short)1, (int)(byte)0);
    ByteVector byteVector72 = byteVector39.putByteArray(byte_array63, (int)(short)0, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector75 = byteVector25.putByteArray(byte_array63, 1, (int)' ');
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
    org.junit.Assert.assertNotNull(byteVector43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector72);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test028"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putInt(10);
    ByteVector byteVector4 = byteVector0.putUTF8("hi!");
    ByteVector byteVector6 = byteVector4.putUTF8("hi!");
    ByteVector byteVector8 = byteVector4.putUTF8("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test029"); }


    ByteVector byteVector1 = new ByteVector(10);
    ByteVector byteVector3 = byteVector1.putLong((long)1);
    ByteVector byteVector5 = byteVector3.putInt((-1));
    ByteVector byteVector7 = byteVector3.putLong((long)0);
    ByteVector byteVector9 = byteVector7.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putByte((int)'4');
    ByteVector byteVector13 = new ByteVector(10);
    ByteVector byteVector15 = byteVector13.putUTF8("");
    ByteVector byteVector17 = byteVector15.putByte(10);
    ByteVector byteVector19 = byteVector15.putByte((int)(byte)10);
    ByteVector byteVector21 = byteVector15.putUTF8("hi!");
    byte[] byte_array25 = new byte[] { (byte)10, (byte)0, (byte)10 };
    ByteVector byteVector28 = byteVector15.putByteArray(byte_array25, (int)(byte)0, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector31 = byteVector11.putByteArray(byte_array25, (int)(short)-1, 1);
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
    org.junit.Assert.assertNotNull(byte_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector28);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test030"); }


    ByteVector byteVector1 = new ByteVector((int)'a');
    ByteVector byteVector3 = byteVector1.putInt((int)(short)-1);
    ByteVector byteVector5 = byteVector1.putByte((int)'a');
    ByteVector byteVector7 = byteVector1.putLong((long)(-1));
    ByteVector byteVector9 = byteVector7.putShort((int)(short)100);
    ByteVector byteVector11 = byteVector7.putLong((long)10);
    ByteVector byteVector13 = byteVector11.putLong((long)(short)-1);
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
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test031"); }


    ByteVector byteVector1 = new ByteVector(10);
    ByteVector byteVector3 = byteVector1.putLong((long)1);
    ByteVector byteVector5 = byteVector3.putInt((-1));
    ByteVector byteVector7 = byteVector3.putShort((int)(byte)-1);
    ByteVector byteVector9 = byteVector7.putByte((int)'4');
    ByteVector byteVector11 = byteVector7.putByte((int)(short)-1);
    ByteVector byteVector13 = byteVector7.putShort(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
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
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test032"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putUTF8("");
    ByteVector byteVector4 = byteVector2.putByte(0);
    ByteVector byteVector6 = byteVector4.putInt((int)(short)0);
    ByteVector byteVector8 = byteVector4.putShort((int)(short)100);
    ByteVector byteVector10 = byteVector8.putShort(0);
    ByteVector byteVector11 = new ByteVector();
    ByteVector byteVector13 = byteVector11.putUTF8("");
    ByteVector byteVector15 = byteVector13.putByte(0);
    ByteVector byteVector17 = new ByteVector(10);
    ByteVector byteVector19 = byteVector17.putUTF8("");
    ByteVector byteVector21 = byteVector19.putByte(10);
    ByteVector byteVector23 = byteVector19.putByte((int)(byte)10);
    ByteVector byteVector25 = byteVector23.putInt((int)(byte)10);
    ByteVector byteVector27 = byteVector25.putInt(100);
    ByteVector byteVector29 = new ByteVector(10);
    ByteVector byteVector31 = byteVector29.putLong((long)1);
    ByteVector byteVector33 = byteVector29.putLong((long)1);
    ByteVector byteVector35 = byteVector33.putShort((int)(short)0);
    ByteVector byteVector36 = new ByteVector();
    ByteVector byteVector38 = byteVector36.putUTF8("");
    ByteVector byteVector40 = byteVector38.putByte(0);
    ByteVector byteVector42 = byteVector40.putInt((int)(short)0);
    ByteVector byteVector44 = byteVector42.putUTF8("");
    ByteVector byteVector46 = new ByteVector(10);
    ByteVector byteVector48 = byteVector46.putUTF8("");
    ByteVector byteVector50 = byteVector48.putUTF8("hi!");
    ByteVector byteVector52 = byteVector48.putInt((int)(byte)1);
    ByteVector byteVector54 = new ByteVector((int)'a');
    ByteVector byteVector56 = byteVector54.putInt((int)(short)-1);
    ByteVector byteVector58 = byteVector54.putByte((int)'a');
    ByteVector byteVector60 = byteVector54.putLong((long)(-1));
    ByteVector byteVector62 = byteVector54.putShort((int)(byte)1);
    byte[] byte_array68 = new byte[] { (byte)1, (byte)1, (byte)-1, (byte)100, (byte)100 };
    ByteVector byteVector71 = byteVector62.putByteArray(byte_array68, (int)(short)0, (int)(short)0);
    ByteVector byteVector74 = byteVector52.putByteArray(byte_array68, (int)(short)1, (int)(byte)0);
    ByteVector byteVector77 = byteVector44.putByteArray(byte_array68, 1, (int)(byte)0);
    ByteVector byteVector80 = byteVector35.putByteArray(byte_array68, 0, (int)(byte)1);
    ByteVector byteVector83 = byteVector27.putByteArray(byte_array68, (int)(short)1, (int)(byte)1);
    ByteVector byteVector86 = byteVector15.putByteArray(byte_array68, (int)(byte)1, 0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector89 = byteVector8.putByteArray(byte_array68, (-1), (int)(short)1);
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
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
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
    org.junit.Assert.assertNotNull(byteVector38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector44);
    
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
    org.junit.Assert.assertNotNull(byte_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector86);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test033"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putUTF8("");
    ByteVector byteVector4 = byteVector2.putByte(0);
    ByteVector byteVector6 = byteVector4.putInt((int)(short)0);
    ByteVector byteVector8 = byteVector4.putLong((long)10);
    ByteVector byteVector10 = byteVector4.putShort((int)(byte)0);
    ByteVector byteVector12 = byteVector4.putLong(0L);
    ByteVector byteVector14 = byteVector12.putLong((-1L));
    ByteVector byteVector16 = byteVector14.putLong((long)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
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
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test034"); }


    ByteVector byteVector1 = new ByteVector(10);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector3.putLong((long)(byte)0);
    ByteVector byteVector7 = byteVector5.putShort((int)'#');
    ByteVector byteVector9 = byteVector5.putUTF8("hi!");
    ByteVector byteVector11 = byteVector9.putInt(0);
    ByteVector byteVector13 = byteVector9.putUTF8("");
    ByteVector byteVector15 = byteVector9.putUTF8("hi!");
    ByteVector byteVector17 = byteVector9.putLong((long)100);
    ByteVector byteVector19 = byteVector9.putLong((long)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
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
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test035"); }


    ByteVector byteVector1 = new ByteVector(10);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector3.putUTF8("hi!");
    ByteVector byteVector7 = byteVector3.putInt((int)(byte)1);
    ByteVector byteVector9 = new ByteVector((int)'a');
    ByteVector byteVector11 = byteVector9.putInt((int)(short)-1);
    ByteVector byteVector13 = byteVector9.putByte((int)'a');
    ByteVector byteVector15 = byteVector9.putLong((long)(-1));
    ByteVector byteVector17 = byteVector9.putShort((int)(byte)1);
    byte[] byte_array23 = new byte[] { (byte)1, (byte)1, (byte)-1, (byte)100, (byte)100 };
    ByteVector byteVector26 = byteVector17.putByteArray(byte_array23, (int)(short)0, (int)(short)0);
    ByteVector byteVector29 = byteVector7.putByteArray(byte_array23, (int)(short)1, (int)(byte)0);
    ByteVector byteVector31 = byteVector29.putUTF8("");
    ByteVector byteVector33 = byteVector29.putUTF8("");
    ByteVector byteVector35 = byteVector33.putUTF8("hi!");
    
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
    org.junit.Assert.assertNotNull(byte_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector35);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test036"); }


    ByteVector byteVector1 = new ByteVector((int)(byte)1);
    ByteVector byteVector3 = byteVector1.putShort((int)'#');
    ByteVector byteVector5 = byteVector1.putLong(10L);
    ByteVector byteVector7 = byteVector5.putShort(0);
    ByteVector byteVector9 = byteVector7.putInt(0);
    ByteVector byteVector11 = byteVector9.putShort((int)' ');
    ByteVector byteVector13 = byteVector11.putLong((long)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
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
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test037"); }


    ByteVector byteVector1 = new ByteVector((int)'a');
    ByteVector byteVector3 = byteVector1.putInt((int)(short)-1);
    ByteVector byteVector5 = byteVector3.putLong(0L);
    ByteVector byteVector7 = byteVector5.putInt((int)'4');
    ByteVector byteVector9 = byteVector5.putShort((int)'4');
    ByteVector byteVector11 = byteVector9.putByte((int)(short)100);
    ByteVector byteVector13 = byteVector9.putInt((int)(byte)0);
    ByteVector byteVector15 = byteVector13.putUTF8("hi!");
    ByteVector byteVector17 = byteVector13.putInt(1);
    ByteVector byteVector19 = byteVector17.putLong((long)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
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

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test038"); }


    ByteVector byteVector1 = new ByteVector((int)'a');
    ByteVector byteVector3 = byteVector1.putInt((int)(short)-1);
    ByteVector byteVector5 = byteVector1.putByte((int)'a');
    ByteVector byteVector7 = byteVector1.putShort((int)'a');
    ByteVector byteVector9 = byteVector1.putShort((int)(short)1);
    ByteVector byteVector11 = byteVector1.putByte((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
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
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test039"); }


    ByteVector byteVector1 = new ByteVector(10);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector3.putLong((long)(byte)0);
    ByteVector byteVector7 = byteVector5.putByte((int)'4');
    ByteVector byteVector9 = byteVector7.putUTF8("");
    ByteVector byteVector11 = byteVector9.putLong((long)'4');
    ByteVector byteVector13 = byteVector11.putShort((int)(byte)10);
    ByteVector byteVector15 = byteVector11.putByte(0);
    ByteVector byteVector17 = byteVector11.putShort((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
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
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test040"); }


    ByteVector byteVector1 = new ByteVector((int)'a');
    ByteVector byteVector3 = byteVector1.putInt((int)(short)-1);
    ByteVector byteVector5 = byteVector1.putByte((int)'a');
    ByteVector byteVector7 = byteVector1.putLong((long)(-1));
    ByteVector byteVector9 = byteVector7.putByte((int)'a');
    ByteVector byteVector11 = byteVector7.putByte((int)(short)100);
    ByteVector byteVector13 = byteVector11.putUTF8("");
    byte[] byte_array14 = null;
    ByteVector byteVector17 = byteVector11.putByteArray(byte_array14, (int)(byte)0, 0);
    ByteVector byteVector19 = byteVector11.putUTF8("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
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
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test041"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putUTF8("");
    ByteVector byteVector4 = byteVector2.putByte(0);
    ByteVector byteVector6 = byteVector4.putInt((int)(short)0);
    ByteVector byteVector8 = byteVector4.putLong((long)10);
    ByteVector byteVector10 = byteVector4.putShort((int)(byte)0);
    ByteVector byteVector12 = byteVector4.putUTF8("");
    ByteVector byteVector14 = byteVector4.putByte((int)(byte)10);
    ByteVector byteVector16 = byteVector14.putByte((int)(short)0);
    ByteVector byteVector18 = byteVector14.putByte(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
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
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test042"); }


    ByteVector byteVector1 = new ByteVector(10);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector3.putLong((long)(byte)0);
    ByteVector byteVector7 = byteVector5.putByte((int)'4');
    ByteVector byteVector9 = byteVector7.putUTF8("");
    ByteVector byteVector11 = byteVector9.putShort((int)'a');
    ByteVector byteVector13 = byteVector9.putShort((int)'4');
    ByteVector byteVector15 = byteVector9.putUTF8("");
    ByteVector byteVector17 = byteVector9.putShort((int)(short)0);
    ByteVector byteVector19 = byteVector9.putByte((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
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
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test043"); }


    ByteVector byteVector1 = new ByteVector(10);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector3.putLong((long)(byte)0);
    ByteVector byteVector7 = byteVector5.putByte((int)'4');
    ByteVector byteVector9 = byteVector7.putUTF8("");
    ByteVector byteVector11 = byteVector7.putByte((-1));
    ByteVector byteVector13 = byteVector7.putByte(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
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
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test044"); }


    ByteVector byteVector1 = new ByteVector(10);
    ByteVector byteVector3 = byteVector1.putInt((int)(byte)1);
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector1.putShort((-1));
    ByteVector byteVector9 = byteVector7.putInt((int)(short)-1);
    
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
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test045"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putUTF8("");
    ByteVector byteVector4 = byteVector2.putByte(0);
    ByteVector byteVector6 = byteVector4.putInt((int)(short)0);
    ByteVector byteVector8 = byteVector4.putLong((long)10);
    ByteVector byteVector10 = byteVector4.putInt((int)'4');
    ByteVector byteVector12 = byteVector10.putByte(100);
    ByteVector byteVector14 = byteVector10.putInt((int)(byte)0);
    ByteVector byteVector16 = byteVector14.putInt((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
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
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test046"); }


    ByteVector byteVector1 = new ByteVector(10);
    ByteVector byteVector3 = byteVector1.putInt((int)(byte)1);
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector5.putLong((long)0);
    ByteVector byteVector9 = byteVector7.putUTF8("hi!");
    ByteVector byteVector11 = byteVector9.putLong((long)(byte)0);
    ByteVector byteVector13 = byteVector9.putInt((int)(short)0);
    ByteVector byteVector15 = byteVector13.putUTF8("");
    ByteVector byteVector17 = byteVector15.putLong((long)(byte)100);
    ByteVector byteVector19 = byteVector15.putUTF8("");
    ByteVector byteVector21 = byteVector15.putInt((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
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
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test047"); }


    ByteVector byteVector1 = new ByteVector(10);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector1.putShort((int)(short)0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putInt((int)(byte)-1);
    ByteVector byteVector11 = byteVector1.putByte((int)(short)10);
    ByteVector byteVector13 = byteVector11.putInt(100);
    ByteVector byteVector15 = byteVector13.putInt((int)(byte)0);
    ByteVector byteVector17 = byteVector13.putByte(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
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
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test048"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putUTF8("");
    ByteVector byteVector4 = byteVector2.putShort((int)(byte)0);
    ByteVector byteVector6 = byteVector2.putByte((int)(short)10);
    ByteVector byteVector8 = byteVector2.putLong(1L);
    ByteVector byteVector10 = byteVector8.putUTF8("");
    ByteVector byteVector12 = byteVector10.putInt((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
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

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test049"); }


    ByteVector byteVector1 = new ByteVector((int)'a');
    ByteVector byteVector3 = byteVector1.putInt((int)(short)-1);
    ByteVector byteVector5 = byteVector3.putInt((int)'4');
    ByteVector byteVector7 = byteVector3.putLong((long)100);
    ByteVector byteVector9 = byteVector3.putByte((int)(byte)-1);
    ByteVector byteVector11 = byteVector9.putShort((int)(byte)1);
    ByteVector byteVector13 = byteVector9.putInt(10);
    ByteVector byteVector15 = byteVector9.putShort((int)(short)10);
    ByteVector byteVector17 = byteVector15.putLong(1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
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

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test050"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(0);
    ByteVector byteVector4 = byteVector2.putLong((long)(short)1);
    ByteVector byteVector6 = byteVector2.putShort((int)'#');
    ByteVector byteVector8 = byteVector6.putInt(1);
    ByteVector byteVector10 = byteVector8.putInt((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test051"); }


    ByteVector byteVector1 = new ByteVector((int)'a');
    ByteVector byteVector3 = byteVector1.putInt((int)(short)-1);
    ByteVector byteVector5 = byteVector3.putInt((int)(byte)1);
    ByteVector byteVector7 = byteVector5.putLong((long)'4');
    ByteVector byteVector9 = byteVector7.putLong(1L);
    ByteVector byteVector11 = byteVector7.putShort((int)(short)0);
    ByteVector byteVector13 = byteVector7.putLong(10L);
    ByteVector byteVector15 = byteVector7.putByte((-1));
    ByteVector byteVector17 = new ByteVector(10);
    ByteVector byteVector19 = byteVector17.putUTF8("");
    ByteVector byteVector21 = byteVector19.putByte(10);
    byte[] byte_array26 = new byte[] { (byte)100, (byte)10, (byte)10, (byte)10 };
    ByteVector byteVector29 = byteVector19.putByteArray(byte_array26, 0, (int)(short)1);
    ByteVector byteVector32 = byteVector15.putByteArray(byte_array26, (int)(short)1, (int)(short)1);
    ByteVector byteVector34 = byteVector32.putLong((long)'#');
    ByteVector byteVector36 = byteVector32.putUTF8("hi!");
    ByteVector byteVector38 = byteVector36.putByte((int)' ');
    ByteVector byteVector40 = byteVector38.putShort((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
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
    org.junit.Assert.assertNotNull(byte_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector40);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test052"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putUTF8("");
    ByteVector byteVector4 = byteVector2.putShort((int)(byte)0);
    ByteVector byteVector6 = byteVector2.putByte((int)(short)10);
    ByteVector byteVector8 = byteVector2.putLong(1L);
    ByteVector byteVector10 = byteVector2.putShort(1);
    ByteVector byteVector12 = byteVector2.putInt(1);
    ByteVector byteVector14 = new ByteVector((int)'a');
    ByteVector byteVector16 = byteVector14.putInt((int)(short)-1);
    ByteVector byteVector18 = byteVector16.putLong(0L);
    ByteVector byteVector20 = byteVector18.putByte(100);
    ByteVector byteVector22 = byteVector18.putUTF8("hi!");
    ByteVector byteVector24 = byteVector22.putShort((int)'#');
    ByteVector byteVector26 = new ByteVector(10);
    ByteVector byteVector28 = byteVector26.putLong((long)1);
    ByteVector byteVector30 = byteVector28.putInt((-1));
    ByteVector byteVector32 = byteVector28.putShort((int)(byte)-1);
    ByteVector byteVector34 = byteVector28.putLong(1L);
    ByteVector byteVector36 = byteVector28.putInt((int)(short)-1);
    ByteVector byteVector38 = byteVector36.putByte((int)(byte)-1);
    ByteVector byteVector40 = byteVector36.putByte((int)(short)0);
    ByteVector byteVector42 = new ByteVector(10);
    ByteVector byteVector44 = byteVector42.putUTF8("");
    ByteVector byteVector46 = byteVector44.putUTF8("hi!");
    ByteVector byteVector48 = byteVector44.putInt((int)(byte)1);
    ByteVector byteVector50 = new ByteVector((int)'a');
    ByteVector byteVector52 = byteVector50.putInt((int)(short)-1);
    ByteVector byteVector54 = byteVector50.putByte((int)'a');
    ByteVector byteVector56 = byteVector50.putLong((long)(-1));
    ByteVector byteVector58 = byteVector50.putShort((int)(byte)1);
    byte[] byte_array64 = new byte[] { (byte)1, (byte)1, (byte)-1, (byte)100, (byte)100 };
    ByteVector byteVector67 = byteVector58.putByteArray(byte_array64, (int)(short)0, (int)(short)0);
    ByteVector byteVector70 = byteVector48.putByteArray(byte_array64, (int)(short)1, (int)(byte)0);
    ByteVector byteVector73 = byteVector36.putByteArray(byte_array64, (int)(byte)1, (int)(byte)1);
    ByteVector byteVector76 = byteVector24.putByteArray(byte_array64, 1, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector79 = byteVector2.putByteArray(byte_array64, (int)(byte)0, (int)(short)100);
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
    org.junit.Assert.assertNotNull(byteVector32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector76);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test053"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putUTF8("");
    ByteVector byteVector4 = byteVector2.putByte((int)(byte)100);
    ByteVector byteVector6 = byteVector4.putInt((int)'a');
    ByteVector byteVector8 = byteVector4.putByte((int)' ');
    ByteVector byteVector10 = byteVector4.putLong((long)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test054"); }


    ByteVector byteVector1 = new ByteVector((int)'a');
    ByteVector byteVector3 = byteVector1.putInt((int)(short)-1);
    ByteVector byteVector5 = byteVector3.putInt((int)(byte)1);
    ByteVector byteVector7 = byteVector5.putLong((long)'4');
    ByteVector byteVector9 = byteVector7.putLong(1L);
    ByteVector byteVector11 = byteVector9.putByte((int)'#');
    ByteVector byteVector13 = byteVector9.putLong(0L);
    ByteVector byteVector15 = new ByteVector((int)(byte)0);
    ByteVector byteVector17 = byteVector15.putByte((int)(short)100);
    ByteVector byteVector19 = byteVector17.putByte((int)' ');
    ByteVector byteVector21 = new ByteVector(10);
    ByteVector byteVector23 = byteVector21.putUTF8("");
    ByteVector byteVector25 = byteVector23.putUTF8("hi!");
    ByteVector byteVector27 = byteVector23.putInt((int)(byte)1);
    ByteVector byteVector29 = new ByteVector((int)'a');
    ByteVector byteVector31 = byteVector29.putInt((int)(short)-1);
    ByteVector byteVector33 = byteVector29.putByte((int)'a');
    ByteVector byteVector35 = byteVector29.putLong((long)(-1));
    ByteVector byteVector37 = byteVector29.putShort((int)(byte)1);
    byte[] byte_array43 = new byte[] { (byte)1, (byte)1, (byte)-1, (byte)100, (byte)100 };
    ByteVector byteVector46 = byteVector37.putByteArray(byte_array43, (int)(short)0, (int)(short)0);
    ByteVector byteVector49 = byteVector27.putByteArray(byte_array43, (int)(short)1, (int)(byte)0);
    ByteVector byteVector52 = byteVector17.putByteArray(byte_array43, 1, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector55 = byteVector13.putByteArray(byte_array43, (int)(short)10, (int)(byte)1);
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
    org.junit.Assert.assertNotNull(byteVector31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector37);
    
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
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test055"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putInt(10);
    ByteVector byteVector4 = byteVector0.putUTF8("hi!");
    ByteVector byteVector6 = byteVector0.putByte((int)(byte)1);
    ByteVector byteVector8 = byteVector0.putByte((int)(short)10);
    ByteVector byteVector10 = byteVector8.putShort((int)(byte)-1);
    ByteVector byteVector12 = byteVector10.putLong(0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
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

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test056"); }


    ByteVector byteVector1 = new ByteVector((int)'a');
    ByteVector byteVector3 = byteVector1.putInt((int)(short)-1);
    ByteVector byteVector5 = byteVector3.putLong(0L);
    ByteVector byteVector7 = byteVector5.putInt((int)'4');
    ByteVector byteVector9 = byteVector5.putShort((int)'4');
    ByteVector byteVector11 = byteVector9.putLong((long)10);
    ByteVector byteVector13 = new ByteVector(10);
    ByteVector byteVector15 = byteVector13.putInt((int)(byte)1);
    ByteVector byteVector17 = byteVector13.putUTF8("");
    ByteVector byteVector19 = byteVector17.putLong((long)0);
    ByteVector byteVector21 = byteVector19.putUTF8("hi!");
    ByteVector byteVector23 = byteVector21.putLong((long)'a');
    ByteVector byteVector25 = byteVector23.putByte(0);
    ByteVector byteVector27 = new ByteVector((int)'a');
    ByteVector byteVector29 = byteVector27.putInt((int)(short)-1);
    ByteVector byteVector31 = byteVector29.putInt((int)(byte)1);
    ByteVector byteVector33 = byteVector31.putLong((long)'4');
    ByteVector byteVector35 = byteVector33.putLong(1L);
    ByteVector byteVector37 = byteVector33.putShort((int)(short)0);
    ByteVector byteVector39 = byteVector33.putLong(10L);
    ByteVector byteVector41 = byteVector33.putByte((-1));
    ByteVector byteVector43 = new ByteVector(10);
    ByteVector byteVector45 = byteVector43.putUTF8("");
    ByteVector byteVector47 = byteVector45.putByte(10);
    byte[] byte_array52 = new byte[] { (byte)100, (byte)10, (byte)10, (byte)10 };
    ByteVector byteVector55 = byteVector45.putByteArray(byte_array52, 0, (int)(short)1);
    ByteVector byteVector58 = byteVector41.putByteArray(byte_array52, (int)(short)1, (int)(short)1);
    ByteVector byteVector61 = byteVector25.putByteArray(byte_array52, (int)(short)1, 0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector64 = byteVector11.putByteArray(byte_array52, (int)'#', (int)(short)1);
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
    org.junit.Assert.assertNotNull(byteVector39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector61);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test057"); }


    ByteVector byteVector1 = new ByteVector(10);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector3.putLong((long)(byte)0);
    ByteVector byteVector7 = byteVector5.putShort((int)'#');
    ByteVector byteVector9 = byteVector5.putUTF8("hi!");
    ByteVector byteVector11 = byteVector9.putInt(0);
    ByteVector byteVector13 = byteVector9.putShort((int)(byte)-1);
    ByteVector byteVector15 = byteVector9.putByte((int)(short)10);
    ByteVector byteVector17 = byteVector15.putLong(1L);
    ByteVector byteVector19 = byteVector17.putShort(1);
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
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test058"); }


    ByteVector byteVector1 = new ByteVector(10);
    ByteVector byteVector3 = byteVector1.putLong((long)1);
    ByteVector byteVector5 = byteVector3.putInt((-1));
    ByteVector byteVector7 = byteVector3.putInt(0);
    ByteVector byteVector9 = byteVector3.putUTF8("hi!");
    ByteVector byteVector11 = byteVector9.putShort((int)(byte)0);
    ByteVector byteVector13 = byteVector9.putInt(1);
    ByteVector byteVector15 = byteVector9.putInt(1);
    ByteVector byteVector17 = byteVector9.putInt(10);
    ByteVector byteVector19 = byteVector9.putInt((int)(byte)100);
    ByteVector byteVector21 = byteVector19.putInt((int)(short)0);
    ByteVector byteVector23 = byteVector19.putUTF8("hi!");
    ByteVector byteVector25 = new ByteVector((int)'4');
    ByteVector byteVector27 = byteVector25.putShort((int)(short)10);
    ByteVector byteVector29 = byteVector25.putShort(0);
    ByteVector byteVector31 = byteVector29.putShort((-1));
    ByteVector byteVector33 = new ByteVector((int)'a');
    ByteVector byteVector35 = byteVector33.putInt((int)(short)-1);
    ByteVector byteVector37 = byteVector33.putByte((int)'a');
    ByteVector byteVector39 = byteVector33.putLong((long)(-1));
    ByteVector byteVector41 = byteVector33.putShort((int)(byte)1);
    byte[] byte_array47 = new byte[] { (byte)1, (byte)1, (byte)-1, (byte)100, (byte)100 };
    ByteVector byteVector50 = byteVector41.putByteArray(byte_array47, (int)(short)0, (int)(short)0);
    ByteVector byteVector53 = byteVector29.putByteArray(byte_array47, 1, 1);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector56 = byteVector19.putByteArray(byte_array47, 10, 1);
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
    org.junit.Assert.assertNotNull(byteVector35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector53);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test059"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putUTF8("");
    ByteVector byteVector4 = byteVector2.putByte(0);
    ByteVector byteVector6 = byteVector2.putShort((int)'a');
    ByteVector byteVector8 = byteVector6.putInt((-1));
    ByteVector byteVector10 = byteVector6.putByte((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test060"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putUTF8("");
    ByteVector byteVector4 = byteVector2.putByte(0);
    ByteVector byteVector6 = byteVector4.putInt((int)(short)0);
    ByteVector byteVector8 = byteVector4.putLong((long)10);
    ByteVector byteVector10 = byteVector4.putLong(0L);
    ByteVector byteVector12 = byteVector4.putInt((int)'a');
    ByteVector byteVector14 = byteVector4.putUTF8("");
    ByteVector byteVector16 = new ByteVector((int)'4');
    ByteVector byteVector18 = byteVector16.putShort((int)(short)100);
    ByteVector byteVector20 = byteVector16.putShort(10);
    ByteVector byteVector22 = byteVector20.putByte((int)(short)100);
    ByteVector byteVector24 = byteVector20.putUTF8("hi!");
    ByteVector byteVector26 = new ByteVector(10);
    ByteVector byteVector28 = byteVector26.putUTF8("");
    ByteVector byteVector30 = byteVector28.putLong((long)(byte)0);
    ByteVector byteVector32 = byteVector30.putShort((int)'#');
    ByteVector byteVector34 = byteVector30.putInt((int)(short)100);
    ByteVector byteVector36 = byteVector34.putInt((int)(byte)100);
    ByteVector byteVector38 = byteVector36.putShort(100);
    ByteVector byteVector40 = new ByteVector(10);
    ByteVector byteVector42 = byteVector40.putLong((long)1);
    ByteVector byteVector44 = byteVector42.putInt((-1));
    ByteVector byteVector46 = byteVector42.putShort((int)(byte)-1);
    ByteVector byteVector48 = byteVector42.putLong(1L);
    ByteVector byteVector50 = byteVector42.putInt((int)(short)-1);
    ByteVector byteVector52 = byteVector50.putShort((int)(short)-1);
    ByteVector byteVector54 = byteVector52.putByte((int)(byte)10);
    ByteVector byteVector56 = new ByteVector(10);
    ByteVector byteVector58 = byteVector56.putUTF8("");
    ByteVector byteVector60 = byteVector58.putByte(10);
    ByteVector byteVector62 = byteVector58.putByte((int)(byte)10);
    ByteVector byteVector64 = byteVector58.putUTF8("hi!");
    byte[] byte_array68 = new byte[] { (byte)10, (byte)0, (byte)10 };
    ByteVector byteVector71 = byteVector58.putByteArray(byte_array68, (int)(byte)0, (int)(short)0);
    ByteVector byteVector74 = byteVector52.putByteArray(byte_array68, 1, (int)(short)0);
    ByteVector byteVector77 = byteVector38.putByteArray(byte_array68, (int)(byte)0, (int)(short)1);
    ByteVector byteVector80 = byteVector20.putByteArray(byte_array68, (int)(byte)0, 0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector83 = byteVector14.putByteArray(byte_array68, (int)' ', (int)(byte)10);
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
    org.junit.Assert.assertNotNull(byteVector54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector80);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test061"); }


    ByteVector byteVector1 = new ByteVector(10);
    ByteVector byteVector3 = byteVector1.putLong((long)1);
    ByteVector byteVector5 = byteVector3.putInt((-1));
    ByteVector byteVector7 = byteVector5.putShort(0);
    ByteVector byteVector9 = byteVector7.putByte(10);
    ByteVector byteVector11 = byteVector9.putShort((int)(short)1);
    ByteVector byteVector13 = byteVector9.putLong(1L);
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
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test062"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(0);
    ByteVector byteVector4 = byteVector2.putLong((long)(short)1);
    ByteVector byteVector6 = byteVector2.putShort((int)'#');
    ByteVector byteVector8 = byteVector6.putShort((int)(short)10);
    ByteVector byteVector10 = byteVector6.putUTF8("hi!");
    ByteVector byteVector12 = byteVector6.putLong((long)(byte)1);
    ByteVector byteVector14 = byteVector12.putInt((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
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
    org.junit.Assert.assertNotNull(byteVector14);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test063"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putUTF8("");
    ByteVector byteVector4 = byteVector2.putByte(0);
    ByteVector byteVector6 = byteVector4.putInt((int)(short)0);
    ByteVector byteVector8 = byteVector4.putShort((int)(short)100);
    ByteVector byteVector10 = byteVector4.putShort((int)(short)100);
    ByteVector byteVector12 = byteVector10.putByte((int)(byte)10);
    ByteVector byteVector14 = byteVector10.putLong(100L);
    ByteVector byteVector16 = byteVector10.putShort((int)(short)10);
    ByteVector byteVector18 = byteVector16.putShort((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
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
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test064"); }


    ByteVector byteVector1 = new ByteVector(10);
    ByteVector byteVector3 = byteVector1.putLong((long)1);
    ByteVector byteVector5 = byteVector3.putInt((-1));
    ByteVector byteVector7 = byteVector3.putShort((int)(byte)-1);
    ByteVector byteVector9 = byteVector3.putLong(1L);
    ByteVector byteVector11 = byteVector3.putInt((int)(short)-1);
    ByteVector byteVector13 = byteVector11.putByte((int)(byte)-1);
    ByteVector byteVector15 = byteVector11.putByte((int)(short)0);
    ByteVector byteVector17 = byteVector11.putInt((int)(short)0);
    byte[] byte_array18 = null;
    ByteVector byteVector21 = byteVector17.putByteArray(byte_array18, (int)'#', 10);
    ByteVector byteVector23 = byteVector21.putByte((int)'a');
    ByteVector byteVector25 = byteVector23.putInt((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
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
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test065"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(0);
    ByteVector byteVector4 = byteVector2.putLong((long)(short)1);
    ByteVector byteVector6 = byteVector2.putShort((int)'#');
    ByteVector byteVector8 = byteVector2.putByte((int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test066"); }


    ByteVector byteVector1 = new ByteVector((int)'4');
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector3.putUTF8("");
    ByteVector byteVector7 = byteVector5.putUTF8("hi!");
    ByteVector byteVector9 = byteVector7.putInt((int)'4');
    ByteVector byteVector11 = byteVector9.putUTF8("hi!");
    ByteVector byteVector13 = byteVector11.putLong((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
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
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test067"); }


    ByteVector byteVector1 = new ByteVector(10);
    ByteVector byteVector3 = byteVector1.putLong((long)1);
    ByteVector byteVector5 = byteVector3.putInt((-1));
    ByteVector byteVector7 = byteVector3.putInt(0);
    ByteVector byteVector9 = byteVector7.putShort((int)' ');
    ByteVector byteVector11 = byteVector7.putByte((int)(short)10);
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
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test068"); }


    ByteVector byteVector1 = new ByteVector(10);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector1.putShort((int)(short)0);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector9 = byteVector1.putInt((int)(byte)-1);
    ByteVector byteVector11 = byteVector1.putShort((int)(short)10);
    ByteVector byteVector13 = byteVector1.putLong((long)(byte)100);
    ByteVector byteVector15 = byteVector1.putInt((int)(byte)-1);
    ByteVector byteVector17 = byteVector1.putLong((long)(short)1);
    ByteVector byteVector19 = byteVector17.putUTF8("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
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
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test069"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(0);
    ByteVector byteVector4 = byteVector2.putByte((int)(short)-1);
    ByteVector byteVector6 = byteVector2.putUTF8("");
    ByteVector byteVector8 = byteVector6.putLong(1L);
    ByteVector byteVector10 = byteVector8.putUTF8("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test070"); }


    ByteVector byteVector1 = new ByteVector((int)'4');
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector1.putShort((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test071"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putUTF8("");
    ByteVector byteVector4 = byteVector2.putByte(0);
    ByteVector byteVector6 = byteVector4.putInt((int)(short)0);
    ByteVector byteVector8 = byteVector4.putLong((long)10);
    ByteVector byteVector10 = byteVector4.putShort((int)(byte)0);
    ByteVector byteVector12 = byteVector4.putUTF8("");
    ByteVector byteVector14 = byteVector4.putByte((int)(byte)10);
    ByteVector byteVector16 = byteVector14.putByte((int)(short)0);
    ByteVector byteVector18 = byteVector14.putByte((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
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
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test072"); }


    ByteVector byteVector1 = new ByteVector(10);
    ByteVector byteVector3 = byteVector1.putLong((long)1);
    ByteVector byteVector5 = byteVector3.putInt((-1));
    ByteVector byteVector7 = byteVector3.putInt(0);
    ByteVector byteVector9 = byteVector3.putUTF8("hi!");
    ByteVector byteVector11 = byteVector9.putShort((int)(byte)0);
    ByteVector byteVector13 = byteVector9.putInt(1);
    ByteVector byteVector15 = byteVector9.putInt(1);
    ByteVector byteVector17 = byteVector9.putInt(10);
    ByteVector byteVector19 = byteVector9.putInt((int)(byte)100);
    ByteVector byteVector21 = byteVector19.putInt((int)(short)0);
    ByteVector byteVector23 = byteVector19.putUTF8("hi!");
    ByteVector byteVector25 = byteVector19.putLong((long)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
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
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test073"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putInt(10);
    ByteVector byteVector4 = byteVector0.putShort((int)(short)10);
    ByteVector byteVector6 = byteVector0.putUTF8("");
    ByteVector byteVector8 = byteVector0.putByte((int)(short)1);
    byte[] byte_array12 = new byte[] { (byte)10, (byte)-1, (byte)100 };
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector15 = byteVector8.putByteArray(byte_array12, (int)'a', (int)(byte)10);
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
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array12);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test074"); }


    ByteVector byteVector1 = new ByteVector(10);
    ByteVector byteVector3 = byteVector1.putLong((long)1);
    ByteVector byteVector5 = byteVector3.putInt((-1));
    ByteVector byteVector7 = byteVector5.putShort(0);
    ByteVector byteVector9 = byteVector7.putByte(10);
    ByteVector byteVector11 = byteVector7.putLong((long)'a');
    ByteVector byteVector13 = byteVector7.putUTF8("");
    ByteVector byteVector15 = byteVector13.putByte((int)'#');
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
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test075"); }


    ByteVector byteVector1 = new ByteVector(10);
    ByteVector byteVector3 = byteVector1.putLong((long)1);
    ByteVector byteVector5 = byteVector3.putInt((-1));
    ByteVector byteVector7 = byteVector3.putShort((int)(byte)-1);
    ByteVector byteVector9 = byteVector3.putLong(1L);
    ByteVector byteVector11 = byteVector3.putInt((int)(short)-1);
    ByteVector byteVector13 = byteVector11.putByte((int)(byte)-1);
    ByteVector byteVector15 = byteVector11.putByte((int)(short)0);
    ByteVector byteVector17 = byteVector11.putInt((int)(byte)0);
    ByteVector byteVector19 = byteVector11.putLong((long)(short)0);
    ByteVector byteVector21 = byteVector11.putUTF8("");
    ByteVector byteVector23 = byteVector11.putUTF8("");
    ByteVector byteVector25 = byteVector23.putByte(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
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
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test076"); }


    ByteVector byteVector1 = new ByteVector((int)'a');
    ByteVector byteVector3 = byteVector1.putInt((int)(short)-1);
    ByteVector byteVector5 = byteVector1.putByte((int)'a');
    ByteVector byteVector7 = byteVector1.putLong((long)(-1));
    ByteVector byteVector9 = byteVector1.putShort((int)(byte)1);
    byte[] byte_array15 = new byte[] { (byte)1, (byte)1, (byte)-1, (byte)100, (byte)100 };
    ByteVector byteVector18 = byteVector9.putByteArray(byte_array15, (int)(short)0, (int)(short)0);
    ByteVector byteVector20 = byteVector18.putByte(10);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test077"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector3.putShort((int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test078"); }


    ByteVector byteVector1 = new ByteVector((int)(short)1);
    ByteVector byteVector3 = byteVector1.putInt(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test079"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putUTF8("");
    ByteVector byteVector4 = byteVector2.putByte(0);
    ByteVector byteVector6 = byteVector4.putInt((int)(short)0);
    ByteVector byteVector8 = byteVector4.putLong((long)10);
    ByteVector byteVector10 = byteVector4.putShort((int)(byte)0);
    ByteVector byteVector12 = byteVector4.putByte(100);
    byte[] byte_array13 = null;
    ByteVector byteVector16 = byteVector4.putByteArray(byte_array13, 0, (int)(byte)1);
    ByteVector byteVector18 = byteVector16.putShort((int)(short)1);
    ByteVector byteVector20 = byteVector18.putUTF8("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
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
    org.junit.Assert.assertNotNull(byteVector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test080"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putInt(10);
    ByteVector byteVector4 = byteVector2.putUTF8("");
    ByteVector byteVector6 = byteVector2.putInt(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test081"); }


    ByteVector byteVector1 = new ByteVector((int)'a');
    ByteVector byteVector3 = byteVector1.putInt((int)(short)-1);
    ByteVector byteVector5 = byteVector3.putLong(0L);
    ByteVector byteVector7 = byteVector5.putInt(0);
    ByteVector byteVector9 = byteVector5.putLong((long)(byte)0);
    ByteVector byteVector11 = byteVector9.putShort((int)(byte)10);
    ByteVector byteVector13 = byteVector9.putLong((long)(short)100);
    ByteVector byteVector15 = byteVector9.putByte((-1));
    ByteVector byteVector17 = byteVector9.putShort((int)(short)-1);
    ByteVector byteVector19 = byteVector9.putInt(0);
    ByteVector byteVector21 = byteVector9.putLong((long)(byte)-1);
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
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test082"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putUTF8("");
    ByteVector byteVector4 = byteVector2.putByte(0);
    ByteVector byteVector6 = byteVector4.putLong(0L);
    ByteVector byteVector8 = new ByteVector(10);
    ByteVector byteVector10 = byteVector8.putLong((long)1);
    ByteVector byteVector12 = byteVector10.putInt((-1));
    ByteVector byteVector14 = byteVector10.putShort((int)(byte)-1);
    ByteVector byteVector16 = byteVector10.putLong(1L);
    ByteVector byteVector18 = byteVector10.putInt((int)(short)-1);
    ByteVector byteVector20 = byteVector18.putShort((int)(short)-1);
    ByteVector byteVector22 = byteVector20.putByte((int)(byte)10);
    ByteVector byteVector24 = new ByteVector(10);
    ByteVector byteVector26 = byteVector24.putUTF8("");
    ByteVector byteVector28 = byteVector26.putByte(10);
    ByteVector byteVector30 = byteVector26.putByte((int)(byte)10);
    ByteVector byteVector32 = byteVector26.putUTF8("hi!");
    byte[] byte_array36 = new byte[] { (byte)10, (byte)0, (byte)10 };
    ByteVector byteVector39 = byteVector26.putByteArray(byte_array36, (int)(byte)0, (int)(short)0);
    ByteVector byteVector42 = byteVector20.putByteArray(byte_array36, 1, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector45 = byteVector4.putByteArray(byte_array36, (int)(byte)-1, (int)'a');
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
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
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
    org.junit.Assert.assertNotNull(byte_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector42);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test083"); }


    ByteVector byteVector1 = new ByteVector(10);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector3.putLong((long)(byte)0);
    ByteVector byteVector7 = byteVector3.putShort(0);
    ByteVector byteVector9 = byteVector3.putUTF8("hi!");
    ByteVector byteVector11 = byteVector9.putShort(100);
    ByteVector byteVector13 = byteVector11.putByte(1);
    ByteVector byteVector15 = byteVector13.putByte((-1));
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
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test084"); }


    ByteVector byteVector1 = new ByteVector(10);
    ByteVector byteVector3 = byteVector1.putLong((long)1);
    ByteVector byteVector5 = byteVector3.putInt((int)(short)0);
    ByteVector byteVector7 = byteVector5.putByte((int)(byte)1);
    ByteVector byteVector9 = byteVector5.putUTF8("");
    ByteVector byteVector11 = byteVector9.putShort((int)'4');
    ByteVector byteVector13 = byteVector9.putByte((int)' ');
    ByteVector byteVector15 = byteVector9.putShort(0);
    ByteVector byteVector17 = byteVector9.putUTF8("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
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
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test085"); }


    ByteVector byteVector1 = new ByteVector((int)'a');
    ByteVector byteVector3 = byteVector1.putInt((int)(short)-1);
    ByteVector byteVector5 = byteVector3.putLong(0L);
    ByteVector byteVector7 = byteVector5.putInt(0);
    ByteVector byteVector9 = byteVector5.putLong((long)(byte)0);
    ByteVector byteVector11 = byteVector9.putShort((int)(byte)10);
    ByteVector byteVector13 = byteVector9.putInt((int)' ');
    ByteVector byteVector15 = byteVector13.putLong((long)'4');
    ByteVector byteVector17 = byteVector13.putUTF8("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
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
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test086"); }


    ByteVector byteVector1 = new ByteVector((int)'a');
    ByteVector byteVector3 = byteVector1.putInt((int)(short)-1);
    ByteVector byteVector5 = byteVector3.putInt((int)(byte)1);
    ByteVector byteVector7 = byteVector5.putUTF8("");
    ByteVector byteVector9 = byteVector5.putLong((long)(byte)0);
    ByteVector byteVector11 = byteVector5.putLong((-1L));
    ByteVector byteVector13 = byteVector5.putByte(0);
    ByteVector byteVector15 = byteVector5.putShort((-1));
    ByteVector byteVector17 = byteVector15.putInt(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
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
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test087"); }


    ByteVector byteVector1 = new ByteVector(10);
    ByteVector byteVector3 = byteVector1.putInt((int)(byte)1);
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector5.putLong((long)0);
    ByteVector byteVector9 = byteVector7.putUTF8("hi!");
    ByteVector byteVector11 = byteVector9.putLong((long)(byte)0);
    ByteVector byteVector13 = byteVector9.putInt((int)(short)0);
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
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test088"); }


    ByteVector byteVector1 = new ByteVector(10);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector3.putByte(10);
    ByteVector byteVector7 = byteVector3.putByte((int)(byte)10);
    ByteVector byteVector9 = byteVector7.putInt((int)(byte)10);
    ByteVector byteVector11 = byteVector7.putByte((int)'#');
    ByteVector byteVector13 = byteVector11.putLong(100L);
    ByteVector byteVector15 = new ByteVector(10);
    ByteVector byteVector17 = byteVector15.putLong((long)1);
    ByteVector byteVector19 = byteVector17.putInt((-1));
    ByteVector byteVector21 = byteVector19.putByte((int)'4');
    ByteVector byteVector23 = new ByteVector((int)'a');
    ByteVector byteVector25 = byteVector23.putInt((int)(short)-1);
    ByteVector byteVector27 = byteVector23.putByte((int)'a');
    ByteVector byteVector29 = byteVector23.putLong((long)(-1));
    ByteVector byteVector31 = byteVector23.putShort((int)(byte)1);
    byte[] byte_array37 = new byte[] { (byte)1, (byte)1, (byte)-1, (byte)100, (byte)100 };
    ByteVector byteVector40 = byteVector31.putByteArray(byte_array37, (int)(short)0, (int)(short)0);
    ByteVector byteVector43 = byteVector21.putByteArray(byte_array37, (int)(short)1, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector46 = byteVector13.putByteArray(byte_array37, (int)(short)0, (int)' ');
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
    org.junit.Assert.assertNotNull(byteVector25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector43);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test089"); }


    ByteVector byteVector1 = new ByteVector(10);
    ByteVector byteVector3 = byteVector1.putInt((int)(byte)1);
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector1.putByte((int)(short)100);
    ByteVector byteVector9 = byteVector7.putInt((int)'4');
    ByteVector byteVector11 = byteVector7.putShort((int)' ');
    ByteVector byteVector13 = byteVector7.putByte((int)(short)1);
    ByteVector byteVector15 = byteVector7.putByte(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
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
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test090"); }


    ByteVector byteVector1 = new ByteVector((int)'a');
    ByteVector byteVector3 = byteVector1.putInt((int)(short)-1);
    ByteVector byteVector5 = byteVector3.putLong(0L);
    ByteVector byteVector7 = byteVector5.putInt((int)'4');
    ByteVector byteVector9 = byteVector7.putByte(10);
    ByteVector byteVector11 = byteVector7.putByte((int)' ');
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
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test091"); }


    ByteVector byteVector1 = new ByteVector((int)'a');
    ByteVector byteVector3 = byteVector1.putInt((int)(short)-1);
    ByteVector byteVector5 = byteVector3.putInt((int)(byte)1);
    ByteVector byteVector7 = byteVector5.putLong((long)'4');
    ByteVector byteVector9 = byteVector7.putLong(1L);
    ByteVector byteVector11 = byteVector7.putShort((int)(short)0);
    ByteVector byteVector13 = byteVector7.putInt((int)(short)0);
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
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test092"); }


    ByteVector byteVector1 = new ByteVector(10);
    ByteVector byteVector3 = byteVector1.putLong((long)1);
    ByteVector byteVector5 = byteVector1.putLong((long)1);
    ByteVector byteVector7 = byteVector5.putUTF8("hi!");
    ByteVector byteVector9 = byteVector5.putInt((int)(byte)0);
    ByteVector byteVector11 = byteVector5.putUTF8("");
    ByteVector byteVector13 = byteVector5.putLong((long)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
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
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test093"); }


    ByteVector byteVector1 = new ByteVector((int)(byte)1);
    ByteVector byteVector3 = byteVector1.putShort((int)'#');
    ByteVector byteVector5 = byteVector1.putLong(10L);
    ByteVector byteVector7 = byteVector1.putLong((long)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test094"); }


    ByteVector byteVector1 = new ByteVector(10);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector3.putLong((long)(byte)0);
    ByteVector byteVector7 = byteVector5.putByte((int)(byte)0);
    ByteVector byteVector9 = byteVector7.putInt((int)(byte)0);
    ByteVector byteVector11 = byteVector7.putInt((int)'4');
    ByteVector byteVector13 = byteVector7.putByte(0);
    ByteVector byteVector15 = byteVector7.putByte(1);
    ByteVector byteVector17 = byteVector7.putUTF8("hi!");
    ByteVector byteVector19 = byteVector7.putUTF8("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
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
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test095"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putUTF8("");
    ByteVector byteVector4 = byteVector2.putByte(0);
    ByteVector byteVector6 = byteVector4.putInt((int)(short)0);
    ByteVector byteVector8 = byteVector4.putShort((int)(short)100);
    ByteVector byteVector10 = byteVector4.putInt((int)(short)1);
    ByteVector byteVector12 = byteVector4.putInt(0);
    ByteVector byteVector14 = byteVector4.putByte(10);
    ByteVector byteVector16 = byteVector14.putShort(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
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
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test096"); }


    ByteVector byteVector1 = new ByteVector(10);
    ByteVector byteVector3 = byteVector1.putLong((long)1);
    ByteVector byteVector5 = byteVector3.putInt((-1));
    ByteVector byteVector7 = byteVector5.putInt((int)(short)1);
    ByteVector byteVector9 = byteVector5.putByte((int)(byte)10);
    ByteVector byteVector11 = byteVector5.putInt((int)'4');
    ByteVector byteVector13 = byteVector5.putShort((int)(short)1);
    ByteVector byteVector15 = byteVector5.putShort((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
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
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test097"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putUTF8("");
    ByteVector byteVector4 = byteVector2.putByte(0);
    ByteVector byteVector6 = byteVector4.putInt((int)(short)0);
    ByteVector byteVector8 = byteVector6.putUTF8("");
    ByteVector byteVector10 = byteVector8.putUTF8("hi!");
    ByteVector byteVector12 = byteVector10.putByte((int)(short)1);
    ByteVector byteVector14 = byteVector12.putLong((long)(short)-1);
    ByteVector byteVector16 = byteVector14.putLong(100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
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
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test098"); }


    ByteVector byteVector1 = new ByteVector(10);
    ByteVector byteVector3 = byteVector1.putLong((long)1);
    ByteVector byteVector5 = byteVector3.putInt((-1));
    ByteVector byteVector7 = byteVector3.putLong((long)100);
    ByteVector byteVector9 = byteVector3.putInt((int)(short)-1);
    ByteVector byteVector11 = new ByteVector((int)'a');
    ByteVector byteVector13 = byteVector11.putInt((int)(short)-1);
    ByteVector byteVector15 = byteVector13.putLong(0L);
    ByteVector byteVector17 = byteVector15.putInt(0);
    ByteVector byteVector19 = byteVector15.putByte((int)(byte)-1);
    ByteVector byteVector21 = byteVector19.putByte((int)(short)100);
    ByteVector byteVector23 = byteVector21.putInt(10);
    ByteVector byteVector24 = new ByteVector();
    ByteVector byteVector26 = byteVector24.putUTF8("");
    ByteVector byteVector28 = byteVector26.putByte(0);
    ByteVector byteVector30 = byteVector28.putInt((int)(short)0);
    ByteVector byteVector32 = byteVector30.putUTF8("");
    ByteVector byteVector34 = new ByteVector(10);
    ByteVector byteVector36 = byteVector34.putUTF8("");
    ByteVector byteVector38 = byteVector36.putUTF8("hi!");
    ByteVector byteVector40 = byteVector36.putInt((int)(byte)1);
    ByteVector byteVector42 = new ByteVector((int)'a');
    ByteVector byteVector44 = byteVector42.putInt((int)(short)-1);
    ByteVector byteVector46 = byteVector42.putByte((int)'a');
    ByteVector byteVector48 = byteVector42.putLong((long)(-1));
    ByteVector byteVector50 = byteVector42.putShort((int)(byte)1);
    byte[] byte_array56 = new byte[] { (byte)1, (byte)1, (byte)-1, (byte)100, (byte)100 };
    ByteVector byteVector59 = byteVector50.putByteArray(byte_array56, (int)(short)0, (int)(short)0);
    ByteVector byteVector62 = byteVector40.putByteArray(byte_array56, (int)(short)1, (int)(byte)0);
    ByteVector byteVector65 = byteVector32.putByteArray(byte_array56, 1, (int)(byte)0);
    ByteVector byteVector68 = byteVector21.putByteArray(byte_array56, (int)(short)0, 0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector71 = byteVector9.putByteArray(byte_array56, (int)(byte)100, 1);
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
    org.junit.Assert.assertNotNull(byteVector38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector68);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test099"); }


    ByteVector byteVector1 = new ByteVector(10);
    ByteVector byteVector3 = byteVector1.putLong((long)1);
    ByteVector byteVector5 = byteVector3.putInt((-1));
    ByteVector byteVector7 = byteVector3.putShort((int)(byte)-1);
    ByteVector byteVector9 = byteVector3.putLong(1L);
    ByteVector byteVector11 = byteVector3.putLong(100L);
    ByteVector byteVector13 = byteVector3.putByte((int)(short)0);
    ByteVector byteVector15 = byteVector13.putInt(0);
    ByteVector byteVector17 = byteVector13.putShort((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
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
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test100"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putUTF8("");
    ByteVector byteVector4 = byteVector2.putByte(0);
    ByteVector byteVector6 = byteVector4.putInt((int)(short)0);
    ByteVector byteVector8 = byteVector6.putUTF8("");
    ByteVector byteVector10 = byteVector8.putByte((int)(short)100);
    ByteVector byteVector11 = new ByteVector();
    ByteVector byteVector13 = byteVector11.putUTF8("");
    ByteVector byteVector15 = byteVector13.putByte(0);
    ByteVector byteVector17 = byteVector15.putInt((int)(short)0);
    ByteVector byteVector19 = byteVector17.putUTF8("");
    ByteVector byteVector21 = new ByteVector(10);
    ByteVector byteVector23 = byteVector21.putUTF8("");
    ByteVector byteVector25 = byteVector23.putUTF8("hi!");
    ByteVector byteVector27 = byteVector23.putInt((int)(byte)1);
    ByteVector byteVector29 = new ByteVector((int)'a');
    ByteVector byteVector31 = byteVector29.putInt((int)(short)-1);
    ByteVector byteVector33 = byteVector29.putByte((int)'a');
    ByteVector byteVector35 = byteVector29.putLong((long)(-1));
    ByteVector byteVector37 = byteVector29.putShort((int)(byte)1);
    byte[] byte_array43 = new byte[] { (byte)1, (byte)1, (byte)-1, (byte)100, (byte)100 };
    ByteVector byteVector46 = byteVector37.putByteArray(byte_array43, (int)(short)0, (int)(short)0);
    ByteVector byteVector49 = byteVector27.putByteArray(byte_array43, (int)(short)1, (int)(byte)0);
    ByteVector byteVector52 = byteVector19.putByteArray(byte_array43, 1, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector55 = byteVector10.putByteArray(byte_array43, (int)'a', (-1));
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
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
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
    org.junit.Assert.assertNotNull(byteVector35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector37);
    
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
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test101"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putUTF8("");
    ByteVector byteVector4 = byteVector2.putByte(0);
    ByteVector byteVector6 = byteVector4.putInt((int)(short)0);
    ByteVector byteVector8 = byteVector4.putLong((long)10);
    ByteVector byteVector10 = byteVector4.putShort((int)(byte)0);
    ByteVector byteVector12 = byteVector4.putLong((long)(byte)1);
    ByteVector byteVector14 = byteVector12.putUTF8("hi!");
    ByteVector byteVector16 = byteVector12.putByte((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
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
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test102"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putInt(10);
    ByteVector byteVector4 = byteVector0.putUTF8("hi!");
    ByteVector byteVector6 = byteVector0.putInt((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test103"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putUTF8("");
    ByteVector byteVector4 = byteVector2.putByte(0);
    ByteVector byteVector6 = byteVector4.putInt((int)(short)0);
    ByteVector byteVector8 = byteVector4.putShort((int)' ');
    ByteVector byteVector10 = byteVector4.putLong((long)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test104"); }


    ByteVector byteVector1 = new ByteVector(10);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector3.putByte(10);
    ByteVector byteVector7 = byteVector5.putInt((int)'#');
    ByteVector byteVector9 = byteVector5.putUTF8("hi!");
    ByteVector byteVector11 = byteVector9.putLong(0L);
    ByteVector byteVector13 = byteVector9.putUTF8("");
    ByteVector byteVector15 = byteVector9.putByte((int)'4');
    ByteVector byteVector17 = byteVector15.putByte((int)(byte)100);
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
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test105"); }


    ByteVector byteVector1 = new ByteVector((int)'a');
    ByteVector byteVector3 = byteVector1.putInt((int)(short)-1);
    ByteVector byteVector5 = byteVector1.putByte((int)'a');
    ByteVector byteVector7 = byteVector1.putLong((long)(-1));
    ByteVector byteVector9 = byteVector7.putByte((int)'a');
    ByteVector byteVector11 = byteVector7.putByte((int)(short)100);
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
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test106"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putUTF8("");
    ByteVector byteVector4 = byteVector2.putByte(0);
    ByteVector byteVector6 = byteVector4.putInt((int)(short)0);
    ByteVector byteVector8 = byteVector4.putLong((long)10);
    ByteVector byteVector10 = byteVector4.putShort((int)(byte)0);
    ByteVector byteVector12 = byteVector4.putLong(0L);
    ByteVector byteVector14 = byteVector12.putLong((long)100);
    ByteVector byteVector16 = byteVector12.putShort((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
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
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test107"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putUTF8("");
    ByteVector byteVector4 = byteVector2.putByte((int)(byte)100);
    ByteVector byteVector6 = byteVector4.putInt((int)'a');
    ByteVector byteVector8 = byteVector4.putLong((long)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test108"); }


    ByteVector byteVector1 = new ByteVector((int)'a');
    ByteVector byteVector3 = byteVector1.putInt((int)(short)-1);
    ByteVector byteVector5 = byteVector1.putByte((int)'a');
    ByteVector byteVector7 = byteVector1.putInt((int)' ');
    ByteVector byteVector9 = byteVector7.putByte(10);
    ByteVector byteVector10 = new ByteVector();
    ByteVector byteVector12 = byteVector10.putUTF8("");
    ByteVector byteVector14 = byteVector12.putByte(0);
    ByteVector byteVector16 = byteVector14.putInt((int)(short)0);
    ByteVector byteVector18 = byteVector14.putLong((long)10);
    ByteVector byteVector20 = byteVector18.putByte(1);
    ByteVector byteVector22 = new ByteVector(10);
    ByteVector byteVector24 = byteVector22.putUTF8("");
    ByteVector byteVector26 = byteVector24.putLong((long)(byte)0);
    ByteVector byteVector28 = byteVector26.putByte((int)'4');
    ByteVector byteVector30 = byteVector28.putUTF8("");
    ByteVector byteVector32 = byteVector30.putShort((int)'a');
    ByteVector byteVector34 = byteVector30.putShort((int)'4');
    ByteVector byteVector35 = new ByteVector();
    ByteVector byteVector37 = byteVector35.putInt(10);
    ByteVector byteVector39 = byteVector35.putUTF8("hi!");
    ByteVector byteVector41 = byteVector39.putUTF8("hi!");
    ByteVector byteVector43 = new ByteVector(10);
    ByteVector byteVector45 = byteVector43.putUTF8("");
    ByteVector byteVector47 = byteVector45.putByte(10);
    ByteVector byteVector49 = byteVector45.putByte((int)(byte)10);
    ByteVector byteVector51 = byteVector45.putUTF8("hi!");
    byte[] byte_array55 = new byte[] { (byte)10, (byte)0, (byte)10 };
    ByteVector byteVector58 = byteVector45.putByteArray(byte_array55, (int)(byte)0, (int)(short)0);
    ByteVector byteVector61 = byteVector41.putByteArray(byte_array55, (int)(short)1, 0);
    ByteVector byteVector64 = byteVector34.putByteArray(byte_array55, (int)(short)1, (int)(byte)0);
    ByteVector byteVector67 = byteVector18.putByteArray(byte_array55, (int)(byte)0, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector70 = byteVector7.putByteArray(byte_array55, (int)(short)10, (int)'#');
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
    org.junit.Assert.assertNotNull(byteVector34);
    
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
    org.junit.Assert.assertNotNull(byteVector49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector51);
    
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
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test109"); }


    ByteVector byteVector1 = new ByteVector(10);
    ByteVector byteVector3 = byteVector1.putLong((long)1);
    ByteVector byteVector5 = byteVector3.putInt((-1));
    ByteVector byteVector7 = byteVector3.putShort((int)(byte)-1);
    ByteVector byteVector9 = byteVector3.putLong(1L);
    ByteVector byteVector11 = byteVector3.putLong(100L);
    ByteVector byteVector13 = byteVector11.putByte((int)'#');
    ByteVector byteVector15 = byteVector11.putShort(0);
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
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test110"); }


    ByteVector byteVector1 = new ByteVector(10);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector3.putByte(10);
    ByteVector byteVector7 = byteVector5.putInt((int)'#');
    ByteVector byteVector9 = byteVector5.putUTF8("hi!");
    ByteVector byteVector11 = byteVector9.putLong(0L);
    ByteVector byteVector13 = byteVector9.putUTF8("");
    ByteVector byteVector15 = byteVector9.putByte((int)'4');
    ByteVector byteVector17 = byteVector9.putShort((int)(byte)-1);
    ByteVector byteVector19 = byteVector17.putInt((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
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
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test111"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putUTF8("");
    ByteVector byteVector4 = byteVector2.putByte(0);
    ByteVector byteVector6 = byteVector4.putInt((int)(short)0);
    ByteVector byteVector8 = byteVector4.putLong((long)10);
    ByteVector byteVector10 = byteVector4.putLong(0L);
    ByteVector byteVector12 = byteVector4.putInt((int)'a');
    ByteVector byteVector14 = byteVector4.putShort(100);
    ByteVector byteVector16 = byteVector4.putUTF8("hi!");
    ByteVector byteVector18 = byteVector16.putByte((int)(byte)100);
    ByteVector byteVector20 = byteVector16.putUTF8("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
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
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test112"); }


    ByteVector byteVector1 = new ByteVector(10);
    ByteVector byteVector3 = byteVector1.putLong((long)1);
    ByteVector byteVector5 = byteVector1.putLong((long)'#');
    ByteVector byteVector7 = byteVector5.putShort((int)' ');
    ByteVector byteVector9 = byteVector5.putInt((-1));
    
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
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test113"); }


    ByteVector byteVector1 = new ByteVector((int)'a');
    ByteVector byteVector3 = byteVector1.putInt((int)(short)-1);
    ByteVector byteVector5 = byteVector3.putInt((int)(byte)1);
    ByteVector byteVector7 = byteVector5.putUTF8("");
    ByteVector byteVector9 = byteVector5.putLong((long)(byte)0);
    ByteVector byteVector11 = byteVector5.putLong((-1L));
    ByteVector byteVector13 = byteVector5.putByte(0);
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
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test114"); }


    ByteVector byteVector1 = new ByteVector((int)'a');
    ByteVector byteVector3 = byteVector1.putInt((int)(short)-1);
    ByteVector byteVector5 = byteVector3.putInt((int)(byte)1);
    ByteVector byteVector7 = byteVector5.putLong((long)'4');
    ByteVector byteVector9 = byteVector7.putLong(1L);
    ByteVector byteVector11 = byteVector7.putShort((int)(short)0);
    ByteVector byteVector13 = byteVector7.putUTF8("");
    ByteVector byteVector15 = byteVector7.putLong((long)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
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
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test115"); }


    ByteVector byteVector1 = new ByteVector(10);
    ByteVector byteVector3 = byteVector1.putInt((int)(byte)1);
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector5.putLong((long)0);
    ByteVector byteVector9 = byteVector7.putUTF8("hi!");
    ByteVector byteVector11 = byteVector9.putLong((long)(byte)0);
    ByteVector byteVector13 = byteVector9.putInt((int)(short)0);
    ByteVector byteVector15 = byteVector9.putShort((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
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
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test116"); }


    ByteVector byteVector1 = new ByteVector(10);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector3.putByte(10);
    byte[] byte_array10 = new byte[] { (byte)100, (byte)10, (byte)10, (byte)10 };
    ByteVector byteVector13 = byteVector3.putByteArray(byte_array10, 0, (int)(short)1);
    ByteVector byteVector15 = byteVector3.putInt((int)'a');
    ByteVector byteVector17 = byteVector3.putInt((int)(byte)0);
    ByteVector byteVector19 = byteVector17.putShort((int)'#');
    ByteVector byteVector21 = byteVector19.putLong((long)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array10);
    
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
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test117"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putUTF8("");
    ByteVector byteVector4 = byteVector2.putByte(0);
    ByteVector byteVector6 = byteVector4.putInt((int)(short)0);
    ByteVector byteVector8 = byteVector6.putUTF8("");
    ByteVector byteVector10 = byteVector8.putUTF8("hi!");
    ByteVector byteVector12 = byteVector8.putInt(100);
    ByteVector byteVector14 = byteVector8.putLong((long)(short)100);
    ByteVector byteVector16 = byteVector8.putLong((long)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
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
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test118"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putUTF8("");
    ByteVector byteVector4 = byteVector2.putShort((int)(byte)0);
    ByteVector byteVector6 = byteVector4.putLong(0L);
    ByteVector byteVector8 = byteVector4.putLong((long)'#');
    ByteVector byteVector10 = new ByteVector(10);
    ByteVector byteVector12 = byteVector10.putLong((long)1);
    ByteVector byteVector14 = byteVector12.putInt((-1));
    ByteVector byteVector16 = byteVector14.putShort(0);
    ByteVector byteVector18 = byteVector16.putByte(10);
    ByteVector byteVector20 = byteVector16.putLong((long)'a');
    ByteVector byteVector22 = byteVector16.putUTF8("");
    ByteVector byteVector24 = new ByteVector(10);
    ByteVector byteVector26 = byteVector24.putUTF8("");
    ByteVector byteVector28 = byteVector26.putUTF8("hi!");
    ByteVector byteVector30 = byteVector26.putInt((int)(byte)1);
    ByteVector byteVector32 = new ByteVector((int)'a');
    ByteVector byteVector34 = byteVector32.putInt((int)(short)-1);
    ByteVector byteVector36 = byteVector32.putByte((int)'a');
    ByteVector byteVector38 = byteVector32.putLong((long)(-1));
    ByteVector byteVector40 = byteVector32.putShort((int)(byte)1);
    byte[] byte_array46 = new byte[] { (byte)1, (byte)1, (byte)-1, (byte)100, (byte)100 };
    ByteVector byteVector49 = byteVector40.putByteArray(byte_array46, (int)(short)0, (int)(short)0);
    ByteVector byteVector52 = byteVector30.putByteArray(byte_array46, (int)(short)1, (int)(byte)0);
    ByteVector byteVector55 = byteVector22.putByteArray(byte_array46, (int)(short)0, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector58 = byteVector8.putByteArray(byte_array46, (int)(byte)1, (int)(byte)10);
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
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
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
    org.junit.Assert.assertNotNull(byteVector34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector55);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test119"); }


    ByteVector byteVector1 = new ByteVector((int)'a');
    ByteVector byteVector3 = byteVector1.putInt((int)(short)-1);
    ByteVector byteVector5 = byteVector3.putLong(0L);
    ByteVector byteVector7 = byteVector5.putInt(0);
    ByteVector byteVector9 = byteVector5.putLong((long)(byte)0);
    ByteVector byteVector11 = byteVector9.putShort((int)(byte)10);
    ByteVector byteVector13 = byteVector9.putLong((long)(short)100);
    ByteVector byteVector15 = byteVector9.putByte((-1));
    ByteVector byteVector17 = byteVector15.putShort((int)'a');
    ByteVector byteVector19 = byteVector15.putByte(0);
    ByteVector byteVector21 = byteVector15.putByte((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
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

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test120"); }


    ByteVector byteVector1 = new ByteVector((int)'a');
    ByteVector byteVector3 = byteVector1.putInt((int)(short)-1);
    ByteVector byteVector5 = byteVector3.putInt((int)(byte)1);
    ByteVector byteVector7 = byteVector5.putLong((long)'4');
    ByteVector byteVector9 = byteVector7.putLong(1L);
    ByteVector byteVector11 = byteVector7.putShort((int)(short)0);
    ByteVector byteVector13 = byteVector7.putLong(10L);
    ByteVector byteVector15 = byteVector7.putShort((int)(byte)100);
    ByteVector byteVector17 = byteVector15.putByte(10);
    ByteVector byteVector19 = byteVector15.putLong((long)(short)0);
    ByteVector byteVector21 = byteVector15.putLong(10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
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
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test121"); }


    ByteVector byteVector1 = new ByteVector((int)' ');
    ByteVector byteVector3 = byteVector1.putShort((int)(byte)-1);
    ByteVector byteVector5 = byteVector1.putShort((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test122"); }


    ByteVector byteVector1 = new ByteVector(10);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector3.putByte(10);
    ByteVector byteVector7 = byteVector3.putByte((int)(byte)10);
    ByteVector byteVector9 = byteVector7.putByte((int)(byte)100);
    ByteVector byteVector11 = byteVector7.putShort(0);
    ByteVector byteVector13 = byteVector7.putByte((int)(byte)100);
    ByteVector byteVector15 = byteVector13.putLong((long)(byte)1);
    ByteVector byteVector17 = byteVector13.putByte(1);
    ByteVector byteVector19 = byteVector13.putLong(0L);
    ByteVector byteVector21 = byteVector13.putInt(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
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
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test123"); }


    ByteVector byteVector1 = new ByteVector((int)(short)0);
    ByteVector byteVector3 = byteVector1.putLong((long)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test124"); }


    ByteVector byteVector1 = new ByteVector((int)'a');
    ByteVector byteVector3 = byteVector1.putInt((int)(short)-1);
    ByteVector byteVector5 = byteVector3.putInt((int)(byte)1);
    ByteVector byteVector7 = byteVector5.putUTF8("");
    ByteVector byteVector9 = byteVector7.putLong((long)(byte)-1);
    ByteVector byteVector11 = byteVector7.putUTF8("");
    ByteVector byteVector13 = byteVector11.putInt((int)(short)-1);
    ByteVector byteVector15 = new ByteVector((int)'a');
    ByteVector byteVector17 = byteVector15.putInt((int)(short)-1);
    ByteVector byteVector19 = byteVector15.putByte((int)'a');
    ByteVector byteVector21 = byteVector15.putLong((long)(-1));
    ByteVector byteVector23 = byteVector21.putByte((int)'a');
    ByteVector byteVector25 = byteVector21.putByte((int)(short)100);
    ByteVector byteVector27 = byteVector25.putUTF8("");
    ByteVector byteVector29 = byteVector27.putByte((int)' ');
    ByteVector byteVector31 = new ByteVector(10);
    ByteVector byteVector33 = byteVector31.putInt((int)(byte)1);
    ByteVector byteVector35 = byteVector31.putUTF8("");
    ByteVector byteVector37 = byteVector35.putLong((long)0);
    ByteVector byteVector39 = byteVector37.putUTF8("hi!");
    ByteVector byteVector41 = byteVector39.putLong((long)'a');
    ByteVector byteVector43 = new ByteVector(10);
    ByteVector byteVector45 = byteVector43.putLong((long)1);
    ByteVector byteVector47 = byteVector45.putInt((-1));
    ByteVector byteVector49 = byteVector47.putShort(0);
    ByteVector byteVector51 = byteVector49.putByte(10);
    ByteVector byteVector53 = byteVector49.putLong((long)'a');
    ByteVector byteVector55 = byteVector49.putUTF8("");
    ByteVector byteVector57 = new ByteVector(10);
    ByteVector byteVector59 = byteVector57.putUTF8("");
    ByteVector byteVector61 = byteVector59.putUTF8("hi!");
    ByteVector byteVector63 = byteVector59.putInt((int)(byte)1);
    ByteVector byteVector65 = new ByteVector((int)'a');
    ByteVector byteVector67 = byteVector65.putInt((int)(short)-1);
    ByteVector byteVector69 = byteVector65.putByte((int)'a');
    ByteVector byteVector71 = byteVector65.putLong((long)(-1));
    ByteVector byteVector73 = byteVector65.putShort((int)(byte)1);
    byte[] byte_array79 = new byte[] { (byte)1, (byte)1, (byte)-1, (byte)100, (byte)100 };
    ByteVector byteVector82 = byteVector73.putByteArray(byte_array79, (int)(short)0, (int)(short)0);
    ByteVector byteVector85 = byteVector63.putByteArray(byte_array79, (int)(short)1, (int)(byte)0);
    ByteVector byteVector88 = byteVector55.putByteArray(byte_array79, (int)(short)0, (int)(byte)0);
    ByteVector byteVector91 = byteVector39.putByteArray(byte_array79, 0, (int)(byte)1);
    ByteVector byteVector94 = byteVector29.putByteArray(byte_array79, (int)(byte)1, 0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector97 = byteVector13.putByteArray(byte_array79, (int)(byte)1, (int)' ');
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
    org.junit.Assert.assertNotNull(byteVector35);
    
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
    org.junit.Assert.assertNotNull(byteVector67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector82);
    
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
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test125"); }


    ByteVector byteVector1 = new ByteVector(10);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector3.putLong((long)(byte)0);
    ByteVector byteVector7 = byteVector5.putByte((int)'4');
    ByteVector byteVector9 = byteVector7.putUTF8("");
    ByteVector byteVector11 = byteVector9.putByte(100);
    ByteVector byteVector13 = byteVector11.putUTF8("hi!");
    ByteVector byteVector15 = byteVector13.putLong((long)1);
    ByteVector byteVector17 = byteVector13.putShort((int)(byte)-1);
    ByteVector byteVector19 = byteVector17.putInt((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
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
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test126"); }


    ByteVector byteVector1 = new ByteVector(10);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector3.putByte(10);
    ByteVector byteVector7 = byteVector3.putByte((int)(byte)10);
    ByteVector byteVector9 = byteVector7.putLong(100L);
    ByteVector byteVector11 = byteVector9.putUTF8("hi!");
    ByteVector byteVector13 = byteVector9.putShort((int)(byte)10);
    ByteVector byteVector15 = byteVector9.putUTF8("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
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
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test127"); }


    ByteVector byteVector1 = new ByteVector(10);
    ByteVector byteVector3 = byteVector1.putLong((long)1);
    ByteVector byteVector5 = byteVector3.putInt((int)(short)0);
    ByteVector byteVector7 = byteVector5.putShort((int)'a');
    ByteVector byteVector9 = byteVector7.putByte((int)(byte)10);
    ByteVector byteVector11 = new ByteVector((int)'a');
    ByteVector byteVector13 = byteVector11.putInt((int)(short)-1);
    ByteVector byteVector15 = byteVector13.putLong(0L);
    ByteVector byteVector17 = byteVector15.putInt(0);
    ByteVector byteVector19 = byteVector15.putByte((int)(byte)-1);
    ByteVector byteVector21 = byteVector19.putByte((int)(short)100);
    ByteVector byteVector23 = byteVector21.putInt(10);
    ByteVector byteVector24 = new ByteVector();
    ByteVector byteVector26 = byteVector24.putUTF8("");
    ByteVector byteVector28 = byteVector26.putByte(0);
    ByteVector byteVector30 = byteVector28.putInt((int)(short)0);
    ByteVector byteVector32 = byteVector30.putUTF8("");
    ByteVector byteVector34 = new ByteVector(10);
    ByteVector byteVector36 = byteVector34.putUTF8("");
    ByteVector byteVector38 = byteVector36.putUTF8("hi!");
    ByteVector byteVector40 = byteVector36.putInt((int)(byte)1);
    ByteVector byteVector42 = new ByteVector((int)'a');
    ByteVector byteVector44 = byteVector42.putInt((int)(short)-1);
    ByteVector byteVector46 = byteVector42.putByte((int)'a');
    ByteVector byteVector48 = byteVector42.putLong((long)(-1));
    ByteVector byteVector50 = byteVector42.putShort((int)(byte)1);
    byte[] byte_array56 = new byte[] { (byte)1, (byte)1, (byte)-1, (byte)100, (byte)100 };
    ByteVector byteVector59 = byteVector50.putByteArray(byte_array56, (int)(short)0, (int)(short)0);
    ByteVector byteVector62 = byteVector40.putByteArray(byte_array56, (int)(short)1, (int)(byte)0);
    ByteVector byteVector65 = byteVector32.putByteArray(byte_array56, 1, (int)(byte)0);
    ByteVector byteVector68 = byteVector21.putByteArray(byte_array56, (int)(short)0, 0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector71 = byteVector9.putByteArray(byte_array56, (int)'a', (int)(short)0);
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
    org.junit.Assert.assertNotNull(byteVector38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector68);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test128"); }


    ByteVector byteVector1 = new ByteVector(10);
    ByteVector byteVector3 = byteVector1.putInt((int)(byte)1);
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector5.putLong((long)0);
    ByteVector byteVector9 = byteVector7.putUTF8("hi!");
    ByteVector byteVector11 = byteVector9.putLong((long)(byte)0);
    ByteVector byteVector13 = byteVector9.putInt((int)(short)0);
    ByteVector byteVector15 = byteVector13.putUTF8("");
    ByteVector byteVector17 = byteVector15.putLong((long)(byte)100);
    ByteVector byteVector19 = byteVector15.putUTF8("");
    ByteVector byteVector21 = byteVector15.putLong((long)(byte)0);
    ByteVector byteVector23 = byteVector21.putByte((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
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

}
