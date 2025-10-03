package advanced.exceptions.handling;

import java.io.FileReader;
import java.io.IOException;

public class FinallyBlock {
    public static void main(String[] args) {

        FileReader reader = null;
        try {
            reader = new FileReader("text.txt");
            var value = reader.read();
        }
        catch (IOException e) {
            System.out.println("Could not read data.");
        }
        finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        /*

        //var reader;
        FileReader reader = null;

        try {
            reader = new FileReader("text.txt");
            var value = reader.read();
            //reader.close();
        }
        catch (IOException e) {
            System.out.println("Could not read data.");
        }

        // ... code that throws another exception

        try {
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        */
    }
}
