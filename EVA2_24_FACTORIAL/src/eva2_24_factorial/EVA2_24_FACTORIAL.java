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
        
        
        for(int i = 1; i <= nume; i++){ // incia en uno termina en el valor que quiero y seva saumando de uno en uno hasta el valor que quier
            resu = resu * i; // resu lo multiplico por i que es el acumulado osea 5,4,3,2,1
        }
        
        System.out.println("El factorial de " + nume + " es " + resu);
        
        resu = 1;
        System.out.println("Valor a calcular:");
        nume = captu.nextInt();                                                       
        
        
        for(int i = nume; i <= 1; i--){ // incia en uno termina en el valor que quiero y seva saumando de uno en uno hasta el valor que quier
            resu = resu * i; // resu lo multiplico por i que es el acumulado osea 5,4,3,2,1
        }
        
        System.out.println("El factorial de " + nume + " es " + resu);
           
   }
   
   
}

