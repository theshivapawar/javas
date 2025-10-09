package advanced.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        //list.add("A");
        //list.add("B");
        //list.add("C");
        Collections.addAll(list, "A", "B", "C", "A");

        list.add(3, "D");
        list.addFirst("!");
        list.addLast("E");

        list.remove(3);

        System.out.println("Index of A: " + list.indexOf("A"));
        System.out.println("Last index of A: " + list.lastIndexOf("A"));

        list.set(0, "Z");

        System.out.println(list.subList(1, 3));

        System.out.println(list.reversed());


        System.out.println(list);

    }
}
