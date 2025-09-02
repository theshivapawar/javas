package fundamentals.control_flow;

import java.util.Scanner;

public class BreakContinue {
    public static void main(String[] args) {

        // break statement terminates the loop
        // continue statement moves the control
        // to the beginning of the loop

        Scanner scanner = new Scanner(System.in);

        /*
        String input = "";
        while (!input.equals("quit")) {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            if (!input.equals("quit"))
                System.out.println(input);
        }
        */

//        String input = "";
//        while (true) {
//            System.out.print("Input: ");
//            input = scanner.next().toLowerCase();
//
//            if (input.equals("quit"))
//                break;
//            if (input.equals("pass"))
//                continue;
//            System.out.println(input);
//        }

//        int choice;
//        do {
//            System.out.println("\nMenu\n1. Withdraw\n2. Deposit\n3. Check Balance\n4. Exit\n");
//            System.out.print("Choice: ");
//            choice = scanner.nextInt();
//            if (choice == 4) {
//                System.out.println("Thank you!");
//                break;
//            }
//            System.out.println(choice);
//        } while (true);


        for (int number = 1; number <= 10; number++) {
            if (number % 5 == 0)
                continue;
            System.out.print(number + " ");
        }


    }
}