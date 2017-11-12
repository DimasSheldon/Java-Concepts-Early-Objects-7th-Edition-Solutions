package EKPL.Chapter4_FundamentalDataType.Tiles;

/**
 * Created by Sheldon on 11/2/2016.
 */
public class Tiles {
  public static void main(String[] args) {
    int totalWidth = 100;
    int tileWidth = 5;
    int numberOfPairs = (totalWidth - tileWidth) / (2 * tileWidth);
    int numberOfTiles = 1 + 2 * (int) numberOfPairs;
    double eachEndGap = (double) (totalWidth - numberOfTiles * tileWidth) / 2;
    System.out.printf("Total Width %10s%4s%7s%n", ": ", totalWidth, "inches");
    System.out.printf("Tile width %11s%4s%7s%n", ": ", tileWidth, "inches");
    System.out.printf("Number of Pairs %6s%4s%6s%n", ": ", numberOfPairs, "pairs");
    System.out.printf("Number of Tiles %6s%4s%6s%n", ": ", numberOfTiles, "tiles");
    System.out.printf("Gap each end %9s%4s%7s%n", ": ", eachEndGap, "inches");

  }
}
