package EKPL.Chapter4_FundamentalDataType.Balloon;

/**
 * Created by Sheldon on 11/1/2016.
 * E4.23
 * A program that calculates the balloon volume after
 * certain amount air is loaded
 */
public class Balloon {
  private double _volume; //holds the added volume
  private double _surfaceArea;  //holds the surface area
  private double _radius; //holds the radius

  /**
   * Construct a balloon object without parameters
   */
  public Balloon() {
  }

  /**
   * Construct a balloon object with specified volume
   *
   * @param volume the specified volume
   */
  public Balloon(double volume) {
    _volume = volume;
  }

  /**
   * Calculate the current volume after certain amount of air is loaded
   *
   * @param amount the air volume
   */
  public void addAir(double amount) {
    _volume = _volume + amount;
  }

  /**
   * Calculate the balloon radius
   */
  public void calculateRadius() {
    final double MULTIPLIER = 3;
    final double DIVIDER = 4;
    double r = (_volume * MULTIPLIER) / (DIVIDER * Math.PI);
    _radius = Math.cbrt(r);
  }

  /**
   * Calculate the balloon surface area
   */
  public void calculateSurfaceArea() {
    final double MULTIPLIER = 4.0;
    _surfaceArea = MULTIPLIER * Math.PI * _radius * _radius;
  }

  /**
   * Get the current balloon volume
   *
   * @return the balloon volume
   */
  public double getVolume() {
    return _volume;
  }

  /**
   * Get the current balloon surface area
   *
   * @return the suface area
   */
  public double getSurfaceArea() {
    return _surfaceArea;
  }

  /**
   * Get the current balloon radius
   *
   * @return the radius
   */
  public double getRadius() {
    return _radius;
  }
}