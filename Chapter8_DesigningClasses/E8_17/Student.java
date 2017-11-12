package EKPL.Chapter8_DesigningClasses.E8_17;

import java.util.ArrayList;

/**
 * Created by Sheldon on 11/28/2016.
 * E8.17
 */
public class Student {
  private ArrayList<Double> scores;
  private int scoreCapacity;

  public Student(int capacity) {
    scores = new ArrayList<>();
    scoreCapacity = capacity;
  }

  public boolean addScore(double score) {
    if (scores.size() < scoreCapacity) {
      scores.add(score);
      return true;
    } else {
      System.out.println("Too many scores.");
      return false;
    }
  }

  private double minimum() {
    double min = scores.get(0);
    for (int i = 1; i < scores.size(); i++) {
      if (scores.get(i) <= min) {
        min = scores.get(i);
      }
    }
    return min;
  }

  private double sum() {
    double total = 0;
    for (double score : scores) {
      total = total + score;
    }
    return total;
  }

  public double finalScore() {
    if (scores.size() == 0) {
      return 0;
    } else if (scores.size() == 1) {
      return scores.get(0);
    } else {
      return sum() - minimum();
    }
  }

  public double getMin() {
    return minimum();
  }

  public ArrayList<Double> getScores() {
    return scores;
  }
}