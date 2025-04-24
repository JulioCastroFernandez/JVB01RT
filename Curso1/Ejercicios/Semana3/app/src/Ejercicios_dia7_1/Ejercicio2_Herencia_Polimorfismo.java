package Ejercicios_dia7_1;

public class Ejercicio2_Herencia_Polimorfismo {

    public static void main(String[] args) {

        Vestimenta[] vestimentas = new Vestimenta[9];

        vestimentas[0] = new Zapato("Negro", "L", "Louis Vuiton", 120, "Mocasin", 1, "Cuero", "Cordones");
        vestimentas[1] = new Zapato("Azul", "M", "Adidas", 100, "Full Speed", 2, "Tela", "Cordones");
        vestimentas[2] = new Zapato("Amarillo", "XL", "Nike", 230, "Mercurial", 3, "Cuero y goma", "Cordones");

        vestimentas[3] = new Pantalon("Verde", "S", "Rebook", 35, "Sport", 4, "Nilon", "Chandal");
        vestimentas[4] = new Pantalon("Negro", "XXL", "Berska", 40, "STW", 5, "Mezclilla", "Vaquero");
        vestimentas[5] = new Pantalon("Rojo", "M", "Puma", 20, "Summer", 5, "Lycra", "Bañador");

        vestimentas[6] = new Camiseta("Morada", "S", "Lacoste", 300, "Polo", 7, "Corta", "En pico");
        vestimentas[7] = new Camiseta("Rosa", "XL", "Zara", 50, "Tirantes", 8, "Sin mangas", "Circular");

        vestimentas[8] = new Sombrero("Blanco", "M", "Caps", 450, "Copa",9, "De gala", "Mediano");

        for (Vestimenta array : vestimentas){
            array.mostrarMarca();
        }

        }

    }


