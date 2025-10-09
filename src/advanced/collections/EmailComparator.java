package advanced.collections;

import java.util.Comparator;

public class EmailComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer customer1, Customer customer2) {
        return customer1.getEmail()
                .compareToIgnoreCase(customer2.getEmail());
    }
}
