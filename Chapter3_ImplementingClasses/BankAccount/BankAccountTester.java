package EKPL.Chapter3_ImplementingClasses.BankAccount;

/**
 * Created by Sheldon on 10/13/2016.
 * A class to test the BackAccount class
 *
 * E2.3, E2.4
 */
public class BankAccountTester {
    /**
     * Tests the methods of the BankAccount class
     *
     * @param args used
     */
    public static void main(String[] args) {
        BankAccount sheldonAccount = new BankAccount(1000);
        sheldonAccount.deposit(1000);
        sheldonAccount.withdraw(500);
        sheldonAccount.withdraw(400);
        sheldonAccount.addInterest(10);     // 10 percent interest
        double balance = sheldonAccount.getBalance();

        System.out.println("Sheldon's balance = $" + balance);
        System.out.println("Sheldon's balance (expected) = $1210");
    }
}