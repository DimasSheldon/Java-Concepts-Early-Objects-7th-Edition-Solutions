package EKPL.Chapter3_ImplementingClasses.HELLO;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Sheldon on 10/30/2016.
 * E3.20
 */
public class HelloDraw extends JComponent {
    //private int xPos = JOptionPane.showInputDialog(null, "Set x ordinate start point");
    private int xPos = 50;
    private int yPos = 110;
    private int dimension = 100;

    /**
     * @param g
     */
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        LetterH h = new LetterH(xPos, yPos, dimension);
        LetterE e = new LetterE(xPos, yPos, dimension);
        LetterL l = new LetterL(xPos, yPos, dimension);
        LetterO o = new LetterO(xPos, yPos, dimension);
        h.draw(g2);
        e.draw(g2);
        l.draw(g2);
        o.draw(g2);

    }

    public static void main(String[] args) {
        JFrame theFrame = new JFrame();
        theFrame.setSize(600, 400);
        theFrame.setTitle("HELLO");
        theFrame.getContentPane().setBackground(Color.WHITE);
        theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        theFrame.setVisible(true);

        HelloDraw helloComponent = new HelloDraw();
        theFrame.add(helloComponent);
    }
}