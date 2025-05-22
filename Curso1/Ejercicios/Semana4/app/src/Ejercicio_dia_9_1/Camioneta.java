package Ejercicio_dia_9_1;
import java.time.Year;
public class Camioneta extends Vehiculo implements Combustion{
    private double capacidadTanque;
    private double consumoCombustible;

    public Camioneta(int id, String placa, String marca, String modelo, int anio, double costo, int capacidadTanque, double consumoCombustible) {
        super(id, placa, marca, modelo, anio, costo);
        this.capacidadTanque = capacidadTanque;
        this.consumoCombustible = consumoCombustible;
    }

    @Override
    public int calcularAntiguedad(){
        int anioActual = Year.now().getValue();
        return anioActual - this.getAnio();
    }

    @Override
    public void recargarCombustible(){
        System.out.println("La camioneta está repostando...");
    }

    public double getCapacidadTanque() {
        return capacidadTanque;
    }

    public double getConsumoCombustible() {
        return consumoCombustible;
    }


}
