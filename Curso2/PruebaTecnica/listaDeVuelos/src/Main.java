import Entities.Vuelo;
import Utils.Filtros;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // --- Constantes de fecha de filtro ---
        LocalDate fechaDesde = null;
        LocalDate fechaHasta = null;

        // --- Lista de 10 vuelos de prueba  ---
        List<Vuelo> vuelos = new ArrayList<>();
        vuelos.add(new Vuelo(1, "IB2800", "Iberia", "Madrid", "Buenos Aires", LocalDate.of(2025, 5, 15), LocalDate.of(2025, 5, 16)));
        vuelos.add(new Vuelo(2, "BA0378", "British Airways", "Londres", "New York", LocalDate.of(2025, 6, 1), LocalDate.of(2025, 6, 1)));
        vuelos.add(new Vuelo(3, "AF1200", "Air France", "París", "Tokio", LocalDate.of(2025, 4, 25), LocalDate.of(2025, 4, 26)));
        vuelos.add(new Vuelo(4, "LH0450", "Lufthansa", "Frankfurt", "Madrid", LocalDate.of(2025, 5, 5), LocalDate.of(2025, 5, 5)));
        vuelos.add(new Vuelo(5, "TK1001", "Turkish Airlines", "Estambul", "Roma", LocalDate.of(2025, 7, 10), LocalDate.of(2025, 7, 10)));
        vuelos.add(new Vuelo(6, "AA0050", "American Airlines", "New York", "Los Angeles", LocalDate.of(2025, 5, 20), LocalDate.of(2025, 5, 20)));
        vuelos.add(new Vuelo(7, "UA0870", "United Airlines", "Chicago", "Miami", LocalDate.of(2025, 6, 15), LocalDate.of(2025, 6, 15)));
        vuelos.add(new Vuelo(8, "DL0200", "Delta Airlines", "Atlanta", "Seattle", LocalDate.of(2025, 4, 10), LocalDate.of(2025, 4, 10)));
        vuelos.add(new Vuelo(9, "QF0001", "Qantas", "Sídney", "Dubái", LocalDate.of(2025, 8, 1), LocalDate.of(2025, 8, 2)));
        vuelos.add(new Vuelo(10, "VS0120", "Virgin Atlantic", "Manchester", "Orlando", LocalDate.of(2025, 5, 25), LocalDate.of(2025, 5, 25)));

        // --- Llamar a la función de filtro ---
        List<Vuelo> vuelosFiltradosYOrdenados = Filtros.filtrarVuelos(vuelos, fechaDesde, fechaHasta);

        // --- Imprimir los vuelos filtrados y ordenados ---
        System.out.println("--- VUELOS FILTRADOS: Ordenados por fecha de inicio ---");
        if (vuelosFiltradosYOrdenados.isEmpty()){
            System.out.println("No se encontraron vuelos con los criterios de búsqueda.");
        }else{
            for (Vuelo vuelo : vuelosFiltradosYOrdenados){
                System.out.println(vuelo);
            }
        }
    }
}