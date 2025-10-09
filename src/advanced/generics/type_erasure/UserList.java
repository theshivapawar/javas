package advanced.generics.type_erasure;

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

/* Here we have multiple constraints, java compiler will
* take the left most one and replaced all generic type
* parameters (T's) with that constraint (class or interface)
*
* T extends User & Comparable
* T will be replaced by User class.
*
* T extends Comparable & Cloneable
* T will be replaced by Comparable interface.
* */
