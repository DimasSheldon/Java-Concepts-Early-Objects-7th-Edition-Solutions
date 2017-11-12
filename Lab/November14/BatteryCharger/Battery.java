package EKPL.Lab.November14.BatteryCharger;


/**
 * Created by Sheldon on 10/31/2016.
 * P3.5
 */
public class Battery {
  private double capacity;
  private double originalCapacity;

  /**
   * Construct a battery object with initial capacity given
   *
   * @param initialCapacity the battery initial capacity
   */
  public Battery(double initialCapacity) {
    capacity = initialCapacity;
    originalCapacity = initialCapacity;
  }

  /**
   * Drain the capacity of battery with amount given
   *
   * @param amount the draining amount
   */
  public void drain(double amount) {
    capacity = Math.max(capacity -= amount, 0);
  }

  /**
   * Charge the battery, return the original capacity
   */
  public void charge() {
    capacity = Math.min(capacity += originalCapacity, originalCapacity);
  }

  /**
   * Get the remaining capacity
   *
   * @return the remaining capacity
   */
  public double getRemainingCapacity() {
    return capacity;
  }

  /**
   * Get the original capacity
   *
   * @return the original capacity
   */
  public double getOriginalCapacity() {
    return originalCapacity;
  }
}
