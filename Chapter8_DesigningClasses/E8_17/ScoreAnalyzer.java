package EKPL.Chapter8_DesigningClasses.E8_17;

import java.util.Scanner;

/**
 * Created by Sheldon on 11/28/2016.
 * E8.17
 */
public class ScoreAnalyzer {
  public static void main(String[] args) {
    Student fred = new Student(5);

    System.out.println("Please enter values, Q to quit:");
    Scanner input = new Scanner(System.in);

    while (input.hasNextDouble()) {
      if (!fred.addScore(input.nextDouble())) {
        break;
      }
    }
    System.out.println("Final score\t: " + fred.finalScore());
    System.out.println("Scores\t: " + fred.getScores());
  }
}
