package Ejercicio_dia_9_1;

import java.time.Year;

public class Auto extends Vehiculo implements Electrico{
    private double capacidadBateria;
    private double autonomia;

    public Auto(int id, String placa, String marca, String modelo, int anio, double costo, double capacidadBateria, double autonomia) {
        super(id, placa, marca, modelo, anio, costo);
        this.capacidadBateria = capacidadBateria;
        this.autonomia = autonomia;
    }
    @Override
    public int calcularAntiguedad(){
        int anioActual = Year.now().getValue();
        return anioActual - this.getAnio();
    }

    @Override
    public void cargarEnergia(){
        System.out.println("El coche eléctrico está cargando...");
    }

    public double getCapacidadBateria() {
        return capacidadBateria;
    }

    public double getAutonomia() {
        return autonomia;
    }
}
