import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest{
  @Test
  public void testAlgebra(){
    Calcolatrice cut = new Calcolatrice();

    assertEquals(2,cut.add(1,1));

    assertEquals(2,cut.subtract(3,1));
    
    assertEquals(2,cut.multiply(2,1));

    assertEquals(2.0,cut.divide(4,2), 0.001);
    Exception thrown = assertThrows(IllegalArgumentException.class, () -> {cut.divide(2,0);});
    assertTrue(thrown.getMessage().contains("Division by zero"));
  }

  @Test
  public void testFactorial() {
    Calcolatrice cut = new Calcolatrice();

    assertEquals(6,cut.factorial(3));
    assertEquals(1,cut.factorial(1));
    assertEquals(1,cut.factorial(0));

    Exception thrown = assertThrows(IllegalArgumentException.class, () -> {cut.factorial(-1);});
    assertTrue(thrown.getMessage().contains("Factorial is not defined"));
  }
}