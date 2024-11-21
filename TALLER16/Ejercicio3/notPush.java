package Ejercicio3;

public class notPush extends Mensajero {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando notificacion con mensaje: " + mensaje);
    }
}


