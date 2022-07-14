
package Presentacion;

import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Presentacion {
    
    final static Scanner entrada = new Scanner(System.in);
    
    public static void saludar(){
        System.out.println("\n\tPROJETCS: MI AMIGO ARTIFICIAL");
        System.out.println("""
                           Fui creado el año 1969 fecha en la que el hombre dio un salto 
                           Pero no de un salto, sino un salto de la humanidad del hombre vale""");
    } 
    
    public static void adivinarEdad(){
        System.out.println("\nMira te digo, Que soy increible adivinando tu edad y apuesto que lo haré");
        System.out.println("Asi que comenzamos");
        System.out.println("Cúal es el resto al dividir tu edad por 3");
        int resto3 = entrada.nextInt();
        System.out.println("Ahora cúal es el resto al dividir tu edad por 5");
        int resto5 = entrada.nextInt();
        System.out.println("Finalmente cúal es el resto al dividir tu edad por 7");
        int resto7 = entrada.nextInt();
        int edad = (resto3*70 + resto5*21 + resto7*15) % 105;
        System.out.println("haciendo un esfuerzo mental y mis fabulosos cálculos");
        System.out.println("Me arroja que tu edad es "+ edad +" y de hecho somos compatibles asi como");
        System.out.println("el signo nega y posi");
    }
    //mOSTRAR EL jOPTION SHOWcONFIRM dIALOG
    public static int siguiente(){
        ImageIcon icono = new ImageIcon("C:\\Users\\FRITZBRENNER\\Desktop\\MiAmigoArtificial_3\\src\\main\\java\\Imagenes\\rainbow-neko.gif");
        /*Image image = icono.getImage();
        Image newimg = image.getScaledInstance(120, 120,  java.awt.Image.SCALE_SMOOTH);
        icono = new ImageIcon(newimg);*/
        int seleccion = JOptionPane.showConfirmDialog(null, "Podemos continuar?", "Siii", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, icono );
        return seleccion;
    }
}

