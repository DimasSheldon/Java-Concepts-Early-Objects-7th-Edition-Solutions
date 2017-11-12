package EKPL.Chapter6_Loops.PracticeExercise.E6_5;

import java.util.Scanner;

/**
 * Created by Sheldon on 11/14/2016.
 * This program simulates the properties
 * of the data set.
 * E6.5
 */
public class DataSetTrial {
  public static void main(String[] args) {
    System.out.printf("%50s%n%45s%n%n", "This program determines the average, smallest,",
            "largest, and range value of a data set");
    DataSet data = new DataSet();

    System.out.println("Please input the values, enter Q to end: ");
    Scanner input = new Scanner(System.in);
    while (input.hasNextDouble()) {
      double value = input.nextDouble();
      data.addValue(value);
    }

    // Print the outputs
    System.out.println("Data set         :" + data.getDataSet());
    System.out.printf("Smallest value   : %.2f%n", data.getSmallest());
    System.out.printf("Largest value    : %.2f%n", data.getLargest());
    System.out.printf("Range            : %.2f%n", data.getRange());
    System.out.printf("Average value    : %.2f%n", data.getAverage());
  }
}