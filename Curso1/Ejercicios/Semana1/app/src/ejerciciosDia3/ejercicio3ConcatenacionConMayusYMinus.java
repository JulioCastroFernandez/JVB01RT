package ejerciciosDia3;

public class ejercicio3ConcatenacionConMayusYMinus {

    public static String concatenarCadenas(String cadenaMayusculas, String cadenaMinusculas){
        return cadenaMinusculas + " " + cadenaMayusculas;

    }

    public static void main(String[] args) {
        String saludo = concatenarCadenas("DIAS" , "buenos");

        System.out.println(saludo);
    }
}
