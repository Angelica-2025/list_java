package dev.rosa.list_java;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class WeekDaysManagerTest {

    private WeekDaysManager weekDays;

    @BeforeEach
    void setUp() {
        weekDays = new WeekDaysManager();
        weekDays.createList();
    }

    @Test
    @DisplayName("Added test for getting the days of the week")
    public void testgetDaysWeek() {
        List<String> expectedDays = List.of("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday",
                "Sunday");
        List<String> actualDays = weekDays.getDaysWeek();
        assertThat(actualDays).isEqualTo(expectedDays);
    }

    @Test
    @DisplayName("Test for getting the size of the list")
    public void testgetListSize() {
        int actualSize = weekDays.getListSize();
        assertThat(actualSize).isEqualTo(7);
    }

    @Test
    @DisplayName("Test for remove a day that does not exist")
    public void testRemoveDay() {
        int initialSize = weekDays.getListSize();
        boolean removed = weekDays.removeDay("Tuesday");
        assertThat(removed).isTrue();
        assertThat(weekDays.getDaysWeek()).doesNotContain("Tuesday");
    }

}

/*
 * Depuración: Imprimir ambas listas para verificar el contenido
 * System.out.println("Expected: " + expectedDays);
 * System.out.println("Actual: " + actualDays);
 */
