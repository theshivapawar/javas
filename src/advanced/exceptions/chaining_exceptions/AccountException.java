package advanced.exceptions.chaining_exceptions;

public class AccountException extends Exception {
    public AccountException(Exception cause) {
        super(cause);
    }
}
