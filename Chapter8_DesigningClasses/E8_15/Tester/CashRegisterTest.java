package EKPL.Chapter8_DesigningClasses.E8_15.Tester;

import EKPL.Chapter8_DesigningClasses.E8_15.Money.CashRegister;
import EKPL.Chapter8_DesigningClasses.E8_15.Money.Coin;

/**
 * Created by Sheldon on 11/26/2016.
 * E8.15
 */
public class CashRegisterTest {
  public static void main(String[] args) {
    final double QUARTER_VALUE = 0.25;
    final double DIME_VALUE = 0.1;
    final double NICKEL_VALUE = 0.05;
    final double PENNY_VALUE = 0.01;

    CashRegister register = new CashRegister();

    System.out.print("Total purchase\t: ");
    register.recordPurchase(0.75);
    register.recordPurchase(1.50);
    System.out.printf("%.2f%n", register.getPurchase());

    System.out.print("Payment\t\t\t: ");
    register.receivePayment(6, new Coin(QUARTER_VALUE, "quarter"));
    register.receivePayment(8, new Coin(DIME_VALUE, "dime"));
    System.out.printf("%.2f%n", register.getPayment());

    System.out.print("Change\t\t\t: ");
    System.out.printf("%.2f%n", register.giveChange());
    System.out.println("Expected\t\t: 0.05");
    System.out.println("----------------------");

    System.out.print("Total purchase\t: ");
    register.recordPurchase(1.00);
    register.recordPurchase(1.25);
    System.out.printf("%.2f%n", register.getPurchase());

    System.out.print("Payment\t\t\t: ");
    register.receivePayment(20, new Coin(NICKEL_VALUE, "nickel"));
    register.receivePayment(125, new Coin(PENNY_VALUE, "penny"));
    System.out.printf("%.2f%n", register.getPayment());

    System.out.print("Change\t\t\t: ");
    System.out.printf("%.2f%n", register.giveChange());
    System.out.println("Expected\t\t: 0.00");
  }
}