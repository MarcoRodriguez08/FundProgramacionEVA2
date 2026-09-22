/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_1_if;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_1_if {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad;
        Scanner captu = new Scanner(System.in); //PUEDES ESCRIBIR EN EL TECLAD0
        System.out.println("Ingrese su edad:");     // LO QUE LE APARECE AL USUARIO
        edad = captu.nextInt();                       // ESCRIBIR LO QUE VALE LA VARIABLE edad
        
        if(edad>= 18){ //QUE HACEMOS SI ES VERDADERO
            System.out.println("Puedes entrar :)");}
        else           //Que hacemos si es falso(ES OPCIONAL)
            System.out.println("No puedes entar :(");
    }
    
}
