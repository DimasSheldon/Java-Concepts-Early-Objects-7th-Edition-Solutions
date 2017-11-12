package EKPL.Chapter7_ArraysAndArrayList.PracticeExercises.E7_7;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Sheldon on 11/18/2016.
 * This program will reverses an array by calling
 * the reverse method.
 * E7.7
 */
public class ArrayReverse {
  private int[] array;
  private int _size;

  /**
   * Construct an array with given size
   * @param size the size of array
   */
  public ArrayReverse(int size) {
    _size = size;
    array = new int[_size];
  }

  /**
   *
   */
  public void setValues() {
    System.out.println("Please input the values for array with size of " + _size);
    Scanner input = new Scanner(System.in);
    for (int i = 0; i < _size; i++) {
      System.out.print("Set value at index " + i + ": ");
      array[i] = input.nextInt();
    }
  }

  /**
   *
   */
  public void reverse() {
    int[] temporary = Arrays.copyOf(array, _size);
    int j = _size - 1;
    for (int i = 0; i < _size; i++) {
      array[i] = temporary[j];
      j--;
    }
  }

  /**
   *
   * @return
   */
  public int[] getArray() {
    return array;
  }

  /**
   *
   * @param i
   * @return
   */
  public int getArrayVal(int i) {
    return array[i];
  }
}