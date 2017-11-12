package EKPL.Lab.November21.E6_17;

import javax.swing.*;

/**
 * Created by Sheldon on 11/21/2016.
 * This program will prompts the user to
 * convert currencies.
 * E6.17
 */
public class CurrencyConversion {
  public static void main(String[] args) {
    // Diplay opening words
    System.out.printf("%40s%n", "This program converts a currency to");
    System.out.printf("%30s%n%n", "the desired currency");

    // Create a list of units keyword
    String[] currency = {"IDR", "USD", "JPY"};
    String from = "";
    String to = "";

    // Show the prompt dialog message and do the conversion
    int unitFrom = Integer.parseInt(JOptionPane.showInputDialog("Convert from (input the option number):" +
            "\n1. Indonesian Rupiah\n2. US Dollar\n3. Japan Yen\n4. Exit"));
    while (unitFrom != 0 && unitFrom < 4) {
      int unitTo = Integer.parseInt(JOptionPane.showInputDialog("Convert to (input the option number):" +
              "\n1. Indonesian Rupiah\n2. US Dollar\n3. Japan Yen"));
      double valueToConvert = Double.parseDouble(JOptionPane.showInputDialog("Input the value to convert: "));

      double convertedValue = 0.0;
      switch (unitFrom) {
        case 1: //IDR
          from = currency[0];
          if (unitTo == 1) { //IDR
            System.out.println("Currency is the same");
            convertedValue = valueToConvert;
            to = currency[0];
          } else if (unitTo == 2) { //USD
            convertedValue = valueToConvert * 0.000074;
            to = currency[1];
          } else { //Yen
            convertedValue = valueToConvert * 0.0083;
            to = currency[3];
          }
          System.out.println("       " + from + " " + valueToConvert + " = " + to + " " + convertedValue);
          break;

        case 2: //USD
          from = currency[1];
          if (unitTo == 1) { //IDR
            convertedValue = valueToConvert * 13425.00;
            to = currency[0];
          } else if (unitTo == 2) { //USD
            System.out.println("Currency is the same");
            convertedValue = valueToConvert;
            to = currency[1];
          } else { //Yen
            convertedValue = valueToConvert * 111.09;
            to = currency[3];
          }
          System.out.println("       " + from + " " + valueToConvert + " = " + to + " " + convertedValue);
          break;

        case 3: //Yen
          from = currency[2];
          if (unitTo == 1) { //IDR
            convertedValue = valueToConvert * 120.85;
            to = currency[0];
          } else if (unitTo == 2) { //USD
            convertedValue = valueToConvert * 0.009;
            to = currency[1];
          } else { //Yen
            System.out.println("Currency is the same");
            convertedValue = valueToConvert;
          }
          System.out.println("       " + from + " " + valueToConvert + " = " + to + " " + convertedValue);
          break;

        default:
          System.out.println("       Currency is not available.");
          break;
      }
      unitFrom = Integer.parseInt(JOptionPane.showInputDialog("Convert from (input the option number):" +
              "\n1. Indonesian Rupiah\n2. US Dollar\n3. Japan Yen\n4. Exit"));
    }
  }
}
