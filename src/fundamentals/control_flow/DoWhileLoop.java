package fundamentals.control_flow;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {

        // gets executed at least one even if
        // the condition is false

        Scanner scanner = new Scanner(System.in);
        String input = "quit";
        do {
            System.out.print("Input: ");
            input = scanner.next();
            System.out.println(input);
        } while (!input.equalsIgnoreCase("quit"));


        String password = "";
        do {
            System.out.print("Password: ");
            password = scanner.next();
        } while (!password.equals("Secret123"));

//        while (!password.equals("Secret123"))  {
//            System.out.print("Password: ");
//            password = scanner.next();
//        }

        String item;
        do {
            System.out.print("Enter item to add: ");
            item = scanner.next();
            System.out.println(item + " added to cart.");
            System.out.print("Add more? (yes / no): ");
        } while (scanner.next().equalsIgnoreCase("yes"));


//        String takeItem = "yes";
//        while (takeItem.equalsIgnoreCase("yes")) {
//            System.out.print("Enter item to add: ");
//            item = scanner.next();
//            System.out.println(item + " added to cart.");
//            System.out.print("Add more? (yes / no): ");
//            takeItem = scanner.next();
//        }
    }
}
