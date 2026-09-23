/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_ejercicioif;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_3_EjercicioIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        // variables
        double pre;  // precio original el que el usario tecleara
        double pred; //precio con descuento
        double desc; //el descuento
        
        //Pedir Variables
        System.out.println("Ingrese el precio de su producto");
        pre = captu.nextDouble();
        
        if(pre>= 1000) {
            desc= pre*.1; // se saca lo que es el descuento
            pred = pre-desc;//aqui se le resta y se asigan a la variable pred(el precio con descuento)
            
            System.out.print("Su precio original fue de:");
            System.out.println(pre);
            
            System.out.print("Usted tuvo un descuento de:");
            System.out.println(desc);
            
            System.out.print("Su precio a pagar total sera de:");
            System.out.println(pred);
        }
        else{
            System.out.print("Usted debe pagar:");
            System.out.println(pre);
        }
    }
    
}
