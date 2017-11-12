package EKPL.Chapter4_FundamentalDataType.DepositGrowth;

import javax.swing.*;
import java.text.DecimalFormat;

/**
 * Created by Sheldon on 11/2/2016.
 * A program that simulates the growth of deposit balance
 */
public class DepositGrowthSimulator {
  private double balance;
  private double rate;

  /**
   * Construct the account object
   *
   * @param initialBalance the initial balance
   * @param annualRate     the annual interest rate
   */
  public DepositGrowthSimulator(double initialBalance, double annualRate) {
    balance = initialBalance;
    rate = annualRate;
  }

  /**
   * Calculate the balance growth
   */
  public void simulateGrowth() {
    final double MONTHLY_RATE = (rate / 12.0) / 100.0;
    balance = balance + (balance * MONTHLY_RATE);
  }

  /**
   * Get the current balance
   *
   * @return the balance
   */
  public double getBalance() {
    return balance;
  }


  public static void main(String[] args) {
    //Prompt the user to input data
    System.out.printf("%45s%n%n", "A program that simulates deposit growth");
    double initialBalance = Double.parseDouble(JOptionPane.showInputDialog("Please input" +
            " your account inital balance ($):"));
    double annualRate = Double.parseDouble(JOptionPane.showInputDialog("Please input" +
            " the annual interest rate (%)"));
    int nMonth = Integer.parseInt(JOptionPane.showInputDialog("Please input time period of months"));

    //Construct the account object to simulate
    DepositGrowthSimulator myAccount = new DepositGrowthSimulator(initialBalance, annualRate);

    //Display tha simulation result
    System.out.printf("%29s%5s%.2f%n", "Your account balance", ": $", initialBalance);
    System.out.printf("%29s%4s%.1f%s%n", "Annual interest rate", ": ", annualRate, "%");

    //Simulate the balance growth in specified period of time
    for (int i = 0; i < nMonth; i++) {
      myAccount.simulateGrowth();
      double balance = Double.parseDouble(new DecimalFormat(".##").format(myAccount.getBalance()));
      System.out.printf("%20s%s%13s%,.2f%n", "After month", (i + 1), ": $", balance);
    }
  }
}