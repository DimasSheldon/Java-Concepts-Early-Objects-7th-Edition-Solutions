package EKPL.Chapter3_ImplementingClasses.Car;

import javax.swing.JFrame;

/**
 * Created by Sheldon on 10/13/2016.
 * The viewer class of Car & Car Component class
 */
public class CarViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 400);
        frame.setTitle("Two Cars Viewer..LAlaLa");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CarComponent component = new CarComponent();
        frame.add(component);

        frame.setVisible(true);
    }
}