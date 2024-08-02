public class Makes10 {

    // Define the function makes10 which checks if either of the two integers is 10
    // or if their sum is 10
    public boolean makes10(int a, int b) {
        // Return true if:
        // 1. a is equal to 10, or
        // 2. b is equal to 10, or
        // 3. the sum of a and b is equal to 10
        // The logical OR operator (||) is used to combine these conditions
        return (a == 10 || b == 10 || a + b == 10);
    }

    // For demonstration and testing
    public static void main(String[] args) {
        Makes10 m10 = new Makes10();

        // Test cases
        System.out.println(m10.makes10(9, 10)); // a is 9, b is 10 -> true because b is 10
        System.out.println(m10.makes10(9, 9));  // a is 9, b is 9 -> false because neither a nor b is 10, and their sum is not 10
        System.out.println(m10.makes10(1, 9));  // a is 1, b is 9 -> true because their sum is 10
        System.out.println(m10.makes10(10, 0)); // a is 10, b is 0 -> true because a is 10
        System.out.println(m10.makes10(5, 5));  // a is 5, b is 5 -> true because their sum is 10
    }
}
