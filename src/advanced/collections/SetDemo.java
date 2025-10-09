package advanced.collections;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {

        Set<String> words = new HashSet<>();
        words.add("sky");
        words.add("is");
        words.add("blue");
        words.add("blue");
        System.out.println(words);

        // does not guarantee order of items
        // contain no duplicates, only unique items

        Collection<String> fruits = new ArrayList<>();
        Collections.addAll(fruits, "apple", "banana", "apple", "mango");

        Set<String> uniqueFruits = new HashSet<>(fruits);
        System.out.println(uniqueFruits);
    }
}
