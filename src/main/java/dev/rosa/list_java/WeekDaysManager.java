package dev.rosa.list_java;

import java.util.ArrayList;
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

    // Método para obtener la lista de días
    public List<String> getDaysWeek() {
        return days;
    }

    public int getListSize() {
        return days.size();

    }

}
