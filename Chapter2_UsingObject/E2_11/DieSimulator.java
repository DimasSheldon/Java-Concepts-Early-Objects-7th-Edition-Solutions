package EKPL.Chapter2_UsingObject.E2_11;

import java.util.Random;

/**
 * Created by Sheldon on 10/23/2016.
 * E2.11
 * Generate random number
 */
public class DieSimulator {
    public static void main(String[] args) {
    // Set the upper bound and lower bound to count
        int max = 6;
        int offset = 1;
        int range = max - offset;

    // Construct number generator object
        Random generator = new Random();

    // Generate random number
        int inRangeGenerator = generator.nextInt(range) + offset;

    // Display result
        System.out.println("Random number: " + inRangeGenerator);
    }
}
