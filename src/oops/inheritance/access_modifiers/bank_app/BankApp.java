package oops.inheritance.access_modifiers.bank_app;

import oops.inheritance.access_modifiers.bank.Account;

public class BankApp extends Account {
    public BankApp(String accountNumber, int balance) {
        super(accountNumber, balance);
    }

    public void transaction() {
        deposit(1000);
        withdraw(300);

        //accountNumber
        // balance
    }
}
