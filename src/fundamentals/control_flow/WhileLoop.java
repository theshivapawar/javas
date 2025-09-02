package fundamentals.control_flow;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        // We don't know ahead of time, how many times we want to repeat something

        int i = 5;
        while (i > 0) {
            System.out.print(i + " ");
            i--;
        }
        System.out.println();


        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equals("quit")) {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }

        /*
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equals("quit")) {
            System.out.println(input);
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
        }
        */
    }
}
