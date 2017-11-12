package EKPL.Chapter2_UsingObject.E2_6;

/**
 * Created by Sheldon on 10/23/2016.
 * E2.6
 * Replacing string object elements
 */

public class HollePrinter {
    public static void main(String[] args) {
    // Construct string object
        String sentence = "Hello, World!";

    // 1st. replace string element e to $, "H$llo, World!"
    // 2nd. replace string element o to e, "H$lle, Werld!"
    // 3rd. replace string element $ to o, "Holle, Werld!"
        String sentenceReplace = sentence.replace("e", "$").replace("o", "e").replace("$", "o");

    // Display the result
        System.out.printf("String %25.15s%nString changed %17.15s%nExpected %23.15s%n",
                ": " + sentence, ": " + sentenceReplace, ": " + "Holle, Werld!");
    }
}