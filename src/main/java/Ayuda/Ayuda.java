package Ayuda;

import java.util.Scanner;

public class Ayuda {

    public int ayudin;
    final static Scanner entrada = new Scanner(System.in);

    public void Cordial() {
        System.out.println("\nHola ^.^");
        System.out.println("\nDime o cuentame para que soy bueno");
        String usuario = entrada.nextLine();
    }

    public void mostrarOpciones() {
        //Mostramos opciones
        System.out.println("\nMira solo te puedo ayudar con esto dos"
                + "\nescoge que deseas ahhh");
        System.out.println("\n1. AYUDA PSICOLÓGICA"); // psicologico
        System.out.println("2. AYUDA EN TAREA");
        System.out.println("0. NINGUNA");
    }

}
