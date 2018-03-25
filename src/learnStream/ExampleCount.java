package learnStream;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Prayas on 3/25/2018.
 */
public class ExampleCount {
    public static void main(String args[]){
        List<String> names = new ArrayList<>();
        names.add("Tony");
        names.add("Sansa");
        names.add("Jhon");
        names.add("Dany");
        names.add("Dragons");

        System.out.println(
            names.stream()
                    .filter(givenElement -> givenElement.length()>4)
                    .count()
        );
    }
}
