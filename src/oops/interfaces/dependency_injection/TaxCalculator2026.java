package oops.interfaces.dependency_injection;

public class TaxCalculator2026 implements TaxCalculator {
    private double taxableIncome;

    public TaxCalculator2026(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    @Override
    public double calculateTax() {
        return taxableIncome * 0.15;
    }
}
