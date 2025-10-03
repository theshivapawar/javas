package oops.inheritance.polymorphism;

public class Main {
    public static void main(String[] args) {

        UIControl[] controls = {new TextBox(), new CheckBox(), new UIControl()};

        for (var control : controls)
            control.render();

    }
}
