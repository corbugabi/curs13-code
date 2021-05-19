package ro.fasttrackit.curs13.curs13Homewor;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Throwable{
        DailyPlanner dailyPlanner = new DailyPlanner(List.of(
            new DaySchedule(Day.MONDAY,List.of("Mers","Inot")),
            new DaySchedule(Day.THURSDAY,List.of("Alergat","Inot")),
            new DaySchedule(Day.FRIDAY,List.of("Mers","Inot")),
            new DaySchedule(Day.SUNDAY,List.of("Mers","Inot")),
            new DaySchedule(Day.SUNDAY,List.of("Mers","Canot"))
        ));

        System.out.println(dailyPlanner.getActivitati());
        System.out.println("--------------");
        System.out.println(dailyPlanner.addActivity(Day.MONDAY,List.of("Baie")));
        System.out.println("---------------");
        System.out.println(dailyPlanner.getActivitati());
        System.out.println("----------------");
        System.out.println(dailyPlanner.removeActivity(Day.MONDAY,List.of("Baie")));
        System.out.println("-----------------");
        System.out.println(dailyPlanner.getActivitati());
        System.out.println("-----------------");
        System.out.println(dailyPlanner.endPlanning());
    }
}
