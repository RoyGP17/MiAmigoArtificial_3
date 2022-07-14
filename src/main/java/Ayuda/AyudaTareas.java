package Ayuda;

public class AyudaTareas extends Ayuda {

    @Override
    public void Cordial() {
        System.out.println("\nQue tarea deseas que\n"
                + "te ayude, mira te mostraré lo que sé vale");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("\nAYUDIN NO, JAJA ESCOGE UNO HEE");
        System.out.println("1. APRENDER CANTANDO");
        System.out.println("2. NINGUNA");

        int respuesta = entrada.nextInt();

        switch (respuesta)
        {
            case 1:
                System.out.println("\nFísica es la ciencia natural con fundamentos que estudia "
                        + "\nel universo, energía, Espacio - Tiempo propiedades de materia, "
                        + "\ninteracción con movimiento de todo lo que rige en leyes de "
                        + "\ncomportamientos está la mecánica cuántica y lo físico teorico"
                        + "\nla clásica a lo macro y la moderna en microscópico. Puedes "
                        + "\nver la matrix o vivir siempre con miedo, Quejarte del mundo "
                        + "\no aprender su juego .... Mi vida era escalar hasta que tope"
                        + "\ncontigo se transformo en vector porque ahora tiene sentido. Todo "
                        + "\ncuerpo existente puede sentir una fuerza con primera ley de"
                        + "\nNewton se aplica la ley de inercia");
                break;
            case 2:
                System.out.println("\nSmile 微笑 ^.^");
                break;
            default:
                System.out.println("\nEstimad@ ingrese el dato bien porfis");
        }

    }

}
