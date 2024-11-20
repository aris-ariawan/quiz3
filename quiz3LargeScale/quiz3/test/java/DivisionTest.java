import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DivisionTest {

    // Test for division method
    @Test
    public void testDivision() {
        // Regular division
        assertEquals(2, Division.division(6, 3));
        assertEquals(-2, Division.division(-6, 3));
        assertEquals(-2, Division.division(6, -3));
        assertEquals(0, Division.division(0, 5));

        // Edge case: division by zero
        assertThrows(ArithmeticException.class, () -> Division.division(10, 0)); // Divide by zero
    }

    // Test for divisionUsingLoop method
    @Test
    public void testDivisionUsingLoop() {

        // Regular division
        assertEquals(2, Division.divisionUsingLoop(6, 3));
        assertEquals(-2, Division.divisionUsingLoop(-6, 3));
        assertEquals(-2, Division.divisionUsingLoop(6, -3));
        assertEquals(0, Division.divisionUsingLoop(0, 5));

        // Edge case: division by zero
        assertThrows(ArithmeticException.class, () -> Division.divisionUsingLoop(10, 0)); // Divide by zero
    }

    // Test for divisionUsingRecursion method
    @Test
    public void testDivisionUsingRecursion() {
        // Regular division
        assertEquals(2, Division.divisionUsingRecursion(6, 3));
        assertEquals(-2, Division.divisionUsingRecursion(-6, 3));
        assertEquals(-2, Division.divisionUsingRecursion(6, -3));
        assertEquals(0, Division.divisionUsingRecursion(0, 5));

        // Edge case: division by zero
        assertThrows(StackOverflowError.class, () -> Division.divisionUsingRecursion(10, 0)); // Divide by zero

    }

    // Test for divisionUsingMultiplication method
    @Test
    public void testDivisionUsingMultiplication() {
        // Regular division
        assertEquals(2, Division.divisionUsingMultiplication(6, 3));
        assertEquals(-2, Division.divisionUsingMultiplication(-6, 3));
        assertEquals(-2, Division.divisionUsingMultiplication(6, -3));
        assertEquals(0, Division.divisionUsingMultiplication(0, 5));

        // Edge case: division by zero
        assertThrows(ArithmeticException.class, () -> Division.divisionUsingMultiplication(10, 0)); // Divide by zero

    }

    // Test for divisionUsingShift method
    @Test
    public void testDivisionUsingShift() {
        // Regular division
        assertEquals(2, Division.divisionUsingShift(2, 1));
        assertEquals(-2, Division.divisionUsingShift(-6, 3));

        // Edge case: division by zero
        assertThrows(ArithmeticException.class, () -> Division.divisionUsingShift(5, 0));  // Division by zero
    }

    // Test for divisionUsingLogs method
    @Test
    public void testDivisionUsingLogs() {
        // Regular division
        assertEquals(4, Division.divisionUsingLogs(12, 3));
        assertEquals(-2, Division.divisionUsingLogs(-6, 3));

        // Edge case: division by zero
        assertThrows(ArithmeticException.class, () -> Division.divisionUsingLogs(10, 0)); // Divide by zero
    }
}


