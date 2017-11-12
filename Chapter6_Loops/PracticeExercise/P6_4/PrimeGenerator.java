package EKPL.Chapter6_Loops.PracticeExercise.P6_4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Sheldon on 11/15/2016.
 * This program generates the prime numbers
 * up to bound given.
 * P6.4
 */
public class PrimeGenerator {
  private ArrayList<Integer> primes;
  private int _bound;

  /**
   * Constructs the object of prime number generator
   * @param bound the maximum bound to generate primes
   */
  public PrimeGenerator(int bound) {
    _bound = bound;
  }

  /**
   * Generate all prime numbers
   */
  public void generatePrimes() {
    primes = new ArrayList<>();
    // primes is started from 2, 0 and 1 isn't considered as prime number
    final int MIN_BOUND = 2;

    for (int num = MIN_BOUND; num <= _bound; num++) {
      primes.add(num);                      // add all numbers to the list

      boolean isPrime = true;
      int divider = 2;
      while (isPrime && divider < num) {
        // filter the list of numbers
        if (num % divider == 0) {             // number is not prime, then
          primes.remove(primes.indexOf(num)); // remove from list
          isPrime = false;
        } else {          // check whether the number can be divided by
          divider++;      // another number than itself
        }
      }
    }
  }

  /**
   * Prints the primes
   */
  public void printPrimes() {
    int count = 0;
    for (int i = 0; i < primes.size(); i++) {
      System.out.printf(" %5d", primes.get(i));
      count++;
      if (count % 10 == 0) {   // To avoid printing in just one line
        System.out.println();
      }
    }
  }

  public static void main(String[] args) {
    System.out.printf("%53s%n%38s%n%n", "This program generates all the prime numbers",
            "up to given bound");

    System.out.printf("%50s", "Please input the upper bound to generate primes: ");
    Scanner input = new Scanner(System.in);
    int upperBound = input.nextInt();

    PrimeGenerator generator = new PrimeGenerator(upperBound);
    generator.generatePrimes();

    System.out.printf(" %s %d:%n%n", "Primes up to", upperBound);
    generator.printPrimes();
  }
}