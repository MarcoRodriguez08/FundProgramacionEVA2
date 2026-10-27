/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_31_do_while_adivinar;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_31_DO_WHILE_ADIVINAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner captu = new Scanner(System.in);
        int num= 73;
        do{
            System.out.println("Introduzca el numero magico  ENTERO ");
           
            num = captu.nextInt();
            captu.nextLine();
        }while(num  != 73);
            // != no ser igual
            //EN EL WHILE dice " num distinto a 73
            // si while es disitino, osea si 73  es igual,  se sale
        System.out.println("ESE ES EL NUMERO MAGICO");
    }
    
}
