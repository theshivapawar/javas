package advanced.exceptions.generics.need;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        var integers = new List(2);
        integers.add(2);
        integers.add(3);
        System.out.println(Arrays.toString(integers.getIntegers()));

        var users = new UserList(2);
        users.add(new User("Shivam"));
        System.out.println(Arrays.toString(users.getUsers()));
    }
}
