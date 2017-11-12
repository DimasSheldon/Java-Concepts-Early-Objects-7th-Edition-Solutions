package EKPL.Chapter7_ArraysAndArrayList.PracticeExercises.E7_13;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Sheldon on 11/21/2016.
 * This program generates random sequence and stores it
 * into an array.
 * E7.13
 */
public class RandomSequence {
  public static void main(String[] args) {
    Random random = new Random();
    int upperBound = 100;

    int size = 20;
    int[] randomSequence = new int[size];

    for (int i = 0; i < size; i++) {
      int randomGenerated = random.nextInt(upperBound);
      randomSequence[i] = randomGenerated;
    }

    Arrays.sort(randomSequence);
    System.out.println(Arrays.toString(randomSequence));
  }
}
