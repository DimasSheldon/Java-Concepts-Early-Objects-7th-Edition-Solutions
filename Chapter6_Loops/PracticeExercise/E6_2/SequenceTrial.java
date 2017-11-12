package EKPL.Chapter6_Loops.PracticeExercise.E6_2;

import javax.swing.*;

/**
 * Created by Sheldon on 11/10/2016.
 * This program determines a sequence properties like
 * the smallest and largest value, odd and even numbers,
 * cumulative total, and adjacent duplicates.
 * E6.2
 */
public class SequenceTrial {
  public static void main(String[] args) {
    Sequence sequence = new Sequence();

    int option = 0;
    boolean exit = false;
    while (option >= 0 && option < 5 && !exit) {
      option = Integer.parseInt(JOptionPane.showInputDialog("Input the number of the option you want:\n" +
              "1. Determine the smallest and the largest number of sequence\n" +
              "2. Determine the odd and even numbers of sequence\n" +
              "3. Determine the cumulative total of sequence\n" +
              "4. Determine all adjacent duplicates\n" +
              "5. Exit"));
      switch (option) {
        case 1:
          System.out.println("   --Smallest and Largest--");
          sequence.printCommand();
          sequence.categorizeLevel();
          break;
        case 2:
          System.out.println("       --Evens and Odds--");
          sequence.printCommand();
          sequence.categorizeType();
          break;
        case 3:
          System.out.println("    --Cumulative Total--");
          sequence.printCommand();
          sequence.cumulativeTotal();
          break;
        case 4:
          System.out.println("    --Adjacent Duplicates--");
          sequence.printCommand();
          sequence.adjacentDuplicate();
          break;
        case 5:
          System.out.println("\n--Exit--\n");
          break;
        default:
          System.out.println("Option not listed");
          exit = true;
          break;
      }
    }
    System.out.println("Thank you for using this program.");
  }
}