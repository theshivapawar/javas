package advanced.exceptions.throwing_exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        var account = new Account();
        //account.deposit(-1); // Programming Error
        account.deposit(1);
        System.out.println(account.getBalance());

        try {
            FileIO.readFile("abc.txt");
        }
        catch (FileNotFoundException e) {
            System.out.println("File does not exist.");
        }
    }
}
