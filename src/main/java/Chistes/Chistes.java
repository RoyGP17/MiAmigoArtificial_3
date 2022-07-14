
package Chistes;
import java.util.Scanner;
/**
 *
 * @author hp
 */
public class Chistes {
    static Scanner scanner = new Scanner(System.in);
    
    public void mostrarOpciones(){
        // Una sentencia que se ejecuta al menos una vez y es reejecutada cada vez que la condición se evalúa a verdadera.
        int opcion =0;
        
        do{
            System.out.println("BIENVENIDOS AL MUNDO DE LOS CHISTES");
            System.out.println("1. Chistes Blancos");
            System.out.println("2. Chistes Buenos");
            System.out.println("3. Chistes Inteligentes");
            System.out.println("4. Chistes Rojos");
            System.out.println("5. Salir");
        
            System.out.println("Por favor digite la opcion: ");
            //Entrada para la opción
            opcion = scanner.nextInt();
            switch(opcion){
                case 1:
                    ChistesBlancos();
                    
                    break;
                case 2:
                    ChistesBuenos();
                    break;
                case 3:
                    ChistesInteligentes();
                    break;
                case 4:
                    ChistesRojos();
                    break;
                default:
                    System.out.println("Opcion inválida");
         
                }
                                
            }while (opcion != 5);
            System.out.println("EL PROGRAMA HA FINALIZADO");
        
        
        }

    private static void ChistesBlancos() {
        ChistesBlancos.blancos();
    }

    private static void ChistesBuenos() {
        ChistesBuenos.buenos();  
    }
    private static void ChistesInteligentes() {
        ChistesInteligentes.Inteligentes(); 
    }
    private static void ChistesRojos() {
        ChistesRojos.Rojos();
    
    }
    
    
}
