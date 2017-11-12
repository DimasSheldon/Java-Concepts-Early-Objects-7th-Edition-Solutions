package EKPL.Chapter3_ImplementingClasses.HELLO;

import java.awt.*;
import java.awt.geom.Line2D;

/**
 * Created by Sheldon on 10/30/2016.
 */
public class LetterH {
    public double xPos;
    public double yPos;
    public double dimension;

    /**
     * @param x
     * @param y
     * @param d
     */
    public LetterH(double x, double y, double d) {
        xPos = x;
        yPos = y;
        dimension = d;
    }

    /**
     * @param g2
     */
    public void draw(Graphics2D g2) {
        Line2D.Double verticalLine1 = new Line2D.Double(xPos, yPos, xPos, yPos + dimension);
        Line2D.Double verticalLine2 = new Line2D.Double(xPos + (dimension - 10), yPos,
                xPos + (dimension - 10), yPos + dimension);
        Line2D.Double horizontalLine = new Line2D.Double(xPos, yPos + (dimension / 2),
                xPos + (dimension - 10), yPos + (dimension / 2));
        g2.draw(verticalLine1);
        g2.draw(verticalLine2);
        g2.draw(horizontalLine);
    }
}