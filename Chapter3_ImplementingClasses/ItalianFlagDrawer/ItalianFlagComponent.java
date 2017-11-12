package EKPL.Chapter3_ImplementingClasses.ItalianFlagDrawer;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Created by Sheldon on 10/13/2016.
 */
public class ItalianFlagComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        ItalianFlag flag = new ItalianFlag(100, 100, 90);
        flag.draw(g2);
    }
}
