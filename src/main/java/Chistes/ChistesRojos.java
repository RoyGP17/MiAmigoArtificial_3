
package Chistes;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class ChistesRojos {
    public static void Rojos(){
        Scanner entra = new Scanner(System.in);
        
        System.out.println("HOLA,  MI NOMBRE ES SERWAY QUIERES CHISTES"
                + "\nSi estás seguro de que quieres leer MEJORES CHISTES ROJOS digite ***rojos***\n "
                + "y si no digite cualquier número");
        String respuesta = entra.nextLine();
        
        if(respuesta.equals("rojos")==true){
            
            System.out.println("Un elefante se encuentra con un camello, y le pregunta:\n" +
            "¿cómo es que tienes los pechos en la espalda?\n" +
            "¿y tú me lo preguntas, que llevas el miembro en la cara?"+
            "******************************************"+
            "Mamá, tengo dos noticias, una buena y una mala.\n" +
            "Primero la buena, hija.\n" +
            "Pasé una prueba.\n" +
            "Muy bien, ¿Y la mala?\n" +
            "Que era un Test de embarazo...");
            Scanner entra1 = new Scanner(System.in);
            System.out.println("¿Quieres más chistes ROJOS: ?");
            String respuesta1 = entra1.nextLine();
            
            if(respuesta1.equals("si")==true){
                System.out.println("Como usted diga");
                System.out.println("¿Cuáles son las mujeres que mejor conocen su cuerpo?\n" +
                "- Aquellas que se tocan, porque lo conocen al dedillo…"+
                "***************************************************"+
                "Una madre le dice a su hijo: ¡Me dice un pajarito que te drogas!\n" +
                "¡La que se droga eres tú que habla con pajaritos!");
            }
            else{
                System.out.println("Entiendo, ya no le contaremos más chistes rojos");           
            }  
        
        }    
        else{
            System.out.println("ENTIENDO\n" +
            "YA NO LE CONTAREMOS MÁS CHISTES ROJOS "
            + "PERO, SI DESEA OTRO TIPO DE CHISTES VUELVA A DIGITAR UNA OPCIÓN");
    
        }
        
    }    
    
}
