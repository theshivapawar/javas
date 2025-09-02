package fundamentals.types;

import java.util.Date;

public class NonPrimitiveReferenceDataTypes {
    public static void main(String[] args) {

        byte age = 30;
        //age.


        Date now = new Date();
        System.out.println("now");
        System.out.println(now);

        now.getTime();
        System.out.println(now.getTime());

    }
}