package EKPL.Chapter3_ImplementingClasses.CashRegister;

import java.util.ArrayList;

/**
 * Created by Sheldon on 10/13/2016.
 * A cash register totals up sales and computes change due.
 * E3.6
 */
public class CashRegister {
    private double purchase;
    private double payment;
    ArrayList<Double> prices = new ArrayList<Double>();

    /**
     * Constructs a cash register with no money in it.
     */
    public CashRegister() {
    }

    /**
     * Records the sale of an item.
     *
     * @param amount the price of the item
     */
    public void recordPurchases(double amount) {
        prices.add(amount);
        purchase = purchase + amount;
    }

    /**
     * Processes a payment received from the customer
     *
     * @param amount the amount of payment
     */
    public void receivePayment(double amount) {
        payment = payment + amount;
    }

    /**
     * computes the change due and resets the machine for the next customer
     *
     * @return the change due to the customer
     */
    public double giveChange() {
        double change = payment - purchase;
        purchase = 0;
        payment = 0;
        return change;
    }

    /**
     * Method to print the prices of all purchased items
     * and the total amount due
     */
    public void printReceipt() {
        System.out.println("Prices: $" + prices);
        System.out.println("Total: $" + purchase);
        System.out.println("Payment: $" + payment);
    }
}