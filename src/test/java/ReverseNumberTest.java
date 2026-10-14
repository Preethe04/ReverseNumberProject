import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReverseNumberTest {
    @Test
    void reversesPositiveNumber() { assertEquals(54321, ReverseNumber.reverse(12345)); }

    @Test
    void handlesTrailingZeroes() { assertEquals(21, ReverseNumber.reverse(1200)); }

    @Test
    void handlesZero() { assertEquals(0, ReverseNumber.reverse(0)); }

    @Test
    void reversesNegativeNumber() { assertEquals(-321, ReverseNumber.reverse(-123)); }

    @Test
    void rejectsOverflow() { assertThrows(ArithmeticException.class, () -> ReverseNumber.reverse(1534236469)); }
}
