package ro.fasttrackit.curs13.exceptions.exercises;

public class Main {
    public static void main(String[] args) {
        BirthYearCalculator birthYearCalculator = new BirthYearCalculator();
        try {
            System.out.println(birthYearCalculator.calculateYear(10));
        }catch (InvalidAgeException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            System.out.println(birthYearCalculator.calculateYear(-19));
            System.out.println(birthYearCalculator.calculateYear(50));
        }catch (InvalidAgeException ex){
            System.out.println(ex.getMessage());
        }
    }
}
