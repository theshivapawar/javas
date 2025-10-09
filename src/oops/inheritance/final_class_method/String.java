package oops.inheritance.final_class_method;

import java.util.Arrays;

public final class String {
    private final char[] value;

    public String(char[] value) {
        this.value = Arrays.copyOf(value, value.length);
    }
}

//class XString extends String {
//
//}

/* When we declare a class as final, we can not extend it.
* We use final classes in situations where we are 100% sure
* about the implementation of  a class, and we want to prevent
* other classes from extending that class. */

/*
* implementation of a class is very specific
* certain assumptions are made specially about changing the state
* */