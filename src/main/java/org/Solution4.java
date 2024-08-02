public class Diff21 {

    // Define the function diff21 which calculates the absolute difference between n and 21
    // If n is greater than 21, it returns double the absolute difference
    public int diff21(int n) {
        // Check if n is less than or equal to 21
        if (n <= 21) {
            // If n is less than or equal to 21, return the difference 21 - n
            return 21 - n;
        } else {
            // If n is greater than 21, return double the difference n - 21
            return (n - 21) * 2;
        }
    }

    // For demonstration and testing
    public static void main(String[] args) {
        Diff21 d21 = new Diff21();

        // Test cases
        System.out.println(d21.diff21(19)); // n is less than 21 -> 21 - 19 = 2
        System.out.println(d21.diff21(10)); // n is less than 21 -> 21 - 10 = 11
        System.out.println(d21.diff21(21)); // n is equal to 21 -> 21 - 21 = 0
        System.out.println(d21.diff21(22)); // n is greater than 21 -> (22 - 21) * 2 = 2
        System.out.println(d21.diff21(30)); // n is greater than 21 -> (30 - 21) * 2 = 18
    }
}
