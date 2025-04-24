package Ejercicios_dia7_1;

public class Sombrero extends Vestimenta{
    private String tipo;
    private String tamaño;

    public Sombrero(String color, String talla, String marca, double precio, String nombre, int codigo, String tipo, String tamaño) {
        super(color, talla, marca, precio, nombre, codigo);
        this.tipo = tipo;
        this.tamaño = tamaño;
    }

    @Override
    public void mostrarMarca() {
        System.out.println("Este sombrero es de marca: " + tipo);
    }
}

