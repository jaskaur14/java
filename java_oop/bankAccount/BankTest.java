public class BankTest {
    public static void main(String[] args){
        BankAccount jas = new BankAccount();
        jas.deposit(500, "checking");
        jas.deposit(25, "savings");
        // jas.accountBalance();
        jas.withdraw(1000, "checking");
        jas.withdraw(200, "savings");
        // jas.accountBalance();

        BankAccount jas2 = new BankAccount();
        jas2.deposit(5000, "checking");
        jas2.deposit(250, "savings");
        jas2.accountBalance();
        jas2.withdraw(1000, "checking");
        jas2.withdraw(200, "savings");
        jas2.accountBalance();

        BankAccount jas3 = new BankAccount();
        jas3.deposit(50000, "checking");
        jas3.deposit(2500, "savings");
        jas3.accountBalance();
        jas3.withdraw(10000, "checking");
        jas3.withdraw(2000, "savings");
        jas3.accountBalance();

        System.out.println(BankAccount.totalMoney);
        // Create 3 bank accounts
        // Deposit Test
        // - deposit some money into each bank account's checking or savings account and display the balance each time
        // - each deposit should increase the amount of totalMoney
        // Withdrawal Test
        // - withdraw some money from each bank account's checking or savings account and display the remaining balance
        // - each withdrawal should decrease the amount of totalMoney
        // Static Test (print the number of bank accounts and the totalMoney)
    }
}
