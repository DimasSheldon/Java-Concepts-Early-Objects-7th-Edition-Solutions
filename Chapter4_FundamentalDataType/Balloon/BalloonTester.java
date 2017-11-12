package EKPL.Chapter4_FundamentalDataType.Balloon;

import javax.swing.*;
import java.text.DecimalFormat;

/**
 * Created by Sheldon on 11/1/2016.
 * E4.23
 * A program that simulates the balloon properties calculation
 */
public class BalloonTester {
  public static void main(String[] args) {
    System.out.printf("%60s%n%n", "A program that simulates the balloon properties calculation");
    //Prompt the user to add certain amount of air
    double airVolume = Double.parseDouble(JOptionPane.showInputDialog("Pump your balloon! (volume cm^3)"));

    //Construct a balloon object
    Balloon theBalloon = new Balloon();

    //Calculate balloon properties
    theBalloon.addAir(airVolume);
    theBalloon.calculateRadius();
    theBalloon.calculateSurfaceArea();

    double volume = theBalloon.getVolume();
    double radius = Double.parseDouble(new DecimalFormat(".##").format(theBalloon.getRadius()));
    double surfaceArea = Double.parseDouble(new DecimalFormat(".##").format(theBalloon.getSurfaceArea()));

    //Display the result
    System.out.printf("Current balloon volume %11s%,8.2f%4s%n", "(V)= ", volume, " cm3");
    System.out.printf("Current balloon radius %11s%,8.2f%3s%n", "(r)= ", radius, " cm");
    System.out.printf("Current balloon surface area %4s%,8.2f%4s%n", "(A)= ", surfaceArea, " cm2");
  }
}