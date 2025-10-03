package advanced.exceptions.generics.poor_solution;

import advanced.exceptions.generics.need.User;

public class Main {
    public static void main(String[] args) {

        var items = new List(3);
        //items.add(Integer.valueOf(1)); //boxing
        items.add(1); // auto-boxing
        items.add("2");
        items.add(new User("Sid"));

        int number = (int) items.get(0); // verbose and noisy
        System.out.println(number);

        int number2 = (int) items.get(1);
        System.out.println(number2);

    }
}

/*
* We will not be aware of bugs until we run our application
* and test all the functions. We can only identify problems
* at runtime. It would be great, if we could catch
* problems at compile time.
* */
