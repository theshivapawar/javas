package oops.inheritance.method_overriding;

import java.util.Arrays;

public class VariableLengthArguments {
    public static void main(String[] args) {
        add(1, 2, 3, 4, 5);
    }

    public static void add(int... numbers) {
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.getClass().getSimpleName());

        int addition = 0;
        for (int number : numbers)
            addition += number;
        System.out.println("Addition: " + addition);
    }
}
