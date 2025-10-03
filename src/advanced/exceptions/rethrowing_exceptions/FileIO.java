package advanced.exceptions.rethrowing_exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileIO {
    public static void readFile(String fileName) throws FileNotFoundException {
        var scanner = new Scanner(new File(fileName));
        while (scanner.hasNextLine())
            System.out.println(scanner.nextLine());
    }
}
