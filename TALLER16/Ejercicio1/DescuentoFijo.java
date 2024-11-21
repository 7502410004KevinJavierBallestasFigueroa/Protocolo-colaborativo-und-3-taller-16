package Ejercicio1;

public class DescuentoFijo extends Descuento {
    private double descuentoFijo;

    public DescuentoFijo(double descuentoFijo) {
        super(0);
        this.descuentoFijo = descuentoFijo;
    }

    public double getDescuentoFijo() {
        return descuentoFijo;
    }

    @Override
    public double calcularDescuento(double precio) {
        return descuentoFijo;
    }

    @Override
    public double aplicarDescuento(double precio) {
        return precio - descuentoFijo;
    }
}
