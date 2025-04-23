package Ejercicios_dia6;

public class Ejercicio3_POO2 {


    public static class verdura {
        int id;
        String nombre;
        String color;
        double calorias;
        String debeCocinarse;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public double getCalorias() {
            return calorias;
        }

        public void setCalorias(double calorias) {
            this.calorias = calorias;
        }

        public String getDebeCocinarse() {
            return debeCocinarse;
        }

        public void setDebeCocinarse(String debeCocinarse) {
            this.debeCocinarse = debeCocinarse;
        }

        public verdura(int id, String nombre, String color, double calorias, String debeCocinarse) {
            this.id = id;
            this.nombre = nombre;
            this.color = color;
            this.calorias = calorias;
            this.debeCocinarse = debeCocinarse;


        }

        public static void main(String[] args) {


            verdura[] verduras = new verdura[5];

            verduras[0] = new verdura(1, "Lechuga", "Verde", 100, "No");
            verduras[1] = new verdura(2, "Zanahoria", "Naranha", 20, "No");
            verduras[2] = new verdura(3, "Berenjena", "Morado", 45, "Si");
            verduras[3] = new verdura(4, "Patata", "Marron", 200, "No");
            verduras[4] = new verdura(5, "Pimiento", "Rojo", 56, "Si");

            for (verdura verdura : verduras) {
                System.out.println("Nombre: " + verdura.getNombre() + " - Calorias: " + verdura.getCalorias());

            }

            verduras[2].setId(16);
            verduras[2].setNombre("Boniato");
            verduras[2].setColor("Beige");
            verduras[2].setCalorias(67);
            verduras[2].setDebeCocinarse("No");

            verduras[3].setId(45);
            verduras[3].setNombre("Coliflor");
            verduras[3].setColor("Blanco");
            verduras[3].setCalorias(90);
            verduras[3].setDebeCocinarse("Si");

            for (verdura v : verduras){
                System.out.println("ID: " + v.getId() + " - Nombre: " + v.getNombre() + " - Color: " + v.getColor() + " - Calorias: " + v.getCalorias() + " - ¿Debe cocinarse?: " + v.getDebeCocinarse());
            }



        }
    }
}




