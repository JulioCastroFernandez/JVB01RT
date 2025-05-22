package Ejercicio_dia_9_2;

import java.util.ArrayList;
import java.util.List;

public class GestionProductos {

    public static void main(String[] args) {


        Producto producto1 = new Producto(1, "Portatil1", "Asus", "Portatil gaming", 500, 650, 200);
        Producto producto2 = new Producto(2, "Telefono1", "Iphone", "Smartphone", 1000, 1200, 500);
        Producto producto3 = new Producto(3, "Cascos1", "Sony", "Auriculares bluetooth", 300, 350, 350);
        Producto producto4 = new Producto(4, "Tablet1", "Xiaomi", "16 pulgadas", 200, 250, 100);
        Producto producto5 = new Producto(5, "Videoconsola1", "Xbox", "One", 450, 499, 500);
        Producto producto6 = new Producto(6, "Portatil2", "Dell", "Portatil basico", 190, 200, 130);
        Producto producto7 = new Producto(7, "Tablet2", "Samsung", "12 pulgadas", 150, 200, 400);
        Producto producto8 = new Producto(8, "Cascos2", "Bose", "Profesionales", 450, 499, 340);
        Producto producto9 = new Producto(9, "videoconsola2", "Nintendo", "Switch", 390, 400, 600);
        Producto producto10 = new Producto(10, "Telefono2", "Google", "OnePlus", 800, 850, 460);

        ArrayList<Producto> listaStock = new ArrayList<>();

        listaStock.add(producto1);
        listaStock.add(producto2);
        listaStock.add(producto3);
        listaStock.add(producto4);
        listaStock.add(producto5);
        listaStock.add(producto6);
        listaStock.add(producto7);
        listaStock.add(producto8);
        listaStock.add(producto9);
        listaStock.add(producto10);


        System.out.println("Cantidad de productos en la lista: " + listaStock.size());

        Producto productoMayorPrecioVenta = null;
        double precioVentaMaximoActual = -0.1;

        if (!listaStock.isEmpty()) {
            productoMayorPrecioVenta = listaStock.get(0);
            precioVentaMaximoActual = productoMayorPrecioVenta.getPrecioVenta();

            for (Producto producto : listaStock) {
                if (producto.getPrecioVenta() > precioVentaMaximoActual) {
                    precioVentaMaximoActual = producto.getPrecioVenta();
                    productoMayorPrecioVenta = producto;
                }
            }
            System.out.println("-Producto con el mayor precio de venta: ");
            System.out.println("Nombre: " + productoMayorPrecioVenta.getNombre());
            System.out.println("Marca: " + productoMayorPrecioVenta.getMarca());
            System.out.println("Precio venta: " + String.format("%.2f", productoMayorPrecioVenta.getPrecioVenta()));
        } else {
            System.out.println("La lista de porductos esta vacia.");
        }
        Producto productoConMenorPrecioCosto = null;
        double precioCostoMinimoActual = Double.MAX_VALUE;
        if (!listaStock.isEmpty()) {
            for (Producto producto : listaStock) {
                if (producto.getPrecio() < precioCostoMinimoActual) {
                    precioCostoMinimoActual = producto.getPrecio();
                    productoConMenorPrecioCosto = producto;
                }
            }

            System.out.println("-Producto con el menor precio de costo:");
            System.out.println("Nombre: " + productoConMenorPrecioCosto.getNombre());
            System.out.println("Marca: " + productoConMenorPrecioCosto.getMarca());
            System.out.println("Precio Costo: " + String.format("%.2f", productoConMenorPrecioCosto.getPrecio()));
        } else {
            System.out.println("La lista de productos está vacía. No se puede determinar el producto con menor precio de costo.");
        }

        int posicionBorrar = 4;

        if (!listaStock.isEmpty() && listaStock.size() > posicionBorrar) {
            Producto productoBorrar = listaStock.remove(posicionBorrar);
            System.out.println("Se ha borrado el producto en la posición " + (posicionBorrar + 1) + "(índice " + posicionBorrar + "):");
            System.out.println("Producto borrado: " + productoBorrar.getNombre() + " (" + productoBorrar.getId() + ")");
            System.out.println("Cantidad de productos restantes en la lista: " + listaStock.size());
        } else {
            System.out.println("e) No se pudo borrar el producto en la posición " + (posicionBorrar + 1) + ".");
            if (listaStock.isEmpty()) {
                System.out.println("   La lista está vacía.");
            } else {
                System.out.println("   La lista tiene menos de " + (posicionBorrar + 1) + " elementos. Solo tiene " + listaStock.size() + ".");
            }
        }
    }
}


