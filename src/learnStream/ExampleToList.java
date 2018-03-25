package learnStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Prayas on 3/25/2018.
 */
public class ExampleToList {
    public static void main(String args[]){
        List<String> mixedList = new ArrayList<>();
        mixedList.add("Tony");
        mixedList.add("Harvey");
        mixedList.add("Ross");

        mixedList.stream()
                .filter(name -> !"Tony".equalsIgnoreCase(name))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
