package EKPL.Chapter4_FundamentalDataType.Fuel;

/**
 * Created by Sheldon on 10/31/2016.
 * A program that calculates the fuel economy of miles per gallon
 */
// Pseudocodes
// user input : fuel in tank
//              mpg (distance(miles) can be reached per 1 gallon)
//              price per gallon
// output     : cost per 100 miles
//              distance can be reached by the fuel in tank
// miles per gallon = distance / fuelconsumed ~ user input
// gallons per mile = 1 / mpg
// gallons per 100 miles = gallons per mile * 100
// cost per 100 miles = gallonsper100miles * price
// distance can reached by fuel in tank = miles per gallon * gallons

public class FuelEfficiency {
  private double _fuelAmount; //holds the fuel amount in the tank
  private double _milesPerGallon; //holds the distance reached per 1 gallon of fuel
  private double _pricePerGallon; //holds the price per 1 gallon of fuel
  private double _gallonsPerMiles; //holds the fuel needed per specified miles
  private double _cost; //holds the cost per specified miles
  private double _distance; //holds the distance can be reached with remaining fuel

  /**
   * Constructs the fuel economy simulator object with
   * specified fuel reamining, mpg rate, and price per gallon of fuel
   *
   * @param fuelAmount the remaining fuel amount in tank
   * @param mpg        the distance in miles can be reached per 1 gallon
   * @param price      the price per 1 gallon of fuel
   */
  public FuelEfficiency(double fuelAmount, double mpg, double price) {
    _fuelAmount = fuelAmount;
    _milesPerGallon = mpg;
    _pricePerGallon = price;
  }

  /**
   * Calculates the fuel amount(gallons) needed per specified miles
   *
   * @param distance the specified distance(miles)
   */
  public void gallonsPerMiles(double distance) {
    final double GALLON_PER_MILE = (1 / _milesPerGallon);
    _gallonsPerMiles = GALLON_PER_MILE * distance;
  }

  /**
   * Calculates the fuel amount(gallons) needed per 100 miles
   */
  public void gallonsPerHundredMiles() {
    final double DISTANCE = 100.0;
    final double GALLON_PER_MILE = (1 / _milesPerGallon);
    _gallonsPerMiles = GALLON_PER_MILE * DISTANCE;
  }

  /**
   * Calculates the cost per miles
   */
  public void costPerMiles() {
    _cost = _gallonsPerMiles * _pricePerGallon;
  }

  /**
   * Calculates the distance reached with remaining fuel
   */
  public void distance() {
    _distance = _fuelAmount * _milesPerGallon;
  }

  /**
   * Get the remaining fuel amount
   *
   * @return the fuel amount
   */
  public double getFuelAmount() {
    return _fuelAmount;
  }

  /**
   * Get the amount of fuel(gallons) needed per specified miles
   *
   * @return the gallons of fuel
   */
  public double getGallons() {
    return _gallonsPerMiles;
  }

  /**
   * Get the cost per specified miles
   *
   * @return the cost
   */
  public double getCost() {
    return _cost;
  }

  /**
   * Get the distance reached with remaining fuel
   *
   * @return the distance
   */
  public double getDistance() {
    return _distance;
  }
}