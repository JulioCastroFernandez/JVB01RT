package Ejercicios_dia7_1;

public class Zapato extends Vestimenta{
    private String material;
    private String tipoDeCierre;

    public Zapato(String color, String talla, String marca, double precio, String nombre, int codigo, String material, String tipoDeCierre) {
        super(color, talla, marca, precio, nombre, codigo);
        this.material = material;
        this.tipoDeCierre = tipoDeCierre;
    }

    @Override
    public void mostrarMarca() {
        System.out.println("Estos zapatos son de marca: " + material);
    }
}

