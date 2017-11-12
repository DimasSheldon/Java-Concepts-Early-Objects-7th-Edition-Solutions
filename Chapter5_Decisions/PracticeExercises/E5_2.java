package EKPL.Chapter5_Decisions.PracticeExercises;

import java.util.Scanner;

/**
 * Created by Sheldon on 11/5/2016.
 * A program that reads a floating-point number and prints
 * "zero" if the number is zero, "positive" or "negative" otherwise;
 * "small" if abs. value of the number less than 1
 * "large" if it exceeds 1,000,000.
 */

public class E5_2 {
  public static void main(String[] args) {
    final double EPSILON = 1E-14;
    double comparison = 0.0;
    System.out.print("Please input a floating-number: ");
    Scanner floatingNumber = new Scanner(System.in);
    if (floatingNumber.hasNextDouble()) {
      double number = floatingNumber.nextDouble();
      if (number > 0) {
        if (number < 1) {
          System.out.println("It is a small positive number");
        } else if (number > 1000000) {
          System.out.println("It is a large number");
        } else {
          System.out.println("It is a positive number");
        }
      } else if (number < 0) {
        if (Math.abs(number) < 1) {
          System.out.println("It is a small negative number");
        } else if (Math.abs(number) > 1000000) {
          System.out.println("It is a large negative number");
        } else {
          System.out.println("It is a negative number");
        }
      } else {
        System.out.println("It is a zero");
      }
    } else {
      System.out.println("Invalid input");
    }
  }
}

//    double a = 1.0000000000001;
//    double b = 0.0000000000001;
//    double c = a - b;
//    System.out.println(c);
//    System.out.println(c - 1.0);
//    System.out.println(Math.abs(c-1.0));
//    System.out.println(Math.abs(c-1.0) < 0.1);

//if (floatingNumber.hasNextDouble()) {
//        double number = floatingNumber.nextDouble();
//        if (Math.abs(number - comparison) <= EPSILON) {
//        System.out.println(Math.abs(number - comparison));
//        System.out.println("0 or small number");
//        } else {
//        System.out.println("Greater than 0");
//        }
//        } else {
//        System.out.println("Invalid Input");
//        }