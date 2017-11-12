package EKPL.Chapter6_Loops.Exercise.Investment;

/**
 * Created by Sheldon on 11/6/2016.
 * This program computes how long it takes for an investment
 * to double.
 */
public class InvestmentRunner {
  public static void main(String[] args) {
    final double INITIAL_BALANCE = 10000;
    final double RATE = 5.0;

    Investment invest = new Investment(INITIAL_BALANCE, RATE);
    //invest.waitForBalance(2 * INITIAL_BALANCE); //Doubled
    //invest.waitForBalance(3 * INITIAL_BALANCE); //Tripled
    invest.waitYears(15);
    int years = invest.getYears();
    double balance = invest.getBalance();
    System.out.println("The investment doubled after " + years + " years");
    System.out.println("Doubled balance: " + balance);
  }
}