package Ejercicios_dia6;

public class Ejercicio1_ClasesYObjetos {

    public static class electrodomestico {
        private String cod;
        private String marca;
        private String modelo;
        private String consumo;
        private String color;

        public electrodomestico(String cod, String marca, String modelo, String consumo, String color) {
            this.cod = cod;
            this.marca = marca;
            this.modelo = modelo;
            this.consumo = consumo;
            this.color = color;
        }

        public electrodomestico() {
        }
    }

    public static void main(String[] args) {

        electrodomestico e1 = new electrodomestico("1", "Sony", "X1000", "A+", "Negro");
        electrodomestico e2= new electrodomestico("2", "Bose", "a234", "A++", "Blanco");
        electrodomestico e3 = new electrodomestico("3", "Panasonic", "LPD", "A+++", "Amarillo");
        electrodomestico e4 = new electrodomestico();

        System.out.println("Las caracteristicas de e1 son: " + e1.marca + ", " + e1.modelo + ", " + e1.consumo + "." );
        System.out.println("Las caracteristicas de e2 son: " + e2.marca + ", " + e2.modelo + ", " + e2.consumo + ".");
        System.out.println("Las caracteristicas de e3 son: " + e3.marca + ", " + e3.modelo + ", " + e3.consumo + ".");

        System.out.println("Las caracteristicas de e4 son: " + e4.marca);
    }


}
