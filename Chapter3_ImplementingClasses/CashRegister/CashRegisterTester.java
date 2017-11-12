package EKPL.Chapter3_ImplementingClasses.CashRegister;

/**
 * Created by Sheldon on 10/13/2016.
 * E3.6
 */
public class CashRegisterTester {
    public static void main(String[] args) {
        CashRegister register = new CashRegister();
        register.recordPurchases(29.50);
        register.recordPurchases(9.25);
        register.recordPurchases(10.25);
        register.receivePayment(50);
        register.printReceipt();
        double change = register.giveChange();
        System.out.println("Change: $" + change);
    }
}