package EKPL.Chapter3_ImplementingClasses.ExpandingBalloon;

/**
 * Created by Sheldon on 10/31/2016.
 */
public class Balloon {
    private double radius;
    private double volume;

    /**
     *
     */
    public Balloon() {

    }

    /**
     * @param amount
     */
    public void inflate(double amount) {
        radius = radius + amount;
    }

    /**
     * @return
     */
    public double getVolume() {
        volume = Math.PI * radius * radius;
        return volume;
    }

    /**
     * @return
     */
    public double getRadius() {
        return radius;
    }

    public static void main(String[] args) {
        Balloon theBalloon = new Balloon();
//        theBalloon.inflate(20);
//        double volume = theBalloon.getVolume();
//        System.out.println("Balloon's volume: " + volume);

        for (double i = 0; i < 100; i += 7) {
            theBalloon.inflate(i);
            System.out.println("Balloon's radius: " + theBalloon.getRadius());
            double volume = theBalloon.getVolume();
            System.out.println("Balloon's volume: " + volume);
        }
    }
}
