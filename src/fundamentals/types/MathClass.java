package fundamentals.types;

import static java.lang.Math.PI;

public class MathClass {
    public static void main(String[] args) {

        int rounded1 = Math.round(1.4F);
        System.out.println(rounded1);

        long rounded2 = Math.round(97.783438);
        System.out.println(rounded2);

        System.out.println(Math.round(1.5F));

        double ceilResult = Math.ceil(2.1);
        System.out.println(ceilResult);

        double floorResult = Math.floor(2.9);
        System.out.println(floorResult);

        double squareRoot = Math.sqrt(1225);
        System.out.println(squareRoot);

        double cubeRoot = Math.cbrt(343);
        System.out.println(cubeRoot);

        double power = Math.pow(4, 3);
        System.out.println(power);

        System.out.println(Math.max(12, 17));
        System.out.println(Math.max(33F, 67F));
        System.out.println(Math.min(10.99, 33));

        System.out.println(Math.abs(-10));

        //double randomNumber = Math.random();
        //double randomNumber = Math.random() * 100;
        //double randomNumber = Math.round(Math.random() * 100);
        //int randomNumber = (int)Math.round(Math.random() * 100);
        int randomNumber = (int)(Math.random() * 100);
        System.out.println(randomNumber);

        System.out.println(Math.PI);
        System.out.println(PI);
        System.out.println(Math.E);
    }
}