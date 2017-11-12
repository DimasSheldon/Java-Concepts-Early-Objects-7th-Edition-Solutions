package EKPL.Chapter6_Loops.Exercise.E6_1;

/**
 * Created by Sheldon on 11/8/2016.
 * E6.1
 */
public class ArithmeticSimulator {
  public static void main(String[] args) {
    Arithmetic a = new Arithmetic();

    // a
    a.sumEvens(2, 100);
    System.out.println(a.getResult());

    // b
    a.sumSquares(1, 100);
    System.out.println(a.getResult());

    // c
    a.powerOfNumber(2, 0, 20);

    // d
    a.sumOdds(1, 10);
    System.out.println(a.getResult());

    // e
    a.sumOddDigits(32677);
    System.out.println(a.getResult());
  }
}