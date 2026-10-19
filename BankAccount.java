/**
 * The BankAccount class works to represent a savings bank account, tracking aspects such as balance, total deposits / withdrawls,
 * and interest earned. This also includes functions which add or subtract from such statistics, as well as calculating interest.
 * @author Alan Wu, awu007@student.sdccd.edu
 * @since 10/18/2026
 * @version v1.0
 */

public class BankAccount {
    private double balance;
    private double deposit;
    private double withdraw;
    private double interest;
    private double monthlyIntRate;
    
    /**
     * Creates an empty bank accont, setting the monthly interest as an annual 4.4% divided into a monthly rate.
     */
    public BankAccount() {
        balance = deposit = withdraw = interest = 0.0;
        monthlyIntRate = 0.044 / 12;
    }
    
    /**
     * Creates a bank accont with desired integer starting balance and interest rate, which is divided into a monthly amount.
     * @param inBalance Starting balance in whole dollars.
     * @param intRate The annual interest rate in percentage.
     */
    public BankAccount(int inBalance, double intRate) {
        balance = inBalance;
        monthlyIntRate = intRate/100/12;
    }
    
    /**
     * Creates a bank accont with desired starting balance and interest, which is divided into a monthly amount.
     * @param inBalance Starting balance.
     * @param intRate The annual interest rate in percentage.
     */
    public BankAccount(double inBalance, double intRate) {
        balance = inBalance;
        monthlyIntRate = intRate/100.0/12.0;
    }
    
    /**
     * Adds and tracks a deposit to an account.
     * @param add The amount added to an account.
     */
    public void makeDeposit(double add) {
        balance += add;
        deposit += add;
    }
    
    /**
     * Adds and tracks a whole-number deposit to an account.
     * @param add The whole-number amount added to an account.
     */
    public void makeDeposit(int add) {
        balance += add;
        deposit += add;
    }
    
    /**
     * Subtracts and tracks a withdrawl from an account.
     * @param sub The amount withdrawn from an account.
     */
    public void makeWithdraw(double sub) {
        balance -= sub;
        withdraw += sub;
    }
    
    /**
     * Subtracts and tracks a whole-number withdrawl from an account.
     * @param sub The whole-number amount withdrawn from an account.
     */
    public void makeWithdraw(int sub) {
        balance -= sub;
        withdraw += sub;
    }
    
    /**
     * Calculates and adds monthly interest to an account if they have a positive balance.
     */
    public void calcInterest() {
        if (balance > 0) {
            balance += balance*monthlyIntRate;
            interest += balance*monthlyIntRate;
        }
    }
    
    /**
     * Returns the current account balance.
     * @return The current account balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Returns the total amount deposited.
     * @return The total amount of deposits
     */
    public double getDeposit() {
        return deposit;
    }
    
    /**
     * Returns the total amount withdrawn.
     * @return The total amount withdrawn
     */
    public double getWithdraw() {
        return withdraw;
    }
    
    /**
     * Returns the total amount of interest earned.
     * @return The total interest
     */
    public double getInterest() {
        return interest;
    }
} //End BankAccount