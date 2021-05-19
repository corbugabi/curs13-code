package ro.fasttrackit.curs13.homework;

import java.util.HashMap;
import java.util.Map;

public class Ex1 {
    public static void main(String[] args) {
        Map<String, Integer> student = new HashMap<>();

        student.put("Calin", 1);
        student.put("Ana", 10);
        student.put("Ionel", 5);
        student.put("Vali", 8);

        printStudents(student);
        System.out.println(highestGrade(student));
    }

    private static void printStudents(Map<String, Integer> student) {
        for (String name : student.keySet()) {
            System.out.println(name + " : " + student.get(name));
        }
    }

    private static String highestGrade(Map<String, Integer> student) {
        int max = 0;
        String nameMax = "";
        for (String name : student.keySet()) {
            int nota = student.get(name);
          if(nota > max ){
              max = nota;
              nameMax = name;
          }
        }
        return nameMax;
    }
}
