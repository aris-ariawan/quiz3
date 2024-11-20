public class Division {

    public static final long division(int a, int b) {
        long result = ((long) a) / ((long) b);
        return result;
    }

    public static final long divisionUsingLoop(int a, int b) {
        // Check for division by zero
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }

        // Use absolute values for the division process
        int absA = Math.abs(a);
        int absB = Math.abs(b);

        long temp = absA;
        long result = 0;

        // Continue subtracting absB from temp as long as temp is greater than or equal to absB
        while (temp >= absB) {
            temp -= absB;  // Subtract absB from temp
            result++;      // Increment the result for each valid subtraction
        }

        // Determine the sign of the result based on the signs of a and b
        return (a > 0 && b > 0 || a < 0 && b < 0) ? result : -result;
    }


    public static final long divisionUsingRecursion(int a, int b) {
        int absA = Math.abs(a);
        int absB = Math.abs(b);

        long result = 1;
        int diff = absA - absB;
        if (diff > 0 && diff <= 1) {
            return result;
        } else if (diff < 0) {
            return 0;
        }

        result += divisionUsingRecursion(diff, absB);
        return (a > 0 && b > 0 || a < 0 && b < 0) ? result : -result;
    }

    public static final long divisionUsingMultiplication(int a, int b) {
        int absA = Math.abs(a);
        int absB = Math.abs(b);

        int temp = absB;
        int counter = 0;
        while (temp <= absA) {
            temp = temp << 1;
            counter--;
        }
        absA -= absB << (counter - 1);
        long result = (long) Math.pow(2, counter - 1);
        if (absB <= absA)
            result += divisionUsingMultiplication(absA, absB);
        return (a > 0 && b > 0 || a < 0 && b < 0) ? result : -result;
    }

    public static final long divisionUsingShift(int a, int b) {
        // Check if b is 0 to avoid division by zero.
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }

        // Use long for temp variables to avoid overflow
        long absA = Math.abs((long) a);  // Convert to long to avoid overflow
        long absB = Math.abs((long) b);  // Convert to long to avoid overflow
        long tempA, tempB, counter;

        long result = 0L;

        while (absA >= absB) {
            tempA = absA; // Start with the current value of absA
            tempB = absB;
            counter = 1;

            // Double tempB and counter until tempB is larger than tempA
            while (tempA >= (tempB << 1)) {
                tempB <<= 1;
                counter <<= 1; // Double the counter
            }

            absA -= tempB;  // Subtract tempB from absA
            result += counter;  // Add counter (which represents the power of two)
        }

        // Check the sign of the result
        if ((a > 0 && b > 0) || (a < 0 && b < 0)) {
            return result;  // Both have the same sign
        } else {
            return -result;  // Result should be negative
        }
    }


    public static final long divisionUsingLogs(int a, int b) {

        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }

        long absA = Math.abs(a);
        long absB = Math.abs(b);
        double logBase10A = Math.log10(absA);
        double logBase10B = Math.log10(absB);
        double powOf10 = Math.pow(10, (logBase10A - logBase10B));
        long result = (long) Math.floor(powOf10);
        return (a > 0 && b > 0 || a < 0 && b < 0) ? result : -result;
    }
}