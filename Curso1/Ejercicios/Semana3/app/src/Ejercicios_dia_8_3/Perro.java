package Ejercicios_dia_8_3;

public class Perro extends Animal {

    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra: Guau Guau!");
    }

    public static void main(String[] args) {
        Perro miPerro = new Perro();

        miPerro.hacerSonido();
    }
}
