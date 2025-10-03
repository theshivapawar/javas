package advanced.exceptions.throwing_exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileIO {

    public static void readFile(String fileName) throws FileNotFoundException {
        var scanner = new Scanner(new File(fileName));
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
    }

    /*
    public static void readFile(String fileName) {
        Scanner scanner;
        try {
            scanner = new Scanner(new File(fileName));
        }
        catch (IOException e) {
            System.out.println("File does not exist.");
        }
    }
    */
}