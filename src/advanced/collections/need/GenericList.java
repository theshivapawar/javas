package advanced.collections.need;

public class GenericList<T> {
    //public T[] items;
    //public ArrayList<T> items;
    private T[] items;
    private int count;

    public GenericList(int length) {
        items = (T[]) new Object[length];
        //items = new ArrayList<>();
    }

    public void add(T item) {
        items[count++] = item;
    }

    public T get(int index) {
        if (index < 0 || index >= count)
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
