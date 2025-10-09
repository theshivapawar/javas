package advanced.generics.comparable;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        var users = new UserList<User>(3);
        users.add(new User("Shivam", 90));
        users.add(new User("Ajay", 20));
        users.add(new User("Riya", 80));

        Arrays.sort(users.getUsers());
        System.out.println(Arrays.toString(users.getUsers()));
    }
}

/* Sorting algorithms are based on comparing objects.
* With this comparison, we can determine, which object should come first.
* */