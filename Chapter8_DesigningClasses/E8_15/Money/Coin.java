package EKPL.Chapter8_DesigningClasses.E8_15.Money;

/**
 * Created by Sheldon on 11/26/2016.
 * E8.15
 */
public class Coin {
  private double value;
  private String name;

  public Coin(double aValue, String aName) {
    value = aValue;
    name = aName;
  }

  public double getValue() {
    return value;
  }

  public String getName() {
    return name;
  }
}
