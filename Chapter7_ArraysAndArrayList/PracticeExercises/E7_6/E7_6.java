package EKPL.Chapter7_ArraysAndArrayList.PracticeExercises.E7_6;

/**
 * Created by Sheldon on 11/18/2016.
 *
 */
// Expected: 1 – 4 + 9 – 16 + 9 – 7 + 4 – 9 + 11 = –2
public class E7_6 {
  public static void main(String[] args) {
    int[] num = {1, 4, 9, 16, 9, 7, 4, 9, 11};
    int sum = 0;

    for (int i = 0; i < num.length; i++) {
      if (i % 2 == 0) { // i is even
        sum = sum + num[i];
      } else { // i is odd
        sum = sum - num[i];
      }
    }
    System.out.println(sum);
  }
}