package learnStream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by Prayas on 3/26/2018.
 */
public class ExampleBasicStreamOpt {
    public static void main(String args[]){
        // Applying on the list
        Arrays.asList("a1", "a2", "c1", "c2", "d")
                .stream()
                .findFirst()
                .ifPresent(System.out::println);
        System.out.println("***********************************");

        // Generating list from the stream
        Stream.of("aA", "bB", "cC", "dD")
                .findFirst()
                .ifPresent(System.out::println);
        System.out.println("***********************************");

        // Supports primitive
        IntStream
                .range(0, 4)
                .forEach(System.out::println);
        System.out.println("***********************************");

        // Primitive have additional operations such as sum and average
        Arrays.stream(new int[]{1, 2, 3, 4})
                .filter(e -> e%2 == 0)
                .average()
                .ifPresent(System.out::println);
        System.out.println("***********************************");

        // Sum
        System.out.println(
                Arrays.stream(new int[] {1, 2, 3, 4})
                        .sum()
        );
        System.out.println("***********************************");

        // Objects and primitives are inter changeable
        Stream.of(1.0, 2.0, 3.0, 4.0)
                .mapToInt(Double::intValue)
                .mapToObj(e -> "p" + e)
                .forEach(System.out::println);

        System.out.println("***********************************");
    }
}
