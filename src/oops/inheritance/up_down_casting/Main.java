package oops.inheritance.up_down_casting;

public class Main {
    public static void main(String[] args) {
        var control = new UIControl();
        show(control);

        var textBox = new TextBox();
        show(textBox);
    }

    public static void show(UIControl control) { // up-casting
        if (control instanceof TextBox) {
            var textBox = (TextBox) control; // down-casting
            textBox.setText("Hello!");
            System.out.println(textBox.getText());
        }

        /*
        if (control instanceof TextBox textBox) {
            textBox.setText("Hello!");
            System.out.println(textBox.getText());
        }
        */

        System.out.println(control);
    }
}
