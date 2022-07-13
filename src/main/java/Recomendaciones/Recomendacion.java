package Recomendaciones;

import java.util.Scanner;

public class Recomendacion {

    static Scanner entrada = new Scanner(System.in);

    public void recomendacion() {

        System.out.println("\n\tBIENVENIDO A LA SECCION DE RECOMEDACIONES");

        int opcion = 0;

        do {
            System.out.println("1. Recomendacion gastronómica");
            System.out.println("2. Recomendacion académica");
            System.out.println("3. Salir");
            System.out.println("POR FAVOR ELIJA UNA OPCION: ");

            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    recomendacionGastronomica();
                    break;
                case 2:
                    recomendacionAcademica();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        } while (opcion != 3);

        System.out.println("Usted ah terminado las acciones de la recomendacion");
    }

    public void recomendacionGastronomica() {
        System.out.println("Usted a llegado al lugar correcto para las \n recomendaciones gastronomicas");
        Gastronomico oG = new Gastronomico();
        oG.recomendacionGastronomica();
    }

    public void recomendacionAcademica() {
        System.out.println("Usted a llegado al lugar correcto para las \n recomendaciones academicas");
        Academico oA = new Academico();
        oA.recomendacionAcademica();
    }
}
