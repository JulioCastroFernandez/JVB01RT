package Reservas;

import java.time.LocalDate;

public class Vuelo {
    private String destino;
    private LocalDate fecha;
    private int asientosDisponible;

    public Vuelo() {
    }

    public Vuelo(String destino, LocalDate fecha, int asientosDisponible) {
        this.destino = destino;
        this.fecha = fecha;
        this.asientosDisponible = asientosDisponible;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getAsientosDisponible() {
        return asientosDisponible;
    }

    public void setAsientosDisponible(int asientosDisponible) {
        this.asientosDisponible = asientosDisponible;
    }

    public void cantidadAsientos(int numAsientos) {

        if (numAsientos > 0 && this.asientosDisponible >= numAsientos) {
            this.asientosDisponible -= numAsientos;
        }
    }

    @Override
    public String toString() {
        return "Vuelo a " + destino + " el " + "(Asientos disponibles: " + asientosDisponible + ")";
    }
}
