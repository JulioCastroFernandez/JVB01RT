package Ejercicio_dia_1_2.GestionInventario;

import Ejercicio_dia_1_2.Entities.Producto;

import java.util.ArrayList;
import java.util.List;

public class InventarioManager {
    private List<Producto> inventario;

    public InventarioManager(){
        this.inventario = new ArrayList<>();
        inventario.add(new Producto("Teclado Gaming", 75.50, 10));
        inventario.add(new Producto("Ratón Inalámbrico", 25.00, 25));
    }

    public void agregarProducto(String nombre, double precio, int cantidad){
        if (nombre == null || nombre.trim().isEmpty()){
            throw new IllegalArgumentException("El nombre del producto no puede ser nulo.");
        }
        if (precio <=0){
            throw new IllegalArgumentException("El precio del producto debe ser mayor que 0.");
        }
        if (cantidad < 0){
            throw new IllegalArgumentException("La cantidad del producto no puede ser negativa.");
        }
        String nombreNormalizado = nombre.trim().toLowerCase();

        Producto productoExistente = null;
        for (Producto p : inventario){
            if (p.getNombre().toLowerCase().equals(nombreNormalizado)){
                productoExistente = p;
                break;
            }
        }
        if (productoExistente != null){
            productoExistente.setCantidad(productoExistente.getCantidad() + cantidad);
            System.out.println("El stock de `" + nombre + "´ ha sido actualizado. La cantidad actual es: " + productoExistente.getCantidad());
        }else {
            Producto nuevoProducto = new Producto(nombre.trim(), precio, cantidad);
            inventario.add(nuevoProducto);
            System.out.println("El producto `" + nombre + "´ ha sido agregado al inventario.");
        }
    }
    public void mostrarInventario(){
        System.out.println(" ---- Inventario actual ----");
        if (inventario.isEmpty()){
            System.out.println("El inventario está vacio.");
            return;
        }
        for (int i = 0; i < inventario.size(); i++) {
            System.out.println((i + 1) + ". " + inventario.get(i));
        }
        System.out.println("---------------------------------------------------");
    }
}
