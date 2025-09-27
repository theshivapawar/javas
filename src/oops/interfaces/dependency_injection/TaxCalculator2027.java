package oops.interfaces.dependency_injection;

public class TaxCalculator2027 implements TaxCalculator {
    private double taxableIncome;

    public TaxCalculator2027(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    @Override
    public double calculateTax() {
        return taxableIncome * 0.075;
    }
}
