package oops.interfaces.bad_features.solution;

public class TaxCalculator2025 extends AbstractTaxCalculator {
    private double income;
    private double expenses;

    public TaxCalculator2025(double income, double expenses) {
        this.income = income;
        this.expenses = expenses;
    }

    @Override
    public double calculateTax() {
        return getTaxableIncome(income, expenses) * TAX_RATE;
    }
}
