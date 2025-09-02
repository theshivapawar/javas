package fundamentals.control_flow;

import java.util.Scanner;

public class ForEachLoop {
    public static void main(String[] args) {

        String[] fruits = {"Apple", "Banana", "Mango"};

        for (int i = 0; i < fruits.length; i++)
            System.out.format("[%d] %s ", i, fruits[i]);
        System.out.println();

        for (int i = (fruits.length - 1); i >= 0; i--)
            System.out.format("[%d] %s ", i, fruits[i]);
        System.out.println();

        // forward only
        // no access to indexes
        for (String fruit : fruits)
            System.out.print(fruit + " ");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nHow many numbers you want to store?: ");
        int length = scanner.nextInt();

        System.out.println("\nEnter the numbers at following indexes:");

        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.format("[%d]: ", i);
            numbers[i] = scanner.nextInt();
        }

        System.out.print("\nEnter the number to search: ");
        int numberToSearch = scanner.nextInt();

//        boolean isFound = false;
//        for (int number : numbers) {
//            if (number == numberToSearch) {
//                isFound = true;
//                break;
//            }
//        }
//        System.out.println(isFound ? "Found" : "Not Found");


        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == numberToSearch) {
                index = i;
                break;
            }
        }
        System.out.println(index > -1 ? "Found at index " + index : "Not Found");
    }
}
