package EKPL.Chapter3_ImplementingClasses.HELLO;

import java.awt.*;
import java.awt.geom.Line2D;

/**
 * Created by Sheldon on 10/30/2016.
 */
public class LetterO {
    private double xPos;
    private double yPos;
    private double dimension;

    /**
     * @param x
     * @param y
     * @param d
     */
    public LetterO(double x, double y, double d) {
        xPos = x;
        yPos = y;
        dimension = d;
    }

    /**
     * @param g2
     */
    public void draw(Graphics2D g2) {
//        Ellipse2D.Double theO = new Ellipse2D.Double(xPos + (dimension * 4) - 5, yPos, dimension - 5, dimension);
//        g2.draw(theO);

        Line2D.Double verticalLine1 = new Line2D.Double(xPos + (dimension * 4), yPos,
                xPos + (dimension * 4), yPos + dimension);
        Line2D.Double verticalLine2 = new Line2D.Double(xPos + (dimension * 5), yPos,
                xPos + (dimension * 5), yPos + dimension);
        Line2D.Double horizontalLine1 = new Line2D.Double(xPos + (dimension * 4), yPos,
                xPos + (dimension * 5), yPos);
        Line2D.Double horizontalLine2 = new Line2D.Double(xPos + (dimension * 4), yPos + dimension,
                xPos + (dimension * 5), yPos + dimension);
        g2.draw(verticalLine1);
        g2.draw(verticalLine2);
        g2.draw(horizontalLine1);
        g2.draw(horizontalLine2);
    }
}