package EKPL.Chapter6_Loops.PracticeExercise.P6_1;

import java.util.Scanner;

/**
 * Created by Sheldon on 11/15/2016.
 * This program calculates the mean and
 * standard deviation values of data samples.
 * P6.1
 */

public class DataSetTrial {
  public static void main(String[] args) {
    System.out.printf("%50s%n%48s%n%n", "This program calculates the mean", "and standard deviation values");
    DataSet dataSequence = new DataSet();
    Scanner input = new Scanner(System.in);

    // Prompt the user to add the values and
    // generate the data set

    System.out.println("Input the values, enter Q to end: ");
    double value;
    while (input.hasNextDouble()) {
      value = input.nextDouble();
      dataSequence.generateDataSet(value);
    }

    // Count the summation of values
    for (int i = 0; i < dataSequence.length(); i++) {
      dataSequence.countValues(i);
      dataSequence.countSquaredData(i);
    }

    // Print the values
    //System.out.println("Data Set                   : " + dataSequence.getDataSet());
    System.out.println("Total Data                 : " + dataSequence.length());
    System.out.println("Values Summation           : " + dataSequence.get_sumData());
    System.out.println("Squared Values Sum         : " + dataSequence.getSquaredSumData());

    dataSequence.average();
    dataSequence.stdDev();

    System.out.println("Average                    : " + dataSequence.getAverage());
    System.out.println("Sample Standard Deviation  : " + dataSequence.getStdDeviation());
  }
}