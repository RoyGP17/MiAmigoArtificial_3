package Recomendaciones;

import java.util.List;
import java.util.Scanner;

public class Academico extends Recomendacion {

    Scanner entrada = new Scanner(System.in);
    public List<String> carreras;

    @Override
    public void recomendacionAcademica() {

        int opcion = 0;
        int opcion1 = 0;
        int opcion2 = 0;

        do
        {
            System.out.println("\nHey! mi querico amigo, estas en la seccion de recomendaciones "
                    + "\nacademicas, estas son las posibles recoemndaicones que te puedo "
                    + "\nbrindar ahora.");
            System.out.println("ELIGE UNA OPCION:");
            System.out.println("1) Elija esta opcion si presenta posibles problemas academicos");
            System.out.println("2) Elige esta opcion para brindarte recomendaciones"
                    + "\nde las carreras universitarias");
            System.out.println("3) volver");
            opcion = entrada.nextInt();
            switch (opcion)
            {
                case 1:
                    System.out.println("Dime! que te puedo recomendar");
                    System.out.println("1. Problemas de concentracion");
                    System.out.println("2. Falta de organizacion");
                    System.out.println("3. Inseguridad en el desarrollo academico");
                    System.out.println("4. salir");
                    System.out.println("Elige quien quisieras que te asesore");
                    opcion1 = entrada.nextInt();
                    switch (opcion1)
                    {
                        case 1:
                            System.out.println("Se hace muy dificil al no pensar en otra cosa "
                                    + "\nmientras intenta prestar atencion");
                            break;
                        case 2:
                            System.out.println("Le genera estres o descuido total de las "
                                    + "\nactividades, si este problema no es tratado suele "
                                    + "\nllevarse hasta la edad adulta");
                            break;
                        case 3:
                            System.out.println("Sientes que no eres capaz aun cuando te has "
                                    + "\npreparado para realizar un examen, exposicion o cualquier "
                                    + "\notro tipo de actividad, talvez hasta puedes ser inseguro "
                                    + "\nen la entrega adecuadad de una materia");
                            break;
                        default:
                            System.out.println("Elija una opcion correcta");
                    }
                    break;
                case 2:
                    System.out.println("Oye! te recomiendo estas carreras profesionales "
                            + "\nde acuerdo a la universidad que quieras estudiar vale.");
                    System.out.println("1) Universidad Nacional de San Cristobal de Huamanga");
                    System.out.println("2) Universidad Nacional de San Antonio de Abad del Cusco");
                    System.out.println("3) volver");
                    opcion2 = entrada.nextInt();
                    switch (opcion2)
                    {
                        case 1:
                            CarrerasUnsch();
                            break;
                        case 2:
                            carrerasUnsaac();
                            break;
                        case 3:
                            break;
                        default:
                            System.out.println("No estas eligiendo una opcion correcta, "
                                    + "\n intenta nuevamente");
                    }
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Elija una opcion correcta");
            }

        } while (opcion != 3);
    }

    public void CarrerasUnsch() {
        Lista oLU = new Lista();
        oLU.ListacarrerasUnsch();
    }

    public void carrerasUnsaac() {
        Lista oLC = new Lista();
        oLC.ListacarrerasUnsaac();
    }
}
