package ro.fasttrackit.curs13.exceptions.exercises;

public class InvalidAgeException extends Exception{
    public InvalidAgeException(int age) {
        super("Age " + age + " is invalid.");
    }
}
