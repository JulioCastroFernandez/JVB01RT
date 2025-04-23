package Ejercicios_dia4;

public class Ejercicio3_ArreglosVectores {

    public static void main(String[] args) {

        int[] temperaturas = new int[7];

        temperaturas[0] = 20;
        temperaturas[1] = 23;
        temperaturas[2] = 19;
        temperaturas[3] = 26;
        temperaturas[4] = 26;
        temperaturas[5] = 21;
        temperaturas[6] = 22;

        System.out.println("Temperaturas:");

        int suma = 0;

        for (int i = 0; i < 7; i++) {
            suma += temperaturas[i];
        }

        int temperaturaMaxima = (int) suma / temperaturas.length;

        System.out.println("La temperatura máxima es: " + temperaturaMaxima);
    }
}

