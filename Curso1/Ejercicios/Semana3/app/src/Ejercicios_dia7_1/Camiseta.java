package Ejercicios_dia7_1;

public class Camiseta extends Vestimenta{
    private String manga;
    private String cuello;

    public Camiseta(String color, String talla, String marca, double precio, String nombre, int codigo, String manga, String cuello) {
        super(color, talla, marca, precio, nombre, codigo);
        this.manga = manga;
        this.cuello = cuello;
    }

    @Override
    public void mostrarMarca() {
        System.out.println("Estos pantalones son de marca: " + manga);;
    }
}

