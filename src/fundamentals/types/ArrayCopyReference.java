package fundamentals.types;

import java.util.Arrays;

public class ArrayCopyReference {
    public static void main(String[] args) {

        int[] numbers1 = {1, 2, 3};
        int[] numbers2 = numbers1;

        numbers1[2] = 0;
        System.out.println(Arrays.toString(numbers2));

    }
}