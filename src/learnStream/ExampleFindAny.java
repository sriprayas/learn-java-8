package learnStream;

import learnStream.model.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Prayas on 3/25/2018.
 */
public class ExampleFindAny {
    public static void main(String args[]){
        Person person1 = new Person("Tony", 74);
        Person person2 = new Person("Jhon", 24);
        Person person3 = new Person("Sansa", 20);
        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);

        System.out.println( personList.stream()
            .filter(e -> "Jhon".equalsIgnoreCase(e.getName()))
            .findAny()
            .orElse(null)
        );

        System.out.println( personList.stream()
                .filter(e -> "Prayas".equalsIgnoreCase(e.getName()))
                .findAny()
                .orElse(null)
        );

    }
}
