package oops.classes;

public class MemoryAllocation {
    public static void main(String[] args) {

        var textBox1 = new TextBox();
        var textBox2 = textBox1;

        textBox2.setText("Box 2");
        System.out.println(textBox1.text);
    }
}