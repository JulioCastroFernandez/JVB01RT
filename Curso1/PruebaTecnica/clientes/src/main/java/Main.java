import org.example.controllers.ClientController;
import org.example.entities.Client;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ClientController clientController = new ClientController();  // Instancia del controlador
        Scanner scanner = new Scanner(System.in);
        int opcion = -1;

        System.out.println("--- GESTION DE CLIENTES ---");

        while (opcion != 0) {
            while (opcion != 0)
            mostrarMenu();

            try {
                System.out.println("Introduce tu opción: ");
                String inputOpcion = scanner.nextLine();
                opcion = Integer.parseInt(inputOpcion);


                switch (opcion) {
                    case 1: //Opcion 1: agregar
                        nuevoCliente(scanner, clientController);
                        break;
                    case 2: //Opcion 2: Listar
                        todoLosClientes(clientController);
                        break;
                    case 3: //Opcion 3: Actualizar
                        actualizarDatos(scanner, clientController);
                        break;
                    case 4: //Opcion 4: Eliminar
                        idEliminar(scanner, clientController);
                        break;
                    case 5: //Opcion 5: Buscar por ciudad
                        clienteCiudad(scanner, clientController);
                        break;
                    case 0: //Opcion 0: Salir
                        System.out.println("Saliendo de la aplicacion...");
                        break;
                    default:
                        System.out.println("Opción no valida. Introduce un numero entre 0 y 5");
                }

            } catch (NumberFormatException e) {
                System.err.println("Entrada invalida. Por favor, introduzca un numero entre 0 y 5.");
            } catch (Exception e) {
                System.out.println("Ocurrió un error inesperdado: " + e.getMessage());
            }

            if (opcion != 0) {
                System.out.println("Presiona Enter para continuar...");
                scanner.nextLine(); // Espera a que el usuario presione Enter
            }
        }
    }


    private static void mostrarMenu() {
        System.out.println("1. Agregar nuevo cliente");
        System.out.println("2. Listar todos los clientes");
        System.out.println("3. Actualizar información de un cliente");
        System.out.println("4. Eliminar un cliente");
        System.out.println("5. Buscar cliente por ciudad");
        System.out.println("0. Salir");
    }

    private static void nuevoCliente(Scanner scanner, ClientController clientController) {
        System.out.println("-- AGREGAR NUEVO CLIENTE --");

        String nombre = "";
        while (nombre.trim().isEmpty()) {
            System.out.println("Nombre: ");
            nombre = scanner.nextLine();
            if (nombre.trim().isEmpty()) {
                System.out.println("ERROR: El campo nombre no puede estar vacio");
            }
        }

        String apellidos = "";
        while (apellidos.trim().isEmpty()) {
            System.out.println("Apellidos: ");
            apellidos = scanner.nextLine();
            if (apellidos.trim().isEmpty()) {
                System.out.println("ERROR: El campo apellidos no puede estar vacio");
            }
        }

        String sexo = "";
        while (sexo.trim().isEmpty()) {
            System.out.println("Sexo: ");
            sexo = scanner.nextLine();
            if (sexo.trim().isEmpty()) {
                System.out.println("ERROR: El campo sexo no puede estar vacio");
            }
        }

        String ciudad = "";
        while (ciudad.trim().isEmpty()) {
            System.out.println("Ciudad: ");
            ciudad = scanner.nextLine();
            if (ciudad.trim().isEmpty()) {
                System.out.println("ERROR: El campo ciudad no puede estar vacio");
            }
        }

        LocalDate fechaDeNacimiento = null;
        while (fechaDeNacimiento == null) {
            System.out.println("Fecha de nacimiento (YYYY-MM-DD)");
            String fecha = scanner.nextLine();
            if (fecha.trim().isEmpty()) {
                System.out.println("ERROR: La fecha de nacimiento no puede estar vacía.");
            } else {
                try {
                    fechaDeNacimiento = LocalDate.parse(fecha);
                } catch (DateTimeParseException e) {
                    System.out.println("ERROR: Formato de fecha incorrecto. Usa YYYY-MM-DD");
                }
            }

            int numeroDeTelefono = 0;
            while (numeroDeTelefono == 0) {
                System.out.println("Número de telefono: ");
                String telefonoTxt = scanner.nextLine();
                try {
                    numeroDeTelefono = Integer.parseInt(telefonoTxt);
                } catch (NumberFormatException e) {
                    System.out.println("ERROR: Introduce un número de teléfono valido");
                    numeroDeTelefono = 0;
                }

            }

            String mail = "";
            while (mail.trim().isEmpty()) {
                System.out.println("Correo electónico: ");
                mail = scanner.nextLine();
                if (mail.trim().isEmpty()) {
                    System.out.println("ERROR: El campo correo electrónico no puede estar vacio");
                }
            }

            Client nuevoCliente = new Client(null, nombre, apellidos, sexo, ciudad, fechaDeNacimiento, numeroDeTelefono, mail);

            try {
                clientController.create(nuevoCliente);
                System.out.println("¡Nuevo cliente agregado con éxito!");
            } catch (Exception e) {
                System.out.println("ERROR: No se pudo agregar al cliente: " + e.getMessage());
            }
        }
    }

        private static void todoLosClientes (ClientController clientController){
            System.out.println("-- LISTA COMPLETA DE CLIENTES --");

            List<Client> clientes = clientController.findAll();

            if (clientes.isEmpty()) {
                System.out.println("No hay clientes registrados en la base de datos.");
            } else {
                System.out.println("-- CLIENTES ENCONTRADOS -- ");
                for (Client client : clientes) {
                    System.out.println(client);
                }
            }
        }

        private static void actualizarDatos (Scanner scanner, ClientController clientController){
            System.out.println("-- ACTUALIZAR DATOS DE UN CLIENTE --");

            Integer idActualizar = null;
            while (idActualizar == null) {
                System.out.println("Introduzca el ID del cliente que desea actualizar: ");
                String idTxt = scanner.nextLine();
                try {
                    idActualizar = Integer.parseInt(idTxt);
                    if (idActualizar <= 0) {
                        System.out.println("ERROR: El ID debe ser un numero positivo.");
                        idActualizar = null;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("ERROR: ID invalido. Por favor, introduzca un numero.");
                }
            }
            Client clienteExistente = clientController.findOne(idActualizar);

            if (clienteExistente == null) {
                System.out.println("No se encontro ningún cliente con ID: " + idActualizar);
                return;
            }
            System.out.println("Cliente encontrado: ");
            System.out.println(clienteExistente);

            System.out.println("Introduce los nuevos datos (deja en blanco los valores que quieras mantener): ");

            System.out.print("Nuevo Nombre (" + clienteExistente.getNombre() + "): ");
            String nuevoNombre = scanner.nextLine();
            if (!nuevoNombre.trim().isEmpty()) {
                clienteExistente.setNombre(nuevoNombre);
            }

            System.out.print("Nuevos Apellidos (" + clienteExistente.getApellidos() + "): ");
            String nuevosApellidos = scanner.nextLine();
            if (!nuevosApellidos.trim().isEmpty()) {
                clienteExistente.setApellidos(nuevosApellidos);
            }

            System.out.print("Nuevo Sexo (" + clienteExistente.getSexo() + "): ");
            String nuevoSexo = scanner.nextLine();
            if (!nuevoSexo.trim().isEmpty()) {
                clienteExistente.setSexo(nuevoSexo);
            }

            // Pedir Ciudad
            System.out.print("Nueva Ciudad (" + clienteExistente.getCiudad() + "): ");
            String nuevaCiudad = scanner.nextLine();
            if (!nuevaCiudad.trim().isEmpty()) {
                clienteExistente.setCiudad(nuevaCiudad);
            }


            LocalDate nuevaFechaNacimiento = clienteExistente.getFechaNacimiento();
            System.out.print("Nueva Fecha Nacimiento (YYYY-MM-DD) (" + clienteExistente.getFechaNacimiento() + "): ");
            String nuevaFechaStr = scanner.nextLine();
            if (!nuevaFechaStr.trim().isEmpty()) {
                try {
                    nuevaFechaNacimiento = LocalDate.parse(nuevaFechaStr);
                    clienteExistente.setFechaNacimiento(nuevaFechaNacimiento);
                } catch (DateTimeParseException e) {
                    System.err.println("ERROR: Formato de fecha incorrecto. Se mantiene la fecha actual.");

                }
            }

            int nuevoNumeroTelefono = clienteExistente.getNumeroTelefono();
            System.out.print("Nuevo Número de Teléfono (" + clienteExistente.getNumeroTelefono() + "): ");
            String nuevoTelefonoStr = scanner.nextLine();
            if (!nuevoTelefonoStr.trim().isEmpty()) {
                try {
                    int tempNumero = Integer.parseInt(nuevoTelefonoStr);
                    if (tempNumero > 0) {
                        nuevoNumeroTelefono = tempNumero;
                        clienteExistente.setNumeroTelefono(nuevoNumeroTelefono);
                    } else {
                        System.err.println("ERROR: El número de teléfono debe ser positivo. Se mantiene el número actual.");
                    }
                } catch (NumberFormatException e) {
                    System.err.println("ERROR: Entrada inválida para teléfono. Se mantiene el número actual.");

                }
            }

            System.out.print("Nuevo Correo Electrónico (" + clienteExistente.getMail() + "): ");
            String nuevoMail = scanner.nextLine();
            if (!nuevoMail.trim().isEmpty()) {
                clienteExistente.setMail(nuevoMail);
            }

            try {
                clientController.update(clienteExistente);
                System.out.println("Cliente con ID " + clienteExistente.getId() + " actualizado con éxito.");
            } catch (Exception e) {
                System.err.println("ERROR: al actualizar el cliente: " + e.getMessage());
            }
        }

        private static void idEliminar (Scanner scanner, ClientController clientController){
            System.out.println("-- ELIMINAR CLIENTE --");
            Integer idEliminar = null;
            while (idEliminar == null) {
                System.out.println("Introduce el ID del cliente que desea eliminar: ");
                String idTxt = scanner.nextLine();
                try {
                    idEliminar = Integer.parseInt(idTxt);
                    if (idEliminar <= 0) {
                        System.out.println("ERROR: El ID debe ser un número positivo.");
                        idEliminar = null;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("ERROR: ID inválido. Por favor, introduzca un número: ");
                }
            }
            try {
                clientController.delete(idEliminar);
                System.out.println("El cliente con ID " + idEliminar + " ha sido eliminado.");
            } catch (jakarta.persistence.EntityNotFoundException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Error inesperado al intentar eliminar el cliente con ID: " + idEliminar + ": " + e.getMessage());
            }
        }

        private static void clienteCiudad (Scanner scanner, ClientController clientController){
            System.out.println("-- BUSCAR CLIENTE POR CIUDAD --");
            System.out.println("Introduzca el nombre de la ciudad a buscar: ");
            String ciudadBuscar = scanner.nextLine();

            if (ciudadBuscar == null || ciudadBuscar.trim().isEmpty()) {
                System.out.println("El campo ciudad no puede estar vacío.");
                return;
            }
            List<Client> clientesEncontrados = null;
            try {
                clientesEncontrados = clientController.findCity(ciudadBuscar);
            } catch (Exception e) {
                System.out.println("ERROR al buscar clientes por ciudad: " + e.getMessage());
                return;
            }
            if (clientesEncontrados == null || clientesEncontrados.isEmpty()) {
                System.out.println("No se encontró ningún cliente de la ciudad " + ciudadBuscar + ".");
            } else {
                System.out.println("Clientes de " + ciudadBuscar + " encontrados: ");
                for (Client client : clientesEncontrados) {
                    System.out.println(client);
                }
            }
        }
    }













