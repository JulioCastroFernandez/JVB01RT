package Ejercicios_dia7;

public class Ave extends Animal{
    private double envergaduraDeAlas;
    private String tipoDeVuelo;
    private String colorDePlumaje;
    private String tipoDePico;

    public Ave(int id, String nombre, int edad, String tipoDePiel, String tipoDeAlimentacion, double envergaduraDeAlas, String tipoDeVuelo, String colorDePlumaje, String tipoDePico) {
        super(id, nombre, edad, tipoDePiel, tipoDeAlimentacion);
        this.envergaduraDeAlas = envergaduraDeAlas;
        this.tipoDeVuelo = tipoDeVuelo;
        this.colorDePlumaje = colorDePlumaje;
        this.tipoDePico = tipoDePico;
    }

    @Override
    public void saludar() {
        System.out.println("Hola, soy un ave.");;
    }
}

