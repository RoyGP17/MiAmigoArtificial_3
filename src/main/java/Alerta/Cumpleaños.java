package Alerta;

import java.util.Scanner;
import java.util.Calendar; //leer fecha actual y fecha futura
import java.util.Date; //Obtener la fecha y hora del sistema
import java.util.GregorianCalendar; //Calcular si es el año bisiesto

public class Cumpleaños extends Alerta {

    public static void AlertaCumpleaños() {
        Scanner entrada = new Scanner(System.in);
        Calendar act = Calendar.getInstance();
        Calendar fut = Calendar.getInstance();
        Date date = new Date(); //tomar la efcha y hora  de sistema
        GregorianCalendar calendario = new GregorianCalendar();

        int a, m, d;

        System.out.println("\nIngresa el año de naciemiento");
        a = entrada.nextInt();
        System.out.println("Ingresa el mes de naciemiento");
        m = entrada.nextInt();
        System.out.println("Ingresa el día de naciemiento");
        d = entrada.nextInt();

        int año = date.getYear() + 1900;
        int mes = date.getMonth() + 1;
        int dia = date.getDay() + 3;

        if (m >= mes && d >= dia)
        { //Si tu cumpleaños aun no llega
            fut.set(año, m, d);
        } else
        {
            fut.set(año + 1, m, d);
        }

        act.set(año, mes, dia);

        long actualA = act.getTimeInMillis();
        long futuroA = fut.getTimeInMillis();
        long diferencia = futuroA - actualA;
        long diferenciadias = diferencia / (24 * 60 * 60 * 1000); //Conversion de milisegundos a dias

        if (calendario.isLeapYear(año))
        {
            System.out.println("Tu cumpleaños es en " + (diferenciadias + 1) + " dias");
        } else
        {
            System.out.println("Tu cumpleaños ya paso, pero en " + (diferenciadias)
                    + " dias sera tu proximo cumpleaños");
        }
    }
}
