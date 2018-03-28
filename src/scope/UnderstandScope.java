package scope;

import com.sun.xml.internal.ws.commons.xmlutil.Converter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Prayas on 3/29/2018.
 */
public class UnderstandScope {
    public static void main(String arg[]){
        final String gender = "M";
        final int age = 24;

        List<String> names = new ArrayList<>();
        names.add("Prayas");
        names.add("Jhon");

        names.stream()
                .map(n -> n+ gender + age)
                .forEach(System.out::println);
    }
}
