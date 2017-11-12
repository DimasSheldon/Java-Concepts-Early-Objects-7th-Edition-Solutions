package EKPL.Chapter8_DesigningClasses.E8_15.Money;

/**
 * Created by Sheldon on 11/26/2016.
 * E8.15
 */
public class CashRegister {
  private double purchase;
  private double payment;

  public CashRegister() {
    purchase = 0;
    payment = 0;
  }

  public void recordPurchase(double amount) {
    purchase = purchase + amount;
  }

  public void receivePayment(int coinCount, Coin coinType) {
    payment = payment + coinCount * coinType.getValue();
  }

  public double getPurchase() {
    return purchase;
  }

  public double getPayment() {
    return payment;
  }

  public double giveChange() {
    double change = payment - purchase;
    purchase = 0;
    payment = 0;
    return change;
  }
}