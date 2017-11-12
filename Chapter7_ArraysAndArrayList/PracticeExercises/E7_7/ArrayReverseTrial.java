package EKPL.Chapter7_ArraysAndArrayList.PracticeExercises.E7_7;

/**
 * Created by Sheldon on 11/20/2016.
 * This program simulates the method to
 * reverse the array sequence.
 * E7.7
 */
public class ArrayReverseTrial {
  public static void main(String[] args) {
    ArrayReverse array = new ArrayReverse(5);
    array.setValues();
    array.reverse();
    System.out.println(array.getArray());


    for (int i = 0; i < 5; i++) {
      System.out.print(array.getArrayVal(i) + " ");
    }
  }
}
