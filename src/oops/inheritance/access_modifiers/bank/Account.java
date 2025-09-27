package oops.inheritance.access_modifiers.bank;

public class Account {
    // Private
    private int balance;

    //  Default
    String accountNumber;

    public Account(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // protected
    protected void withdraw(int amount) {
        if (amount <= 0) {
            System.out.println("Enter a valid amount.");
            return;
        }

        if (balance >= amount) {
            balance -= amount;
            System.out.format("%d withdrawn. Remaining Balance: %d\n", amount, balance);
        }
        else {
            System.out.println("Insufficient Funds!");
        }
    }

    // public
    public void deposit(int amount) {
        if (amount <= 0) {
            System.out.println("Enter a valid amount.");
            return;
        }

        balance += amount;
        System.out.format("%d deposited. New Balance: %d\n", amount, balance);
    }
}
