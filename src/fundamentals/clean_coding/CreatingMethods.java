package fundamentals.clean_coding;

public class CreatingMethods {
    public static void main(String[] args) {
        greet("Shivam", "Pawar");
        greet("Rohit", "Nilekar");

        int addition = add(30, 20);
        System.out.println(addition);

        System.out.println(add(12, 7));
    }

    public static void greet(String firstName, String lastName) {
        System.out.format("Hello, %s %s!\n", firstName, lastName);
    }

    public static int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}