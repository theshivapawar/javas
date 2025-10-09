package advanced.generics.type_erasure;

public class NumberList<T extends Number> {
    private T[] numbers;
    private int count;

    public NumberList(int length) {
        numbers = (T[]) new Number[length];
    }

    public void add(T number) {
        numbers[count++] = number;
    }

    public T get(int index) {
        if (index < 0 || index >= count)
            throw new IllegalArgumentException("Invalid Index");

        return numbers[index];
    }

}

/* When we apply a constraint, the generic type parameters
* will be replaced by a class or interface based on the
* constraints we set.
* T extends Number
* All the T's will be replaced by Number class. */
