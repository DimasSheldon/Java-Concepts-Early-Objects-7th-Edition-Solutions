package EKPL.Chapter3_ImplementingClasses.SavingsAccount;

/**
 * Created by Sheldon on 10/30/2016.
 * <p>
 * A class that adds interest to the savings account
 * E3.5
 */
public class SavingsAccount {

    private double balance;
    private double interest;

    /**
     *
     * @param initialBalance
     * @param interestRate
     */
    public SavingsAccount(double initialBalance, double interestRate) {
        balance = initialBalance;
        interest = balance * (interestRate / 100);
    }

    /**
     *
     */
    public void addInterest() {
        balance = balance + interest;
    }

    /**
     * Get the current balance of the account
     *
     * @return the current balance
     */
    public double getBalance() {
        return balance;
    }
}
