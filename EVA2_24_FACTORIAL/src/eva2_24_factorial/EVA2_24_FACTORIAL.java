/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_24_factorial;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_24_FACTORIAL {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here}
      Scanner captu = new Scanner(System.in);
      int nume =0, resu = 1;
       
        
        System.out.println("Valor a calcular:");
        nume = captu.nextInt();                                                       
        
        
        for(int i = 1; i <= nume; i++){
            resu = resu * i;
        }
        
        System.out.println("El factorial de " + nume + " es " + resu);
   }
   
}

