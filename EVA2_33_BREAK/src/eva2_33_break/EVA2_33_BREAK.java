/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_33_break;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_33_BREAK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        int nume;
        int valor = 10;
        while(true){//ciclo infinito
        System.out.println("INTRODUCE EL VALOR");
        nume = captu.nextInt();
        captu.nextLine();
        if(nume == valor ){
            System.out.println("ADIVINASTE EL NUMERO");
        break;//termina el ciclo
        }
        }
    }
    
}
