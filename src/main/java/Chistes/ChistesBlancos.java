
package Chistes;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class ChistesBlancos {
    
    public static void blancos(){
        Scanner entra = new Scanner(System.in);
        
        System.out.println("HOLA,  MI NOMBRE ES SERWAY QUIERES CHISTES"
                + "\nSi estás seguro de que quieres leer LOS MEJORES CHISTES BLANCOS digite ***blancos***\n"
                + "y si no digite SALIR");
        String respuesta = entra.nextLine();
        
        if(respuesta.equals("blancos")==true){
            
            System.out.println("¿Cuánto cuesta esta estufa?\n" +
            "6000 dolares\n" +
            "- Pero, esto es una estafa"+
            "- No Señor, esto es una Estufa"+
            "*************************************"+
            "YO VIVO A BASE DE VITAMINA C\n" +
            "\n" +
            "-COMPUTADORA\n" +
            "\n" +
            "-CELULAR\n" +
            "\n" +
            "-COMIDA\n" +
            "\n" +
            "-CAMA");
            Scanner entra1 = new Scanner(System.in);
            System.out.println("¿Quieres más chistes BLANCOS: ?");
            String respuesta1 = entra1.nextLine();
            
            if(respuesta1.equals("si")==true){
                System.out.println("Como usted diga");
                System.out.println("– ¿Me puede ayudar, por favor ? Mi hija se ha perdido \n" +
                "- ¿Cómo se llama su hija?\n"+
                "- Esperanza\n"+
                "- Imposible, La esperanza es lo último que se pierde"+
                "*************************************"+
                "¡A MÍ NADIE ME DA ÓRDENES!\n" +
                "\n" +
                "“10% DE BATERÍA. CONECTE EL CARGADOR”.\n" +
                "\n" +
                "VOY.");
            }
            else{
                System.out.println("Entiendo, ya no le contaremos más chistes Blancos");           
            }  
        
        }    
        else{
            System.out.println("ENTIENDO \n" +
            "YA NO LE CONTAREMOS CHISTES BLANCOS "+
            "PERO, SI DESEA OTRO TIPO DE CHISTES VUELVA A DIGITAR UNA OPCIÓN");
    
        }
        
    }
   
        
        
    
}
