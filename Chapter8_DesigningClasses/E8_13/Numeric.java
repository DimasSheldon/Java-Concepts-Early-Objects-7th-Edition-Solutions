package EKPL.Chapter8_DesigningClasses.E8_13;

import javax.swing.*;

/**
 * Created by Sheldon on 11/26/2016.
 * A program that simulates a mathematical operations.
 * E8.13
 */
public class Numeric {
  /**
   * Calculates the power of value x by n
   * @param x the value to be operated
   * @param n the exponential value
   * @return the power of x
   */
  public static double intPower(double x, int n) {
    double xPower = 0;
    if (n < 0) {
      xPower = 1 / Math.pow(x, -n);
    } else if (n >= 0 && n % 2 == 0) {
      xPower = Math.pow(Math.pow(x, n / 2), 2);
    } else {
      xPower = Math.pow(x, n - 1) * x;
    }
    return xPower;
  }

  public static void main(String[] args) {
    JOptionPane.showMessageDialog(null, "This program calculates the power of a number\n" +
            "with given exponential value");
    double number = Double.parseDouble(JOptionPane.showInputDialog("A number to be powered:"));
    int exponent = Integer.parseInt(JOptionPane.showInputDialog("The exponential:"));
    Numeric numeric = new Numeric();
    System.out.println("Result of " + number + " powered by " + exponent + ": " + numeric.intPower(number, exponent));
  }
}
