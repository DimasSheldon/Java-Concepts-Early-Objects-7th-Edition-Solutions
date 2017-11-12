package EKPL.Chapter5_Decisions.PracticeExercises;

import java.util.Scanner;

/**
 * Created by Sheldon on 11/5/2016.
 * A program that reads an integer and prints whether it is
 * a negative, zero, or positive.
 */
public class E5_1 {
  public static void main(String[] args) {
    System.out.print("Please input an integer number: ");
    Scanner theInput = new Scanner(System.in);

    //Check whether the input is a number or not
    if (theInput.hasNextInt()) {
      // The input is a number
      int number = theInput.nextInt();
      System.out.printf("The number %5s%5d%n", ": ", number);
      if (number < 0) {
        System.out.println("It is a negative number.");
      } else if (number == 0) {
        System.out.println("It is a zero");
      } else {
        System.out.println("It is a positive number");
      }
    } else {
      System.out.println("Invalid input");
    }
  }
}
