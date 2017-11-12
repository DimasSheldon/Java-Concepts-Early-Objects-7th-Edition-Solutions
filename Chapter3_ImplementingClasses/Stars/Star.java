package EKPL.Chapter3_ImplementingClasses.Stars;

import java.awt.*;
import java.awt.geom.Line2D;

/**
 * Created by Sheldon on 10/31/2016.
 */
public class Star {
    private double xPos;
    private double yPos;
    private double size;

    /**
     * @param x
     * @param y
     * @param initialSize
     */
    public Star(double x, double y, double initialSize) {
        xPos = x;
        yPos = y;
        size = initialSize;
    }

    /**
     * @param g2
     */
    public void draw(Graphics2D g2) {
        Line2D.Double verticalLine = new Line2D.Double(xPos + (size / 2), yPos, xPos + (size / 2), yPos + size);
        Line2D.Double horizontalLine = new Line2D.Double(xPos, yPos + (size / 2), xPos + size, yPos + (size / 2));
        Line2D.Double leftDiagonalLine = new Line2D.Double(xPos, yPos, xPos + size, yPos + size);
        Line2D.Double rightDiagonallLine = new Line2D.Double(xPos, yPos + size, xPos + size, yPos);

        g2.draw(verticalLine);
        g2.draw(horizontalLine);
        g2.draw(leftDiagonalLine);
        g2.draw(rightDiagonallLine);
    }
}
