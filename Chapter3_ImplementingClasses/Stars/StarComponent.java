package EKPL.Chapter3_ImplementingClasses.Stars;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Sheldon on 10/31/2016.
 */
public class StarComponent extends JComponent {
  public void paintComponent(Graphics g) {
    Graphics2D g2 = (Graphics2D) g;

    Star star1 = new Star(50, 50, 100);
    Star star2 = new Star(185, 190, 25);
    Star star3 = new Star(100, 250, 10);
    Star star4 = new Star(300, 100, 50);
    g2.setColor(Color.PINK);
    star1.draw(g2);
    g2.setColor(Color.MAGENTA);
    star2.draw(g2);
    g2.setColor(Color.GREEN);
    star3.draw(g2);
    g2.setColor(Color.RED);
    star4.draw(g2);
  }
}
