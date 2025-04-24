package Ejercicios_dia7;

public class Animal {
    private int id;
    private String nombre;
    private int edad;
    private String tipoDePiel;
    private String tipoDeAlimentacion;

    public Animal() {
    }

    public Animal(int id, String nombre, int edad, String tipoDePiel, String tipoDeAlimentacion) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.tipoDePiel = tipoDePiel;
        this.tipoDeAlimentacion = tipoDeAlimentacion;
    }

    public void saludar() {
        System.out.println("Hola, soy un animal.");
    }



}

