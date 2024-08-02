public class PosNeg {

    // Define the function posNeg which determines the sign relationship between two integers a and b
    // based on the boolean flag negative
    public boolean posNeg(int a, int b, boolean negative) {
        // Check if the negative flag is true
        if (negative) {
            // If negative is true, return true only if both a and b are negative
            return (a < 0 && b < 0);
        } else {
            // If negative is false, return true if one of the integers is negative and the other is positive
            // This is checked using logical OR operator (||) with two conditions:
            // 1. a is negative and b is positive
            // 2. a is positive and b is negative
            return ((a < 0 && b > 0) || (a > 0 && b < 0));
        }
    }

    // For demonstration and testing
    public static void main(String[] args) {
        PosNeg pn = new PosNeg();

        // Test cases
        System.out.println(pn.posNeg(1, -1, false));  // a is positive, b is negative, negative is false -> true
        System.out.println(pn.posNeg(-1, 1, false));  // a is negative, b is positive, negative is false -> true
        System.out.println(pn.posNeg(-4, -5, true));  // a and b are negative, negative is true -> true
        System.out.println(pn.posNeg(-4, 5, true));   // a is negative, b is positive, negative is true -> false
        System.out.println(pn.posNeg(4, 5, false));   // a and b are positive, negative is false -> false
        System.out.println(pn.posNeg(-4, -5, false)); // a and b are negative, negative is false -> false
    }
}
