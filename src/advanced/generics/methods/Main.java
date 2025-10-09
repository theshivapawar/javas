package advanced.generics.methods;

import advanced.generics.comparable.User;

public class Main {
    public static void main(String[] args) {

        System.out.println(Utils.max(1, 3));

        var shivam = new User("Shivam", 45);
        var satyam = new User("Satyam", 87);

        System.out.println(Utils.max(shivam, satyam));

        Utils.printKeyValuePair(101, "Shivam");
        Utils.printKeyValuePair(1, shivam);

        var pair = new KeyValuePair<Integer, String>(10, "Vijay");
        System.out.println(pair);

        var id_user = new KeyValuePair<Integer, User>(101, shivam);
        System.out.println(id_user);
    }
}
