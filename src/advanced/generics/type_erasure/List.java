package advanced.generics.type_erasure;

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
        if (index < 0 || index >= count)
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

/* This class is implemented like a generic list of objects.
* When we compile, all the type parameters will be replaced
* by Object class. */
