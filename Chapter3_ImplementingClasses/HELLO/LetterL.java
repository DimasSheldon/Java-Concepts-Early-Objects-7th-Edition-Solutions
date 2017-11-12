package EKPL.Chapter3_ImplementingClasses.HELLO;

import java.awt.*;
import java.awt.geom.Line2D;

/**
 * Created by Sheldon on 10/30/2016.
 */
public class LetterL {
    private double xPos;
    private double yPos;
    private double dimension;

    /**
     * @param x
     * @param y
     * @param d
     */
    public LetterL(double x, double y, double d) {
        xPos = x;
        yPos = y;
        dimension = d;
    }

    /**
     * @param g2
     */
    public void draw(Graphics2D g2) {
        Line2D.Double verticalLine1 = new Line2D.Double(xPos + (dimension * 2), yPos,
                xPos + (dimension * 2), yPos + dimension);
        Line2D.Double horizontalLine1 = new Line2D.Double(xPos + (dimension * 2), yPos + dimension,
                xPos + (dimension * 3) - 20, yPos + dimension);
        Line2D.Double verticalLine2 = new Line2D.Double(xPos + (dimension * 3), yPos,
                xPos + (dimension * 3), yPos + dimension);
        Line2D.Double horizontalLine2 = new Line2D.Double(xPos + (dimension * 3), yPos + dimension,
                xPos + (dimension * 4) - 20, yPos + dimension);
        g2.draw(verticalLine1);
        g2.draw(horizontalLine1);
        g2.draw(verticalLine2);
        g2.draw(horizontalLine2);
    }
}