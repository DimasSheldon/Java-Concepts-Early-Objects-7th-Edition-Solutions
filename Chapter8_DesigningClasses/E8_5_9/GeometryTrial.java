package EKPL.Chapter8_DesigningClasses.E8_5_9;

import javax.swing.*;
import java.awt.geom.Ellipse2D;

/**
 * Created by Sheldon on 11/26/2016.
 * A program that simulates the Geometry class
 * E8.5 & E8.9
 */
public class GeometryTrial {
  public static void main(String[] args) {
    JOptionPane.showMessageDialog(null, "This program computes geometric volume and surface area\n" +
            "with given radius and height.");
    double radius = Double.parseDouble(JOptionPane.showInputDialog("Please input the radius:"));
    double height = Double.parseDouble(JOptionPane.showInputDialog("Please input the height:"));

    Geometry geometry = new Geometry();

    System.out.printf("%25s\n", "CUBE");
    System.out.printf("%25s: %.2f\n", "Cube volume", geometry.cubeVolume(height));
    System.out.printf("%25s: %.2f\n\n", "Cube surface area", geometry.cubeSurface(height));

    System.out.printf("%25s\n", "SPHERE");
    System.out.printf("%25s: %.2f\n", "Sphere volume", geometry.sphereVolume(radius));
    System.out.printf("%25s: %.2f\n\n", "Sphere surface area", geometry.sphereSurface(radius));

    System.out.printf("%25s\n", "CYLINDER");
    System.out.printf("%25s: %.2f\n", "Cylinder volume", geometry.cylinderVolume(radius, height));
    System.out.printf("%25s: %.2f\n\n", "Cylinder surface area", geometry.cylinderSurface(radius, height));

    System.out.printf("%25s\n", "CONE");
    System.out.printf("%25s: %.2f\n", "Cone volume", geometry.coneVolume(radius, height));
    System.out.printf("%25s: %.2f\n\n", "Cone surface area", geometry.coneSurface(radius, height));

    int confirm = JOptionPane.showConfirmDialog(null, "Do you want to calculate Ellipse perimeter and area?",
            "Prompt Confirmation", 0, 1);
    if (confirm == 0) {
      double ellWidth = Double.parseDouble(JOptionPane.showInputDialog("Enter the ellipse width:"));
      double ellHeight = Double.parseDouble(JOptionPane.showInputDialog("Enter the ellipse height:"));
      Ellipse2D.Double ellipse = new Ellipse2D.Double(50, 50, ellWidth, ellHeight);
      System.out.printf("%25s: %.2f\n", "Ellipse perimeter", geometry.ellipsePerimeter(ellipse));
      System.out.printf("%25s: %.2f\n\n", "Ellipse area", geometry.ellipseArea(ellipse));
    }
    System.out.printf("%25s", "Thank you for using this program");
  }
}