package Ejercicios_dia5;

public class Ejercicio2_UsoDeOperadorTernario {

    public static String esPar(int num) {
        return (num % 2 == 0) ? "El número es par" : "El numero es impar";
    }

    public static void main(String[] args) {
        String resultado = esPar(8);
        String resultado2 = esPar(7);

        System.out.println(resultado);
        System.out.println(resultado2);
    }

}