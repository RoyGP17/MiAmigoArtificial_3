package Historias;

import java.util.Random;
import java.util.Scanner;

public class AdministradorLibros {

    public Libro[] listaLibrosDeDrama = new Libro[10];
    public Libro[] listaLibrosDeComedia = new Libro[10];
    public Libro[] listaLibrosDeAventura = new Libro[10];

    public void agregarLibro(Libro nombre, String genero, int orden) {
        switch (genero)
        {
            case ("DRAMA"):
                listaLibrosDeDrama[orden] = nombre;
                break;
            case ("COMEDIA"):
                listaLibrosDeComedia[orden] = nombre;
                break;
            case ("AVENTURA"):
                listaLibrosDeAventura[orden] = nombre;
                break;
            default:
                System.out.println("No hay esa opcion, intenta nuevamente");
        }
    }

    public void menu() {
        System.out.println("HOLA, ELIJE UNA DE LAS OPCIONES");
        System.out.println("1) LIBROS");
        System.out.println("2) VOLVER");
        Scanner entrada = new Scanner(System.in);
        int Respuesta = entrada.nextInt();
        //Random random = new Random();
        //int Aleatorio = random.nextInt(2);
        Scanner scanner = new Scanner(System.in);

        switch (Respuesta)
        {
            case (1):
                System.out.println("Bienbenid@ al mundo de los libros, echemos un vistaso a lo que tenemos:"
                        + "\n viajemos al interior de tu mente");
                int Respuesta1 = 0;

                do
                {
                    System.out.println("TE PRESENTO LAS SIGUIENTES BIBLIOTECAS");
                    System.out.println("1) LIBROS DE DRAMA");
                    System.out.println("2) LIBROS DE AVENTURA");
                    System.out.println("3) LIBRO DE COMEDIA");
                    System.out.println("4) VOLVER");
                    Respuesta1 = scanner.nextInt();
                    switch (Respuesta1)
                    {
                        case (1):
                            Random random = new Random();
                            int Aleatorio = random.nextInt(3);
                            this.listaLibrosDeDrama[Aleatorio].introduccion();
                            this.listaLibrosDeDrama[Aleatorio].leerLibro();
                            System.out.println("Al parcer esta esta comenzando a llover :c ");
                            break;
                        case (2):
                            Random random1 = new Random();
                            int Aleatorio1 = random1.nextInt(3);
                            this.listaLibrosDeAventura[Aleatorio1].introduccion();
                            this.listaLibrosDeAventura[Aleatorio1].leerLibro();
                            System.out.println("Wooow que increible no lo crees :0 ");
                            break;
                        case (3):
                            Random random2 = new Random();
                            int Aleatorio2 = random2.nextInt(3);
                            this.listaLibrosDeComedia[Aleatorio2].introduccion();
                            this.listaLibrosDeComedia[Aleatorio2].leerLibro();
                            System.out.println("¡JAJAJA!, reí tanto que me duele el estomago xD");
                            break;
                        case (4):
                            System.out.println("¡ay!, ¿ya te vas?, bueno cuidate ^^");
                            break;
                        default:
                            System.out.println("#Error: lo siento no entiendo, vuelvelo a intentar si...");
                            break;
                    }

                } while (Respuesta1 != 4);
                break;
            default:
                System.out.println("#Error: lo siento no entiendo, vuelvelo a intentar si...");
                break;
        }
    }
}
