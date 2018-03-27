package learnStream;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by Prayas on 3/27/2018.
 */
public class ExampleControlledOperations {
    public static void main(String args[]){
        Arrays.asList("a", "b", "c", "c")
                .stream()
                .filter(e -> {
                    System.out.println("Inside filter -> " + e);
                    return true;
                })
                .forEach(e -> System.out.println("Inside for each -> " + e));
        System.out.println("***********************************");

        // Reduced Operations
        Stream.of("d2", "a2", "c", "e")
                .map(s -> {
                    System.out.println("Inside the map -> " + s);
                    return  s.toUpperCase();
                }).anyMatch(s -> {
                    System.out.println("Inside the matcher -> " + s);
                    return s.startsWith("A");
                });
        System.out.println("***********************************");

        // Sort is a special type of intermediate operation which maintains states
        Stream.of("d2", "a2", "c", "e")
                .sorted((s1, s2) -> {
                    System.out.println("Sort element :: " + s1 + " " + s2);
                    return s1.compareTo(s2);
                })
                .map(s -> {
                    System.out.println("Inside the map -> " + s);
                    return  s.toUpperCase();
                }).anyMatch(s -> {
            System.out.println("Inside the matcher -> " + s);
            return s.startsWith("A");
        });
        System.out.println("***********************************");
    }
}
