package Ejercicio1;

public class Descuento {
    private double porcentaje;

    public Descuento(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public double calcularDescuento(double precio) {
        return precio * porcentaje / 100;
    }

    public double aplicarDescuento(double precio) {
        return precio - calcularDescuento(precio);
    }


}
