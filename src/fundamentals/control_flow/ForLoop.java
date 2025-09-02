package fundamentals.control_flow;

public class ForLoop {
    public static void main(String[] args) {

        // repeat one or more statements

        for (int i = 0; i < 5; i++)
            System.out.print(i + " ");
        System.out.println();

        for (int i = 1; i <= 5; i++)
            System.out.print(i + " ");
        System.out.println();

        for (int i = 4; i >= 0; i--)
            System.out.print(i + " ");
        System.out.println();

        for (int i = 5; i >= 1; i--)
            System.out.print(i + " ");
        System.out.println();

        for (int i = 11; i <= 20; i += 2)
            System.out.print(i + " ");
        System.out.println();
    }
}
