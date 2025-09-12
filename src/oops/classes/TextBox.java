package oops.classes;

public class TextBox {
    //public String text;
    public String text = "";

    public void setText(String text) {
        //text = text; // parameter
        // text = 'Argument'
        this.text = text;
    }

    public void clear() {
        text = "";
    }
}