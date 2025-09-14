package fundamentals.debugging_packaging.MortgageCalculator.src;

public class Main {
    public static void main(String[] args) {
        int principal = (int) MortgageCalculator.readNumber("Principal ($1k - $1M)", 1000, 1_000_000);
        float annualInterest = MortgageCalculator.readNumber("Annual Interest Rate (1% - 30%)", 1, 30);
        byte years = (byte) MortgageCalculator.readNumber("Period (1 - 30 Years)", 1, 30);

        MortgageCalculator.printMortgage(principal, annualInterest, years);
        MortgageCalculator.printPaymentSchedule(principal, annualInterest, years);
    }
}
