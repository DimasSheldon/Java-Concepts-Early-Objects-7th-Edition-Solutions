package EKPL.Lab.November21.P7_17;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.ArrayList;

/**
 * Created by Sheldon on 11/21/2016.
 * This program sketches the sine wave based on
 * line sampling.
 * P7.17
 */
public class SineWave extends JComponent {
  public void paintComponent(Graphics g) {
    Graphics2D painter = (Graphics2D) g;

    ArrayList<Double> yPoints = new ArrayList<>();
    ArrayList<Double> xPoints = new ArrayList<>();

    double degrees = 5.0;
    for (double i = 0; i <= 360; i += degrees) {
      xPoints.add(i);
      double value = Math.abs(Math.sin(Math.toRadians(i)));
      yPoints.add(value);
    }

    Point2D.Double startPoint;
    Point2D.Double endPoint;
    int scale = 100;
    for (int i = 0; i < xPoints.size(); i++) {
      if (i <= xPoints.indexOf(180.0)) {
        startPoint = new Point2D.Double(xPoints.get(i), scale);
        endPoint = new Point2D.Double(xPoints.get(i), (scale - (yPoints.get(i) * scale)));
        Line2D.Double line = new Line2D.Double(startPoint, endPoint);
        painter.draw(line);
      } else {
        startPoint = new Point2D.Double(xPoints.get(i), scale);
        endPoint = new Point2D.Double(xPoints.get(i), (yPoints.get(i) * scale) + scale);
        Line2D.Double line = new Line2D.Double(startPoint, endPoint);
        painter.draw(line);
      }
    }
  }

  public static void main(String[] args) {
    JFrame theFrame = new JFrame("Sine Wave");
    theFrame.setSize(400, 400);
    theFrame.getContentPane().setBackground(Color.WHITE);
    theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    theFrame.setVisible(true);

    SineWave theWave = new SineWave();
    theFrame.add(theWave);
  }
}
