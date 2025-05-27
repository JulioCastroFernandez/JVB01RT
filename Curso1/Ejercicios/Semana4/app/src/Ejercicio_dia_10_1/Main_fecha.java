package Ejercicio_dia_10_1;

import java.time.LocalDate;

public class Main_fecha {
    public static void main(String[] args) {
        LocalDate fechaIda = LocalDate.of(2025, 10, 10);
        LocalDate fechaVuelta = LocalDate.of(2025, 10, 20);

        long diasDiferencia = FechaUtil.calcularDiferenciaDias(fechaIda, fechaVuelta);

        System.out.println("La diferencia de días es de: " + diasDiferencia + " dias.");
    }
}
