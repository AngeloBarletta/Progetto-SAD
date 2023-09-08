import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestDivide {

    @Test
    public void testDivide() {
        Divide cut = new Divide();
        int result = cut.divide(10, 2);
        assertEquals(5, result);
        assertThrows(ArithmeticException.class, () -> {
            cut.divide(10, 0);
        });
    }
}
