package functions.predicates;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Prayas on 3/14/2018.
 */
public class FilterNumbers {
    public static void main(String args[]) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(77);
        numbers.add(3);
        numbers.add(44);
        List<Integer> evenNumber = numbers.stream().filter(num -> num%2==0).collect(Collectors.toList());
        evenNumber.forEach(num -> System.out.println("Even number is " + num));
    }
}