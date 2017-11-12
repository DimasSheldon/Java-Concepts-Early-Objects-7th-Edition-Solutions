package EKPL.Chapter3_ImplementingClasses.ItalianFlagDrawer;

import javax.swing.JFrame;
/**
 * Created by Sheldon on 10/13/2016.
 */
public class ItalianFlagViewer {
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ItalianFlagComponent component = new ItalianFlagComponent();
        frame.add(component);
        frame.setVisible(true);
    }
}
