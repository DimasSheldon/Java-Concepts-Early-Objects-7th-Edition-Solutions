package EKPL.Chapter4_FundamentalDataType.Triangle;

import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;

/**
 * Created by Sheldon on 11/1/2016.
 */
public class TriangleTester {
  public static void main(String[] args) {
    //Display opening string
    String str1 = "A program that calculates triangle properties";
    String str2 = "with given points";
    System.out.printf("%52s%n%37s%n%n", str1, str2);
    System.out.printf("Point n  : (%3s)%n", "x,y");

    //Prompt the user to input the coordinates
    String strPoint1 = JOptionPane.showInputDialog("Please input first point (x1,y1)");
    System.out.printf("Point 1  : (%5s)%n", strPoint1);
    String strPoint2 = JOptionPane.showInputDialog("Please input second point (x2,y2)");
    System.out.printf("Point 2  : (%5s)%n", strPoint2);
    String strPoint3 = JOptionPane.showInputDialog("Please input third point (x3,y3)");
    System.out.printf("Point 3  : (%5s)%n%n", strPoint3);
    int strPointLength1 = strPoint1.length();
    int strPointLength2 = strPoint2.length();
    int strPointLength3 = strPoint3.length();

    //Extract the ordinates
    double x1 = Double.parseDouble(strPoint1.substring(0, strPoint1.indexOf(",")));
    double y1 = Double.parseDouble(strPoint1.substring(strPoint1.indexOf(",") + 1, strPointLength1));
    double x2 = Double.parseDouble(strPoint2.substring(0, strPoint2.indexOf(",")));
    double y2 = Double.parseDouble(strPoint2.substring(strPoint2.indexOf(",") + 1, strPointLength2));
    double x3 = Double.parseDouble(strPoint3.substring(0, strPoint3.indexOf(",")));
    double y3 = Double.parseDouble(strPoint3.substring(strPoint3.indexOf(",") + 1, strPointLength3));

    //Construct the triangle object
    //double x1 = 50, y1 = 50, x2 = 50, y2 = 140, x3 = 170, y3 = 140; //debugging
    TriangleComponent theTriangle = new TriangleComponent(x1, y1, x2, y2, x3, y3);

    //Do the calculation
    theTriangle.constructPoints();
    theTriangle.calculateSidesLength();
    theTriangle.calculateAngles();
    theTriangle.calculatePerimeter();
    theTriangle.calculateArea();

    //Get the calculation result
    double sideA = Double.parseDouble(new DecimalFormat(".#").format(theTriangle.getSideLengthA()));
    double sideB = Double.parseDouble(new DecimalFormat(".#").format(theTriangle.getSideLengthB()));
    double sideC = Double.parseDouble(new DecimalFormat(".#").format(theTriangle.getSideLengthC()));
    double angleA = Double.parseDouble(new DecimalFormat(".#").format(theTriangle.getAngleA()));
    double angleB = Double.parseDouble(new DecimalFormat(".#").format(theTriangle.getAngleB()));
    double angleC = Double.parseDouble(new DecimalFormat(".#").format(theTriangle.getAngleC()));
    double perimeter = Double.parseDouble(new DecimalFormat(".#").format(theTriangle.getPerimeter()));
    double area = Double.parseDouble(new DecimalFormat(".#").format(theTriangle.getArea()));

    //Display the result
    String symbols = "+--------+";
    String symbols1 = "---------+";
    String symbols2 = "+============================+";
    String symbols3 = "=============================+";
    System.out.printf("%38s%n", "Triangle Properties");
    System.out.printf("%s%30s%n", symbols2, symbols3);
    System.out.printf("%s%19s%10s%21s%9s%n",
            "|", "Side Length", "|", "Corner Angle", "|");
    System.out.printf("%s%17s%12s%19s%11s%n",
            "|", "(units)", "|", "(degrees)", "|");
    System.out.printf("%s%10s%10s%10s%10s%10s%n",
            symbols, symbols1, symbols1, symbols1, symbols1, symbols1);
    System.out.printf("%s%4s%5s%5s%5s%5s%5s%5s%5s%5s%5s%5s%5s %n",
            "|", "a", "|", "b", "|", "c", "|", "A", "|", "B", "|", "C", "|");
    System.out.printf("%s%10s%10s%10s%10s%10s%n",
            symbols, symbols1, symbols1, symbols1, symbols1, symbols1);
    System.out.printf("%s%6s%3s%7s%3s%7s%3s%6s%4s%6s%4s%6s%4s %n",
            "|", sideA, "|", sideB, "|", sideC, "|", angleA, "|", angleB, "|", angleC, "|");
    System.out.printf("%s%30s%n", symbols2, symbols3);
    System.out.printf("Perimeter %5s%,10.1f%6s%n", ":", perimeter, "units");
    System.out.printf("Area %10s%,10.1f%13s%n", ":", area, "square units");

    //Sketch the triangle in new window
    JFrame theFrame = new JFrame();
    theFrame.setSize(270, 250);
    theFrame.setTitle("Triangle Sketch");
    theFrame.getContentPane().setBackground(Color.WHITE);
    theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    theFrame.setVisible(true);
    theFrame.add(theTriangle);
  }
}