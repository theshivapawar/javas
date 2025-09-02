package fundamentals.types;

public class OrderOfOperations {
    public static void main(String[] args) {

        int result1 = 10 + 3 * 2;
        System.out.println(result1);

        int result2 = (10 + 3) * 2;
        System.out.println(result2);

        System.out.println(3 * 25 / 5);
        System.out.println(10 - 2 + 3);

        /*
        Priority (Order) of Operators
        Operator Precedence (Highest to Lower)
        ()
        /
        *
        +
        -
        */

    }
}