package Ejercicio_dia_10_2;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class Main_Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n------------------------------------");
            System.out.println("Ingrese una opción:");
            System.out.println("1 - Bienvenida");
            System.out.println("2 - Fecha actual");
            System.out.println("3 - Número aleatorio (1-100)");
            System.out.println("4 - Tabla de multiplicar del 5");
            System.out.println("0 - Salir");
            System.out.println("------------------------------------");
            System.out.print("Su elección: ");

            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
            } else {
                System.out.println("¡Entrada no válida! Por favor, ingrese un número.");
                scanner.next();
                opcion = -1;
            }
            switch (opcion) {
                case 1:
                    System.out.println("\n****************************************");
                    System.out.println("¡Bienvenido al sistema!");
                    System.out.println("******************************************");
                    break;
                case 2:
                    System.out.println("\n****************************************");
                    LocalDate fechaActual = LocalDate.now();
                    System.out.println("Fecha actual: " + fechaActual);
                    System.out.println("******************************************");
                    break;
                case 3:
                    System.out.println("\n****************************************");
                    Random random = new Random();
                    int numeroAleatorio = random.nextInt(100) + 1;
                    System.out.println("Número aleatorio: " + numeroAleatorio);
                    System.out.println("******************************************");
                    break;
                case 4:
                    System.out.println("\n****************************************");
                    System.out.println("Tabla de multiplicar del 5:");
                    for (int i = 1; i <= 10; i++) {
                        System.out.println("5 x " + i + " = " + (5 * i));
                    }
                    System.out.println("******************************************");
                    break;
                case 0:
                    System.out.println("\nSaliendo del programa... ¡Adiós!");
                    break;
                default:
                    if (opcion != -1) {
                        System.out.println("\n¡Opción no válida! Por favor, ingrese un número entre 0 y 4.");
                    }
                    break;
            }
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }while (opcion != 0);
        scanner.close();
    }
}
