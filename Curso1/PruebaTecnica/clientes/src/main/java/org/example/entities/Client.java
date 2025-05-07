package org.example.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity(name = "clientes")  //Cambio el nombre de la tabla a "Clientes".
public class Client {
    // tabla de la BD

    //Ahora creo las columnas.
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY) // quiero que me genere automaticamente un ID con cada usuario.
    private Integer id;

// Le identifico cuales son las columnas de la tabla con @Colum y uso nullable para que obligatoriamente tenga que cubrir todos los datos.
@Column(nullable = false)
    private String nombre;

@Column(nullable = false)
    private String apellidos;

@Column(nullable = false)
    private String sexo;

@Column(nullable = false)
    private String ciudad;

@Column(nullable = false)
    private LocalDate fechaNacimiento;

@Column(nullable = false)
    private int numeroTelefono;

@Column(nullable = false)
    private String mail;


    // Creo los constructores.

    public Client() {
    }

    public Client(Integer id, String nombre, String apellidos, String sexo, String ciudad, LocalDate fechaNacimiento, int numeroTelefono, String mail) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sexo = sexo;
        this.ciudad = ciudad;
        this.fechaNacimiento = fechaNacimiento;
        this.numeroTelefono = numeroTelefono;
        this.mail = mail;
    }


    // Creo los getters y setters


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    //Metodo para imprimir por consola

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", sexo='" + sexo + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", numeroTelefono=" + numeroTelefono +
                ", mail='" + mail + '\'' +
                '}';
    }
}
