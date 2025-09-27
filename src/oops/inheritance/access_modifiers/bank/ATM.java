package oops.inheritance.access_modifiers.bank;

public class ATM {
    public void useATM(Account account) {
        System.out.println("ATM accessing account: " + account.accountNumber);
        account.deposit(500);
        account.withdraw(200);

        //account.balance
    }
}
