package org.example;
public class MonkeyTrouble {

    // Define the function monkeyTrouble which determines if we are in trouble based on two monkeys' smiles
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {

        // First condition: If both monkeys are smiling
        if (aSmile && bSmile) {
            // If both monkeys are smiling, we are in trouble, so return true
            return true;
        }

        // Second condition: If neither of the monkeys is smiling
        if (!aSmile && !bSmile) {
            // If neither monkey is smiling, we are also in trouble, so return true
            return true;
        }

        // If one monkey is smiling and the other is not, we are not in trouble
        // Thus, we return false
        return false;
    }

    // For demonstration and testing
    public static void main(String[] args) {
        MonkeyTrouble mt = new MonkeyTrouble();

        // Test cases
        System.out.println(mt.monkeyTrouble(true, true));   // Both monkeys smiling -> true
        System.out.println(mt.monkeyTrouble(false, false)); // Neither monkey smiling -> true
        System.out.println(mt.monkeyTrouble(true, false));  // One monkey smiling, one not -> false
        System.out.println(mt.monkeyTrouble(false, true));  // One monkey smiling, one not -> false
    }
}
