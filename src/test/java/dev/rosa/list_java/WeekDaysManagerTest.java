package dev.rosa.list_java;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
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
    @DisplayName("Test for getting the days of the week")
    public void testGetDaysWeek() {
        List<String> expectedDays = List.of("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday",
                "Sunday");
        List<String> actualDays = weekDays.getDaysWeek();
        assertThat(actualDays).isEqualTo(expectedDays);
    }

    @Test
    @DisplayName("Test for getting the size of the list")
    public void testGetListSize() {
        int actualSize = weekDays.getListSize();
        assertThat(actualSize).isEqualTo(7);
    }

    @Test
    @DisplayName("Test for removing a day that exists in the list")
    public void testRemoveExistingDay() {
        int initialSize = weekDays.getListSize();
        boolean removed = weekDays.removeDay("Tuesday");
        assertThat(removed).isTrue();
        assertThat(weekDays.getDaysWeek()).doesNotContain("Tuesday");
    }

    @Test
    @DisplayName("Test for getting a specific day from the list")
    public void testGetSpecificDay() {
        String result = weekDays.getSpecificDay("Sunday");
        assertEquals("Sunday", result);
    }

    @Test
    @DisplayName("Test for checking if a specific day exists in the list")
    public void testCheckDayExist() {
        boolean exists = weekDays.checkDayExist("Friday");
        assertTrue(exists);
        boolean notExists = weekDays.checkDayExist("Funday");
        assertFalse(notExists);
    }

    @Test
    @DisplayName("Test for sorting the days of the week alphabetically")
    public void testSortDays() {
        weekDays.sortDays();
        List<String> sortedDays = weekDays.getDaysWeek();
        assertEquals("Friday", sortedDays.get(0));
    }

    @Test
    @DisplayName("Test for clearing the list of days")
    public void testClearList() {
        weekDays.clearList();

        int sizeAfterClear = weekDays.getListSize();
        assertEquals(0, sizeAfterClear);
    }
}
