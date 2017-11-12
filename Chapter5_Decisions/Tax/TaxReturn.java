package EKPL.Chapter5_Decisions.Tax;

/**
 * Created by Sheldon on 11/28/2016.
 * A tax return of taxpayer in 2008.
 */
public class TaxReturn {
  public static final int SINGLE = 1;
  public static final int MARRIED = 2;

  private static final double RATE1 = 0.10;
  private static final double RATE2 = 0.25;
  private static final double RATE1_SINGLE_LIMIT = 32000;
  private static final double RATE1_MARRIED_LIMIT = 64000;

  private double income;
  private int status;

  public TaxReturn(double anIncome, int aStatus) {
    income = anIncome;
    status = aStatus;
  }

  public double getTax() {
    double tax1 = 0;
    double tax2 = 0;


    // IF Single && income <= RSL {}
    // else Single && income >= RSingle {}
    // then IF Married && income <= RML {}
    // else Married && income >= RML {}


    if (status == SINGLE) {
      if (income <= RATE1_SINGLE_LIMIT) { // State 1
        tax1 = RATE1 * income;
      } else {    // State 2
        tax1 = RATE1 * RATE1_SINGLE_LIMIT;
        tax2 = RATE2 * (income - RATE1_SINGLE_LIMIT);
      }
    } else {
      if (income <= RATE1_MARRIED_LIMIT) {    // State 3
        tax1 = RATE1 * income;
      } else {    // State 4
        tax1 = RATE1 * RATE1_MARRIED_LIMIT;
        tax2 = RATE2 * (income - RATE1_MARRIED_LIMIT);
      }
    }
    return tax1 + tax2;
  }
}