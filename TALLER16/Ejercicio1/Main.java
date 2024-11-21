package Ejercicio1;

public class Main {
    public static void main(String[] args) {

        Descuento descuentoP = new Descuento(19);
        double precioOriginal = 1000000;
        double precioConDescuentoP = descuentoP.aplicarDescuento(precioOriginal);
        System.out.println("Precio con descuento de IVA por dia sin IVA: " + precioConDescuentoP + " pesos");

        DescuentoFijo descuentoFijo = new DescuentoFijo(15000);
        double precioConDescuentoFijo = descuentoFijo.aplicarDescuento(precioOriginal);
        System.out.println("En dia normal se aplica el precio con descuento fijo por buen cliente: " + precioConDescuentoFijo + " pesos");
    }
}
