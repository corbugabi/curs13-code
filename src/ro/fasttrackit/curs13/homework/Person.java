package ro.fasttrackit.curs13.homework;

import java.util.Objects;

public class Person {
    private final String name;
    private final int age;
    private final Hair hairColor;

    public Person(String name, int age, Hair hairColor) {
        this.name = name;
        this.age = age;
        this.hairColor = hairColor;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Hair getHaircolor() {
        return hairColor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && hairColor == person.hairColor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, hairColor);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", haircolor=" + hairColor +
                '}';
    }
}
