package EKPL.Lab.November25.P8_6;

import EKPL.Lab.November25.P8_7.CannonballTrajectory;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Sheldon on 11/26/2016.
 *
 */
public class CannonballTester {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the current position of cannonball\t\t\t\t(x): ");
    double xPos = input.nextDouble();

    System.out.print("Enter the elevation angle to shoot\t\t\t\t\t(alpha): ");
    double alpha = input.nextDouble();

    System.out.print("Enter the velocity to shoot \t\t\t\t\t(velocity): ");
    double velocity = input.nextDouble();

    System.out.print("Enter the delta time to record ball positions \t(deltaSec): ");
    double deltaSec = input.nextDouble();

    Cannonball ball = new Cannonball(xPos);
    ArrayList<Point2D.Double> points = ball.shoot(alpha, velocity, deltaSec);

    CannonballTrajectory trajectory = new CannonballTrajectory(points);

    int count = 0;
    System.out.println("Locations:");
    for (int i = 0; i < points.size(); i++) {
      System.out.println(points.get(i));
      count++;
      if (count % 10 == 0) {
        System.out.println();
      }
    }

    JFrame theFrame = new JFrame("Cannonball Trajectory");
    theFrame.setSize(400, 400);
    theFrame.getContentPane().setBackground(Color.WHITE);
    theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    theFrame.setVisible(true);
    theFrame.add(trajectory);
  }
}