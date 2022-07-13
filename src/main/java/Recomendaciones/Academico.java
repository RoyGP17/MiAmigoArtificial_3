
package Recomendaciones;

import java.util.Scanner;

public class Academico extends Recomendacion{
    
    Scanner entrada = new Scanner(System.in);
    
    @Override
    public void recomendacionAcademica(){
        
        System.out.println("Elija los posibles problemas que presenta:");
        
        int opcion = 0;
        
        do{
            System.out.println("1. Problemas de concentracion");
            System.out.println("2. Falta de organizacion");
            System.out.println("3. Inseguridad en el desarrollo academico");
            System.out.println("4. salir");
            System.out.println("Elige quien quisieras que te asesore");
            opcion = entrada.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Se hace muy dificil al no pensar en otra cosa"
                            + " mientras intenta prestar atencion");
                case 2:
                    System.out.println("Le genera estres o descuido total de las "
                            + " actividades, si este problema no es tratado suele "
                            + " llevarse hasta la edad adulta");
                case 3:
                    System.out.println("Sientes que no eres capaz aun cuando te has "
                            + " preparado para realizar un examen, exposicion o cualquier "
                            + " otro tipo de actividad, talvez hasta puedes ser inseguro "
                            + " en la entrega adecuadad de una materia");
            }
        }while(opcion!=4);        
    }  
}
