package learnParallelStream;

import java.util.Arrays;

/**
 * Created by Prayas on 3/28/2018.
 */
public class SimpleParallel {
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
                .forEach(s -> System.out.println("ForEach : " + s + " Thread : " +
                        Thread.currentThread().getName()));
    }
}
