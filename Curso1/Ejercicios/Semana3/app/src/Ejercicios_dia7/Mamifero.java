package Ejercicios_dia7;

public class Mamifero extends Animal {
        private int numeroDePatas;
        private String tipoDeReproduccion;
        private String colorDePelaje;
        private String habitat;

    public Mamifero(int id, String nombre, int edad, String tipoDePiel, String tipoDeAlimentacion, int numeroDePatas, String tipoDeReproduccion, String colorDePelaje, String habitat) {
        super(id, nombre, edad, tipoDePiel, tipoDeAlimentacion);
        this.numeroDePatas = numeroDePatas;
        this.tipoDeReproduccion = tipoDeReproduccion;
        this.colorDePelaje = colorDePelaje;
        this.habitat = habitat;
    }

    @Override
    public void saludar() {
        System.out.println("Hola, soy un mamífero.");

    }
}

