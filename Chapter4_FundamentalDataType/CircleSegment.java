package EKPL.Chapter4_FundamentalDataType;

/**
 * Created by Sheldon on 11/3/2016.
 */
public class CircleSegment {
  public static void main(String[] args) {
    double c = 10.0;
    double d = 12.0;
    double r = d * 0.5;
    System.out.printf("Radius %14s%,10.2f%7s%n", "(r)= ", r, " inches");
    double delta = Math.sqrt(Math.pow(r, 2) - Math.pow(c * 0.5, 2));
    System.out.printf("(r-h) %15s%,10.2f%7s%n", "= ", delta, " inches");
    double h = r - delta;
    System.out.printf("Segment height %6s%,10.2f%7s%n", "(h)= ", h," inches");

    double A = (2.0 / 3.0 * c * h) + (Math.pow(h, 3) / (2 * c));
    System.out.printf("Segment Area %8s%,10.2f%7s%n", "(A)= ",A , " inches");
  }
}
