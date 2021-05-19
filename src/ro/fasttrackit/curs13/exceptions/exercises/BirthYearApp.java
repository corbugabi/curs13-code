package ro.fasttrackit.curs13.exceptions.exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BirthYearApp {
    public void run() {
        int age = 0;
        Scanner scanner = new Scanner(System.in);
        BirthYearCalculator birthYearCalculator = new BirthYearCalculator();
        do {
            System.out.print("Introduceti varsta: ");
            try {
                age = scanner.nextInt();
                System.out.println("Anul nasteri este " + birthYearCalculator.calculateYear(age));
            } catch (InvalidAgeException ex) {
                System.out.println("Varsta nu este corecta, Va rugam mai incercati");
            } catch (InputMismatchException ime) {
                System.out.println("Varsta nu este corecta, Va rugam mai incercati");
                scanner = new Scanner(System.in);
            }
        } while (age != -1);
    }

    public static void main(String[] args) {
        new BirthYearApp().run();
    }
}
