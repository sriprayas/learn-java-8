package learnStream;

import learnStream.model.Developer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Prayas on 3/28/2018.
 */
public class ExampleLetsFlaten {
    public static void main(String args[]){
        List<Developer> team = new ArrayList<>();
        Developer dev1 = new Developer("Prayas");
        dev1.add("Java");
        dev1.add("Scala");
        dev1.add("Ruby");

        Developer dev2 = new Developer("Jhon Snow");
        dev2.add("C");
        dev2.add("C++");
        dev2.add("Cobol");

        team.add(dev1);
        team.add(dev2);

        System.out.println("Normal Iterations");
        team.forEach( System.out::println );

        System.out.println("Flattened ");
        team.stream()
            .map(e -> e.getLanguages())
            .flatMap(l -> l.stream())
            .forEach(System.out::println);
    }
}
