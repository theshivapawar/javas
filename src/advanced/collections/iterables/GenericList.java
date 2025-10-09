package advanced.collections.iterables;

import java.util.Iterator;

public class GenericList<T> implements Iterable<T> {
    private T[] items;
    private int count;

    public GenericList(int length) {
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

    public int getCount() {
        return count;
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator(this);
    }

    private class ListIterator implements Iterator<T> {
        private GenericList<T> list;
        private int index;

        public ListIterator(GenericList<T> list) {
            this.list = list;
            //list.items
        }

        @Override
        public boolean hasNext() {
            return index < list.count;
        }

        @Override
        public T next() {
            return list.items[index++];
        }
    }
}
