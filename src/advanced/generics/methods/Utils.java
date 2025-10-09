package advanced.generics.methods;

import advanced.generics.need.User;
import advanced.generics.solution.List;

public class Utils {

    public static <T extends Comparable<T>> T max(T first, T second) {
        return first.compareTo(second) > 0 ? first : second;
    }

    public static <K, V> void printKeyValuePair(K key, V value) {
        System.out.println(key + " => " + value);
    }

    public static void printUser(User user) {
        System.out.println(user);
    }

    /*
    public static void printObjects(List<Object> objects) {
        for (int i = 0; i < objects.getCount(); i++)
            System.out.println(objects.get(i));
    }
    */

    /*
    public static void printUsers(List<User> users) {
        for (int i = 0; i < users.getCount(); i++)
            System.out.println(users.get(i));
    }
    */

    // class CAP#1 {}
    public static void printItems(List<?> items) {
        for (int i = 0; i < items.getCount(); i++)
            System.out.println(items.get(i));

        // as CAP#1 is an Object
        //Object item = items.get(0);

        // to add, need an instance of CAP#1 (specific)
        //items.add()
    }

    // class CAP#1 extends User
    // class Instructor extends User
    public static void printUsers(List<? extends User> users) {
        for (int i = 0; i < users.getCount(); i++)
            System.out.println(users.get(i));

        // as CAP#1 extends User, instance of it can be stored in User
        User user = users.get(0);

        // to add, need an instance of CAP#1 (specific)
        // CAP#1 extends User
        // Instructor extends User
        // Student extends User

        // List<CAP#1> users
        // List<Instructor> instructors
        // instructors.add(teacher)

    }

    public static void addUser(List<? super User> users) {
        // User extends Object
        // User extends CAP#1
        // List<CAP#1> users

        users.add(new User("Messi"));
        users.add(new Instructor("Priya"));

        //Object user = users.get(0);
        User user = (User) users.get(0);
    }

    /*
    public static int max(int first, int second) {
        return (first > second) ? first : second;
    }
    */
}

// CAP#1 Synthetic Type Variable