package oops.interfaces.creating_interfaces;

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

/*
public class TaxCalculator2018 extends Object implements TaxCalculator {

}
*/