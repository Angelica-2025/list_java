package dev.rosa.list_java;

import java.util.List;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */

    // Método principal para probar la funcionalidad
    public static void main(String[] args) {
        // Crear una instancia de WeekDaysManager
        WeekDaysManager weekDaysManager = new WeekDaysManager();

        // Llamar a createList para llenar la lista de días
        weekDaysManager.createList();

        // Obtener la lista de días usando el método getWeekDays
        List<String> days = weekDaysManager.getWeekDays();

        // Imprimir la lista de días en consola
        // Opción 1: Imprimir toda la lista en una sola línea
        System.out.println("Week's days: " + days);
    }

}