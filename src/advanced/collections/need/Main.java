package advanced.collections.need;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        var names = new GenericList<String>(2);
        names.add("Shivam");
        System.out.println(names.get(0));

        //for (var name : names)
        /*
        for (var name : names.items)
            System.out.println(name);
        */

        /*
        names.items[0] = "Sid";
        System.out.println(names.items.length);
        */

        for (var name : names.getItems())
            System.out.println(name);

        System.out.println(names.getCount());
        System.out.println(names.get(0));
        System.out.println(names.get(1));

    }
}
