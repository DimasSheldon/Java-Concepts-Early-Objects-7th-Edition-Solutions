package EKPL.Chapter3_ImplementingClasses.ShootingTarget;


import java.awt.*;
import java.awt.geom.Ellipse2D;

/**
 * Created by Sheldon on 10/30/2016.
 * E3.16
 */
public class Target {
  private double xPos;
  private double yPos;
  private double diameter;

  /**
   * @param x
   * @param y
   * @param d
   */
  public Target(double x, double y, double d) {
    xPos = x;
    yPos = y;
    diameter = d;
  }

  /**
   * @param g2
   */
  public void draw(Graphics2D g2) {
    int circleAmount = 7;
    Ellipse2D.Double[] circle = new Ellipse2D.Double[circleAmount];
    double circleDistance = 20;
    double j = circleDistance;


    for (int i = 0; i < circleAmount; i++) {
      circle[i] = new Ellipse2D.Double(xPos + j, yPos + j, diameter - (j * 2), diameter - (j * 2));
      if (i % 2 == 0) {
        g2.setColor(Color.BLACK);
        g2.fill(circle[i]);
      } else {
        g2.setColor(Color.WHITE);
        g2.fill(circle[i]);
      }
      j = j + circleDistance;
    }
    g2.setColor(Color.YELLOW);
    g2.fillArc(50, 50, 100, 100, 0, 300);
    g2.setColor(Color.BLACK);
    g2.fillOval(120, 80, 10, 10);

//        Ellipse2D.Double circle1 = new Ellipse2D.Double(xPos, yPos, diameter, diameter);
//        Ellipse2D.Double circle2 = new Ellipse2D.Double(xPos + 20, yPos + 20, diameter - 40, diameter - 40);
//        Ellipse2D.Double circle3 = new Ellipse2D.Double(xPos + 40, yPos + 40, diameter - 80, diameter - 80);
//        Ellipse2D.Double circle4 = new Ellipse2D.Double(xPos + 60, yPos + 60, diameter - 120, diameter - 120);
//        Ellipse2D.Double circle5 = new Ellipse2D.Double(xPos + 80, yPos + 80, diameter - 160, diameter - 160);
//
//        g2.setColor(Color.BLACK);
//        g2.fill(circle1);
//        g2.setColor(Color.WHITE);
//        g2.fill(circle2);
//        g2.setColor(Color.BLACK);
//        g2.fill(circle3);
//        g2.setColor(Color.WHITE);
//        g2.fill(circle4);
//        g2.setColor(Color.BLACK);
//        g2.fill(circle5);
  }
}
