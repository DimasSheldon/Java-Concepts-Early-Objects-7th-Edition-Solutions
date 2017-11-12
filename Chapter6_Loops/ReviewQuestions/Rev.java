package EKPL.Chapter6_Loops.ReviewQuestions;

/**
 * Created by Sheldon on 11/16/2016.
 */
public class Rev {
  public static void main(String[] args) {
//    int i = 0;
//    while (Math.pow(i, 2) < 100) {
//      System.out.println(Math.pow(i, 2));
//      i++;
//    }
//    int i = 1;
//    while (i < 100) {
//      if (i % 10 == 0) {
//        System.out.println(i);
//      }
//      i++;
//    }
//
//    int[] x = {0, 1, 2};
//    x.

    int count = 0;
    for (int i = -2; i <= 31; i++) {
      if(i <= 0) {
        System.out.print("  ");
      } else {
        System.out.print(i + " ");
      }
      count++;
      if (count % 7 == 0) {
        System.out.println();
      }
    }
  }
}
