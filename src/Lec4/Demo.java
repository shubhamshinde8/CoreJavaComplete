package Lec4;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class Demo {
    public static void main(String[] args) {

//        Supplier<Integer> randomSupplier=()->(10);
//        System.out.println(randomSupplier.get());

        Predicate<String> endsWith=names->names.endsWith("i");

        System.out.println(endsWith.test("shubham"));
        System.out.println(endsWith.test("vaishali"));

    }
}
