package EKPL.Chapter3_ImplementingClasses.HELLO;

import java.awt.*;
import java.awt.geom.Line2D;

/**
 * Created by Sheldon on 10/30/2016.
 */
public class LetterE {
    public double xPos;
    public double yPos;
    public double dimension;

    /**
     * @param x
     * @param y
     * @param d
     */
    public LetterE(double x, double y, double d) {
        xPos = x;
        yPos = y;
        dimension = d;
    }

    /**
     * @param g2
     */
    public void draw(Graphics2D g2) {
        Line2D.Double verticalLine = new Line2D.Double(xPos + dimension, yPos, xPos + dimension, yPos + dimension);
        Line2D.Double horizontalLine1 = new Line2D.Double(xPos + dimension, yPos, xPos + (dimension * 2) - 15, yPos);
        Line2D.Double horizontalLine2 = new Line2D.Double(xPos + dimension, yPos + (dimension / 2),
                xPos + (dimension * 2) - 25, yPos + (dimension / 2));
        Line2D.Double horizontalLine3 = new Line2D.Double(xPos + dimension, yPos + dimension,
                xPos + (dimension * 2) - 15, yPos + dimension);

        g2.draw(verticalLine);
        g2.draw(horizontalLine1);
        g2.draw(horizontalLine2);
        g2.draw(horizontalLine3);
    }
}