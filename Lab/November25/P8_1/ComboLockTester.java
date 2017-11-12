package EKPL.Lab.November25.P8_1;

import javax.swing.*;

/**
 * Created by Sheldon on 11/25/2016.
 */
public class ComboLockTester {
  public static void main(String[] args) {
    // Input
    JOptionPane.showMessageDialog(null, "Please input the default combination for you lock.");
    boolean reset = false;

      int num1 = Integer.parseInt(JOptionPane.showInputDialog("Input the first number of combination: "));
      while (num1 < 0 || num1 > 39) {
        JOptionPane.showMessageDialog(null, "Sorry, number is bounded from 0 to 39");
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Input the first number of combination: "));
      }

      int num2 = Integer.parseInt(JOptionPane.showInputDialog("Input the second number of combination:"));
      while (num2 < 0 || num2 > 39) {
        JOptionPane.showMessageDialog(null, "Sorry, number is bounded from 0 to 39");
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Input the first number of combination: "));
      }

      int num3 = Integer.parseInt(JOptionPane.showInputDialog("Input the third number of combination:"));
      while (num3 < 0 || num3 > 39) {
        JOptionPane.showMessageDialog(null, "Sorry, number is bounded from 0 to 39");
        num3 = Integer.parseInt(JOptionPane.showInputDialog("Input the first number of combination: "));
      }

    String[] count = {"1st", "2nd", "3rd"};

    ComboLock lock = new ComboLock(num1, num2, num3);

    String confirmOpen = JOptionPane.showInputDialog("Do you want to open the lock? (Y/N)");
    if (confirmOpen.equals("Y") || confirmOpen.equals("y")) {
      for (int i = 0; i < 3; i++) {
        int turn = Integer.parseInt(JOptionPane.showInputDialog("Which way dou you want to turn your lock(for " + count[i] + " number):\n" +
                "1.Turn Left\n2.Turn Right"));
        if (turn == 1) {
          int ticks = Integer.parseInt(JOptionPane.showInputDialog("How many ticks to the left?"));
          lock.turnLeft(ticks);
        } else {
          int ticks = Integer.parseInt(JOptionPane.showInputDialog("How many ticks to the right?"));
          lock.turnRight(ticks);
        }
      }
      if (lock.open() == true) {
        System.out.println("It works!. Your lock is opened.");
      } else {
        System.out.println("Sorry, you do it wrong. Lock is still locked.");
      }
    }
  }
}