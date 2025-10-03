package advanced.exceptions.chaining_exceptions;

public class Main {
    public static void main(String[] args) {

        var account = new Account();
        account.deposit(500);
        try {
            account.withdraw(600);
            account.withdraw(51000);
        }
        catch (AccountException e) {
            //var cause = e.getCause();
            //System.out.println(cause.getMessage());
            System.out.println(e.getCause().getMessage());
            e.printStackTrace();
        }

        System.out.println(account.getBalance());
    }
}

/*
* Chaining exceptions technique is used to wrap an exception
* inside a more generic exception. We get a more general purpose
* exception, and then we can figure out what caused that exception.
* */