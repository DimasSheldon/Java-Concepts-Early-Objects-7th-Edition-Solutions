package EKPL.Chapter6_Loops.Exercise.E6_1;


/**
 * Created by Sheldon on 11/8/2016.
 * E6.1
 */
public class Arithmetic {
  private int result;

  /**
   *
   */
  public Arithmetic() {
    result = 0;
  }

  /**
   * @param lowerBound
   * @param upperBound
   */
  public void sumEvens(int lowerBound, int upperBound) {
    int sum = 0;
    for (int i = lowerBound; i <= upperBound; i++) {
      if (i % 2 == 0) {
        sum = sum + i;
      }
    }
    result = sum;
  }

  /**
   * @param lowerBound
   * @param upperBound
   */
  public void sumOdds(int lowerBound, int upperBound) {
    int sum = 0;
    boolean valid = false;
    int i = lowerBound;
    while (!valid && i <= upperBound) {
      if (i % 2 == 0) {
        System.out.println("Invalid bound");
        valid = true;
      } else {
        sum = sum + i;
        System.out.println(i);
      }
      i = i + 2;
    }
    result = sum;
  }

  /**
   * @param lowerBound
   * @param upperBound
   */
  public void sumSquares(int lowerBound, int upperBound) {
    int sum = 0;
    for (int i = lowerBound; i <= upperBound; i++) {
      int squareNumber = (int) Math.pow(i, 2);
      sum = sum + squareNumber;
    }
    result = sum;
  }

  /**
   * @param number
   * @param lowerBound
   * @param upperBound
   */
  public void powerOfNumber(int number, int lowerBound, int upperBound) {
    int count = 0;
    for (int i = lowerBound; i <= upperBound; i++) {
      int powerNumber = (int) Math.pow(number, i);
      System.out.printf("%10d", powerNumber);
      count++;
      if (count % 10 == 0) {
        System.out.println();
      }
    }
    System.out.println();
  }

  /**
   * @param number
   */
  public void sumOddDigits(int number) {
    String strNumber = String.valueOf(number);
    int sum = 0;
    for (int i = 0; i < strNumber.length(); i++) {
      char c = strNumber.charAt(i);
      int digit = Character.digit(c, 10);
      if (digit % 2 != 0) {
        sum = sum + digit;
      }
    }
    result = sum;
  }

  /**
   * @return
   */
  public int getResult() {
    return result;
  }
}