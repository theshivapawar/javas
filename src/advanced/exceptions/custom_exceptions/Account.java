package advanced.exceptions.custom_exceptions;

public class Account {
    private int balance;

    // may throw an exception
    public void withdraw(int amount) throws InsufficientBalanceException {
        if (amount <= 0)
            throw new IllegalArgumentException("Withdrawal amount can not be 0 or less.");

        if (amount > balance)
            throw new InsufficientBalanceException();

        balance -= amount;
    }

    public void deposit(int amount) {
        if (amount <= 0)
            throw new IllegalArgumentException("Deposit amount can not be 0 or less.");
        balance += amount;
    }

    public int getBalance() {
        return balance;
    }
}
