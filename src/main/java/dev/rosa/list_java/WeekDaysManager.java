package dev.rosa.list_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WeekDaysManager {

    private List<String> days = new ArrayList<>();

    public void createList() {
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");

    }

    public List<String> getDaysWeek() {
        return days;
    }

    public int getListSize() {
        return days.size();

    }

    public boolean removeDay(String day) {
        return days.remove(day);
    }

    public String getSpecificDay(String day) {
        return day;
    }

    public boolean checkDayExist(String day) {
        return days.contains(day);
    }

    public void sortDays() {
        Collections.sort(days);
    }

    public void clearList() {
        days.clear();
    }

}
