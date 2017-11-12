package EKPL.Chapter3_ImplementingClasses.BankAccount;

/**
 * Created by Sheldon on 10/13/2016.
 * A bank account has a balance that can be changed by deposits and withdrawals.
 *
 * E2.3, E2.4
 */
public class BankAccount {
    private double balance;

    /**
     * Constructs a bank account with a zero balance.
     */
    public BankAccount() {
        balance = 0;
    }

    /**
     * Consturcts a bank account with a given balance
     *
     * @param initialBalance the initital balance
     */
    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    /**
     * Deposits money into the bank account.
     *
     * @param amount the amount to deposit
     */
    public void deposit(double amount) {
        balance = balance + amount;
    }

    /**
     * Withdraws money from the bank account.
     *
     * @param amount the amount to withdraw
     */
    public void withdraw(double amount) {
        balance = balance - amount;
    }

    /**
     * Get the current balance of the bank account
     *
     * @return the current balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Adds interest at given rate
     *
     * @param rate the percentage of rate
     */
    public void addInterest(double rate) {
        balance = balance + (balance * (rate / 100));
    }
}