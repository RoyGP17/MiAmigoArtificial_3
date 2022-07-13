package Alerta;

import Presentacion.Usuario;
import java.util.Date;
import java.util.Scanner;
import java.util.TimerTask;
import javax.swing.JOptionPane;

public class RecordarFecha extends TimerTask {

    private String nombre;
    Scanner entrada = new Scanner(System.in);

    public RecordarFecha(String _nombre) {
        this.nombre = _nombre;
    }

    @Override
    public void run() {
        //imprimirFecha();
    }

    public void imprimirFecha() {
        Usuario oU = new Usuario();
        oU.getNombres();
        System.out.println("Que tengas un bonito dia " + nombre + " hoy es: " + new Date());

//        int seleccion = JOptionPane.showOptionDialog(
//                null, "Pregunta", "¿Quieres continuar?",
//                JOptionPane.YES_NO_OPTION,
//                JOptionPane.QUESTION_MESSAGE,
//                null, // null para icono por defecto.
//                new Object[]{"Si", "No"},
//                "opcion 2");
//        if (seleccion == 1) {
//            //Con esto se cierra toda la aplicación
//            //System.exit(0);
//        } else {
//            System.out.println("Ha pulsado Si");
//        }
    }
}
