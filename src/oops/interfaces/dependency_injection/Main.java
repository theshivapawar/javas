package oops.interfaces.dependency_injection;

public class Main {
    public static void main(String[] args) {


        var calculator = new TaxCalculator2025(100_000);

        // Poor Man's Dependency Injection
        // Dependency Injection Framework - Spring
        var report = new TaxReport(calculator);
        report.show();

        report.setCalculator(new TaxCalculator2026(100_000));
        report.show();

        report.show(new TaxCalculator2027(100_000));
    }
}

/*
* Dependency Injection
* Our classes should not instantiate or new up their dependencies
* */