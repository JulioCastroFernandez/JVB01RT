package Ejercicio_dia_9_1;

public abstract class Vehiculo {
    private int id;
    private String placa;
    private String marca;
    private String modelo;
    private int anio;
    private double costo;

    public Vehiculo(int id, String placa, String marca, String modelo, int anio, double costo) {
        this.id = id;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.costo = costo;
    }

    public int getId() {
        return id;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnio() {
        return anio;
    }

    public double getCosto() {
        return costo;
    }

    public abstract int calcularAntiguedad();

    }

