package ejerciciosDia4;

import java.util.Scanner;

public class ejercicio2EstructurasRepetitivas {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalCompra = 0.0;
        String continuar;

        do {
            System.out.println("Ingrese el precio del producto: ");
            double precio = scanner.nextDouble();
            totalCompra += precio;

            System.out.println("¿Desea ingresar otro producto? (si/no): ");
            continuar = scanner.next();
        } while (continuar.equalsIgnoreCase("si"));

        System.out.println("El total de la compra es: " + totalCompra);


    }
}
