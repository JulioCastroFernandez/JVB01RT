package Ejercicios_dia4;

import java.util.Scanner;

public class Ejercicio1_EstructurasCondicionales {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingrese su edad: ");
            int edad = scanner.nextInt();

            if (edad >= 18) {
                System.out.println("Puede acceder al recital.");
            }else{
                System.out.println("No puede acceder al recital.");
            }
        }
    }


