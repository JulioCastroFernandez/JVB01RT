package Ejercicios_dia4;

import java.util.Scanner;

public class Ejercicio4_Matrices {

    public static void main(String[] args) {

        char[][] asientos = new char[5][5];


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                asientos[i][j] = 'O';
            }
        }

        Scanner scanner = new Scanner(System.in);
        boolean seguir = true;


        while (seguir) {

            System.out.println("Mapa de asientos:");
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(asientos[i][j] + " ");
                }
                System.out.println();
            }


            System.out.print("Ingresa la fila (1-5): ");
            int fila = scanner.nextInt() - 1;
            System.out.print("Ingresa el asiento (1-5): ");
            int asiento = scanner.nextInt() - 1;


            if (asientos[fila][asiento] == 'O') {

                asientos[fila][asiento] = 'X';
                System.out.println("¡Reserva exitosa!");
            } else {
                System.out.println("Este asiento ya está ocupado, elige otro.");
            }


            System.out.print("¿Quieres hacer otra reserva? (S/N): ");
            char respuesta = scanner.next().charAt(0);
            if (respuesta == 'N' || respuesta == 'n') {
                seguir = false;
            }
        }


        System.out.println("Reserva finalizada.");
        System.out.println("Mapa de asientos final:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(asientos[i][j] + " ");
            }
            System.out.println();
        }

    }
}


