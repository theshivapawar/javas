package fundamentals.types;

import java.util.Arrays;
import java.util.Collections;

public class ArraysMethods {
    public static void main(String[] args) {

        // deep copy
        int[] numbers = {1, 5, 4, 2, 3};
        System.out.println(numbers.length);

        int[] numbersCopy = numbers.clone();
        System.out.println(numbers + " " + Arrays.toString(numbers));
        System.out.println(numbersCopy + " " + Arrays.toString(numbersCopy));

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        Integer[] values = {1, 2, 3, 4, 5};
        Arrays.sort(values, Collections.reverseOrder());
    }
}

// String - Complex length() method
// Array - Simple Container length field