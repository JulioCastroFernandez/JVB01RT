package Ejercicios_dia5;

public class Ejercicio3_UsoDeForEach {

    public static void mostrarNombres (String[] nombres) {
        for (String nombre : nombres){
            System.out.println(nombre);
        }

    }

    public static void main(String[] args) {
        String[] nombres = {"Julio", "Marta", "Elena"};
        mostrarNombres(nombres);
    }
}