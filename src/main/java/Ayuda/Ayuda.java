package Ayuda;

import java.util.Scanner;

public class Ayuda {

    public int ayudin;
    final static Scanner entrada = new Scanner(System.in);

    public void Cordial() {
        System.out.println("\nHola ^.^");
        System.out.println("Bienvenid@ a mi mundo de ayuda!!");
        System.out.println("\nDime o cuentame para que soy bueno");
        String usuario = entrada.nextLine();
    }

    public void mostrarOpciones() {
        //Mostramos opciones
        System.out.println("\nHi!! mira solo en estos te puedo ayudar escoge sii");
        System.out.println("\n1. AYUDA PSICOLÓGICA"); // psicologico
        System.out.println("2. AYUDA EN TAREA");
        System.out.println("0. VOLVER");
    }

}
