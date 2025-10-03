package advanced.exceptions.custom_exceptions;

// Checked Exception -> Exception
// Unchecked (Runtime) Exception -> RuntimeException

public class InsufficientBalanceException extends Exception  {

    public InsufficientBalanceException() {
        super("Insufficient balance in your account.");
    }

    public InsufficientBalanceException(String message) {
        super(message);
    }
}
