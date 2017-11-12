package EKPL.Chapter6_Loops.Exercise.Table;

/**
 * Created by Sheldon on 11/8/2016.
 * This program prints a table of power of x.
 */
public class PowerTable {
  public static void main(String[] args) {
    final int NMAX = 5;
    final double XMAX = 10;

    //Print table header
    for (int n = 0; n <= NMAX; n++) {
      System.out.printf("%10d", n);
    }
    System.out.println();
    for (int n = 0; n <= NMAX; n++) {
      System.out.printf("%10s", "x ");
    }
    System.out.println();

    //Print the body

    for (double x = 1; x <= XMAX; x++) {
      //Print table row
      for (int n = 0; n <= NMAX; n++) {
        System.out.printf("%10.0f", Math.pow(x, n));
      }
      System.out.println();
    }
  }
}