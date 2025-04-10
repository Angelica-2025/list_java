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
        weekDays.createList(); // Asegúrate de que este método se llama
    }

    @Test
    void getDaysWeek() {
        // Lista esperada de días de la semana
        List<String> expectedDays = List.of("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday",
                "Sunday");

        // Obtenemos la lista real de días desde el método getDaysWeek()
        List<String> actualDays = weekDays.getDaysWeek();

        // Depuración: Imprimir ambas listas para verificar el contenido

        // Comprobamos si ambas listas son iguales
        assertThat(actualDays).isEqualTo(expectedDays);
    }
}
