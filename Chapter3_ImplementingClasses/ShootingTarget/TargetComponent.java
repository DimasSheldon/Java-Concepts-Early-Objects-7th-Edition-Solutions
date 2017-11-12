package EKPL.Chapter3_ImplementingClasses.ShootingTarget;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Sheldon on 10/30/2016.
 */
public class TargetComponent extends JComponent {
    /**
     * @param g
     */
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        Target theTarget = new Target(200, 150, 300);
        theTarget.draw(g2);
    }
}
