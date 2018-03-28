package learnParallelStream;

import java.util.Arrays;

/**
 * Created by Prayas on 3/28/2018.
 */
public class SimpleParallelAndSort {
    public static void main(String args[]){
        Arrays.asList("a", "b", "c", "d", "e")
                .parallelStream()
                .filter(e -> {
                    System.out.println("Filter : " + e + " Thread : " +
                    Thread.currentThread().getName());
                    return true;
                })
                .map(fe -> {
                    System.out.println("Map : " + fe + " Thread " +
                            Thread.currentThread().getName());
                    return fe.toUpperCase();
                })
                .sorted((s1, s2) -> {
                    System.out.println("Sort : " + s1 + " " + s2 + " Thread " +
                            Thread.currentThread().getName());
                    return s1.compareTo(s2);
                })
                .forEach(s -> System.out.println("ForEach : " + s + " Thread : " +
                        Thread.currentThread().getName()));
    }
}
