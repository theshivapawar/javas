package advanced.exceptions.occur;

import java.io.FileReader;
import java.util.Scanner;

public class TypesOfExceptions {
    public static void main(String[] args) {

        // Checked Exceptions
        // FileNotFoundException IOException SQLException
        //var reader = new FileReader("abc.txt");

        // Unchecked Exceptions

        // Arithmetic Exception
        //int divison = 3 / 0;

        // NumberFormatException
        //int number = Integer.parseInt("a");

        // InputMismatchException
        //var scanner = new Scanner(System.in);
        //System.out.print("Number: ");
        //int inputNumber = scanner.nextInt(); // k

        // ArrayIndexOutOfBoundsException
        //var numbers = new int[5];
        //System.out.println(numbers[10]);

        // ClassCastException
        //var object = new Object();
        //String name = (String) object;

        // NullPointerException
        //String title = null;
        //System.out.println(title.toUpperCase());

        // IllegalArgumentException -> validating data between a range of values
        // IllegalStateException -> Streams, Files, Threads
        // NoSuchElementException -> Iterators
        // ConcurrentModificationException -> in for loop removing an item of a list in concurrency

        // Error -> IOError, VirtualMachineError -> OutOfMemoryError, StackOverflowError
    }
}
