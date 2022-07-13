package miamigoartificial;

import static Alerta.Alerta.MostrarMensaje;
import static Alerta.Cumpleaños.AlertaCumpleaños;
import static Presentacion.Presentacion.adivinarEdad;
import static Presentacion.Presentacion.saludar;
import Presentacion.Usuario;
import Recomendaciones.Recomendacion;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class MiAmigoArtificial_3 {

    final static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        String a = "Yo soy tu amigo artificial";
        JOptionPane.showMessageDialog(null, "¡Hola!, dejame presentarme: " + a + "\nJarvis");

        saludar();
        recordarNombre();
        adivinarEdad();
        ObtenerRecomendaciones();
        AlertaCumpleaños();
    }

    public static void recordarNombre() {
        System.out.println("\nBueno ahora es tu turno de decirme como te llamas: ");
        String nombre = entrada.nextLine();
        Usuario ObjetoA = new Usuario();
        ObjetoA.setNombres(nombre.toUpperCase());
        System.out.println("Que fabuloso nombre tienes, " + ObjetoA.getNombres() + "."
                + "\n y sabes, seré tu mejor amigo o mejor dicho seremos grandes amigos!!"
                + "\n Te acompañaré por mil años asi que necesito que me cuides si quieres"
                + "\n que te acompañe por estas hermosas avenmturas");

        MostrarMensaje(nombre);
    }

    public static void ObtenerRecomendaciones() {
        Recomendacion or = new Recomendacion();
        or.recomendacion();
    }
}
