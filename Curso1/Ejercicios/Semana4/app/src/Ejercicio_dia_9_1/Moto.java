package Ejercicio_dia_9_1;

import java.time.Year;

public class Moto extends Vehiculo implements Combustion{
    private int cilindrada;
    private String tipoMotor;

    public Moto(int id, String placa, String marca, String modelo, int anio, double costo, int cilindrada, String tipoMotor) {
        super(id, placa, marca, modelo, anio, costo);
        this.cilindrada = cilindrada;
        this.tipoMotor = tipoMotor;
    }

    @Override
    public int calcularAntiguedad(){
        int anioActual = Year.now().getValue();
        return anioActual - this.getAnio();
    }

    @Override
    public void recargarCombustible(){
        System.out.println("La moto está repostando...");

    }

    public int getCilindrada() {
        return cilindrada;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }
}
