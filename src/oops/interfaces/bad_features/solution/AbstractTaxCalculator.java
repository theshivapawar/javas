package oops.interfaces.bad_features.solution;

public abstract class AbstractTaxCalculator implements TaxCalculator {
    protected static final double TAX_RATE = 0.30F;
    protected static final float MINIMUM_TAX = 100;
    protected static final byte MONTHS_IN_YEAR = 12;

    protected double getTaxableIncome(double income, double expenses) {
        return income - expenses;
    }
}
