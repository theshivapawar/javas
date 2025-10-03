package advanced.exceptions.rethrowing_exceptions;

public class Main {
    public static void main(String[] args) {

        // Generic Exception Handlers with Generic Error Messages
        try {
            App.printFileData();
        }
        catch (Exception e) {
            System.out.println("An unexpected error occurred.");
        }

        try {
            App.printFileData();
        }
        catch (Throwable e) {
            System.out.println("An unexpected error occurred.");
        }
    }
}
