package EKPL.Chapter4_FundamentalDataType.Fuel;

import javax.swing.*;

/**
 * Created by Sheldon on 11/1/2016.
 * E4.10
 * A program that simulates the fuel economy of miles per gallon
 */

public class FuelEfficiencyTester {
  public static void main(String[] args) {
    //Prompt user data
    String strFuelAmount = JOptionPane.showInputDialog("How many gallons of fuel in your tank?");
    String strMilesPerGallon = JOptionPane.showInputDialog("Input the fuel efficiency (mpg)");
    String strPrice = JOptionPane.showInputDialog("Input the price per gallon of fuel ($)");

    double fuelAmount = Double.parseDouble(strFuelAmount);
    double mpg = Double.parseDouble(strMilesPerGallon);
    double price = Double.parseDouble(strPrice);

    //Construct the simulator object and calculate the functions
    FuelEfficiency myVehicle = new FuelEfficiency(fuelAmount, mpg, price);
    myVehicle.gallonsPerHundredMiles();
    myVehicle.costPerMiles();
    myVehicle.distance();

    double gallons = myVehicle.getGallons();
    double cost = myVehicle.getCost();
    double distance = myVehicle.getDistance();

    //Display the result
    System.out.println("Within 100 miles, your vehicle needs " + gallons + " gallons of fuel;\n" +
            "it will cost you $" + cost +"\n");
    System.out.println("With " + fuelAmount + " gallons of fuel in your tank,\n" +
            "you can reach " + distance + " miles.");

//    if distance is specified:
//    String strDistance = JOptionPane.showInputDialog("Input the price per gallon of fuel ($)");
//    double theDistance = Double.parseDouble(strDistance);
//    myVehicle.gallonsPerMiles(theDistance); //here's the difference
//    myVehicle.costPerMiles();
//    myVehicle.distance();

//    System.out.println("Within 100 miles, your vehicle needs " + gallons + " gallons of fuel");
//    System.out.println("Within 100 miles, it will cost $" + cost);
//    System.out.println("With " + fuelAmount + " gallons of fuel in your tank,\n" +
//            "you can reach " + distance + " miles");
  }
}