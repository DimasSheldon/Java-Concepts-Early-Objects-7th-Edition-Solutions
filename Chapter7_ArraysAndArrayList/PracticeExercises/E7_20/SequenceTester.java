package EKPL.Chapter7_ArraysAndArrayList.PracticeExercises.E7_20;

import java.util.ArrayList;

/**
 * Created by Sheldon on 11/21/2016.
 * E7.20-E7.22
 */
public class SequenceTester {
  public static void main(String[] args) {
    Sequence a = new Sequence();
    a.add(1);
    a.add(4);
    a.add(9);
    a.add(16);
    a.add(2);
    a.add(3);
    a.add(11);

    ArrayList<Integer> b = new ArrayList<>();
    b.add(9);
    b.add(7);
    b.add(4);
    b.add(9);
    b.add(11);

    System.out.println(a);
    System.out.println(b);
    System.out.println(a.append(b));
    System.out.println(a.merge(b));
    System.out.println(a.sortMergedArray());
  }
}