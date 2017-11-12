package EKPL.Lab.November25.P8_7;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.util.ArrayList;

/**
 * Created by Sheldon on 11/26/2016.
 */
public class CannonballTrajectory extends JComponent {
  private static ArrayList<Point2D.Double> _points;

  public CannonballTrajectory(ArrayList<Point2D.Double> points) {
    _points = new ArrayList<>(points);
  }

  public void paintComponent(Graphics g) {
    Graphics2D painter = (Graphics2D) g;

    for (int i = 1; i < _points.size(); i++) {
      double scaleY = getHeight() / 1.5;

      double x1 = _points.get(i - 1).getX();
      double y1 = scaleY - _points.get(i - 1).getY();

      double x2 = _points.get(i).getX();
      double y2 = scaleY - _points.get(i).getY();

      painter.setColor(Color.BLACK);
      Ellipse2D.Double dot1 = new Ellipse2D.Double(x1, y1, 4, 4);
      painter.fill(dot1);

      painter.setColor(Color.RED);
      Ellipse2D.Double dot2 = new Ellipse2D.Double(x2, y2, 3, 5);
      painter.fill(dot2);
    }
  }
}