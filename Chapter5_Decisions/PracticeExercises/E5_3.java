package EKPL.Chapter5_Decisions.PracticeExercises;

import javax.swing.*;

/**
 * Created by Sheldon on 11/6/2016.
 */
//1
//10
//100
//1000
//10000
//100000
//1000000
//10000000
//100000000
//1000000000
//10000000000


public class E5_3 {
  public static void main(String[] args) {
    String inputNumber = JOptionPane.showInputDialog("Please input an integer: ");
    int digits = inputNumber.length();
    System.out.println("Integer: " + inputNumber);
    System.out.println("It has " + digits + " digits of number.");

//    System.out.print("Please input an integer number: ");
//    Scanner inputInteger = new Scanner(System.in);
//    if (inputInteger.hasNextInt()) {
//      int number = inputInteger.nextInt();
//      System.out.println("Integer number: " + number);
//      number = Math.abs(number);
//
//      if (number >= 0 && number < 10) {
//        System.out.println("It has a digit of number");
//      } else if (number >= 10 && number < 100) {
//        System.out.println("It has 2 digits of number");
//      } else if (number >= 100 && number < 1000) {
//        System.out.println("It has 3 digits of number");
//      } else if (number >= 1000 && number < 10000) {
//        System.out.println("It has 4 digits of number");
//      } else if (number >= 10000 && number < 100000) {
//        System.out.println("It has 5 digits of number");
//      } else if (number >= 100000 && number < 1000000) {
//        System.out.println("It has 6 digits of number");
//      } else if (number >= 1000000 && number < 10000000) {
//        System.out.println("It has 7 digits of number");
//      } else if (number >= 10000000 && number < 100000000) {
//        System.out.println("It has 8 digits of number");
//      } else if (number >= 100000000 && number < 1000000000) {
//        System.out.println("It has 9 digits of number");
//      } else {
//        System.out.println("Out of Range");
//      }
//    } else {
//      System.out.println("Invalid Input");
//    }
  }
}
