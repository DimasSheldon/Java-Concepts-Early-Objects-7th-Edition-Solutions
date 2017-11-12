package EKPL.Chapter6_Loops.PracticeExercise.P6_14;

import java.util.ArrayList;

/**
 * Created by Sheldon on 11/15/2016.
 * This program simulates the calculation of cross-section area of
 * ship hull at x point, where each x is part of hull's length.
 * P6.14
 */
public class ShipHullSection {
  private double _beam;   // B
  private double _length; // L
  private double _draft;  // T
  private double _x;      // x
  private int _n;         // n
  private ArrayList<Double> lengthY;
  private double _halfSectionArea;
  private final double DELTA; // the delta of current point to next point of z

  /**
   * Contsrutcs the object of ShipHullSection class
   * @param beam the overall width of the ship measured at the widest point of the nominal waterline
   * @param length the distance between the forwardmost and aftermost parts of the ship
   * @param draft the vertical distance from the bottom of the keel to the waterline
   * @param x the x position where the section is crossing the hull
   * @param n the sampling rate to get smooth hull edges
   */
  public ShipHullSection(double beam, double length, double draft, double x, int n) {
    _beam = beam;
    _length = length;
    _draft = draft;
    _x = x;
    _n = n;
    DELTA = _draft / _n;
  }

  /**
   * Calculates the y sizes at z points
   */
  public void calculate_ySize() {
    final double EPSILON = 1E-14;
    lengthY = new ArrayList<>(); // a list to store the length of y
    for (double z = 0; z < _draft || Math.abs(z - _draft) <= EPSILON; z += DELTA) {
      double y = (_beam / 2) * (1 - Math.pow((2 * _x ) / _length, 2)) * (1 - Math.pow((z / _draft), 2));
      lengthY.add(Math.abs(y)); // add y-size at point z to the list
    }
  }

  /**
   * Calculates the area of half-section by summing its sampled-trapezoids area
   */
  public void halfSectionArea() {
    for (int i = 1; i < lengthY.size(); i++) { // get the sides from y-size list
      double trapezoidArea = ((lengthY.get(i - 1) + lengthY.get(i)) / 2) * DELTA;
      _halfSectionArea = _halfSectionArea + trapezoidArea;
    }
  }

  /**
   * Get the section area at x point by multiplying its half-area by two
   * @return the section area at x point
   */
  public double getSectionArea() {
    return _halfSectionArea * 2;
  }
}