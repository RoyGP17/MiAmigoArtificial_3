package miamigoartificial;

import static Alerta.Alerta.MostrarMensaje;
import static Alerta.Cumpleaños.AlertaCumpleaños;
import static Presentacion.Presentacion.adivinarEdad;
import static Presentacion.Presentacion.saludar;
import Presentacion.Usuario;
import Recomendaciones.Recomendacion;
import Historias.Libro;
import Historias.LibroDrama;
import Historias.LibroComedia;
import Historias.LibroAventura;
import Historias.AdministradorLibros;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class MiAmigoArtificial_3 {

    final static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        String a = "Yo soy tu amigo artificial";
        JOptionPane.showMessageDialog(null, "¡Hola!, dejame presentarme: " + a + "\nJarvis");
        
        /*//Objetos de libro(Hafid)
         LibroDrama oLibroDrama1 = new LibroDrama(1,"Henry James","\n\tLas bostonianas","Drama","En 1885, Henry James "
            + "\nes un escritor que tiene el reconocimiento del público y la crítica. "
            + "\nDaisy Miller y El retrato de una dama han sido un éxito. Asentado en este momento de gloria, "
            + "\nha publicado en forma de libro todos los relatos escritos hasta la fecha que él cree que merece la pena ser reeditados. "
            + "\nPodemos decir que en ese instante James tenía las alforjas vacías. Piensa que el tema internacional, "
            + "\nbase sobre la que ha escrito sus obras más conocidas, ya está agotado. "
            + "\nTécnicamente se ha demostrado a sí mismo y al público que posee un sólido manejo de los recursos narrativos. "
            + "\nEs el momento adecuado para cambiar de registro.");
        LibroDrama oLibroDrama2 = new LibroDrama(1,"Alexandre Dumas","\n\tLa dama de las camelias","Drama","La Dama de las Camelias"
            + "\nes la historia de amor de Margarita Gautier y Armando Duval."
            + "\nEs una de las historias más pasionales que conoce la literatura."
            + "\nSe trata del amor que nace entre una prostituta (Margarita) y un joven aristocrático (Armando)."
            + "\nLos obstáculos y dificultades de la relación ,"
            + "\nmarcados sobre todo por prejuicios sociales y clasistas, no son un impedimento para que ambos luchen por lo que sienten."
            + "\nPara evitar ser blanco de críticas y del rechazo de amigos y familiares, "
            + "\nse retiran de la vida mundana de París y deciden refugiarse en el campo a disfrutar de cinco meses de amor idílico. "
            + "\nEl amor y un futuro prometedor no fueron razones suficientes para evitar ser alcanzados por los prejuicios y el pasado. "
            + "\nDe cara a la realidad que ambos quisieron evadir, Margarita se ve obligada a separarse de su amado y a "
            + "\nadoptar la más cruel decisión .");
        LibroDrama oLibroDrama3 = new LibroDrama(1,"Anton Chejov","\n\tLa Dama Del Perrito","Drama","Había corrido "
            + "\nla especie de que en el malecón había aparecido un personaje nuevo: una dama con un perrito.» Así comienza este relato, "
            + "\nuno de los más conocidos e importantes de la literatura universal. Esta historia no cuenta ningún acontecimiento "
            + "\nextraordinario; los protagonistas llevan una vida corriente, se podría decir que incluso aburrida. "
            + "\nEl relato es un pequeño ensayo sobre cómo surge el amor entre dos personas, Anna y Gúrov, y su pasión los transforma. "
            + "\nEl sexo está muy presente en toda la narración, aunque no se muestre explícitamente. El final queda abierto, "
            + "\npues es algo propio de Chéjov, y como señala Nabokov «mientras las personas sigan vivas no hay conclusión posible y "
            + "\ndefinida de sus conflictos, sus esperanzas o sus sueños");
        LibroAventura oLibroAventura1 = new LibroAventura("Julio Verne","\n\tViaje añ centro de la tierra","Aventura","El Viaje al Centro"
            + "\nde la Tierra se plantea como el relato de un joven científico alemán llamado Axel La novela comienza cuando "
            + "\nel tío de Axel, Lidenbrock encuentra un libro antiguo con un trozo de pergamino descolorido que tiene un código; "
            + "\nAxel consigue traducir el trozo de pergamino El contenido del pergamino los sorprende ya que este devela que su autor "
            + "\nencontró el centro de la tierra y este, contiene vagas instrucciones para futuros exploradores Así, el tío y Axel "
            + "\nemprenden el viaje al centro de la tierra, se embarcan y se dirigen a Islandia; en Islandia contratan a Hans quien "
            + "\nlos lleva hasta Snaefell y quien los acompañará hasta el final de la expedición En Snaefell bajan hasta el fondo del "
            + "\nvolcán y encuentran un túnel que se dividen en oriental y occidental. Toman el oriental y tras caminar tres días no "
            + "\nconsiguen nada, ya sin agua Axel está deshidratado y quiere regresar a lo que su tío le pide que le de un tiempo más "
            + "\nEl volcán hace erupción y los tres exploradores junto a su balsa, son expedidos hacia la superficie de la tierra, "
            + "\nluego de esto regresan a Hamburgo Lidenbrock comparte el pergamino y su traducción para que otros científicos puedan "
            + "\niniciar sus propias expediciones al núcleo de la tierra y lamenta no haber encontrado nunca el centro de la tierra pero "
            + "\nle consuela la idea de que otras se basen en sus descubrimientos.");
        LibroAventura oLibroAventura2 = new LibroAventura("H. G. Wells","\n\tLa máquina del tiempo","Aventura","Un científico inventa "
            + "\nuna máquina para viajar a través del tiempo. En un viaje experimental llega al año 802.701 y encuentra la tierra "
            + "\nhabitada por los Eloi, pacíficos y ociosos. El Viajero del Tiempo deduce que están tan avanzados que unas máquinas "
            + "\ndeben de trabajar por ellos. Más tarde descubrirá a los malvados y depredadores Morlocks, y habrá de escapar para salvar "
            + "\nla vida. A su regreso al presente su relato es recibido con escepticismo. La máquina del tiempo, escrita en 1895 "
            + "\npor Herbert George Wells, se halla en los inicios de la novela de ciencia-ficción. Sigue conservando el mismo "
            + "\npoder de fascinación y vigor narrativo que le valieron el éxito inmediato en el momento de su publicación. "
            + "\nAfortunada síntesis de los conocimientos científicos del autor, del maquinismo, (creencia que confiaba en que "
            + "\nlas máquinas serían la salvación de la humanidad), que hacía furor en la época y de la visión escéptica de "
            + "\nH.G. Wells (1866-1946) respecto al rumbo tomado por la sociedad que le tocó vivir, el relato describe un futuro "
            + "\ninquietante en el que dos razas semibestiales, los eloi y los morlock, comparten en una peculiar simbiosis un "
            + "\nplaneta extraño y desolado sobre el que se han cernido catástrofes y transformaciones, pero en el que brilla aún, "
            + "\ncomo tenue esperanza, un hálito de humanidad.");
        LibroAventura oLibroAventura3 = new LibroAventura("Lewis Carroll","\n\tLas aventuras de Alicia en el país de las maravillas","Aventura","Alicia,"
            + "\nla protagonista, es una niña que se encuentra con su hermana, apoyada en un árbol leyendo un libro "
            + "\nDe repente ve un conejo blanco que lleva un reloj y habla, y tiene mucha prisa, y decide seguirlo, "
            + "\nAl seguir el conejo, Alicia se cae por un pozo en el que tarda mucho tiempo en llegar abajo llega a muchos "
            + "\nlugares extraños donde conoce a personajes sumamente extraños, Alicia se encuentra con el gato de la duquesa que le "
            + "\ndice los sitios dónde puede ir Alicia se decidir a la casa del sombrerero que está acompañado por la liebre de "
            + "\nMarzo y un lirón Luego vuelve a la casa del conejo, coge la llave, se hace pequeña y pasa por la puerta minúscula "
            + "\nVe a unos soldados pintando unas rosas blancas de color rojo, La reina encuentra a Alicia y dice que le corten la "
            + "\ncabeza sin motivo alguno. Pero más tarde se disculpa por haber actuado así, y le propone un partido decroquet muy "
            + "\nparticular Vuelven a encontrarse con el gato, y como es de la duquesa, y la duquesa estaba en el calabozo, "
            + "\nla liberan para que pueda hablar con su gato Alicia se va con un grifo al escuchar la historia de la falsa tortuga. "
            + "\nLe cuentan sobre el baile de las cuatro langostas y lo bailan delante de Alicia Finalmente van a un juicio muy extraño "
            + "\nen el que Alicia tiene que declarar y niega haber robado las tartas de la reina Por último Alicia se despierta. "
            + "\nTodo ha sido un sueño.");
        LibroComedia oLibroComedia1 = new LibroComedia("Alfonso de Valdés","\n\tLa vida de Lazarillo de Tormes","Comedia","Lázaro "
            + "\nnace en un molino, a orillas del Río Tormes, de donde su nombre. Su padre es condenado por un ladrón. "
            + "\nHabla de su padre muerto, cuando Lázaro tenía 8 años. Invadida por el hambre, su madre lo abandona fuera de la ciudad. "
            + "\nLázaro de este modo será entregado a un ciego avaro que lo inicia en las malas artes y lo somete a un sin fin de "
            + "\nprivaciones.Lázaro debe valerse desde entonces de una serie de artimañas para alimentarse. El ciego le enseña con "
            + "\ncrueldad cosas del mundo. Cansado del maltrato Lázaro lo abandona.Antes de abandonarlo se venga llevándolo a "
            + "\nestrellarse contra un poste. Así el niño convivirá con otros amos: Un clérigo que le privara de lo más elemental: "
            + "\nlos alimentos, ya más despierto por las experiencias con el ciego logra robarle bodigos (panecillos) que guardaba "
            + "\ncelosamente en un arca, luego un escudero, será su tercer amo, quien resulta ser más pobre que Lázaro, a quien tiene "
            + "\nque sostener con las limosnas que recoge para mantenerse, y así siguen los amos del Lazarillo tratándolo mal.");
        LibroComedia oLibroComedia2 = new LibroComedia("Graeme Simsion","\n\tEl proyecto esposa","Comedia","Don Tillman, profesor de "
            + "\nGenética en la universidad, un hombre atrapado en una visión de la realidad extremadamente rígida, nunca ha tenido una "
            + "\nsegunda cita con una mujer. Sin embargo, conocedor de los estudios que demuestran que los hombres que viven en pareja "
            + "\nson más felices que los solteros, se embarca de lleno en lo que bautiza El Proyecto Esposa, cuyo primer paso consiste "
            + "\nen redactar un cuestionario de dieciséis páginas para encontrar la pareja perfecta: una mujer puntual, que no fume ni "
            + "\nbeba y se adapte a su reglamentada existencia. Y entonces conoce a Rosie Jarman, que es una mujer guapa, capaz y "
            + "\nluchadora, pero trabaja en un bar, fuma, bebe, y llega siempre tarde: ¡totalmente descartada para el Proyecto Esposa! "
            + "\nElla tiene un proyecto propio, encontrar a su padre biológico, y nuestro excéntrico profesor se encontrará inventando "
            + "\nexcusas a diario y saltándose sus estrictas reglas con tal de verla y ayudarla poniendo sus conocimientos de genética "
            + "\nal servicio de su causa. Don y Rosie se lanzan así a una intrépida, divertidísima aventura que demuestra que el amor no "
            + "\nse busca sino que acude a nosotros cuando menos lo esperamos.");
        LibroComedia oLibroComedia3 = new LibroComedia("David Safier","\n\tMaldito karma","Comedia","Una desternillante novela sobre "
            + "\nel secreto de la felicidad que ya ha hecho reír a un millón de lectores en Alemania.La presentadora de televisión "
            + "\nKim Lange está en el mejor momento de su carrera cuando sufre un accidente y muere aplastada por el lavabo de una "
            + "\nestación espacial rusa. En el más allá, Kim se entera de que ha acumulado mal karma a lo largo de su vida: "
            + "\nha engañado a su marido, ha descuidado a su hija y ha amargado a cuantos la rodean. Pronto descubre cuál es su castigo: "
            + "\nestá en un agujero, tiene dos antenas y seis patas…¡es una hormiga! Kim no tiene ganas de ir arrastrando migas de "
            + "\npastel tras haber eludido los hidratos de carbono toda su vida. Además, no puede permitir que su marido se consuele "
            + "\ncon otra. Sólo le queda una salida: acumular buen karma para ascender por la escala de la reencarnación y volver a "
            + "\nser humana. Pero el camino para dejar de ser plagado de contratiempos. Un millón de lectores en Alemania ya han "
            + "\ndisfrutado de esta hilarante novela, que ha colocado a David Safier en lo más alto de la escena literaria europea."
            + "\nMaldito karma es una historia de desbordante fantasía, una entrañable fábula que, entre carcajadas, nos ayuda a "
            + "\nreflexionar sobre las prioridades de nuestra vida. Léela y descubre el secreto de la felicidad.");
        */
        //Filtramos los libros (Hafid)
        /*
        AdministradorLibros Administrador1 = new AdministradorLibros();
        Administrador1.agregarLibro(oLibroDrama1, "DRAMA", 0);
        Administrador1.agregarLibro(oLibroDrama2, "DRAMA", 1);
        Administrador1.agregarLibro(oLibroDrama3, "DRAMA", 2);
        
        Administrador1.agregarLibro(oLibroAventura1, "AVENTURA", 0);
        Administrador1.agregarLibro(oLibroAventura2, "AVENTURA", 1);
        Administrador1.agregarLibro(oLibroAventura3, "AVENTURA", 2);
        
        Administrador1.agregarLibro(oLibroComedia1, "COMEDIA", 0);
        Administrador1.agregarLibro(oLibroComedia2, "COMEDIA", 1);
        Administrador1.agregarLibro(oLibroComedia3, "COMEDIA", 2);
        */
        //Imprimimos el menú(Hafid)
        /*
        Administrador1.menu();
        */
        
        saludar();
        recordarNombre();
        adivinarEdad();
        ObtenerRecomendaciones();
        AlertaCumpleaños();
        
       //Codigo de afid
       
       
       //-----------
        //lUCY
               
               
               
               
         //------
               
    }

    public static void recordarNombre() {
        System.out.println("\nBueno ahora es tu turno de decirme como te llamas: ");
        String nombre = entrada.nextLine();
        Usuario ObjetoA = new Usuario();
        ObjetoA.setNombres(nombre.toUpperCase());
        System.out.println("Que fabuloso nombre tienes, " + ObjetoA.getNombres() + "."
                + "\n y sabes, seré tu mejor amigo o mejor dicho seremos grandes amigos!!"
                + "\n Te acompañaré por mil años asi que necesito que me cuides si quieres"
                + "\n que te acompañe por estas hermosas aventuras");

        MostrarMensaje(nombre);
    }

    public static void ObtenerRecomendaciones() {
        Recomendacion or = new Recomendacion();
        or.recomendacion();
    }
}
