package advanced.exceptions.handling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CatchingExceptions {
    public static void main(String[] args) {

        try {
            var reader = new FileReader("abc.txt");
            System.out.println("File opened.");
        }
        catch (FileNotFoundException e) {
            System.out.println("File does not exist.");
            System.out.println("Message: " + e.getMessage());
            System.out.println("Cause: " + e.getCause());
            System.out.println("Localized Message: " + e.getLocalizedMessage());
            //e.printStackTrace();
            e.printStackTrace(System.out);
        }

        System.out.println("Main Method");
    }
}
