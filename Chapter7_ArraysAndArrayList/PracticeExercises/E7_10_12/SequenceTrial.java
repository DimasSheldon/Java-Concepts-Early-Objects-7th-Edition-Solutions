package EKPL.Chapter7_ArraysAndArrayList.PracticeExercises.E7_10_12;

import java.util.Scanner;

/**
 * Created by Sheldon on 11/20/2016.
 * Check whether the sequences have the same values in the same order
 * E7.10 & E7.11
 */
public class SequenceTrial {
  public static void main(String[] args) {

    int size = 7;
    Sequence array1 = new Sequence(size);

    Scanner input = new Scanner(System.in);
    for (int i = 0; i < size; i++) {
      System.out.print("Please input value at index " + i + ": ");
      int n = input.nextInt();
      array1.set(i, n);
    }

    int[] array2 = {1, 2, 3, 4, 5, 6, 7};

    System.out.println("Same order\t: " + array1.equals(array2));
    System.out.println("Same value\t: " + array1.sameValues(array2));
    System.out.println("Permutation\t: " + array1.isPermutationOf(array2));


//    ArrayList<Integer> a = new ArrayList<>();
//    ArrayList<Integer> b = new ArrayList<>();
//    int[] a1 = {1, 2, 3, 4, 5};
//    int[] a2 = {5, 2, 3, 4, 1};
////    a.add(1);
////    a.add(2);
////    a.add(3);
////    a.add(4);
////    a.add(1);
////    b.add(1);
////    b.add(2);
////    b.add(3);
////    b.add(4);
////    b.add(4);
//    System.out.println(Arrays.equals(a1, a2));
  }
}
