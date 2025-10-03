package advanced.exceptions.throwing_exceptions;

public class Account {
    private int balance;

    public void deposit(int amount) {
        // Defensive Programming
        if (amount <= 0)
            // throw new IllegalArgumentException();
            throw new IllegalArgumentException("Amount can not be 0 or less.");
        balance += amount;
    }

    public int getBalance() {
        return balance;
    }
}
