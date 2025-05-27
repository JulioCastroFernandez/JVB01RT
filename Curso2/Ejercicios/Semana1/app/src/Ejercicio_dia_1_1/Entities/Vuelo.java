package Ejercicio_dia_1_1.Entities;
import java.time.LocalDate;

public class Vuelo {
    private String destino;
    private LocalDate fecha;
    private int asientosDisponibles;

    public Vuelo() {
    }

    public Vuelo(String destino, LocalDate fecha, int asientosDisponibles) {
        this.destino = destino;
        this.fecha = fecha;
        this.asientosDisponibles = asientosDisponibles;
    }

    public String getDestino() {
        return destino;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public int getAsientosDisponibles() {
        return asientosDisponibles;
    }

    public boolean reservaAsientos(int cantidad){
        if (cantidad <= asientosDisponibles){
            asientosDisponibles -= cantidad;
            return true;
        }
        return false;
    }
    @Override
    public String toString() {
        return "Vuelo a " + destino + " el " + fecha + "(asientosDisponibles = " + asientosDisponibles + ")";
    }
}
