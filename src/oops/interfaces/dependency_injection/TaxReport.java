package oops.interfaces.dependency_injection;

public class TaxReport {
    private TaxCalculator calculator;

    // Constructor Injection
    public TaxReport(TaxCalculator calculator) {
        this.calculator = calculator;
    }

    public void show() {
        var tax = calculator.calculateTax();
        System.out.println("Tax: " + tax);
    }

    // Method Injection
    // We pass a dependency to the method
    // that needs that dependency
    public void show(TaxCalculator calculator) {
        var tax = calculator.calculateTax();
        System.out.println("Tax: " + tax);
    }

    // Setter Injection
    // Can change the dependencies throughout the
    // lifetime of our program
    public void setCalculator(TaxCalculator calculator) {
        this.calculator = calculator;
    }
}

