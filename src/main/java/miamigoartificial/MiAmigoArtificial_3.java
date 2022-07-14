package miamigoartificial;
//Fritz
import java.io.IOException;

import javax.swing.JPanel;
import javax.swing.JFrame;
import java.util.Scanner;
import javax.swing.JLabel;
//-------------------
import static Alerta.Alerta.MostrarMensaje;
import static Alerta.Cumpleaños.AlertaCumpleaños;
import Interfaz.ImagenGato;
import Presentacion.Presentacion;
import static Presentacion.Presentacion.adivinarEdad;
import static Presentacion.Presentacion.saludar;
import Presentacion.Usuario;
import Recomendaciones.Recomendacion;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class MiAmigoArtificial_3 extends JPanel{
    private static final int ANCHO = 1164;
    private static final int LARGO = 690;

    final static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        //Presentacion
        String a = "Yo soy tu amigo artificial";
        JOptionPane.showMessageDialog(null, "¡Hola!, dejame presentarme: " + a + "\nJarvis");

        saludar();
        recordarNombre();
        adivinarEdad();

        
        if (Presentacion.siguiente()==0){
            AñadirVentana();
        } else {
            JOptionPane.showMessageDialog(null, "Vuelve pronto");
        }
                ObtenerRecomendaciones();
        AlertaCumpleaños();

    }
        public static void AñadirVentana() throws IOException{
                //Creamos la ventana
                JFrame Ventana1 = new JFrame("Mi Amigo Artificial");
                Presentacion b = new Presentacion();
                //String aea = b.saludar().toString();
                JLabel etiqueta1, etiqueta2;
                //etiqueta1 = new JLabel(aea, JLabel.CENTER);
                etiqueta2 = new JLabel("");

                MiAmigoArtificial_3 objeto = new MiAmigoArtificial_3();

                Ventana1.setSize(ANCHO, LARGO);
                //Ventana1.getContentPane().add(objeto);
                //Ventana1.add(etiqueta1).setLocation(0, 150);
                //Ventana1.add(etiqueta2);
                Ventana1.add(new ImagenGato());
                Ventana1.setLocation(0, 0);
                Ventana1.setLocationRelativeTo(null);
                Ventana1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                Ventana1.setVisible(true);
                //----------------------------------
            }

    public static void recordarNombre() {
        System.out.println("\nBueno ahora es tu turno de decirme como te llamas: ");
        String nombre = entrada.nextLine();
        Usuario ObjetoA = new Usuario();
        ObjetoA.setNombres(nombre.toUpperCase());
        System.out.println("Que fabuloso nombre tienes, " + ObjetoA.getNombres() + "."
                + "\n y sabes, seré tu mejor amigo o mejor dicho seremos grandes amigos!!"
                + "\n Te acompañaré por mil años asi que necesito que me cuides si quieres"
                + "\n que te acompañe por estas hermosas aventuras");

        MostrarMensaje(nombre);
    }

    public static void ObtenerRecomendaciones() {
        Recomendacion or = new Recomendacion();
        or.recomendacion();
    }
}
