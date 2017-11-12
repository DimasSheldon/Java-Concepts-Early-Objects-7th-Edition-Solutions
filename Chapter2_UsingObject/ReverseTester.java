package EKPL.Chapter2_UsingObject.E2_7;

/**
 * Created by Sheldon on 10/23/2016.
 * E2.7
 * Reversing string object
 */
public class ReverseTester {
    public static void main(String[] args) {
    // Construct string object
        StringBuilder stringToReverse = new StringBuilder("desserts");
        System.out.println("String to reverse: " + stringToReverse);

    // Call reverse() method to reverse the string object
        String stringReversed = stringToReverse.reverse().toString();

    // Display result
        System.out.println("String reversed: " + stringReversed);
        System.out.println("Expected: stressed");
    }
}
