package Alerta;

import java.util.Date;
import java.util.Timer;

public class Alerta {

    public static void MostrarMensaje(String nombre) {
        Timer timer = new Timer();
        RecordarFecha fecha = new RecordarFecha(nombre);
        fecha.imprimirFecha();

        timer.schedule(fecha, new Date());
    }
}
