package Ejercicios_dia5;

public class Ejercicio1_UsoDeIfElseSinLlaves {

    public static void main(String[] args) {

        verificarNumero(5);
        verificarNumero(-5);
        verificarNumero(0);

    }

    public static void verificarNumero(int num){

        if (num > 0)
            System.out.println("El numero es positivo");
        else if (num < 0)
            System.out.println("El numero es negativo");
        else
            System.out.println("El numero es 0");
        {

        }
    }



}
