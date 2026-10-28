/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_34_ahorro;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_34_AHORRO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner (System.in);
        int ahorro = 1500;
        int deposito;
        int cuenta = 0;
        while(true){
        System.out.println("Inrtroduce el deposito");
        deposito = captu.nextInt();
        captu.nextLine();
        //verificar si nos estamos pasando
        if ((cuenta + deposito )>15000){
            System.out.println("TE PASASTE DEL DEPOSITO");
            continue;
            //todo lo que esta abajo del continui se ignora y se sugue al codigo
        }
        cuenta += deposito;
            System.out.println("cuenta = " + cuenta );
            if (cuenta == 1500){//LLEGAMOS A LA META
                System.out.println("META CUMPLIDA!!!");
            break;
            }
        }
    }
    
}
