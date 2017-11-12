package EKPL.Lab.November14;

import java.util.*;

/**
 * Created by Sheldon on 11/14/2016.
 * This program converts a decimal number to the
 * romans number (from 1 up to 3999).
 * P5.6
 */

public class RomanNumber {
  public static void main(String[] args) {
    // Display opening words
    System.out.printf("%50s%n", "This program converts a decimal number to the");
    System.out.printf("%33s%n%n", "romans number");

    // Create a dictionary for romans number
    Map romanDict = new HashMap<Integer, String>();
    romanDict.put(1, "I");
    romanDict.put(4, "IV");
    romanDict.put(5, "V");
    romanDict.put(9, "IX");
    romanDict.put(10, "X");
    romanDict.put(40, "XL");
    romanDict.put(50, "L");
    romanDict.put(90, "XC");
    romanDict.put(100, "C");
    romanDict.put(400, "CD");
    romanDict.put(500, "D");
    romanDict.put(900, "CM");
    romanDict.put(1000, "M");

    // Create and sort a list of romans number keys
    ArrayList<Integer> decimals = new ArrayList<Integer>(romanDict.keySet());
    decimals.sort(null);

    // Print the prompt message
    System.out.printf("%n%36s", "Please input a decimal number");
    System.out.printf("%n%37s", "(from 1 up to 3999) or Q to exit: ");

    Scanner input = new Scanner(System.in);

    // Do the conversion
    boolean done = false;
    int number;
    while (!done && input.hasNextInt()) {
      number = input.nextInt();
      if (number > 0 && number < 4000) {
        System.out.printf("%n%36s", "Decimal number: ");
        System.out.print(number);

        System.out.printf("%n%36s", "Roman number: ");
        String romanNumber;

        int i = decimals.size() - 1;
        while (i >= 0) {
          if (decimals.get(i) <= number) {
            romanNumber = (String) romanDict.get((decimals.get(i)));
            System.out.print(romanNumber);
            number = number - decimals.get(i);
          } else {
            i--;
          }
        }
        done = true;
      } else {
        System.out.printf("%n%30s","--Sorry, invalid input--");
        System.out.printf("%n%36s", "Please input a decimal number ");
        System.out.printf("%n%37s", "(from 1 up to 3999) or Q to exit: ");
      }
    }
    System.out.println("\n\nThank you for using this program.");
  }
}