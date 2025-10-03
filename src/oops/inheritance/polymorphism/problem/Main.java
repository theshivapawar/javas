package oops.inheritance.polymorphism.problem;

public class Main {
    public static void main(String[] args) {

        UIControl[] controls = {new TextBox(), new CheckBox(), new UIControl()};

        for (var control : controls) {
            if (control instanceof TextBox)
                ((TextBox) control).render();
            else if (control instanceof CheckBox)
                ((CheckBox) control).render();
            else
                System.out.println("Not a UIControl");
        }
    }
}
