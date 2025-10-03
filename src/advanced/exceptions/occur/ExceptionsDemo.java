package advanced.exceptions.occur;

public class ExceptionsDemo {
    public static void show() {
        sayHello(null);
    }

    private static void sayHello(String name) {
        System.out.println("Hello, " + name.toUpperCase() + "!");
    }
}
