package EKPL.Chapter4_FundamentalDataType.PlainString;

import javax.swing.*;

/**
 * Created by Sheldon on 11/2/2016.
 */
public class PlainStringBasic {
  public static void main(String[] args) {
    String theInput = JOptionPane.showInputDialog("Please input an integer between 1,000 - 999,999:");
    int inputLength = theInput.length();

    String firstExtract = theInput.substring(0, inputLength - 4);
    String secondExtract = theInput.substring(inputLength - 3, inputLength);

    System.out.println(inputLength);
    System.out.println(firstExtract);
    System.out.println(secondExtract);
  }
}
