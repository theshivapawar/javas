package advanced.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class CollectionsDemo {
    public static void main(String[] args) {

        Collection<String> collection = new ArrayList<>();
        //collection.add("A");
        //collection.add("B");
        //collection.add("C");
        Collections.addAll(collection, "A", "B", "C", "D");

        collection.remove("D");
        System.out.println("Contains B: " + collection.contains("B"));
        System.out.println("Size: " + collection.size());
        System.out.println("Collection: " + collection);

        Object[] objects = collection.toArray();
        //objects.toUpperCase()

        var items = collection.toArray(new String[0]);
        //items[0].toUpperCase()

        //ArrayList<String> other = new ArrayList<>();
        // var other = new ArrayList<>();

        Collection<String> other = new ArrayList<>();
        other.addAll(collection);
        System.out.println("Other: " + other);

        System.out.println("collection == other: " + (collection == other));
        System.out.println("equals: " + collection.equals(other));

        collection.clear();
        System.out.println("Collection: " + collection);

        System.out.println("Is collection empty?: " + collection.isEmpty());
    }
}
