/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_29_do_while;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_29_DO_WHILE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here}
        Scanner captu = new Scanner(System.in);
        int monto = 0, cuenta = 5000;
         do{
             System.out.println("¿Cuánto quieres retirar?");
             monto = captu.nextInt();
             cuenta = cuenta - monto; //Acumulador
             System.out.println("Tu saldo es de = " + cuenta);
             
         }while(cuenta > 0 );
         // mientars la cuenta sea mayr que cero sigue preguntando
         System.out.println("SE TE ACABO EL DINDERO :(");
    }
    
}
