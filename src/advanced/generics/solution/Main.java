package advanced.generics.solution;

import advanced.generics.need.User;

public class Main {
    public static void main(String[] args) {

        var integers = new List<Integer>(2);
        integers.add(1);
        //integers.add("2");
        integers.add(2);

        //int number = integers.get(0).intValue(); // unboxing
        int number = integers.get(0); // auto-unboxing
        System.out.println(number);

        var users = new List<User>(2);
        users.add(new User("Shivam"));

        User user = users.get(0);
        System.out.println(user);

    }
}
