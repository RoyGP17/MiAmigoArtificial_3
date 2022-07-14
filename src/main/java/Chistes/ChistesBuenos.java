package Chistes;

import java.util.Scanner;

public class ChistesBuenos extends Chistes {

    public static void buenos() {
        Scanner entra = new Scanner(System.in);

        System.out.println("HOLA,  MI NOMBRE ES SERWAY QUIERES CHISTES"
                + "\nSi estás seguro de que quieres leer LOS MEJORES CHISTES BUENOS digite ***buenos***\n "
                + "y si no digite SALIR");
        String respuesta = entra.nextLine();

        if (respuesta.equals("buenos") == true)
        {

            System.out.println("Qué detalle, tu mujer murió hace 4 años "
                    + "y sigues preparando la mesa para cenar, como si aún estuviese.\n"
                    + "\n"
                    + "Qué va, lo que pasa es que no tengo ganas de recoger.\n"
                    + "*******************************************"
                    + "Paciente: Doctor, me duele aquí.\n"
                    + "Doctor: Pues póngase allí.\n"
                    + "Paciente: Doctor, me sigue doliendo.\n"
                    + "\n"
                    + "Doctor: Doliendo, deje de seguir al paciente.\n"
                    + "*******************************************"
                    + "Le dice el niño a la madre: Mamá, no quiero jugar\n"
                    + "más con Pedrito. La madre le pregunta al niño:\n"
                    + "¿Por qué no quieres jugar más con él?\n"
                    + "porque cuando jugamos a los tacos de madera y le pego con uno en la cabeza, de repente se pone a llorar.\n");
            Scanner entra1 = new Scanner(System.in);
            System.out.println("¿Quieres más chistes BUENOS: ?");
            String respuesta1 = entra1.nextLine();

            if (respuesta1.equals("si") == true)
            {
                System.out.println("Como usted diga");
                System.out.println("¿Cuáles son las mujeres que mejor conocen su cuerpo?\n"
                        + "quellas que se tocan, porque lo conocen al dedillo…\n"
                        + "*****************************************************\n"
                        + "¿Cómo se llama el primo de Bruce Lee? Broco Lee.");
            } else
            {
                System.out.println("Entiendo, ya no le contaremos más chistes buenos");
            }

        } else
        {
            System.out.println("ENTIENDO\n"
                    + "YA NO LE CONTAREMOS MÁS CHISTES buenos "
                    + "PERO, SI DESEA OTRO TIPO DE CHISTES VUELVA A DIGITAR UNA OPCIÓN");

        }

    }

}
