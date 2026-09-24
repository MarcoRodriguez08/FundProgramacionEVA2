/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_5_if;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_5_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //anidamiento
        // es un if dentro de otro if
        int edad, credencial;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("¿Cuál es tu edad?");
        edad = captu.nextInt();
        
        if(edad >= 18){
            System.out.println("Muestra tu credencial de lector(1=SI, 0=NO)");
            credencial = captu.nextInt();
            if (credencial == 1 ){
                System.out.println("Pasa");
                
            }
            else{
                System.out.println("Salgsase");
            }
        }
        else { 
            System.out.println("Salgasa");
        }
    }
    
}
