package advanced.exceptions.handling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CatchingMultipleTypesOfExceptions {
    public static void main(String[] args) {

        try {
            var reader = new FileReader("abc.txt");
            var value = reader.read();
        }
        catch (FileNotFoundException e) {
            System.out.println("File does not exist.");
        }
        catch (IOException e) {
            System.out.println("Could not read a character from the file.");
        }


        try {
            var reader = new FileReader("abc.txt");
            var value = reader.read();
        }
        catch (IOException e) {
            System.out.println("Could not read data.");
        }
//        catch (FileNotFoundException e) {
//            System.out.println("File does not exist.");
//        }

        try {
            var reader = new FileReader("abc.txt");
            var value = reader.read();
            new SimpleDateFormat().parse("");
        }
        catch (FileNotFoundException e) {
            System.out.println("File does not exist.");
        }
        catch (IOException e) {
            System.out.println("Could not read a character from the file.");
        }
        catch (ParseException e) {
            System.out.println("Could not parse date.");
        }

        try {
            var reader = new FileReader("abc.txt");
            var value = reader.read();
            new SimpleDateFormat().parse("");
        }
        catch (IOException e) {
            System.out.println("Could not read data.");
        }
        catch (ParseException e) {
            System.out.println("Could not parse date.");
        }

        try {
            var reader = new FileReader("abc.txt");
            var value = reader.read();
            new SimpleDateFormat().parse("");
        }
        catch (IOException | ParseException e) {
            System.out.println(e.getMessage());
        }

    }
}
