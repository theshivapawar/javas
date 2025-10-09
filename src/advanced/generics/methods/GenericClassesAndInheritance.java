package advanced.generics.methods;

import advanced.generics.need.User;
import advanced.generics.solution.List;

public class GenericClassesAndInheritance {
    public static void main(String[] args) {

        //Utils.printUser(new User("Shivam"));
        //Utils.printUser(new Instructor("Rohit"));

        var users = new List<User>(1);
        users.add(new User("Sam"));

        Utils.printUsers(users);
        //Utils.printUsers(new List<Instructor>(1));
        // List<user> != List<Instructor>



    }
}

/*
* List<Instructor> is not a subtype of List<User>.
* List is the same generic class.
* */