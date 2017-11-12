package EKPL.Chapter6_Loops.PracticeExercise.P6_3;

import java.util.ArrayList;

/**
 * Created by Sheldon on 11/15/2016.
 * This program builds the functions
 * to generates prime factors of number.
 * P6.3
 */
public class PrimeFactorGenerator {
  private int _numberToFactorize;
  private ArrayList<Integer> factors;

  /**
   * Constructs an object of factor generator
   * @param number the integer value to be factorize
   */
  public PrimeFactorGenerator(int number) {
    _numberToFactorize = number;
  }

  /**
   * Do the factorization
   */
  public void factorize() {
    factors = new ArrayList<>(); // A list to store the factors
    int divider = 2; // Start factoring by dividing the number by two first
    while (divider <= _numberToFactorize) {
      while (_numberToFactorize % divider == 0) {  // the divider is the factors
        factors.add(divider);                     // add to the factors list
        _numberToFactorize = _numberToFactorize / divider; // store the remaining number to factorize
      }
      divider++;
    }
  }

  /**
   * Prints the factors of the number
   */
  public void printFactors() {
    // Check whether the number to factorize is a prime or doesn't has factors
    if (factors.size() > 1) {
      System.out.printf("%27s%13s%n", "The prime factors are ", factors);
    } else if (factors.size() == 1) {
      System.out.printf("%34s%n", "---Number is a prime---");
    } else {
      System.out.printf("%6d %s%n", _numberToFactorize, "has no factors---");
    }
  }

  /**
   * Get the list of factors of the number
   * @return the factors list
   */
  public ArrayList<Integer> getFactors() {
    return factors;
  }
}