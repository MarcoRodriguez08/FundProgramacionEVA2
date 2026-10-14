/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_califas;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_10_Califas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int prom;
        
        Scanner captu = new Scanner(System.in); //PUEDES ESCRIBIR EN EL TECLAD0
        System.out.println("Ingrese su promedio");     // LO QUE LE APARECE AL USUARIO
        prom = captu.nextInt();                       // ESCRIBIR LO QUE VALE LA VARIABLE edad
        
        if(prom>100){
            
            System.out.println("Dato invalido");
        }
        else if(prom >=90){
           
           System.out.println("Sobresaliente");
                }
        
        else if(prom >=80 ){
           
           System.out.println("Bueno");
                }
        
        else if(prom >= 70){
           
           System.out.println("Aceptable");
                }
        else if(prom >=0){
             
            System.out.println("Insuficiente :(");
            
                }
        else {
            System.out.println("Dato invalido");
        }
    }
    
}
