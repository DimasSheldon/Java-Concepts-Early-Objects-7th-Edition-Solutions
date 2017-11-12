package EKPL.Chapter6_Loops.PracticeExercise.P6_14;

import java.util.Scanner;

/**
 * Created by Sheldon on 11/16/2016.
 * This program simulates the calculation of cross-section area of
 * ship hull at x point, where each of x is part of hull's length.
 * P6.14
 */
public class ShipHullSectionTrial {
  public static void main(String[] args) {
    System.out.printf("%60s%n", "This program calculates the ship's hull section area");
    System.out.printf("%40s%n%n", "at specified x point");

    // Prompt for the data needed
    System.out.println("Please input the value of data needed below:");
    Scanner input = new Scanner(System.in);
    System.out.print("Beam (units)            : ");
    double B = input.nextDouble();
    System.out.print("Length (units)          : ");
    double L = input.nextDouble();
    System.out.print("Draft (units)           : ");
    double T = input.nextDouble();
    System.out.print("x point                 : ");
    double x = input.nextDouble();
    System.out.print("Sampling Rate           : ");
    int n = input.nextInt();

    // Construct the object then calculate the cross-section area
    ShipHullSection section = new ShipHullSection(B, L, T, x, n);
    section.calculate_ySize();
    section.halfSectionArea();

    System.out.printf("%40s %.3f%n%n", "The area of ship's hull section is", section.getSectionArea());
    System.out.printf("%40s", "Thank you for using this program");
  }
}