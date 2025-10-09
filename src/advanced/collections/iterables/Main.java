package advanced.collections.iterables;

public class Main {
    public static void main(String[] args) {

        var names = new GenericList<String>(2);
        names.add("Shivam");
        names.add("Rohit");

        for (var name : names)
            System.out.println(name);
    }
}
