package EKPL.Chapter5_Decisions.PracticeExercises;

import java.util.Scanner;

/**
 * Created by Sheldon on 11/6/2016.
 */
public class E5_4 {
  public static void main(String[] args) {
    System.out.println("A program that compares whether three numbers\n" +
            "are all the same or not");
    Scanner inputNumber = new Scanner(System.in);

    System.out.print("Input 1st number: ");
    int number1 = inputNumber.nextInt();

    System.out.print("Input 2nd number: ");
    int number2 = inputNumber.nextInt();

    System.out.print("Input 3rd number: ");
    int number3 = inputNumber.nextInt();

    System.out.println("1st number: " + number1);
    System.out.println("2nd number: " + number2);
    System.out.println("3rd number: " + number3);

    if (number1 == number2 && number1 == number3) {
      System.out.println("All the same");
    }
    else {
      System.out.println("All different");
    }
  }
}