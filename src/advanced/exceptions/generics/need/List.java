package advanced.exceptions.generics.need;

public class List {
    private int[] integers;
    private int count;

    public List(int length) {
        integers = new int[length];
    }

    public void add(int integer) {
        integers[count++] = integer;
    }

    public int get(int index) {
        if (index < 0 || index >= integers.length)
            throw new IllegalArgumentException("Invalid Index");

        return integers[index];
    }

    public int[] getIntegers() {
        return integers;
    }

    public int getCount() {
        return count;
    }
}
