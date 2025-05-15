package Ejercicios_dia7_2;

public class Pantalon extends Vestimenta{
    private String estilo;
    private String tipoDeTejido;

    public Pantalon(String color, String talla, String marca, double precio, String nombre, int codigo, String tipoDeTejido, String estilo) {
        super(color, talla, marca, precio, nombre, codigo);
        this.tipoDeTejido = tipoDeTejido;
        this.estilo = estilo;
    }

    @Override
    public void mostrarMarca() {
        System.out.println("Estos pantalones son de marca: " + estilo);
    }
}

