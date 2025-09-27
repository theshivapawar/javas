package oops.interfaces.bad_features.solution;

public class Main {
    public static void main(String[] args) {

        var calculator = new TaxCalculator2025(1_30_000, 30_000);
        var report = new TaxReport(calculator);
        report.show();

    }
}
