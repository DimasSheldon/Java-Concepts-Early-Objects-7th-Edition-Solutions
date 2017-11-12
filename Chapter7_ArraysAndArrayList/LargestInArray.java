package EKPL.Chapter7_ArraysAndArrayList;

import java.util.Scanner;

/**
 * Created by Sheldon on 11/14/2016.
 * This program reads a sequence of values and print them, marking the
 * largest value.
 */
public class LargestInArray {
  public static void main(String[] args) {
    final int LENGTH = 100;
    double[] values = new double[LENGTH];
    int currentSize = 0;

    //Read inputs
    System.out.println("Please enter values, Q to exit");
    Scanner in = new Scanner(System.in);
    while (in.hasNextDouble() && currentSize < values.length) {
      values[currentSize] = in.nextDouble();
      currentSize++;
    }

    //Find the largest value

    double largest = values[0];
    for (int i = 1; i < currentSize; i++) {
      if (values[i] > largest) {
        largest = values[i];
      }
    }

    //Print all values, marking the largest
    for (int i = 0; i < currentSize; i++) {
      System.out.print(values[i]);
      if (values[i] == largest) {
        System.out.print(" <== largest value");
      }
      System.out.println();
    }
  }
}