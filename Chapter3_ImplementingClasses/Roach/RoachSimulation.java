package EKPL.Chapter3_ImplementingClasses.Roach;

import java.util.Scanner;

/**
 * Created by Sheldon on 10/31/2016.
 */
public class RoachSimulation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("The current population of roach: ");
        int population = in.nextInt();
        RoachColoni theColoni = new RoachColoni(population);
        System.out.println("Roach first population: " + theColoni.getRoaches() + " roaches");

        System.out.print("Times the population breeds: ");
        int timesBreed = in.nextInt();
        for (int i = 0; i < timesBreed; i++) {
            theColoni.breed();
        }
        System.out.println("Roach population after breeding: " + theColoni.getRoaches() + " roaches");

        System.out.print("Percentage of insecticide to spray: ");
        double percentage = in.nextInt();
        theColoni.spray(percentage);
        System.out.println("Roach population after spraying: " + theColoni.getRoaches() + " roaches");
    }
}