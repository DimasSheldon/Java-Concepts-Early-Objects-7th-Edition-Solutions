package EKPL.Chapter7_ArraysAndArrayList.PracticeExercises.E7_10_12;

import java.util.ArrayList;

/**
 * Created by Sheldon on 11/18/2016.
 * Check whether the sequences have the same values in the same order
 * E7.10 E7.11 E7.12
 */
public class Sequence {
  private int[] values;
  private ArrayList<Integer> _values;
  private boolean equals;

  public Sequence() {
    _values = new ArrayList<>();
  }

  public Sequence(int size) {
    values = new int[size];
  }

  /**
   * Set the value n to the array at index i
   *
   * @param i     the index
   * @param value the value
   */
  public void set(int i, int value) {
    values[i] = value;
  }

  /**
   * @param value the
   */
  public void set(int value) {
    _values.add(value);
  }

  public boolean equals(int[] other) {
    if (values.length != other.length) {
      equals = false;
    } else {
      for (int i = 0; i < values.length; i++) {
        if (values[i] != other[i]) {
          equals = false;
          break;
        } else {
          equals = true;
        }
      }
    }
    return equals;
  }

  public boolean equals(ArrayList other) {
    equals = _values.equals(other);
    return equals;
  }

  public boolean sameValues(int[] other) {
    boolean sameValue = true;

    outerloop:
    // Tag as the outerloop
    for (int i = 0; i < values.length; i++) {
      int count = 0;
      for (int j = 0; j < other.length; j++) {
        if (values[i] != other[j]) {
          count++;
          if (count == other.length) {
            sameValue = false;
            break outerloop;
          } else {
            sameValue = true;
          }
        }
      }
    }
    // Jump here if different value found
    return sameValue;
  }

  //  1 4 9 16 9 7 4 9 11
  //  is a permutation of
  //  11 1 4 9 16 9 7 4 9
  //  is not a permutation of
  //  11 11 7 9 16 4 1 4 9
  public boolean isPermutationOf(int[] other) {
    boolean isPermutation;

    if (equals == true) {
      isPermutation = true;
    } else {
      isPermutation = false;
    }

    return isPermutation;
  }
}