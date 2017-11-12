package EKPL.Chapter6_Loops.PracticeExercise.E6_5;

import java.util.ArrayList;
// DONE
/**
 * Created by Sheldon on 11/14/2016.
 * This program builds the
 * data set properties functions.
 * E6.5
 */
public class DataSet {
  private double smallest;
  private double largest;
  private ArrayList<Double> dataSet;

  /**
   * Constructs an object of data set and create a list
   * to store the values
   */
  public DataSet() {
    dataSet = new ArrayList<>();
  }

  /**
   * Stores the value to the data-set list
   * @param value the value to be stored
   */
  public void addValue(double value) {
    dataSet.add(value);
    dataSet.sort(null);
  }

  /**
   * Get the smallest value of data set
   * @return the smallest value
   */
  public double getSmallest() {
    smallest = dataSet.get(0);
    return smallest;
  }

  /**
   *Get the largest value of data set
   * @return the largest value
   */
  public double getLargest() {
    largest = dataSet.get(dataSet.size() - 1);
    return largest;
  }

  /**
   * Get the average value of data set
   * @return the average value
   */
  public double getAverage() {
    double sum = 0;
    for (int i = 0; i < dataSet.size(); i++) {
      sum = sum + dataSet.get(i);
    }
    return sum / dataSet.size();
  }

  /**
   * Get the range from largest value to smallest data of data set
   * @return the range
   */
  public double getRange() {
    return largest - smallest;
  }

  /**
   * Get the data-set list
   * @return the data-set list
   */
  public ArrayList getDataSet() {
    return dataSet;
  }
}