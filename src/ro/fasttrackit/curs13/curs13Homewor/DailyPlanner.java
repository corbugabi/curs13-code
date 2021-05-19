package ro.fasttrackit.curs13.curs13Homewor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DailyPlanner {
    private final List<DaySchedule> activitati = new ArrayList<>();

    public DailyPlanner(List<DaySchedule> activitati) {
        this.activitati.addAll(activitati);
    }

    public List<DaySchedule> getActivitati() {
        return activitati;
    }

    public boolean addActivity(Day day, List<String> activity) throws Exception {
        if (activity != null) {
            return activitati.add(new DaySchedule(day, activity));
        } else {
            throw new NoActivityException("Gresit");
        }
    }

    public boolean removeActivity(Day day, List<String> activity) {
        for (DaySchedule ac : activitati) {
            if (ac.equals(activity)) {
                return activitati.remove(new DaySchedule(day, activity));
            } else {
                throw new NoActivityException("Nu exista");
            }
        }
        return true;
    }

    public Map<Day, List<String>> endPlanning() {
        Map<Day, List<String>> result = new HashMap<>();
        for (DaySchedule activiti : activitati) {
            List<String> existList = result.get(activiti.getDay());
            if (existList == null) {
                existList = new ArrayList<>();
            }
            existList.add(String.valueOf(activiti.getActivity()));
            result.put(activiti.getDay(), existList);
        }
        return result;
    }

}
