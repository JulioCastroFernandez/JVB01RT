package Utils;
import Entities.Vuelo;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Filtros {

    public static List<Vuelo> filtrarVuelos (List<Vuelo> listaOriginal, LocalDate fechaDesde, LocalDate fechaHasta){
        List<Vuelo> vuelosFiltrados = new ArrayList<>(); //nueva lista donde guardamos los vuelos filtrados.

        for (Vuelo vuelo: listaOriginal){    // Recorremos cada vuelo de la lista original.
            boolean cumpleFechaDesde = true; // Asumimos que cumple la fecha de inicio.
            boolean cumpleFechaHasta = true; // Asumimos que cumple la fecha de fin.

            if (fechaDesde != null) {        // Si fechaDesde NO es nula, verificamos que el vuelo empieza DESPUÉS o EN la fechaDesde.
                if (vuelo.getFechaInicio().isBefore(fechaDesde)){
                    cumpleFechaDesde = false;
                }
            }
            if (fechaHasta != null){         // Si fechaHasta NO es nula, verificamos que el vuelo termina ANTES o EN la fechaHasta.
                if (vuelo.getFechaFin().isAfter(fechaHasta)){
                    cumpleFechaHasta = false;
                }
            }
            if (cumpleFechaDesde && cumpleFechaHasta){  // Si el vuelo cumple AMBAS condiciones (fechaDesde y fechaHasta), lo añadimos a la lista filtrada.
                vuelosFiltrados.add(vuelo);
            }
        }
        Collections.sort(vuelosFiltrados, Comparator.comparing(Vuelo::getFechaInicio)); //Ordenar los vuelos filtrados por fecha de inicio.
        return vuelosFiltrados;  // Devuelve la lista de vuelos que cumplen los criterios y están ordenados.
    }
}
