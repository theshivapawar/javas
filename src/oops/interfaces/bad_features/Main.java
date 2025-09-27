package oops.interfaces.bad_features;

public class Main {
    public static void main(String[] args) {

        var calculator = new TaxCalculator2025(100_000);
        var report = new TaxReport(calculator);
        report.show();
        doSomething();

    }

    public static void doSomething() {
        System.out.println(TaxCalculator.MINIMUM_TAX);
        //TaxCalculator.MINIMUM_TAX = 100;
    }
}