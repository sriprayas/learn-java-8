package learnStream;

import learnStream.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Prayas on 3/27/2018.
 */
public class ExampleToMap {
    public static void main(String args[]) {
        Person person1 = new Person("Tony", 74);
        Person person2 = new Person("Jhon", 24);
        Person person3 = new Person("Sansa", 20);
        Person person4 = new Person("Tony", 74);

        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        personList.add(person4);

        Map<Integer, String> map = personList
                .stream()
                .collect(Collectors
                    .toMap(p -> p.getAge(),
                            p -> p.getName(),
                        (name1, name2) -> name1 + ":" + name2));

        System.out.println(map);
    }
}
