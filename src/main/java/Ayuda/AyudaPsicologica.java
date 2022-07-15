package Ayuda;

public class AyudaPsicologica extends Ayuda {
    
    @Override
    public void Cordial(){
        System.out.println("\nWELCOME, A LA ZONA DE ESTAR BIEN CON UNO MISMO!!");
    }
    
    @Override
    public void mostrarOpciones(){
        System.out.println("\n1. DESEAS QUE TE MOTIVE");
        System.out.println("2. AUTOCONOCERSE: CANCIÓN LETRAS");
        System.out.println("3. VOLVER");
        //entrada.nextInt();
        int resta = entrada.nextInt();
        switch (resta)
        {
            case 1:
                System.out.println("\nBueno mira asi como dice mis personajes favoritos de BTS:"
                        + "\nsolo tienes que seguir adelante, no pienses solo continua, no piense mucho lo que estas haciendo,"
                        + "\nluego un dia te darás cuenta que has crecido demasiado esa es la verdad para superar un bajón"
                        + "\nalgunas personas hacen sonar como si tuviera que hacer algo especial no es cierto solo tienes que"
                        + "\nseguir y no estes triste por no mejorar habrás mejorado antes de que te des cuenta."
                        + "\nDicen que es mas oscuro justo antes de que el sol salga. También las estrellas que adoras solo brillan"
                        + "\nen la noche. ¡Ánimo todo estará bien!. Te lo garantizo todo funcionara."
                        + "\nMira a qui tengo otras frases wooo"
                        + "\n1.Eres muy joven para dejar que el mundo te rompa. (Kin Taehyung)"
                        + "\n2. Nadie es feo solo vivimos en un mundo de criticas todos. (kin Nanjoon)"
                        + "\n3. Naciste para ser real. No perfecta. (Min Yoongi)"
                        + "\n4. Si hay alguien que no pueda ver hacia donde ir a partir de ahora le sugiero que escuche su corazón");
                break;
            case 2:
                System.out.println("'\nMe gusta, me gusta, me gusta,me gusta ser dinosaurio oh oh oh la la la"
                        + "\n¿Por qué quise esconder mi precioso ser de esta manera?, ¿De qué tenía tanto"
                        + "\nmiedo? ¿Por qué oculté mi verdadero yo? Soy yo a quien debo de amar woo woo oh"
                        + "\nen este mundo, iluminando mi preciosa alma finalmente me di cuenta que me amo no "
                        + "\ntan perfectamente, pero sí de un manera hermosa, soy a quien debo de amar"
                        + "\nA menudo las personas dicen que aún no se han encontrado a si mismas.Pero el si mismo no es algo");
                break;
            case 3:
                System.out.println("\nSmile 微笑 ^.^");
                break;
            default:
                System.out.println("\nEstimad@ ingrese el dato bien porfis");

        }

    }

}
