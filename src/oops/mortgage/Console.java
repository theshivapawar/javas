package oops.mortgage;

import java.util.Scanner;

public class Console {

    private static final Scanner scanner = new Scanner(System.in);

    public static float readNumber(String prompt) {
        return scanner.nextFloat();
    }

    public static float readNumber(String prompt, int min, int max) {
        float value;
        while (true) {
            System.out.print(prompt + ": ");
            value = scanner.nextFloat();
            if (value >= min && value <= max)
                break;
            System.out.format("Enter a valid value between %d and %d.\n", min, max);
        }
        return value;
    }
}
