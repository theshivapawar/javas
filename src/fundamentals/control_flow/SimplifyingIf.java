package fundamentals.control_flow;

public class SimplifyingIf {
    public static void main(String[] args) {

        int income = 100_000;
        boolean hasHighIncome = (income > 100_000);
        System.out.println(hasHighIncome);

        /*
        if (income > 100_000)
            boolean hasHighIncome = true;
        */

        /*
        if (income > 100_000) { // scope
            boolean hasHighIncome = true;
        }
        System.out.println(hasHighIncome);
        */

        /*
        boolean hasHighIncome;
        if (income > 100_000)
            hasHighIncome = true;
        else
            hasHighIncome = false;
        System.out.println(hasHighIncome);
        */

        /*
        boolean hasHighIncome = false; // initial value
        if (income > 100_000)
            hasHighIncome = true;
        System.out.println(hasHighIncome);
        */
    }
}
