/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_18_switch;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_18_SWITCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        int dia = captu.nextInt();
        System.out.println("Escriba el dia de la semana deñ 1-7");
        switch(dia){
            case 1: 
                   System.out.println("Domingo"); 
        //Todos los caso
            break;
        case 2: 
                   System.out.println("Lunes"); 
        //Todos los caso
            break;
        case 3: 
                   System.out.println("Martes"); 
        //Todos los caso
            break;
        case 4: 
                   System.out.println("Miercoles"); 
        //Todos los caso
            break;
        case 5: 
                   System.out.println("Jueves"); 
        //Todos los caso
            break;
        case 6: 
                   System.out.println("Viernes"); 
        //Todos los caso
            break;
        case 7: 
                   System.out.println("Sabado"); 
        //Todos los caso
            break;
        default: //opcional
        System.out.println("No es un día valido");
        }
    }
    
}
