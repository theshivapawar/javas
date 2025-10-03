package advanced.exceptions.generics.solution;

public class List<T> {
    private T[] items;
    private int count;

    public List(int length) {
        items = (T[]) new Object[length];
    }

    public void add(T item) {
        items[count++] = item;
    }

    public T get(int index) {
        if (index < 0 || index >= items.length)
            throw new IllegalArgumentException("Invalid Index");

        return items[index];
    }

    public T[] getItems() {
        return items;
    }

    public int getCount() {
        return count;
    }
}

/* Generic classes can be reused to pass different types of
objects.

T -> Generic Type Parameter

T -> Type / Template
E -> Element - Used in implementing class that acts
               as a collection

Our code becomes cleaner. Generic gives compile-time type safety.
We can catch our mistakes at compile-time rather than runtime.
* */
