package Ejercicios_dia7_1;

public class Reptil extends Animal{
    private double longitud;
    private String tipoDeEscamas;
    private String tipoDeVeneno;

    public Reptil(int id, String nombre, int edad, String tipoDePiel, String tipoDeAlimentacion, double longitud, String tipoDeEscamas, String tipoDeVeneno) {
        super(id, nombre, edad, tipoDePiel, tipoDeAlimentacion);
        this.longitud = longitud;
        this.tipoDeEscamas = tipoDeEscamas;
        this.tipoDeVeneno = tipoDeVeneno;
    }

    @Override
    public void saludar() {
        System.out.println("Hola, soy un reptil.");
    }
}
