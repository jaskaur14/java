import java.util.Random;
public class BankAccount {
    // static variables
    public static int accounts = 0;
    public static double totalMoney = 0; // refers to the sum of all bank account checking and savings balances
    // CONSTRUCTOR
    private double checkingBalance;
    private double savingsBalance;

    public BankAccount() {
        // Be sure to increment the number of accounts
        BankAccount.accounts += 1;
        // this refers to current object within context of constructor
        this.checkingBalance = 0;
        this.savingsBalance = 0;
    }
    // GETTER for checkings
    public double getCheckingBalance() {
        return this.checkingBalance;
    }
    // GETTER for savings
    public double getSavingsBalance() {
        return this.savingsBalance;
    }

    // METHODS

    public void deposit(double amount, String account) {
        if(account.equals("savings")) {
            this.savingsBalance += amount;
        }
        else if(account.equals("checking")) {
            this.checkingBalance += amount;
        }
        BankAccount.totalMoney += amount;
    }

    public void withdraw(double amount, String account) {
        // setting bool to false makes it easier to run; no need to create extra if statements
        boolean sufficient = false;
        if (account.equals("savings")) {
            // this is checking if theres enough in the account
            if(this.savingsBalance - amount >= 0) {
                sufficient = true;
                this.savingsBalance -= amount;
            }
        }
        // same format as above but for checking balance
        else if(account.equals("checking")) {
            if(this.checkingBalance - amount >= 0) {
                sufficient = true;
                this.checkingBalance -= amount;
            }
        }
        if(sufficient) {
            BankAccount.totalMoney -= amount;
        }
        else {
            System.out.println("Insufficient");
        }
    }

    public void accountBalance() {
        System.out.println(String.format("Savings: %s, Checking: %s", this.savingsBalance, this.checkingBalance));
    }
    // GETTERS
    // for checking, savings, accounts, and totalMoney
    // METHODS
    // deposit
    // - users should be able to deposit money into their checking or savings account
    // withdraw 
    // - users should be able to withdraw money from their checking or savings account
    // - do not allow them to withdraw money if there are insufficient funds
    // - all deposits and withdrawals should affect totalMoney
    // getBalance
    // - display total balance for checking and savings of a particular bank account
}
