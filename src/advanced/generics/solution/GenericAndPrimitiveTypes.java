package advanced.generics.solution;

public class GenericAndPrimitiveTypes {
    public static void main(String[] args) {

        // new List<float>(2)
        var prices = new List<Float>(2);

        //floats.add(Float.valueOf(1.5F)); //Boxing
        prices.add(1.5F); //auto-boxing

        //float price = prices.get(0).floatValue(); // UnBoxing
        float price = prices.get(0);
        System.out.println(price);
    }
}

/*
* We can only pass reference types as generic type argument.
*
* Wrapper Class: We wrap a primitive type value around
* reference type object.
*
* To represent a primitive value as an object, we store
* it inside an object.
*
* Primitive ---- Wrapper Class (Object Representation)
* byte -> Byte
* short -> Short
* int -> Integer
* long -> Long
* float -> Float
* double -> Double
* char -> Character
* boolean -> Boolean
*
* Boxing -> Primitive Value to Wrapper Class Instance (Object)
* We put a primitive value inside an object box.
* Integer number = Integer.valueOf(1);
*
* Unboxing -> Extracting the primitive value from an object or wrapper.
* int value = number.intValue();
* */
