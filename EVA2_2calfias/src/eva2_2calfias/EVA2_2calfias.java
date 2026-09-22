/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2calfias;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_2calfias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            int califa;
        Scanner captu = new Scanner(System.in); //PUEDES ESCRIBIR EN EL TECLAD0
        System.out.println("Ingrese su calificación:");     // LO QUE LE APARECE AL USUARIO
        califa = captu.nextInt();                       // ESCRIBIR LO QUE VALE LA VARIABLE edad
        
        if(califa>= 70){ //QUE HACEMOS SI ES VERDADERO
            System.out.println("USTED PASO LA MATERIA:)");}
        else           //Que hacemos si es falso(ES OPCIONAL)
            System.out.println("REPROBASTE :/");
    }
    
}
