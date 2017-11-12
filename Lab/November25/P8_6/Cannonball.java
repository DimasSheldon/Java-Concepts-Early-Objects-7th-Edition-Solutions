package EKPL.Lab.November25.P8_6;

import java.awt.geom.Point2D;
import java.util.ArrayList;

/**
 * Created by Sheldon on 11/25/2016.
 */
public class Cannonball {
  private static double deltaX_Pos;
  private static double yPos;
  private static double xVelocity;
  private static double yVelocity;
  private static final double G = 9.81;
  private static ArrayList<Point2D.Double> locations;
  private static Point2D.Double point;

  public Cannonball(double xPosition) {
    deltaX_Pos = xPosition;
    yPos = 0;
  }

  public ArrayList<Point2D.Double> shoot(double alpha, double v, double deltaSec) {
    locations = new ArrayList<>();
    xVelocity = v * Math.cos(Math.toRadians(alpha));
    yVelocity = v * Math.sin(Math.toRadians(alpha));

    final double EPSILON = 1E-14;
    double tMax = 2 * (yVelocity / G);
    for (double second = 0; second < tMax || Math.abs(second - tMax) <= EPSILON; second += deltaSec) {
      move(second);
    }
    return locations;
  }

  private void move(double deltaSec) {
    double xPos;
    xPos = (xVelocity * deltaSec) + deltaX_Pos;
    yPos = (yVelocity * deltaSec) - (0.5 * G * Math.pow(deltaSec, 2));

    point = new Point2D.Double(xPos, yPos);
    locations.add(point);
  }

  public Point2D.Double getLocation() {
    return point;
  }
}