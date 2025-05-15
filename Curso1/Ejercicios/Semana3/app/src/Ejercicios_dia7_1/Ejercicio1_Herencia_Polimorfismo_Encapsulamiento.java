package Ejercicios_dia7_1;

public class Ejercicio1_Herencia_Polimorfismo_Encapsulamiento {

    public static void main(String[] args) {

        Mamifero mamifero = new Mamifero(1, "Capibara", 2, "Peluda", "Vegetariano", 4, "Vivipara", "Marron", "Cerca de los rios");
        Ave ave = new Ave(2, "Gaviota", 4, "Plumas", "Omnivora", 1.8, "Planeo", "Blanco y negro", "Alargado");
        Reptil reptil = new Reptil(3, "Iguana", 7, "Escamas", "Carnivora", 1.2, "Duras", "No tiene");

        mamifero.saludar();
        ave.saludar();
        reptil.saludar();

        Animal animal = new Mamifero (1, "Capibara", 2, "Peluda", "Vegetariano", 4, "Vivipara", "Marron", "Cerca de los rios");

        animal.saludar();
    }
}
