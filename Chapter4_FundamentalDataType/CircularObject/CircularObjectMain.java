package EKPL.Chapter4_FundamentalDataType.CircularObject;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Sheldon on 10/31/2016.
 * E4.7
 * A program that simulates the calculation of circular object
 * properties by radius prompted
 * Sketches the shape of circular object
 */
public class CircularObjectMain {
  public static void main(String[] args) {

    // Prompt the user to input the radius
    String inputRadius = JOptionPane.showInputDialog("Set the object's radius (units)");
    double radius = Double.parseDouble(inputRadius);
    System.out.printf("Circular object radius %13s%,14.2f%6s%n", "(r) =", radius, "units");

    // Construct the circular object
    CircularObject theCircularObject = new CircularObject(radius);

    // Calculate the circular object properties
    theCircularObject.calculateCircumference();
    theCircularObject.calculateArea();
    theCircularObject.calculateSurfaceArea();
    theCircularObject.calculateVolume();

    double circumference = theCircularObject.getCircumference();
    double area = theCircularObject.getArea();
    double surfaceArea = theCircularObject.getSurfaceArea();
    double volume = theCircularObject.getVolume();

    // Display the results
    System.out.printf("Circular object circumference %6s%,14.2f%6s%n", "(C) =", circumference, "units");
    System.out.printf("Circular object area %15s%,14.2f%13s%n", "(A) =", area, "square units");
    System.out.printf("Circular object surface area %7s%,14.2f%13s%n", "(A) =", surfaceArea, "square units");
    System.out.printf("Circular object volume %13s%,14.2f%11s%n", "(V) =", volume, "cube units");

    // Display the sketch in a new window
    JFrame theFrame = new JFrame();
    theFrame.setSize(600, 400);
    theFrame.getContentPane().setBackground(Color.WHITE);
    theFrame.setTitle("Circular Object");
    theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    theFrame.setVisible(true);
    theFrame.add(theCircularObject);
  }
}