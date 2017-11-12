package EKPL.Chapter6_Loops.Exercise.Sentinel;

import java.util.Scanner;

/**
 * Created by Sheldon on 11/6/2016.
 * This program prints the average of salary values that are terminated with a sentinel
 */
public class SentinelDemo {
  public static void main(String[] args) {
    double sum = 0;
    int count = 0;
    double salary = 0;
    System.out.print("Enter salaries, -1 to finish: ");
    Scanner in = new Scanner(System.in);

    // Process data until the sentinel is entered

    while (salary != -1) {
      salary = in.nextDouble();
      if (salary != -1) {
        sum = sum + salary;
        count++;
      }
    }

    //Compute and print the average
    if (count > 0) {
      double average = sum / count;
      System.out.println("Average salary: " + average);
    } else {
      System.out.println("No data");
    }
  }
}