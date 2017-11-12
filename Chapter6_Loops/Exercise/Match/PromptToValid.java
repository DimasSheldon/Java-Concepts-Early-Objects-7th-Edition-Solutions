package EKPL.Chapter6_Loops.Exercise.Match;

import java.util.Scanner;

/**
 * Created by Sheldon on 11/8/2016.
 */
public class PromptToValid {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    boolean valid = false;
    double input = 0;
    while (!valid) {
      System.out.print("Please input a positive number between 0 and 100: ");
      input = in.nextDouble();
      if (input > 0 && input < 100) {
        System.out.println("User's input: " + input);
        valid = true;
      } else {
        System.out.println("Invalid input.");
      }
    }
  }
}