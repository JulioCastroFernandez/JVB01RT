package ejercicios_dia3;

public class Ejercicio3_ConcatenacionMayusYMinus {

    public static String concatenarCadenas(String cadenaMayusculas, String cadenaMinusculas){
        return cadenaMinusculas + " " + cadenaMayusculas;

    }

    public static void main(String[] args) {
        String saludo = concatenarCadenas("DIAS" , "buenos");

        System.out.println(saludo);
    }
}

