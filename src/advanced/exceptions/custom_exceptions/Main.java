package advanced.exceptions.custom_exceptions;

public class Main {
    public static void main(String[] args) {

        var account = new Account();
        account.deposit(500);
        try {
            account.withdraw(600);
        }
        catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(account.getBalance());;
    }
}
