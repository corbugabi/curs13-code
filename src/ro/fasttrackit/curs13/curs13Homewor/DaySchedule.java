package ro.fasttrackit.curs13.curs13Homewor;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DaySchedule {
    private final Day day;
    private final List<String> activity =new ArrayList<>();


    public DaySchedule(Day day, List<String> activity){
        this.day = day;
        if(activity != null){
            this.activity.addAll(activity);
        }
    }

    public Day getDay() {
        return day;
    }

    public List<String> getActivity() {
        return activity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DaySchedule that = (DaySchedule) o;
        return day == that.day && Objects.equals(activity, that.activity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, activity);
    }

    @Override
    public String toString() {
        return "DaySchedule{" +
                "day=" + day +
                ", activity=" + activity +
                '}';
    }
}
