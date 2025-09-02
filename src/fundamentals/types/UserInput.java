package fundamentals.types;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        // Where to read input from terminal (System.in) or file
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student details:");

        System.out.print("ID: ");
        short id = scanner.nextShort();
        System.out.println("\nID: " + id); // Implicit Casting short > String

        scanner.nextLine(); // to consume leftover newline

        System.out.print("Name: ");
        //String name = scanner.next(); // Read one token (word) at a time
        String name = scanner.nextLine().strip(); // Read one line including spaces and tabs

        System.out.print("Age: ");
        // 5.5 java.util.InputMismatchException
        byte age = scanner.nextByte();

        System.out.print("Fees: ");
        int fees = scanner.nextInt();

        System.out.print("CGPA: ");
        float cgpa = scanner.nextFloat();

        System.out.print("Percentile: ");
        double percentile = scanner.nextDouble();

        System.out.print("Grade: ");
        char grade = scanner.next().charAt(0);

        System.out.print("Is Passed: ");
        boolean isPassed = scanner.nextBoolean();

        System.out.format("\nStudent Details >\nID: %d\nName: %s\nAge: %d\n" +
                "Fees: %d\nCGPA: %.2f\nPercentile: %.2f\nGrade: %c\nIs Passed: %b\n",
                id, name, age, fees, cgpa, percentile, grade, isPassed);
    }
}