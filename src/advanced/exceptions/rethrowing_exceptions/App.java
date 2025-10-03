package advanced.exceptions.rethrowing_exceptions;

import java.io.FileNotFoundException;

public class App {
    public static void printFileData() throws FileNotFoundException {
        try {
            FileIO.readFile("file.txt");
        }
        catch (FileNotFoundException e) {
            System.out.println("Logged: " + e.getMessage());
            throw e;
        }
    }
}
