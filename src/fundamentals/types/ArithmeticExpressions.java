package fundamentals.types;

public class ArithmeticExpressions {
    public static void main(String[] args) {

        // Arithmetic Operators + - * / % (Binary)
        int addition = 10 + 3;
        System.out.println(addition);

        int subtraction = 7 - 4;
        System.out.println(subtraction);

        int multiplication = 13 * 4;
        System.out.println(multiplication);

        int integerDivision = 10 / 3;
        System.out.println(integerDivision);

        double floatDivision1 = 10.0 / 3.0;
        System.out.println(floatDivision1);

        float floatDivision2 = (float)10 / (float)3;
        System.out.println(floatDivision2);

        int remainderOfDivision = 23 % 7; // modulus
        System.out.println(remainderOfDivision);

        // Increment ++ Decrement -- Unary

        int x = 100;
        x++;
        System.out.println(x);

        int a = 1;
        int b = a++;
        System.out.println(a + " " + b);

        int c = 1;
        int d = ++c;
        System.out.println(c + " " + d);

        int e = 5;
        int f = e--;
        System.out.println(e + " " + f);

        int g = 5;
        int h = --g;
        System.out.println(g + " " + h);

        // Augmented Compound Assignment Operators

        int number = 10;
        System.out.println(number);
        //number = number + 20;
        number += 110;
        System.out.println(number);
        number -= 70;
        System.out.println(number);
        number *= 2;
        System.out.println(number);
        number /= 2;
        System.out.println(number);
        number %= 3;
        System.out.println(number);
    }
}