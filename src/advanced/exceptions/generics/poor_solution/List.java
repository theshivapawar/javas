package advanced.exceptions.generics.poor_solution;

public class List {
    private Object[] items;
    private int count;

    public List(int length) {
        items = new Object[length];
    }

    public void add(Object item) {
        items[count++] = item;
    }

    public Object get(int index) {
        if (index < 0 || index >= items.length)
            throw new IllegalArgumentException("Invalid Index");

        return items[index];
    }

    public Object[] getItems() {
        return items;
    }

    public int getCount() {
        return count;
    }
}
