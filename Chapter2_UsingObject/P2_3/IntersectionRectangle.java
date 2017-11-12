package EKPL.Chapter2_UsingObject.P2_3;

import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.*;

/**
 * Created by Sheldon on 10/27/2016.
 * P2.3
 * Decide wether intersection is occured or not
 * Fill the intersection area if occured
 */

public class IntersectionRectangle extends JComponent {
  public void paintComponent(Graphics g) {
    Graphics2D painter = (Graphics2D) g;    // Construct painter object

    painter.setColor(Color.BLACK);
    Rectangle r1 = new Rectangle(20, 50, 200, 300); // Construct first rectangle
    painter.draw(r1);

    painter.setColor(Color.BLUE);
    Rectangle r2 = new Rectangle(115, 180, 300, 200); // Construct second rectangle
//        Rectangle r2 = new Rectangle(220, 350, 300, 200);
//        Rectangle r2 = new Rectangle(110, 350, 300, 200);
//        Rectangle r2 = new Rectangle(220, 175, 300, 200);
    painter.draw(r2);

    painter.setColor(Color.RED.darker());
    Rectangle r3 = r1.intersection(r2); // Construct intersection rectangle
    painter.fill(r3);
    float xPoint = (float) r3.getX();
    float yPoint = (float) r3.getY();

    System.out.println("Rectangle1 coordinate (x, y): (" + r1.getX() + ", " + r1.getY() + ")");
    System.out.println("Rectangle2 coordinate (x, y): (" + r2.getX() + ", " + r2.getY() + ")");

    // if width and height is 0, no intersection happened
    if (r3.getWidth() == 0 && r3.getHeight() == 0) {
      System.out.println("Intersected Rect. coordinate (x, y):(" + r3.getX() + ", " + r3.getY() + ")");
      System.out.println("No intersection");
    }
    // if width is measured but height didn't, no intersection happened
    else if (r3.getWidth() > 0 && r3.getHeight() == 0) {
      System.out.println("Intersected Rect. coordinate (x, y):(" + r3.getX() + ", " + r3.getY() + ")");
      System.out.println("No intersection");
    }
    // if height is measured but width didn't, no intersection happened
    else if (r3.getWidth() == 0 && r3.getHeight() > 0) {
      System.out.println("Intersected Rect. coordinate (x, y):(" + r3.getX() + ", " + r3.getY() + ")");
      System.out.println("No intersection");
    }
    // if width and height are measured, intersection happened
    else if (r3.getWidth() > 0 && r3.getHeight() > 0) {
      System.out.println("Intersected Rect. coordinate (x, y):(" + r3.getX() + ", " + r3.getY() + ")");
      System.out.println("Intersected Rect (w, h): (" + r3.getWidth() + ", " + r3.getHeight() + ")");
      painter.setColor(Color.LIGHT_GRAY);
      painter.drawString("Intersection", (xPoint + 10), (yPoint + 50));
    }
  }

  public static void main(String[] args) {
    // Construct frame object
    JFrame frame = new JFrame();
    frame.setSize(600, 600);
    frame.setTitle("Intersected Rectangles");
    frame.getContentPane().setBackground(Color.WHITE);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);

    // Construct rectangles
    IntersectionRectangle intersectCmp = new IntersectionRectangle();

    // Add the components to frame
    frame.add(intersectCmp);
  }
}



