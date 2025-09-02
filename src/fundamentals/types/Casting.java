package fundamentals.types;

public class Casting {
    public static void main(String[] args) {
        // Casting or Type Conversion
        // Implicit (Automatically)
        // byte > short > int > long > float > double

        short a = 1;
        int b = a + 2;      // short > int
        System.out.println(a);

        double c = 1.1;
        double d = c + 2;   // int > double
        System.out.println(d);

        // Explicit (Manual by Yourself)
        double e = 1.1;
        int f = (int)c + 2;
        System.out.println(f);

        String g = "1";
        int h = Integer.parseInt(g) + 3; // Wrapper Classes
        System.out.println(h);

        String i = "1.1";
        //int j = Integer.parseInt(i) + 3;
        // java.lang.NumberFormatException
        double j = Double.parseDouble(i) + 3;
        System.out.println(j);
    }
}