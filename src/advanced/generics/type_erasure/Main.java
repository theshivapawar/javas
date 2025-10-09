package advanced.generics.type_erasure;

public class Main {
    public static void main(String[] args) {

        /* Type Erasure
        * When we compile a generic class or interface, the java compiler
        * will erase all the generic type parameters (T's) and replace them
        * with a class or interface based on the constraints we have set.
        *
        * If there is no constraint, by default Object class is used.
        * If there is one constraint, that constraint will be used.
        * If there are multiple constraints, the left most one
        * will be used. */

    }
}
