package fundamentals.types;

import java.text.NumberFormat;

public class FormattingNumbers {
    public static void main(String[] args) {

        /*
        Abstract Class
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String formattedCurrency = currency.format(123456.789123);
        System.out.println(formattedCurrency);
        */
                                                // factory method     // method chaining
        String formattedCurrency = NumberFormat.getCurrencyInstance().format(99999.99);
        System.out.println(formattedCurrency);

        String formattedPercent = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(formattedPercent);
    }
}