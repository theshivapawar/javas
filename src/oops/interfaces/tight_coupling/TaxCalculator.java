package oops.interfaces.tight_coupling;

public class TaxCalculator {
    private double taxableIncome;

    public TaxCalculator(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    /*
    public TaxCalculator(double taxableIncome, double insurance) {
        this.taxableIncome = taxableIncome;
    }
    */

//    public double calculateTax() {
//        return taxableIncome * 0.3;
//    }

    public double calculateTax() {
        return taxableIncome * 0.4;
    }

    /*
    public double calculateTax(double taxRate) {
        return taxableIncome * 0.3;
    }
    */

}