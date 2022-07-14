/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ayuda;

import java.util.Scanner;

/**
 *
 * @author LUCY
 */
public class AyudaPrincipal {
    public final static Scanner entrada = new Scanner(System.in); 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Creamos el objeto oAyuda
        Ayuda oAyuda = new Ayuda();
        // Creamos el objeto
        AyudaPsicologica oAyudaPsicologica = new AyudaPsicologica();
        // Creamos el objeto
        AyudaTareas oAyudaTareas = new AyudaTareas();
        
        int rpt=0;
        do{
            oAyuda.Cordial();
            oAyuda.mostrarOpciones();
            rpt = entrada.nextInt();
            System.out.println("**********");
            //entrada.nextInt();
            switch(rpt){
                case 0:
                    System.out.println("\nBueno seguro estarás bien Smile!!");
                    break;
                case 1:
                    oAyudaPsicologica.Cordial();
                    oAyudaPsicologica.mostrarOpciones();
                    
                case 2:
                    oAyudaTareas.Cordial();
                    oAyudaTareas.mostrarOpciones();
                    
                    break;
                default:
                    System.out.println("\nEstimad@ ingrese el dato bien porfis");
            }
        }while(rpt!=0);
        
    }
    
}
