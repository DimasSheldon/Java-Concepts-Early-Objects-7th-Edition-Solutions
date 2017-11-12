package EKPL.Lab.November14;

import javax.swing.*;

/**
 * Created by Sheldon on 11/14/2016.
 * This program converts a value to
 * the desired unit.
 * P5.4
 */

public class UnitConversion {
  public static void main(String[] args) {
    // Diplay opening words
    System.out.printf("%40s%n", "This program converts a value to");
    System.out.printf("%30s%n%n", "the desired unit");

    // Create a list of units keyword
    String[] units = {"km", "m", "dm", "cm"};
    String fromUnit;
    String toUnit;

    // Show the prompt dialog message and do the conversion
    int unitFrom = Integer.parseInt(JOptionPane.showInputDialog("Convert from (input the option number):" +
            "\n1. Kilometer\n2. Meter\n3. Decimeter\n4. Centimeter\n5. Exit"));
    while (unitFrom != 0 && unitFrom < 5) {
      int unitTo = Integer.parseInt(JOptionPane.showInputDialog("Convert to (input the option number):" +
              "\n1. Kilometer\n2. Meter\n3. Decimeter\n4. Centimeter"));
      double valueToConvert = Double.parseDouble(JOptionPane.showInputDialog("Input the value to convert: "));

      double convertedValue = 0.0;
      switch (unitFrom) {
        case 1:
          fromUnit = units[0];
          if (unitTo == 1) {
            System.out.println("Unit conversion is the same");
            convertedValue = valueToConvert;
            toUnit = units[0];
          } else if (unitTo == 2) {
            convertedValue = valueToConvert * 1000.0;
            toUnit = units[1];
          } else if (unitTo == 3) {
            convertedValue = valueToConvert * 10000.0;
            toUnit = units[2];
          } else {
            convertedValue = valueToConvert * 100000.0;
            toUnit = units[3];
          }
          System.out.println("       " + valueToConvert + fromUnit + " = " + convertedValue + toUnit);
          break;

        case 2:
          fromUnit = units[1];
          if (unitTo == 1) {
            convertedValue = valueToConvert * 0.001;
            toUnit = units[0];
          } else if (unitTo == 2) {
            System.out.println("Unit conversion is the same");
            convertedValue = valueToConvert;
            toUnit = units[1];
          } else if (unitTo == 3) {
            convertedValue = valueToConvert * 10.0;
            toUnit = units[2];
          } else {
            convertedValue = valueToConvert * 100.0;
            toUnit = units[3];
          }
          System.out.println("        " + valueToConvert + fromUnit + " = " + convertedValue + toUnit);
          break;

        case 3:
          fromUnit = units[2];
          if (unitTo == 1) {
            convertedValue = valueToConvert * 0.0001;
            toUnit = units[0];
          } else if (unitTo == 2) {
            convertedValue = valueToConvert * 0.1;
            toUnit = units[1];
          } else if (unitTo == 3) {
            System.out.println("Unit conversion is the same");
            convertedValue = valueToConvert;
            toUnit = units[2];
          } else {
            convertedValue = valueToConvert * 10;
            toUnit = units[3];
          }
          System.out.println("       " + valueToConvert + fromUnit + " = " + convertedValue + toUnit);
          break;

        case 4:
          fromUnit = units[3];
          if (unitTo == 1) {
            convertedValue = valueToConvert * 0.00001;
            toUnit = units[0];
          } else if (unitTo == 2) {
            convertedValue = valueToConvert * 0.01;
            toUnit = units[1];
          } else if (unitTo == 3) {
            convertedValue = valueToConvert * 0.1;
            toUnit = units[2];
          } else {
            System.out.println("Unit conversion is the same");
            convertedValue = valueToConvert;
            toUnit = units[3];
          }
          System.out.println("       " + valueToConvert + fromUnit + " = " + convertedValue + toUnit);
          break;

        default:
          System.out.println("       Unit conversion is not available.");
          break;
      }
      unitFrom = Integer.parseInt(JOptionPane.showInputDialog("Convert from (input the option number):" +
              "\n1. Kilometer\n2. Meter\n3. Decimeter\n4. Centimeter\n5. Exit"));
    }
  }
}