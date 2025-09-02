package fundamentals.clean_coding;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Refactoring {
    public static void main(String[] args) {

        // Changing the structure of the program
        // without changing its behaviour

        final byte PERCENT = 100;
        final byte MONTHS_IN_YEAR = 12;
        int principal;
        float annualInterestRate;
        byte years;

        Scanner scanner = new Scanner(System.in);

        // 1. Repetitive patterns in the code
        // Infinite Loop
        // Question with Different Labels
        // Reading a value
        // Validation
        // If value is invalid, display message.


        while (true) {
            System.out.print("Principal ($1k - $1M): ");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1_000_000)
                break;
            System.out.println("Enter a valid principal amount between $1,000 and $1,000,000.");
        }

        while (true) {
            System.out.print("Annual Interest Rate (1% - 30%): ");
            annualInterestRate = scanner.nextFloat();
            if (annualInterestRate >= 1 && annualInterestRate <= 30)
                break;
            System.out.println("Enter a valid annual interest rate between 1% and 30%.");
        }

        while (true) {
            System.out.print("Period (1 - 30 Years): ");
            years = scanner.nextByte();
            if (years >= 1 && years <= 30)
                break;
            System.out.println("Enter a valid period (number of years) between 1 and 30.");
        }

        // 2. Concepts or lines of code
        // that always go together
        // calculating the mortgage

        float monthlyInterest = annualInterestRate / PERCENT / MONTHS_IN_YEAR;
        int numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);


        String mortgageFormatted = NumberFormat.getCurrencyInstance(Locale.US).format(mortgage);
        System.out.println("\nMortgage: " + mortgageFormatted);

    }
}
