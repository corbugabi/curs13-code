package ro.fasttrackit.curs13.homework;

import java.util.List;

import static ro.fasttrackit.curs13.homework.Hair.*;

public class PersonMain {
    public static void main(String[] args) {
        PersonService persons = new PersonService(List.of(
                new Person("Ana", 18, BLACK),
                new Person("Ion", 34, BLONDE),
                new Person("Calin", 50, RED),
                new Person("Geo", 20, BLACK)
        ));

        System.out.println(persons.extractPersonNames());
        System.out.println("----------------");
        System.out.println(persons.mapNameToAge());
        System.out.println("----------------");
        System.out.println(persons.mapHairToName());
    }
}
