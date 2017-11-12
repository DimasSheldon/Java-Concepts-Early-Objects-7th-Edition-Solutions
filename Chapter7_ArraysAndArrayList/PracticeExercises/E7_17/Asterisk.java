package EKPL.Chapter7_ArraysAndArrayList.PracticeExercises.E7_17;

/**
 * Created by Sheldon on 11/21/2016.
 * E7.17
 */
public class Asterisk {
  public static void main(String[] args) {
//    int[] values = {22, 40, -6, 30, -16, 28, 14, -4};
    int[] values = {22, 40, 2};
    String[] captions = {"Egypt", "Indonesia", "Iran"};

    boolean addSpaces = false;
    for (int element : values) {
      if (element < 0) {
        addSpaces = true;
        break;
      } else {
        addSpaces = false;
      }
    }

    if (addSpaces) {
      int smallest = values[0];
      for (int i = 0; i < values.length; i++) {
        if (values[i] <= smallest) {
          smallest = values[i];
        }
      }

      for (int element : values) {
        if (element < 0) {
          if (element > smallest) {
            for (int i = 0; i < Math.abs(element - smallest); i++) {
              System.out.print(" ");
            }
            for (int i = 0; i < Math.abs(element); i++) {
              System.out.print("*");
            }
          } else {
            for (int i = 0; i > element; i--) {
              System.out.print("*");
            }
          }
          System.out.println();
        } else {
          for (int i = 0; i < Math.abs(smallest); i++) {
            System.out.print(" ");
          }
          for (int i = 0; i < element; i++) {
            System.out.print("*");
          }
          System.out.println();
        }
      }
    } else {
      for (int element : values) {
        for (int i = 0; i < element; i++) {
          System.out.print("*");
        }
        System.out.println();
      }
    }
  }
}