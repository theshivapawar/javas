package oops.inheritance.inheriting;

public class Main {
    public static void main(String[] args) {

        var control = new UIControl();
        control.disable();
        System.out.println(control.isEnabled());

        var textBox = new TextBox();
        textBox.disable();
        System.out.println(textBox.isEnabled());

    }
}
