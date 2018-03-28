package learnParallelStream;

import java.util.concurrent.ForkJoinPool;

/**
 * Created by Prayas on 3/28/2018.
 */
public class NumberOfParallelism {
    public static void main(String args[]){
        ForkJoinPool commonPool = new ForkJoinPool();
        System.out.println("Parallelism " + commonPool.getParallelism());
    }
}
