package functions.basic;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Prayas on 3/13/2018.
 */
public class ComputeIfAbsent {
    public static void main(String args[]){
        Map<String, String> userMap = new HashMap<>();
        // Evaluate
        userMap.computeIfAbsent("Prayas", s -> s.substring(0, 2));
        userMap.forEach((user, userPass) -> System.out.println("User :: " + user + " User Pass :: " + userPass));
        // Evaluate :: Works only if value is not present
        userMap.computeIfAbsent("Prayas", s -> s.toLowerCase());
        userMap.forEach((user, userPass) -> System.out.println("User :: " + user + " User Pass :: " + userPass));
    }
}
