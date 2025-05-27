package Ejercicio_dia_1_1.SistemaDeReservas;
import Ejercicio_dia_1_1.Entities.Vuelo;
import Ejercicio_dia_1_1.Exceptions.ReservaInvalida;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SistemaReservas {
    private List<Vuelo> vuelosDisponibles;

    public SistemaReservas(){
        vuelosDisponibles = new ArrayList<>();

        vuelosDisponibles.add(new Vuelo("Madrid", LocalDate.of(2025, 7, 15), 100));
        vuelosDisponibles.add(new Vuelo("Barcelona", LocalDate.of(2025, 8, 1), 50));
        vuelosDisponibles.add(new Vuelo("Sevilla", LocalDate.of(2025, 7, 20), 20));
        vuelosDisponibles.add(new Vuelo("Gran Canaria", LocalDate.of(2025, 9, 10), 10));
    }

    public void mostrarVuelosDisponibles(){
        System.out.println("----- Vuelos disponibles -----");
        if (vuelosDisponibles.isEmpty()){
            System.out.println("No hay vuelos disponibles en este momento.");
            return;
        }
        for (Vuelo vuelo : vuelosDisponibles){
            System.out.println(vuelo);
        }
        System.out.println("--------------------------------");
    }
    public void realizarReserva(String nombreUsuario, String destino, LocalDate fechaViaje, int numAsientos)
        throws ReservaInvalida {

        if (nombreUsuario == null || nombreUsuario.trim().isEmpty()){
            throw new ReservaInvalida("El nombre de usuario no puede estar vacío.");
        }
        if (destino == null || destino.trim().isEmpty()){
            throw new ReservaInvalida("El destino no puede estar vacío.");
        }
        if (numAsientos <= 0){
            throw new ReservaInvalida("El número de asiento tiene que ser un número mayor de 0.");
        }

        Vuelo vueloEncontrado = null;
        for (Vuelo v : vuelosDisponibles){
            if (v.getDestino().equalsIgnoreCase(destino) && v.getFecha().equals(fechaViaje)){
                vueloEncontrado = v;
                break;
            }
        }
        if (vueloEncontrado == null){
            throw new ReservaInvalida("No se encontró ningún vuelo para el destino '" + destino + "' en la fecha " + fechaViaje + ".");
        }
        if (vueloEncontrado.reservaAsientos(numAsientos)){
            System.out.println(nombreUsuario + " su reserva ha sido realziada.");
            System.out.println("Vuelo " + vueloEncontrado.getDestino() + " el " + vueloEncontrado.getFecha());
            System.out.println("Asientos reservados: " + numAsientos);
            System.out.println("Asientos restante en el vuelo: " + vueloEncontrado.getAsientosDisponibles());
        }else {
            throw new ReservaInvalida("Erros inesperado al intentar reservar sus asientos.");
        }
    }
}
