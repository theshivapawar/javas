package advanced.generics.constraint;

public class UserList<T extends User & Comparable<User>> {
    private T[] users;
    private int count;

    public UserList(int length) {
        users = (T[]) new User[length];
    }

    public void add(T user) {
        users[count++] = user;
    }

    public T get(int index) {
        if (index < 0 || index >= count)
            throw new IllegalArgumentException("Invalid Index");

        return users[index];
    }

    public T[] getUsers() {
        return users;
    }

    public int getCount() {
        return count;
    }
}
