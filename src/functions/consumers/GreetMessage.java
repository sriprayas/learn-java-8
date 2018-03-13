package functions.consumers;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Prayas on 3/13/2018.
 */
public class GreetMessage {
    public static void main(String args[]) {
        List<String> names = new ArrayList<>();
        names.add("Prayas");
        names.add("Joey");
        names.add("Mickey");
        names.forEach(name -> System.out.println("Hi " + name));
    }
}
