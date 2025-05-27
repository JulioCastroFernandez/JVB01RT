package Ejercicio_dia_10_1;
import java.time.LocalDate;
import java.time.Period;

public class FechaUtil {

    public static long calcularDiferenciaDias(LocalDate fecha1, LocalDate fecha2) {
        Period period = Period.between(fecha1, fecha2);

        Period.between(fecha1, fecha2).getDays();
        return Math.abs(period.getDays());
    }
}
