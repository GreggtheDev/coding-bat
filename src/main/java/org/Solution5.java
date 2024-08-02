public class ParrotTrouble {

    // Define the function parrotTrouble which determines if we are in trouble based on the parrot's talking status and the current hour
    public boolean parrotTrouble(boolean talking, int hour) {
        // Return true if the parrot is talking and the hour is before 7 or after 20
        // talking && (hour < 7 || hour > 20): Checks if the parrot is talking and the hour is outside the range of 7 to 20 (inclusive)
        // Extra parenthesis around the || clause are needed because && binds more tightly than ||
        // In logical operations, && (AND) has higher precedence than || (OR)
        return (talking && (hour < 7 || hour > 20));
    }

    // For demonstration and testing
    public static void main(String[] args) {
        ParrotTrouble pt = new ParrotTrouble();

        // Test cases
        System.out.println(pt.parrotTrouble(true, 6));  // Parrot is talking and hour is 6 -> true
        System.out.println(pt.parrotTrouble(true, 7));  // Parrot is talking and hour is 7 -> false
        System.out.println(pt.parrotTrouble(false, 6)); // Parrot is not talking and hour is 6 -> false
        System.out.println(pt.parrotTrouble(true, 21)); // Parrot is talking and hour is 21 -> true
        System.out.println(pt.parrotTrouble(false, 21)); // Parrot is not talking and hour is 21 -> false
    }
}
