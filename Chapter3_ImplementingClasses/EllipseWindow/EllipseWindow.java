package EKPL.Chapter3_ImplementingClasses.EllipseWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

/**
 * Created by Sheldon on 10/31/2016.
 */
public class EllipseWindow extends JComponent {
    private double xPos = 0;
    private double yPos = 0;

    /**
     * @param g
     */
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        Ellipse2D.Double theEllipse = new Ellipse2D.Double(xPos, yPos, getWidth(), getHeight());
        g2.setColor(Color.BLACK);
        g2.draw(theEllipse);
        g2.setColor(Color.GREEN);
        g2.fill(theEllipse);
    }

    public static void main(String[] args) {
        JFrame theFrame = new JFrame();
        theFrame.setTitle("Ellipse-filled Window");
        theFrame.setSize(400, 400);
        theFrame.getContentPane().setBackground(Color.WHITE);
        theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        theFrame.setVisible(true);

        EllipseWindow theEllipseFiller = new EllipseWindow();
        theFrame.add(theEllipseFiller);
    }
}
