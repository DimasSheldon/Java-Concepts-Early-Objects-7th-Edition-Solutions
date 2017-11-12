package EKPL.Chapter8_DesigningClasses.E8_5_9;

import java.awt.geom.Ellipse2D;

/**
 * Created by Sheldon on 11/24/2016.
 * A program for geometries' property formulas.
 * E8.5 & E8.9
 */
public class Geometry {
  /**
   * Constructs an object of geometry class
   */
  public Geometry() {
  }

  /**
   * Calculates the volume of a cube with given height.
   * @param h the height of the cube
   * @return the volume
   */
  public static double cubeVolume(double h) {
    double vol = Math.pow(h, 3);
    return vol;
  }

  /**
   * Calculates the surface area of a cube with given height
   * @param h the height of the cube
   * @return the surface area
   */
  public static double cubeSurface(double h) {
    return Math.pow(h, 2) * 6;
  }

  /**
   * Calculates the spehere volume
   * @param r the radius of sphere
   * @return the volume
   */
  public static double sphereVolume(double r) {
    final double MULTIPLIER = 4 / 3;
    return MULTIPLIER * Math.PI * Math.pow(r, 3);
  }

  /**
   * Calculates the surface area of sphere
   * @param r the radius of sphere
   * @return the surface area
   */
  public static double sphereSurface(double r) {
    final double MULTIPLIER = 4;
    return MULTIPLIER * Math.PI * Math.pow(r, 2);
  }

  /**
   * Calculates cylinder volume
   * @param r the radius of cylinder base
   * @param h the height of cylinder
   * @return the volume
   */
  public static double cylinderVolume(double r, double h) {
    double baseArea = Math.PI * Math.pow(r, 2);
    return baseArea * h;
  }

  /**
   * Calculates cylinder surface area
   * @param r the radius of cylinder base
   * @param h the height of cylinder
   * @return the surface area
   */
  public static double cylinderSurface(double r, double h) {
    return (2 * Math.PI * r * h) + (2 * Math.PI * Math.pow(r, 2));
  }

  /**
   * Calculates cone volume
   * @param r the radius of cone base
   * @param h the height of cone
   * @return the volume
   */
  public static double coneVolume(double r, double h) {
    return Math.PI * Math.pow(r, 2) * (h / 3);
  }

  /**
   * Calculates cone surface area
   * @param r the radius of cone base
   * @param h the height of cone
   * @return the surface area of cone
   */
  public static double coneSurface(double r, double h) {
    return Math.PI * r * (r + Math.sqrt(Math.pow(h, 2) + Math.pow(r, 2)));
  }

  /**
   * Calculates ellipse perimeter using Ramanujan's approximation formula
   * @param e the object of an ellipse
   * @return the perimeter
   */
  public static double ellipsePerimeter(Ellipse2D.Double e) {
    double a = e.getWidth();
    double b = e.getHeight();
    return Math.PI * (3 * (a + b) - Math.sqrt((3 * a + b) * (a + 3 * b)));
  }

  /**
   * Calculates ellipse volume
   * @param e the object of an ellipse
   * @return the volume
   */
  public static double ellipseArea(Ellipse2D.Double e) {
    double a = e.getWidth();
    double b = e.getHeight();
    return Math.PI * a * b;
  }
}