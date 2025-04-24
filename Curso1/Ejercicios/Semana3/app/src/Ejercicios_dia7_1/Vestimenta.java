package Ejercicios_dia7_1;

public class Vestimenta {
    private int codigo;
    private String nombre;
    private double precio;
    private String marca;
    private String talla;
    private String color;

    public Vestimenta() {
    }

    public Vestimenta(String color, String talla, String marca, double precio, String nombre, int codigo) {
        this.color = color;
        this.talla = talla;
        this.marca = marca;
        this.precio = precio;
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public void mostrarMarca() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }



}


