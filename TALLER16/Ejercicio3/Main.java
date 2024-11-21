package Ejercicio3;

import java.nio.channels.Pipe.SourceChannel;

public class Main {
    public static void main(String[] args) {
        Mensajero mens1 = new Mensajero();
        Mensajero mens2 = new notPush();
        Mensajero mens3 = new Sms();
        System.out.println("************************************************");
        System.out.println("Mensaje únicamente por correo electronico");
        mens1.enviarMensaje("Hola, como estas?, me llamo kevin");
        System.out.println("************************************************");
        System.out.println("************************************************");
        System.out.println("Mensaje por SMS");
        mens3.enviarMensaje("Como vas?");
        System.out.println("************************************************");
        System.out.println("Mensaje por notificacion push");
        mens2.enviarMensaje("Dasvivienda te informa el retiro por $200.000 pesos");
        System.out.println("************************************************");
    }
}
