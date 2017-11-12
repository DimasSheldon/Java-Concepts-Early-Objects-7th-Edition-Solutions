package EKPL.Chapter5_Decisions;

import java.util.Scanner;

/**
 * Created by Sheldon on 11/4/2016.
 * This program simulates an elevator panel that skips the 13 floor.
 */
public class ElevatorSimulation {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Floor: ");
    int floor = in.nextInt();

    //Adjust floor if necessary

    int actualFloor;
    if (floor > 13) {
      actualFloor = floor - 1;
    } else {
      actualFloor = floor;
    }

    System.out.println("The elevator will travel to the actual floor " + actualFloor);
  }
}
