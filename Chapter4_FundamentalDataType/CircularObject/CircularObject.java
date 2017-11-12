package EKPL.Chapter4_FundamentalDataType.CircularObject;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

/**
 * Created by Sheldon on 10/31/2016.
 * E4.7
 * A program that prompts the user for a radius then
 * calculate the area and circumference of a circle and
 * the volume and surface area of a sphere with the radius prompted
 */
public class CircularObject extends JComponent {
  private double radius;  //holds the radius
  private double area;  //holds the circle area
  private double circumference; //holds the circle circumference
  private double volume;  //holds the sphere volume
  private double surfaceArea; //holds the sphere surface area

  /**
   * Constructs a circular object with radius r
   *
   * @param r the radius
   */
  public CircularObject(double r) {
    radius = r;
  }

  /**
   * Calculates the circular object area
   */
  public void calculateArea() {
    area = Math.PI * radius * radius;
  }

  /**
   * Calculates the circular object circumference
   */
  public void calculateCircumference() {
    final double MULTIPLIER = 2.0;
    circumference = MULTIPLIER * Math.PI * radius;
  }

  /**
   * Calculates the circular object volume
   */
  public void calculateVolume() {
    final double MULTIPLIER = 4.0 / 3.0;
    volume = MULTIPLIER * Math.PI * radius * radius * radius;
  }

  /**
   * Calculates the circular object surface area
   */
  public void calculateSurfaceArea() {
    final double MULTIPLIER = 4.0;
    surfaceArea = MULTIPLIER * Math.PI * radius * radius;
  }

  /**
   * Function that sketches the circular object
   *
   * @param g the painter
   */
  public void paintComponent(Graphics g) {
    Graphics2D painter = (Graphics2D) g;

    // Construct the circular object shapes
    final double INITIAL_POSITION = 50.0;
    Ellipse2D.Double circle = new Ellipse2D.Double(INITIAL_POSITION, INITIAL_POSITION, radius, radius);
    Ellipse2D.Double sphere = new Ellipse2D.Double(INITIAL_POSITION * 2 + radius, INITIAL_POSITION, radius, radius);
    Ellipse2D.Double ellipse = new Ellipse2D.Double(INITIAL_POSITION * 2 + radius, INITIAL_POSITION + (radius / 2.5),
            radius, radius / 5);

    // Sketch the circular object shapes
    painter.draw(circle);
    painter.draw(sphere);
    painter.setColor(Color.gray);
    painter.draw(ellipse);

    // Construct and sketch the circle radius
    painter.setColor(Color.RED);
    painter.setFont(new Font("Annotation", Font.ITALIC, 14));
    Line2D.Double circleRadius = new Line2D.Double(INITIAL_POSITION + (radius / 2), INITIAL_POSITION + (radius / 2),
            INITIAL_POSITION + radius, INITIAL_POSITION + (radius / 2));
    painter.draw(circleRadius);
    painter.drawString("r = " + radius, (float) (INITIAL_POSITION + (radius * 0.6)),
            (float) (INITIAL_POSITION + (radius / 2)));

    // Construct and sketch the sphere radius
    Line2D.Double sphereRadius = new Line2D.Double(INITIAL_POSITION * 2 + (radius * 1.5),
            INITIAL_POSITION + (radius / 2), INITIAL_POSITION * 2 + (radius * 2), INITIAL_POSITION + (radius / 2));
    painter.draw(sphereRadius);
    painter.drawString("r = " + radius, (float) (INITIAL_POSITION * 2 + (radius * 1.6)),
            (float) (INITIAL_POSITION + (radius / 2)));

    // Add the radius values
    painter.setColor(Color.BLACK);
    painter.setFont(new Font("Annotation1", Font.BOLD, 14));
    painter.drawString("Circle", (float) (INITIAL_POSITION + radius * 0.415),
            (float) (INITIAL_POSITION + radius + 20));
    painter.drawString("Sphere", (float) (INITIAL_POSITION * 2 + (radius * 1.405)),
            (float) (INITIAL_POSITION + radius + 20));
  }

  /**
   * Get the circle object area
   *
   * @return the area
   */
  public double getArea() {
    return area;
  }

  /**
   * Get the circle object circumference
   *
   * @return the circumference
   */
  public double getCircumference() {
    return circumference;
  }

  /**
   * Get the circle object volume
   *
   * @return the volume
   */
  public double getVolume() {
    return volume;
  }

  /**
   * Get the circle object surface area
   *
   * @return the surface area
   */
  public double getSurfaceArea() {
    return surfaceArea;
  }
}