package ejercicios_dia3;

public class Ejercicio2_MostrarUnMensajePersonalizado {

    public static void mostrarNombre(String nombre) {
        System.out.println("Hola " + nombre + ", bienvenido a Java!");
    }

    public static void main(String[] args) {

        mostrarNombre("Julio");
        mostrarNombre("Marta");
        mostrarNombre("Sara");

    }
}
