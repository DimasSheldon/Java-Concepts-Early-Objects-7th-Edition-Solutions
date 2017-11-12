package EKPL.Chapter2_UsingObject.P2_9;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;
import java.text.DecimalFormat;

/**
 * Created by Sheldon on 10/27/2016.
 * P2.9
 * Measure and draw distance from line segment to specified point
 */
public class LineToPointDistance extends JComponent {
  public void paintComponent(Graphics g) {
    Graphics2D painter = (Graphics2D) g;    // Construct painter object
    Line2D.Double lineSegment = new Line2D.Double(100, 100, 200, 200);  //Construct line object
    painter.setColor(Color.BLUE);
    painter.draw(lineSegment);

    int[] x = {100, 150, 250};  // Create x ordinates list
    int[] y = {200, 150, 50};   // Create y ordinates list
    int dataLength = x.length;  // Hold data length
    double[] toPointDistance = new double[dataLength];  // Create line-to-point-distance empty list
    double[] expectation = {70.71, 0, 141.42};

    for (int i = 0; i < dataLength; i++) {
      // Fill oval object in coordinate (x[i], y[i])
      painter.setColor(Color.RED);
      painter.fillOval(x[i], y[i], 5, 5);

      // Calculate distance from line segment to the point specified
      toPointDistance[i] = lineSegment.ptSegDist(x[i], y[i]);
      String pointDistanceFormatted = new DecimalFormat(".##").format(toPointDistance[i]);

      // Draw string indicates the distance
      painter.setColor(Color.BLACK);
      painter.drawString("Distance:" + pointDistanceFormatted, x[i], y[i]);

      // Display results
      System.out.printf("Distance between point" + (i + 1) + " and line segment: %6.2f; " +
              "Expected: %6.2f%n", toPointDistance[i], expectation[i]);
    }
  }

  public static void main(String[] args) {
    JFrame myFrame = new JFrame();
    myFrame.setSize(400, 400);
    myFrame.setTitle("Line to Point Distance");
    myFrame.getContentPane().setBackground(Color.WHITE);
    myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    myFrame.setVisible(true);

    LineToPointDistance calculateDistance = new LineToPointDistance();
    myFrame.add(calculateDistance);
  }
}
