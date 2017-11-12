package EKPL.Chapter3_ImplementingClasses.TheHouse;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Sheldon on 10/30/2016.
 */
public class HouseComponent extends JComponent {
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        House house = new House(50, 50, 275);
        house.drawRoof(g2);
        house.drawWall(g2);
        house.drawWindow(g2);
        house.drawDoor(g2);

        House house1 = new House(400, 325, 100);
        house1.drawRoof(g2);
        house1.drawWall(g2);
        house1.drawWindow(g2);
        house1.drawDoor(g2);

        House house2 = new House(400, 100, 148);
        house2.drawRoof(g2);
        house2.drawWall(g2);
        house2.drawWindow(g2);
        house2.drawDoor(g2);
    }
}