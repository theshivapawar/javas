package fundamentals.types;

public class StringReferences {
    public static void main(String[] args) {

        // strings are immutable
        String name1 = "Shivam";
        String name2 = name1;

        name1 = "Ajay";
        System.out.println(name2);

    }
}