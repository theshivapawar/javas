package advanced.exceptions.generics.constraint;

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
        if (index < 0 || index >= numbers.length)
            throw new IllegalArgumentException("Invalid Index");

        return numbers[index];
    }

}

/*
* Constraint or Restriction on a type parameter
* Bounded Type Parameter
*
* <T extends Class>
* <T extends Interface>
* <T extends Class & Interface>
* <T extends Interface & Interface>
*
* Comparable - used to implement classes that can be
*              compared with each other
*
* Cloneable - able to clone or copy a class
* */
