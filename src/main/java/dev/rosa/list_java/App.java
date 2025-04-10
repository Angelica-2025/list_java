package dev.rosa.list_java;

public final class App {

    private App() {
    }

    public static void main(String[] args) {
        WeekDaysManager weekDaysManager = new WeekDaysManager();
        weekDaysManager.createList();

        System.out.print("Week's days: ");
        for (String day : weekDaysManager.getDaysWeek()) {
            System.out.print(day + " ");
        }
    }
}
