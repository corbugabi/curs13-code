package ro.fasttrackit.curs13.homework;

import java.util.*;

public class PersonService {
    private final List<Person> persons = new ArrayList<>();

    public PersonService(Collection<Person> persons) {
        if (persons != null) {
            this.persons.addAll(persons);
        }
    }

    public List<String> extractPersonNames() {
        List<String> result = new ArrayList<>();
        for (Person person : persons) {
            result.add(person.getName());
        }
        return result;
    }

    public Map<String, Integer> mapNameToAge() {
        Map<String, Integer> result = new HashMap<>();
        for (Person person : persons) {
            result.put(person.getName(), person.getAge());
        }
        return result;
    }

    public Map<Hair, List<String>> mapHairToName() {
        Map<Hair, List<String>> result = new HashMap<>();
        for (Person person : persons) {
            List<String> existingList = result.get(person.getHaircolor());
            if (existingList == null) {
                existingList = new ArrayList<>();
                result.put(person.getHaircolor(),existingList);
            }
            existingList.add(person.getName());
        }
        return result;
    }
}
