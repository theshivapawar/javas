package oops.interfaces.bad_features;

public class TaxCalculator2025 implements TaxCalculator {
    private double taxableIncome;

    public TaxCalculator2025(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    @Override
    public double calculateTax() {
        return taxableIncome * 0.3;
    }
}