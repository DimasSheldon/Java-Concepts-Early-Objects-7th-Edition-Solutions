package EKPL.Chapter6_Loops.PracticeExercise.E6_9;

import java.util.Scanner;
// DONE
/**
 * Created by Sheldon on 11/14/2016.
 * This program reverses a word.
 * E6.9
 */
public class ReverseString {
  public static void main(String[] args) {
    System.out.printf("%45s%n%n", "This program reverses the given word");
    System.out.print("Please enter a word: ");
    Scanner input = new Scanner(System.in);

    String word = input.next();
    int i = word.length() - 1;
    System.out.print("Reversed word      : ");
    while (i >= 0) {
      System.out.print(word.charAt(i));
      i--;
    }
    System.out.println();
    System.out.printf("%n%42s%n%n", "Thank you for using this program");
  }
}
