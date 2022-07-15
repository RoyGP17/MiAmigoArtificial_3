package miamigoartificial;
//Fritz

import java.io.IOException;

import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
//-------------------
import static Alerta.Alerta.MostrarMensaje;
import static Alerta.Cumpleaños.AlertaCumpleaños;
import Ayuda.AyudaPrincipal;
import Chistes.Chistes;
import Interfaz.ClaseGato;
import Presentacion.Presentacion;
import static Presentacion.Presentacion.adivinarEdad;
import static Presentacion.Presentacion.saludar;
import Presentacion.Usuario;
import Recomendaciones.Recomendacion;
import Historias.Historias;
import static Presentacion.Presentacion.saludoPrincipal;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class MiAmigoArtificial_3 extends JPanel {

    private static final int ANCHO = 900;
    private static final int LARGO = 600;
    final static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //INVOCAMOS MÉTODOS 
        if (saludoPrincipal() < 2)
        {
            JOptionPane.showMessageDialog(null, "Sigamos, pues :) \nMira la terminaaaal");
            //objP.saludoPrincipal();
            saludar();
            recordarNombre();
            adivinarEdad();
            HacerEleccion();
        } else
        {
            //Despedida
            ValidarDespedida();
            System.out.println("Mucho gusto mi querido amigo, me encanto ser tu amigo "
                    + "\nen estos mil años de aventura");
        }
    }

    public static void ValidarDespedida() throws IOException {
        if (Presentacion.despedida() == 0)
        {
            //Mostrar ventana de despedida y gato controlable
            JOptionPane.showMessageDialog(null, "Puedes controlarlo con las teclas: \nw para mover arriba. \ns para mover abajo. "
                    + "\na para moverlo a la izquierda, \nd para moverlo a la derecha \n y ENTER para salir.");
            //Mostrar ventana de despedida y video
            AñadirVentana();
        } else
        {
            JOptionPane.showMessageDialog(null, "Vuelve pronto, tq <3");
            System.exit(0);
        }
    }

    public static void HacerEleccion() throws IOException {
        int OpcionDeEntrada = 0;
        Presentacion objP = new Presentacion();
        do
        {
            System.out.println("\nHey! que te gustaria jugar comnigo");
            System.out.println("1. ALERTA");
            System.out.println("2. AYUDA");
            System.out.println("3. CHISTES");
            System.out.println("4. HISTORIAS");
            System.out.println("5. RECOMENDACIONES");
            System.out.println("6. salir");
            OpcionDeEntrada = entrada.nextInt();
            switch (OpcionDeEntrada)
            {
                case 1:
                    AlertaCumpleaños();
                    break;
                case 2:
                    ObtenerAyuda();
                    break;
                case 3:
                    ObtenerChistes();
                    break;
                case 4:
                    ObtenerHistorias();
                    break;
                case 5:
                    ObtenerRecomendaciones();
                    break;
                case 6:
                    ValidarDespedida();
                default:
                    System.out.println("OPCION INCORRECTA!");
            }
        } while (OpcionDeEntrada != 0);
    }

    public static void AñadirVentana() throws IOException {
        //Creamos la ventana
        JFrame Ventana1 = new JFrame("Mi Amigo Artificial");
        MiAmigoArtificial_3 objeto = new MiAmigoArtificial_3();

        Ventana1.setSize(ANCHO, LARGO);
        Ventana1.add(new ClaseGato());
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

    public static void ObtenerChistes() {
        Chistes oC = new Chistes();
        oC.mostrarOpciones();
    }

    public static void ObtenerHistorias() {
        Historias oH = new Historias();
        oH.LeerLibros();
    }

    public static void ObtenerAyuda() {
        AyudaPrincipal oA = new AyudaPrincipal();
        oA.MostrarAyuda();
    }

}
