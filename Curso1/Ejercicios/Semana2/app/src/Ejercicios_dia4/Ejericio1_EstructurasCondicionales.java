package Ejercicios_dia4;

import java.util.Scanner;

public class Ejericio1_EstructurasCondicionales {

    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in); // ← Aquí está la corrección

                System.out.println("Ingrese su edad: ");
                int edad = scanner.nextInt();

                if (edad >= 18) {
                    System.out.println("Puede acceder al recital.");
                } else {
                    System.out.println("No puede acceder al recital.");
                }

                scanner.close(); // ← Es buena práctica cerrar el Scanner
            }
        }


