package EKPL.Chapter6_Loops.Failed;

import java.util.Scanner;

/**
 * Created by Sheldon on 11/15/2016.
 * PrimeGenerator Factorization
 * P6.3
 */
public class FactorPrinter {
  public static void main(String[] args) {
    System.out.printf("%50s", "Please input an integer number to factorize: ");
    Scanner input = new Scanner(System.in);
    int numberToFactor = input.nextInt();

    FactorGenerator factorer = new FactorGenerator(numberToFactor);
    factorer.factorize();
  }
}
