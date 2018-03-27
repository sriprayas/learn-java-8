package learnStream.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Prayas on 3/28/2018.
 */
public class Developer {
    private String name;
    private Set<String> languages;

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", languages=" + languages +
                '}';
    }

    public Developer(String name) {
        this.languages = new HashSet<>();
        this.name = name;
    }

    public void add(String language) {
        this.languages.add(language);
    }

    public Set<String> getLanguages() {
        return languages;
    }
}