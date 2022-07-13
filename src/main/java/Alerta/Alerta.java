
package Alerta;

import java.util.Date;
import java.util.Timer;

public class Alerta {
    
    public static void MostrarMensaje(){
        Timer timer = new Timer();
        RecordarFecha fecha = new RecordarFecha(); 
        
        timer.schedule(fecha, new Date());
    }
}