//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;
//
//class DivisionTest {
//
//    @Test
//    void testDivision() {
//        // Regular cases
//        assertEquals(2, Division.division(10, 5));
//        assertEquals(2, Division.division(-10, -5));
//
//        // Edge cases
//        assertThrows(ArithmeticException.class, () -> Division.division(10, 0)); // Divide by zero
//        assertEquals(0, Division.division(1, Integer.MAX_VALUE));
//        assertEquals(1, Division.division(Integer.MAX_VALUE, Integer.MAX_VALUE));
//        assertEquals(-1, Division.division(Integer.MIN_VALUE, Integer.MAX_VALUE));
//    }
//
//    @Test
//    void testDivisionUsingLoop() {
//        // Regular cases
//        assertEquals(2, Division.divisionUsingLoop(10, 5));
//        assertEquals(0, Division.divisionUsingLoop(0, 5));
//        assertEquals(2, Division.divisionUsingLoop(-10, -5));
//
//        // Edge cases
//        assertThrows(ArithmeticException.class, () -> Division.divisionUsingLoop(10, 0)); // Divide by zero
//        assertEquals(0, Division.divisionUsingLoop(1, Integer.MAX_VALUE));
//        assertEquals(1, Division.divisionUsingLoop(Integer.MAX_VALUE, Integer.MAX_VALUE));
//        assertEquals(-1, Division.divisionUsingLoop(Integer.MIN_VALUE, Integer.MAX_VALUE));
//    }
//
//    @Test
//    void testDivisionUsingRecursion() {
//        // Regular cases
//        assertEquals(2, Division.divisionUsingRecursion(10, 5));
//        assertEquals(0, Division.divisionUsingRecursion(0, 5));
//        assertEquals(-2, Division.divisionUsingRecursion(10, -5));
//        assertEquals(2, Division.divisionUsingRecursion(-10, -5));
//
//        // Edge cases
//        assertThrows(ArithmeticException.class, () -> Division.divisionUsingRecursion(10, 0)); // Divide by zero
//        assertEquals(0, Division.divisionUsingRecursion(1, Integer.MAX_VALUE));
//        assertEquals(1, Division.divisionUsingRecursion(Integer.MAX_VALUE, Integer.MAX_VALUE));
//        assertEquals(-1, Division.divisionUsingRecursion(Integer.MIN_VALUE, Integer.MAX_VALUE));
//    }
//
//    @Test
//    void testDivisionUsingMultiplication() {
//        // Regular cases
//        assertEquals(2, Division.divisionUsingMultiplication(10, 5));
//        assertEquals(0, Division.divisionUsingMultiplication(0, 5));
//        assertEquals(-2, Division.divisionUsingMultiplication(10, -5));
//        assertEquals(2, Division.divisionUsingMultiplication(-10, -5));
//
//        // Edge cases
//        assertThrows(ArithmeticException.class, () -> Division.divisionUsingMultiplication(10, 0)); // Divide by zero
//        assertEquals(0, Division.divisionUsingMultiplication(1, Integer.MAX_VALUE));
//        assertEquals(1, Division.divisionUsingMultiplication(Integer.MAX_VALUE, Integer.MAX_VALUE));
//        assertEquals(-1, Division.divisionUsingMultiplication(Integer.MIN_VALUE, Integer.MAX_VALUE));
//    }
//
//    @Test
//    void testDivisionUsingShift() {
//        // Regular cases
//        assertEquals(2, Division.divisionUsingShift(10, 5));
//        assertEquals(0, Division.divisionUsingShift(0, 5));
//        assertEquals(-2, Division.divisionUsingShift(10, -5));
//        assertEquals(2, Division.divisionUsingShift(-10, -5));
//
//        // Edge cases
//        assertThrows(ArithmeticException.class, () -> Division.divisionUsingShift(10, 0)); // Divide by zero
//        assertEquals(0, Division.divisionUsingShift(1, Integer.MAX_VALUE));
//        assertEquals(1, Division.divisionUsingShift(Integer.MAX_VALUE, Integer.MAX_VALUE));
//        assertEquals(-1, Division.divisionUsingShift(Integer.MIN_VALUE, Integer.MAX_VALUE));
//    }
//
//    @Test
//    void testDivisionUsingLogs() {
//        // Regular cases
//        assertEquals(2, Division.divisionUsingLogs(10, 5));
//        assertEquals(0, Division.divisionUsingLogs(0, 5));
//        assertEquals(-2, Division.divisionUsingLogs(10, -5));
//        assertEquals(2, Division.divisionUsingLogs(-10, -5));
//
//        // Edge cases
//        assertThrows(ArithmeticException.class, () -> Division.divisionUsingLogs(10, 0)); // Divide by zero
//        assertEquals(0, Division.divisionUsingLogs(1, Integer.MAX_VALUE));
//        assertEquals(1, Division.divisionUsingLogs(Integer.MAX_VALUE, Integer.MAX_VALUE));
//        assertEquals(-1, Division.divisionUsingLogs(Integer.MIN_VALUE, Integer.MAX_VALUE));
//    }
//}
