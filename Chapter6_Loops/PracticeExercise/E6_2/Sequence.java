package EKPL.Chapter6_Loops.PracticeExercise.E6_2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Sheldon on 11/9/2016.
 * This program builds the functions of
 * sequence properties.
 * E6.2
 */
public class Sequence {
  private Scanner input;

  /**
   * Construct the data sequence object
   */
  public Sequence() {
  }

  /**
   * Determines the largest and smallest value of data sequence
   */
  public void categorizeLevel() {
    input = new Scanner(System.in);
    ArrayList<Double> numberList = new ArrayList<>();
    double inNumber;
    while (input.hasNextDouble()) {
      inNumber = input.nextDouble();
      numberList.add(inNumber);
    }
    if (numberList.size() <= 1) {
      System.out.println("Can not determine smallest and largest value");
      System.out.println("     At least two data must be given\n");
    } else {
      numberList.sort(null);
      double smallest = numberList.get(0);
      double largest = numberList.get(numberList.size() - 1);

      System.out.println();
      System.out.printf("Smallest   : %5s%n", smallest);
      System.out.printf("Largest    : %5s%n", largest);
      System.out.println();
    }

  }

  /**
   * Determines the type of values in data sequence,
   * whether is odd or even
   */
  public void categorizeType() {
    input = new Scanner(System.in);

    ArrayList<Integer> evenList = new ArrayList<>();
    ArrayList<Integer> oddList = new ArrayList<>();
    int number;
    while (input.hasNextInt()) {
      number = input.nextInt();
      if (number % 2 == 0) { //number is even
        evenList.add(number);
      } else {               //number is odd
        oddList.add(number);
      }
    }

    System.out.println("Even numbers    :");
    if (evenList.size() == 0) {
      System.out.println("No even numbers");
    } else {
      for (int j = 0; j < evenList.size(); j++) {
        System.out.printf(" %5d", evenList.get(j));
      }
    }
    System.out.println();

    System.out.println("Odd numbers     :");
    if (oddList.size() == 0) {
      System.out.println("No odd numbers");
    } else {
      for (int k = 0; k < oddList.size(); k++) {
        System.out.printf(" %5d", oddList.get(k));
      }
      System.out.println();
    }
    System.out.println("\n");
  }

  /**
   * Calculates the cumulative total of data sequence
   */
  public void cumulativeTotal() {
    input = new Scanner(System.in);
    ArrayList<Integer> cumulativeList = new ArrayList<>();
    int number;
    int sum = 0;
    while (input.hasNextInt()) {
      number = input.nextInt();
      sum = sum + number;
      cumulativeList.add(sum);
    }

    System.out.println("Cumulative total of inputs:");
    if (cumulativeList.size() <= 1) {
      System.out.println("Can not determine cumulative total value");
      System.out.println("   At least two data must be given\n");
    } else {
      for (int i = 0; i < cumulativeList.size(); i++) {
        System.out.printf(" %5d", cumulativeList.get(i));
      }
      System.out.println("\n");
    }
  }

  /**
   * Determines whether the data sequence has adjacent duplicate values
   */
  public void adjacentDuplicate() {
    input = new Scanner(System.in);
    ArrayList<Double> adjacentList = new ArrayList<>();
    adjacentList.add(0.0);

    final double EPSILON = 1E-14;
    double in = 0;
    if (input.hasNextDouble()) {
      in = input.nextDouble();
    }
    while (input.hasNextDouble()) {
      double previous = in;
      in = input.nextDouble();
      if (in == previous &&
              !(Math.abs(in - adjacentList.get(adjacentList.size() - 1)) <= EPSILON)) {
        adjacentList.add(in);
      }
    }
    adjacentList.remove(0);
    if (adjacentList.size() == 0) {
      System.out.println("   Can not determine adjacent values");
      System.out.println("!-All values are different each other-");
      System.out.println("!--At least two data must be given--");
    } else {
      System.out.println("Adjacent duplicates of inputs:");
      for (int i = 0; i < adjacentList.size(); i++) {
        System.out.printf(" %5s", adjacentList.get(i));
      }
    }
    System.out.println("\n");
  }

  /**
   * Prints a message to prompt the user for data input
   */
  public void printCommand() {
    System.out.println("Please input sequence of number,\nenter Q to quit and process: ");
  }
}