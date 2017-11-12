package EKPL.Lab.November21.E6_16;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Sheldon on 11/21/2016.
 * This program will draws a diamond built from asterisks.
 * E6.16
 */
public class DiamondAsterisk {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("How many rows of asterisk diamond do you want? ");
    int input = in.nextInt();
    int rowLength = input;
    System.out.println("\t\t\t|As you wish|\n");
    ArrayList<Integer> asterisks = new ArrayList<>();
    ArrayList<Integer> spaces = new ArrayList<>();

    for (int i = 1; i < input * 2; i += 2) {
      asterisks.add(i);
    }

    for (int element : asterisks) {
      spaces.add(rowLength - element);
      rowLength++;
    }

    for (int i = 0; i < input; i++) {
      for (int j = 0; j < spaces.get(i); j++) {
        System.out.print(" ");
      }
      for (int k = 0; k < asterisks.get(i); k++) {
        System.out.print("*");
      }
      System.out.println();
    }

    for (int i = input - 2; i >= 0; i--) {
      for (int j = 0; j < spaces.get(i); j++) {
        System.out.print(" ");
      }
      for (int k = 0; k < asterisks.get(i); k++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}