package Lec4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class OptionalX {

    public static void main(String[] args) {
        List<String>  names=new ArrayList<>();
        names.add("Shubham");
        names.add("Vishal");
        names.add("Atxul");
        names.add("Vaishali");
        names.add("Gauri");

        String name=names.stream().
                filter(str->str.contains("x")).
                findFirst()
                        .orElse("Not found ");

        System.out.println(name);

    }

}

