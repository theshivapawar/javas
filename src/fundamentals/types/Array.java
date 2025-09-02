package fundamentals.types;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        int[] numbers;
        numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        //numbers[10] = 3;
        // java.lang.ArrayIndexOutOfBoundsException
        //System.out.println(numbers[10]);
        System.out.println(Arrays.toString(numbers));

        char[] letters = new char[3];
        letters[0] = 'h';
        System.out.println(Arrays.toString(letters));
        // default value for uninitialized char elements
        System.out.println("\u0000");

        String[] fruits = new String[] {"Mango", "Apple", "Orange", "Banana"};
        System.out.println(Arrays.toString(fruits));

        byte[] marks = {57, 89, 48, 65, 88};
        System.out.println(Arrays.toString(marks));

        float[] prices = {19.99F, 99.99F, 24.99F, 49.99F};
        System.out.println(Arrays.toString(prices));


    }
}