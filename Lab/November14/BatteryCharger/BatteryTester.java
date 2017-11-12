package EKPL.Lab.November14.BatteryCharger;

/**
 * Created by Sheldon on 10/31/2016.
 * P3.5
 * A program that simulates a battery
 */
public class BatteryTester {
  public static void main(String[] args) {
    // Construct a new battery object
    Battery liPolymerBatt = new Battery(3000);

    // Drain the battery capacity
    liPolymerBatt.drain(4000);
    double originalCapacity = liPolymerBatt.getOriginalCapacity();
    System.out.println("Battery capacity: " + originalCapacity + " mAh");
    System.out.println("Battery remaining capacity: " + liPolymerBatt.getRemainingCapacity() + " mAh");

    // Charge the battery
    liPolymerBatt.charge();
    System.out.println("Battery charged capacity: " + liPolymerBatt.getRemainingCapacity() + " mAh");
  }
}
