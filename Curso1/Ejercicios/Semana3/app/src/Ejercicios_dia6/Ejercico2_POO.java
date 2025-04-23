package Ejercicios_dia6;

import java.util.Arrays;

public class Ejercico2_POO {

    public static class Persona{
        int id;
        String nombre;
        int edad;
        String direccion;
        int numerDeTelefono;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public String getDireccion() {
            return direccion;
        }

        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }

        public int getNumerDeTelefono() {
            return numerDeTelefono;
        }

        public void setNumerDeTelefono(int numerDeTelefono) {
            this.numerDeTelefono = numerDeTelefono;
        }

        public Persona(int id, String nombre, int edad, String direccion, int numerDeTelefono) {
            this.id = id;
            this.nombre = nombre;
            this.edad = edad;
            this.direccion = direccion;
            this.numerDeTelefono = numerDeTelefono;


        }
    }

    public static void main(String[] args) {

        Persona[] Personas = new Persona[5];


        Personas[0] = new Persona(1, "Julio", 29, "Ferrol", 654783212);
        Personas[1] = new Persona(2, "Marta", 26, "Coruña", 634080134);
        Personas[2] = new Persona(3, "Elena", 27, "Tui", 612350987);
        Personas[3] = new Persona(4, "Daniel", 32, "Ponferrada", 567128907);
        Personas[4] = new Persona(5, "Javier", 19, "Vigo", 987345612);


        for (Persona persona : Personas){
            System.out.println("Nombre: " + persona.getNombre() + ", Edad: " + persona.getEdad());
        }

        System.out.println("Antes del cambio: ");
        System.out.println("Persona 1: " + Personas[0].getNombre());
        System.out.println("Persona 2: " + Personas[2].getNombre());

        Personas[0].setNombre("Pedro");
        Personas[2].setNombre("Sara");

        System.out.println("Despues del cambio: ");
        System.out.println("Persona 1: " + Personas[0].getNombre());
        System.out.println("Persona 2: " + Personas[2].getNombre());
    }
}
