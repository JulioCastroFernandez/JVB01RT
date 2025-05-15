package Ejercicios_dia_8_2;

public class Pago {
    private TipoDePago tipo;

    public Pago(TipoDePago tipo) {
        this.tipo = tipo;
    }

    public void mostrarTipoDePago() {
        System.out.println("El tipo de pago seleccionado es: " + this.tipo);
    }

    public static void main(String[] args) {
        Pago pago1 = new Pago(TipoDePago.EFECTIVO);
        pago1.mostrarTipoDePago();

        Pago pago2 = new Pago(TipoDePago.TARJETA_CREDITO);
        pago2.mostrarTipoDePago();
    }


}
