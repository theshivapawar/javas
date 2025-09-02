package fundamentals.types;

public class StringComparison {
    public static void main(String[] args) {

        // String Pool (JVM Heap)

        String greeting1 = "Hello!";
        String greeting2 = "Hello!";
        System.out.println(greeting1 == greeting2);

        String greeting3 = new String("Hello!");
        String greeting4 = new String("Hello!");
        System.out.println(greeting3 == greeting4);

        String greeting5 = new String("Namastey!");
        String greeting6 = "Namastey!";
        System.out.println(greeting5 == greeting6);

        String greeting7 = "Hi!";
        String greeting8 = greeting7.intern();
        System.out.println(greeting7 == greeting8);

        String userName = "theshivapawar";
        System.out.println(userName.equals("theshivapawar"));
        System.out.println(userName.compareTo("theshivapawar"));
        System.out.println(userName.compareTo("theajaypawar"));
        // lexicographically
    }
}