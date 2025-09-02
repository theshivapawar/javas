package fundamentals.control_flow;

public class TernaryOperator {
    public static void main(String[] args) {
        // Ternary Operator ? :

        int income = 100_000;
        String className = (income > 100_000) ? "First" : "Economy";
        System.out.println(className);

        /*
        String className;
        if (income > 100_000)
            className = "First";
        else
            className = "Economy";
        System.out.println(className);
        */

        /*
        String className = "Economy";
        if (income > 100_000)
            className = "First";
        System.out.println(className);
        */
    }
}
