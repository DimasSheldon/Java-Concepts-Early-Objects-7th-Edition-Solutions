package EKPL.Chapter6_Loops.PracticeExercise.P6_1;

import java.util.ArrayList;

/**
 * Created by Sheldon on 11/14/2016.
 * This program builds the funtions to calculate the mean and
 * standard deviation values of data set.
 * P6.1
 */
public class DataSet {
  private ArrayList<Double> dataSet;
  private double _sumData;
  private double _squaredSumData;
  private double _average;
  private double _stdDeviation;

  /**
   * Construct an object of data set
   */
  public DataSet() {
    dataSet = new ArrayList<>();
    _sumData = 0;
    _squaredSumData = 0;
  }

  /**
   * Generates the data set by adding the values to the list
   * @param value the value to be stored in data set
   */
  public void generateDataSet(double value) {
    dataSet.add(value);
  }

  /**
   * Counts the summation of all values in data set
   * @param index the index of each value in the data-set list
   */
  public void countValues(int index) {
    _sumData = _sumData + dataSet.get(index);
  }

  /**
   * Counts the summation of all squared values in data set
   * @param index the index of each value in the data-set list
   */
  public void countSquaredData(int index) {
    _squaredSumData = _squaredSumData + Math.pow(dataSet.get(index), 2);
  }

  /**
   * Calculates the average value of data set
   */
  public void average() {
    _average = _sumData / dataSet.size();
  }

  /**
   * Calculates the standard deviation value of data set
   */
  public void stdDev() {
    int N = dataSet.size();
    double variance = (_squaredSumData - (Math.pow(_sumData, 2) / N)) / (N - 1);
    _stdDeviation = Math.sqrt(variance);
  }

  /**
   * Get the values summation of data set
   * @return the summation value
   */
  public double get_sumData() {
    return _sumData;
  }

  /**
   * Get the squared-values summation of data set
   * @return the summation value
   */
  public double getSquaredSumData() {
    return _squaredSumData;
  }

  /**
   * Get the average value of data set
   * @return the average value
   */
  public double getAverage() {
    return _average;
  }

  /**
   * Get the standard deviation value of data set
   * @return the standard deviation value
   */
  public double getStdDeviation() {
    return _stdDeviation;
  }

  /**
   * Get the data length of data-set list
   * @return the data length
   */
  public int length() {
    return dataSet.size();
  }

  /**
   * Get the data-set list value
   * @return the data-set values
   */
  public ArrayList<Double> getDataSet() { return dataSet;
  }
}