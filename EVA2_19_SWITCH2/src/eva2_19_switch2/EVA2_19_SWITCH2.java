/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_19_switch2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_19_SWITCH2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        String carrera;
        System.out.println("INTRODUCE LA CARREA, SISTEMAS, INFORMATICA, ADMINISTRACION");
        carrera = captu.nextLine();
        
         switch(carrera){
            case "SISTEMAS": 
                   System.out.println("ISC"); 
        //Todos los caso
            break;
        case "INFORMATCA": 
                   System.out.println("INF"); 
        //Todos los caso
            break;
        case "ADMINISTRACION": 
                   System.out.println("LA"); 
        //Todos los caso
            break;
            
             default: 
         System.out.println("?");
         }
        
    }
    
}
