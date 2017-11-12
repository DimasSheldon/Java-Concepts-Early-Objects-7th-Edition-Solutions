package EKPL.Chapter3_ImplementingClasses.Stars;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Sheldon on 10/31/2016.
 */
public class StarViewer {
    public static void main(String[] args) {
        JFrame theStarFrame = new JFrame();
        theStarFrame.setSize(400, 400);
        theStarFrame.getContentPane().setBackground(Color.WHITE);
        theStarFrame.setTitle("The Stars");
        theStarFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        theStarFrame.setVisible(true);

        StarComponent theStarComponent = new StarComponent();
        theStarFrame.add(theStarComponent);
    }
}
