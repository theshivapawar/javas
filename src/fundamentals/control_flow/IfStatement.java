package fundamentals.control_flow;

public class IfStatement {
    public static void main(String[] args) {

        int temperature = 20;

        /*
        if (temperature > 30) {
            System.out.println("It's a hot day.");
            System.out.println("Drink plenty of water.");
        } else if (temperature > 20 && temperature <= 30) {
            System.out.println("It's a warm day.");
        } else {
            System.out.println("It's a cold day.");
        }
        */

        if (temperature > 30) { // Code Block {}
            System.out.println("It's a hot day.");
            System.out.println("Drink plenty of water.");
        }
        else if (temperature > 20)
            System.out.println("It's a warm day.");
        else
            System.out.println("It's a cold day.");
    }
}
