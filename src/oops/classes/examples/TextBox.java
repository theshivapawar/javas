package oops.classes.examples;

class TextBox {
    String text;
    short limit;
    short length;
    boolean isFocused;
    boolean isEnabled;

    void setText(String input) {
        text = input;
        setLength((short)input.length());
    }

    void clear() {
        text = "";
        length = 0;
    }

    void setLength(short inputLength) {
        length = inputLength;
    }

    void setLimit() {
        limit = 20;
    }

    void focus() {
        isFocused = true;
    }

    void unFocus() {
        isFocused = false;
    }

    void enable() {
        isEnabled = true;
    }

    void disable() {
        isEnabled = false;
    }
}