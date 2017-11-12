package EKPL.Chapter3_ImplementingClasses.TheHouse;

import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

/**
 * Created by Sheldon on 10/30/2016.
 */
public class House {
    private double xPos;
    private double yPos;
    private double dimension;

    /**
     * @param x
     * @param y
     * @param initialDimension
     */
    public House(double x, double y, double initialDimension) {
        xPos = x;
        yPos = y;
        dimension = initialDimension;
    }

    /**
     * @param g2
     */
    public void drawRoof(Graphics2D g2) {
        Point2D.Double topPoint = new Point2D.Double(xPos + (dimension / 2), yPos);
        Point2D.Double leftPoint = new Point2D.Double(xPos, yPos + dimension / 2);
        Point2D.Double rightPoint = new Point2D.Double(xPos + dimension, yPos + dimension / 2);
        Line2D.Double leftLine = new Line2D.Double(leftPoint, topPoint);
        Line2D.Double rightLine = new Line2D.Double(rightPoint, topPoint);
        g2.draw(leftLine);
        g2.draw(rightLine);
    }

    /**
     * @param g2
     */
    public void drawWall(Graphics2D g2) {
        Rectangle2D.Double theWall = new Rectangle2D.Double(xPos, yPos + dimension / 2, dimension, dimension - 25);
        g2.draw(theWall);
    }

    /**
     * @param g2
     */
    public void drawWindow(Graphics2D g2) {
        Rectangle2D.Double theWindow = new Rectangle2D.Double(xPos + (dimension / 1.75), yPos + (dimension - 15),
                dimension / 4, dimension / 4);
        g2.draw(theWindow);
    }

    /**
     * @param g2
     */
    public void drawDoor(Graphics2D g2) {
        Rectangle2D.Double theDoor = new Rectangle2D.Double(xPos + (dimension / 7.5), yPos + (dimension - 20),
                dimension / 3, (dimension / 2) - 5);
        g2.draw(theDoor);
    }
}