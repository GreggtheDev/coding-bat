public class NearHundred {

    // Define the function nearHundred which checks if a given integer n is within 10 of 100 or 200
    public boolean nearHundred(int n) {
        // Calculate the absolute difference between 100 and n, and check if it is less than or equal to 10
        // Math.abs(100 - n): This calculates the absolute value of the difference between 100 and n
        // If this difference is less than or equal to 10, it means n is within 10 of 100
        boolean near100 = Math.abs(100 - n) <= 10;

        // Calculate the absolute difference between 200 and n, and check if it is less than or equal to 10
        // Math.abs(200 - n): This calculates the absolute value of the difference between 200 and n
        // If this difference is less than or equal to 10, it means n is within 10 of 200
        boolean near200 = Math.abs(200 - n) <= 10;

        // Return true if either near100 or near200 is true
        // The logical OR operator (||) is used to combine these conditions
        return (near100 || near200);
    }

    // For demonstration and testing
    public static void main(String[] args) {
        NearHundred nh = new NearHundred();

        // Test cases
        System.out.println(nh.nearHundred(93));  // n is 93 -> true because 93 is within 10 of 100
        System.out.println(nh.nearHundred(90));  // n is 90 -> true because 90 is within 10 of 100
        System.out.println(nh.nearHundred(89));  // n is 89 -> false because 89 is not within 10 of 100 or 200
        System.out.println(nh.nearHundred(110)); // n is 110 -> true because 110 is within 10 of 100
        System.out.println(nh.nearHundred(209)); // n is 209 -> true because 209 is within 10 of 200
        System.out.println(nh.nearHundred(211)); // n is 211 -> false because 211 is not within 10 of 100 or 200
    }
}
