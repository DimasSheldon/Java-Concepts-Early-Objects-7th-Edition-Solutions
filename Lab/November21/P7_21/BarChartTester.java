package EKPL.Lab.November21.P7_21;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Sheldon on 11/21/2016.
 * A tester program to show the bar chart in a window.
 * P7.21
 */
public class BarChartTester {
  public static void main(String[] args) {
    JFrame theFrame = new JFrame("Bar Chart");
    theFrame.setSize(400, 400);
    theFrame.getContentPane().setBackground(Color.WHITE);
    theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    theFrame.setVisible(true);

    BarChartComponent chartComponent = new BarChartComponent();
    theFrame.add(chartComponent);
  }
}
