/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
import Clases.Zacapa;
import java.util.Scanner;
/**
 *
 * @author Jesus Alberto
 */
public class Main {
    
    String opc;
    static int opcion =0;
    
    
    public static void main(String[] args) {
        

        System.out.println("Ingrese el numero de su punto de partida \n");
        
        Switch();
        

    }
        public static void Switch(){
        Scanner in = new Scanner(System.in);
        Zacapa z = new Zacapa();    
        
        System.out.println("1. Zacapa \n2. Estanzuela \n3. Rio Hondo \n4. Gualan \n5.Teculutan \n6. Usumatlan \n7. Cabanias \n8. San Diego \n9. La Union \n10. Huite \n11. Salir");
        opcion = in.nextInt();
  
        switch (opcion){
            case 1:
                z.impresion(opcion);
                Switch();
                break;
            case 2:
                z.impresion(opcion);
                Switch();
                break;
            case 3:
                z.impresion(opcion);
                Switch();
                break;
            case 4:
                z.impresion(opcion);
                Switch();
                break;
            case 5:
                z.impresion(opcion);
                Switch();
                break;
            case 6:
                z.impresion(opcion);
                Switch();
                break;
            case 7:
                z.impresion(opcion);
                Switch();
                break;
            case 8:
                z.impresion(opcion);
                Switch();
                break;
            case 9:
                z.impresion(opcion);
                Switch();
                break;
            case 10:
                z.impresion(opcion);
                Switch();
                break;
            case 11:
                System.out.println("Hasta luego");
                break;
            default:
                System.out.println("Opcion invalida");
                Switch();
                break;
        }
        }
}
