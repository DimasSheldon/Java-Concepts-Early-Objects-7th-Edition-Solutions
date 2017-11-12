package EKPL.Lab.November21.P7_21;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Sheldon on 11/21/2016.
 * A program that generates the bar chart components.
 * P7.21
 */
public class BarChartComponent extends JComponent {
  public void paintComponent(Graphics g) {
    Graphics2D painter = (Graphics2D) g;
    BarChart chart = new BarChart(getWidth(), getHeight());
    chart.add(200);
    chart.add(250);
    chart.add(300);
    chart.add(250);
    chart.add(300);
    chart.add(200);
    chart.add(300);
    chart.draw(painter);
  }
}
