package Chistes;

import java.util.Scanner;

public class ChistesInteligentes extends Chistes {

    public static void Inteligentes(){
        Scanner entra = new Scanner(System.in);
        
        System.out.println("HOLA,  MI NOMBRE ES SERWAY QUIERES CHISTES ???"
                + "\nSi estás seguro de que quieres leer LOS MEJORES CHISTES INTELIGENTES digite ***inteligentes***\n"
                + "y si no digite SALIR ");
        String respuesta = entra.nextLine();
        
        if(respuesta.equals("inteligentes")==true){
            
            System.out.println("Que bonito es hacer el amor cuando tus hijos estan en el colegio!!!\n" +
            "- Pero si tu no tienes mujer ni hijos \n" +
            "- Creo que no me estás entendiendo\n"+
            "******************************************\n"+
            "Los geómetras no mueren, simplemente pasan a otro plano.\n");
            Scanner entra1 = new Scanner(System.in);
            System.out.println("Si quieres más chistes INTELIGENTES digite **si**: ?");
            String respuesta1 = entra1.nextLine();
            
            if(respuesta1.equals("si")==true){
                System.out.println("Como usted diga");
                System.out.println("La luz viaja más rápido que el sonido. Por eso mucha gente \n"+
                "parece brillantes hasta que lo oyes hablar\n"+
                "***********************************************\n"+
                "-Mi papá vive de las letras.\n" +
                "-Ah, ¿es escritor?\n" +
                "-No, sufre de diabetes y vive tomando vitaminas A, B, C, D.\n");
            }
            else{
                System.out.println("Entiendo, ya no le contaremos más chistes Inteligentes");           
            }  
        
        }    
        else{
            System.out.println("ENTIENDO \n" +
            "YA NO LE CONTAREMOS MÁS CHISTES INTELIGENTES\n"
            + "PERO, SI DESEA OTRO TIPO DE CHISTES VUELVA A DIGITAR UNA OPCIÓN");
    
        }
        
    }    
}
