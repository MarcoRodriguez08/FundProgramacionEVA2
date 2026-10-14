/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_9_estacionamiento;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_9_Estacionamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int horas;
        int total=0;
        Scanner captu = new Scanner(System.in); //PUEDES ESCRIBIR EN EL TECLAD0
        System.out.println("Ingrese las horas que estuvo en el estacionamiento");     // LO QUE LE APARECE AL USUARIO
        horas = captu.nextInt();                       // ESCRIBIR LO QUE VALE LA VARIABLE edad
        
        if(horas <= 2){
            total = horas*25;
            System.out.println("Ústed debe $" +total);
        }
        else if(horas <= 5){
           total = horas*20;
           System.out.println("Ústed debe $"+ total);
                }
        else if(horas <= 10){
             total = horas*15;
            System.out.println("Ústed debe $"+ total);
                }
        else if(horas >10)
            total = 150;
            System.out.println("Ústed debe $"+ total);
        

        }
    
    
    
}
