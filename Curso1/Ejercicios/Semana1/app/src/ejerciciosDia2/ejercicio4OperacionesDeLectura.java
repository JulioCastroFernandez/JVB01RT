package ejerciciosDia2;

import java.util.Scanner;

public class ejercicio4OperacionesDeLectura {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca el primer número entero: ");

        int a = scanner.nextInt();


        System.out.println("Introduzca el segundo número entero: ");

        int b = scanner.nextInt();

        scanner.nextLine();

        System.out.println("¿Qué operación desea realizar? (+, -, *, /): ");


        String operacion = scanner.nextLine();

        int resultado = 0;
        boolean operacionValida = true;

        switch (operacion) {
            case "+":
                resultado = a + b;
                break;
            case "-":
                resultado = a - b;
                break;
            case "*":
                resultado = a * b;
                break;
            case "/":
                if (b != 0) {
                    resultado = a / b;
                } else {
                    System.out.println("Error: División por cero.");
                    operacionValida = false;
                }
                break;
            default:
                System.out.println("Operación no válida.");
                operacionValida = false;
        }

        if (operacionValida) {
            System.out.println("El resultado es: " + resultado);
        }

    }
}
