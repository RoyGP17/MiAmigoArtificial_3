package Alerta;

import Presentacion.Usuario;
import java.util.Date;
import java.util.TimerTask;

public class RecordarFecha extends TimerTask {

    private String nombre;

    public RecordarFecha(String _nombre) {
        this.nombre = _nombre;
    }

    @Override
    public void run() {
    }

    public void imprimirFecha() {
        Usuario oU = new Usuario();
        oU.getNombres();
        System.out.println("Que tengas un bonito dia " + nombre.toUpperCase() + " hoy es: " + new Date());
    }
}
