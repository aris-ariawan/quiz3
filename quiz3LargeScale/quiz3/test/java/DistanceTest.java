import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DistanceTest {

    @Test
    void testChebyshevDistance() {
        // Regular case
        assertEquals(4, Distance.chebyshevDistance(new long[]{1, 2}, new long[]{5, 3}));

        // Edge cases
        assertEquals(0, Distance.chebyshevDistance(new long[]{0, 0}, new long[]{0, 0})); // Same points
        assertEquals(5, Distance.chebyshevDistance(new long[]{-5, -5}, new long[]{0, 0})); // Negative points
        assertThrows(ArrayIndexOutOfBoundsException.class,
                () -> Distance.chebyshevDistance(new long[]{1}, new long[]{2})); // Invalid input length
    }

    @Test
    void testSquaredDistance() {
        // Regular case
        assertEquals(25.0, Distance.squaredDistance(0, 0, 3, 4));

        // Edge cases
        assertEquals(0.0, Distance.squaredDistance(1, 1, 1, 1)); // Same points
        assertEquals(2.0E20, Distance.squaredDistance(1E10, 1E10, 0, 0)); // Very large inputs
    }

    @Test
    void testEuclideanDistance() {
        // Regular case
        assertEquals(7.810249675906654, Distance.euclideanDistance(0, 0, 5, 6));

        // Edge cases
        assertEquals(0.0, Distance.euclideanDistance(1, 1, 1, 1)); // Same points
        assertEquals(1.4142135623730951, Distance.euclideanDistance(0, 0, 1, 1)); // Diagonal distance
        assertEquals(Math.sqrt(2.0E20), Distance.euclideanDistance(1E10, 1E10, 0, 0)); // Very large inputs
    }
}
