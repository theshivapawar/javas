package advanced.exceptions.generics.constraint;

public class User implements Comparable<User> {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(User other) {
        return name.compareToIgnoreCase(other.name);
    }

    @Override
    public String toString() {
        return name;
    }
}
