package Ejercicio_dia_1_2;

import Ejercicio_dia_1_2.GestionInventario.InventarioManager;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main_inventario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InventarioManager inventarioManager = new InventarioManager();

        int opcion = -1;

        do {
            System.out.println("\n--- Menú de Gestión de Inventario ---");
            System.out.println("1. Mostrar Inventario");
            System.out.println("2. Agregar Producto");
            System.out.println("0. Salir");
            System.out.print("Ingrese su opción: ");

            try {
                opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion){
                    case 1:
                        inventarioManager.mostrarInventario();
                        break;
                    case 2:
                        System.out.println("\n--- Agregar Nuevo Producto ---");
                        System.out.print("Ingrese el nombre del producto: ");
                        String nombre = scanner.nextLine();

                        double precio = 0.0;
                        boolean precioValido = false;
                        while (!precioValido){
                            System.out.println("Ingrese el precio del producto: ");
                            try {
                                precio = scanner.nextDouble();
                                scanner.nextLine();
                                precioValido = true;
                            }catch (InputMismatchException e){
                                System.err.println("¡Entrada invalida! Por favor, ingrese un número para el precio.");
                                scanner.nextLine();
                            }
                        }

                        int cantidad = 0;
                        boolean cantidadValida = false;
                        while (!cantidadValida){
                            System.out.println("Ingrese la cantidad del producto: ");
                            try {
                                cantidad = scanner.nextInt();
                                scanner.nextLine();
                                cantidadValida = true;
                            }catch (InputMismatchException e){
                                System.err.println("¡Entrada invlaida! Por favor, ingrese un número entero para la cantidad. ");
                                scanner.nextLine();
                            }
                        }
                        try {
                            inventarioManager.agregarProducto(nombre, precio, cantidad);
                            System.out.println("Operación de agregar/actualizar producto completada.");
                        }catch (IllegalArgumentException e){
                            System.err.printf("¡Error al agregar producto! " + e.getMessage());
                        }
                        break;
                    case 0:
                        System.out.println("Saliendo del sistema de inventario...");
                        break;
                    default:
                        System.out.println("Opciçon no valida. Por favor, ingrese 1, 2 o 0.");
                        break;
                }
            }catch (InputMismatchException e){
                System.out.println("¡Entrada inválida para la opción del menú! Por favor, ingrese un número.");
                scanner.nextLine();
                opcion = -1;
            }catch (Exception e){
                System.out.println("Ha ocurrido un error inesperado en el sistema: " + e.getMessage());
                e.printStackTrace();
            }
            try {
                Thread.sleep(800); // Pausa de 0.8 segundos
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt(); // Restablece el estado de interrupción
            }

        } while (opcion != 0);

        scanner.close();
        }
    }
