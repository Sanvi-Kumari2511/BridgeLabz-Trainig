package com.streamapi.transformingnamesfordisplay;
import java.util.Arrays;
import java.util.List;

public class CustomerNameDisplay {
    public static void main(String[] args) {

        //List of customer names
        List<String> names = Arrays.asList("sandip", "sanvi", "annu", "priyanshu");

        //Stream processing
        names.stream()
             .map(name -> name.toUpperCase())
             .sorted()
             .forEach(name -> System.out.println(name));
    }
}
