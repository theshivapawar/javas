package oops.inheritance.access_modifiers.bank_app;

import oops.inheritance.access_modifiers.bank.ATM;
import oops.inheritance.access_modifiers.bank.Account;

public class Main {
    public static void main(String[] args) {

        var account = new Account("1001", 0);

        account.deposit(1000);

        var atm = new ATM();
        atm.useATM(account);

        var app = new BankApp("1002", 0);
        app.transaction();

        //account.accountNumber
        //account.withdraw
        //account.balance
    }
}
