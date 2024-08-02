package org;
public class SumDouble {

    // Define the function sumDouble which calculates the sum of two integers
    // and doubles the sum if the integers are the same
    public int sumDouble(int a, int b) {
        // Store the sum of a and b in a local variable
        int sum = a + b;

        // Check if the two integers are the same
        if (a == b) {
            // If a and b are the same, double the sum
            sum = sum * 2;
        }

        // Return the final sum (either doubled or not)
        return sum;
    }

    // For demonstration and testing
    public static void main(String[] args) {
        SumDouble sd = new SumDouble();

        // Test cases
        System.out.println(sd.sumDouble(1, 2));  // Different integers -> 1 + 2 = 3
        System.out.println(sd.sumDouble(3, 2));  // Different integers -> 3 + 2 = 5
        System.out.println(sd.sumDouble(2, 2));  // Same integers -> (2 + 2) * 2 = 8
    }
}
