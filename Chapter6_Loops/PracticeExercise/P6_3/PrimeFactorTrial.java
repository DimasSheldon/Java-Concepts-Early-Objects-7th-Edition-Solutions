package EKPL.Chapter6_Loops.PracticeExercise.P6_3;

import java.util.Scanner;

/**
 * Created by Sheldon on 11/15/2016.
 * This program simulates the prime
 * factorization of a number.
 * P6.3
 */
public class PrimeFactorTrial {
  public static void main(String[] args) {
    // Display opening messages
    System.out.printf("%45s%n%30s%n", "This program generates the prime factors", "of a number");
    System.out.printf("%45s%n%n", "----------------------------------------");

    // Prompt the user to input the number to factor
    System.out.printf("%38s", "Please input a number to factor: ");
    Scanner input = new Scanner(System.in);

    // Construct the factor object with given number and
    // factorize the number
    PrimeFactorGenerator factor = new PrimeFactorGenerator(input.nextInt());
    factor.factorize();

    factor.printFactors();
  }
}
