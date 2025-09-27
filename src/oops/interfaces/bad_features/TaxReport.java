package oops.interfaces.bad_features;

public class TaxReport {
    private TaxCalculator calculator;

    public TaxReport(TaxCalculator calculator) {
        this.calculator = calculator;
    }

    public void show() {
        //TaxCalculator.MINIMUM_TAX
        var tax = calculator.calculateTax();
        System.out.println("Tax: " + tax);
    }
}