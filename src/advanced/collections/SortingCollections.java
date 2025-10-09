package advanced.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingCollections {
    public static void main(String[] args) {

        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("B", "e3"));
        customers.add(new Customer("A", "e2"));
        customers.add(new Customer("D", "e1"));
        System.out.println(customers);

        Collections.sort(customers);
        System.out.println(customers);

        Collections.sort(customers, new EmailComparator());
        System.out.println(customers);
    }
}
