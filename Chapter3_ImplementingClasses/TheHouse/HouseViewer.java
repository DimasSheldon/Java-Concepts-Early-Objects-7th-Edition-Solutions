package EKPL.Chapter3_ImplementingClasses.TheHouse;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Sheldon on 10/30/2016.
 */
public class HouseViewer {
    public static void main(String[] args) {
        JFrame theHouseFrame = new JFrame();
        theHouseFrame.setSize(800, 600);
        theHouseFrame.getContentPane().setBackground(Color.WHITE);
        theHouseFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        theHouseFrame.setVisible(true);


        HouseComponent theHouseComponent = new HouseComponent();
        theHouseFrame.add(theHouseComponent);
    }
}