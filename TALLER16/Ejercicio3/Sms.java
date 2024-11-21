package Ejercicio3;

public class Sms extends Mensajero {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando SMS al +57 3001254789 con mensaje: " + mensaje);
    }
}

