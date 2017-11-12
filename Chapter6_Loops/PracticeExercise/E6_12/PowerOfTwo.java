package EKPL.Chapter6_Loops.PracticeExercise.E6_12;
// DONE
/**
 * Created by Sheldon on 11/14/2016.
 * This program generates powers of 2.
 * E6.12
 */
public class PowerOfTwo {
  public static void main(String[] args) {
    System.out.printf("%70s%n%62s%n%n", "This program prints all powers of 2",
            "from 2^0 up to 2^20");

    final double NUMBER = 2; // Number to be powered
    int count = 0;

    for (int exp = 0; exp <= 20; exp++) {
      int power = (int) Math.pow(NUMBER, exp);
      System.out.printf("  %8d", power);
      count++;
      if (count % 10 == 0) { //newline after 10 times printed
        System.out.println();
      }
    }
  }
}
