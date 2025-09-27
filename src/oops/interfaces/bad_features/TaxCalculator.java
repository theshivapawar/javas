package oops.interfaces.bad_features;

public interface TaxCalculator {
    /// Fields

    //public static final float minimumTax = 100;
    float MINIMUM_TAX = 100;

    //float PI = 3.14F;
    //float MONTHS_IN_YEAR = 12;

    double calculateTax();

    ///  Static Methods
    static double getTaxableIncome(double income, double expenses) {
        return income - expenses;
    }

    ///  Private Methods
    private double calculateExpenses() {
        return 0;
    }
}