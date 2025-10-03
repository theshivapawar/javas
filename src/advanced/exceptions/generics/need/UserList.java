package advanced.exceptions.generics.need;

public class UserList {
    private User[] users;
    private int count;

    public UserList(int length) {
        users = new User[length];
    }

    public void add(User user) {
        users[count++] = user;
    }

    public User get(int index) {
        if (index < 0 || index >= users.length)
            throw new IllegalArgumentException("Invalid Index");

        return users[index];
    }

    public User[] getUsers() {
        return users;
    }

    public int getCount() {
        return count;
    }
}
