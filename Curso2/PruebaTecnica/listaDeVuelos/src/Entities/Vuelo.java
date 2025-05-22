package Entities;

import java.time.LocalDate;

public class Vuelo {  //Obejeto Vuelo.
    private int id;
    private String nombreVuelo;
    private String aerolineas;
    private String lugarSalida;
    private String lugarLlegada;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    //Constructor con valores
    public Vuelo(int id, String nombreVuelo, String aerolineas, String lugarSalida, String lugarLlegada, LocalDate fechaInicio, LocalDate fechaFin) {
        this.id = id;
        this.nombreVuelo = nombreVuelo;
        this.aerolineas = aerolineas;
        this.lugarSalida = lugarSalida;
        this.lugarLlegada = lugarLlegada;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }
    //Constructor vacio.
    public Vuelo() {
    }
    //Getters y Setters.
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreVuelo() {
        return nombreVuelo;
    }

    public void setNombreVuelo(String nombreVuelo) {
        this.nombreVuelo = nombreVuelo;
    }

    public String getAerolineas() {
        return aerolineas;
    }

    public void setAerolineas(String aerolineas) {
        this.aerolineas = aerolineas;
    }

    public String getLugarSalida() {
        return lugarSalida;
    }

    public void setLugarSalida(String lugarSalida) {
        this.lugarSalida = lugarSalida;
    }

    public String getLugarLlegada() {
        return lugarLlegada;
    }

    public void setLugarLlegada(String lugarLlegada) {
        this.lugarLlegada = lugarLlegada;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }
    
    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }
    //Creamos los to string por si los necesitamos.
    @Override
    public String toString() {
        return "Vuelo{" +
                "id=" + id +
                ", nombreVuelo='" + nombreVuelo + '\'' +
                ", aerolineas='" + aerolineas + '\'' +
                ", lugarSalida='" + lugarSalida + '\'' +
                ", lugarLlegada='" + lugarLlegada + '\'' +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                '}';
    }
}
