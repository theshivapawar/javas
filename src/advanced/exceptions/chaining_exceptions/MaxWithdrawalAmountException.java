package advanced.exceptions.chaining_exceptions;

public class MaxWithdrawalAmountException extends RuntimeException {
    public MaxWithdrawalAmountException() {
        super("Maximum withdrawal amount is 1,00,000.");
    }

    public MaxWithdrawalAmountException(String message) {
        super(message);
    }
}
