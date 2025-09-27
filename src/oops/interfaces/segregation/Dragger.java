package oops.interfaces.segregation;

public class Dragger {
    public void drag(UIWidget widget) {
        widget.drag();
    }

    public void drag(Draggable draggable) {
        draggable.drag();
    }
}

// Interface Segregation Principle
// We should segregate or divide a fat interface
// into a bunch of smaller ones to
// reduce the impact of changes
// We should segregate each capability