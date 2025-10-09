package advanced.collections;

public class Customer implements Comparable<Customer> {
    public String name;
    private String email;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public int compareTo(Customer other) {
        return name.compareToIgnoreCase(other.name);
    }

    @Override
    public String toString() {
        return name + " " + email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
