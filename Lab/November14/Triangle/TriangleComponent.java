package EKPL.Lab.November14.Triangle;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
 * Created by Sheldon on 11/1/2016.
 * P4.3
 * A program that calculates triangle properties with
 * given points
 */
public class TriangleComponent extends JComponent {
  //Declare the triangle attributes
  private Point2D.Double point1, point2, point3;
  private double xOrdinate1, yOrdinate1,
          xOrdinate2, yOrdinate2,
          xOrdinate3, yOrdinate3;
  private double sideLengthA, sideLengthB, sideLengthC;
  private double angleA, angleB, angleC;
  private double perimeter;
  private double area;

  /**
   * Construct TriangleComponent class with specified ordinates
   *
   * @param x1 the first ordinate x
   * @param y1 the first ordinate y
   * @param x2 the second ordinate x
   * @param y2 the second ordinate y
   * @param x3 the third ordinate x
   * @param y3 the third ordinate y
   */
  public TriangleComponent(double x1, double y1, double x2, double y2, double x3, double y3) {
    xOrdinate1 = x1;
    yOrdinate1 = y1;
    xOrdinate2 = x2;
    yOrdinate2 = y2;
    xOrdinate3 = x3;
    yOrdinate3 = y3;
  }

  /**
   * Construct coordinate of points from given ordinates
   */
  public void constructPoints() {
    point1 = new Point2D.Double(xOrdinate1, yOrdinate1); //(x1, y1)
    point2 = new Point2D.Double(xOrdinate2, yOrdinate2); //(x2, y2)
    point3 = new Point2D.Double(xOrdinate3, yOrdinate3); //(x3, y3)
  }

  /**
   * Calculate sides length by measuring the distance of points
   */
  public void calculateSidesLength() {
    sideLengthA = point1.distance(point2); //point A is side a opposite
    sideLengthB = point2.distance(point3); //point B is side b opposite
    sideLengthC = point1.distance(point3); //point C is side c opposite
  }

  /**
   * Calculate each point angle in degrees
   */
  public void calculateAngles() {
    final int ORDER = 2;
    double arccosineA = ((Math.pow(sideLengthB, ORDER) + Math.pow(sideLengthC, ORDER)) -
            Math.pow(sideLengthA, ORDER)) / (ORDER * sideLengthB * sideLengthC);
    double arccosineB = ((Math.pow(sideLengthC, ORDER) + Math.pow(sideLengthA, ORDER)) -
            Math.pow(sideLengthB, ORDER)) / (ORDER * sideLengthA * sideLengthC);
    double arccosineC = ((Math.pow(sideLengthA, ORDER) + Math.pow(sideLengthB, ORDER)) -
            Math.pow(sideLengthC, ORDER)) / (ORDER * sideLengthA * sideLengthB);

    //Convert the value to degrees
    angleA = Math.toDegrees(Math.acos(arccosineA));
    angleB = Math.toDegrees(Math.acos(arccosineB));
    angleC = Math.toDegrees(Math.acos(arccosineC));
  }

  /**
   * Calculate triangle perimeter
   */
  public void calculatePerimeter() {
    perimeter = sideLengthA + sideLengthB + sideLengthC;
  }

  /**
   * Sketch the triangle shape
   *
   * @param g the painter
   */
  public void paintComponent(Graphics g) {
    Graphics2D painter = (Graphics2D) g;

    //Construct triangle sides
    Line2D.Double sideA = new Line2D.Double(point1, point2);
    Line2D.Double sideB = new Line2D.Double(point2, point3);
    Line2D.Double sideC = new Line2D.Double(point1, point3);

    //Draw the sides
    painter.draw(sideA);
    painter.draw(sideB);
    painter.draw(sideC);

    //Get the mid-point of each side
    float xMidPointA = (float) (xOrdinate1 + xOrdinate2) / 2;
    float yMidPointA = (float) (yOrdinate1 + yOrdinate2) / 2;
    float xMidPointB = (float) (xOrdinate2 + xOrdinate3) / 2;
    float yMidPointB = (float) (yOrdinate2 + yOrdinate3) / 2;
    float xMidPointC = (float) (xOrdinate1 + xOrdinate3) / 2;
    float yMidPointC = (float) (yOrdinate1 + yOrdinate3) / 2;

    //Draw annotations
    painter.setFont(new Font("sideFont", Font.ITALIC, 12));
    painter.drawString("a", xMidPointA, yMidPointA);
    painter.drawString("b", xMidPointB, yMidPointB);
    painter.drawString("c", xMidPointC, yMidPointC);

    painter.setFont(new Font("angleFont", Font.BOLD, 12));
    painter.drawString("A", (float) xOrdinate3, (float) yOrdinate3);
    painter.drawString("B", (float) xOrdinate1, (float) yOrdinate1);
    painter.drawString("C", (float) xOrdinate2, (float) yOrdinate2);
  }

  /**
   * Calculate the area of triangle using Heron's formula
   * S is the semi-perimeter of the triangle
   */
  public void calculateArea() {
    final double S = ((sideLengthA + sideLengthB + sideLengthC) / 2);
    area = Math.sqrt((S * (S - sideLengthA) * (S - sideLengthB) * (S - sideLengthC)));
  }

  /**
   * Get point 1 coordinate
   *
   * @return the coordinate
   */
  public Point2D.Double getPoint1() {
    return point1;
  }

  /**
   * Get point 2 coordinate
   *
   * @return the coordinate
   */
  public Point2D.Double getPoint2() {
    return point2;
  }

  /**
   * Get point 3 coordinate
   *
   * @return the coordinate
   */
  public Point2D.Double getPoint3() {
    return point3;
  }

  /**
   * Get side A length
   *
   * @return the side length
   */
  public double getSideLengthA() {
    return sideLengthA;
  }

  /**
   * Get side B length
   *
   * @return the side length
   */
  public double getSideLengthB() {
    return sideLengthB;
  }

  /**
   * Get side C length
   *
   * @return the side length
   */
  public double getSideLengthC() {
    return sideLengthC;
  }

  /**
   * Get point A angle
   *
   * @return the angle
   */
  public double getAngleA() {
    return angleA;
  }

  /**
   * Get point B angle
   *
   * @return the angle
   */
  public double getAngleB() {
    return angleB;
  }

  /**
   * Get point C angle
   *
   * @return the angle
   */
  public double getAngleC() {
    return angleC;
  }

  /**
   * Get the triangle perimeter
   *
   * @return the perimeter
   */
  public double getPerimeter() {
    return perimeter;
  }

  /**
   * Get the triangle area
   *
   * @return the area
   */
  public double getArea() {
    return area;
  }
}