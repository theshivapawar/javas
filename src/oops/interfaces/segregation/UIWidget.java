package oops.interfaces.segregation;

public interface UIWidget extends Draggable, Resizable {
    void render();
}

// an interface can have multiple parents
// but a class can not have