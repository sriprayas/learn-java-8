package methodReffer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Prayas on 3/19/2018.
 */
public class StaticMethodReff {
    public static void main(String args[]){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.forEach(StaticMethodReff::printNumberOfList);
    }

    public static void printNumberOfList(Integer num){
        System.out.println("Number in the list is  " + num);
    }
}
