package EKPL.Chapter6_Loops.Exercise.Match;

import java.util.Scanner;

/**
 * Created by Sheldon on 11/7/2016.
 * This program reads a string and finds the first space.
 */
public class FirstMatch {
  public static void main(String[] args) {
    System.out.print("Input a string:");
    Scanner inString = new Scanner(System.in);
    String theString = inString.next();

    boolean found = false;
    char ch = '?';
    int position = 0;
    while (!found && position < theString.length()) {
      ch = theString.charAt(position);
      if (ch == ' ') {
        System.out.println("Why this line isn't out?");
        found = true;
      } else {
        System.out.println("Space not found at position " + position);
        position++;
      }
    }
    System.out.println("Space found at position " + position);
  }
}