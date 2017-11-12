package EKPL.Chapter2_UsingObject.P2_5;

import java.util.Random;

/**
 * Created by Sheldon on 10/24/2016.
 * P2.5
 * Generate lottery numbers array
 */
public class LotteryPrinter {
    public static void main(String[] args) {
        int max = 50;
        int offset = 1;
        int range = max - offset;
        int numbersToGenerate = 6;

        Random generator = new Random();
        System.out.println("Lottery combination: ");
        for (int i = 0; i < numbersToGenerate; i++) {
            int inRangeGenerator = generator.nextInt(range) + offset;
            System.out.print(inRangeGenerator);
            if (i < (numbersToGenerate - 1)) {
                System.out.print(" ");
            }
            if (i == (numbersToGenerate - 1)) {
                System.out.println("\nPlay this combination-it'll make you rich!");
            }
        }
    }
}
