package EKPL.Chapter2_UsingObject.E2_10;

import javax.swing.JFrame;
import java.awt.Color;

/**
 * Created by Sheldon on 10/23/2016.
 * E2.10
 * Darken two color objects once and twice
 */
public class DarkerDemo {
    public static void main(String[] args) {
    // Construct first color object, darken it once
        Color theFirstColor = Color.RED.darker();

    // Construct first frame
        JFrame firstFrame = new JFrame();
        firstFrame.setSize(250, 250);
        firstFrame.setTitle("First Color");
        firstFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        firstFrame.setVisible(true);

    // Apply first color to frame's background
        firstFrame.getContentPane().setBackground(theFirstColor);

    // Construct first color object, darken it twice
        Color theSecondColor = theFirstColor.darker();

    // Construct second frame
        JFrame secondFrame = new JFrame();
        secondFrame.setSize(250, 250);
        secondFrame.setTitle("Second Color");
        secondFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        secondFrame.setVisible(true);

    // Apply second color to frame's background
        secondFrame.getContentPane().setBackground(theSecondColor);

    // Display the result
        System.out.println("Color darken once: " + theFirstColor);
        System.out.println("Color darken twice: " + theSecondColor);
    }
}
