package oops.classes;

public class CreatingObjects {
    public static void main(String[] args) {
        /*
        TextBox textBox = new TextBox();
        System.out.println(textBox.text.toUpperCase());
        */

        var textBox1 = new TextBox();
        //textBox1.setText("Box 1");
        System.out.println(textBox1.text.toUpperCase());


        var textBox2 = new TextBox();
        textBox2.setText("Box 2");
        System.out.println(textBox2.text);

    }
}