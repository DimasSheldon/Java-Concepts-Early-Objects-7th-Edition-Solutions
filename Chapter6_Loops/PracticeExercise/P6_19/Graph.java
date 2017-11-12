package EKPL.Chapter6_Loops.PracticeExercise.P6_19;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;

/**
 * Created by Sheldon on 11/15/2016.
 * This program draws a curved graph
 * with given function and x boundary.
 * P6.19
 */
public class Graph extends JComponent {
  public void paintComponent(Graphics g) {
    Graphics2D painter = (Graphics2D) g;
    double f_x;        // the y position
    double delta_fx;   // the delta-y position

    double xMax = 400;
    double xMin = 0;
    double d = (xMax - xMin) / 10;  // the delta

    final double EPSILON = 1E-14;
    for (double x = xMin; x < xMax || Math.abs(x - xMax) <= EPSILON; x++) {
      f_x = (0.00005 * Math.pow(x, 3)) - (0.03 * Math.pow(x, 2)) + (4 * x) + 200;
      delta_fx = (0.00005 * Math.pow(x + d, 3)) - (0.03 * Math.pow(x + d, 2)) + (4 * (x + d)) + 200;
      // Create new object of line
      Line2D.Double line = new Line2D.Double(x, f_x, x + d, delta_fx);
      // Draw the line at every loop
      painter.draw(line);
    }
  }

  public static void main(String[] args) {
    JFrame theFrame = new JFrame("Curved Graph");
    theFrame.setSize(425, 425);
    theFrame.getContentPane().setBackground(Color.WHITE);
    theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    theFrame.setVisible(true);

    Graph theGraph = new Graph();
    theFrame.add(theGraph);
  }
}