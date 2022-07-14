
package Recomendaciones;

import java.util.Scanner;

public class Gastronomico extends Recomendacion {
    
    Scanner entrada = new Scanner(System.in);
    
    
    @Override
    public void recomendacionGastronomica(){
        
        System.out.println("\nMira que te puedo recomendar"
                + "\n el tipo de comida de tu preferencia elije uno va.");
        int opcion = 0;
        int opcion1 = 0;
        int opcion2 = 0;
        
        do{
            System.out.println("1. Amazonicos");
            System.out.println("2. Criollos");
            System.out.println("3. volver");
            opcion = entrada.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("ELIJA UNO DE LOS PLATOS AMAZONICOS: ");
                    System.out.println("\t1. Tacacho con cecina");
                    System.out.println("\t2. Crorixo con patacones");
                    System.out.println("\t3. chaufa de cecina");
                    System.out.println("\t4. Cecina a la parrilla");
                    System.out.println("\t5. Yuca rellena");
                    System.out.println("\t6. Juanes de gallina");
                    System.out.println("\t7. Albondigas de cecina con chorizo");
                    System.out.println("\t8. Chaufa salvaje");
                    System.out.println("\t9. Chaufa de chorizo");
                    System.out.println("\t10. Aeropuerto de cecina");
                    System.out.println("\t11. Aeropuerto de chorizo");
                    System.out.println("\t12. Pescado a lo macho");
                    System.out.println("\t13. Jalea mixta amazonica");
                    System.out.println("\t14. Carpacho de bagre");
                    System.out.println("\t15. Carpacho de cabrilla");
                    System.out.println("\tSELECCIONA UN PLATO");
                    
                    opcion1 = entrada.nextInt();
                    
                    switch(opcion1){
                        case 1:
                            System.out.println("El precio de Tacacho con cecina es: " + 28.00);
                            break;
                        case 2:
                            System.out.println("El precio de Crorixo con patacones es: " + 28.00);
                            break;
                        case 3:
                            System.out.println("El precio de chaufa de cecina es: " + 20.00);
                            break;
                        case 4:
                            System.out.println("El precio de Cecina a la parrilla es: " + 25.00);
                            break;
                        case 5:
                            System.out.println("El precio de Yuca rellena es: " + 28.00);
                            break;
                        case 6:
                            System.out.println("El precio de Juanes de gallina es: " + 30.00);
                            break;
                        case 7:
                            System.out.println("El precio de Albondigas de cecina con chorizo es: " + 28.00);
                            break;
                        case 8:
                            System.out.println("El precio de Chaufa salvaje es: " + 20.00);
                            break;
                        case 9:
                            System.out.println("El precio de Chaufa de chorizo es: " + 20.00);
                            break;
                        case 10:
                            System.out.println("El precio de Aeropuerto de cecina es: " + 20.00);
                            break;
                        case 11:
                            System.out.println("El precio de Aeropuerto de chorizo es: " + 20.00);
                            break;
                        case 12:
                            System.out.println("El precio de Pescado a lo macho es: " + 28.00);
                            break;
                        case 13:
                            System.out.println("El precio de Jalea mixta amazonica es: " + 28.00);
                            break;
                        case 14:
                            System.out.println("El precio de Carpacho de bagre es: " + 30.00);
                            break;
                        case 15:
                            System.out.println("El precio de Carpacho de cabrilla es: " + 30.00);
                            break;
                        case 16:
                            break;
                        default:
                            System.out.println("Elija una opcion correcta");
                    }
                    break;
                case 2:
                    System.out.println("\n\tELIJA UNO DE LOS PLATOS CRIOLLOS");
                    System.out.println("\t1. Bisteck a lo pobre");
                    System.out.println("\t2. Alitas broaster");
                    System.out.println("\t3. Piernitas broaster");
                    System.out.println("\t4. Saltado de lomo fino");
                    System.out.println("\t5. Tallarin saltado de lomo fino");
                    System.out.println("\t6. Tallarines verdes con bisteck");
                    System.out.println("\t7. Tacu tacu con lomo fino");
                    System.out.println("\t8. Cabrito a la norteña");
                    System.out.println("\t9. Chaufa de carne de lomo fino");
                    System.out.println("\t10. Chaufa de pollo");
                    System.out.println("\t11. volver");
                    System.out.println("SELECCIONA UN PLATO");
                    opcion2 = entrada.nextInt();
                    
                    switch(opcion2){
                        case 1:
                            System.out.println("El precio de Bisteck a lo pobre es: " + 28.00);
                            break;
                        case 2:
                            System.out.println("El precio de Alitas broaster es: " + 20.00);
                            break;
                        case 3:
                            System.out.println("El precio de Piernitas broaster es: " + 20.00);
                            break;
                        case 4:
                            System.out.println("El precio de Saltado de lomo fino es: " + 25.00);
                            break;
                        case 5:
                            System.out.println("El precio de Tallarin saltado de lomo fino es: " + 25.00);
                            break;
                        case 6:
                            System.out.println("El precio de Tallarines verdes con bisteck es: " + 25.00);
                            break;
                        case 7:
                            System.out.println("El precio de Tacu tacu con lomo fino es: " + 25.00);
                            break;
                        case 8:
                            System.out.println("El precio de Cabrito a la norteña es: " + 25.00);
                            break;
                        case 9:
                            System.out.println("El precio de Chaufa de carne de lomo fino es: " + 20.00);
                            break;
                        case 10:
                            System.out.println("El precio de Chaufa de pollo es: " + 15.00);
                            break;
                        case 11:
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
        }while(opcion!=3);
    }
}
