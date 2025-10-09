package advanced.collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {

        var c1 = new Customer("c1", "e1");
        var c2 = new Customer("c2", "e2");

        Map<String, Customer> customers = new HashMap<>();
        customers.put("e1", c1);
        customers.put("e2", c2);

        var unknown = new Customer("Customer", "Email");
        System.out.println(customers.get("e1"));
        System.out.println(customers.get("e10"));
        System.out.println(customers.getOrDefault("e10", unknown));

        System.out.println(customers.containsKey("e1"));
        System.out.println(customers.containsValue(c2));

        customers.replace("e1", new Customer("c1+", "e1"));
        System.out.println(customers);

        for (var email : customers.keySet())
            System.out.println(email);

        for (var customer : customers.values())
            System.out.println(customer);

        for (var entry : customers.entrySet())
            System.out.println(entry.getKey() + " -> " + entry.getValue());
    }
}

/*
* Array or List O(n)
* Hash Tables
* O(1) Constant Time
*
* Java -> Map (key -> value)
* C# -> Dictionary (word -> meaning)
* Python -> Dictionary
* JavaScript -> Object {'ID': 101}
* */
