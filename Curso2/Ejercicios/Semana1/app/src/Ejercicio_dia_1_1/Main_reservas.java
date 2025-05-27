package Ejercicio_dia_1_1;

import Ejercicio_dia_1_1.Exceptions.ReservaInvalida;
import Ejercicio_dia_1_1.SistemaDeReservas.SistemaReservas;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main_reservas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemaReservas sistema = new SistemaReservas();

        int opcion = -1;

        do {
            System.out.println("\n--- Menú Principal de Reservas ---");
            System.out.println("1. Mostrar vuelos disponibles");
            System.out.println("2. Realizar una reserva");
            System.out.println("0. Salir");
            System.out.print("Ingrese su opción: ");

            try {
                opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion){
                    case 1:
                        sistema.mostrarVuelosDisponibles();
                        break;
                    case 2:
                        System.out.println("\n--- Realizar Nueva Reserva ---");
                        System.out.print("Ingrese su nombre: ");
                        String nombre = scanner.nextLine();

                        System.out.println("Ingrese el destino: ");
                        String destino = scanner.nextLine();

                        LocalDate fecha = null;
                        boolean fechaValida = false;
                        while (!fechaValida){
                            System.out.println("Ingrese la fecha de su viaje (YYYY-MM-DD): ");
                            String fechaStr = scanner.nextLine();
                            try {
                                fecha = LocalDate.parse(fechaStr);
                                fechaValida = true;
                            }catch (DateTimeParseException e){
                                System.out.println("Formato de fecha invalido. Ingrese la fecha con el formato YYYY-MM-DD. Ejemplo: 2025-05-27");
                            }
                        }
                        int numAsientos = 0;
                        boolean asientosValidos = false;
                        while (!asientosValidos){
                            System.out.println("Ingrese el número de asientos deseados: ");
                            try {
                                numAsientos = scanner.nextInt();
                                scanner.nextLine();
                                asientosValidos = true;
                            }catch (InputMismatchException e){
                                System.out.println("Número de asientos invalido. Por favor, ingrese un número entero.");
                                scanner.nextLine();
                            }
                        }
                        try {
                            sistema.realizarReserva(nombre, destino, fecha, numAsientos);
                        }catch (ReservaInvalida e){
                            System.out.println("¡Error al realizar la reserva! " + e.getMessage());
                        }
                        break;
                    case 0:
                        System.out.println("Gracias por usar nuestro sistema de reservas.");
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, elija 1, 2 o 0.");
                        break;
                }
            }catch (InputMismatchException e){
                System.out.println("Entrada inválida. Por favor, ingrese un número.");
                scanner.nextLine();
                opcion = -1;
            }catch (Exception e){
                System.out.println("Ha ocurrido un error inesperado: " + e.getMessage());
                e.printStackTrace();
            }
            try {
                Thread.sleep(1000);
            }catch (InterruptedException ex){
                Thread.currentThread().interrupt();
            }
        }while (opcion != 0);
        scanner.close();
    }
}
