package advanced.exceptions.chaining_exceptions;

public class Account {
    private int balance;

    public void withdraw(int amount) throws AccountException {
        if (amount <= 0)
            throw new IllegalArgumentException("Withdrawal amount can not be 0 or less.");

        if (amount > 50_000)
            throw new AccountException(new MaxWithdrawalAmountException());

        if (amount > balance)
            throw new AccountException(new InsufficientBalanceException());

        balance -= amount;
    }

    /*
    public void withdraw(int amount) throws AccountException {
        if (amount <= 0)
            throw new IllegalArgumentException("Withdrawal amount can not be 0 or less.");

        if (amount > 50_000) {
            var amountException = new MaxWithdrawalAmountException();
            var accountException = new AccountException();
            accountException.initCause(amountException);
            throw accountException;
        }

        if (amount > balance) {
            var balanceException = new InsufficientBalanceException();
            var accountException = new AccountException();
            accountException.initCause(balanceException);
            throw accountException;
        }

        balance -= amount;
    }
    */

    public void deposit(int amount) {
        if (amount <= 0)
            throw new IllegalArgumentException("Deposit amount can not be 0 or less.");

        balance += amount;
    }

    public int getBalance() {
        return balance;
    }
}
