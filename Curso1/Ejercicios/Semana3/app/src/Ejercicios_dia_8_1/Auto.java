package Ejercicios_dia_8_1;

public class Auto implements Vehiculo {

    @Override
    public void acelerar(){
        System.out.println("El coche está acelerando...");
    }

    @Override
    public void frenar(){
        System.out.println("El coche está frenando.");
    }
}