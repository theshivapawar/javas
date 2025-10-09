package advanced.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetOperations {
    public static void main(String[] args) {

        Set<String> set1 = new HashSet<>(Arrays.asList("a", "b", "c"));
        Set<String> set2 = new HashSet<>(Arrays.asList("b", "c", "d"));
        System.out.println(set1);
        System.out.println(set2);

        // Union
        //set1.addAll(set2);
        //System.out.println(set1);

        // Intersection
        //set1.retainAll(set2);
        //System.out.println(set1);

        // Difference Set1 - Set2
        //set1.removeAll(set2);
        //System.out.println(set1);

        // Difference Set2 - Set1
        set2.removeAll(set1);
        System.out.println(set2);
    }
}
