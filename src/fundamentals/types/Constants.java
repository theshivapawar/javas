package fundamentals.types;

public class Constants {
    public static void main(String[] args) {

        /*
        float pi = 3.14F;
        float radius = 2;
        pi = 1;
        float areaOfCircle = pi * radius * radius;
        System.out.println(areaOfCircle);
        */

        final float PI = 3.14F;
        //PI = 1;
        float radius = 2;
        float areaOfCircle = PI * radius * radius;
        System.out.println(areaOfCircle);

        final String id;
        id = "1001";
        //id = 2;
        System.out.println(id);
    }
}