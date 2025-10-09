package advanced.generics.comparable;

public class User implements Comparable<User> {
    private String name;
    private int points;

    public User(String name, int points) {
        this.name = name;
        this.points = points;
    }

    @Override
    public int compareTo(User other) {
        return points - other.points;

        /*
        if (points < other.points)
            return -1;

        if (points > other.points)
            return 1;

        return 0;
        */

    }

    @Override
    public String toString() {
        return name + "=" + points;
    }
}
