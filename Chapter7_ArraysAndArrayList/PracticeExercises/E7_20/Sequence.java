package EKPL.Chapter7_ArraysAndArrayList.PracticeExercises.E7_20;

import java.util.ArrayList;

/**
 * Created by Sheldon on 11/21/2016.
 * E7.20-E7.22
 */
public class Sequence {
  private ArrayList<Integer> values;
  private ArrayList<Integer> mergedArray;

  /**
   *
   */
  public Sequence() {
    values = new ArrayList<Integer>();
  }

  /**
   *
   * @param n
   */
  public void add(int n) {
    values.add(n);
  }

  /**
   *
   * @param other
   * @return
   */
  public ArrayList append(ArrayList<Integer> other) {
    ArrayList<Integer> appendedArray = new ArrayList<>(values);

    for (int element : other) {
      appendedArray.add(element);
    }

    return appendedArray;
  }

  /**
   *
   * @param other
   * @return
   */
  public ArrayList merge(ArrayList<Integer> other) {
    mergedArray = new ArrayList<>();

    int bound;
    if (values.size() >= other.size()) {
      bound = values.size();
    } else {
      bound = other.size();
    }

    for (int i = 0; i < bound; i++) {
      if (i < values.size()) {
        mergedArray.add(values.get(i));
      }
      if (i < other.size()) {
        mergedArray.add(other.get(i));
      }
    }

    return mergedArray;
  }

  /**
   *
   * @return
   */
  public ArrayList sortMergedArray() {
    ArrayList<Integer> mergedSorted = new ArrayList<>(mergedArray);

    mergedSorted.sort(null);
    return mergedSorted;
  }

  /**
   *
   * @return
   */
  public String toString() {
    return values.toString();
  }
}
