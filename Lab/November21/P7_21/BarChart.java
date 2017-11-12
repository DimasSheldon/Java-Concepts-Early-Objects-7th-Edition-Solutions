package EKPL.Lab.November21.P7_21;

import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

/**
 * Created by Sheldon on 11/21/2016.
 * A program that builds the properties of a bar chart.
 * P7.21
 */
public class BarChart {
  private ArrayList<Double> barSize;
  private double _height;
  private double _width;

  /**
   * Construct a bar chart object with given width and height
   * @param width the width for each bar
   * @param height the height for each bar
   */
  public BarChart(double width, double height) {
    _height = height;
    _width = width;
    barSize = new ArrayList<>();
  }

  /**
   * Lists the size of each bar
   * @param value the size of each bar
   */
  public void add(double value) {
    barSize.add(value);
  }

  /**
   * Draws the bar by rectangular shape
   * @param painter the painter of bar shape
   */
  public void draw(Graphics2D painter) {
    double x = 0;
    double width = _width / barSize.size();
    for (double element : barSize) {
      double y = _height - element;
      Rectangle2D.Double bar = new Rectangle2D.Double(x, y, width, element);
      painter.draw(bar);
      x += width;
    }
  }
}