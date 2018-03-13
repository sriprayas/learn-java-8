package functions.supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/**
 * Created by Prayas on 3/13/2018.
 */
public class SquaresGenerator {
    public static void main(String args[]) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(4);
        numbers.add(7);

        numbers.stream().forEach((num) -> {
            printSquares(() -> num);
        });
    }

    private static void printSquares(Supplier<Integer> supplier) {
        System.out.println(Math.pow(supplier.get(), 2));
    }
}
