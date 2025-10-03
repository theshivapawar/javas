package advanced.exceptions.handling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) {

        // the external resources such as file handlers or
        // database or network connections should implement
        // AutoClosable interface to be in the
        // try-resources statement.

        try (var reader = new FileReader("input.txt")) {
            var value = reader.read();
            System.out.println(value);
        }
        catch (IOException e) {
            System.out.println("Could not read data.");
        }

        try (
            var reader = new FileReader("input.txt");
            var writer = new FileWriter("output.txt")
        ) {
            var value = reader.read();
            writer.write(value);
        }
        catch (IOException e) {
            System.out.println("Could not read or write data.");
        }

    }
}
