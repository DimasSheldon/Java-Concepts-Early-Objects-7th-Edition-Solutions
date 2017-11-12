package EKPL.Lab.November14;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

/**
 * Created by Sheldon on 10/27/2016.
 * P2.12
 * Draws traffic light by 1 class
 */
public class TheTrafficLight extends JComponent {
  public void paintComponent(Graphics g) {
    Graphics2D painter = (Graphics2D) g; // Construct painter object

    // Draw traffic light's main body and cover
    painter.setColor(Color.BLACK);
    painter.fillRoundRect(350, 50, 150, 400, 20, 20);
    painter.fillRoundRect(325, 38, 200, 15, 5, 5);

    // Draw white rectangular inside main body
    painter.setColor(Color.WHITE);
    painter.drawRoundRect(353, 53, 143, 393, 20, 20);

    // Draw traffic light's stand
    Rectangle trafficLightStand = new Rectangle(405, 450, 35, 200);
    painter.setColor(Color.gray);
    painter.fill(trafficLightStand);

    // Draw the lamps
    // RED lamp
    Ellipse2D.Double redLamp = new Ellipse2D.Double(375, 75, 100, 100);
    Color brightRed = Color.RED.brighter();
    Color darkRed = Color.RED.darker();
    painter.setColor(brightRed);
    painter.fill(redLamp);
    painter.setColor(Color.GRAY);
    painter.draw(redLamp);
    // Yellow lamp
    Ellipse2D.Double yellowLamp = new Ellipse2D.Double(375, 200, 100, 100);
    Color brightYellow = Color.YELLOW.brighter();
    Color darkYellow = Color.YELLOW.darker();
    painter.setColor(brightYellow);
    painter.fill(yellowLamp);
    painter.setColor(Color.GRAY);
    painter.draw(yellowLamp);
    // Green lamp
    Ellipse2D.Double greenLamp = new Ellipse2D.Double(375, 325, 100, 100);
    Color brightGreen = Color.GREEN.brighter();
    Color darkGreen = Color.GREEN.darker();
    painter.setColor(brightGreen);
    painter.fill(greenLamp);
    painter.setColor(Color.GRAY);
    painter.draw(greenLamp);
    // Draw lamps' cover
    int arcWidth = 100;
    int arcHeight = 100;
    int arcStartAngle = 0;
    int arcAngle = 180;
    painter.setColor(Color.DARK_GRAY);
    for (int i = 1; i < 30; i++) {
      painter.drawArc(375, i + 73, arcWidth, arcHeight, arcStartAngle, arcAngle);
      painter.drawArc(375, i + 198, arcWidth, arcHeight, arcStartAngle, arcAngle);
      painter.drawArc(375, i + 323, arcWidth, arcHeight, arcStartAngle, arcAngle);
    }
  }

  public static void main(String[] args) {
    JFrame myFrame = new JFrame();
    myFrame.setSize(700, 725);
    myFrame.setTitle("Traffic Light");
    myFrame.getContentPane().setBackground(Color.WHITE);
    myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    myFrame.setVisible(true);

    TheTrafficLight trafficLight = new TheTrafficLight();
    myFrame.add(trafficLight);
  }
}
