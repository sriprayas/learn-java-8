package functions.operator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Prayas on 3/14/2018.
 */
public class UpperCaseConvertor {
    public static void main(String args[]) {
        List<Character> alphabets = new ArrayList<>();
        alphabets.add('a');
        alphabets.add('b');
        alphabets.add('c');
        alphabets.add('d');
        alphabets.add('e');
        alphabets.add('f');
        alphabets.replaceAll(alph -> alph.toUpperCase(alph));
        alphabets.forEach(alphabet -> System.out.println("Aplhabets in upper case are " + alphabet));
    }
}