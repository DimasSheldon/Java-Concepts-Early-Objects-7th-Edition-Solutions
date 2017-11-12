package EKPL.Chapter6_Loops.PracticeExercise.E6_6;

import java.util.Scanner;
// DONE
/**
 * Created by Sheldon on 11/14/2016.
 * This program determines the minimum value
 * of a sequence.
 * E6.6
 */

public class MinimumValue {
  public static void main(String[] args) {
    System.out.println("Input sequence of number, enter Q to end: ");
    Scanner input = new Scanner(System.in);

    boolean first = true;
    double minimum = 0.0;
    double current;
    while (input.hasNextDouble()) {
      current = input.nextDouble();
      if (first == true) {
        minimum = current;
        first = false;
      } else if (current < minimum) {
        minimum = current;
      }
    }
    System.out.println("The minimum number is " + minimum);
  }
}
