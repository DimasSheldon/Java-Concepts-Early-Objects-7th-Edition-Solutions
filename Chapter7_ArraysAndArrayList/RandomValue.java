package EKPL.Chapter7_ArraysAndArrayList;

import java.util.Random;

/**
 * Created by Sheldon on 11/14/2016.
 * This program generates a random value of double data type and
 * adds the generated number to the array.
 */
public class RandomValue {
  public static void main(String[] args) {
    double[] d = new double[10];

    double max = 1000.0;
    double offset = 100.0;
    double range = max - offset;
    //System.out.println(range);

    for (int i = 0; i < d.length; i++) {
      Random generateNumber = new Random();
      double inRangeGenerated = generateNumber.nextDouble() * range + offset;
      d[i] = inRangeGenerated;
      System.out.printf("d%1d %5.2f%n", i, d[i]);
    }

  }
}
