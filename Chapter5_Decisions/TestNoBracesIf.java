package EKPL.Chapter5_Decisions;

import java.util.Scanner;

/**
 * Created by Sheldon on 11/5/2016.
 */
public class TestNoBracesIf {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int number = input.nextInt();

    if (number == 0)
      number = 1; // is in the if body
      System.out.println(number); //isn't in the if body
  }
}