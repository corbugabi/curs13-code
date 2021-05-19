package ro.fasttrackit.curs13.exceptions.exercises;

import java.time.LocalDate;

public class BirthYearCalculator {
    public  int calculateYear(int age) throws InvalidAgeException{
        if(age<0 || age>200){
            throw new InvalidAgeException(age);
        }
        return LocalDate.now().getYear() - age;
    }
}
