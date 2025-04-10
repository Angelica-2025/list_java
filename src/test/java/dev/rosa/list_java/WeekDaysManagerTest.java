package dev.rosa.list_java;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WeekDaysManagerTest {

    private WeekDaysManager weekDays;

    @BeforeEach
    void setUp() {
        weekDays = new WeekDaysManager();
    }

    @Test
    // Lista esperada de días de la semana
    void getDaysWeek() {

        // Lista esperada de días de la semana - Given
        List<String> expectedDays = List.of("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday",
                "Sunday");

        // When - Obtenemos la lista real de días desde el método getDaysWeek() de la
        // clase WeekDaysManager
        List<String> actualDays = weekDays.getDaysWeek();

        // Then - Comprobamos si ambas listas son iguales usando assertIterableEquals
        assertThat(actualDays);

    }

    private void assertThat(List<String> actualDays) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'assertThat'");
    }

}
