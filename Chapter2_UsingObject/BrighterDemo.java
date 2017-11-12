package EKPL.Chapter2_UsingObject.E2_8;

import javax.swing.JFrame;
import java.awt.Color;

/**
 * Created by Sheldon on 10/23/2016.
 * E2.8
 * Compare two or more colors are brighter or darker
 */

public class BrighterDemo {
    public static void main(String[] args) {
    // Construct first color object
        Color theFirstColor = new Color(50, 100, 150);

    // Construct first frame
        JFrame firstFrame = new JFrame();
        firstFrame.setSize(250, 250);
        firstFrame.setTitle("First Color");
        firstFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        firstFrame.setVisible(true);

    // Apply first color to first frame's background color
        firstFrame.getContentPane().setBackground(theFirstColor);

    // Construct second color object
        Color theSecondColor = theFirstColor.brighter();

    // Construct second frame
        JFrame secondFrame = new JFrame();
        secondFrame.setSize(250, 250);
        secondFrame.setTitle("Second Color");
        secondFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        secondFrame.setVisible(true);

    // Apply second color to first frame's background color
        secondFrame.getContentPane().setBackground(theSecondColor);

    // Display the comparison between colors
        System.out.println("1st Color: " + theFirstColor);
        System.out.println("2nd Color: " + theSecondColor);
    }
}
