package EKPL.Chapter4_FundamentalDataType.PlainString;

import javax.swing.*;

/**
 * Created by Sheldon on 11/1/2016.
 * E4.12
 * A program that extracts the numbers without comma(,)
 */
public class PlainString {
  public static void main(String[] args) {
    System.out.printf("%60s%n%n", "A program that extracts the numbers without comma(,)");
    //Prompt the user to input a number
    String theInput = JOptionPane.showInputDialog("Please input an integer between 1,000 - 999,999:");
    int inputLength = theInput.length();

    //Extract the numbers by elliminating the ','
    String firstExtract = theInput.substring(0, theInput.indexOf(","));
    String secondExtract = theInput.substring(theInput.indexOf(",") + 1, inputLength);
    String extractedInput = firstExtract + secondExtract;

    //Display the result
    System.out.printf("%35s%5s%10s%n", "User's input integer", ": ", theInput);
    System.out.printf("%32s%8s%10s%n", "Extracted integer", ": ", extractedInput);
  }
}
