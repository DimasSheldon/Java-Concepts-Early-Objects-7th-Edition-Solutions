package EKPL.Chapter3_ImplementingClasses.SavingsAccount;

/**
 * Created by Sheldon on 10/30/2016.
 * <p>
 * E3.5
 */
public class SavingsAccountTester {
    public static void main(String[] args) {
        SavingsAccount sheldonSavings = new SavingsAccount(1000, 10);
        sheldonSavings.addInterest();
        sheldonSavings.addInterest();
        sheldonSavings.addInterest();
        double theBalance = sheldonSavings.getBalance();
        System.out.println("Sheldon's savings balance: $" + theBalance);
    }

}
