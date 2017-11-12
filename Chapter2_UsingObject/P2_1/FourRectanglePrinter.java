package EKPL.Chapter2_UsingObject.P2_1;

import java.awt.Rectangle;
/**
 * Created by Sheldon on 10/24/2016.
 * P2.1
 */
public class FourRectanglePrinter {
    public static void main(String[] args) {
        Rectangle box = new Rectangle(5, 10, 10, 20);
        System.out.println(box);
        box.translate(10, 0);
        System.out.println(box);
        box.translate(0, 20);
        System.out.println(box);
    }
}
