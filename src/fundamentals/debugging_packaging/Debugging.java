package fundamentals.debugging_packaging;

import java.util.Scanner;

public class Debugging {
    public static void main(String[] args) {
        System.out.println("Start");
        printNumbers(4);
        System.out.println("Finish");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int number = scanner.nextInt();
        printFizzBuzz(number);
    }

    public static void printNumbers(int limit) {
        for (int i = 1; i < limit; i += 2)
            System.out.println(i);
    }

    public static void printFizzBuzz(int number) {
        if (number % 5 == 0)
            System.out.println("Fizz");
        else if (number % 3 == 0)
            System.out.println("Buzz");
        else if (number % 5 == 0 && number % 3 == 0)
            System.out.println("FizzBuzz");
        else
            System.out.println(number);
    }
}