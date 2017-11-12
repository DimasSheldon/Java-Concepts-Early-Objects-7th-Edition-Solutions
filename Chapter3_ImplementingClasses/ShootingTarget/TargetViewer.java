package EKPL.Chapter3_ImplementingClasses.ShootingTarget;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Sheldon on 10/30/2016.
 */
public class TargetViewer {
    public static void main(String[] args) {
        JFrame theFrame = new JFrame();
        theFrame.setSize(800, 600);
        theFrame.getContentPane().setBackground(Color.GRAY);
        theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        theFrame.setVisible(true);

        TargetComponent theTargetComponent = new TargetComponent();
        theFrame.add(theTargetComponent);

    }
}
