import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PerfectNumberTest {

    @Test
    void testIsPerfect_withPerfectNumber_shouldReturnTrue() {
        assertTrue(PerfectNumber.isPerfect(6));
        assertTrue(PerfectNumber.isPerfect(28));
        assertTrue(PerfectNumber.isPerfect(496));
    }

    @Test
    void testIsPerfect_withNonPerfectNumber_shouldReturnFalse() {
        assertFalse(PerfectNumber.isPerfect(10));
        assertFalse(PerfectNumber.isPerfect(12));
    }

    @Test
    void testIsPerfect_withOne_shouldReturnFalse() {
        assertFalse(PerfectNumber.isPerfect(1));
    }

    @Test
    void testIsPerfect_withPrimeNumber_shouldReturnFalse() {
        assertFalse(PerfectNumber.isPerfect(7));
        assertFalse(PerfectNumber.isPerfect(13));
    }

    @Test
    void testIsPerfect_withNegativeNumber_shouldReturnFalse() {
        assertFalse(PerfectNumber.isPerfect(-6));
        assertFalse(PerfectNumber.isPerfect(0));
    }
}
