package Ejercicio_dia_9;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Auto auto1 = new Auto(1, "3456HGT", "Peugeot", "507", 2020, 12.000, 30.000, 5.000);
        Camioneta camioneta1 = new Camioneta(2, "4567JUY", "Volvo", "Camioner", 1995, 15.000, 70, 50);
        Moto moto1 = new Moto(3, "8923QWE", "Yamaha", "Venom", 2007, 60.000, 220, "V15");

        ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();
        listaVehiculos.add(auto1);
        listaVehiculos.add(camioneta1);
        listaVehiculos.add(moto1);

        System.out.println("--- Información de los vehiculos ---");

        for (Vehiculo vehiculo : listaVehiculos){
            System.out.println("ID: " + vehiculo.getId());
            System.out.println("Marca: " + vehiculo.getMarca());
            System.out.println("Modelo: " + vehiculo.getModelo());
            System.out.println("Año: " + vehiculo.getAnio());
            System.out.println("Antigüedad: " + vehiculo.calcularAntiguedad() + " años.");

            if (vehiculo instanceof Electrico){
                Electrico electrico = (Electrico) vehiculo;
                electrico.cargarEnergia();
            } else if (vehiculo instanceof Combustion) {
                Combustion combustion = (Combustion) vehiculo;
                combustion.recargarCombustible();

            }
        }
        System.out.println("--- Fin del listado ---");
    }
}
