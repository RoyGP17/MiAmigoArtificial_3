/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Historias;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class AdministradorLibros {
    public Libro []listaLibrosDeDrama = new Libro[10];
    public Libro []listaLibrosDeComedia = new Libro[10];
    public Libro []listaLibrosDeAventura = new Libro[10];
    
    public void agregarLibro(Libro nombre,String genero, int orden){
        switch (genero){
            case("DRAMA"):
                listaLibrosDeDrama[orden] = nombre; 
                break;
            case("COMEDIA"):
                listaLibrosDeComedia[orden] = nombre; 
                break;
            case("AVENTURA"):
                listaLibrosDeAventura[orden] = nombre; 
                break;
            default:
                System.out.println("No hay esa opcion, intenta nuevamente");
        }
    }
    public void menu(){
        Scanner entrada = new Scanner(System.in);
        int Respuesta = entrada.nextInt();
        //Random random = new Random();
        //int Aleatorio = random.nextInt(2);
        Scanner scanner = new Scanner(System.in);
        switch(Respuesta){
            case(1):
                System.out.println("Quieres que te cuente algo  ^^");
                System.out.println("Está bien");
                int Respuesta1 = 0;

                do{
                    System.out.println("Tenemos las siguientes bibliotecas");
                    System.out.println("1) Libros de Drama");
                    System.out.println("2) Libors de Aventura");
                    System.out.println("2) Libros de Comedia");
                    System.out.println("4) Salir");
                    Respuesta1 = scanner.nextInt();
                    switch(Respuesta1){
                        case(1): 
                            Random random = new Random();
                            int Aleatorio = random.nextInt(2);
                            this.listaLibrosDeDrama[Aleatorio].introduccion();
                            this.listaLibrosDeDrama[Aleatorio].leerLibro(); 
                            break;
                        case(2): 
                            Random random1 = new Random();
                            int Aleatorio1 = random1.nextInt(2);
                            this.listaLibrosDeAventura[Aleatorio1].introduccion();
                            this.listaLibrosDeAventura[Aleatorio1].leerLibro();
                        case(3):
                            Random random2 = new Random();
                            int Aleatorio2 = random2.nextInt(2);
                            this.listaLibrosDeComedia[Aleatorio2].introduccion();
                            this.listaLibrosDeComedia[Aleatorio2].leerLibro();
                        case(4):
                            System.out.println("Adios");
                        default:
                            System.out.println("No hay esa opcion, intenta nuevamente");
                        }
                
                }while(Respuesta1!= 4);
            default:
              System.out.println("No hay esa opcion, intenta nuevamente");  
        }    
    }
}
