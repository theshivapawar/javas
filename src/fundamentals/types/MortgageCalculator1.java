package fundamentals.types;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate (%): ");
        float annualInterestRate = scanner.nextFloat();
        float monthlyInterestRate = annualInterestRate / 100 / 12; // magic numbers

        System.out.print("Period (Years): ");
        int period = scanner.nextInt();
        int numberOfPayments = period * 12;

        double mortgage = principal
                * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments))
                / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("\nMortgage: " + mortgageFormatted);
    }
}