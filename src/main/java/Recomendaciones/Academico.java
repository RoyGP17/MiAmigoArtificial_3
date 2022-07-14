package Recomendaciones;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Academico extends Recomendacion {

    Scanner entrada = new Scanner(System.in);
    public List<String> carreras;
    
    @Override
    public void recomendacionAcademica() {

        System.out.println("\nELIJA UNA OPCION:");

        int opcion = 0;
        int opcion1 = 0;
        int opcion2 = 0;

        do
        {
            System.out.println("1) Elija esta opcion si presenta posibles problemas");
            System.out.println("2) Carreras universitarias");
            System.out.println("3) volver");
            opcion = entrada.nextInt();
            switch (opcion)
            {
                case 1:
                    System.out.println("1. Problemas de concentracion");
                    System.out.println("2. Falta de organizacion");
                    System.out.println("3. Inseguridad en el desarrollo academico");
                    System.out.println("4. salir");
                    System.out.println("Elige quien quisieras que te asesore");
                    opcion1 = entrada.nextInt();
                    switch (opcion1)
                    {
                        case 1:
                            System.out.println("Se hace muy dificil al no pensar en otra cosa"
                                    + " mientras intenta prestar atencion");
                            break;
                        case 2:
                            System.out.println("Le genera estres o descuido total de las "
                                    + " actividades, si este problema no es tratado suele "
                                    + " llevarse hasta la edad adulta");
                            break;
                        case 3:
                            System.out.println("Sientes que no eres capaz aun cuando te has "
                                    + " preparado para realizar un examen, exposicion o cualquier "
                                    + " otro tipo de actividad, talvez hasta puedes ser inseguro "
                                    + " en la entrega adecuadad de una materia");
                            break;
                        default:
                            System.out.println("Elija una opcion correcta");
                    }
                    break;
                case 2:
                    System.out.println("1) Universidad San Cristobal");
                    System.out.println("2) Universidad San Antonio de Abad de Cusco");
                    opcion2 = entrada.nextInt();
                    switch(opcion2){
                        case 1:
                            CarrerasUnsch();
                            break;
                        case 2:
                            carrerasUnsaac();
                            break;
                        default:
                            System.out.println("Elija una opcion correcta");
                    }
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Elija una opcion correcta");
            }

        } while (opcion != 3);
    }
    
    public void CarrerasUnsch(){
        Lista oLU = new Lista();
        oLU.ListacarrerasUnsch();
    }
    
    public void carrerasUnsaac(){
        Lista oLC = new Lista();
        oLC.ListacarrerasUnsaac();
    }
}
