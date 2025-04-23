package ejercicios_dia3;

public class Ejercicio1_SumaDeNumeros {

    public static int sumaDeNumeros (int a, int b){
        return a + b;
    }

    public static void main(String[] args) {

        int resultado1 = sumaDeNumeros(5,5);
        int resultado2 = sumaDeNumeros(3,19);
        int resultado3 = sumaDeNumeros(14, 35);

        System.out.println("El primer resultado es: " + resultado1);
        System.out.println("El segundo resultado es: " + resultado2);
        System.out.println("El tercer resultado es: " + resultado3);
    }

}

