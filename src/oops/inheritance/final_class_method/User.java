package oops.inheritance.final_class_method;

public class User {
    private String userName;
    private String role;

    public final boolean hasAccess(String page) {
        return role.equals("Admin") || page.equals("Home");
    }
}

class Teacher extends User {
//    @Override
//    public boolean hasAccess(String page) {
//        //...
//    }
}

/* When we declare a method as final, we can not
* override it.*/

/* We use final methods when
* we have made certain assumptions
* we are changing the state of the classes in a particular way
* we don't want the subclasses to change this behaviour
* or break our assumptions
* */