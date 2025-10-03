package advanced.exceptions.generics.constraint;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //new NumberList<String>(2)
        var numbers = new NumberList<Number>(2);
        numbers.add(2);
        Number number = numbers.get(0);

        var integers = new NumberList<Integer>(2);
        integers.add(1);

        int integer = integers.get(0);

        var users = new UserList<User>(2);
        users.add(new User("Shivam"));
        users.add(new User("Ajay"));

        Arrays.sort(users.getUsers());
        System.out.println(Arrays.toString(users.getUsers()));
    }
}
