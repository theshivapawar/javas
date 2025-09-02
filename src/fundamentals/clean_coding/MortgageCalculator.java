package fundamentals.clean_coding;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MortgageCalculator {
    static final byte PERCENT = 100;
    static final byte MONTHS_IN_YEAR = 12;

    public static float readNumber(String prompt, int min, int max) {
        Scanner scanner = new Scanner(System.in);
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

    public static double calculateMortgage(int principal, float annualInterest, byte years) {
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        short numberOfPayments = (short)(years * MONTHS_IN_YEAR);

        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return mortgage;
    }

    public static double calculateBalance(int principal, float annualInterest, byte years, byte numberOfPaymentsMade) {
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        short numberOfPayments = (short)(years * MONTHS_IN_YEAR);

        double balance = principal
                * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return balance;
    }

    public static void printMortgage(int principal, float annualInterest, byte years) {
        double mortgage = calculateMortgage(principal, annualInterest, years);
        String mortgageFormatted = NumberFormat.getCurrencyInstance(Locale.US).format(mortgage);
        System.out.println("\nMORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }

    public static void printPaymentSchedule(int principal, float annualInterest, byte years) {
        System.out.println("\nPAYMENT SCHEDULE");
        System.out.println("----------------");

        for (byte month = 1; month <= (years * MONTHS_IN_YEAR); month++) {
            double balance = calculateBalance(principal, annualInterest, years, month);
            System.out.println(NumberFormat.getCurrencyInstance(Locale.US).format(balance));
        }
    }

    public static void main(String[] args) {
        int principal = (int) readNumber("Principal ($1k - $1M)", 1000, 1_000_000);
        float annualInterest = readNumber("Annual Interest Rate (1% - 30%)", 1, 30);
        byte years = (byte) readNumber("Period (1 - 30 Years)", 1, 30);

        printMortgage(principal, annualInterest, years);
        printPaymentSchedule(principal, annualInterest, years);
    }
}