package oops.inheritance.up_down_casting;

public class TextBox extends UIControl {
    private String text = "";

    public void setText(String text) {
        this.text = text;
    }

    public void clear() {
        text = "";
    }

    public String getText() {
        return text;
    }
}
