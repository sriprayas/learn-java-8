package learnStream;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Prayas on 3/25/2018.
 */
public class ExampleFilterMap {
    public static void main(String args[]){
        List<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(4);
        num.add(4);
        num.add(2);
        num.add(8);
        num.add(5);

        num.stream() // Get the stream
            .filter(element -> element%2 == 0) // filter for even number
            .mapToInt(filteredElement ->  filteredElement*2) // maps the element
            .forEach(System.out::println); // print the list
    }
}
